package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @Inject
    TestBean testBean;

    @ConfigProperty(name = "test.property")
    String testProperty;
    
    @GET()
    @Path("/test1")
    @Produces(MediaType.TEXT_PLAIN)
    public String test1() {
        
        new TestBean().printIt();

        testBean.printIt();

        return "test Property from Greeting Resource: " + testProperty;
    }

    @GET()
    @Path("/test2")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2() {
        return "test Property from Greeting Resource: " + testBean.testProperty;
    }

    @GET()
    @Path("/test3")
    @Produces(MediaType.TEXT_PLAIN)
    public String test3() {
        return "test Property from Greeting Resource: " + testBean.getTestProperty();
    }
}