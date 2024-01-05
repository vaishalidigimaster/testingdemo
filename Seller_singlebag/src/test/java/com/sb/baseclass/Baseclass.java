package com.sb.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
public static WebDriver driver;

 
public static  void browserlaunch(String url) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
}


public void teardown() {
	
         driver.quit();
    
}


public static void wait_for_element_to_appear(By findby) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(findby));
}


public static void wait_for_element_to_disappear(By findby) {
WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(30));
wait.until(ExpectedConditions.invisibilityOfElementLocated(findby));
}

public  static void wait_for_visibilty(By findby) {
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
 wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
}

public static void wait_for_presence(By findby) {
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
 wait.until(ExpectedConditions.presenceOfElementLocated(findby));
}

public static void implicitwait() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

public static void actions(WebElement ele) {
	Actions as= new Actions(driver);
	as.moveToElement(ele).click().perform();
}

public void javascript_executor(WebElement element) {
JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("arguments[0].click();", element);
}
public void uploadfile(String imagePath) throws AWTException, InterruptedException {
    
    Thread.sleep(5000);
    StringSelection selection = new StringSelection(imagePath);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    Robot r1 = new Robot();
    r1.keyPress(KeyEvent.VK_CONTROL);
    r1.keyPress(KeyEvent.VK_V);
    r1.keyRelease(KeyEvent.VK_V);
    r1.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(3000);
    r1.keyPress(KeyEvent.VK_ENTER);
    r1.keyRelease(KeyEvent.VK_ENTER);
}
public static void switchframe(WebDriver driver) {

	 driver.switchTo().frame(0);

 
}



public static void endframe(WebDriver driver) {

 driver.switchTo().defaultContent();

}


public void scroll() {

	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");

	}


public static void alertaccept() {

	driver.switchTo().alert().accept();

	}
}




