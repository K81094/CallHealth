package com.callhealth.jaxrs.calc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/calc")
@Produces("application/json")
public class CalcREST {
 
    @GET
    @Path("/add/{a}/{b}")
    @Produces("application/json")
    public Response addPlainText(@PathParam("a") double a, @PathParam("b") double b) {
    	
        return Response.status(200).entity((a + b)).build();
    }
}