package Adminpanel.Storefront;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Categories extends Baseclass{
	
	@BeforeClass
    private void beforeClass() {
	    chromeBrowser();
		driver.manage().window().maximize();
		Wait();
		System.out.println("Before Class");
	}
	
	@AfterClass
	private void afterClass() {
		quit();
		System.out.println("After Class");
	}
	
	@BeforeMethod
	private void before() {
		System.out.println("Test Start.."+new Date());
		System.out.println("Before");
	}
	
	@AfterMethod
	private void after() {
		System.out.println("Test End.."+new Date());
		System.out.println("After");
	}
	
	@Test
	public void test1() throws InterruptedException {
		urlLaunch("https://fashionbag.singlebag.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
	}
}
