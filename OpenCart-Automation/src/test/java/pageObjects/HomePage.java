package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyaccount;

	@FindBy(linkText = "Register")
	WebElement lnkRegister;
	
	@FindBy(linkText = "Login")
	WebElement loginLink;
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle'][text()='Desktops']")
	WebElement desktopMenu;
	
	@FindBy(xpath="//*[text()='Show All Desktops']")
	WebElement showAllSektop;

	// Action Methods
	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}
	public void clickLogin() {
		loginLink.click();
	}
	
	public void moveOnDeskMenu() {
		Actions act=new Actions(driver);
		act.moveToElement(desktopMenu).build().perform();
	}
	public void clickDesktopMenu() {
		showAllSektop.click();
	}

}
