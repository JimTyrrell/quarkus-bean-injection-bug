package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class TestBean {

    @ConfigProperty(name = "test.property")
    public String testProperty;

    public String getTestProperty()
    {
        return this.testProperty;
    }

    public void printIt()
    {
        System.err.println("test property: " + testProperty);
    }
}
