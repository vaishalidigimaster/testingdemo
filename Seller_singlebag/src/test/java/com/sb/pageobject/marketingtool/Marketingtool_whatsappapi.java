package com.sb.pageobject.marketingtool;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class Marketingtool_whatsappapi {
	//driver initialize
		private WebDriver driver;
		//create constructor
		public Marketingtool_whatsappapi (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
		@FindBy(xpath="//span[text()='Marketing Tools']")
		private WebElement Marketingtools;
		
		@FindBy(xpath="(//span[@class=\"fw-bold\"])[4]")
		private WebElement WhatsappApitext;
		
		@FindBy(xpath="//input[@class=\"form-control\"]")
		private WebElement whatsappnumber;
		
		@FindBy(xpath="//select[@name='status']")
		private WebElement Enablestatus;
		
		@FindBy(xpath="(//textarea[@class=\"form-control\"])[1]")
		private WebElement Pretextproductpage;
		
		@FindBy(xpath="(//textarea[@class=\"form-control\"])[2]")
		private WebElement otherpagepretext;
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement SaveChanges;
		
		
		//methods
		public void clickMarketingtools() {
			Marketingtools.click();
			
		}
		public void captureWAPI() {
			System.out.println(WhatsappApitext.getText());
		}
		public void enterwhatsappnumber(String Whatsnum) {
			whatsappnumber.clear();
			whatsappnumber.sendKeys(Whatsnum);
		}
		public void enterpretextproduct(String pretext) {
			Pretextproductpage.clear();
			Pretextproductpage.sendKeys(pretext);
		}
		public void enterotherpage(String otherpage ) {
			otherpagepretext.clear();
			otherpagepretext.sendKeys(otherpage);
		}
	    
		
		public void selectEnability( String status) {
			
			Enablestatus.click();
			Select s =new Select(Enablestatus);
			s.selectByVisibleText(status);
		}
		public void clicksavechanges() {
			
			 ((JavascriptExecutor) driver).executeScript("arguments[0].click();",SaveChanges);
		}
		public void updated_message(String  pagename) {
			 String message= driver.findElement(By.xpath("//li[text()='"+pagename+" Updated !!']")).getText();
			 
			System.out.println(message);
		}
		
}
