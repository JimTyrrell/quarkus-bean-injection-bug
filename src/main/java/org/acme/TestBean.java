package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestBean {

    @ConfigProperty(name = "test.property")
    public String testProperty;
}
