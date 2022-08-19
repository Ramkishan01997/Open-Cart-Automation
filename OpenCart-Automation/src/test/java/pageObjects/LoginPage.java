package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="email")
	WebElement emailTxt;
	
	@FindBy(name="password")
	WebElement passwordTxt;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginbtn;
	
	public void  setemailtext(String email) {
		emailTxt.sendKeys(email);
	}
	public void setpassword(String pass) {
		passwordTxt.sendKeys(pass);
	}
	public void clickLoginbtn() {
		loginbtn.click();
	}
}
