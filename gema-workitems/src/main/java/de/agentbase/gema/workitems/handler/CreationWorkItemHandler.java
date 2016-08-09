package de.agentbase.gema.workitems.handler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

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

	// @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		Map<String, Object> output = null;

		try {
			log.trace("start");
			InitialContext ctx = new InitialContext();
			TransactionManager txManager = (TransactionManager) ctx.lookup("java:jboss/TransactionManager");

			log.trace("suspend");
			Transaction suspendedTx = txManager.suspend();

			try {
				DataSource dataSource = (DataSource) ctx.lookup("java:jboss/datasources/Test");

				Connection connection = dataSource.getConnection();

				log.trace("begin");
				txManager.begin();
				String statement = "INSERT INTO TEST VALUES(?,?)";
				PreparedStatement stmt = connection.prepareStatement(statement);
				stmt.setInt(1, 1);
				stmt.setObject(2, "ok");
				log.trace("execute");
				stmt.execute();
				log.trace("commit");
				txManager.commit();
			} catch (Throwable t) {
				log.trace("Throwable {} ", t);
			} finally {
				log.trace("resume");
				txManager.resume(suspendedTx);
			}

			log.trace("{} completeWIH", WORKITEMHANDLER_NAME);
			manager.completeWorkItem(workItem.getId(), output);

		} catch (Exception e) {
			log.error("Exception {}", e);
			log.trace("aborting WIH {}", WORKITEMHANDLER_NAME);
			manager.abortWorkItem(workItem.getId());
		}

	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		log.trace("{} abortWIH", WORKITEMHANDLER_NAME);
		manager.abortWorkItem(workItem.getId());
	}

}
