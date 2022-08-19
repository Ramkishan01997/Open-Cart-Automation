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
			logger.info("Clicked on My Account ");
			hp.clickRegister();
			logger.info("Clicked on Register ");
			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

			regpage.setFirstName(randomeString().toUpperCase());
			logger.info("Entered FirstName ");
			regpage.setLastName(randomeString().toUpperCase());
			logger.info("Entered Lastname ");
			regpage.setEmail(randomeString() + "@gmail.com");// randomly generated the email
			logger.info("Entered Email Id ");
			regpage.setPassword("test@123");
			logger.info("Entered Password ");
			regpage.setPrivacyPolicy();

			regpage.clickContinue();
			logger.info("clicked on continue button ");
           
		} catch (Exception e) {
			Assert.fail();
		}
	}

}
