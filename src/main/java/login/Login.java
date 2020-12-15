package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qa.util.EcommerceUtil;

public class Login {

	
		
		//static WebDriver driver = EcommerceUtil.getDriver();
		
		static By Login = By.xpath("/html/body/div/header/nav/div/div[3]/ul/li[2]/a");
		static By emailId = By.name("email");
		static By password = By.name("password");
		static By loginclick = By.xpath("/html/body/div/div/form/div[3]/div/button");
		
		
		public static void login(WebDriver driver)
		{
			System.out.println("111");
			clickLogin(driver);

			System.out.println("222");
			typEmail(driver);
			
			System.out.println("444");
			typePassword(driver);
			
			System.out.println("555");
			clickOnLoginButton(driver);
			
//			
		}
		
		
		private static void clickLogin(WebDriver driver) {
			
			driver.findElement(Login).click();
		}
		
		private static void typEmail(WebDriver driver) {
			
			driver.findElement(emailId).sendKeys("harry@den.com");
		}
		
		private static void typePassword(WebDriver driver) {
			
			driver.findElement(password).sendKeys("code0");
			
		}
			
		private static void clickOnLoginButton(WebDriver driver) {
			
			driver.findElement(loginclick).click();
			
		}
		


	

}
