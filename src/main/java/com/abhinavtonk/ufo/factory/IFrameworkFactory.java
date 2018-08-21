package com.abhinavtonk.ufo.factory;

import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public interface IFrameworkFactory {

	ILogger getLogger(String logger);
	IReporter getReporter(String reporter);
	<T> T getWebAutomationTool(String webAutomationTool);
}
