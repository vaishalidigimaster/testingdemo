package com.sb.pageobject.order.seller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;

public class orderpage_transaction extends Baseclass{
private WebDriver driver;
	
	public orderpage_transaction(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	// input to search
	@FindBy(xpath  ="//input[@name='src']")
	private WebElement searchinput;
	
	//  search icon
		@FindBy(xpath  ="(//button[@type='submit'])[2]")
		private WebElement searchicon;
		
	//  search result
			@FindBy(xpath  ="(//tbody/tr)")
			private WebElement searchresult;
	
		
	//  click orderno.

		@FindBy(xpath  ="//tr/td[1]/a")
		private List<WebElement> ordernolist;
		
		// click customer name
		@FindBy(xpath  ="(//tr/td[4]/a)")
		private List<WebElement> customerlist;	
			
		// click update date name
				@FindBy(xpath  ="(//tr/td[3]/a)")
				private List<WebElement> update_date_list;	
				
				
				// click transaction id
				@FindBy(xpath  ="(//tr/td[2]/a)")
				private List<WebElement>  transactionidlist;
				
				// click transaction id method
				@FindBy(xpath  ="//select[@id='modalEditPaymentMethod']")
				private WebElement  paymentmethod;
				
				// click transaction id in edit
				@FindBy(xpath  ="//input[@name='transaction_id']")
				private WebElement  edit_transactionid;
				
				
				// click submit in edit
				@FindBy(xpath  ="(//button[@type='submit'])[3]")
				private WebElement  submit;
				
				
				// click close in edit
				@FindBy(xpath  ="(//button[@type='reset'])[2]")
				private WebElement  close;
				
				// check edit pg
				@FindBy(xpath  ="(//h1[contains(text(),'Edit')])")
				private WebElement  edittext;
				
				//title
				@FindBy(xpath  ="//h2[@class='content-header-title float-start mb-0']")
				private WebElement title;
				
				
				//error message below tab
				@FindBy(xpath  ="\"//input[@type='text']")
				private WebElement errormessage;
				
				
public void click_orderno(String order_no) {
	for (WebElement orderno : ordernolist) {
	if(orderno.getText().equals(order_no)) {
	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",orderno );
	    break;
	}}
}


public void click_customername(String name) {
	for (WebElement customer : customerlist) {
if(customer.getText().equalsIgnoreCase(name)) {
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", customer );
    break;
}}
}

public void click_transaction_id(String id) {
	
	((JavascriptExecutor) driver).executeScript("window.scroll(0, 1000);");
	WebElement page= driver.findElement(By.xpath("//li/a[contains(text(),'2')]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", page);
	
	for (WebElement transactionid : transactionidlist) {	
if(transactionid.getText().equals(id)) {
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", transactionid );
    break;
	}}
}

public void click_updatedate(String date) {
	for (WebElement update_date : update_date_list) {
        if (update_date.getText().equals(date)) {
        	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", update_date);
              break;
              
        	
        }
    }
}
       
          
	

public void search(String data) throws InterruptedException {
	searchinput.sendKeys(data);
	
}

public void searchicon() throws InterruptedException {
searchicon.click();
Thread.sleep(2000);
}

public void edit_text()  {
	String edit=edittext.getText();
	System.out.println(edit);
	
}
public void payment_method(String method)  {
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",paymentmethod);
	
	Select s= new Select(paymentmethod);
		s.selectByVisibleText( method);
System.out.println(s.getFirstSelectedOption().getText());
	
}

public void edit_transaction_id(String id)  {
	edit_transactionid.sendKeys(id);
	
}
public void submit()  {
	submit.click();
}

public void close()  {
	close.click();
}
public void getordertitle() {
	System.out.println(title.getText());
}
public void getcustomertitle() {
	System.out.println(title.getText());
}
public void getsearch_result() {
	System.out.println(searchresult.isDisplayed());
}


public void geterror_message() {
	String validation = errormessage.getAttribute("validationMessage");

	System.out.println(validation);
}
}
