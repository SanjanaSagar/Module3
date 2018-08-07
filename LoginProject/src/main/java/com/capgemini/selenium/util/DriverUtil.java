package com.capgemini.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {

	 WebDriver driver;
	
	public void setDriver() {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\BDDMaterial\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		
	}
	 
	public WebDriver getDriver() {
		
		 driver.get("http://localhost:8083/HtmlForm/Login.html");
		
		 return driver;
	}
	
	public void closeDriver() {
		
		driver.close();
		
	}
}
