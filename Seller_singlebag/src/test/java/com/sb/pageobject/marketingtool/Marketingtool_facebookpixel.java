package com.sb.pageobject.marketingtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Marketingtool_facebookpixel {
    //driver initialize
	private WebDriver driver;
	//create constructor
	public  Marketingtool_facebookpixel (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//span[text()='Marketing Tools']")
	private WebElement Marketingtools;
	
	@FindBy(xpath="(//span[@class=\"fw-bold\"])[3]")
	private WebElement FacebookPixelText;
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement YourpixelId;
	
	@FindBy(xpath="//select[@name='status']")
	private WebElement Enablestatus;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement SaveChanges;
	
	
	

	
	//methods
	public void clickMarketingtools() {
		Marketingtools.click();
		
	}
	
	public void captureFPT() {
		System.out.println(FacebookPixelText.getText());
	}
	
	public void enterpixelid(String FBID) {
		YourpixelId.clear();
		YourpixelId.sendKeys(FBID);
		
		
	}
	
	public void error_enterpixelid() {
		System.out.println(YourpixelId.getAttribute("validationMessage"));
		
		
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
