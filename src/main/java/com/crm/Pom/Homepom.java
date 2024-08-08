package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepom {
	public Homepom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(linkText = "Organizations")
	WebElement org;
	public WebElement getOrganizations()
	{
		return org;
	}
	public void organizations()
	{
		org.click();
	}
	
	private @FindBy(linkText = "Contacts")
	WebElement contact;
	public WebElement getContacts()
	{
		return contact;
	}
	public void contacts()
	{
		contact.click();
	}

}
