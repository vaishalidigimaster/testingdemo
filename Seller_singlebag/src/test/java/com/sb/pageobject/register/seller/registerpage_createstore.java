package com.sb.pageobject.register.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;


public class registerpage_createstore extends Baseclass {
	
	private WebDriver driver;
	
	
	@FindBy(name="first_name")
	private WebElement firstnamefield;
	@FindBy(name = "last_name")
	private WebElement lastnamefield;
	@FindBy(name = "email")
	private WebElement emailfield;
	@FindBy(name = "mobile_number")
	private WebElement mobilenofield;
	@FindBy(name = "password")
	private WebElement pwdfield;
	@FindBy(name = "password_confirmation")
	private WebElement cfrmpwdfield;
	@FindBy(name = "shop_type")
	private WebElement shoptypefield;
	@FindBy(name = "shop_name")
	private WebElement shopnamefield;
	@FindBy(name = "agree")
	private WebElement agreebox;
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement next;
	
	
	// error
	@FindBy(xpath ="//h2[@id='swal2-title']")
	private WebElement error;
	@FindBy(xpath ="//div[contains(text(),'Shop name is not available.']")
	private WebElement existing_shopname;
	@FindBy(xpath ="//div[@class='shop-helper error-txt']")
	private WebElement invalid_shopname;
	
	public registerpage_createstore(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void register(String firstname,String lastname,String email,String mobileno,String password,String cfrmpassword,String shoptype,String shopname ) throws InterruptedException {
		// first page
		firstnamefield.sendKeys(firstname);
		lastnamefield.sendKeys(lastname);
		emailfield.sendKeys(email);
		mobilenofield.sendKeys(mobileno);
		pwdfield.sendKeys(password);
		cfrmpwdfield.sendKeys(cfrmpassword);
		shoptypefield.click();
		Select shoptype_dropdown=new Select(shoptypefield);
		shoptype_dropdown.selectByVisibleText(shoptype);
		shopnamefield.sendKeys(shopname);
		implicitwait();
		
	}
		
public void storecreate_error() {
	String err_message=error.getText();
	System.out.println(err_message);
}
public void shopname_error() {
	String err_message=existing_shopname.getText();
	System.out.println(err_message);
}
public void invalidshopname_error() {
	String err_message=invalid_shopname.getText();
	System.out.println(err_message);
}
public void agreebox() throws InterruptedException {
	agreebox.click();
    Thread.sleep(1000);
}
public void nextbtn() throws InterruptedException {
	next.click();

}}