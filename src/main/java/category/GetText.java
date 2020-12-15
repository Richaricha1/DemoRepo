package category;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.util.EcommerceUtil;

public class GetText {
	
	public static void main (String aa[])
	{
		countCategoryItems(EcommerceUtil.getDriver());
	}

	private static void countCategoryItems(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	static By category = By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/a");
	static By laptop = By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a");
	
	
	public static void getText(WebDriver driver) {
		
		
	}
	
	public static void clickOnCategory(WebDriver driver) {
		
		System.out.println("clicking the category button");
		driver.findElement(category).click();
		
	}
		
	public static void selectLaptop(WebDriver driver) {
		
		System.out.println("clicking on laptop option");
		driver.findElement(laptop).click();

	}
}
