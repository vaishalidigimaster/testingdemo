package com.sb.pageobject.dashboard.seller;

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

public class Dashboard  extends Baseclass{
	private WebDriver driver;
	
	 public Dashboard(WebDriver driver) {
	        this.driver = driver;  
	        PageFactory.initElements(driver, this);

	    }
	
	// click order
	@FindBy(xpath = "(//span[@class='menu-title text-truncate'])[2]")
    private WebElement order;
	
	//click point of sale
	 @FindBy(xpath = "//span[contains(text(),'Point Of Sales')]")
	    private WebElement pos;
	 
	 //click seo of online store
	 @FindBy(xpath = "//span[contains(text(),'SEO')]")
	    private WebElement seo;
	 
	//click sliders of online store
		 @FindBy(xpath = "//span[contains(text(),'Sliders')]")
		    private WebElement sliders;
	 
		//click bumpads of online store
		 @FindBy(xpath = "//span[contains(text(),'Bump Ads')]")
		    private WebElement bumpads;	 
		 
		//click bannerads of online store
		 @FindBy(xpath = "//span[contains(text(),'Banner Ads')]")
		    private WebElement bannerads;
		 
		 //click menus of online store
		 @FindBy(xpath = "//span[contains(text(),'Menus')]")
		    private WebElement menus;
	 
	//click online store
		 @FindBy(xpath = " (//span[@class='menu-title text-truncate'])[10]")
		    private WebElement onlinestore;
	 
	
	 
	 //click users
	    @FindBy(xpath = "//span[contains(text(),'Users')]")
	    private WebElement usersinPOS;
	
	// click products
		@FindBy(xpath = "(//span[@class='menu-title text-truncate'])[3]")
	    private WebElement products;
		
		// click attribute
		@FindBy(xpath = "(//i[@class='ph-circle-bold'])[7]")
	    private WebElement attribute;
		
		// click coupon
				@FindBy(xpath = "(//i[@class='ph-circle-bold'])[10]")
			    private WebElement coupon;
		
	
		// click allproducts
				@FindBy(xpath = "(//i[@class='ph-circle-bold'])[4]")
			    private WebElement allproducts;
		
		
	// click marketing tools
	@FindBy(xpath="//span[text()='Marketing Tools']")
	private WebElement Marketingtools;
	
	//click shops
	@FindBy(xpath = "(//span[@class='menu-title text-truncate'])[5]")
    private WebElement shops;
	
	//click cancelled- order
	@FindBy(xpath = "(//a[@class='d-flex align-items-center'])[4]")
    private WebElement cancelledorder;
	
	//click transaction -order
	@FindBy(xpath = "(//a[@class='d-flex align-items-center'])[5]")
    private WebElement transactionorder;
	
	//click Delivery agent
		@FindBy(xpath = "(//span[@class='menu-title text-truncate'])[7]")
	    private WebElement deliveryagent;
	
		//click Delivery agent
				@FindBy(xpath = "(//span[@class='menu-item text-truncate'])[6]")
			    private WebElement allagents;
				
				
				
				//settings
		        @FindBy(xpath = "//span[@data-i18n='Settings']")
		        private WebElement settings;

		 

		        //store settings
		        @FindBy(xpath = "//span[contains(text(),'Store Settings')]")
		        private WebElement storeSettings;
		
	//click allorder -order
		@FindBy(xpath = "(//a[@class='d-flex align-items-center'])[3]")
	    private WebElement allorder;

    @FindBy(xpath = "//div[@class='form-switch form-check-success']")
    private WebElement onlineSwitch;

    //offline mode

    @FindBy(xpath="//span[@class='switch-icon-left']")
    private WebElement offlinemode;

    //online mode
    @FindBy(xpath="//span[@class='switch-icon-right']")
    private WebElement onlinemode;

    //checkbox of onlinemode
    @FindBy(xpath = "//input[@name='shop_mode_duration']")
    private List<WebElement> onlinecheckbox;    

    //submit of online
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement submit_online;

    //Language dropdown
    @FindBy(xpath = "//a[@id='dropdown-flag']")
    private WebElement languagechoose;

    //dropdown for  language_dropdown_option and seller name option
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    private WebElement language_dropdown_option;

    //Profile
    @FindBy(xpath = "//img[@class='round']")
    private WebElement seller_profile;

    //profile setting
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    private WebElement profile_settingsOption;

    //singlebag community
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    private WebElement singlebag_community;

    //logout
    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    private WebElement logout;    

    //First name field
    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstNameInput;

    //last name field
    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastnameInput;

    //email field
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;        

    //Save button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement updateButton;        

    //old password
    @FindBy(xpath = "(//input[@type='password'])[1]")
     private WebElement oldpass;

