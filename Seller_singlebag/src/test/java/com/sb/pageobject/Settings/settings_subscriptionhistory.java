package com.sb.pageobject.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class settings_subscriptionhistory {
	//driver initialize

    private WebDriver driver ;

   //create constructor

    public settings_subscriptionhistory (WebDriver driver) {

                  this.driver=driver;

                  PageFactory.initElements(driver, this);

                  }
    
    //click settingstab
    @FindBy(xpath="(//span[@class='menu-title text-truncate'])[8]")
    private WebElement settings;
    
    //click subscriptionhistory
    @FindBy(xpath="(//span[@class='menu-item text-truncate'])[11]")
    private WebElement subscriptionhistory;
    
    //capture subscriptiontxt
    @FindBy(xpath="//h2[text()='Subscription History']")
    private WebElement subscriptiontxt;
    
    //capture subscriptiondetailstxt
    @FindBy(xpath="//h2[text()='Subscription Details']")
    private WebElement subscriptiondetailstxt;
    
    //click-view(Email)
    @FindBy(xpath="//b[text()='instamart@example.com']")
    private WebElement Email;
    
    //click-view(domain)
    @FindBy(xpath="//a[text()='instamart.pay380.com']")
    private WebElement domain;
    
    //click subscriptions
    @FindBy(xpath="//a[text()='Subscriptions']")
    private WebElement subscriptions;
    
    //Methods
    
    public void click_settings() {
  	   settings.click();
     }
    public void click_subscriptionhistory() {
    	subscriptionhistory.click();
    }
    public void capturesubscriptiontxt() {
    	System.out.println(subscriptiontxt.getText());
    }
    public void capturesubscriptiondetailstxt() {
    	System.out.println(subscriptiondetailstxt.getText());
    }
    //click-action
    
    public void clickaction(String order) {
    	WebElement action =driver.findElement(By.xpath("(//tr/td[text()='"+order+"']/following-sibling::td[7]/div/button)"));
    	action.click();
    	
    }
    
    //click-view
    public void clickview(String firstaction ) {
    	WebElement view=driver.findElement(By.xpath("//tr/td[text()='"+firstaction+"']/following-sibling::td[7]/div/div/a[1]"));
    	view.click();
    }
    
    //click store email
    public void clickstoreemail() {
    	Email.click();
    }
    
    //click store domain
    public void clickstoredomain() {
    	domain.click();
    	System.out.println(driver.getCurrentUrl());
    	
    }
    //click-download invoice
    public void clickdownloadinvoice(String secondaction) {
    	WebElement invoice=driver.findElement(By.xpath("//tr/td[text()='"+secondaction+"']/following-sibling::td[7]/div/div/a[2]"));
    	invoice.click();
    }
   //click subscriptions
    public void clicksubscriptions() {
    	subscriptions.click();
    }
    
    
    

}
