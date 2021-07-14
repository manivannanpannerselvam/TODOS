
package com.cucumber.framework.configuration.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class HtmlUnitBrowser {
	
	public Capabilities getHtmlUnitDriverCapabilities() {
		DesiredCapabilities unit = DesiredCapabilities.htmlUnit();
		return unit;
	}

	public WebDriver getHtmlUnitDriver(Capabilities htmlUnitDriverCapabilities) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
