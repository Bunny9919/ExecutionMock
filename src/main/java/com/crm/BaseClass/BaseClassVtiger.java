package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassVtiger {
public static WebDriver driver;
	
	com.crm.FileUtility.PropertyUtility putil = new com.crm.FileUtility.PropertyUtility();
	
	@BeforeClass
	public void preCondition() throws IOException
	{
		String browser = putil.getInputData("Browser");
		String url = putil.getInputData("URL");

		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	 
	@BeforeMethod
	public void login() throws IOException
	{
		driver.findElement(By.name("user_name")).sendKeys(putil.getInputData("Username"));
		driver.findElement(By.name("user_password")).sendKeys(putil.getInputData("Password"));
		driver.findElement(By.id("submitButton")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//td[@class='small'])[2]/img"))).perform();
		driver.findElement(By.partialLinkText("Sign Out")).click();
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}



}
