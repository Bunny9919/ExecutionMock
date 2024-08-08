package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcard {

	public Giftcard(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	WebElement GiftCard;
	
	public void giftCard()
	{
		GiftCard.click(); 
	}
	
	private @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	WebElement AddtoCart1;
	public void cart1()
	{
		AddtoCart1.click();
	}
	
	private @FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	WebElement AddtoCart2;
	public void cart2()
	{
		AddtoCart2.click();
	}
	
	private @FindBy(xpath = "(//input[@value='Add to cart'])[3]")
	WebElement AddtoCart3;
	public void cart3()
	{
		AddtoCart3.click();
	}
	
	private @FindBy(xpath = "(//input[@value='Add to cart'])[4]")
	WebElement AddtoCart4;
	public void cart4()
	{
		AddtoCart4.click();
	}
	
	private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[1]/input")
	WebElement RecipientName;
	public void rName(String rName)
	{
		RecipientName.sendKeys(rName);
	}
	
	private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[2]/input")
	WebElement recipientEmail;
	public void rEmail(String rEmail)
	{
		recipientEmail.sendKeys(rEmail);
	}
	
	private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[3]/input")
	WebElement SenderName;
	
	public WebElement getSName()
	{
		return SenderName;
	}
	public void sName(String sName)
	{
		SenderName.sendKeys(sName);
	}
	
	private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[4]/input")
	WebElement senderEmail;
	
	public WebElement getSEmail()
	{
		return senderEmail;
	}
	public void sEmail(String sEmail)
	{
		senderEmail.sendKeys(sEmail);
	}
	
	private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[5]/textarea")
	WebElement GiftMsg;
	public void giftMsg(String msg)
	{
		GiftMsg.sendKeys(msg);
	}
	
	private @FindBy(xpath ="//input[@class=\"qty-input\"]")
	WebElement GiftQty;
	public void giftQty(String qty)
	{
		GiftQty.clear();
		GiftQty.sendKeys(qty);
	}
	
	private @FindBy(xpath = "//input[@id='add-to-cart-button-1']")
	WebElement AddGiftToCart;
	public void addGift()
	{
		AddGiftToCart.click();
	}
	
	private @FindBy(className = "cart-label")
	WebElement cart_icon;
	
	public void cart()
	{
		cart_icon.click();
	}
	
	private @FindBy(xpath = "//input[@name='removefromcart']")
	WebElement RemoveFromCart;
	public void remove()
	{
		RemoveFromCart.click();
	}
	
	private @FindBy(xpath = "//input[@value='Update shopping cart']")
	WebElement UpdateCart;
	public void updateCart()
	{
		UpdateCart.click();
	}
	
	private @FindBy(id="termsofservice")
	WebElement AcceptTerms;
	public void accept()
	{
		AcceptTerms.click();
	}
	
	private @FindBy(id="checkout")
	WebElement ChekoutBtn;
	public void checkout()
	{
		ChekoutBtn.click();
	}

	private @FindBy(xpath = "(//div[@class='picture'])[3]")
	WebElement giftcard25;
	
	public void giftCard25()
	{
		giftcard25.click();
	}

	private @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	WebElement addtocart;
	
	public void addToCart()
	{
		addtocart.click();
	}


}
