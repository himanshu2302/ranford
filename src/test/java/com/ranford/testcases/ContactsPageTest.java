package com.ranford.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.base.TestBase;
import com.ranford.pages.ContactsPage;
import com.ranford.pages.LoginPage;
import com.ranford.utils.TestUtil;

public class ContactsPageTest extends TestBase {

	
	LoginPage loginPage;
	ContactsPage contactsPage;
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
	}
	
	@Test
	public void clickOnNewContactsTest() {
		loginPage.login();
		TestUtil.switchToFrame();
		contactsPage.clickOnNewContacts();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
