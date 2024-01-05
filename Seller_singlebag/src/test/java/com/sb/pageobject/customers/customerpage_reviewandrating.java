package com.sb.pageobject.customers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class customerpage_reviewandrating {

	//driver initialize
		private WebDriver driver;
		//create constructor
		public  customerpage_reviewandrating (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
	
		
		
		@FindBy(xpath="//h2[text()='Review & Ratings']")
		private WebElement capturetxt;
		
		@FindBy(xpath="(//input[@type='checkbox'])[2]")
		private WebElement allcheckbox;
		
		//status in review and rating page
		@FindBy(xpath="//select[@name='method']")
		private WebElement actionstatus;
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement submit;
		
	
		
		//statustab option
		@FindBy(xpath="//span[@role='combobox']")
		private WebElement clickstatustab;
		
		//statustab sendkeys
				@FindBy(xpath="//input[@role='searchbox']")
				private WebElement inputstatustab;
		
		
		
		//status tab of edit-active or inactive
		@FindBy(xpath="(//li[@role='option'])[1]")
		private WebElement status;
		
		
		// update of edit
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement update;
		
		//back to review
		@FindBy(xpath="//a[text()='Review']")
		private WebElement reviews;
		
		//click product
		@FindBy(xpath="//tr/td[4]/a")
		private List<WebElement> products;
		
		//message in right
		@FindBy(xpath ="//h2[@id='swal2-title']")
		private WebElement message;
		
		public void getmessage() {
			System.out.println(message.getText());
		}
		
		// capture review title
		public void ReviewsText() {
			System.out.println(capturetxt.getText());
		}
		
		public void clickallcheckbox() {
			allcheckbox.click();
		}
		
		
		public void selectAction(int index) {
			actionstatus.click();
			Select s=new Select(actionstatus);
			s.selectByIndex(index);
		}
		
		public void clicksubmit() {
			submit.click();
		}
		
		
		public void clickstatustab() {
			clickstatustab.click();
		}
		
		public void checkboxanyone(String name) {
			
			WebElement particularcheckbox = driver.findElement(By.xpath("//tr/td[text()='"+name+"']/preceding-sibling::td[4]"));
			
			particularcheckbox.click();
		}
		
		public void pencil_icon(String name) {
			WebElement pencilicon = driver.findElement(By.xpath("(//td[text()='"+name+"'])/following-sibling::td[4]/a/i"));
			
			pencilicon.click();
		}
		public void StatusEnablility(String cus_status) {
		if(cus_status.equals("Active")) {
			inputstatustab.sendKeys(cus_status);
			status.click();}
		else {
			inputstatustab.equals(cus_status);
			status.click();
		}
			
			
					}
			
			
		
		public void clickupdate() {
			update.click();
		}
		
		public void clickoneproduct(String productname) {
			
			for(WebElement product:products) {
				if(product.getText().equals(productname)) {
					((JavascriptExecutor) driver).executeScript("arguments[0].click();",product );
				    break;
				   
				    
					}
				
				 String currentpage= driver.getCurrentUrl();
				 System.out.println(currentpage);
			}}
			
	
		
		
		public void review() {
			reviews.click();
		}
		
		
		
	
	
}
