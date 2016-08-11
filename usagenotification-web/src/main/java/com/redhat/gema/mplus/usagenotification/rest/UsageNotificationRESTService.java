/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.gema.mplus.usagenotification.rest;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.remote.client.api.RemoteRuntimeEngineFactory;

import com.redhat.gema.mplus.usagenotification.model.work;

/**
 * JAX-RS Example
 * <p/>
 * This class produces a RESTful service to report usages.
 */
@Path("/report")
@RequestScoped
public class UsageNotificationRESTService {

	@Inject
	private Logger log;
	private RuntimeEngine engine;
	private MessageFormat mfSuccess = new MessageFormat("Werks-Nutzung gemeldet, Vorgangsnummer ist {0}. Autor: {1}, Titel: {2}, Datum: {3}, Dauer: {4}");
	private MessageFormat mfError = new MessageFormat("Werks-Nutzung konnte nicht gemeldet werden, ein Fehler ist aufgetreten: {0}");
	
	public UsageNotificationRESTService() throws MalformedURLException {
		String deploymentId = System.getProperty("com.redhat.gema.mplus.usagenotification.deploymentId",
				"gema:MPlusMatching:Master-SNAPSHOT");
		String deploymentUrl = System.getProperty("com.redhat.gema.mplus.usagenotification.deploymentUrl",
				"http://209.132.178.154:8080/business-central/");
		String user = System.getProperty("com.redhat.gema.mplus.usagenotification.user", "GEMA1");
		String password = System.getProperty("com.redhat.gema.mplus.usagenotification.password", "gema2016!");

		engine = RemoteRuntimeEngineFactory.newRestBuilder().addUrl(new URL(deploymentUrl))
				.addUserName(user).addPassword(password).addDeploymentId(deploymentId).build();
	}
	
	private final static String USAGE_NOTIFICATION_PROCESS = "OperaMatching.GEMA_Matching_Process";

	/**
	 * Creates a new usage-notification from the values provided.
	 * 
	 * @throws MalformedURLException
	 */
	@POST
	@Consumes("application/json")
	@Produces("text/plain")
	public Response usageNotication(work work) {
		ProcessInstance processInstance = null;
		
		try {
			KieSession kieSession = engine.getKieSession();

			HashMap<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("WorkIncoming", work);

			processInstance = kieSession.startProcess(USAGE_NOTIFICATION_PROCESS, parameters);
		} catch (Exception e) {
			return Response.serverError().status(500).entity(mfError.format(e.getMessage())).build();
		}

		String message = mfSuccess.format(
				new Object[] {
						processInstance.getId(),
						null == work.getAuthor() ? "-" : work.getAuthor(), 
						null == work.getTitle() ? "-" : work.getTitle(),
						null == work.getDate() ? "-" : work.getDate(),
						null == work.getDuration() ? "-" : work.getDuration()
				}
		);
		
		return Response.ok().status(200).entity(message).build();
	}
}
