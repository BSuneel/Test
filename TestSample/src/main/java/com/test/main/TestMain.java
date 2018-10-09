package com.test.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMain {
	
	public WebDriver driver;
	
	public void loginPage(){
		System.setProperty("webdriver.chrome.driver","src/main/resources/bin/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.airbnb.co.in/");
	}

}
