package com.sb.pageobject.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sb.baseclass.Baseclass;

public class settings_userterms extends Baseclass {
	//driver initialize

    private WebDriver driver ;

   

    //create constructor

    public settings_userterms (WebDriver driver) {

                  this.driver=driver;

                  PageFactory.initElements(driver, this);

                  }
    
    //click settingstab
    @FindBy(xpath="(//span[@class='menu-title text-truncate'])[8]")
    private WebElement settings;
    
    //click usertermstab
    @FindBy(xpath="(//span[@class='menu-item text-truncate'])[12]")
    private WebElement userterms;
    
    //capture usertermtxt
    @FindBy(xpath="//h2[text()='User Terms']")
    private WebElement usertermtxt;
    
    //enter link
    @FindBy(xpath="//input[@name='term']")
    private WebElement usertermlink;
    
    //click submittab
    @FindBy(xpath="(//button[@type='submit'])[2]")
    private WebElement submit;
    
    //updatemessage
    @FindBy(xpath="//li[text()='User Terms Created Successfully']")
    private WebElement updatemessage;
    
    
   
    
    
    
    
    
    
    
    
    
    
    //Methods
    public void click_settings() {
 	   settings.click();
    }
    
//    public void clickuserterms() {
// 	   ((JavascriptExecutor) driver).executeScript("arguments[0].click();",userterms);
//
//    }
    public void captureusertermtxt() {
 	   System.out.println(usertermtxt.getText());
    }
    public void usertermlink(String link) {
 	   usertermlink.clear();
 	   usertermlink.sendKeys(link);
    }
    public void submitbutton() {
 	   submit.click();
    }

//    public void updated_message(String  pagename) {
//
//        String message= driver.findElement(By.xpath("//li[text()='"+pagename+" Updated !!']")).getText();
//
//       
//
//        System.out.println(message);
//
//}
    public void update_message(String getmessage ) {
 	   String message=driver.findElement(By.xpath("//li[text()='"+getmessage+"Updated !!']")).getText();
        System.out.println(message);
    
    }
    
    public void errormessage() {
 	   System.out.println(userterms.getAttribute("validationMessage"));

 	   
    }
}



