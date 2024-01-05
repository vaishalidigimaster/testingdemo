package com.sb.pageobject.marketingtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Marketingtool_googletagmanager {
	//driver initialize
		private WebDriver driver;
		//create constructor
		public Marketingtool_googletagmanager (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
		
		@FindBy(xpath="//span[text()='Marketing Tools']")
		private WebElement Marketingtools;
		
		@FindBy(xpath="//span[text()='Google Tag Manager']")
		private WebElement GTManagerText;
		
	    @FindBy(xpath="//input[@type='text']")
	    private WebElement GTManagerID;
	    
	    @FindBy(xpath="//select[@name='status']")
		private WebElement Enablestatus;
	    
	    @FindBy(xpath="(//button[@type='submit'])[2]")
	    private WebElement SaveChanges;
	    
	   
	     
	    //methods
	    public void clickMarketingtools() {
			Marketingtools.click();
			
		}
	    public void captureGTManagerText() {
	    	System.out.println(GTManagerText.getText());
	    }
	    public void enterGTManagerId(String GTMID) {
	    	GTManagerID.clear();
	    	GTManagerID.sendKeys(GTMID);
	    }
	    public void selectEnability( String status) {
			Enablestatus.click();
			Select s =new Select(Enablestatus);
			s.selectByVisibleText(status);
		}
	    public void clicksavechanges() {
	    	SaveChanges.click();
	    }
	    public void updated_message(String  pagename) {
			 String message= driver.findElement(By.xpath("//li[text()='"+pagename+" Updated !!']")).getText();
			 
			System.out.println(message);
		}
		
}
