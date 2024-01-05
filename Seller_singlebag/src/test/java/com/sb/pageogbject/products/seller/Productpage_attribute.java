package com.sb.pageogbject.products.seller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Productpage_attribute {
	private WebDriver driver;
	
	 public Productpage_attribute(WebDriver driver) {
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
						@FindBy(xpath = "(//button[@type='submit'])[3]")
					    private WebElement clicksubmitofattribute;
						
						
						// click create of actions
						@FindBy(xpath = "//span[contains(text(),'+create')]")
					    private WebElement clickcreateofattribute;
						
						//search bar
				        @FindBy(xpath="//input[@id='src']")
				        private WebElement searchbar;
					    
					  //search options
				        @FindBy(xpath="(//button[@type='submit'])[2]")
				        private WebElement searchicon;

				        //click search icon
				        @FindBy(xpath="//select[@class='form-control selectric']")
				        private WebElement searchoptions;

				        //verify searched value
				        @FindBy(xpath="//tbody//tr")
				        private List<WebElement> verifysearchvalue;
				        
				        
				      //enter name
				        @FindBy(xpath="//input[@type='text']")
				        private WebElement nameofattribute;
				        
				      //select featured
				        @FindBy(xpath="//select[@name='featured']")
				        private WebElement featuredofattribute;
				        
				      //select status
				        @FindBy(xpath="//span[@class='select2-selection__rendered']")
				        private WebElement statusofattribute;
				        
				        //Click edit status
				         public void clickstatus() {
				        	 statusofattribute.click();
				         }

				         //edit to inactive
				         @FindBy(xpath = "//li[@role='option']")
				         private WebElement editstatusoptions;

				         //click inactive status
				         public void clickstatusoption(String status) {
				             
				                   if(editstatusoptions.getText().equals(status)) {
				                	   editstatusoptions .click();
				                 }
				         }
				        
				        
				        
				        
				      //click save in attribute create
				        @FindBy(xpath="(//button[@type='submit'])[2]")
				        private WebElement saveofattribute;
				        
				     // messagein top
						@FindBy(xpath ="//h2[@id='swal2-title']")
						private WebElement message;
						
						//page title
					    @FindBy(xpath  ="//h2[@class='content-header-title float-start mb-0']")
						private WebElement title;
				        
				        
					  //click create of attribute values
					    @FindBy(xpath  ="//span[contains(text(),'+ create')]")
						private WebElement createofattributevalues;
					    
					    
					  //select attribute for attribute values
					    @FindBy(xpath  ="//select[@name='parent_attribute']")
						private WebElement selectattribute;
					    
					 
					  //select  particular attribute checkbox 
					    @FindBy(xpath  ="//td[contains(text(),'material')]/preceding-sibling::td")
						private WebElement selectattributecheckbox;
					    
					    
					  //click attribute button
					    @FindBy(xpath  ="//a[contains(text(),'ATTRIBUTE')]")
						private WebElement clickattribute_intop;
					    
					  //click  all attribute values button
					    @FindBy(xpath  ="//a[contains(text(),'Attribute Values')]")
						private WebElement clickattributevalues_intop;
					    
					    
					    public void clickattributebtn_intop() {
					    	clickattribute_intop.click();
					    	System.out.println(title.getText());
					    }
					    
					    
					    
					    public void clickattribute_valuebtn_intop() {
					    	clickattributevalues_intop.click();
					    	System.out.println(title.getText());
					    
					    }
					    
					    
					    
					    public void click_partivularcheckbox( String name) {
					    	
					    	WebElement selectattributecheckbox= driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/preceding-sibling::td/input"));
							((JavascriptExecutor) driver).executeScript("arguments[0].click();",selectattributecheckbox);
				
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
	  clicksubmitofattribute.click();
   }
   
   //create in attribute
   public void click_createofattribute() {
		  clickcreateofattribute.click();
	   }
   
   // create in attribute values
   public void click_createofattributevalues() {
		  createofattributevalues.click();
	   }
   
 //choosing search option
   public void choosingsearchoptions(String Value) {

  	 searchoptions.click();
  	 Select s = new Select( searchoptions);
  	 s.selectByVisibleText(Value);
       
   }
   
   //search bar
   public void entervalueinsearch(String Source) {
          searchbar.sendKeys(Source);
   }
   
 // error search bar
   public void error_valueinsearch() {
          System.out.println(searchbar.getAttribute("validationMessage"));
   }
   
   
   //click search icon
   public void clicksearch() {
       searchicon.click();
   }
   
   //verify searched option
   public void verifysearchedvalue() {
     int size = verifysearchvalue.size();
     System.out.println("Size of the result: " + size);  

     for (int i = 0; i < size; i++) {
         String resultText = verifysearchvalue.get(i).getText(); 
         System.out.println(resultText);
     }}

   
 //enter name of attribute to create
   public void entername_attribute(String name) {
	   nameofattribute.clear();
       nameofattribute.sendKeys(name);
   }
   
   
 //error for name of attribute to create
   public void errorname_attribute() {
       nameofattribute.getAttribute("validationMessage");
   }
   
   //select featured of attribute to create
   public void selectfeatured_attribute(String feature) {
       featuredofattribute.click();
       Select s = new Select(featuredofattribute);
    	 s.selectByVisibleText(feature);
    	 System.out.println(s.getFirstSelectedOption().getText());
       
   }
   
   
   
 //select attribute for attribute values 
   public void selectattribute(String attri) {
       selectattribute.click();
       Select s = new Select(selectattribute);
    	 s.selectByVisibleText(attri);
    	 System.out.println(s.getFirstSelectedOption().getText());
       
   }
   
   
   
   //click save in attribute
   public void clicksave_attribute() {
       saveofattribute.click();
   }
   
   public void getmessage() {
		 
		System.out.println(message.getText());
	 }
   
   // get page title
   public void getpagetitle() {
   	System.out.println(title.getText());
   }
   
   // click setting icon in all attribute page
   public void clicksettingicon_attribute(String name) {
	   
   	WebElement setting= driver.findElement(By.xpath("//tr/td[2][contains(text(),'"+name+"')]/following-sibling::td[5]/a[1]"));
   	((JavascriptExecutor) driver).executeScript("arguments[0].click();",setting);
   }
   
   
   // click edit icon in  all attribute page
   public void clickediticon_attribute(String name) {
   	WebElement edit= driver.findElement(By.xpath("//tr/td[2][contains(text(),'"+name+"')]/following-sibling::td[5]/a[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",edit);
   }
   
   
   //click edit icon in attribute value page
   public void clickediticon_attributevalue(String attributename) {
	   	WebElement edit= driver.findElement(By.xpath("//td[2][contains(text(),'"+attributename+"')]/following-sibling::td[6]/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",edit);
	   }
   
 
}



