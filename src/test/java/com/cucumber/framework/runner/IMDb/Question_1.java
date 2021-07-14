package com.cucumber.framework.runner.IMDb;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/todos/todos.feature"}, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\Users\\MANIVANNAN\\git\\tests\\Cucumber\\Reports\\cucumber-pretty",
		"json:C:\\Users\\MANIVANNAN\\git\\tests\\Cucumber\\Reports\\cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\MANIVANNAN\\git\\tests\\Cucumber\\Reports\\report.html","rerun:target/rerun.txt"}

)
public class Question_1 extends AbstractTestNGCucumberTests {
	

}
