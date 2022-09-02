package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBases.BaseClass;

public class Tc_5_verifyLinks extends BaseClass {
	@Test
	public void verify_allLinks() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("cliking on my account button");
		hp.clickLogin();
		LoginPage lp=new LoginPage(driver);
		System.out.println(lp.alllnk());
		lp.allWebelm();
	}

}
