package com.test;

import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.function.Function;

@ApplicationScoped
public class LambdaHandler {
	@Inject
	public Logger logger;

	public void process(String value, IStringHandler processor) {
		logger.debug("Lambda: {}", processor.apply(value, "Second"));
	}
}
