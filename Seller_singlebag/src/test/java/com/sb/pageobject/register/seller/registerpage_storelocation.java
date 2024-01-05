package com.sb.pageobject.register.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sb.baseclass.Baseclass;

public class registerpage_storelocation extends Baseclass {
	
	private WebDriver driver;

	public registerpage_storelocation(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//store location
		
		@FindBy(name="address")
		private WebElement addressfield;
		@FindBy(name = "city")
		private WebElement cityfield;
		@FindBy(name = "state")
		private WebElement statefield;
		@FindBy(name = "zip_code")
		private WebElement postal_code;
		@FindBy(id ="skip4")
		private WebElement skip_in_sl;
		@FindBy(id ="prev4")
		private WebElement back_in_sl;
		@FindBy(xpath  ="(//span[contains(text(),'Next')])[3]")
		private WebElement next_in_sl;
		
		//error
		
				@FindBy(xpath="//label[@id='address-error']")
				private WebElement address_error;
				@FindBy(xpath="//label[@id='city-error']")
				private WebElement city_error;
				@FindBy(xpath="//label[@id='state-error']")
				private WebElement state_error;
				@FindBy(xpath="//label[@id='zip_code-error']")
				private WebElement pincode_error;
	public void store_location(String address,String city,String state,String pincode) {
		
	    addressfield.sendKeys(address);
	    cityfield.sendKeys(city);
	    statefield.sendKeys(state);
	    postal_code.sendKeys(pincode);
	    implicitwait();
	    next_in_sl.click();
	    
	}
	public void store_location_back() {
		back_in_sl.click();
	}
	public void store_location_skip() {
		skip_in_sl.click();
	}
	public void address_errormessage() {
		String err_message=address_error.getText();
		System.out.println(err_message);
	}
	public void city_errormessage() {
		String err_message=city_error.getText();
		System.out.println(err_message);
	}
	public void state_errormessage() {
		String err_message=state_error.getText();
		System.out.println(err_message);
	}
	public void pincode_errormessage() {
		String err_message=pincode_error.getText();
		System.out.println(err_message);
	}
}
