package com.sb.pageobject.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

 

import com.sb.baseclass.Baseclass;

 

public class settings_shippingmethod extends Baseclass {

 

	//driver initialize
	private WebDriver driver;

	//constructor
	public settings_shippingmethod(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//capture shipping method txt
	@FindBy(xpath="//h2[text()='Shipping Method']")
	private WebElement shippingmethodtxt;

	//select all checkbox
	@FindBy(xpath="//tr/th/input[@type='checkbox']")
	private WebElement allcheckbox;

	// select status action
    @FindBy(xpath = "//select[@name='status']")
    private WebElement selectactions;

	// select method action
    @FindBy(xpath = "//select[@name='method']")
    private WebElement selectaction;


    //method
    public void selectaction(String action) {

		   selectaction.click();

 

		   Select s= new Select(selectaction);

 

		   s.selectByVisibleText(action);

 

		   

 

	   }

 

    //status
    public void selectactions(String actions) {
    	selectactions.click();

 

		   Select s= new Select(selectactions);

 

		   s.selectByVisibleText(actions);
    }

 

 

//    // click select action
//    public void clickselectaction() {
//        selectaction.click();
//    }
//
//	
//	//select action-active
//	public void clickactive() {
//		WebElement active = driver.findElement(By.xpath("(//option[@value='1'])[1]"));
//		//(//div/select/option[contains(text(),'\"+text+\"')])[1]
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",active);
//
//	}
//	
//	
//	
//	//select action-inactive
//	public void clickinactive() {
//		WebElement inactivestatus = driver.findElement(By.xpath("(//option[@value='0'])[1]"));
//		//(//div/select/option[contains(text(),'"+inactive+"')])[1]
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",inactivestatus);
//	}
//	
//	//select action-delete
//	public void deletestatus() {
//		WebElement deletestatus = driver.findElement(By.xpath("(//option[@value='5'])[1]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",deletestatus);
//
//	}
    @FindBy(xpath="(//button[@type='submit'])[1]")
    private WebElement submit;
    //click submit
    public void clicksubmit() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",submit);

 

    }

	//click-create
	@FindBy(xpath="//div/a/span[contains(text(),'create')]")
	private WebElement create;

	//create-title
	@FindBy(xpath="//div/input[@type='text']")
	private WebElement title;

