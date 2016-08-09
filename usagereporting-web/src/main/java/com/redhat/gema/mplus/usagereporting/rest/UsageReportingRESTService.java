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
package com.redhat.gema.mplus.usagereporting.rest;

import java.net.MalformedURLException;

import javax.ejb.Stateful;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.redhat.gema.mplus.usagereporting.model.WorkReport;

/**
 * JAX-RS Example
 * <p/>
 * This class produces a RESTful service to report usages.
 */
@Path("/report")
@Stateful
public class UsageReportingRESTService {
	
	@PersistenceContext(unitName = "com.redhat.gema.mplus.usagereporting", type = PersistenceContextType.EXTENDED)
	EntityManager em;
	
	/**
	 * Creates a new usage-notification from the values provided.
	 * 
	 * @throws MalformedURLException
	 */
	@POST
	@Consumes("application/json")
	@Produces("text/plain")
	public Response usageReporting(WorkReport work) {
		try {
			em.persist(work);
		} catch (Exception e) {
			return Response.serverError().status(500).entity(e.getMessage()).build();
		}

		return Response.ok().status(200).entity("Werks-Nutzung gespeichert.").build();
	}
}
