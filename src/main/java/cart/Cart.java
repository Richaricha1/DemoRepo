package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import qa.util.EcommerceUtil;

public class Cart {

	
		
		static WebDriver driver = EcommerceUtil.getDriver();
		
		static  By cartButton = By.xpath("/html/body/div/header/nav/div/div[3]/ul/li[1]/a/i");
		static  By GoToCart = By.xpath("/html/body/div/header/nav/div/div[3]/ul/li[1]/ul/li[3]/a");
		static  By cartMessage = By.xpath("/html/body/div/div/div/section/div/div[1]/div/div/table/tbody/tr[1]/td");
		
		
	
		public static void cart(WebDriver driver) {
			
			ClickLogin(driver);
			
			System.out.println("......123");
			clickOnCart(driver);
			
			System.out.println("......456");
			clickOnGoToCart(driver);
			
			System.out.println("......789");
			getCartMessage(driver);
			
			
		}
		

		private static void clickOnCart(WebDriver driver) {
			driver.findElement(cartButton).click();
		}
		
		
		
		private static void clickOnGoToCart(WebDriver driver) {
			driver.findElement(GoToCart).click();
		}
		
		
		
		private static void getCartMessage(WebDriver driver) {
			driver.findElement(cartMessage).getText();
		}
		
		private static void ClickLogin(WebDriver driver) {
			driver.findElement(By.xpath("/html/body/div/header/nav/div/div[3]/ul/li[2]/a")).click();
			driver.findElement(By.name("email")).click();
			driver.findElement(By.name("password")).click();
			driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div/button")).click();
			
		}
		
		private static void SelectTablets(WebDriver driver) {
			driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[3]/a")).click();
			
		}

	

}