	//create-status active
	public void create_active(String createactive) {
		WebElement createactivestatus = driver.findElement(By.xpath("(//div/select/option[contains(text(),'"+createactive+"')])[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",createactivestatus);

	}

	//create-status inactive
	public void create_inactive(String createinactive) {
		WebElement createinactivestatus = driver.findElement(By.xpath("(//div/select/option[contains(text(),'"+createinactive+"')])[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",createinactivestatus);

	}

	//create-click free shipping
	@FindBy(xpath="//div/input[@class='form-check-input']")
	private WebElement freeshipping;

	//create-save
	@FindBy(xpath="//div/button[@id='submit']")
	private WebElement save;

	//create-discard
	@FindBy(xpath="(//div/button[@type='reset'])[2])")
	private WebElement discard;

	// click particular checkbox

 

    public void click_singlecheckbox(String method){

 

        WebElement singlebox= driver.findElement(By.xpath("(//tr/td/input[@type='checkbox'])[1]"));

 

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",singlebox);

 

    }
          //td[contains(text(),"ST Courier")]/ancestor::tr/td[2]

            //click settings of shipping method

 

     public void click_settingsofshippingmethod(String method){

 

     WebElement settings= driver.findElement(By.xpath(" //td[contains(text(),'"+method+"')]/following-sibling::td[3]/a[1]"));

 

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",settings);

 

    }    
              //td[contains(text(),'ST Courier')]/following-sibling::td[3]/a[1]

     //settings-create
     @FindBy(xpath="//div/a/span[text()='+create']")
     private WebElement settingscreate;

     //settings-create select country

//     public void selectcountry(String country) {
//    	 WebElement selectcountry = driver.findElement(By.xpath("//span/ul/li[contains(text(),'"+country+"')]"));
//         selectcountry.sendKeys(country);
//     }

     //settings-actionsubmit
     @FindBy(xpath="//button[@type='submit']")
     private WebElement settingsactionsubmit;


     //settings-create city
     @FindBy(xpath="//div/input[@name='city_name']")
    private WebElement city;

     //settings-create estimated days
     @FindBy(xpath="//div/input[@name='estimated_days']")
     private WebElement estimateddays;

     //settings- create estimate delivery note
     @FindBy(xpath="//div/input[@name='estimate_delivery']")
     private WebElement deliverynotes;

     //settings-create rate
     @FindBy(xpath="//div/input[@id='rate']")
     private WebElement rate;

     //settings-create postcode
     @FindBy(xpath="//div/input[@placeholder='Postcode']")
     private WebElement postcode;

     //settings-create status active
     @FindBy(xpath="//div/select[@name='status']/option[1]")
     private WebElement createactive;

     //settings-create status inactive
     @FindBy(xpath="//div/select[@name='status']/option[2]")
     private WebElement createinactive;

     //settings-create save
     @FindBy(xpath="//div/button[@id='submit']")
     private WebElement setting_createsave;

     //settings-edit

     public void click_settingsedit(String settingedit) {
    	WebElement edit= driver.findElement(By.xpath("//h5[contains(text(),'"+settingedit+"')]/ancestor::td/following-sibling::td[3]/a"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();",edit);
    	edit.click();

 

     }

     @FindBy(xpath="//h2[text()='Shipping Location']")
     private WebElement settingshippinglocations;


     public void captureshippinglocations() {
    	 System.out.println(settingshippinglocations.getText());
     }
     //settings-edit 

   //  (//td[contains(text(),'India')])[1]/following-sibling::td[5]



     //click edit of shipping method
     public void click_editofshippingmethod(String editmethod){

 

         WebElement edit= driver.findElement(By.xpath("//td[contains(text(),"+editmethod+")]/following-sibling::td[3]/a[2]"));

 

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",edit);

 

        } 

     //settings-edit-shippinglocations
     @FindBy(xpath="//a[text()='Shipping Locations']")
     private WebElement shippinglocations;

     public void clickeditshippinglocations() {
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();",shippinglocations);

     }


     //edit-title

     @FindBy(xpath="//div/input[@name='title']")
     private WebElement edit_title;

     //edit-status active
     @FindBy(xpath="//div/select[@class='form-select ']/option[2]")
     private WebElement edit_active;

     //edit-status inactive
     @FindBy(xpath="//div/select[@class='form-select ']/option[3]")
     private WebElement edit_inactive;

     //edit-free shipping
     @FindBy(xpath="//div/input[@name='is_free']")
     private WebElement edit_freeshipping;

     //edit-submit
     @FindBy(xpath="(//div/button[text()='Submit'])[2]")
     private WebElement edit_submit;


    //settings-country
     public void selectcountry(String countrytxt) {
    	 WebElement country = driver.findElement(By.xpath("//span/ul/li[contains(text(),'"+countrytxt+"')]"));
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();",country);

 

     }

   //settings-state
     public void selectstate(String searchtxt) {
    	 WebElement statesearch = driver.findElement(By.xpath("//input[@role='searchbox']"));
         statesearch.sendKeys(searchtxt);

 

     }
     public void clickstate() {
    	 WebElement state = driver.findElement(By.xpath("//div[text()='Tamil Nadu']"));
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();",state);

 

     }

     //settings-edit-city

     @FindBy(xpath="//div/input[@placeholder='City']")
     private WebElement edit_city;

     //settings-edit-delivery day
     @FindBy(xpath="//div/input[@name='estimated_days']")
	private WebElement edit_deliveryday;

     //settings edit-deliverynotes

     @FindBy(xpath="//div/input[@name='estimate_delivery']")
     private WebElement edit_deliverynotes;

     //settings-edit-rate
     @FindBy(xpath="(//div/input[@type='text'])[4]")
     private WebElement edit_rate;

     //settings-edit- postcode
     @FindBy(xpath="//div/input[@name='postcode']")
     private WebElement edit_postcode;

     //settings-edit status active
     @FindBy(xpath="//div/select[@name='status']/option[1]")
     private WebElement settingsedit_active;

     //settings-edit status inactive
     @FindBy(xpath="//div/select[@name='status']/option[2]")
     private WebElement settingsedit_inactive;

     //settings-edit save
     @FindBy(xpath="//div/button[@id='submit']")
     private WebElement setting_editsave;

	//settings-edit-back to shipping location
     @FindBy(xpath="//li/a[text()='Shipping Locations']")
     private WebElement settings_shippinglocations;

	//shipping methods-edit-back to shipping methods
     @FindBy(xpath="//li/a[text()='Shipping Methods']")
     private WebElement edit_shippingmethods;

     //naviagate arrow in header
     @FindBy(xpath="(//div/nav/ul/li[last()]/a)[1]")
     private WebElement headerarrownext;

     //navigate arrow in footer
     @FindBy(xpath="(//div/nav/ul/li/a[@rel='prev'])[2]")
     private WebElement bottomarrowprev;

     //get edittilemsg

     @FindBy(xpath="//div[@class='alert alert-success']")
     private WebElement editsuccess;



   //get message
   	 @FindBy(xpath ="//h2[@id='swal2-title']")

 

        private WebElement message;

	//methods
     public void captureshippingmethods() {
    	 System.out.println(shippingmethodtxt.getText());
     }

     public void clickallcheckbox() {
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();",allcheckbox);

 

     }

     public void clickcreate() {
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();",create);

 

     }

     public void createtitle(String titletxt) {
    	 title.clear();
    	 title.sendKeys(titletxt);
     }

     public void clickfreeshipping() {
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();",freeshipping);

 

     }

     public void clicksave() {
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();",save);

 

     }

     public void clickdiscard() {
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();",discard);

 

     }

     public void settings_create() {
         ((JavascriptExecutor) driver).executeScript("arguments[0].click();",settingscreate);

 

     }

     public void settings_city(String cityname) {
    	 city.clear();
    	 city.sendKeys(cityname);
     }

     public void settings_deliverydays(String days) {
    	 estimateddays.clear();
    	 estimateddays.sendKeys(days);
     }

     public void settings_deliverynotes(String notes) {
    	 deliverynotes.clear();
    	 deliverynotes.sendKeys(notes);
     }

     public void settings_rate(String rates) {
    	 rate.clear();
    	 rate.sendKeys(rates);
     }

     public void settings_postcode(String pincode) {
    	 postcode.clear();
    	 postcode.sendKeys(pincode);

     }

     public void createactive() {
    	 createactive.click();
     }

     public void createinactive() {
    	 createinactive.click();
     }
	public void settings_save() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",setting_createsave);

 

		//setting_createsave.click();
	}
	public void settingsedit_city(String editcity) {
		edit_city.clear();
		edit_city.sendKeys(editcity);
	}

	public void settingsedit_days(String editdays) {
		edit_deliveryday.clear();
		edit_deliveryday.sendKeys(editdays);
	}

	public void settingsedit_notes(String editnotes) {
		edit_deliverynotes.clear();
		edit_deliverynotes.sendKeys(editnotes);
	}

	public void settingsedit_rate(String editrate) {
		edit_rate.clear();
		edit_rate.sendKeys(editrate);
	}

	public void settingsedit_postcode(String editpostcode) {
		edit_postcode.clear();
		edit_postcode.sendKeys(editpostcode);

	}

	public void settingsedit_active() {
		settingsedit_active.click();
	}
	public void settingsedit_inactive() {
		settingsedit_inactive.click();
	}
	public void settingsedit_save() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",setting_editsave);

 

		//setting_editsave.click();
	}

	public void edit_title(String edittitle) {
		edit_title.clear();
		edit_title.sendKeys(edittitle);
	}
	public void edit_active() {
		edit_active.click();
	}
	public void edit_inactive() {
		edit_inactive.click();
	}
	public void clickedit_freeshipping() {
		edit_freeshipping.click();
	}
	public void edit_submit() {
		edit_submit.click();
	}
	public void settingsedit_shippinglocations() {
		settings_shippinglocations.click();
	}
	public void edit_shippingmethods() {
		edit_shippingmethods.click();
	}
	public void actionsubmit() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",settingsactionsubmit);

 

	}
	//header arrownext
	public void headerarrownxt() {
		 System.out.println(driver.getCurrentUrl());
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",headerarrownext);

 

	 }
	 public void bottomarrowprev() {
		 System.out.println(driver.getCurrentUrl());
	//	 Actions a = new Actions(driver);
		// WebElement bottomarrprev = driver.findElement(By.xpath("//div/nav/ul/li[1]/a"));

		// a.moveToElement(bottomarrprev).click().perform();


 

	((JavascriptExecutor) driver).executeScript("arguments[0].click();",bottomarrowprev);

 

	 }

	 //getedit successmsg
	 public void geteditsuccessmsg() {
		 System.out.println(editsuccess.getText());
	 }

	 //getmessage
	 public void getmessage() {

 

	     System.out.println(message.getText());

 

	}

	 public void titleerrormsg() {
		 System.out.println(title.getAttribute("validationMessage"));

 

		   }

	 public void settingscreate_dayserrormsg() {
		 System.out.println(estimateddays.getAttribute("validationMessage"));

 

		   }
	 public void settingscreate_rateerrormsg() {
		 System.out.println(rate.getAttribute("validationMessage"));
	 }
	 public void settingsedit_dayserrormsg() {
		 System.out.println(edit_deliveryday.getAttribute("validationMessage"));

 

	 }
	 public void settingsedit_rateerrormsg() {
		 System.out.println(edit_rate.getAttribute("validationMessage"));

 

	 }

	 public void edittitle_errormsg() {
		 System.out.println(edit_title.getAttribute("validationMessage"));

 

	 }
}
