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

public class Loginpage extends Baseclass{
	
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
	
	@AfterMeth
	private void after() {
		System.out.println("Test End.."+new Date());
		System.out.println("After");
	}
	
	@Test
	public void test1() throws InterruptedException {
		urlLaunch("https://fashionbag.singlebag.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement login = driver.findElement(By.xpath("(//a[contains(text(),'Login')])[1]"));
		login.click();
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("gayuravi03080.1@gmail.com");
//		
//		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
//		password.sendKeys("0123456789");
//		
//		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		checkbox.click();
//		
//		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//		submit.click();
		
	}
		
	@Test
	public void test2() throws InterruptedException {	
		
		WebElement forgotpass = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));
		forgotpass.click();
		
		Thread.sleep(4000);
		
		WebElement email2 = driver.findElement(By.xpath("//input[@id='email']"));
		email2.sendKeys("gayuravi.030801@gmail.com");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		Thread.sleep(20000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("01234567");
		
		WebElement confirmpass = driver.findElement(By.xpath("//input[@id='password-confirm']"));
		confirmpass.sendKeys("01234567");
		
		WebElement submit3 = driver.findElement(By.xpath("//button[@type='submit']"));
		submit3.click();
		
		Thread.sleep(5000);
		
	}
	
	@Test
	public void test3() throws InterruptedException {
	
		Thread.sleep(3000);
		
		WebElement orders = driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
		orders.click();
		
		Thread.sleep(4000);
	    
		WebElement account = driver.findElement(By.xpath("//a[contains(text(),'Account details')]"));
		account.click();
		
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.clear();
		firstname.sendKeys("Gayathri");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.clear();
		lastname.sendKeys("Ravichandran");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@name='mobile']"));
		mobile.sendKeys("8925321680");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.clear();
		email.sendKeys("gayuravi.030801@gmail.com");
		
		WebElement currentpass = driver.findElement(By.xpath("//input[@name='password_current']"));
		currentpass.sendKeys("0123456789");
		
		WebElement newpassword = driver.findElement(By.xpath("//input[@name='password']"));
		newpassword.sendKeys("01234567");
		
		WebElement confirmpass = driver.findElement(By.xpath("//input[@name='password_confirmation']"));
		confirmpass.sendKeys("01234567");
		

    }
	
	@Test
	
	public void test4() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,200)");
		
		Thread.sleep(5000);
		
		WebElement logout = driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[3]"));
		js.executeScript("arguments[0].click()",logout);
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("gayuravi.030801@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		password.sendKeys("01234567");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		submit.click();
		
		Thread.sleep(5000);
		
		
		
		
	}
	
	
	
}
