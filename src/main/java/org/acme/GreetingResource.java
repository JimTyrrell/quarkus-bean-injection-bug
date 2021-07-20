package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "test.property")
    String testProperty;
    
    @GET()
    @Path("/test1")
    @Produces(MediaType.TEXT_PLAIN)
    public String test1() {
        System.out.println("This is it: " + testProperty);
        return "test Property from Greeting Resource: " + testProperty;
    }

    @GET()
    @Path("/test2")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2() {
        return "test Property from Greeting Resource: " + new TestBean().testProperty;
    }
}