package com.abhinavtonk.ufo.automation.web;

import com.abhinavtonk.ufo.automation.web.enums.Browser;
import com.abhinavtonk.ufo.automation.web.enums.LocatorType;

public interface ISelenium {
	
	void launchBrowser(Browser browser);
	void closeCurrentBrowser();
	void closeAllBrowsers();
	void click(LocatorType locatorType, String locator);
	void enterText(LocatorType locatorType, String locator, String text);
	void clear(LocatorType locatorType, String locator);
}
