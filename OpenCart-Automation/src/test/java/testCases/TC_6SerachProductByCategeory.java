package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.PrductsPage;
import testBases.BaseClass;

public class TC_6SerachProductByCategeory extends BaseClass {

	@Test
	public void SearchByCategeory() {

		HomePage hp = new HomePage(driver);

		hp.moveOnDeskMenu();
		logger.info("moved on desktop menu");

		hp.clickDesktopMenu();
		logger.info("clicked on show all desktop");
		PrductsPage prpage = new PrductsPage(driver);
		Assert.assertEquals(prpage.desktopTitle(), "Desktops");
		prpage.desktoplist();

	}

}
