package com.sb.pageobject.onlinestore.seller;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onlinestorepage_SEO {

	//driver initialize
		private WebDriver driver;
		//create constructor
		public  Onlinestorepage_SEO (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
	}
		

	   
	    
	    @FindBy(xpath = "(//input[@type='text'])[2]")
	    private WebElement sitetitle;

	    @FindBy(xpath = "(//input[@type='text'])[2]")
	    private WebElement twittertitle;

	    @FindBy(xpath = "(//input[@type='text'])[3]")
	    private WebElement canonicalurl;

	    @FindBy(xpath = "(//input[@type='text'])[4]")
	    private WebElement tag;

	    @FindBy(xpath = "//textarea[@name='description']")
	    private WebElement description;

	    @FindBy(xpath = "(//button[@type='submit'])[2]")
	    private WebElement update;
	    
	 // messagein top
		@FindBy(xpath ="//h2[@id='swal2-title']")
	private WebElement message;
		
		public void getmessage() {
	 		 
			System.out.println(message.getText());
				}

	    public void set_sitetitle(String title) {
	    	sitetitle.clear();
	    	sitetitle.sendKeys(title);
	    }
	   
	    public void set_twitterTitle(String text) {
	        twittertitle.clear();
	        twittertitle.sendKeys(text);
	    }

	    public void setUrl(String text) {
	    	canonicalurl.clear();
	    	canonicalurl.sendKeys(text);
	    }

	    public void setTag(String text) {
	    	tag.clear();
	        tag.sendKeys(text);
	    }

	    public void setDescription(String text) {
	        description.clear();
	        description.sendKeys(text);
	    }

	    public void clickUpdate() {
	    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", update );
	    }
		
}
