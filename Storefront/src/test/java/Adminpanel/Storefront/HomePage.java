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

public class HomePage extends Baseclass {
	

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
	
	    driver.findElement(By.xpath("(//a[contains(text(),'Studio Design')])[1]")).click();
	    
	    Wait();
	    
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();
	    
	    Wait();
	    
	    driver.findElement(By.xpath("(//a[contains(text(),'Design Source')])[1]")).click();
	    
	    Wait();
	    
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();
	    
	    Wait();
	  
	    driver.findElement(By.xpath("(//i[@class='icofont-search'])[1]")).click();
	    
	    Wait();
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("po");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//div[@class='product-item-info-top']")).click();
	    
	    Wait();
	    
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();
	    
	    Wait();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	    
        Wait();
	    
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();
	    
	    Wait();
	    
	}
	
	@Test
	public void test2() throws InterruptedException {
	    
	    driver.findElement(By.xpath("(//a[contains(text(),'Register')])[1]")).click();
	    
	    Wait();
	    
	    WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    firstname.sendKeys("Gayathri");
	    
	    WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	    lastname.sendKeys("R");
	    
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys("gayude.epi73@gmail.com");
	    
	    WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	    password.sendKeys("12345678");
	    
	    WebElement confirmpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    confirmpass.sendKeys("12345678");
	    
	    WebElement tc = driver.findElement(By.xpath("//a[contains(text(),'terms and conditions')]"));
	    tc.click();
	    
	    Thread.sleep(5000);
	    
	    driver.navigate().back();
	    
	    Thread.sleep(5000);
	    
	    WebElement checkbox = driver.findElement(By.xpath("//span[contains(text(),'I agree with the ')]"));
	    checkbox.click();
	    
	    Thread.sleep(3000);
	    
	    WebElement signup = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
	    signup.click();
	    
	}
	
	@Test
	public void test3() throws InterruptedException {
		
        JavascriptExecutor js=(JavascriptExecutor)driver;
	    
        driver.findElement(By.xpath("(//a[contains(text(),'Home')])[5]")).click();

	    Thread.sleep(3000);
	    
        driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();
	    
	    Wait();

	    driver.findElement(By.xpath("(//a[contains(text(),'Click')])[1]")).click();
	    
	    Wait();
	    
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();
	    
	    Wait();
	    
	    driver.findElement(By.xpath("(//button[@role='tab'])[2]")).click();
	    
	    Wait();
	    
	    WebElement slider = driver.findElement(By.xpath("(//a[contains(text(),'Click')])[1]"));
	    js.executeScript("arguments[0].click()",slider);
	    
        driver.findElement(By.xpath("(//a[contains(text(),'Home')])[5]")).click();
	    
	    Wait();
       
        driver.findElement(By.xpath("(//button[@role='tab'])[1]")).click();
        
        Wait();
        
        driver.findElement(By.xpath("(//div[@class='single-categories-5-img'])[2]")).click();
        
        Wait();
        
        driver.findElement(By.xpath("(//a[contains(text(),'Home')])[5]")).click();
        
        Wait();
        
        driver.findElement(By.xpath("(//a[@tabindex='0'])[3]")).click();
        
        Wait();
        
        driver.findElement(By.xpath("(//a[contains(text(),'Home')])[5]")).click();
        
        Wait();

	    driver.findElement(By.xpath("(//div[@class='product-img product-img-zoom mb-25'])[4]")).click();
	    
	    Wait();
	    
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();
	    
	    Wait();

		driver.findElement(By.xpath("//a[@class='btn-border-1 btn-ptb-3']")).click();
		
		Wait();
		
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();

	    Wait();
		
		driver.findElement(By.xpath("(//div[@class='product-img product-img-zoom mb-25'])[23]")).click();
		
		Wait();
		
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();
	    
	    Wait();
	}
	
	@Test
	public void test4() {
		
        JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.findElement(By.xpath("//a[contains(text(),'Trending Products')]")).click();
		
		Wait();
		
		js.executeScript("window.scrollTo(0,2000)");
		
		WebElement image = driver.findElement(By.xpath("(//div[@class='product-img product-img-zoom mb-25'])[24]"));
		js.executeScript("arguments[0].click()", image);
		
		Wait();
		
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();

	    Wait();
	    
		js.executeScript("window.scrollTo(0,2000)");
		
		driver.findElement(By.xpath("//a[contains(text(),'Recently added')]")).click();
				
//		Wait();
//		
//		driver.findElement(By.xpath("(//div[@class='product-img product-img-zoom mb-25'])[22]")).click();
//
//		Wait();
		
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();

	    Wait();
	    
		js.executeScript("window.scrollTo(0,2000)");
		
		driver.findElement(By.xpath("//a[contains(text(),'Top Rated')]")).click();
		
		Wait();
		
		js.executeScript("window.scrollTo(0,2000)");
		
		Wait();
		
		driver.findElement(By.xpath("(//div[@class='single-brand-logo'])[9]")).click();
		
		Wait();
		
		js.executeScript("window.scrollTo(0,2000)");
		
		Wait();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Shipping Policy')])[1]")).click();
		
		Wait();
		
		driver.navigate().back();
		
		Wait();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Delivery agent')])[1]")).click();
		
		Wait();
	}
	
	@Test
	public void test5() throws InterruptedException {
		
        JavascriptExecutor js=(JavascriptExecutor)driver;

		driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[1]")).click();
		
		Wait();
		
		WebElement email2 = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email2.sendKeys("gayude.epi73@gmail.com");
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("12345678");
		
		Wait();
		
	    driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("(//div[@class='logo'])[2]")).click();
	    
	    driver.findElement(By.xpath("(//div[@class='product-img product-img-zoom mb-25'])[2]")).click();
        
        Wait();
        
        driver.findElement(By.xpath("(//a[@tabindex='0'])[1]")).click();
		
		Wait();

		driver.findElement(By.xpath("//a[contains(text(),'Description')]")).click();
		
		Wait();
		
		driver.findElement(By.xpath("//a[contains(text(),'Additional info')]")).click();
		
		Wait();

		driver.findElement(By.xpath("//a[contains(text(),'Review')]")).click();
		
		Wait();
		
		WebElement option1 = driver.findElement(By.xpath("(//input[@name='option[886]'])[1]"));
		js.executeScript("arguments[0].click()", option1);
        
		WebElement option2 = driver.findElement(By.xpath("(//input[@name='option[889]'])[1]"));
		js.executeScript("arguments[0].click()", option2);
        
        Wait();
        
        driver.findElement(By.xpath("//a[contains(text(),' Add to cart')]")).click();
		
        Thread.sleep(4000);
	}
	
        @Test
        public void test6() throws InterruptedException {
        
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
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gayude.epi73@gmail.com");
		
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
	    
	 @Test
	 
	 public void test7() throws InterruptedException {
		 
			
	        JavascriptExecutor js=(JavascriptExecutor)driver;
			
			urlLaunch("https://fashionbag.singlebag.com/");
			
			driver.findElement(By.xpath("(//img[@alt='logo'])[2]")).click();
			
			driver.findElement(By.xpath("(//a[contains(text(),'Click')])[1]")).click();
						
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

			driver.findElement(By.xpath("//a[contains(text(),'Sort by best selling')]")).click();
			
			Wait();

			driver.findElement(By.xpath("(//div[@class='product-img product-img-zoom mb-25'])[1]")).click();
			
			Wait();

			driver.findElement(By.xpath("(//a[@tabindex='0'])[1]")).click();
			
			Wait();

			driver.findElement(By.xpath("(//a[@tabindex='0'])[2]")).click();
			
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
			
			driver.findElement(By.xpath("//a[contains(text(),' Add to cart')]")).click();
			
	        Thread.sleep(4000);
	      
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
			
			driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
			
			driver.navigate().back();
			
			driver.findElement(By.xpath("//i[@class='fa fa-facebook']")).click();
			
			
			
			
			
			
			
			
			
			
			
			
		}		

	 
	 
		
		
		

		
		
		
		
		
		

}
