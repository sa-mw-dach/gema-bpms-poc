package de.agentbase.gema.workitems.handler;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.slf4j.Logger;

import de.agentbase.gema.match.Match;
import de.agentbase.gema.match.MatchingService;
import de.agentbase.projects.gema_mplus.match;
import de.agentbase.projects.gema_mplus.matchCollection;
import de.agentbase.projects.gema_mplus.work;

public class MatchWorkItemHandler implements WorkItemHandler {

	public final static String WORKITEMHANDLER_NAME = "GEMA_MATCH";

	public final static String INPUT_PARAM_NAME_WORK = "Work";
	public final static String OUTPUT_PARAM_NAME_RESULT = "Result";

	@Inject
	private Logger log;

	public MatchWorkItemHandler() {

	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
		log.info("{} abortWorkItem", WORKITEMHANDLER_NAME);
		// Nothing to do
	}

	public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
		log.info("{} executeWorkItem", WORKITEMHANDLER_NAME);

		Map<String, Object> output = new HashMap<String, Object>();
		matchCollection mc = new matchCollection();
		List<match> listMatch = new ArrayList<match>();

		Object o = workItem.getParameter(INPUT_PARAM_NAME_WORK);
		work w = (work) o;

		if (w != null) {
			log.info("######### Work found ! ##########");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			String titel = w.getTitle();
			String autor = w.getAuthor();
			String datum = null;
			String dauer = null;
			if (w.getDate() != null) {
				datum = sdf.format(w.getDate());
			}

			if (w.getDuration() != null) {
				dauer = w.getDuration().toString();
			}

			List<Match> result;
			try {
				MatchingService service = new MatchingService();
				result = service.getMatchingPort().getMatchings(titel, autor, datum, dauer);

				for (Match m : result) {
					match jbpmMatch = new match();
					jbpmMatch.setAuthor(m.getAutor());
					jbpmMatch.setTitle(m.getTitel());
					jbpmMatch.setOpusID(m.getWerkId());

					if (m.getDauer() != null && !"".equals(m.getDauer())) {
						jbpmMatch.setDuration(Integer.parseInt(m.getDauer()));
					}

					if (m.getRelevanz() != null && !"".equals(m.getRelevanz())) {
						jbpmMatch.setRelevance(Integer.parseInt(m.getRelevanz()));
					}

					try {
						Date date = sdf.parse(m.getDatum());
						jbpmMatch.setDate(date);
					} catch (Exception e) {
						// ignore
					}
					listMatch.add(jbpmMatch);
				}
				log.info("Received response {} completeing work item {}", result, workItem.getId());
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			}
		} else {
			log.info("######## NO WORK OBJECT FOUND!!! ########");
		}
		mc.setList(listMatch);
		output.put(OUTPUT_PARAM_NAME_RESULT, mc);
		workItemManager.completeWorkItem(workItem.getId(), output);
	}

}
