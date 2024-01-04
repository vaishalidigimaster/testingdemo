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

public class orderpage_cancelled extends Baseclass {

	private WebDriver driver;
	
	public orderpage_cancelled(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	


	// filter icon
	@FindBy(xpath  ="//i[@class='ph-funnel-bold font-medium-3']")
	private WebElement filterfunnel;
	
	//payment status in filter
	@FindBy(xpath  ="//select[@id='payment_status']")
	private WebElement paymentstatus;
	
	//fulfillment
	@FindBy(xpath  ="//select[@id='status']")
	private WebElement fulfillment;
	
	//starting date
	@FindBy(xpath  ="//input[@id='start']")
	private WebElement startingdate;
	
	//ending date
	@FindBy(xpath  ="//input[@id='end']")
	private WebElement endingdate;
	
	//
	@FindBy(xpath  ="//a[contains(text(),'Clear Filter')]")
	private WebElement clearfilter;
	
	@FindBy(xpath  ="//button[contains(text(),'Filter')]")
	private WebElement filter;
	
	@FindBy(xpath  ="(//input[@class='numInput cur-year'])[1]")
	private WebElement startingyear;
	
	@FindBy(xpath  ="(//input[@class='numInput cur-year'])[2]")
	private WebElement endyear;
	
	@FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[1]")
	private WebElement startingmonth;
	
	
	@FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[2]")
	private WebElement endmonth;

	@FindBy(xpath  ="(//span[@class='flatpickr-day '])")
	private WebElement date;
	

	@FindBy(xpath  ="//input[@name='src']")
	private WebElement searchinput;

	@FindBy(xpath  ="//i[@class='ph-magnifying-glass-bold']")
	private WebElement searchicon;
	
	@FindBy(xpath  ="//tr/td[1]/a")
	private List<WebElement> ordernolist;
	
	@FindBy(xpath  ="//tr/td[2]/a")
	private List<WebElement> orderdatelist;
	
	@FindBy(xpath  ="//tr/td[3]")
	private List<WebElement> customerinfolist;
	
	@FindBy(xpath  ="//h2[@class='content-header-title float-start mb-0']")
	private WebElement title;
	
	
	public void filter_funnel() {
		filterfunnel.click();
	}
	public  void starting_date(String year, String month, String date) {
		 
	        startingdate.click();
                implicitwait();
	        // Select the desired year
                startingyear.clear();
                startingyear.sendKeys(year);
                implicitwait();

	        // Select the desired month
	        startingmonth.click();
	      //  wait_for_visibilty(By.xpath("//option[text()='" + month + "']"));
	        WebElement monthOption = driver.findElement(By.xpath("(//option[text()='" + month + "'])[1]"));
	        monthOption.click();
            //   wait_for_visibilty(By.xpath("//option[text()='" + date + "']"));
	        // Select the desired date
	        WebElement dateCell = driver.findElement(By.xpath("(//span[text()='" + date + "'])[1]"));
	        dateCell.click();

	    }
	
	public  void ending_date(String year, String month, String date) {
		 
		endingdate.click();
         implicitwait();
     // Select the desired year
         endyear.clear();
         endyear.sendKeys(year);
         implicitwait();

     // Select the desired month
     endmonth.click();
     wait_for_visibilty(By.xpath("(//option[text()='" + month + "'])[2]"));
     WebElement monthOption1 = driver.findElement(By.xpath("(//option[text()='" + month + "'])[2]"));
     monthOption1.click();
     //wait_for_visibilty(By.xpath("//option[text()='" + date + "']"));
     // Select the desired date
     WebElement date2 = driver.findElement(By.xpath("(//span[text()='" + date + "'])[2]"));
     date2.click();

    }
	
public void payment_status(String pstatus) {
	paymentstatus.click();
	Select s= new Select(paymentstatus);
	s.selectByVisibleText(pstatus);
	System.out.println(s.getFirstSelectedOption().getText());
}
public void fulfillment(String status) {
	fulfillment.click();
	Select s= new Select(fulfillment);
	s.selectByVisibleText(status);
	System.out.println(s.getFirstSelectedOption().getText());
}

public void clear_filter() {
	clearfilter.click();
}

public void filter() {
	filter.click();
	
}
 
public void search(String Orderno) {
	searchinput.sendKeys(Orderno);
	searchicon.click();
}

public void click_orderno(String order_no) {
	for (WebElement orderno : ordernolist) {
	if(orderno.getText().equals(order_no)) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",orderno );
	    break;
	}}}
	
	

public void click_orderdate(String order_date) {
	for (WebElement orderdate : orderdatelist) {
	if(orderdate.getText().equals(order_date)) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",orderdate );
	    break;
		}}
}

public void click_customer(String customer) {
	for (WebElement customerinfo : customerinfolist) {
	if(customerinfo.getText().equals(customer)) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",customerinfo );
	    break;
		}}
}
public void getordertitle() {
	System.out.println(title.getText());
}

public void getcustomertitle() {
	System.out.println(title.getText());
}
public void getfiltered_ordertitle() {
	System.out.println(title.getText());
}
public void cancelledordertitle() {
	System.out.println(title.getText());
}



















}



