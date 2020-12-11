package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceLogin {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "//Users//Aditya.Kumar1//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/ecommerce/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[3]/ul/li[2]/a")).click();
		driver.findElement(By.name("email")).sendKeys("harry@den.com");
		driver.findElement(By.name("password")).sendKeys("code0");
		driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div/button")).click();
		
//		clicking on Home button in the menu
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/ul/li[1]/a")).click();
		System.out.println("Clicked on Home button");
		
		
			

	}

}
