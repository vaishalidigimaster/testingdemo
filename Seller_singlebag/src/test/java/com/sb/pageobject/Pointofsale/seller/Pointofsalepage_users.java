package com.sb.pageobject.Pointofsale.seller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pointofsalepage_users {
	//driver initialize
	private WebDriver driver;
	//create constructor
	public  Pointofsalepage_users (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	 @FindBy(xpath = "//span[contains(text(),'create')]")
	    private WebElement createuser;

	    @FindBy(xpath = "(//input[@type='text'])[1]")
	    private WebElement firstname;

	    @FindBy(xpath = "(//input[@type='text'])[2]")
	    private WebElement lastname;

	    @FindBy(xpath = "//input[@type='email']")
	    private WebElement email;

	    @FindBy(xpath = "//input[@name='password']")
	    private WebElement password;

	    @FindBy(xpath = "//select[@name='status']")
	    private WebElement statusincreate;

	 // messagein top
		@FindBy(xpath ="//h2[@id='swal2-title']")
		private WebElement message;

	    @FindBy(xpath = "(//button[@type='submit'])[2]")
	    private WebElement save;

	    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
	    private WebElement passwordcheckbox;

	    @FindBy(xpath = "(//button[@type='submit'])[2]")
	    private WebElement update;

	    @FindBy(xpath = "//a[contains(text(),'Users')]")
	    private WebElement usersbtn;
	    
	    //search bar
        @FindBy(xpath="//input[@id='src']")
        private WebElement searchbar;
	    
	  //search options
        @FindBy(xpath="(//button[@type='submit'])[2]")
        private WebElement searchicon;

        //click search icon
        @FindBy(xpath="//select[@class='form-select']")
        private WebElement searchoptions;

        //verify searched value
        @FindBy(xpath="//tbody//tr")
        private List<WebElement> verifysearchvalue;
        
        @FindBy(xpath="//span[@class='input-group-text cursor-pointer']")
        private WebElement eyebutton;
	    
	    
        public void eyebutton() {

            eyebutton.click();}
        
	    public void click_actions(String fullname) {
	    	WebElement action= driver.findElement(By.xpath("//tr/td[2][contains(text(),'"+fullname+"')]/following-sibling::td[5]/div/button[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",action);
	    }
	    
	    public void click_editactions(String fullname) {
	    	WebElement edit= driver.findElement(By.xpath("//tr/td[2][contains(text(),'"+fullname+"')]/following-sibling::td[5]/div/div/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",edit);
	    }
	    
	    
	    // click any email id of user
	    public void click_emailofuser(String id) {
	    	WebElement email= driver.findElement(By.xpath("//a[contains(text(),'"+id+"')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",email);
	    }
	    
	    
	    public void password_visibility() {
	    	if(password.getAttribute("type").contains("text")) {
	    		System.out.println("Password is visible");
	    	}
	    	else if(password.getAttribute("type").contains("password"))
	    	{
	    		
	    		System.out.println("Password is not visible");
	    	}}
	    
	    	//choosing search option
	         public void choosingsearchoptions(String Value) {

	        	 searchoptions.click();
	        	 Select s = new Select( searchoptions);
	        	 s.selectByVisibleText(Value);
	             
	         }
	         
	         //search bar
	         public void entervalueinsearch(String Source) {
	                searchbar.sendKeys(Source);
	         }
	         //click search icon
	         public void clicksearch() {
	             searchicon.click();
	         }
	         
	         //verify searched option
	         public void verifysearchedvalue() {
	           int size = verifysearchvalue.size();
	           System.out.println("Size of the result: " + size);  

	           for (int i = 0; i < size; i++) {
	               String resultText = verifysearchvalue.get(i).getText(); 
	               System.out.println(resultText);
	           }}
	    
	         
	         public void click_create() {
	        	 
	        	 createuser.click();
	         }
	    
	         
 public void enter_firstname(String name) {
	 firstname.clear();
	        	 
	        	 firstname.sendKeys(name);
	         }
 
 public void error_firstname() {
	 System.out.println(firstname.getAttribute("validationMessage"));
	        	
	         }
 
 
 public void error_lastname() {
	 System.out.println(lastname.getAttribute("validationMessage"));
	        	
	         }
 
 public void error_email() {
	 System.out.println(email.getAttribute("validationMessage"));
	        	
	         }
 
 public void error_password() {
	 System.out.println(password.getAttribute("validationMessage"));
	        	
	         }
 
 public void enter_lastname(String name) {
	 lastname.clear();
	 
	 lastname.sendKeys(name);
 }
 
 public void enter_email(String id) {
	 email.clear();
	 email.sendKeys(id);
 }
 public void enter_password(String pwd) {
	 
	password.sendKeys(pwd);
 }
 
 public void click_passwordcheckbox() {
	 
		passwordcheckbox.click();
	 }
 
 public void select_status(String status) {
	 statusincreate.click();
	 Select s= new Select(statusincreate);
	 s.selectByVisibleText(status);
	 System.out.println(s.getFirstSelectedOption().getText());
	
 }
 public void clicksave_update() {
	 
	save.click();
 }
 
 
 public void getmessage() {
	 
	System.out.println(message.getText());
 }
 
 //click users to go back
 public void clickusers() {
    usersbtn.click();}
    
  //page title
    @FindBy(xpath  ="//h2[@class='content-header-title float-start mb-0']")
	private WebElement title;
    
    // get page title
    public void getpagetitle() {
    	System.out.println(title.getText());
    }
 
}
