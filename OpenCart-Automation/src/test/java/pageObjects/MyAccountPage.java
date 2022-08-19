package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='content']/h2[1]")
	WebElement myacctxt;

	@FindBy(linkText = "Logout")
	WebElement logoutbtn;
	
	public String getlogoutbtntext() {
		String text=logoutbtn.getText();
		return text;
	}

}
