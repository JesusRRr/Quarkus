package com.rolon.quarkus;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;


@ApplicationScoped
public class AppLifecycleListener {
    public static Logger LOGGER = Logger.getLogger("Lifecycle");

    public void onStart(@Observes StartupEvent startupEvent){
        LOGGER.info("onStart executed");
    }
    public void onStop(@Observes ShutdownEvent shutdownEvent){
        LOGGER.info("onStop executed");
    }
}
