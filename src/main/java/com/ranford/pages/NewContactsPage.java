package com.ranford.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ranford.base.TestBase;

public class NewContactsPage extends TestBase {
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement fn;
	
	@FindBy(xpath="//input[@name='surname']")
	WebElement ln;
	
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement com;
	
	@FindBy(xpath="//td[@align='center'][@valign='top'][@colspan='2']//input[@type='submit'][@value='Save']")
	WebElement saveBtn;
	
	public NewContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createNewContacts(String fname, String lname, String comp) {
		fn.sendKeys(fname);
		ln.sendKeys(lname);
		com.sendKeys(comp);
		saveBtn.submit();
	}

}
