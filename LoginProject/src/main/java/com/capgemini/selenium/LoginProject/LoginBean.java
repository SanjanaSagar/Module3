package com.capgemini.selenium.LoginProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBean {

	@FindBy(how=How.NAME,name="uname")
	private WebElement uname;
	
	@FindBy(how=How.NAME,name="pswrd")
	private WebElement pswrd;
	
	@FindBy(how=How.NAME,name="submit")
	private WebElement submit;
	
	@FindBy(how=How.NAME,name="cancel")
	private WebElement cancel;

	public void setUname(String uname) {
		
		this.uname.sendKeys(uname);
		
	}
	
	public String getUname() {
		
		return uname.getAttribute("value");
		
	}
	
	public void setPswrd(String pswrd) {
		
		this.pswrd.sendKeys(pswrd);
	}
	
	public String getPswrd() {
		
		return pswrd.getAttribute("value");
	}
	
	public void clickSubmit() {
		
		submit.click();
	}
	
	public void clickCancel() {
		
		
		cancel.click();
	}
	
	
	
	
}
