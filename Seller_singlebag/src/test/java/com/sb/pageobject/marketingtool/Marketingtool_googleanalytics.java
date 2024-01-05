package com.sb.pageobject.marketingtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;

public class Marketingtool_googleanalytics  extends Baseclass{

	    //driver initialize
		private WebDriver driver ;
		
		//create constructor
		public Marketingtool_googleanalytics (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
		
		@FindBy(xpath="//span[text()='Marketing Tools']")
		private WebElement Marketingtools;
		
		@FindBy(xpath="//span[text()='Google Analytics']")
		private WebElement GoogleAnalyticstext;
		
		@FindBy(xpath="(//input[@type='text'])[1]")
		private WebElement GAMeasurementid;
		
		@FindBy(xpath="(//input[@type='text'])[2]")
		private WebElement Analyticsviewid;
		
		@FindBy(xpath="//select[@name='status']")
		private WebElement Enablestatus;
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement SaveChanges;
		
		@FindBy(xpath="//li[text()='Google Analytics Updated !!']")
		private WebElement updatemessage;
		
		//Google Tag manager

		@FindBy(xpath="//span[text()='Google Tag Manager']")
			private WebElement GoogleTagManager;


		public void clickGoogletagmanager() {
		    	GoogleTagManager.click();
		    }

		//Facebook Pixel;
		@FindBy(xpath="(//span[@class='fw-bold'])[3]")
			private WebElement FacebookPixel;

		public void clickfacebookpixel() {
				FacebookPixel.click();
			}

		//Whatsapp api;
		@FindBy(xpath="(//span[@class='fw-bold'])[4]")
			private WebElement whatsappapi;

		public void clickwhatsappapi() {
				whatsappapi.click();
			}


		public void updated_message(String  pagename) {
			 String message= driver.findElement(By.xpath("//li[text()='"+pagename+" Updated !!']")).getText();
			 
			System.out.println(message);
		}
		
		
		
	
		public void clickMarketingtools() {
			Marketingtools.click();
			
		}
		
		public void captureGAT() {
		System.out.println(GoogleAnalyticstext.getText());
		}
		
		public void enterGAMeasurementID(String GAMID) {
			GAMeasurementid.clear();
			GAMeasurementid.sendKeys(GAMID);
			
		}
		
		public void enterAnalyticsviewid(String AVID) {
			Analyticsviewid.clear();
			Analyticsviewid.sendKeys(AVID);
		}
		
		public void selectEnability( String status) {
			Enablestatus.click();
			Select s =new Select(Enablestatus);
			s.selectByVisibleText(status);
		}
		public void clicksavechanges() {
			SaveChanges.click();
		}
		}


