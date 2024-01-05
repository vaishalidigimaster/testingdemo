package com.sb.pageobject.Settings;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.sb.baseclass.Baseclass;

	public class settings_storesettings extends Baseclass{
	    Actions a=new Actions(driver);

	 

	    
	    public settings_storesettings(WebDriver driver) {
	        this.driver = driver;  
	        PageFactory.initElements(driver, this); 
	    }

	        //store name
	        @FindBy(xpath="//input[@name='shop_name']")
	        private WebElement storename;

	        //shop description
	        @FindBy(xpath = "(//textarea[@class='form-control'])[1]")
	        private WebElement storeDescription;

	        //store email
	        @FindBy(xpath = "//input[@name='store_email']")
	        private WebElement storeemail;

	 

	        //store mobile number
	        @FindBy(xpath = "//input[@name='store_mobile_number']")
	        private WebElement mobileNumber;

	 

	        //language drop down
	        @FindBy(xpath = "//ul[@class='select2-selection__rendered']")
	        private WebElement languageDropdown;

	 

	        @FindBy(xpath = "(//li[contains(text(),'English')])[2]")
	        private WebElement englishLanguage;

	 

	        @FindBy(xpath = "(//li[contains(text(),'Tamil')])[2]")
	        private WebElement tamilLanguage;

	 

	        @FindBy(xpath = "//li[contains(text(),'English')]")
	        private WebElement chooseenglish;

	 

	        @FindBy(xpath = "//li[contains(text(),'Tamil')]")
	        private WebElement tamilLanguage2;

	 

	        @FindBy(xpath = "(//option[@value='ta'])[2]")
	        private WebElement tamilOption;

	 

	        //tax
	        @FindBy(xpath = "//input[@name='tax']")
	        private WebElement taxInput;

	 

	        //gst
	        @FindBy(xpath = "//input[@name='gst']")
	        private WebElement gstInput;

	 

	        //orderID
	        @FindBy(xpath = "//input[@name='order_prefix']")
	        private WebElement orderPrefix;

	 

	        //click save button
	        @FindBy(xpath = "(//button[@type='submit'])[2]")
	        private WebElement saveButton;        

	        //remove option
	        @FindBy(xpath = "//span[@class='select2-selection__choice__remove']")
	        private WebElement removeoption;

	        //success message
	        @FindBy(xpath = "//li[contains(text(),'Settings Updated !!')]")
	        private WebElement getsuccessmsg;

	        //warning message
	        @FindBy(xpath = "//li[contains(text(),'The shop name field must be at least 4 characters.')]")
	        private WebElement warningmsg;

	        //store description error
	        @FindBy(xpath = "//li[contains(text(),'The shop description field must not be greater than 250 characters.')]")
	        private WebElement descriptionerror;

	        //store description error
	        @FindBy(xpath = "//span[@role='combobox']")
	        private WebElement languageerror;

	        //order ID error
	        @FindBy(xpath = "//div[@role='alert']")
	        private WebElement orderIDerror;

	        //clicking upgrade button
	        @FindBy(xpath = "//button[contains(text(),'Upgrade Plan')]")
	        private WebElement upgradeplanbtn;

	       //verify upgrade plan page
	        @FindBy(xpath = "//h2[contains(text(),'Pricing Plans')]")
	        private WebElement pricingplanpage;

	        //Location
	        @FindBy(xpath = "//a[@id='nav-profile-tab']")
	        private WebElement location;

	        //company name
	        @FindBy(xpath = "//input[@name='company_name']")
	        private WebElement locationcompanyname;

	 

	        //email ID field
	        @FindBy(xpath = "//input[@name='email']")
	        private WebElement locationemail;

	 

	        //phone number field
	        @FindBy(xpath = "//input[@name='phone']")
	        private WebElement locationphone;

	        //phone number field error msg
	        @FindBy(xpath = "//h2[@id='swal2-title']")
	        private WebElement locationphoneerror;

	 

	        //address field
	        @FindBy(xpath = "//input[@name='address']")
	        private WebElement locationaddress;

	 

	        //city field
	        @FindBy(xpath = "//input[@name='city']")
	        private WebElement locationcity;

	 

	        //state field
	        @FindBy(xpath = "//input[@name='state']")
	        private WebElement locationstate;

	 

	        //Zip code field
	        @FindBy(xpath = "//input[@name='zip_code']")
	        private WebElement locationzip;

	 

	        //Description field
	        @FindBy(xpath = "(//textarea[@class='form-control'])[2]")
	        private WebElement locationdescription;

	 

	        //save button
	        @FindBy(xpath = "(//button[@type='submit'])[3]")
	        private WebElement savebuttonforlocation;

	        //success msg for location
	        @FindBy(xpath = "//li[contains(text(),'Location Updated !!')]")
	        private WebElement locationsucces;


	        //PWA settings
	        @FindBy(xpath = "//a[@id='nav-contact-tab']")
	        private WebElement pwaTab;

	 

	        //App title
	        @FindBy(xpath = "//input[@name='pwa_app_title']")
	        private WebElement titleInput;

	 

	        //App name
	        @FindBy(xpath = "//input[@name='pwa_app_name']")
	        private WebElement nameInput;

	 

	        //App Background color
	        @FindBy(xpath = "//input[@name='pwa_app_background_color']")
	        private WebElement bgColorInput;

	 

	        //App theme color
	        @FindBy(xpath = "//input[@name='pwa_app_theme_color']")
	        private WebElement themeColorInput;

	 

	        //App language
	        @FindBy(xpath = "//input[@name='app_lang']")
	        private WebElement languageInput;

	 

	        //128 icon
	        @FindBy(xpath = "//input[@name='app_icon_128x128']")
	        private WebElement icon128x128Input;

	 

	        //144 icon
	        @FindBy(xpath = "//input[@name='app_icon_144x144']")
	        private WebElement icon144x144Input;

	        //152 icon
	        @FindBy(xpath = "//input[@name='app_icon_152x152']")
	        private WebElement icon152x152Input;

	        //192 icon
	        @FindBy(xpath = "//input[@name='app_icon_192x192']")
	        private WebElement icon192x192Input;

	        //256 icon
	        @FindBy(xpath = "//input[@name='app_icon_256x256']")
	        private WebElement icon256x256Input;

	        //512 icon
	        @FindBy(xpath = "//input[@name='app_icon_512x512']")
	        private WebElement icon512x512Input;

	        //save button
	        @FindBy(xpath = "(//button[@type='submit'])[4]")
	        private WebElement pwasaveButton;

	        //success message for PWA setting
	        @FindBy(xpath = "//li[contains(text(),'PWA Settings Updated Successfully !!')]")
	        private WebElement pwasuccess;

	      


	        //store name
	        public void enterstorename(String name) {
	            storename.clear();
	            storename.sendKeys(name);
	        }

	        //Store Description
	        public void enterstoredescription(String describ) {
	            storeDescription.clear();
	            storeDescription.sendKeys(describ);
	        }

	        //Store Description
	        public void entermobile(String mobile) {
	            mobileNumber.clear();
	            mobileNumber.sendKeys(mobile);
	        }
	        //Store Description
	        public void enteremail(String mail) {
	            storeemail.clear();
	            storeemail.sendKeys(mail);
	        }

	        //choose language
	        public void chooselan() {       
	            WebElement chooselang = driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']"));
	            chooselang.click();    
	        }

	        //default language dropdown
	        public void defaultlanguage(String lang) {                
	            WebElement defaultlang = driver.findElement(By.xpath("//select[@name='local']//option[@value='"+lang+"']"));
	            defaultlang.click();
	        }

	        //choose order method
	        public void orderreceivemethod(String method) {                
	            WebElement ordermethod = driver.findElement(By.xpath("//select[@name='order_receive_method']//option[@value='"+method+"']"));
	            ordermethod.click();
	        }

	        //tax
	        public void entertax(String taxno) {
	            taxInput.clear();
	            taxInput.sendKeys(taxno);
	        }

	        //tax
	        public void entergst(String gst) {
	            gstInput.clear();
	            gstInput.sendKeys(gst);
	        }

	        //default language drop down
	        public void choosecurrency(String cur) {                
	            WebElement currencies = driver.findElement(By.xpath("//select[@name='currency']//option[@value='"+cur+"']"));
	            currencies.click();
	        }

	        //order ID
	        public void enterorderID(String ID) {
	            orderPrefix.clear();
	            orderPrefix.sendKeys(ID);
	        }

	        //order ID
	        public void clicksave() {
	        	((JavascriptExecutor) driver).executeScript("arguments[0].click();",saveButton );
	            
	        }

	        //remove option value
	        public void removelanguage() {
	        	((JavascriptExecutor) driver).executeScript("arguments[0].click();",removeoption );
	        	
	            
	        }

	        //choose english
	        public void chooseenglish() {
	            chooseenglish.click();
	        }

	 

	        
	        //Get Success message    
	        public void getmessage() {
	            String success = getsuccessmsg.getText();
	            System.out.println(success);
	        }

	        //store name validation message.
	        public void storenameerrormessage() {     
	        System.out.println("Store name is not entered. "+storename.getAttribute("validationMessage"));
	             }

	        //Get warning message    
	        public void warningmessage() {
	            String success = warningmsg.getText();
	            System.out.println(success);
	        }

	        //Get warning for description
	        public void storedescriptionerrormessage() {
	            System.out.println("Store description is not entered. "+storeDescription.getAttribute("validationMessage"));
	        }

	        //store description error
	        public void descriptionerror() {
	            String error = descriptionerror.getText();
	            System.out.println(error);
	        }

	        //get verification for email
	        public void eamilerrormessage() {
	            System.out.println("Store email is not entered. "+storeemail.getAttribute("validationMessage"));
	        }

	 

	        //get verification for phone number
	        public void mobileerrormessage() {
	            System.out.println("Mobile number is not entered. "+mobileNumber.getAttribute("validationMessage"));
	        }

	 

	        
	        //get verification for phone number
	        public void languageerror() {
	            System.out.println("Language not choosed."+languageerror.getAttribute("validationMessage"));
	        }


	        //get verification for phone number
	        public void taxerror() {
	            System.out.println("Tax not entered."+taxInput.getAttribute("validationMessage"));
	        }

	        //get verification for phone number
	        public void gsterror() {
	            System.out.println("GST not entered."+gstInput.getAttribute("validationMessage"));
	        }

	        //get verification for order ID 
	        public void orderIDerror() {
	            System.out.println("Order ID not entered."+orderPrefix.getAttribute("validationMessage"));
	        } 


	       //get verification for orderID for numbers
	        public void orderIDwithnumbermsg() { 
	        String numbererror = orderIDerror.getText();
	        System.out.println(numbererror);

	        }

	       //click upgrade button
	        public void clickupgradeplan() {
	            upgradeplanbtn.click();
	        } 

	        //verify upgrade plan button 
	        public void pricingplanpageisdisplayed() { 
	        String planpage = pricingplanpage.getText();
	        System.out.println(planpage+ "Page is displayed");

	        }

	        //location
	        public void clicklocationTab() {
	            location.click();
	        }

	 

	       //company name field
	        public void l_entercompanyname(String name) {
	            locationcompanyname.clear();
	            locationcompanyname.sendKeys(name);
	        }

	        //company name not entered
	        public void l_companynameerror() {
	            System.out.println("Company name not entered."+locationcompanyname.getAttribute("validationMessage"));
	        }

	        //email ID field
	        public void l_enterEmail(String email) {
	            locationemail.clear();
	            locationemail.sendKeys(email);
	        }

	       //Email not entered
	        public void l_emaileerror() {
	            System.out.println("Email not entered or Invalid."+locationemail.getAttribute("validationMessage"));
	        }

	 

	        //phone number field
	        public void l_enterPhone(String phone) {
	            locationphone.clear();
	            locationphone.sendKeys(phone);
	        }

	 

	        //phone not entered
	        public void l_phoneerror() {
	            System.out.println("Phone number not entered or Invalid."+locationphone.getAttribute("validationMessage"));
	        }

	        //verify upgrade plan button 
	        public void l_phonevalidation() { 
	        String phonefielderror= locationphoneerror.getText();
	        System.out.println(phonefielderror);

	        }

	        //address field
	        public void l_enterAddress(String address) {
	            locationaddress.clear();
	            locationaddress.sendKeys(address);
	        }

	       //Address not entered
	        public void l_addresserror() {
	            System.out.println("Address not entered."+locationaddress.getAttribute("validationMessage"));
	        }

	 

	        //city field
	        public void l_enterCity(String city) {
	            locationcity.clear();
	            locationcity.sendKeys(city);
	        }

	        //Address not entered
	        public void l_cityerror() {
	            System.out.println("City was not entered."+locationcity.getAttribute("validationMessage"));
	        }

	 

	 

	        //state field
	        public void l_enterState(String state) {
	            locationstate.clear();
	            locationstate.sendKeys(state);
	        }

	        //state not entered
	        public void l_stateerror() {
	            System.out.println("State was not entered."+locationstate.getAttribute("validationMessage"));
	        }

	 

	        
	        //zip field
	        public void l_enterZip(String zip) {
	            locationzip.clear();
	            locationzip.sendKeys(zip);
	        }

	        //zip not entered
	        public void l_ziperror() {
	            System.out.println("Zipcode was not entered."+locationzip.getAttribute("validationMessage"));
	        }

	 

	 

	        //description field
	        public void l_enterDescription(String desc) {
	            locationdescription.clear();
	            locationdescription.sendKeys(desc);
	        }

	        //Invoice description not entered
	        public void l_invoiceerror() {
	            System.out.println("Invoice field is not entered."+locationdescription.getAttribute("validationMessage"));
	        }

	 

	        //save button for location page
	        public void l_savelocation() {
	        	((JavascriptExecutor) driver).executeScript("arguments[0].click();",savebuttonforlocation );
	            
	        }

	       //save button for location page
	        public void l_successmsg() {
	           String successmsg = locationsucces.getText();
	           System.out.println(successmsg);
	}

	        //PWA Settings

	        //Click PWA
	        public void clickPWATab() {
	            pwaTab.click();
	        }

	 

	        //Enter title
	        public void p_enterTitle(String title) {
	            titleInput.clear();
	            titleInput.sendKeys(title);
	        }

	        //APp title not provide
	        public void p_titleerror() {
	            System.out.println("Title is not entered."+titleInput.getAttribute("validationMessage"));
	        }

	 

	        //enter app name
	        public void p_enterName(String name) {
	            nameInput.clear();
	            nameInput.sendKeys(name);
	        }

	        //Name not provide
	        public void p_nameerror() {
	            System.out.println("App name is not entered."+nameInput.getAttribute("validationMessage"));
	        }

	 

	        //enter background color
	        public void p_enterBackgroundColor(String bgColor) {
	            bgColorInput.clear();
	            bgColorInput.sendKeys(bgColor);
	        }

	        //BG Color not provide
	        public void p_bgerror() {
	            System.out.println("Background color is not entered."+bgColorInput.getAttribute("validationMessage"));
	        }

	 

	        //enter theme color
	        public void p_enterThemeColor(String themeColor) {
	            themeColorInput.clear();
	            themeColorInput.sendKeys(themeColor);
	        }

	        //Theme Color not provide
	        public void p_themeerror() {
	            System.out.println("Theme color is not entered."+themeColorInput.getAttribute("validationMessage"));
	        }

	 

	        //enter language
	        public void p_enterLanguage(String language) {
	            languageInput.clear();
	            languageInput.sendKeys(language);
	        }

	        //Language is not provide
	        public void p_languageerror() {
	            System.out.println("Language is not entered."+languageInput.getAttribute("validationMessage"));
	        }

	        //save button
	        public void p_savePWASettings() {
	            pwasaveButton.click();
	        }

	        //128 image choosen
	        public void l_128image() {
	            a.moveToElement(icon128x128Input).click().perform();
	        }

	        //128 eroor
	        public void p_128error() {
	            System.out.println("You are not choosing 128 app icon."+icon144x144Input.getAttribute("validationMessage"));
	        }

	        //144 image choosen
	        public void l_144image() {
	            a.moveToElement(icon144x144Input).click().perform();
	        }

	        //144 error
	        public void p_144error() {
	            System.out.println("You are not choosing 144 app icon."+icon144x144Input.getAttribute("validationMessage"));
	        }


	        //152 image choosen
	        public void l_152image() {
	            a.moveToElement(icon152x152Input).click().perform();
	        }

	        //152 error
	        public void p_152error() {
	            System.out.println("You are not choosing 152 app icon."+icon152x152Input.getAttribute("validationMessage"));
	        }


	        //192 image choosen
	        public void l_192image() {
	            a.moveToElement(icon192x192Input).click().perform();
	        }

	        //192 error
	        public void p_192error() {
	            System.out.println("You are not choosing 192 app icon."+icon192x192Input.getAttribute("validationMessage"));
	        }


	        //256 image choosen
	        public void l_256image() {
	            a.moveToElement(icon256x256Input).click().perform();
	        }

	        //256 error
	        public void p_256error() {
	            System.out.println("You are not choosing 256 app icon."+icon256x256Input.getAttribute("validationMessage"));
	        }

	        //512 image choosen
	        public void l_512image() {
	            a.moveToElement(icon512x512Input).click().perform();
	        }

	        //512 error
	        public void p_512error() {
	            System.out.println("You are not choosing 512 app icon."+icon512x512Input.getAttribute("validationMessage"));
	        }

	        //Get PWA success message
	        public void PWAsuccessmesg() { 
	        String PWASuceess = pwasuccess.getText();
	        System.out.println(PWASuceess);

	        }

	        //Click others
	        public void clickothers() {
	            others.click();
	        }

	        //Enter theme color
	        public void O_themecolor(String color) {
	            themeColor.clear();
	            themeColor.sendKeys(color);
	        }

	        //Click logo
	        public void clicklogo() {
	            logo.click();
	        }

	      //others

	              @FindBy(xpath = "//a[@id='nav-others-tab']")

	              private WebElement others;

	       

	              //theme color

	              @FindBy(xpath = "//input[@name='theme_color']")

	              private WebElement themeColor;

	       

	              //logo

	              @FindBy(xpath = "//input[@name='logo']")

	              private WebElement logo;

	       

	              //favicon

	              @FindBy(xpath = "(//input[@type='file'])[8]")

	              private WebElement favicon;


	              //add new button

	              @FindBy(xpath = "(//button[@type='button'])[2]")

	              private WebElement addNewBtn;

	       

	              //facebook url

	              @FindBy(xpath = "(//input[@type='text'])[18]")

	              private WebElement facebookUrl;

	       

	              //url

	              @FindBy(xpath = "(//input[@type='text'])[19]")

	              private WebElement url;


	       

	              //save button

	              @FindBy(xpath = "(//button[@type='submit'])[5]")

	              private WebElement othersave;


	              //get success message

	              @FindBy(xpath = "//li[contains(text(),'Theme Settings Updated !!')]")

	              private WebElement getsuccess;


	              //remove button

	              @FindBy(xpath = "//button[contains(text(),'Remove')]")

	              private WebElement removebtn;

	     

	       

	              //Enter theme color

	              public void o_themecolor(String color) {

	                  themeColor.clear();

	                  themeColor.sendKeys(color);

	              }


	              //theme not provided error

	              public void o_themeerror() {

	                  System.out.println("Theme color is not entered."+themeColor.getAttribute("validationMessage"));

	              }


	              //Click logo

	              public void o_clicklogo() {

	                  a.moveToElement(logo).click().perform();

	              }


	              //Click favicon

	              public void o_clickfavicon() {

	                  a.moveToElement(favicon).click().perform();

	              }


	              //new button

	              public void o_clickAddNewBtn() {
	            	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewBtn);
	                 

	              }

	       

	              //url

	              public void o_enterFacebookUrl(String url) {

	                  facebookUrl.sendKeys(url);

	              }


	              //url not provided error

	              public void o_urlerror() {

	                  System.out.println("URL not entered."+facebookUrl.getAttribute("validationMessage"));

	              }


	       

	              //fafa

	              public void o_enterUrl(String urls) {

	                  url.sendKeys(urls);

	              }


	              //url not provided error

	              public void o_socialmediaerror() {

	                  System.out.println("Social media is not entered."+url.getAttribute("validationMessage"));

	              }


	              //save button

	              public void o_clickothersave() {
	            	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();",othersave);
	                 

	              }


	              //success msg

	              public void o_getsuccessmsg() {

	                  String success = getsuccess.getText();

	                  System.out.println(success);

	              }


	              //remove button

	              public void o_clickremove() {
	            	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();",removebtn);
	                 

	              }

	        
	        
	}

