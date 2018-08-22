package com.abhinavtonk.ufo.automation.web.factory;

import com.abhinavtonk.ufo.automation.web.enums.AutomationTool;

public interface IWebFactory {
	<T> T getWebAutomationTool(AutomationTool webAutomationTool);
}
