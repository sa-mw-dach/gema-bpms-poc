package de.agentbase.gema.workitems.handler.producer;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.internal.runtime.manager.WorkItemHandlerProducer;
import org.slf4j.Logger;

import de.agentbase.gema.workitems.handler.MatchWorkItemHandler;

public class GEMAWorkItemsProducer implements WorkItemHandlerProducer {

	@Inject
	private Logger log;

	@Inject
	private MatchWorkItemHandler matchHandler;

	public Map<String, WorkItemHandler> getWorkItemHandlers(String identifier, Map<String, Object> params) {
		log.info("Identifier: {}, Params: {}", identifier, params);

		KieSession kieSession = (KieSession) params.get("ksession");
		if (kieSession != null) {
			log.info("KieSession Identifier: {}", kieSession.getIdentifier());
		}

		Map<String, WorkItemHandler> handlers = new HashMap<String, WorkItemHandler>();
		handlers.put(MatchWorkItemHandler.WORKITEMHANDLER_NAME, matchHandler);

		log.info("Handlers by this Producer: {}", handlers);
		return handlers;
	}

}
