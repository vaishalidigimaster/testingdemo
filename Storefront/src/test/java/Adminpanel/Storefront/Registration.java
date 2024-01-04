package Adminpanel.Storefront;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration extends Baseclass{
	
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
		
	    WebElement register = driver.findElement(By.xpath("(//a[contains(text(),'Register')])[1]"));
	    register.click();
	    
	    WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    firstname.sendKeys("Gayathri");
	    
	    WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	    lastname.sendKeys("R");
	    
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys("ravianbu0308001@gmail.com");
	    
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
	    
	    Thread.sleep(3000);
	    
	    WebElement emailverification = driver.findElement(By.xpath("//li[contains(text(),'The email has already been taken.')]"));
        boolean condition= emailverification.isDisplayed();
        
        System.out.println(condition);
    
	}
	    
}
