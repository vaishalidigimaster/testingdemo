package com.sb.pageobject.login.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_verifyemail  {
	
	private WebDriver driver;
	
   
    @FindBy(xpath="//a[contains(text(),'I do not have an account yet ')]")
    private WebElement dontthaveanaccountlink;
	@FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
     //verify password field
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//span[@class='toggler']")
    private WebElement remember_me_Field;
     @FindBy(xpath="//span[@toggle='#password-field']")
      private WebElement eyebutton;
     @FindBy(xpath="//span[@type='password']")
     private WebElement passwordinvisible;
     @FindBy(xpath="//span[@type='text']")
     private WebElement passwordvisible;
     
   
    //click submit button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
  //Click forgot password
    @FindBy(xpath="//a[contains(text(),'Forgot Password')]")
    private WebElement clickforgotpass;
    
    //error
  //Invalid email and pass or without recaptcha

    @FindBy(xpath="//h2[@class=\"swal2-title\"]")
     private WebElement errormsg;
    
    
    public loginpage_verifyemail(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    
    
    //click don't have an account link
    public void click_Dont_have_an_accountLink() {
        dontthaveanaccountlink.click();
    }
    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void click_toggler_remember_me() {
    	remember_me_Field.click();
       
    }
    public void clickLoginButton() {
        loginButton.click();
    }
  //Click FOrgot pass
    public void clickFOrgotPassword() {
        clickforgotpass.click();
    }
  //InValid store name error msg  
    public void invalid_credential_error() {
        String err_message=errormsg.getText();
        System.out.println(err_message);        
    }

    public void eyebutton() {

        eyebutton.click();}
    
    public void password_visibility() {
if(passwordField.getAttribute("type").contains("text")) {
	System.out.println("Password is visible");
}
else if(passwordField.getAttribute("type").contains("password"))
{
	
	System.out.println("Password is not visible");
}
    	}
    
   
    
    
}
