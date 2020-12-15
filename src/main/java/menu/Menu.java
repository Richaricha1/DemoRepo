package menu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import category.Category;
import qa.util.EcommerceUtil;

public class Menu {

	
		public static void main (String a[])
		{
		
			WebDriver driver = EcommerceUtil.getDriver();
		
			driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/a")).click();
	
			List<WebElement> Options=driver.findElements(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li"));
		
			System.out.println("No. of items in Categoy menu is"+Options.size());
		
		}

}
