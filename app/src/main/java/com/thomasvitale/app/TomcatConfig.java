package com.thomasvitale.app;

import org.apache.catalina.startup.VersionLoggerListener;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfig implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

	@Override
	public void customize(TomcatServletWebServerFactory factory) {
		// Logs version information on startup.
		factory.addContextLifecycleListeners(new VersionLoggerListener());
	}
}
