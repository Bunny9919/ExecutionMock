package com.crm.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath = "//td[@class='subtotal nobr end']/span[2]")
	List<WebElement> p;
	
	public List<WebElement> prices()
	{
		return p;
	}
	
	private @FindBy(name = "updatecart")
	WebElement uCart;
	
	public void updateCart()
	{
		uCart.click();
	}
	private @FindBy(linkText = "$25 Virtual Gift Card")
	WebElement gift25;
	
	public WebElement getGiftCard25()
	{
		return gift25;
	}
}
