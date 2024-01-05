package com.sb.pageobject.onlinestore.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onlinestorepage_Bumpads extends Onlinestorepage_Sliders{
	//driver initialize
	private WebDriver driver;
	//create constructor
	public  Onlinestorepage_Bumpads (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	 @FindBy(xpath = "//li[contains(text(),'BumpAd Deleted !!')]")
	    private WebElement titlemessage1;
	 
	 // click sliders button in top
		@FindBy(xpath ="//a[contains(text(),'Bump Ads')]")
		private WebElement bumpad;
		
	 
	 public void gettitlemessage1() {
		  System.out.println(titlemessage1.getText());
	    }
	 public void clickbumpadbtn() {
		 bumpad.click();
	    }
	
}
