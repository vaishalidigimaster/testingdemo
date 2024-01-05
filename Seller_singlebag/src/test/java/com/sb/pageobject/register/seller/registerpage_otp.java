package com.sb.pageobject.register.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage_otp {
private WebDriver driver;
	
	
	@FindBy(xpath  ="//input[@name='otp_verify']")
	private WebElement enter_otp;
     @FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement otp_submit;
	@FindBy(xpath="//span[contains(text(),'Resend')]")
      private WebElement otp_resend;
	@FindBy(xpath  ="//p[contains(text(),'OTP has been sent to ')]")
	private WebElement email_msg;
	
	//error
	@FindBy(xpath  ="//label[@id='local-error']")
	private WebElement error_message;
	
	
	public registerpage_otp(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	public void veriy_otp() {
		
		otp_submit.click();
		
	}
	
	public void emailsent_msg() {
		String emailtext=email_msg.getText();
		System.out.println(emailtext);
	}
	public void resend() {
		otp_resend.click();
		
	}
}