     // new password
    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement newpass;

    // conform new password
    @FindBy(xpath = "(//input[@type='password'])[3]")
    private WebElement newconfrmpass;

    //Home link
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement homeLink;

    //Toggler Icon button
    @FindBy(xpath = "//li[@class='nav-item nav-toggle']")
    private WebElement iconButton;
 
    //order Month button
    @FindBy(xpath ="//div[@class='btn-group']")
    private WebElement ordersmonthdropdown;

    //order month dropdown button
    @FindBy(xpath ="//a[@class='dropdown-item month']")
    private WebElement choosemonth;

     //earning performance Month dropdown
    @FindBy(xpath = "//a[@class='dropdown-item month']")
    private WebElement earningmonthdropdown;    

    //Add categories button

    @FindBy(xpath = "(//span[contains(text(),'Add +')])[1]")
    private WebElement addCategoriesButton;

    //Add brands button
    @FindBy(xpath = "(//span[contains(text(),'Add +')])[2]")
    private WebElement addBrandsButton;

    //Add attributes button

    @FindBy(xpath = "(//span[contains(text(),'Add +')])[3]")
    private WebElement addAttributesButton;
    
    //Add products button
    @FindBy(xpath = "(//span[contains(text(),'Add +')])[4]")
    private WebElement addProductsButton;

    //Themes
    @FindBy(xpath = "(//span[contains(text(),'Theme')])[2]")
    private WebElement themesButton;

    //Banner ads
    @FindBy(xpath = "//span[contains(text(),'Banners')]")
    private WebElement bannersButton;

    //Bump Ads
    @FindBy(xpath = "//span[contains(text(),'Bumps')]")
    private WebElement bumpsButton;

    //Sliders
    @FindBy(xpath = "(//span[contains(text(),'Sliders')])[2]")
    private WebElement slidersButton;

    //Store details
    @FindBy(xpath = "//span[contains(text(),'Store Details')]")
    private WebElement storeDetailsButton;

    //Logo&Favicon

    @FindBy(xpath = "//span[contains(text(),'Logo & Favicon')]")
    private WebElement logoFaviconButton;


    //Menus
@FindBy(xpath = "(//span[contains(text(),'Menus')])[2]")
  private WebElement menusButton;

  //Pages
 @FindBy(xpath = "(//span[contains(text(),'Pages')])[2]")
 private WebElement pagesButton;
 
 //Shipping Address
    @FindBy(xpath = "//span[contains(text(),'Shipping Method & Location')]")
 private WebElement shippingButton;

    //Users
  @FindBy(xpath = "(//span[contains(text(),'User Terms')])[2]")
  private WebElement userTermsButton;

 //Payment
  @FindBy(xpath = "(//span[contains(text(),'Payment Options')])[2]")
  private WebElement paymentButton;

//Earning performance dropdown
 @FindBy(xpath = "(//select[@class='form-select'])[1]")
 private WebElement earningPerformanceDropdown;

 //QR button

  @FindBy(xpath = "//button[@class='btn btn-primary col-12 waves-effect waves-float waves-light']")
  private WebElement qrButton;

  //Site Analytics dropdown
  @FindBy(xpath = "(//select[@class='form-select'])[2]")
 private WebElement siteAnalyticsDropdown;

 //Up button
  @FindBy(xpath = "(//button[@type='button'])[4]")
  private WebElement upButton;
  
//click analytics
  @FindBy(xpath = "(//span[@class='menu-title text-truncate'])[4]")
  private WebElement analytics;

  //click customers
  @FindBy(xpath="//span[text()='Customers']")
	private WebElement customers;
	
	@FindBy(xpath="//span[text()='Review & Ratings']")
	private WebElement ReviewsandRatings;
	
//click all customers in customer
	@FindBy(xpath="//span[text()='All Customers']")
	private WebElement allcustomerincustomer;
	
	//customers in dashboard
	public void clickcustomers() {
	  customers.click();
	}
	
	//review and rating in dashboard
	public void clickReviewsandRatings(){
		ReviewsandRatings.click();
		
	}

//click analytics
  public void clickAnalytics() {
      analytics.click();
  }

  

    //online button
  public void clickOnlineSwitch() {
    onlineSwitch.click();
  }

 public Dashboard(List<WebElement> onlineCheckboxes) {
        this.onlinecheckbox = onlineCheckboxes;
    }
 
  public void  onlinecheckbox(String onlinemode) {            
     for(WebElement onlinebox:onlinecheckbox) {
     String onlineoption = onlinebox.getAttribute("for");
    if (onlineoption != null && onlinemode.contains(onlinemode)) {
        onlinebox.click();
            break;

        }}
    }

//submit button
 public void online_submitButton() {
    submit_online.click();
    }

