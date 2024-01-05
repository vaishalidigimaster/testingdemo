package com.sb.pageobject.register.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerpage_language {
	private WebDriver driver;
	
	
	@FindBy(xpath  ="//select[@name='local']")
	private WebElement language;
	@FindBy(id ="skip6")
	private WebElement skip_in_slang;
	@FindBy(id ="prev6")
	private WebElement back_in_slang;
	@FindBy(xpath  ="//span[contains(text(),'Submit')]")
	private WebElement submit;
	
	//error
	@FindBy(xpath  ="//label[@id='local-error']")
	private WebElement error_message;
	@FindBy(xpath ="//h2[@id='swal6-title']")
	private WebElement success;
	
	
	public registerpage_language(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//store language
	public void store_language(String chooselang) {
	Select selectlang = new Select(language);
	selectlang.selectByVisibleText(chooselang);
	
	}	
	public  void submit_button() {
		submit.click();
	}
	public  void store_language_back() {
		back_in_slang.click();
	}
	public  void store_language_skip() {
		skip_in_slang.click();
	}

	public void store_language_errormessage() {
		String err_message=error_message.getText();
		System.out.println(err_message);
	}
	public void store_language_successmessage() {
		String success_msg=success.getText();
		System.out.println(success_msg);
	}
}

