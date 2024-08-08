package com.crm.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DigitalDownloads {
	public DigitalDownloads(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	private @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]") WebElement digitalDownload;
	private @FindBy(id="products-orderby") WebElement sortBy;
	private @FindBy(id="products-pagesize")WebElement display;
	private @FindBy(id="products-viewmode")WebElement view;
	private @FindBy(xpath = "//input[@value='Add to cart']") List<WebElement> prod;
	private @FindBy(xpath = "//span[text()='Shopping cart']") WebElement c;

	public void digitalDownload() {
		digitalDownload.click();
	}
	public void sortBy(int i) {
		Select se=new Select(sortBy);
	}
	public void display(int user) {
		Select se=new Select(display);
	}
	public void view(int user) {
		Select se=new Select(view);
	}
	public List<WebElement> products()
	{
		return prod;
	}
	
	public void cart()
	{
		c.click();
	}

}
