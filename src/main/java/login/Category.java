package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Category {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","//Users//Aditya.Kumar1//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/ecommerce/index.php");
		driver.manage().window().maximize();
		
//		Click on the Category menu
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/a/span")).click();

//		click on Laptops
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
//		Click on the Category menu
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/a/span")).click();
		
//		click on Desktop pc
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		click on the categoty menu
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/a/span")).click();
		
//		click on Tablets
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[3]/a")).click();
//		click on category
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/a/span")).click();
		
//		Click on SmartPhone
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[4]/a")).click();
		
		
//		Select select = new Select(driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/a")));

//		Select Laptops from category list, click on it and then select the first item from the list
//		first click on category
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/a/span")).click();
//		Then click on Laptops
		
//		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();		
		driver.findElement(By.xpath("/html/body/div/div/div/section/div/div[1]/div[1]/div[1]/div/div[1]/h5/a")).click();
	}
}
