package com.sb.pageobject.register.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sb.baseclass.Baseclass;

public class registerpage_storedescription extends Baseclass {
	private WebDriver driver;

	public registerpage_storedescription(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//store description
		
		@FindBy(xpath ="//textarea[@name='shop_description']")
		private WebElement shop_description;
		@FindBy(id ="skip3")
		private WebElement skip_in_sd;
		@FindBy(id ="prev3")
		private WebElement back_in_sd;
		@FindBy(xpath  ="(//span[contains(text(),'Next')])[2]")
		private WebElement next_in_sd;
		
	//error
		
		@FindBy(xpath="//label[contains(text(),'This field is required.')]")
		private WebElement errormessage;
		
	public void store_description(String store_des) throws InterruptedException {
		shop_description.sendKeys(store_des);
        Thread.sleep(1000);
	    
	    }

	public void store_description_back() {
		back_in_sd.click();
	}
	public void store_description_skip() {
		skip_in_sd.click();
	}

	public void store_description_nextbtn() {
		next_in_sd.click();
	}
	
	public void store_description_errormessage() {
		String err_message=errormessage.getText();
		System.out.println(err_message);
	}
}

