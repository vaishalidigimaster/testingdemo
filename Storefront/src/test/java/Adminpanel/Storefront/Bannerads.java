package Adminpanel.Storefront;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bannerads extends Baseclass {
	
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
		
            JavascriptExecutor js=(JavascriptExecutor)driver;
		
		    driver.findElement(By.xpath("(//a[@tabindex='0'])[2]")).click();
		
		    driver.findElement(By.xpath("(//div[@class='sort-by-product-wrap'])[1]")).click();
			
			Wait();
			
			driver.findElement(By.xpath("//a[contains(text(),'50')]")).click();
			
			Wait();
			
	        driver.findElement(By.xpath("(//div[@class='sort-by-product-wrap'])[1]")).click();
	        
			Wait();
		
			driver.findElement(By.xpath("//a[contains(text(),'100')]")).click();
			
			Wait();

	        driver.findElement(By.xpath("(//div[@class='sort-by-product-wrap'])[1]")).click();
			
			Wait();

			driver.findElement(By.xpath("//a[contains(text(),'All')]")).click();
			
			Wait();

			driver.findElement(By.xpath("(//div[@class='sort-by-product-wrap'])[2]")).click();
			
			Wait();

			driver.findElement(By.xpath("//a[contains(text(),'Sort by new Items')]")).click();
			
			Wait();

			driver.findElement(By.xpath("(//div[@class='sort-by-product-wrap'])[2]")).click();
			
			Wait();

			driver.findElement(By.xpath("//a[contains(text(),'Sort by old Items')]")).click();
			
			Wait();

			driver.findElement(By.xpath("(//div[@class='sort-by-product-wrap'])[2]")).click();
			
			Wait();

			driver.findElement(By.xpath("(//div[@class='product-img product-img-zoom mb-25'])[1]")).click();
			
			Wait();

			driver.findElement(By.xpath("(//a[@tabindex='0'])[1]")).click();
			
			Wait();

			driver.findElement(By.xpath("//a[contains(text(),'Description')]")).click();
			
			Wait();
			
			driver.findElement(By.xpath("//a[contains(text(),'Additional info')]")).click();
			
			Wait();

			driver.findElement(By.xpath("//a[contains(text(),'Review')]")).click();
			
			Wait();

//			driver.findElement(By.xpath("//a[@class='default-btn btn-md']")).click();
//			
//			Wait();
	//
//			driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("gayuravi03080.1@gmail.com");
//			
//			Wait();
	//
//			driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("12345678");
//			
//			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			
//			driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
//			
//			driver.findElement(By.xpath("//a[contains(text(),' Orders')]")).click();
//			
			WebElement option1 = driver.findElement(By.xpath("(//input[@name='option[231]'])[1]"));
			js.executeScript("arguments[0].click()", option1);
			
//			WebElement option2 = driver.findElement(By.xpath("(//input[@name='option[889]'])[1]"));
//			js.executeScript("arguments[0].click()", option2);
//			
			driver.findElement(By.xpath("//a[contains(text(),' Add to cart')]")).click();
			
	        Thread.sleep(4000);
		}
		
	        @Test
	        public void test2() throws InterruptedException {
	        
	        JavascriptExecutor js=(JavascriptExecutor)driver;

			WebElement carticon = driver.findElement(By.xpath("(//i[@class='icofont-shopping-cart'])[1]"));
			js.executeScript("arguments[0].click()", carticon);
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[contains(text(),'View cart')]")).click();
			
			js.executeScript("window.scrollTo(0,1000)");
			
			Wait();
			
			driver.findElement(By.xpath("//a[contains(text(),'Proceed To CheckOut')]")).click();
			
			driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Gayathri");
			
			driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("R");
			
			driver.findElement(By.xpath("//input[@name='delivery_address']")).sendKeys("VLS Illam");
			
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8925321680");
			
			driver.findElement(By.xpath("//input[@name='zip_code']")).sendKeys("609110");
			
			driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("se.llertest32@gmail.com");
			
	        driver.findElement(By.xpath("//span[@role='textbox']")).click();
	        
	        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Chennai");  
	        
	        Thread.sleep(5000);
	       
	        driver.findElement(By.xpath("//div[contains(text(),'Chennai')]")).click();
	       
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
			
		    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		    
		    Thread.sleep(5000);
		    
			driver.findElement(By.xpath("(//a[contains(text(),'Home')])[5]")).click();
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
