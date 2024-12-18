package com.cucumberrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {

	@CucumberOptions(features = "src/test/resources/features/", glue = {
			"com.stepdefinitions" }, plugin = { "pretty",
					"html:target/cucumber-reports" ,"rerun:target/rerun.txt"}, tags = "@Login", dryRun = true // To check the
																							// stepdefinitions and if
																							// missing it will print in
																							// console
	)
	public class TestRunner extends AbstractTestNGCucumberTests {
	}

}
