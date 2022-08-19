package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBases.BaseClass;

public class TC_2_LoginTest extends BaseClass {

	@Test
	public void login() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("cliking on my account button");
		hp.clickLogin();
		logger.info("clicke don login button");
		
		LoginPage lp=new LoginPage(driver);
		lp.setemailtext(rb.getString("email"));
	    logger.info(" entered email id");
	    lp.setpassword(rb.getString("pass"));
	    logger.info(" entered password");
	    lp.clickLoginbtn();
	    logger.info("clicked on login button");
	    MyAccountPage mypage=new MyAccountPage(driver);
	    Assert.assertEquals(mypage.getlogoutbtntext(), "Logout");
	}

}
