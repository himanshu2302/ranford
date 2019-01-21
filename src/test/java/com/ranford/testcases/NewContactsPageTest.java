package com.ranford.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ranford.base.TestBase;
import com.ranford.pages.ContactsPage;
import com.ranford.pages.LoginPage;
import com.ranford.pages.NewContactsPage;
import com.ranford.utils.TestUtil;

public class NewContactsPageTest extends TestBase {

	LoginPage loginPage;
	ContactsPage contactsPage;
	NewContactsPage newContactsPage;
	
	public NewContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		newContactsPage = new NewContactsPage();
	}
	
	@DataProvider
	public Object [][] getData() throws InvalidFormatException {
		Object[][] testData = TestUtil.getTestData("testdata");
		return testData;
	}
	
	@Test(dataProvider="getData")
	public void createNewContactsTest(String fname, String lname, String comp) {
		loginPage.login();
			TestUtil.switchToFrame();
			contactsPage.clickOnNewContacts();
			newContactsPage.createNewContacts(fname, lname, comp);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
