package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qa.util.EcommerceUtil;

public class LogOut {

	
		
		//static WebDriver driver = EcommerceUtil.getDriver();
		
//		for logout
		static By profile = By.xpath("/html/body/div/header/nav/div/div[3]/ul/li[2]/a/span");
		static By Signout = By.xpath("/html/body/div/header/nav/div/div[3]/ul/li[2]/ul/li[2]/div[2]/a");

		
		public static void logout(WebDriver driver) {
			
			System.out.println("666");
			ClickOnProfile(driver);
			
			System.out.println("777");
			ClickOnSignout(driver);
			
		}
		
		
 		
		private static void ClickOnProfile(WebDriver driver) {
		driver.findElement(profile).click();
		}
		
		private static void ClickOnSignout(WebDriver driver) {
			driver.findElement(Signout).click();
		}
	
	
		
	

}
