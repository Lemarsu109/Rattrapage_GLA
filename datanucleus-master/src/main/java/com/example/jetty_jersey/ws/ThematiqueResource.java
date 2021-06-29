package com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.example.datanucleus.dao.Utilisateur;

@Path("/thematique")
public class ThematiqueResource {
    
    public static class ThematiqueClass {
		public String field;
	}

    @PUT
	@Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	public void newThematique(ThematiqueClass instance) {

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/mod")
	public void modUtilisateur (ThematiqueClass instance, Utilisateur user) {
		
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/del")
	public void delUtilisateur (ThematiqueClass instance, Utilisateur user) {
		
	}

}
