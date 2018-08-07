package com.capgemini.selenium.stepdef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.selenium.LoginProject.LoginBean;
import com.capgemini.selenium.util.DriverUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginProjectStepdef {
	
	 static DriverUtil util = new DriverUtil();
	 static WebDriver driver;
	 LoginBean lbean= new LoginBean();
	 static  Alert alert;
		
	@Before
	public void initialization() {
		
	 util.setDriver();

	}

	@Given("^I have a login form$")
	public void i_have_a_login_form() throws Throwable {
	   
		driver=util.getDriver();
		
	}

	@When("^I enter username$")
	public void i_enter_username() throws Throwable {
		
		PageFactory.initElements(driver, lbean);
		lbean.setUname("Sanjana");
		
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
	  
		lbean.setPswrd("12345");
		
	}

	@When("^click the submit option$")
	public void click_the_submit_option() throws Throwable {
	  
		lbean.clickSubmit();
		
	}

	@Then("^Display alert message$")
	public void display_alert_message() throws Throwable {

		assertEquals("Logged In", getAlertMessage());
		
	}
	
	
	public String getAlertMessage() {
		
		 alert = driver.switchTo().alert();
		return alert.getText();
		
	}
	@After
	public void closeAlert() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();
		
		util.closeDriver();
		
	}
	
}
