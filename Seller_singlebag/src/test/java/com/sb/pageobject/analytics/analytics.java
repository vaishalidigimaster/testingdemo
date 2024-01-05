package com.sb.pageobject.analytics;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;




public class analytics extends Baseclass {
	
     private WebDriver driver;

	        // Constructo
	        public analytics(WebDriver driver) {
	        
	            this.driver = driver;
	            PageFactory.initElements(driver, this);
	        }

	        
	        @FindBy(xpath = "//button[@type='submit']")
	        private WebElement submit;
	

	        //Earning performance dropdown
	        @FindBy(xpath = "//select[@class='form-select']")
	        private WebElement revenueDropdown;

	        //starting date
	        @FindBy(xpath  ="(//input[@class='form-control flatpickr-basic flatpickr-input'])[1]")
	        private WebElement startingdate;

	        //ending date
	        @FindBy(xpath  ="(//input[@class='form-control flatpickr-basic flatpickr-input'])[2]")
	        private WebElement endingdate;

	        @FindBy(xpath  ="(//input[@class='numInput cur-year'])[1]")
	        private WebElement startingyear;


	        @FindBy(xpath  ="(//input[@class='numInput cur-year'])[2]")
	        private WebElement endyear;


	        @FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[1]")
	        private WebElement startingmonth;


	        @FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[2]")
	        private WebElement endmonth;
	 

	        


	        // Click actions

	        public void clickSubmit() {
	            submit.click();
	        }

	        //starting date
	        public  void starting_date(String year, String month, String date) {             
	            startingdate.click();
	            implicitwait();

	        // Select the desired year
	           startingyear.clear();
	           startingyear.sendKeys(year);
	           implicitwait();

	
	        // Select the desired month
	           startingmonth.click();

	        // wait_for_visibilty(By.xpath("//option[text()='" + month + "']"));
	           WebElement monthOption = driver.findElement(By.xpath("(//option[text()='" + month + "'])[1]"));
	           monthOption.click();

	        // Select the desired date
	           WebElement dateCell = driver.findElement(By.xpath("(//span[text()='" + date + "'])[1]"));
	           dateCell.click();
	        }
        
	        //ending date
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


	        public void revenuedropdown() {
	        	
	        	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", revenueDropdown );
	           

	            Select s2= new Select(revenueDropdown);

	            s2.selectByIndex(1);

	            System.out.println(s2.getFirstSelectedOption().getText());

	 

	        }

	 

	 

	}

