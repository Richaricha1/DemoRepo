package qa.test.suite;


import org.testng.annotations.Test;

import cart.Cart;
import category.Category;
import home.Home;
import login.LogOut;
import login.Login;
import qa.util.DBUtil;
import qa.util.EcommerceUtil;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class EcommTestNGSuite1 {

	WebDriver driver;
	
	@BeforeMethod
	public void init() {
		driver = EcommerceUtil.getDriver();
	}
	 
	/*
	@Test
	public void testsuite1() {
		Login.login(driver);
		LogOut.logout(driver);
		Cart.cart(driver);
		Category.category(driver);
		Home.getTextOfMovingImage();

	}

	@Test
	public void testsuite2() {
		
		
		int expectedCategoryItemCount = DBUtil.getCategoryCount();
		
		int actualCategoryItemCount = Category.countCategoryItems(driver);
		
		assertEquals(expectedCategoryItemCount, actualCategoryItemCount);
		
	}
	
	
	// this test suit is for Laptop
	
	@Test
	public void testsuite3() throws InterruptedException {
		
		
		int expectedLaptopItemCount = DBUtil.getLaptopCount();// get the total from DB
		
		int actualLaptopItemCount = Category.countLaptopsItems(driver); // get the total from UI
		
		System.out.println("expectedLaptopItemCount    :"+expectedLaptopItemCount);
		System.out.println("actualLaptopItemCount     :"+actualLaptopItemCount);
		
		assertEquals(expectedLaptopItemCount, actualLaptopItemCount);
		
	
		@Test
		public void testsuite4() throws InterruptedException {
			
			
			int expectedDesktopItemCount = DBUtil.getDesktopPcCount();// get the total from DB
			
			int actualDesktoptemCount = Category.countDesktopItems(driver); // get the total from UI
			
			System.out.println("expectedDesktopItemCount    :"+expectedDesktopItemCount);
			System.out.println("actualDesktopItemCount     :"+actualDesktoptemCount);
			
			assertEquals(expectedDesktopItemCount, actualDesktoptemCount);
			
		}
		
		
		
			@Test
			public void testsuite5() throws InterruptedException {
				
				
				int expectedTabletItemCount = DBUtil.getTabletsCount();// get the total from DB
				
				int actualTabletItemCount = Category.countTabletItems(driver); // get the total from UI
				
				System.out.println("expectedTabletItemCount    :"+expectedTabletItemCount);
				System.out.println("actualTabletItemCount     :"+actualTabletItemCount);
				
				assertEquals(expectedTabletItemCount, actualTabletItemCount);
			}		
				
		*/		
		@Test
		public void testsuite6() throws InterruptedException {
					
			List ActualPholeLabelList = Category.countPhoneItems(driver);
			
			System.out.println("ActualPholeLabelList="+ActualPholeLabelList);
			
			List expectedPhoneLabelList = new ArrayList();
			
			expectedPhoneLabelList.add("Samsung Note 8\n$ 829.00");
			expectedPhoneLabelList.add("Samsung Galaxy S9+ [128 GB]\n$ 889.99");
			
			
			System.out.println("ActualPholeLabelList="+ActualPholeLabelList);
			//System.out.println("expectedPhoneItemCount    :"+expectedPhoneItemCount);
			//System.out.println("actualPhoneItemCount     :"+actualPhoneItemCount);
					
			assertEquals(expectedPhoneLabelList, ActualPholeLabelList);
					
				
			
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
