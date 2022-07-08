package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "E:\\Selenium_New\\new\\new feature.feature"
			,glue={"stepdefinition"}
			,monochrome=true
			,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)

	public class TestRunner {

	
}


