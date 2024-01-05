package com.sb.pageobject.shops.seller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sb.baseclass.Baseclass;

public class shoppage_myshops extends Baseclass{
private WebDriver driver;
	
	public shoppage_myshops(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	// check shopname to click switch store
		@FindBy(xpath = "//div[@class='user-info']/h5")
	    private WebElement storename;
	
		//  click switch store
				@FindBy(xpath = "//a[@class='role-edit-modal']/small")
			    private WebElement switchstorename;
		
			//  click switch store
							@FindBy(xpath = "//span[text()='Create Shop']")
						    private WebElement createstore;	
				
							
							//capture storename
							  public void capture_storename(String name) {
								if(storename.getText().equals(name)) {
									System.out.println("shop is present");
								}
							  }							
						    
//click createstore
  public void click_createstore() {
	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", createstore );
	  
  }
  
//click switchstore
  public void click_switchstore(String shopname) throws InterruptedException {
	  WebElement switchstore = driver.findElement(By.xpath("(//a[@href='/seller/switch-store?url=https://"+shopname+".pay380.com'])/small"));
	  
		  
	  switchstore.click();
		  Thread.sleep(3000);
		 System.out.println(driver.getCurrentUrl());
		 
	  }
	  
	
  
}
