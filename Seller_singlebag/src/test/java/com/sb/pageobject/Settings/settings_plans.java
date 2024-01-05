package com.sb.pageobject.Settings;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class settings_plans {
	//driver initialize

    private WebDriver driver ;

   //create constructor

    public settings_plans (WebDriver driver) {

                  this.driver=driver;

                  PageFactory.initElements(driver, this);

                  }
    
    //click settingstab
    @FindBy(xpath="(//span[@class='menu-title text-truncate'])[8]")
    private WebElement settings;
    
    //click planstab
    @FindBy(xpath="(//span[@class='menu-item text-truncate'])[10]")
    private WebElement plans;
    
    //capture pricingplan
    @FindBy(xpath="//h2[text()='Pricing Plans']")
    private WebElement pricingplantxt;
    
    //capture basictxt
    @FindBy(xpath="//b[text()='BASIC']")
    private WebElement basictxt;
    
    //capture startuptxt
    @FindBy(xpath="//b[text()='START UP']")
    private WebElement startuptxt;
    
    //capture bussinesstxt
    @FindBy(xpath="//b[text()='BUSINESS']")
    private WebElement bussinesstxt;
    
    //click basicsubscribe
    @FindBy(xpath="(//a[@class='btn w-100 btn-primary mt-2 waves-effect waves-float waves-light'])[1]")
    private WebElement basicsubscribe;
    
    //click startupsubscribe
    @FindBy(xpath="(//a[@class='btn w-100 btn-primary mt-2 waves-effect waves-float waves-light'])[2]")
    private WebElement startupsubscribe;
    
    //click bussinesssubscribe
    @FindBy(xpath="(//a[@class='btn w-100 btn-primary mt-2 waves-effect waves-float waves-light'])[3]")
    private WebElement bussinesssubscribe;
    
    //capture Makepaymenttxt
    @FindBy(xpath="//h2[@class='content-header-title float-start mb-0']")
    private WebElement title;
    
    //enter mobile num
    @FindBy(xpath="(//input[@type='number'])[1]")
    private WebElement mobilenum;
    
    //click razorpay
    @FindBy(xpath="(//button[@type='submit'])[2]")
    private WebElement razorpaypayment;
    
    //click-basic-choose plan
    @FindBy(xpath="(//a[text()='Choose Plan'])[1]")
    private WebElement chooseplan;
    
    
    
    
    //click home
    @FindBy(xpath="//a[text()='Home']")
    private WebElement home;
    
    
    
  //error
    @FindBy(xpath="//div[@class='alert-body']")
    private WebElement error;
    
    
    
    
    
    
    
    
    
    
    
    //methods-click settings
    public void click_settings() {
 	   settings.click();
    }
    
    //click plans
    public void click_plans() {
    	plans.click();
    }
    
    public void capturepricingplantxt() {
    	System.out.println(pricingplantxt.getText());
    }
    
    public void capturebasictxt() {
    	System.out.println(basictxt.getText());
    }
    public void capturestartuptxt() {
    	System.out.println(startuptxt.getText());
    }
    public void capturebussinesstxt() {
    	System.out.println(bussinesstxt.getText());
    }
    public void click_basicsubscribe() {
    	basicsubscribe.click();
    	
    }
    public void click_startupsubscribe() {
    	startupsubscribe.click();
    }
    public void click_bussinesssubscribe() {
    	bussinesssubscribe.click();
    }
   
    public void entermobnum(String num) {
    	mobilenum.clear();
    	mobilenum.sendKeys(num);
    }
    public void clickrazorpaypayment() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",razorpaypayment);

    }
    public void clickchooseplan() {
    	
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",chooseplan);

    }
    public void clickhome() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",home);

    }
    public void makepayment(String num) {
    	
    	
    	
    	
    	if(title.getText().equals("Make Payment")) {
    	
    		entermobnum(num);
    		clickrazorpaypayment();
    		
    	}
    	else {
    		
    		System.out.println(error.getText());
    		System.out.println("user subcribed higher plan");
    	}
    	
    
    }
    
    public void chooseplan(String num) {
    	if(title.getText().equals("Make Payment")) {
    		clickchooseplan();
    	}
    	else {
    		System.out.println(error.getText());
    		System.out.println("user subcribed higher plan");

    	}
    }
    
}



