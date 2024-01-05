package com.sb.pageogbject.products.seller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sb.baseclass.Baseclass;

public class Productpage_productoptions extends Baseclass {
	

    //driver initialize

     public WebDriver driver;



    //constructor Initialize

    public Productpage_productoptions(WebDriver driver) {

         this.driver=driver;

         PageFactory.initElements(driver,this);    

         }

  //click create product options

    @FindBy(xpath="//span[contains(text(),'+create')]")

    private WebElement createoption;
    
    

    //click create product values

      @FindBy(xpath="//span[contains(text(),'+ create')]")

      private WebElement createvalues;
    
    
      //enter name of product options

      @FindBy(xpath="//input[@type='text']")

      private WebElement optionname;
      
      
    //click save

      @FindBy(xpath="//button[@type='submit']")

      private WebElement save;
      
      
      // click setting of options
    
      public void click_settingsofoptions( String name ) {
	    	
  		WebElement settings= driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[4]/a[1]"));
  	((JavascriptExecutor) driver).executeScript("arguments[0].click();",settings);
  								
  	 }	
   
    
    
   // click edit of options
      
      public void click_editofoptions( String name ) {
	    	
  		WebElement edit= driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[4]/a[2]"));
  	((JavascriptExecutor) driver).executeScript("arguments[0].click();",edit);
  								
  	 }	
    
    
// click edit of options values
      
      public void edit_optionsvalues( String name ) {
	    	
  		WebElement editvalue= driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[3]/a"));
  	((JavascriptExecutor) driver).executeScript("arguments[0].click();",editvalue);
  								
  	 }	
    
    
    
   // messagein top
  	@FindBy(xpath ="//h2[@id='swal2-title']")
  private WebElement message;
  									
  	// arrow to move up
  	@FindBy(xpath ="(//button[@type='button'])[5]")
  private WebElement arrowmoveup;
  	
  	
  	
  		//page title
  	 @FindBy(xpath  ="//h2[@class='content-header-title float-start mb-0']")
  		private WebElement pagetitle;
  	 
  	
  	//product options-navigate
  	 @FindBy(xpath  ="(//a[contains(text(),'Product Options')])[2]")
  		private WebElement productoption_navigate;		
  	 
  	//product options value-navigate from create
  	 @FindBy(xpath  =" //a[contains(text(),'Option Values')]")
  		private WebElement optionvalues_navigate;	
  	 
  	 
  	//product options value-navigate from edit
  	 @FindBy(xpath  =" //a[contains(text(),'Option Value')]")
  		private WebElement optionvalue_navigate;	
  	 
  	 		
  	//home title
	 @FindBy(xpath  ="//h2[@class='float-start mb-0']")
		private WebElement hometitle;
								
	 
	 // get home title
		public void gethometitle() {
			System.out.println(hometitle.getText());
	 } 
	 
  	 //navigate click product option
		public void productoption_navigate() {						 		 
			productoption_navigate.click();
		  		}
		
		
		//navigate click  option value-create
		public void optionvalues_navigate() {						 		 
		  	optionvalues_navigate.click();
		  		}
  	 
		//navigate click  option values -edit
				public void optionvalue_navigate() {						 		 
				  	optionvalue_navigate.click();
				  		}
		
		
		
  	public void getmessage() {						 		 
  	System.out.println(message.getText());
  		}
  			
  	
  	 // get page title
  	public void getpagetitle() {
  		System.out.println(pagetitle.getText());
   }
    
 // click create -product options
   	public void click_create_options() {
   		createoption.click();
   		
    }
  
 // click create - options values
   	public void click_create_optionsvalue() {
   		createvalues.click();
   		
    }
   	
   	
 

   	// click save
   	public void click_save() {
   		save.click();
   		
    }	
   	
   	
 // enter name
   	public void enter_name(String name) {
   		optionname.clear();
   		optionname.sendKeys(name);
   		
    }	
   	
   	
  //Product option name validation message.
    public void optionname_errormessage() {     
    System.out.println("Product option name is not entered. "+optionname.getAttribute("validationMessage"));
         }	
   	
   	
  //Product option value name validation message.
    public void optionnamevalue_errormessage() {     
    System.out.println(" option value name is not entered. "+optionname.getAttribute("validationMessage"));
         }	
    
    public void clickhome() {

   	 driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

   	}
   	
}
