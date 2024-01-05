package com.sb.pageobject.analytics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sb.baseclass.Baseclass;


public class dummy extends Baseclass {
	@Test
	public void browseropening() throws InterruptedException {
	browserlaunch("https://eautomarket.com/product-category/engine/");
	implicitwait();
	for(int i=0; i<=50;i++) {
	List<WebElement> product= driver.findElements(By.xpath("//ul[@id='loop-products']/li[2]/div/div/div[3]/div/div/h6/a"));
	
			 // List<String> textList = new ArrayList<>();
    // Iterate through the elements and extract their text
     for (WebElement products : product) {
      String productlist = products.getText();
      System.out.println(productlist);
      Thread.sleep(3000);
	         }
   //  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500)");
         driver.findElement(By.xpath("//a[@class='next page-numbers']")).click();
         Thread.sleep(3000);
      }
     
   
    
	}	
	
	
	
	
	
}
