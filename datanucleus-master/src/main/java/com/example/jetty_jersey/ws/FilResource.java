package com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.example.datanucleus.dao.Utilisateur;

@Path("/fil")
public class FilResource {
    
    public static class FilClass {
		public String field;
	}

    @PUT
	@Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	public void newFil(FilClass instance) {

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/mod")
	public void modFil (FilClass instance, Utilisateur user) {
		
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/del")
	public void delFil (FilClass instance, Utilisateur user) {
		
	}

}
