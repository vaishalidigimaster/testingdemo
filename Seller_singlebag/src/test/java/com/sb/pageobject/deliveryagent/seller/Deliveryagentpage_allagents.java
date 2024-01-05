package com.sb.pageobject.deliveryagent.seller;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;

public class Deliveryagentpage_allagents  extends Baseclass{
	//driver initialize
			private WebDriver driver;
			//create constructor
			public  Deliveryagentpage_allagents (WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
				}
		
			
			//click all checkbox
			@FindBy(xpath="//input[@class='checkAll']")
			private WebElement checkallbox;
			
			//click all selectaction tab
			@FindBy(xpath="//select[@name='method']")
			private WebElement selectaction;
			
			//click all selectaction submit
			@FindBy(xpath="(//button[@type='submit'])[3]")
			private WebElement actionsubmit;
			
		
			
			//message in right corner
			@FindBy(xpath ="//h2[@id='swal2-title']")
			private WebElement message;
			

		    @FindBy(xpath = "(//input[@type='file'])[1]")
		    private WebElement avatarInput;

		    @FindBy(xpath = "(//input[@type='text'])[1]")
		    private WebElement firstNameInput;
		    

		    @FindBy(xpath = "(//input[@type='text'])[2]")
		    private WebElement lastNameInput;

		    @FindBy(xpath = "//input[@type='email']")
		    private WebElement emailInput;

		    @FindBy(xpath = "//input[@name='mobile']")
		    private WebElement mobileInput;

		    @FindBy(xpath = "//input[@type='password']")
		    private WebElement passwordInput;
		    
		    //checkbox for change password in edit agent
		    @FindBy(xpath = "//input[@id='change_password']")
		    private WebElement passwordcheckbox;
		    
		  
		    @FindBy(xpath = "(//input[@type='text'])[4]")
		    private WebElement agentIDInput;

		    @FindBy(xpath = "(//input[@type='file'])[2]")
		    private WebElement agentimageInput;

		    @FindBy(xpath = "//select[@class='form-control selectric']")
		    private WebElement statusDropdown;

		    
		    @FindBy(xpath = "(//button[@type='submit'])[2]")
		    private WebElement saveButton;
		    
		    // click devivery agent to go back in create page
		    @FindBy(xpath = "//a[text()='Delivery Agent']")
		    private WebElement deliveryagentbtn_toback;
		    
		  //a[text()='Delivery Agent']
		    @FindBy(xpath = "//span[contains(text(),'+create')]")
		    private WebElement createDeliveryAgentButton;
			
		    
		    //page title
		    @FindBy(xpath  ="//h2[@class='content-header-title float-start mb-0']")
			private WebElement title;
		    
		    //search bar
	        @FindBy(xpath="//input[@id='src']")
	        private WebElement searchbar;
		    
		  //search options
	        @FindBy(xpath="(//button[@type='submit'])[2]")
	        private WebElement searchicon;

	        //click search icon
	        @FindBy(xpath="//select[@class='form-control selectric']")
	        private List<WebElement> searchoptions;

	        //verify searched value
	        @FindBy(xpath="//tbody//tr")
	        private List<WebElement> verifysearchvalue;

		    
		    
		    // get page title
		    public void getpagetitle() {
		    	System.out.println(title.getText());
		    }
			public void getmessage(){
				System.out.println(message.getText());
			}
			
			// click delivery agent botton to go back
			public void click_deliveryagent(){
				deliveryagentbtn_toback.click();
			}
			
			
			public void click_create(){
				createDeliveryAgentButton.click();
			}
			
			public void click_allcheckbox(){
				checkallbox.click();
			}
			
