package com.crm.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	private @FindBy(xpath = "//div[@class='header']/div/a/img")
	WebElement title;
	
	public void title()
	{
		title.click();
	}
	
	private @FindBy(className = "ico-register")
	WebElement register_link;
	
	public void register()
	{
		register_link.click();
	}
	
	private @FindBy(className = "ico-login")
	WebElement login_link;
	
	public void login()
	{
		login_link.click();
	}
	
	private @FindBy(className = "cart-label")
	WebElement cart_icon;
	
	public void cart()
	{
		cart_icon.click();
	}
	
	private @FindBy(className = "ico-wishlist")
	WebElement wishlist;
	
	public void wishlist()
	{
		wishlist.click();
	}
	
	private @FindBy(id="small-searchterms")
	WebElement SearchBar;
	public void search()
	{
		SearchBar.click();
	}
	
	private @FindBy(xpath = "//input[@class='button-1 search-box-button']")
	WebElement SearchBtn;
	public void searchBtn()
	{
		SearchBtn.click();
	}
	
	private @FindBy(xpath = "//a[contains(text(),'Books')]")
	WebElement books;
	
	public void books()
	{
		books.click();
	}
	private @FindBy(xpath = "//a[contains(text(),'Computers')]")
	WebElement computers;
	
	public void computers()
	{
		computers.click();
	}
	private @FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	WebElement electronics;
	
	public void electronics()
	{
		electronics.click();
	}
	private @FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
	WebElement Apparel;
	
	public void apparel()
	{
		Apparel.click();
	}
	
	private @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	WebElement Digitaldownloads;
	
	public void digitalDownloads()
	{
		Digitaldownloads.click();
	}
	
	private @FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	WebElement Jewelry;
	
	public void jewelry()
	{
		Jewelry.click();
	}
	private @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	WebElement GiftCard;
	
	public void giftCard()
	{
		GiftCard.click(); 
	}
	private @FindBy(name = "NewsletterEmail")
	WebElement newsLetterEmail;
	
	public void newsLetterEmail()
	{
		newsLetterEmail.click();
	}
	
	private @FindBy(id = "newsletter-subscribe-button")
	WebElement SubscribeButton;
	
	public void subscribe()
	{
		SubscribeButton.click();
	}
	
	private @FindBy(id="pollanswers-1")
	WebElement ExcellentPoll;
	
	public void pollanswer1()
	{
		ExcellentPoll.click();
	}
	
	private @FindBy(id="pollanswers-2")
	WebElement GoodPoll;
	
	public void pollanswer2()
	{
		GoodPoll.click();
	}
	
	private @FindBy(id="pollanswers-3")
	WebElement PoorPoll;
	
	public void pollanswer3()
	{
		PoorPoll.click();
	}
	
	private @FindBy(id="pollanswers-1")
	WebElement VerybadPoll;
	
	public void pollanswer4()
	{
		VerybadPoll.click();
	}
	
	private @FindBy(xpath = "//div[@class='column follow-us']/ul/li/a")
	List<WebElement> socialLinks;
	
	public List<WebElement> socialLink()
	{
		return socialLinks;
	}
	
	private @FindBy(partialLinkText = "Log out")
	WebElement lo;
	
	public WebElement getLogOut()
	{
		return lo;
	}
	
	public void logOut()
	{
		getLogOut().click();
	}


}
