package com.capgemini.selenium.LoginProjectTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},
		tags= {"@Login"},
		//features= {"classpath:createDiffAccount/createDiffAccount.feature"})
		glue= {"com.capgemini.selenium.stepdef"},
		features= {"Features"})

public class TestRunLogin {

}
