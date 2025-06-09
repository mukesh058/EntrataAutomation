package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CommercialPage;
import pageObjects.HomePage;
public class TC002_ValidateFuntionalityofCommercialPage extends BaseClass {
	
	 HomePage hp1;
	 CommercialPage cp;
	@Test
	void verifyCommertialPage() {
		hp1=new HomePage(driver);
		hp1.goToSolution();
		hp1.clickCommercial();
		Assert.assertTrue(driver.getCurrentUrl().contains("commercial"));
	}
	
	@Test
	void verifyTenantPortal()
	{
		cp=new CommercialPage(driver);
		cp.navigateToTenantPortal();
		cp.fillUpFromData();
		Assert.assertTrue(driver.getTitle().length()>5);
	}
	

}
