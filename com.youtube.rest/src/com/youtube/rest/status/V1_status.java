package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1")
public class V1_status {
	
	//Request from postman : http://localhost:8080/com.youtube.rest/api/v1
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnStatus(){
		return "<p>Java WEB Service is running , add /title or /version </p>";
	}
	
	//Request from browser : http://localhost:8080/com.youtube.rest/api/v1/title
	@Path("/title/")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java WEB Service : Simple webservice</p>";
	}
	
	//Request from browser : http://localhost:8080/com.youtube.rest/api/v1/version
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<p>Java WEB Service : Version 0.001</p>";
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
