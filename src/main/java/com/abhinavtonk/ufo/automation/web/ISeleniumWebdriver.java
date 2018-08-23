package com.abhinavtonk.ufo.automation.web;

import org.openqa.selenium.WebElement;

import com.abhinavtonk.ufo.automation.web.enums.LocatorType;

public interface ISeleniumWebdriver extends ISelenium{

	WebElement findElement(LocatorType locatorType, String locator);
	WebElement findElementById(String id);
	WebElement findElementByName(String name);
	WebElement findElementByXpath(String xpath);
	WebElement findElementByCssSelector(String cssSelector);
	WebElement findElementByTagName(String tagName);
	WebElement findElementByClassName(String className);
	WebElement findElementByLinkText(String linkText);
	WebElement findElementByPartialLinkText(String partialLinkText);

	void click(WebElement webElement);
	void maximizeWindow();
	void setImplicitlyWait(long timeInSeconds);
	void setPageLoadTimeout(long timeInSeconds);
}
