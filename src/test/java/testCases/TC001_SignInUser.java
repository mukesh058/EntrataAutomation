package testCases;

import java.security.PublicKey;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.HomePage;


public class TC001_SignInUser extends BaseClass{
	static HomePage hp;
	@Test
	public void signIn() {
		hp =new HomePage(driver);
		hp.clickSignin();
		hp.clickResidentlogin();
		hp.enterUsername();
		hp.enterPassword();
	}
	@Test
	void validateLoginPage() {
		hp.validateLoginText();
	}
	
	
	
	
}
