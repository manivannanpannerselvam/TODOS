package com.cucumber.framework.runner.Infotech_HR;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(features = { "classpath:featurefile/Infofeature/Login_po.feature","classpath:featurefile/Infofeature/forgot_po.feature"}, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\Users\\Mani\\git\\tests\\Cucumber\\Reports\\cucumber-pretty",
	    "json:C:\\Users\\Mani\\git\\tests\\Cucumber\\Reportscucumber.json","com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\Mani\\git\\tests\\Cucumber\\Reports\\report.html","rerun:target/rerun.txt"}
//,tags = {"@PO"}
)


public class Login_runner extends AbstractTestNGCucumberTests
{

}
