package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.util.EcommerceUtil;

public class Home {

	
		
		static WebDriver driver = EcommerceUtil.getDriver();
		
		static By movingImage = By.xpath("/html/body/div/div/div/section/div/div[1]/div/div/div[3]/img");
		static By nextButton = By.xpath("/html/body/div/div/div/section/div/div[1]/div/a[2]/span");
		
		
		
		public static void home() {
			
			getTextOfMovingImage();
			clickOnNextArrow();
			
		}
		
		public static void getTextOfMovingImage() {
			
			System.out.println("The text of the image is :.......");
			driver.findElement(movingImage).getSize();
			
		}
		
		public static void clickOnNextArrow() {
			
			System.out.println("clicking the arrow button");
			driver.findElement(nextButton).click();
		}

	

}
