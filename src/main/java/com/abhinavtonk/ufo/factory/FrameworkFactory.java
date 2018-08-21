package com.abhinavtonk.ufo.factory;

import org.openqa.selenium.support.ui.Select;

import com.abhinavtonk.ufo.automation.web.ISeleniumWebdriver;
import com.abhinavtonk.ufo.automation.web.SeleniumWebDriver;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public class FrameworkFactory implements IFrameworkFactory{

	public ILogger getLogger(String logger) {
		// TODO Auto-generated method stub
		return null;
	}

	public IReporter getReporter(String reporter) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T> T getWebAutomationTool(String webAutomationTool) {
		// TODO Auto-generated method stub
		return (T) new SeleniumWebDriver();
	}

}
