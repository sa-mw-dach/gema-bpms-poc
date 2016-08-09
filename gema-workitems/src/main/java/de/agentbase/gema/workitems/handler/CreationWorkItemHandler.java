package de.agentbase.gema.workitems.handler;

import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreationWorkItemHandler implements WorkItemHandler {
	public final static String WORKITEMHANDLER_NAME = "GEMA_CREATION";

	public final static String INPUT_PARAM_NAME_WORK = "Work";
	public final static String OUTPUT_PARAM_NAME_RESULT = "Result";

	private Logger log = LoggerFactory.getLogger(getClass());

	public CreationWorkItemHandler() {
	}
	
	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		Map<String, Object> output = null;
		log.info("{} completeWIH", WORKITEMHANDLER_NAME);
		manager.completeWorkItem(workItem.getId(), output);
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		log.info("{} abortWIH", WORKITEMHANDLER_NAME);
		manager.abortWorkItem(workItem.getId());
	}

}
