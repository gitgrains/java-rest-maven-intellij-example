package com.jersey.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/message")
public class Message {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMessage() {

        String message = "Welcome at " + (new Date()).toString();

        return Response.ok().entity(message).build();
    }
}
