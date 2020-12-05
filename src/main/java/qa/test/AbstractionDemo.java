package qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		AbstractionDemo abstractionDemo = new AbstractionDemo();
		abstractionDemo.login();

	}
	
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "//Users//Aditya.Kumar1//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name = 'txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name = 'txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@class = 'button']")).click();
		
		
		
	}

}
