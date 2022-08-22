package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddToCarttHomePage extends BasePage {

	public AddToCarttHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "iPhone")
	WebElement iphonelink;

	@FindBy(xpath = "//*[@class='col-sm'][position()=2]/h1")
	WebElement itemcartText;

	@FindBy(css = "button#button-cart")
	WebElement cartbtn;
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	WebElement shoppingcartbtn;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void clickiphonelink() {
		js.executeScript("arguments[0].click();", iphonelink);
	}

	public String getaddeditemText() {
		String itenName = itemcartText.getText();
		return itenName;
	}

	public void clickCartbtn() {
		cartbtn.click();
	}

	public void click_shoppingcart() {
		shoppingcartbtn.click();
	}
}
