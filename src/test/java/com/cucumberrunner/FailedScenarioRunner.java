package com.cucumberrunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/rerun.txt", // Path to the rerun file
		glue = "com.stepdefinitions", plugin = { "pretty", "html:target/cucumber-reports-failed",
				"json:target/cucumber-failed.json" }, monochrome = true)
public class FailedScenarioRunner extends AbstractTestNGCucumberTests {
}
