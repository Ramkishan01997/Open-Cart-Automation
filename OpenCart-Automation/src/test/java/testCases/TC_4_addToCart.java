package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCarttHomePage;
import testBases.BaseClass;

public class TC_4_addToCart extends BaseClass {

	@Test
	public void check_cart_item() {
		AddToCarttHomePage hmpage = new AddToCarttHomePage(driver);

		hmpage.clickiphonelink();
		String prod_txt = hmpage.getaddeditemText();
		Assert.assertEquals(prod_txt, "iPhone");
		hmpage.clickCartbtn();
		hmpage.click_shoppingcart();
		
	}
}
