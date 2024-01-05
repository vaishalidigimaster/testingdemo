package com.sb.pageobject.register.seller;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sb.baseclass.Baseclass;

public class registerpage_category extends Baseclass{
	
	private WebDriver driver;
	
	public registerpage_category(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//category page
		@FindBy(xpath  ="//h2[contains(text(),'Select Category')]")
		private WebElement selectcategory;
		// Find all elements with the shared class
		@FindBy(xpath="//h4[@class='card-title']")
		private List<WebElement> selected_category;
		@FindBy(id  ="skip2")
		private WebElement skip_in_register;
		@FindBy(xpath ="//span[contains(text(),'Next')][1]")
		private WebElement next_in_register;
		
   //error
		
		@FindBy(xpath="//h2[@id='swal2-title']")
		private WebElement errormessage;
		
		
	public void category_selection( String categoryName) {
		implicitwait();

        // Create a List to store the extracted text
        List<String> textList = new ArrayList<>();
           // Iterate through the elements and extract their text
	        for (WebElement categoryElement : selected_category) {
	         String categoryText =categoryElement.getText();
	         textList.add(categoryText);
	         for (String text : textList) {
	        	 if (text.equals(categoryName)) {
		        	 categoryElement.click();
		         }
	            
	         }
	        
	        }
	       
              }
	       
	public void register_skipbtn() {
		skip_in_register.click();
	}
	public void register_nextbtn() {
		next_in_register.click();
	}
	
	public void selectcategoryerror() {
		String err_message=errormessage.getText();
		System.out.println(err_message);
}}
