package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//span[text()='Create new account']")
	WebElement createA;
	
	public void createAccount()
	{
		createA.click();
	}
	
	private @FindBy(name = "firstname")
	WebElement fName;
	
	public void firstName(String firstName)
	{
		fName.sendKeys(firstName);
	}
	
	private @FindBy(name = "lastname")
	WebElement lName;
	
	public void lastName(String lastName)
	{
		lName.sendKeys(lastName);
	}
	
	private @FindBy(name = "reg_email__")
	WebElement e;
	
	public void email(String email)
	{
		e.sendKeys(email);
	}
	
	private @FindBy(id = "password_step_input")
	WebElement pass;
	
	public void password(String newPassword)
	{
		pass.sendKeys(newPassword);
	}
	
	private @FindBy(id = "day")
	WebElement d;
	
	public void day(String visibleDate)
	{
		Select s = new Select(d);
		s.selectByVisibleText(visibleDate);
	}
	
	private @FindBy(id = "month")
	WebElement m;
	
	public void month(String visibleMonth)
	{
		Select s = new Select(m);
		s.selectByVisibleText(visibleMonth);
	}
	
	private @FindBy(id = "year")
	WebElement y;
	
	public void year(String visibleYear)
	{
		Select s = new Select(y);
		s.selectByVisibleText(visibleYear);
	}
	
	private @FindBy(xpath = "//label[text()='Male']")
	WebElement g;
	
	public void gender()
	{
		g.click();
	}

}
