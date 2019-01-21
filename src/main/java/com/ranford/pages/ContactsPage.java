package com.ranford.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ranford.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement newContactsLink;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewContacts() {
		Actions act = new Actions(driver);
		act.moveToElement(contactsLink).build().perform();
		newContactsLink.click();
	}
}
