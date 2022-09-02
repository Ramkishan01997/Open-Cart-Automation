package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrductsPage extends BasePage {

	public PrductsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//h2[text()='Desktops']")
	WebElement desktopListheader;

	@FindBy(xpath = "//div[@class='description']//h4")
	List<WebElement> desktopLists;

	public String desktopTitle() {
		String deskTitle = desktopListheader.getText();
		return deskTitle;
	}

	public void desktoplist() {
		for (WebElement d : desktopLists) {
			System.out.println(d.getText());
		}
	}

}
