package com.sb.pageogbject.products.seller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;

public class Productpage_coupons extends Baseclass {

	private WebDriver driver;
	
	 public Productpage_coupons(WebDriver driver) {
	        this.driver = driver;  
	        PageFactory.initElements(driver, this);

	    }
	 
	
			// click overall checkbox
						@FindBy(xpath = "//input[@class='checkAll']")
					    private WebElement allcheckbox;

						// select overall actions
						@FindBy(xpath = "//select[@class='form-control']")
					private WebElement selectactions;
									
			// click submit of actions
			@FindBy(xpath = "(//button[@type='submit'])[2]")
			 private WebElement clicksubmit;
			
			// click create of actions
			@FindBy(xpath = "//span[contains(text(),'+create')]")
			private WebElement clickcreate;
									
			//enter title 
			@FindBy(xpath = "(//input[@type='text'])[1]")
			 private WebElement entertitle;				
		
									
			//enter code
			@FindBy(xpath = "(//input[@type='text'])[2]")
			private WebElement entercode;
									
			//enter expiry date
			@FindBy(xpath = "(//input[@type='text'])[3]")
			  private WebElement expirydate;
									
									
         //enter percentage
          @FindBy(xpath = "(//input[@type='number'])[1]")
		 private WebElement percentage;
									
          @FindBy(xpath  ="//input[@class='numInput cur-year']")
      	private WebElement expiryyear;
      	
      	@FindBy(xpath  ="//select[@class='flatpickr-monthDropdown-months']")
      	private WebElement expirymonth;
          
          
			//select status
		@FindBy(xpath="//span[@class='selection']")
		  private WebElement status;
		
		//click coupon button
	    @FindBy(xpath  ="//a[contains(text(),'Coupon')]")
		private WebElement clickcoupon_intop;
	    
	  //click  home button
	    @FindBy(xpath  ="//a[contains(text(),'Home')]")
		private WebElement clickhome_intop;
	    
	  //click coupon in top
	    public void click_couponintop() {
	    	clickcoupon_intop.click();
	 	   }
	    
	    // click home
	    public void click_home() {
	    	clickhome_intop.click();
	 	   }
	    
							        
		 //Click edit status
		  public void clickstatus() {
			  Actions a = new Actions(driver);
			  a.moveToElement(status).click().build().perform();
		  }				         

		 //edit to inactive
			 @FindBy(xpath = "//li[@role='option']")
		 private WebElement editstatusoptions;

	 //click inactive status
		 public void clickstatusoption(String status) {
							             
		 if(editstatusoptions.getText().equals(status)) {
			editstatusoptions .click();
		 }}
		
		 //click save 
		 @FindBy(xpath="(//button[@type='submit'])[2]")
		 private WebElement save;
								        
		 // messagein top
	@FindBy(xpath ="//h2[@id='swal2-title']")
private WebElement message;
										
		//page title
	 @FindBy(xpath  ="//h2[@class='content-header-title float-start mb-0']")
		private WebElement title;
	 
	//home title
		 @FindBy(xpath  ="//h2[@class='float-start mb-0']")
			private WebElement hometitle;
									
		 
		 // get home title
			public void gethometitle() {
				System.out.println(hometitle.getText());
		 } 
		 
		 
	 //click save 
	  public void clicksaveorupdate() {
	   save.click();
	}
									    
	public void getmessage() {
									 		 
	System.out.println(message.getText());
		}
									    
	 // get page title
	public void getpagetitle() {
		System.out.println(title.getText());
 }
									
									
	 public void click_partivularcheckbox( String title ) {
									    	
		WebElement selectattributecheckbox= driver.findElement(By.xpath("//td[contains(text(),'"+title+"')]/preceding-sibling::td/input"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",selectattributecheckbox);
								
	 }								 
									
	// click edit icon 
		public void clickediticon(String title) {
	WebElement edit= driver.findElement(By.xpath("//tr/td[2][contains(text(),'"+title+"')]/following-sibling::td[6]/a"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",edit);
	 }
		
		
		 public void click_overallcheckbox() {
			   allcheckbox.click();
		   }
		   
		   
		   public void selectaction(String action) {
			   selectactions.click();
			   Select s= new Select(selectactions);
			   s.selectByVisibleText(action);
			   
		   }
		   
		   
		   public void click_submitinactions() {
			  clicksubmit.click();
		   }
		   
		 //create 
		   public void click_create() {
				  clickcreate.click();
			   }
		   
		   
		 //enter title
		   public void entertitle( String title) {
			   entertitle.clear();
			   entertitle.sendKeys(title);
				 
			   } 
		  
		   
		 //enter code
		   public void entercode( String code) {
			   entercode.clear();
			   entercode.sendKeys(code);
				 
			   }
		   
		   
		   
		   public  void expiry_date(String year, String month, String date) {
				 
			   expirydate.click();
		         implicitwait();
		     // Select the desired year
		        expiryyear.clear();
		        expiryyear.sendKeys(year);
		         implicitwait();

		     // Select the desired month
		   expirymonth.click();
		     wait_for_visibilty(By.xpath("//option[text()='"+month+"']"));
		     WebElement monthOption1 = driver.findElement(By.xpath("//option[text()='"+month+"']"));
		     monthOption1.click();
		     //wait_for_visibilty(By.xpath("//option[text()='" + date + "']"));
		     // Select the desired date
		     WebElement date1 = driver.findElement(By.xpath("//span[text()='"+date+"']"));
		     date1.click();

		    }
		   
		 //enter percentage
		   public void enterpercentage( String code) {
			   percentage.clear();
			   percentage.sendKeys(code);
				 
			   }
		    
		   
		   
}
