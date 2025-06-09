package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommercialPage extends BasePage{

	public CommercialPage(WebDriver driver) {
		super(driver);
	}
	public WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@FindBy(xpath = "(//*[text()='Learn More']/parent::a)[1]") WebElement tenantPortalLnk;
	@FindBy(id = "FirstName") WebElement txtFirstName;
	@FindBy(id = "LastName") WebElement txtLastName;
	@FindBy(id = "Email") WebElement txtEmail;
	@FindBy(id = "Company") WebElement txtCompany;
	@FindBy(id = "Phone") WebElement txtPhone;
	@FindBy(id = "Unit_Count__c") WebElement drpDownUnits;
	@FindBy(id = "Title") WebElement txtTitle;
	@FindBy(id = "demoRequest") WebElement drpDownDemoreq;
	
	
	public void navigateToTenantPortal(){
		wait.until(ExpectedConditions.visibilityOf(tenantPortalLnk));
		tenantPortalLnk.click();
	}
	
	public void fillUpFromData() {
		wait.until(ExpectedConditions.visibilityOf(txtFirstName));
		txtFirstName.sendKeys("Mukesh");
		txtLastName.sendKeys("Suryawanshi");
		txtEmail.sendKeys("example1@yopmail.com");
		txtCompany.sendKeys("Entrata");
		txtPhone.sendKeys("1234567890");
		Select select=new Select(drpDownUnits);
		select.selectByIndex(1);
		txtTitle.sendKeys("Analyst");
		new Select(drpDownDemoreq).selectByVisibleText("a Resident");
				
	}
	
	


}
