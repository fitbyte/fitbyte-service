package com.fitbyte.resources;

import com.fitbyte.types.SleepData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/users/{username}/addSleep")
public class SleepResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void setSleepData(SleepData sleepData) {
        if (sleepData != null) {
            System.out.println("NumberOfHours " + sleepData.getNumberOfHours());
            System.out.println("Quality " + sleepData.getQuality());
        } else {
            System.out.println("NULL REQUEST");
        }
    }
}
