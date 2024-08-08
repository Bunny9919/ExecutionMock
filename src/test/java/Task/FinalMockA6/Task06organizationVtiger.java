package Task.FinalMockA6;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassVtiger;
import com.crm.FileUtility.ExcelUtility;
import com.crm.JavaUtility.JavaUtil;
import com.crm.Pom.Homepom;
import com.crm.Pom.organaizationsPom;


public class Task06organizationVtiger extends BaseClassVtiger {
	ExcelUtility eUtil = new ExcelUtility();
	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException
	{
		Homepom h = new Homepom(driver);
		h.organizations();
		
		int row = 0;
		organaizationsPom org = new organaizationsPom(driver);
		org.plusIcon();
		String orgName= eUtil.getData("Org", row++, 0);
		org.organizationName(orgName+JavaUtil.generateRandomNumber(1000));
		org.group();
		org.assignedto(eUtil.getData("Org", row++, 0));
		org.saveBtn();
		
		assertTrue((org.getCreatedOrgText().getText()).contains(orgName));
	}


}
