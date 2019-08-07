package com.test;

import io.quarkus.runtime.StartupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

@ApplicationScoped
public class Runner {
	@Inject
	public Event<String> event;

	@Inject
	public EventHandler eventHandler;

	public void start(@Observes StartupEvent startupEvent) {
		event.fire("Test");
		eventHandler.direct("Test");
	}
}
