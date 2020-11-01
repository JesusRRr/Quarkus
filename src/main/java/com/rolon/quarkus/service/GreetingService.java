package com.rolon.quarkus.service;

import com.rolon.quarkus.config.GreetingConfig;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GreetingService {

    private static Logger LOGGER = Logger.getLogger(GreetingService.class.getName());

    @Inject
    private GreetingConfig greetingConfig;

    public String sayHello() {
        LOGGER.debug("Saying hello to random user");
        return "hello friend "
                + greetingConfig.getName()
                + " "
                + greetingConfig.getTechnology().getName();
    }
}
