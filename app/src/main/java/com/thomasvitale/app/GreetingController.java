package com.thomasvitale.app;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private final Environment environment;

	public GreetingController(Environment environment) {
		this.environment = environment;
	}

	@GetMapping("greeting")
	public String getGreeting() {
		return environment.getProperty("greeting");
	}
}
