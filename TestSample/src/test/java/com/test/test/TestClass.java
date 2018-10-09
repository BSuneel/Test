package com.test.test;

import org.testng.annotations.Test;

import com.test.main.TestMain;

public class TestClass {
	
	TestMain main = new TestMain();

	@Test
	public void loginPage(){
		main.loginPage();
		System.out.println("Hello");
	}
}
