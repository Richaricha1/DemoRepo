package qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//Aditya.Kumar1//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		locating the element using id 
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();*/
		
//		using xpath
		
//		         //tagname[attribute = 'value']/abc/xyz
		//driver.findElement(By.)
	}

}
