package com.fitbyte.resources;

import com.fitbyte.types.SleepData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/users/{username}/addSleep")
public class SleepResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public SleepData setSleepData(SleepData sleepData) {
        return sleepData;
    }
}
