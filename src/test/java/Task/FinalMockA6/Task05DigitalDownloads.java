package Task.FinalMockA6;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassDWS;
import com.crm.Pom.Cart;
import com.crm.Pom.DigitalDownloads;

import pomTasks.HomePage;

public class Task05DigitalDownloads extends BaseClassDWS{
	@Test
	public void highestPrice() throws InterruptedException
	{
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/");
		
		HomePage hPage = new HomePage(driver);
		hPage.digitalDownloads();
		
		DigitalDownloads dd = new DigitalDownloads(driver);
		List<WebElement> pro = dd.products();
		for (WebElement w : pro) {
			w.click();
			Thread.sleep(1000);
		}
		
		dd.cart();
		
		Cart c = new Cart(driver);
		
		List<WebElement> price = c.prices();
		
		List<Double> priceList = new ArrayList<Double>();
		
		for(WebElement w:price)
		{
			priceList.add(Double.parseDouble(w.getText()));
		}
		
		int index = priceList.indexOf(Collections.max(priceList));
		driver.findElement(By.xpath("(//td[@class='remove-from-cart']/input)["+(++index)+"]")).click();
		
		Thread.sleep(2000);
		
		c.updateCart();
	}


}
