package com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.example.datanucleus.dao.DAO;
import com.example.datanucleus.dao.Utilisateur;

@Path("/utilisateur")
public class UtilisateurResource {
    
    public static class ExampleClass {
		public String field;
	}

    @PUT
	@Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	public void newUtilisateur(String parameters) {
		String [] param = parameters.split("/");
		Utilisateur user = new Utilisateur(param[0], param[1], param[2]);
		DAO.getUtilisateurDao().addUtilisateur(user);
	}

}
