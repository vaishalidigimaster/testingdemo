package com.sb.pageobject.onlinestore.seller;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;

public class Onlinestorepage_Sliders extends Baseclass{
	//driver initialize
	private WebDriver driver;
	//create constructor
	public  Onlinestorepage_Sliders (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	// message on right top
	@FindBy(xpath ="//h2[@id='swal2-title']")
	private WebElement message;
	
	
	// click create
	@FindBy(xpath ="//span[contains(text(),'create')]")
	private WebElement create;
	
	// click sliders button in top
		@FindBy(xpath ="//a[contains(text(),'Sliders')]")
		private WebElement sliders;
		
		
	// WebElements using @FindBy
    @FindBy(xpath = "//input[@id='file']")
    private WebElement fileInput;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement titleInput;

    @FindBy(xpath = "//input[@name='description']")
    private WebElement descriptionInput;
    
    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement descriptioninEdit;

    @FindBy(xpath = "//input[@name='btn_text']")
    private WebElement btnTextInput;

    @FindBy(xpath = "//select[@name='position']")
    private WebElement positionSelect;
    
    @FindBy(xpath = " //input[@name='text_color']")
    private WebElement textcolor;

  
 
    @FindBy(xpath = "//input[@name='url']")
    private WebElement urlInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;

    @FindBy(xpath = "(//button[@type='reset'])[2]")
    private WebElement discardButton;
    
    @FindBy(xpath = "//button[contains(text(),'Yes, Do It!')]")
    private WebElement yesdoitButton;
    
    @FindBy(xpath = "(//button[contains(text(),'Cancel')])[2]")
    private WebElement cancelButton;
    
    
    @FindBy(xpath = "//li[contains(text(),'Slider Deleted !!')]")
    private WebElement titlemessage;
    
  
    
    		public void clickedit(String title) {
    			   
    		   	WebElement edit= driver.findElement(By.xpath("(//td[contains(text(),'"+title+"')])/following-sibling::td[4]/a[1]"));
    		   	Actions a=new Actions(driver);
    			
    			a.moveToElement(edit).click().build().perform();
    			
    		   }
    		   
    		public void clickdeleteicon(String title) {
    		   	WebElement delete= driver.findElement(By.xpath("(//td[contains(text(),'"+title+"')])/following-sibling::td[4]/a[2]"));
    		   	JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click()", delete);
    		}
    		
    		public void setimage() {
    			 JavascriptExecutor js = (JavascriptExecutor) driver;
			        js.executeScript("arguments[0].click()", fileInput);
    			
    			
  		    }
    		
    		 public void fileerror() {     
		         System.out.println("file not entered. "+fileInput.getAttribute("validationMessage"));
		         }
    		  public void settitle(String text) {
    			  titleInput.clear();
    			  titleInput.sendKeys(text);
    		    }
    		
    		  public void titleerror() {     
    		         System.out.println("Title not entered. "+titleInput.getAttribute("validationMessage"));
    		         }
    		  
    		  public void setdescription(String text) {
    			  descriptionInput.clear();
    			  descriptionInput.sendKeys(text);
    		    }
    		
    		  
    		  
    		  public void descriptionerror() {     
 		         System.out.println("Description not entered. "+descriptionInput.getAttribute("validationMessage"));
 		         }
    		  
    		  
    		  public void setdescriptioninedit(String text) {
    			  descriptioninEdit.clear();
    			  descriptioninEdit.sendKeys(text);
    		    }
    		  
    		  public void enterbuttontext(String text) {
    			  btnTextInput.clear();
    			  btnTextInput.sendKeys(text);
    		    }
    		
    		  public void buttontaxterror() {     
  		         System.out.println("Button text not entered. "+btnTextInput.getAttribute("validationMessage"));
  		         }
    		  
    		  
    		  public void selectposition(String text) {
    			 Select s = new Select(positionSelect);
    			 s.selectByVisibleText(text);
    			  
    		    }
    		
    		  
    		  public void entertextcolor(String text) {
    			  textcolor.clear();
    			  textcolor.sendKeys(text);
    		    }
    		
    		  
    		  public void textcolorerror() {     
   		         System.out.println("Text color not entered. "+textcolor.getAttribute("validationMessage"));
   		         }
    		  
    		  
    		  public void enterurl(String text) {
    			  urlInput.clear();
    			  urlInput.sendKeys(text);
    		    }
    		
    		  public void clicksaveorupdate() {
    			  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
    			 
    		    }
    		
    		  public void clickdiscard() {
    			  discardButton.click();
    		    }
    		
    		  public void clickcreate() {
    			  create.click();
    		    }
    		
    		
    		  public void getmessage() {
    			  System.out.println(message.getText());
    		    }
    		
    		
    		  public void clickslidersbtn() {
    			  sliders.click();
    		    }
    		
    		
    		  public void clickyesdoitbtn() {
    			  yesdoitButton.click();
    		    }
    		
    		
    		  public void clickcancelbtn() {
    			  cancelButton.click();
    		    }
    		
    		  
    		  public void gettitlemessage() {
    			  System.out.println(titlemessage.getText());
    		    }
}
