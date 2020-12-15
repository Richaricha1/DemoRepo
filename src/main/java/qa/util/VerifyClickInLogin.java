package qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import login.Login;

public class VerifyClickInLogin {
	
	
	
	
	@Test
	public void VerifyValidLogin() {
		System.setProperty("webdriver.chrome.driver", "//Users//Aditya.Kumar1//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/ecommerce/index.php");
		
		Login login = new Login();
		
//		login.clickLogin();
//		login.typEmail();
//		login.typePassword();
//		login.clickOnLoginButton();
//		login.ClickOnProfile();
//		login.ClickOnSignout();
	}
	
	
		
	
}
