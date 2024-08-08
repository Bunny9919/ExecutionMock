package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class organaizationsPom {
	public organaizationsPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(css = "img[alt=\"Create Organization...\"]")
	WebElement plus;
	public WebElement getPlusIcon()
	{
		return plus;
	}
	public void plusIcon()
	{
		plus.click();
	}
	
	private @FindBy(xpath = "//input[@name='accountname']")
	WebElement orgName;
	
	public WebElement getOrganizationName()
	{
		return orgName;
	}
	public void organizationName(String organizationName)
	{
		orgName.sendKeys(organizationName);
	}
	
	private @FindBy(xpath = "(//input[@name=\"assigntype\"])[2]")
	WebElement grp;
	
	public WebElement getGroup()
	{
		return grp;
	}
	public void group()
	{
		grp.click();
	}
	
	
	private @FindBy(name = "assigned_group_id")
	WebElement assignedTo;
	
	public WebElement getAssignedTo()
	{
		return assignedTo;
	}
	public void assignedto(String assigned)
	{ 
		Select s = new Select(assignedTo);
		s.selectByVisibleText(assigned);
	}
	
	private @FindBy(xpath = "(//input[@name=\"button\"])[3]")
	WebElement save;
	
	public WebElement getSave()
	{
		return save;
	}
	public void saveBtn()
	{
		save.click();
	}
	
	private @FindBy(name = "industry")
	WebElement industryDropdown;
	
	public WebElement getIndustry()
	{
		return industryDropdown;
	}
	public void selectIndustry(String industry)
	{ 
		Select s = new Select(industryDropdown);
		s.selectByValue(industry);
	}
	
	private @FindBy(xpath = "//span[@class=\"dvHeaderText\"]")
	WebElement createdOrgText;
	
	public WebElement getCreatedOrgText()
	{
		return createdOrgText;
	}
	
	private @FindBy(xpath = "(//td[text()='Industry']/..//td[@class='dvtCellInfo'])[1]")
	WebElement industryText;
	
	public WebElement getIndustryText()
	{
		return industryText;
	}
	

}
