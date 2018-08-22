package com.abhinavtonk.ufo.automation.web.factory;

import com.abhinavtonk.ufo.automation.web.AutoIT;
import com.abhinavtonk.ufo.automation.web.SeleniumWebDriver;
import com.abhinavtonk.ufo.automation.web.Winium;
import com.abhinavtonk.ufo.automation.web.enums.AutomationTool;

public class WebFactory implements IWebFactory{
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
