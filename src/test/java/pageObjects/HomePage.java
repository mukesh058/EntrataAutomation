package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id='w-node-_3ac1575f-3fd3-6dc7-5b96-ca9b97426bb0-974269f2']/div/a[1]") WebElement signInLink;
	@FindBy(xpath = "//*[contains(text(),'Resident Login')]") WebElement BtnResidentLogin;
	@FindBy(name = "email") WebElement usernameField;
	@FindBy(name = "password") WebElement passwordField;
	@FindBy(xpath = "//*[text()='User Login']") WebElement loginText;
	@FindBy(id = "w-dropdown-toggle-1") WebElement solutionsbtn;
	@FindBy(xpath = "(//*[contains(text(),'Commercial')])[1]") WebElement lnkCommercial;
	
	
	public void clickSignin() {
		signInLink.click();

	}
	
	public void clickResidentlogin() {
		BtnResidentLogin.click();

	}
	
	public void enterUsername() {
		usernameField.sendKeys("User1@demomail.com");

	}
	public void enterPassword() {
		passwordField.sendKeys("user1@23");

	}
	
	public void validateLoginText() {
		Assert.assertEquals(loginText.getText(), "User Login");
	}
	
	public void goToSolution() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		new Actions(driver).moveToElement(solutionsbtn).build().perform();
	}
	public void clickCommercial() {
		lnkCommercial.click();
	}


}
