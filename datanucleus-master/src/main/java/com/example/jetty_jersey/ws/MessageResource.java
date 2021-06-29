package com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class MessageResource {
    
    public static class MessageClass {
		public String field;
	}

    @PUT
	@Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	public void newMessage(MessageClass instance) {

	}

}
