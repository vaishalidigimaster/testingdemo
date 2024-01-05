package com.sb.pageobject.shops.seller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;

public class shoppage_createstore extends Baseclass {
private WebDriver driver;
	
	public shoppage_createstore(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement name;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement email;
    
    @FindBy(xpath = "//input[@name='mobile_number']")
    private WebElement mobileno;
  
    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement address;

    @FindBy(xpath = "//select[@name='shop_type']")
    private WebElement type;

   
    @FindBy(xpath = "(//input[@type='text'])[4]")
    private WebElement town;	

    @FindBy(xpath = "(//input[@type='text'])[5]")
    private WebElement state;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    private WebElement pincode;

    @FindBy(xpath = "//select[@name='language']")
    private WebElement language;

   

    @FindBy(xpath = "//textarea[@class='form-control']")
   private WebElement description;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement submitbtn;
    
    @FindBy(xpath = "//a[contains(text(),'My Shops')]")
    private WebElement myshop;
    
    @FindBy(xpath  ="//h2[@class='content-header-title float-start mb-0']")
	private WebElement title;
    
    @FindBy(xpath  ="//div[@class='alert-body']")
	private WebElement successmessage;
  
 
	
	
	//enter shopname	  
	  public void entershopname(String shopname)
	  {
		  name.sendKeys(shopname);
	  }
	  
	//enter email	  
	  public void emailid(String Email) {
		  email.sendKeys(Email);
	  }
	  
	  //enter Mobilenumber	  
	  public void mobilenumber(String townname) {
		  mobileno.sendKeys(townname);
	  }
	  
	//enter address	  
	  public void address( String adrs) {
		  address.sendKeys(adrs);
	  }
	  
	  
	//enter storetype	  
	  public void storetype( String types ) {
		  type.click();
		  Select s= new Select(type);
		  s.selectByVisibleText(types);
		  System.out.println(s.getFirstSelectedOption().getText());
	  }
	  
	//enter town	  
	  public void town(String townname) {
		  town.sendKeys(townname);
	  }
	  
	  
	//enter state	  
	  public void state(String statename) {
		  state.sendKeys(statename);
	  }
	  
	//enter pincode	  
	  public void pincode(String pin) {
		  pincode.sendKeys(pin);
	  }
	  
	//enter language	  
	  public void click_language(String lang) {
		  language.click();
		  Select s= new Select(language);
		  s.selectByVisibleText(lang);
		  System.out.println(s.getFirstSelectedOption().getText());
	  }
	  
	  
	  
		//enter description  
		  public void description(String text) {
			  description.sendKeys(text);
		  }
	  
		//click submit 
		  public void clicksubmit() {
			  wait_for_element_to_appear(By.xpath("(//button[@type='submit'])[2]"));
			  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitbtn );
		  }
		  
		//click myshops
		  public void clickmyshops() {
			 myshop.click();
		  }
		  
		  
		  
		  public void getmessage() {
				System.out.println(successmessage.getText());
			}
		  
		  public void errormessage( String text) {
			  String error = driver.findElement(By.xpath("//span[@id='signup-"+text+"-error']")).getText();
			  System.out.println(error);
		  }
 
		  public void errormessage_for_storetype() {
			  String error = driver.findElement(By.xpath("//label[@id='storeTypeSelect-error']")).getText();
			  System.out.println(error);
		  }
		  public void gettitle() {
				System.out.println(title.getText());
			}
		 
}


