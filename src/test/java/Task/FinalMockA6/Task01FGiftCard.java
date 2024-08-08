package Task.FinalMockA6;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassDWS;
import com.crm.FileUtility.ExcelUtility;
import com.crm.Pom.Cart;

import pomTasks.GiftCard;
import pomTasks.HomePage;

public class Task01FGiftCard extends BaseClassDWS{
	ExcelUtility eUtil = new ExcelUtility();
	@Test
	public void giftCard() throws EncryptedDocumentException, IOException, InterruptedException
	{
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/");
		
		HomePage hPage = new HomePage(driver);
		hPage.giftCard();
		
		int row = 0;
		
		GiftCard gCard = new GiftCard(driver);
		gCard.giftCard25();
		gCard.rName(eUtil.getData("DWS_G", row++, 0));
		gCard.rEmail(eUtil.getData("DWS_G", row++, 0));
		gCard.getSName().clear();
		gCard.sName(eUtil.getData("DWS_G", row++, 0));
		gCard.getSEmail().clear();
		gCard.sEmail(eUtil.getData("DWS_G", row++, 0));	
		gCard.giftMsg(eUtil.getData("DWS_G", row++, 0));
		gCard.giftQty(String.valueOf((int)Double.parseDouble(eUtil.getData("DWS_G", row++, 0))));
		Thread.sleep(2000);
		gCard.addToCart();
		
		hPage.cart();
		Thread.sleep(2000);		
		Cart c = new Cart(driver);
		assertTrue(c.getGiftCard25().isDisplayed(), "$25 product is not displayed in cart");
	}


}
