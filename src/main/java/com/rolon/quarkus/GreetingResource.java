package com.rolon.quarkus;

import com.rolon.quarkus.config.GreetingConfig;
import com.rolon.quarkus.service.GreetingService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
    @Inject
    private GreetingService greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingService.sayHello();
    }

    @POST
    @Path("saveID/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addHello(@HeaderParam("token") String hName, @QueryParam("name") String qName, @PathParam("id") String pName){
        return pName;
    }

}