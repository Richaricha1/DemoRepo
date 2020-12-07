package qa.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractionDemo {
	
	WebDriver driver;

	public static void main(String[] args) {
		
		AbstractionDemo abstractionDemo = new AbstractionDemo();
		abstractionDemo.login();
//		abstractionDemo.logout();
		//abstractionDemo.clickLinkByHref("welcome");
		abstractionDemo.goToAdmin();
		abstractionDemo.selectUserRole();
		abstractionDemo.clickOnSearchButton();
		
		
		

	}
	
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "//Users//Aditya.Kumar1//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name = 'txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name = 'txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@class = 'button']")).click();
		
		
	}
	
	public void logout() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();
		
		System.out.println("logout..............");
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[10]/ul/li[2]/a")).click();

		

		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/div[1]/div[10]/ul/li[2]/a"))).click();	
		
	}
	
	public void goToAdmin() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
	}
	
	public void selectUserRole() {
		
//		handling drop down
		Select dropdown = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		dropdown.selectByVisibleText("ESS");
		
		
	}
	
	public void clickOnSearchButton() {
		
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("search button clicked");
		
	}
	
	 
}
