package com.ranford.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.base.TestBase;
import com.ranford.pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginPage;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginTest() {
		loginPage.login();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
