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
    JavaBean injectedTestBean;

    JavaBean regularTestBean = new JavaBean();

    @ConfigProperty(name = "test.memberVariable")
    String memberVariable;

    @ConfigProperty(name = "test.staticMemberVariable")
    static String staticMemberVariable;
    
    @GET()
    @Path("/test1")
    @Produces(MediaType.TEXT_PLAIN)
    public String test1() {
        return "test Property from Greeting Resource: " + memberVariable;
    }

    @GET()
    @Path("/test2a")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2a() {
        System.err.println("Fascinating that the hascode for injectedTestBean is the same for 2a and 2b: " + injectedTestBean  );
        return "test Property from Greeting Resource: " + injectedTestBean.memberVariable;
    }

    @GET()
    @Path("/test2b")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2b() {
        System.err.println("Fascinating that the hascode for injectedTestBean is the same for 2a and 2b: " + injectedTestBean  );
        return "test Property from Greeting Resource: " + injectedTestBean.getMemberVariable();
    }


    @GET()
    @Path("/test2a-regular")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2aRegular() {
        System.err.println("Fascinating that the hascode for injectedTestBean is the same for 2a and 2b: " + regularTestBean  );
        return "test Property from Greeting Resource: " + regularTestBean.memberVariable;
    }

    @GET()
    @Path("/test2b-new")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2bNew() {
        return "test Property from Greeting Resource: " + new JavaBean().getMemberVariable();
    }

    @GET()
    @Path("/test2a-new")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2aNew() {
        return "test Property from Greeting Resource: " + new JavaBean().memberVariable;
    }

    @GET()
    @Path("/test2b-regular")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2bRegular() {
        System.err.println("Fascinating that the hascode for injectedTestBean is the same for 2a and 2b: " + regularTestBean  );
        return "test Property from Greeting Resource: " + regularTestBean.getMemberVariable();
    }



    @GET()
    @Path("/test1-static")
    @Produces(MediaType.TEXT_PLAIN)
    public String test1Static() {
        return "test Property from Greeting Resource: " + staticMemberVariable;
    }

    @GET()
    @Path("/test2a-static")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2aStatic() {
        System.err.println("Fascinating that the hascode for injectedTestBean is the same for 2a and 2b: " + injectedTestBean  );
        return "test Property from Greeting Resource: " + JavaBean.staticMemberVariable;
    }

    @GET()
    @Path("/test2b-static")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2bStatic() {
        System.err.println("Fascinating that the hascode for injectedTestBean is the same for 2a and 2b: " + injectedTestBean  );
        return "test Property from Greeting Resource: " + JavaBean.getStaticMemberVariable();
    }




    


    
}