			// click any action of any agent
			public void click_actions(String id){
				WebElement action= driver.findElement(By.xpath("(//tr[@id='row"+id+"'])/td[5]/div/button[2]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",action);
				
			}
			
			// click edit agent  of action of any agent
						public void click_editagent(String id){
							WebElement editagent= driver.findElement(By.xpath("(//tr[@id='row"+id+"'])/td[5]/div/button[2]/following-sibling::div/a[1]"));
							((JavascriptExecutor) driver).executeScript("arguments[0].click();",editagent); 
						}
			
						// click view agent  of action of any agent
						public void click_viewagent(String id){
							WebElement viewagent= driver.findElement(By.xpath("(//tr[@id='row"+id+"'])/td[5]/div/button[2]/following-sibling::div/a[2]"));
							((JavascriptExecutor) driver).executeScript("arguments[0].click();",viewagent);
						}
						
						//click clickhere of view agent
					    @FindBy(xpath = "//a[@data-bs-toggle='modal']")
					    private WebElement clickhereofview;
					    
					  //click close of view agent
					    @FindBy(xpath = "(//button[@type='button'])[2]")
					    private WebElement closeofview;
					    
					  //click from date
					    @FindBy(xpath = " //input[@name='from_date']")
					    private WebElement from;
					    
					  //click to date
					    @FindBy(xpath = " //input[@name='to_date']")
					    private WebElement to;
					 
					  //click export to excel
					    @FindBy(xpath = " //button[@id='export_btn']")
					    private WebElement exporttoexcel;
					    
					    @FindBy(xpath  ="(//input[@class='numInput cur-year'])[1]")
						private WebElement fromyear;
						
						@FindBy(xpath  ="(//input[@class='numInput cur-year'])[2]")
						private WebElement toyear;
						
						@FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[1]")
						private WebElement frommonth;
						
						
						@FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[2]")
						private WebElement tomonth;
						
					    public void click_clickhereof_view() {
					    	clickhereofview.click();
						}
						
					    public void click_closeof_view() {
					    	closeofview.click();
						}
					    
					    public  void from_date(String year, String month, String date) {
					    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",from);
					       
				                implicitwait();
					        // Select the desired year
				                fromyear.clear();
				                fromyear.sendKeys(year);
				                implicitwait();

					        // Select the desired month
					        frommonth.click();
					      //  wait_for_visibilty(By.xpath("//option[text()='" + month + "']"));
					        WebElement monthOption = driver.findElement(By.xpath("(//option[text()='" + month + "'])[1]"));
					        monthOption.click();
				            //   wait_for_visibilty(By.xpath("//option[text()='" + date + "']"));
					        // Select the desired date
					        WebElement dateCell = driver.findElement(By.xpath("(//span[text()='" + date + "'])[1]"));
					        dateCell.click();

					    }
					
					public  void to_date(String year, String month, String date) {
						((JavascriptExecutor) driver).executeScript("arguments[0].click();",to);
					
				         implicitwait();
				     // Select the desired year
				         toyear.clear();
				        toyear.sendKeys(year);
				         implicitwait();

				     // Select the desired month
				     tomonth.click();
				     wait_for_visibilty(By.xpath("(//option[text()='" + month + "'])[2]"));
				     WebElement monthOption1 = driver.findElement(By.xpath("(//option[text()='" + month + "'])[2]"));
				     monthOption1.click();
				     //wait_for_visibilty(By.xpath("//option[text()='" + date + "']"));
				     // Select the desired date
				     WebElement date2 = driver.findElement(By.xpath("(//span[text()='" + date + "'])[2]"));
				     date2.click();

				    }
					    
					//click export to excel
					public void click_exporttoexcel() {
						((JavascriptExecutor) driver).executeScript("arguments[0].click();",exporttoexcel);
				    	
					}
					    
						// click login  of action of any agent
						public void click_login(String id){
							WebElement login= driver.findElement(By.xpath("(//tr[@id='row"+id+"'])/td[5]/div/button[2]/following-sibling::div/a[3]"));
							((JavascriptExecutor) driver).executeScript("arguments[0].click();",login);
						}
						
						//click orders of login
					    @FindBy(xpath = "(//span[@class='menu-title text-truncate'])[2]")
					    private WebElement orderoflogin;
					    
					  //click allorders of login
					    @FindBy(xpath = "(//span[@class='menu-item text-truncate'])")
					    private WebElement allorderoflogin;
					    
					  //click orders of login
					    public void click_ordersoflogin() {
					    	orderoflogin.click();
						}
					    
					    //click allorders of login
					    public void click_allordersoflogin() {
					    	orderoflogin.click();
						}
					    
					    
			//click any particular checkbox
			public void click_particularcheckbox(String id){
				WebElement particularcheckbox= driver.findElement(By.xpath("//input[@value='"+id+"']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",particularcheckbox);
				
			}
			
			public void select_actions( String status){
				selectaction.click();
				implicitwait();
				 Select s= new Select(selectaction);
				 s.selectByVisibleText(status);
				 System.out.println(s.getFirstSelectedOption().getText());
				 
			}
			
			public void click_actionsubmit() {
				actionsubmit.click();
			}
			
			public void enter_firstname(String name) {
				firstNameInput.clear();
				firstNameInput.sendKeys(name);
			}
			
			public void error_firstname() {
				System.out.println(firstNameInput.getAttribute("validationMessage"));
				
			}
			
			public void enter_lastname(String name) {
				lastNameInput.clear();
				lastNameInput.sendKeys(name);
			}
			
			public void error_lastname() {
				System.out.println(lastNameInput.getAttribute("validationMessage"));
			}
			
			public void enter_email(String mail) {
				emailInput.clear();
				emailInput.sendKeys(mail);
			}
			
			// error in email tab
			public void error_email() {
				
				System.out.println(emailInput.getAttribute("validationMessage"));
			}
			
			public void enter_mobilenumber(String no) {
				mobileInput.clear();
				mobileInput.sendKeys(no);
			}
			
			public void error_mobilenumber() {
				System.out.println(mobileInput.getAttribute("validationMessage"));
				
				
			}
			
			public void enter_password(String pwd) {
				passwordInput.clear();
				passwordInput.sendKeys(pwd);
			}
			
			public void error_password() {
				System.out.println(passwordInput.getAttribute("validationMessage"));
				
			}
			public void click_passwordcheckbox() {
				passwordcheckbox.click();
				
			}
			public void enter_agentid(String id) {
				agentIDInput.clear();
				agentIDInput.sendKeys(id);
			}
			
			public void error_agentid() {
				System.out.println(agentIDInput.getAttribute("validationMessage"));
			}
			
			public void enter_statusinform(String sts) {
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", statusDropdown);
				
				
				Select s= new Select(statusDropdown);
				s.selectByVisibleText(sts);
				
			}
			
			
			 
			 public void saveDeliveryAgent() {
				 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", saveButton);
			    }
			 
			 public void avatar(String imagepath) throws AWTException, InterruptedException {
				 Actions a = new Actions(driver);

			        // Upload first image
			        a.moveToElement(avatarInput).click().perform();
			        
			        uploadfile(imagepath);
			    }
			 
			 public void agentid_image(String imagepath) throws AWTException, InterruptedException {
				 
			        JavascriptExecutor js = (JavascriptExecutor) driver;
			        js.executeScript("arguments[0].click()", agentimageInput);
			       
			       
			        Thread.sleep(2000);
			        
			        uploadfile(imagepath);
			    }
			 
			 //choosing search option
	         public void choosingsearchoptions(String Value) {

	             for(WebElement option1:searchoptions)
	                   if(option1.getText().equals(Value)) {
	                       option1.click();
	                 }
	         }
	         
	         //search bar
	         public void entervalueinsearch(String Source) {
	                searchbar.sendKeys(Source);
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

			 
}

