package com.bca.jenkins.service;

import javax.sound.midi.Track;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTrackInJSON() {
        String output = "Service Email : running";
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track) {
        String result = "Track saved : " + track;
        return Response.status(201).entity(result).build();
    }

}