    //language dropdown
    public void Languagechoose() {
        languagechoose.click();

    }

//    //offline mode 
    public boolean Offlinemode() {
        return offlinemode.isEnabled();
    }


    //online mode
    public boolean Onlinemode() {
        return onlinemode.isEnabled();
    }

    //language dropdown options
    public void Languagedropdownoption(String language) {
        language_dropdown_option.click();
        Select  s = new Select(language_dropdown_option);
        s.selectByVisibleText(language);
        System.out.println(s.getFirstSelectedOption());
    }


    //first name field
public void openProfileDropdown() {
   seller_profile.click();

    }

//Profile

 public void profile_Settings() {
     profile_settingsOption.click();

    }

//first name field
    public void enterFirstName(String firstName) {
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);

    }


    //second name field
public void enterSecondName(String secondName) {
  lastnameInput.clear();
   lastnameInput.sendKeys(secondName);

    }

    //email field
    public void email(String emailid) {
        email.clear();
        email.sendKeys(emailid);

    }


    //update button
    public void updateProfile() {
 updateButton.click();

    }

    //old password

    public void old_password(String oldpassword) {
   oldpass.clear();
     oldpass.sendKeys(oldpassword);
    }

    //new password
public void new_password(String newpassword) {
 newpass.clear();

 newpass.sendKeys(newpassword);
    }

    //confirm new password
    public void new_cfrmpassword(String newcfrmpassword) {
  newconfrmpass.clear();
   newconfrmpass.sendKeys(newcfrmpassword);

    }

    //update button
public void update_changepassword() {
   updateButton.click();
}

    //singlebag community
    public void clicksinglebag_community() {
    singlebag_community.click();
    }

    //logout
    public void clicklogout() {
   logout.click();

    }

    //home navigation
    public void navigateToHome() {
        homeLink.click();
    }

    //icon button
    public void openIconMenu() {
        iconButton.click();

    }
    
 //Month dropdown
    public void Ordersmonthdropdown() {
 ordersmonthdropdown.click();
}

    //choose month
    public void choosemonth(String month) {
      Select s1= new Select(choosemonth);
       s1.selectByVisibleText(month);
       System.out.println(s1.getFirstSelectedOption().getText());

    }
    
  //Add categories button
    public void clickAddCategories() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",addCategoriesButton);
    

    }

    //Add brands button
    public void clickAddBrands() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",addBrandsButton);
  
    }

    //Add attributes button
    public void clickAddAttributes() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",addAttributesButton);
     
  }

    //Add products button
    public void clickAddProducts() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",addProductsButton);
      
 }

    //Themes
    public void clickThemes() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",themesButton);
      
    }

    //Banner ads
 public void clickBanners() {
	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bannersButton);
 

    }

    //Bump ads
    public void clickBumps() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", bumpsButton);
  

    }

    //Slider
 public void clickSliders() {
	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", slidersButton);
  

    }

    //Store details
    public void clickStoreDetails() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",storeDetailsButton);
 
    }

    //Logo&Favicon
 public void clickLogoFavicon() {
	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();",logoFaviconButton);
    

    }

    //Menus
 public void clickMenus() {
	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();",menusButton);
      
    }


    //Pages
  public void clickPages() {
	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pagesButton);
               

    }

    //Shipping
    public void clickShipping() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",shippingButton);
   

    }

    //Users
 public void clickUserTerms() {
	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", userTermsButton);
   
    }

    //Payment settings
  public void clickPayment() {
	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", paymentButton);
       
    }
    
 //Earning performance
    public void earningperformancedropdown(int i) {
     earningPerformanceDropdown.click();

        Select s2= new Select(earningPerformanceDropdown);

        s2.selectByIndex(1);

        System.out.println(s2.getFirstSelectedOption());

    }

    //Click QR Code
    public void clickQR() {
       qrButton.click();
  }

    //Site analytics
    public void siteanalyticsdropdown(int i) {

         siteAnalyticsDropdown.click();

         Select s3= new Select(siteAnalyticsDropdown);
    s3.selectByIndex(1);
      System.out.println(s3.getFirstSelectedOption());

    }

    public void clickUp() {
        upButton.click();
    }

    //  / 
    public void click_order() {
        order.click();
    }  
    
    public void click_cancelorder() {
        cancelledorder.click();
    }
    public void click_transactionorder() {
       transactionorder.click();
    }
    public void click_allorder() {
        allorder.click();
     }
    
    public void click_shop() {
        shops.click();
     }
    
    public void click_marketingtool() {
        Marketingtools.click();
     }
    
    public void click_deliveryagent() {
        deliveryagent.click();
     }
    
    public void click_allagents() {
         allagents.click();
      }

	public void clickallcustomers() {
		
		allcustomerincustomer.click();
	}
	
