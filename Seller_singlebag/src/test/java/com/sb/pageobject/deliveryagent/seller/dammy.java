 package com.sb.pageobject.deliveryagent.seller;  
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sb.baseclass.Baseclass;

import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.io.IOException;
 import java.net.HttpURLConnection;
 import java.net.URL;
 import java.util.Arrays;
 import java.util.List;
 import org.openqa.selenium.By;
 import java.util.ArrayList;

public class dammy extends Baseclass{
	
@Test
 public void browseropening()  {

 		browserlaunch("https://countrycode.org/");

 		implicitwait();

 		//  List<WebElement> namesList = new ArrayList<WebElement>();

 	        List<WebElement> countries = driver.findElements(By.xpath("//td/a"));
 	        List<WebElement> codes= driver.findElements(By.xpath("//td/span"));
 	       List<WebElement> iso= driver.findElements(By.xpath("//td[3]"));
  
// 	        for (WebElement country : countries) {
//
// 	            String countryName = country.getText();
// 	            System.out.println(countryName);
// 	        }

// 	       for (WebElement code1 : codes) {
//
//	            String c = code1.getText();
//	            System.out.println(c);
//	        }  

 	      for (WebElement code2 : iso) {
 	    	 
    	 	            String i1 = code2.getText();
    	 	            System.out.println(i1);
   	 	        } 
 	       
 	        }

  

}