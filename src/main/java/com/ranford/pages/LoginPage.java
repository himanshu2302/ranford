package com.ranford.pages;

import java.awt.print.Pageable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ranford.base.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(xpath="//input[@name='username']")
	WebElement un;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement lgnBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		un.sendKeys(prop.getProperty("username"));
		pwd.sendKeys(prop.getProperty("password"));
		lgnBtn.submit();
	}
}
