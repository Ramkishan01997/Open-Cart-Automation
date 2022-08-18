package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBases.BaseClass;

public class TC_001AccountRegisterTest extends BaseClass {
	@Test
	public void test_account_Registration() throws InterruptedException {
		try {

			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();

			hp.clickRegister();

			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

			regpage.setFirstName(randomeString().toUpperCase());

			regpage.setLastName(randomeString().toUpperCase());

			regpage.setEmail(randomeString() + "@gmail.com");// randomly generated the email

			regpage.setPassword("test@123");

			regpage.setPrivacyPolicy();

			regpage.clickContinue();

		} catch (Exception e) {
			Assert.fail();
		}
	}

}
