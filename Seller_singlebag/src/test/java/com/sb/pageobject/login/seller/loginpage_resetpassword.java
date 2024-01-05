package com.sb.pageobject.login.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_resetpassword {
	private WebDriver driver;
	
	
	 //click password reset button 
    @FindBy(xpath="//button[@id='reset_click']")
    private WebElement clickpassresetbutton;

    //click backtosignin
    @FindBy(xpath="//a[contains(text(),'Back to Sign in')]")
    private WebElement clickbacktosignin;
  //email field
    @FindBy(xpath="//input[@name='email']")
    private WebElement emailfield;

    //invalid email id error
    @FindBy(xpath="//div[@role='alert']")
    private WebElement alertmsg;

   
	
	 public loginpage_resetpassword(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);

	    }
	 
	 //click back to sign in button
	    public void clickbacktosigninbutton() {
	        clickbacktosignin.click();

	    }
	    //click reset pass button
	    public void resetpassword() {
	    	
	        clickpassresetbutton.click();
	    }

	    public void iscorrectemail() {
	    	
	        if(driver.getPageSource().equals("We have emailed your password reset link!")) {
	        	System.out.println("Valid Email ID");
	        }
	        
	        else {
	        	System.out.println("Invalid Email ID");
	        }
	    }

	  
	    public void enteremailID(String emailId) {
	        emailfield.sendKeys(emailId);
	    }

	  
	    public void invalidemail_error() {
	        String err_message=alertmsg.getText();
	        System.out.println(err_message);       
	    }

	    public void validemail_success_msg() {
	        String success_message=alertmsg.getText();
	        System.out.println(success_message);       
	    }
	    
}
