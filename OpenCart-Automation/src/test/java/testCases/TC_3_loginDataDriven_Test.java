package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBases.BaseClass;
import utilities.DataProviders;

public class TC_3_loginDataDriven_Test extends BaseClass {
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void login_DDT_Test(String username,String pass, String result)
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("cliking on my account button");
		hp.clickLogin();
		logger.info("clicke don login button");
		
		LoginPage lp=new LoginPage(driver);
		lp.setemailtext(username);
	    logger.info(" entered email id");
	    lp.setpassword(pass);
	    logger.info(" entered password");
	    lp.clickLoginbtn();
	}
	
	
	

}
