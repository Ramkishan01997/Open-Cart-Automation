package testBases;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;

	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		logger = LogManager.getLogger(this.getClass()); // for reading config file
		rb = ResourceBundle.getBundle("config");
		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println(" please pass correct browser parameter");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.get("https://demo.opencart.com/");
		driver.get(rb.getString("appUrl"));  // reading url from properties file
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teadDown() {
//		driver.quit();
	}

	public String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}

	public String randomeNumber() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}
}
