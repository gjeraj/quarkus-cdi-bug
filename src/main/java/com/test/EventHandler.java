package com.test;

import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class EventHandler {
	@Inject
	public LambdaHandler lambdaHandler;

	public void event(@Observes String event) {
		// Fails
		lambdaHandler.process("First", ((first, second) -> event + " " + second));
	}

	public void direct(String event) {
		// Works
		lambdaHandler.process("First", ((first, second) -> event + " " + second));
	}
}
