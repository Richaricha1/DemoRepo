//import java.sql.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class hello {
	
	public static void main(String[] args) throws InterruptedException {
    	
		System.setProperty("webdriver.chrome.driver","//Users//Aditya.Kumar1//Downloads//chromedriver");
		
		ChromeOptions chromepOtions = new ChromeOptions();
		
//		ChromeOptions chromeOptions = null;
		chromepOtions.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(chromepOtions);
	
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.manage().window().maximize();
        
        System.out.println("The title of the page is " + driver.getTitle());
        
        
        
       
        
}

}
