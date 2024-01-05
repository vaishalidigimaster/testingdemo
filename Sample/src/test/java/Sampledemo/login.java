package Sampledemo;

public class login  {

	              private webDriver  driver;

	 

	    //Singlebag LOGO

	    @FindBy(xpath="//img[@class='top-logo switcher-logo']")

	    private WebElement webHomeLogo;

	      //Register button

	    @FindBy(xpath = "//a[contains(text(),'Not registered yet?  Create a Store ')]")

	    private WebElement registerStoreLink;

	    //Get Started Button

	    @FindBy(xpath = "//a[contains(text(),'Get started')]")

	    private WebElement getStartedLink;

	     //Shop Name Field

	    @FindBy(xpath = "//input[@name='shop_name']")

	    private WebElement storeNameField;

	     //Verify Store button

	    @FindBy(xpath = "//button[contains(text(),' Verify')]")

	    private WebElement verifyStoreButton;

	   

	  //error

	    @FindBy(xpath="//div[@class='shop-helper error-txt']")

	    private WebElement shopname_error;

	   

	    public loginpage_verifystore(WebDriver driver) {

	        this.driver = driver;

	        PageFactory.initElements(driver, this);

	 

	    }

	  

	    

	    //click singlebag logo

	    public void clickWebHomeLogo() {

	        webHomeLogo.click();

	       }

	   

	       //click register link

	    public void click_create_StoreLink() {

	        registerStoreLink.click();

	      

	    }

	 


	     //click get started link

	    public void clickGetStartedLink() {

	        getStartedLink.click();

	       

	    }

	 

	    public void shopname_errormessage() {

	              String shopnameerror = shopname_error.getText();

	              System.out.println(shopnameerror);

	       

	    }

	 

	    //enter store name

	    public void enterStoreName(String storeName) {

	        storeNameField.clear();

	        storeNameField.sendKeys(storeName);

	    }

	 

	    //click verify button

	    public void clickVerifyStoreButton() {

	        verifyStoreButton.click();

	    }

	 

	 

	    //Valid Store credentials

	    public void isadminpanel(String storename) {

	        if ( driver.getCurrentUrl().equals("https://'"+storename+"'.pay380.com/seller/dashboard")) { 
	        		

	              System.out.println("Dashboard is displayed");   

	        }
	    
	        else {  
	        	 
	            System.out.println("Dashboard is not displayed");

	            }
	    }
        
	
	

	      

	 

	   

	    //Valid Store name

	    public void isinstamartLoginPage(String storename) {

	 

	        if(driver.getCurrentUrl().equals("https://'"+storename+"'.pay380.com/login")) {   

	        System.out.println("Store Login page is displayed");   

	        }

	 

	        else {   

	        System.out.println("Store Login page is not displayed");

	        }}

	  

	    

	        public void issinglebagwebsite() {

	            if(driver.getCurrentUrl().equals("https://singlebag.com/")) {

	                System.out.println("Singlebag website is displayed");

	            }

	            else {

	                System.out.println("Singlebag Website is not displayed");

	            }

	        }

	       

	        

	        public void isregistrationpage() {

	            if(driver.getCurrentUrl().equals("https://app.pay380.com/store/register")) {

	                System.out.println("Registration Page is displayed");

	            }

	            else {

	                System.out.println("Registration is not displayed");

	            }

	        }

	 

	 

	}

	 




}
