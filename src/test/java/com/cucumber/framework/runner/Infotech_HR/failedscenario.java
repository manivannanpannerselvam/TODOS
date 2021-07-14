package com.cucumber.framework.runner.Infotech_HR;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 3,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
//coverageReport = true,
//jsonUsageReport = "target/cucumber-usages.json",
//usageReport = true,
//toPDF = true,
//excludeCoverageTags = {"@flaky" },
includeCoverageTags = {"@passed" },
outputFolder = "target")

@CucumberOptions(strict=true, features = {"@target/rerun.txt" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\Users\\MANIVANNAN\\git\\tests\\Cucumber\\Reports\\cucumber-pretty_failed_testcase",
	    "json:C:\\Users\\MANIVANNAN\\git\\tests\\Cucumber\\Reports\\cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\MANIVANNAN\\git\\tests\\Cucumber\\Reports\\report_failed.html","rerun:target/rerun.txt"}

)


public class failedscenario extends AbstractTestNGCucumberTests{
  
}
