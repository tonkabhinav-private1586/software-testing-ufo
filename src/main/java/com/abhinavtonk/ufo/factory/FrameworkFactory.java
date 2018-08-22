package com.abhinavtonk.ufo.factory;

import com.abhinavtonk.ufo.automation.web.AutoIT;
import com.abhinavtonk.ufo.automation.web.SeleniumWebDriver;
import com.abhinavtonk.ufo.automation.web.Winium;
import com.abhinavtonk.ufo.enums.AutomationTool;
import com.abhinavtonk.ufo.enums.FrameworkLogger;
import com.abhinavtonk.ufo.enums.FrameworkReporter;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.logging.Log4jLogger;
import com.abhinavtonk.ufo.reporting.HtmlReporter;
import com.abhinavtonk.ufo.reporting.IReporter;
import com.abhinavtonk.ufo.reporting.ReportNGReporter;
import com.abhinavtonk.ufo.reporting.TestNGReporter;

public class FrameworkFactory implements IFrameworkFactory{

	public ILogger getLogger(FrameworkLogger logger) {
		switch(logger){
		case LOG4J:
			return new Log4jLogger();

		default:
			return null;
		}
	}

	public IReporter getReporter(FrameworkReporter reporter) {
		switch(reporter){
		case REPORT_NG_REPORTER:
			return new ReportNGReporter();

		case HTML_REPORTER:
			return new HtmlReporter();

		case TESTNG_REPORTER:
			return new TestNGReporter();

		default:
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T getWebAutomationTool(AutomationTool webAutomationTool) {
		switch(webAutomationTool){
		case SELENIUM_WEBDRIVER:
			return (T) new SeleniumWebDriver();

		case AUTO_IT:
			return (T) new AutoIT();

		case WINIUM:
			return (T) new Winium();

		default:
			return null;
		}
	}

}
