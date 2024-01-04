package Adminpanel.Storefront;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	public static WebDriver chromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	return driver;
	}
	
	//edge
//	public static WebDriver driver2;
	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		return driver;
		
	}

	//url Launch

	public static void urlLaunch(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	}

	//wait

	public static void Wait() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	
	//sendkeys
	
	public static void sendkyes(WebElement e,String value) {
    e.sendKeys(value);		
		
		
	}

	//quit

	public static void quit() {
	       driver.quit();
	}
	
//	//sendkeys2
//	
//	public static void sendkeys2(By String, String Value) {
//		WebElement element = driver.findElement(String);
//		element.sendKeys("Value");
//		
//	}
//
//	//click
//
//	public static void click(By String) {
//	 WebElement click= driver.findElement(String);
//	      click.click();
//	}
	
	//click2
	public static void click2(WebElement e) {
		e.click();

	}
	
	//gettitle
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
		
	}
	
	//getText
	
	public static String getText(WebElement e) {
	    String text = e.getText();
	    return text;
		
		
	}

    //getAttribute
	
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
	
	//movetoelement
	
	public static void moveToElement(WebElement e) {
		Actions s=new Actions(driver);
		s.moveToElement(e).perform();
	}
	
	//drag and drop
	
	public static void dragAndDrop(WebElement src, WebElement tar) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, tar).perform();
	}
	
	//SelectbyIndex
	
	public static void SelectByIndex(WebElement e, int a) {
		Select s=new Select(e);
		s.selectByIndex(a);
	}
	
	//take screenshot
	
	public static void takescreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File srcfile = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(srcfile);
		
		Date d=new Date();
		int filename = d.getSeconds();
		
		File destifile=new File("C:\\Users\\Singlebag\\Downloads\\Gayathri\\eclipse-committers-oxygen-3a-win32-x86_64 16-02-2023 18_15_10_354\\eclipse\\configuration\\New folder\\SinglebagRegressionTesting\\Screenshot\\"+filename+".png");
		FileUtils.copyFile(srcfile, destifile);	

		
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
//        
//        Date d=new Date();
//		String filename = d.getSeconds();
//		
//
//        File destFile = new File(filename);
//        FileHandler.copy(sourceFile, destFile);

	}
	
	
	
	
	
	
	
	
	
	
	
	


}
