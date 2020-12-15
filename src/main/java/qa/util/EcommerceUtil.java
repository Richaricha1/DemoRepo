package qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceUtil {
	
	public static WebDriver getDriver()
	{
		System.out.println("Inside getDriver ................ ");
		
		System.setProperty("webdriver.chrome.driver", "//Users//Aditya.Kumar1//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/ecommerce/index.php");
		
		return driver;
	}

}
