package com.sb.pageobject.onlinestore.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onlinestorepage_Bannerads extends Onlinestorepage_Bumpads{
	//driver initialize
	private WebDriver driver;
	//create constructor
	public Onlinestorepage_Bannerads(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath = "//li[contains(text(),'Banner Deleted !!')]")
    private WebElement titlemessage2;
 
 // click sliders button in top
	@FindBy(xpath ="//a[contains(text(),'Banner Ads')]")
	private WebElement bannerad;
	
 
 public void gettitlemessage2() {
	  System.out.println(titlemessage2.getText());
    }
 public void clickbanneradbtn() {
	 bannerad.click();
    }
	
}
