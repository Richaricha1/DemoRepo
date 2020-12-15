package login;

	import static org.testng.Assert.assertEquals;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.testng.annotations.Test;

import qa.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class EcommerceLoginTest {
		
	  @BeforeMethod
	  public void init() {
	    	System.setProperty("webdriver.chrome.driver",TestUtil.loc);
	    	TestUtil.driver = new ChromeDriver();
	    	TestUtil.driver.manage().timeouts()
			.implicitlyWait(TestUtil.WAIT_TIME, TimeUnit.SECONDS);
	    	TestUtil.driver.get(TestUtil.url);
	  }
	 /* 
	 @Test
	 public void homeTitle(){
		  	String actualHomeTitle;
		  	actualHomeTitle = TestUtil.homeTitle().getAttribute("innerHTML").trim();
		  	assertEquals(actualHomeTitle, TestUtil.expectedHomeTitle);
		}
	  
	  */

	 @Test
	  public void LaptopTitle(){
		  	String actualLaptopTitle;
		  	actualLaptopTitle = TestUtil.LaptopTitle().getAttribute("innerHTML").trim();
		  	assertEquals(actualLaptopTitle, TestUtil.expectedLaptopTitle);
		}
	  
	  @Test
	  public void sortByLaptopItemsVerify() throws InterruptedException{
		  
		  
		  System.out.println(TestUtil.driver.findElement(By.xpath("/html/body/div/div/div/section/div/div[1]/div[1]/div[1]/div/div[1]")));
		  
		  
		  List<String> afterItems = new ArrayList<String>();
		  afterItems.add(0, "DELL Inspiron 15 7000 15.6");
		  afterItems.add(1, "MICROSOFT Surface Pro 4 & Typecover - 128 GB");
		  afterItems.add(2, "DELL Inspiron 15 5000 15.6");
		  
		  List<String> beforeItems = new ArrayList<String>();
		  
		  System.out.println("...466:  "+ TestUtil.sortLaptopItems());
		  
		  beforeItems.addAll(TestUtil.sortLaptopItems());
		  
		  for(int i=0; i<beforeItems.size();i++){
			  assertEquals(beforeItems.get(i),afterItems.get(i));
			}
	  	}
	  
	  /*
	  @Test
	  public void comparingCostDellBetweenListAndDetail(){
//		  TestUtil.LaptopClick();
		  
		  String dellActualCostListPage = TestUtil.readListCostDell();
		  String dellActualCostDetailPage = TestUtil.readDetailCostDell();
		
		  assertEquals(dellActualCostListPage, TestUtil.expecteddellCost);
		  assertEquals(dellActualCostDetailPage, TestUtil.expectedellCost);
		  
	  
	  /*
	  @Test
	  public void addToCartErrorAndEmpty(){
		  String actualErrorMsg = TestUtil.addToCartVerifyError();
		  assertEquals(actualErrorMsg, TestUtil.expectedAddToCartErrorMsg);
		  String actualEmptyMsg = TestUtil.emptyCart();
		  assertEquals(actualEmptyMsg, TestUtil.expectedAddToCartEmptyMsg);
	  }
	  /*
	  @Test
	  public void popUpWindowAddToCompare() throws InterruptedException {
		  	TestUtil.addToCompare();
		    for (String handle : TestUtil.driver.getWindowHandles())
		    {
			  TestUtil.driver.switchTo().window(handle);
		    }
		    
		    TestUtil.popupWindow();
		    Thread.sleep(1000);
		   
		    try{
		    	assertEquals(TestUtil.compareLaptop1, TestUtil.insidePopupLaptop1);
			   } catch (Exception e) {
			    	e.printStackTrace();	    	
			   }	
		    
		    try{	    	
		    	assertEquals(TestUtil.compareLaptop2, TestUtil.insidePopupLaptop2);
			   } catch (Exception e) {
			    	e.printStackTrace();	    	
			   }	
		    	    
		    TestUtil.driver.findElement(ByXPath.xpath("//*[@id='top']/body/div/div[2]/button/span/span")).click();
		    for (String handle : TestUtil.driver.getWindowHandles())
		    {
		    	TestUtil.driver.switchTo().window(handle);
		    }	    
	  	}
		
	  @Test
	  public void accountVerify() throws InterruptedException{
		  String welcome = TestUtil.accountVerify();
		  assertEquals(welcome, TestUtil.name.toUpperCase());
	  }
	  */

	  @AfterMethod
	  public void tearDown() {
		  TestUtil.driver.close();
	  }

	}


