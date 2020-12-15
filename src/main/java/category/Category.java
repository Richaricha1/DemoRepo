package category;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import qa.util.EcommerceUtil;

public class Category {
	
	
	public static void main (String aa[])
	{
		//countCategoryItems(EcommerceUtil.getDriver());
		countPhoneItems(EcommerceUtil.getDriver());
	}
	//static WebDriver driver = EcommerceUtil.getDriver();
	
	
	static By category = By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/a");
	static By laptop = By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a");
	static By firstProduct = By.xpath("/html/body/div/div/div/section/div/div[1]/div[1]/div[1]/div/div[1]/h5/a");
	static By DesktopPc = By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[2]/a");
	static By Tablets = By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[3]/a");
	static By Phone = By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[4]/a");
	
	
	
	
	public static void  category(WebDriver driver) {
		
		clickOnCategory(driver);
		selectLaptop(driver);
		clickOnFirstProduct(driver);
		selectDesktop(driver);
		selectTablets(driver);
		selectPhone(driver);
	}
	

	public static void clickOnCategory(WebDriver driver) {
		
		System.out.println("clicking the category button");
		driver.findElement(category).click();
		
	}
		
	public static void selectLaptop(WebDriver driver) {
		
		System.out.println("clicking on laptop option");
		driver.findElement(laptop).click();
		
	}
	
	public static void selectDesktop(WebDriver driver) {
		
		System.out.println("clicking on Desktop pc.....");
		driver.findElement(DesktopPc).click();
		
	}
	
	
	public static void selectTablets(WebDriver driver) {
			
		System.out.println("clicking on Tablets.....");
		driver.findElement(Tablets).click();
		
	}
	
	
	public static void selectPhone(WebDriver driver) {
		
		
		System.out.println("clicking on SmartPhone Menu");
		driver.findElement(Phone).click();
	}
	
	
	public static void clickOnFirstProduct(WebDriver driver) {
		
		System.out.println("selecting the first product");
		driver.findElement(firstProduct).click();
	}
	
	public static int countCategoryItems (WebDriver driver)
	{
		int count = 0;
		List<WebElement> options=driver.findElements(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li"));
		
		count = options.size();
		
		System.out.println("No. of items in Categoy menu is"+options.size());
		
		return count;
	}




	public static int countLaptopsItems(WebDriver driver) {
		
		int count = 0;
		
		clickOnCategory(driver);
		selectLaptop(driver);

		List<WebElement> allElements = driver.findElements(By.xpath("/html/body/div/div/div/section/div/div[1]/div[contains(@class, 'row')]"));
//		/html/body/div/div/div/section/div/div[1]/div[1]
		
																	 
		for(WebElement element : allElements){
		    
			List<WebElement> allElements1 = element.findElements(By.xpath(".//div[@class='box box-solid']"));
					
			int totalDivs1 = allElements1.size();
			
		    count = count + totalDivs1;
		}
		
		System.out.println("No. of items in Laptops menu is"+count);
		
		return count;
	}
	
	 
	
	
	
	public static int countTabletItems(WebDriver driver) {
		int count = 0;
		
		clickOnCategory(driver);
		selectTablets(driver);
				
		List<WebElement> allElements = driver.findElements(By.xpath("/html/body/div/div/div/section/div/div[1]"));
		
		
//																	/html/body/div/div/div/section/div/div[1]/div[1]
		
		for(WebElement element : allElements) {
			
			List<WebElement> allElements2 = element.findElements(By.xpath(".//div[@class='box box-solid']"));
			
			int totalDivs = allElements2.size();
			
			count = count + totalDivs;
			
		}
		
		System.out.println("No of items in Tablets is :"+ count);
		
		return count;
				
				
				
	}
	
	public static List<String> countPhoneItems(WebDriver driver) {
		
		int count = 0;
		
		clickOnCategory(driver);
		selectPhone(driver);
		
		List<String> labelList = new ArrayList<String>();
		
		List<WebElement> allElements = driver.findElements(By.xpath("/html/body/div/div/div/section/div/div[1]"));
		
		for(WebElement element : allElements) {
			
			List<WebElement> allElements2 = element.findElements(By.xpath(".//div[@class='box box-solid']"));
			
			int totalDivs = allElements2.size();
			
			for(WebElement element1 : allElements2) {
				
				labelList.add(element1.getText());
				
				//System.out.println("label=====>"+element1.getText());
			}
			
			count = count + totalDivs;
		}
		
		System.out.println("No. of items in Smartphone menu is :"+ count);
		return labelList;
		
	}
	
	
	
	

}
