package com.sb.pageobject.onlinestore.seller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Onlinestorepage_Menus {
	//driver initialize
		private WebDriver driver;
		//create constructor
		public  Onlinestorepage_Menus (WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
	}
		// message on right top
		@FindBy(xpath ="//h2[@id='swal2-title']")
		private WebElement message;
		
		
		// Header edit
				@FindBy(xpath ="//tr[1]/td/a")
				private WebElement headeredit;
		
		
				// footer left  edit
				@FindBy(xpath ="//tr[2]/td/a")
				private WebElement footerleft;
				
				// footer center edit
				@FindBy(xpath ="//tr[3]/td/a")
				private WebElement footercenter;
				
				// footer right edit
				@FindBy(xpath ="//tr[4]/td/a")
				private WebElement footerright;
		
		
				//how to use
				@FindBy(xpath ="//p[@style=' margin-left: 10px; ']")
				private WebElement howtouse;
		
		
				//text tab
				@FindBy(xpath ="//input[@name='text']")
				private WebElement text;
		
				//menu list
				@FindBy(xpath ="//select[@name='menu_type']")
				private WebElement menulist;
				
				
				//URL
				@FindBy(xpath ="//span[@id='select2-href-container']")
				private WebElement url;
				
				
				//target
				@FindBy(xpath ="//select[@id='target']")
				private WebElement target;
				
				
				
				//add
				@FindBy(xpath ="//button[@id='btnAdd']")
				private WebElement add;
				
				//save
				@FindBy(xpath ="//button[@type='submit']")
				private WebElement save;
				
				
				
				
				//menulist list
				@FindBy(xpath ="//li[@class='select2-results__option select2-results__option--highlighted']")
				private WebElement menu;
				
				
				

				//menulist input
				@FindBy(xpath ="//input[@class='select2-search__field']")
				private WebElement menuinput;
				
				
				//savetext tab
				@FindBy(xpath ="//input[@id='name']")
				private WebElement savetext;
				
				
		
		
				public void getmessage() {
	    			  System.out.println(message.getText());
	    		    }
		
				public void clickheaderedit() {
					headeredit.click();
	    		    }
		
		
				public void clickfooterleftedit() {
					footerleft.click();
	    		    }
		
		
				public void clickfootercenteredit() {
					footercenter.click();
	    		    }
		
		
				public void clickfooterrightedit() {
					footerright.click();
	    		    }
		
		
		
				public void clickhowtouse() {
					howtouse.click();
	    		    }
		
		
				public void entertext(String text1) {
					text.clear();
					text.sendKeys(text1);
	    		    }
				
				
				
				public void selectmenulist(String menuli) {
					
					menulist.click();
					
					Select s1 = new Select(menulist);
					
					s1.selectByVisibleText(menuli);
	    		    }
		
				
				
				
                   public void selecturl(String url1) {
					
					url.click();
					menuinput.sendKeys(url1);
					menu.click();
					
                   }
	    		   
                   public void selecttarget(String t) {
   					
   					target.click();
   					
   					Select s1 = new Select(target);
   					
   					s1.selectByVisibleText(t);
   	    		    } 
                   
                   
                   public void drag_dropmenu( String menu1, String menu2) {
      				WebElement source= driver.findElement(By.xpath("//span[contains(text(),'"+menu2+"')]/ancestor::li"))	;
      				WebElement target= driver.findElement(By.xpath("//span[contains(text(),'"+menu1+"')]/ancestor::li"))	;	
      				
      				Actions a= new Actions(driver);
      				a.dragAndDrop(source, target).build().perform();
      	    		    } 
                   
                   
                   public void savetext(String text1) {
   					savetext.clear();
   					savetext.sendKeys(text1);
   	    		    } 
                   
                   
                   public void save() {
                	   
      					save.click();
      	    		    }
                   
                   public void add() {
                	  add.click();
     					
     	    		    }
                   
                   public void delete(String menu) {
                 	WebElement del=  driver.findElement(By.xpath("//span[contains(text(),'"+menu+"')]/following-sibling::div/a[last()]"));
      					del.click();
      	    		    }
		
}