public void clickPOS() {
		Actions a=new Actions(driver);
		
		a.moveToElement(pos).click().build().perform();
		
	}

public void click_usersinPOS() {
	Actions a=new Actions(driver);
	
	a.moveToElement(usersinPOS).click().build().perform();
	
}

public void click_onlinestore() {
	Actions a=new Actions(driver);
	
	a.moveToElement(onlinestore).click().build().perform();
	
}

public void click_onlinestoreSEO() {
	Actions a=new Actions(driver);
	
	a.moveToElement(seo).click().build().perform();
	
}

public void click_onlinestoreSliders() {
	Actions a=new Actions(driver);
	
	a.moveToElement(sliders).click().build().perform();
	
}


public void click_onlinestoreBumpads() {
	Actions a=new Actions(driver);
	
	a.moveToElement(bumpads).click().build().perform();
	
}

public void click_onlinestoreBannerads() {
	Actions a=new Actions(driver);
	
	a.moveToElement(bannerads).click().build().perform();
	
}

public void click_onlinestoremenus() {
	Actions a=new Actions(driver);
	
	a.moveToElement(menus).click().build().perform();
	
}






// click products in dashboard menu
public void click_products() {
    products.click();
 }


// click attribute in products
public void click_attribute_products() {
   attribute.click();
 }

//click coupon in products
public void click_coupon_products() {
coupon.click();
}


//click-settings
public void click_settings() {
 	   Actions a = new  Actions(driver);

 	   WebElement settings = driver.findElement(By.xpath("(//span[@class='menu-title text-truncate'])[8]"));
       a.moveToElement(settings).click().perform();
}

//setting-userterms
public void clickusertermsinsetting() {
 	   Actions a = new  Actions(driver);
 	   WebElement userterms = driver.findElement(By.xpath("(//span[@class='menu-item text-truncate'])[12]"));

	   a.moveToElement(userterms).click().perform();
	   

}
//settings-plans
public void clickplansetting() {
	Actions a = new  Actions(driver);
	WebElement plans = driver.findElement(By.xpath("(//span[@class='menu-item text-truncate'])[10]"));
	a.moveToElement(plans).click().perform();
}
//settings-subscription history
public void clicksubscriptionhistorysettings() {
	Actions a = new  Actions(driver);
	WebElement subscription = driver.findElement(By.xpath("(//span[@class='menu-item text-truncate'])[11]"));
	a.moveToElement(subscription).click().perform();
}
//settings-payment option
public void clickpaymentoptionsettings() {
	Actions a = new  Actions(driver);
	WebElement paymentoption = driver.findElement(By.xpath("(//span[@class='menu-item text-truncate'])[8]"));
    a.moveToElement(paymentoption).click().perform();


}

//settings
public void clicksettings() {
    settings.click();
}

//Store settings
public void clickstoresettings() {
    storeSettings.click();
}


//Brands

 @FindBy(xpath = "//a[contains(text(),'Brands')]")

 private WebElement brands;




 // Brands

 public void clickbrands() {

     brands.click();

 }
 
 //Brands

 @FindBy(xpath = "(//span[text()='Pages'])[1]")

 private WebElement pagesofonlinestore;


 //click online store-Pages

 public void click_Pagesonlinestore() {

     Actions a = new  Actions(driver);


     a.moveToElement(pagesofonlinestore).click().perform();

 } 
 
//Inventory

@FindBy(xpath = "(//i[@class='ph-circle-bold'])[5]")

private WebElement inventory;
 
//click products-inventory

 public void click_products_inventory() {

  Actions a=new Actions(driver);


  a.moveToElement(inventory).click().build().perform();


}
 
	//product options
	 @FindBy(xpath  ="(//a[contains(text(),'Product Options')])[1]")
		private WebElement productoption;	
	 
	 
	 //navigate click product option
		public void clickproductoption_products() {						 		 
			productoption.click();
		  		}
		
		
//settings-shippingmethod

	    

	    public void clickshippingmethod() {

	    	Actions a=new Actions(driver);

	    	WebElement shippingmethod = driver.findElement(By.xpath("(//span[@class='menu-item text-truncate'])[9]"));

	        a.moveToElement(shippingmethod).click().perform();

	    }
	    
	    
	    
	  //products-all products

		public void clickallproducts() {

			allproducts.click();

		}
		
		
		//pos product


			@FindBy(xpath = "//span[contains(text(),'POS Products')]")

		 

			private WebElement Posproducts;


		

		public void click_POSProducts() {

		 

				Actions a = new Actions(driver);

		 

				a.moveToElement(Posproducts).click().build().perform();

		 

			}

 
}


	
	
