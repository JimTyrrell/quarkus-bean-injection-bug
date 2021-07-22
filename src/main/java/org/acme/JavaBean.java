package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JavaBean {

    @ConfigProperty(name = "test.memberVariable")
    public String memberVariable;

    public String getMemberVariable()
    {
        return this.memberVariable;
    }

    public void printMemeberVariable()
    {
        System.err.println("calling printIt in TestBean: " + memberVariable);
    }

    @ConfigProperty(name = "test.staticMemberVariable")
    public static String staticMemberVariable;

    public static String getStaticMemberVariable()
    {
        return staticMemberVariable;
    }

    public static void printStaticMemberVariable()
    {
        System.err.println("calling printIt in TestBean: " + staticMemberVariable);
    }


}


 
