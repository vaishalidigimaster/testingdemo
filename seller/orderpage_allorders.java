package com.sb.pageobject.order.seller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;

public class orderpage_allorders extends Baseclass {
private WebDriver driver;
	
	public orderpage_allorde(WebDriver driver) {
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	

	// filter icon
	@FindBy(xpath  ="//i[@class='ph-funnel-bold font-medium-3']")
	private WebElement filterfunnel;
	
	//payment status in filter
	@FindBy(xpath  ="//select[@id='payment_status']")
	private WebElement paymentstatus;
	
	//fulfillment
	@FindBy(xpath  ="//select[@id='status']")
	private WebElement fulfillment;
	
	//starting date
	@FindBy(xpath  ="//input[@id='start']")
	private WebElement startingdate;
	
	//ending date
	@FindBy(xpath  ="//input[@id='end']")
	private WebElement endingdate;
	
	//
	@FindBy(xpath  ="//a[contains(text(),'Clear Filter')]")
	private WebElement clearfilter;
	
	@FindBy(xpath  ="//button[contains(text(),'Filter')]")
	private WebElement filter;
	
	@FindBy(xpath  ="(//input[@class='numInput cur-year'])[1]")
	private WebElement startingyear;
	
	@FindBy(xpath  ="(//input[@class='numInput cur-year'])[2]")
	private WebElement endyear;
	
	@FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[1]")
	private WebElement startingmonth;
	
	
	@FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[2]")
	private WebElement endmonth;

	@FindBy(xpath  ="(//span[@class='flatpickr-day '])")
	private WebElement date;
	

	@FindBy(xpath  ="//input[@name='src']")
	private WebElement searchinput;

	@FindBy(xpath  ="//i[@class='ph-magnifying-glass-bold']")
	private WebElement searchicon;
	
	@FindBy(xpath  ="//tr/td[1]/a")
	private List<WebElement> ordernolist;
	
	@FindBy(xpath  ="//tr/td[2]/a")
	private List<WebElement> orderdatelist;
	
	@FindBy(xpath  ="//tr/td[3]/a")
	private List<WebElement> customerinfolist;
	
	@FindBy(xpath  ="//h2[@class='content-header-title float-start mb-0']")
	private WebElement title;
	
//  search result
			@FindBy(xpath  ="(//tbody/tr)")
			private List<WebElement> searchresult;
	
	public void filter_funnel() {
		filterfunnel.click();
	}
	public  void starting_date(String year, String month, String date) {
		 
	        startingdate.click();
                implicitwait();
	        // Select the desired year
                startingyear.clear();
                startingyear.sendKeys(year);
                implicitwait();

	        // Select the desired month
	        startingmonth.click();
	      //  wait_for_visibilty(By.xpath("//option[text()='" + month + "']"));
	        WebElement monthOption = driver.findElement(By.xpath("(//option[text()='" + month + "'])[1]"));
	        monthOption.click();
            //   wait_for_visibilty(By.xpath("//option[text()='" + date + "']"));
	        // Select the desired date
	        WebElement dateCell = driver.findElement(By.xpath("(//span[text()='" + date + "'])[1]"));
	        dateCell.click();

	    }
	
	public  void ending_date(String year, String month, String date) {
		 
		endingdate.click();
         implicitwait();
     // Select the desired year
         endyear.clear();
         endyear.sendKeys(year);
         implicitwait();

     // Select the desired month
     endmonth.click();
     wait_for_visibilty(By.xpath("(//option[text()='" + month + "'])[2]"));
     WebElement monthOption1 = driver.findElement(By.xpath("(//option[text()='" + month + "'])[2]"));
     monthOption1.click();
     //wait_for_visibilty(By.xpath("//option[text()='" + date + "']"));
     // Select the desired date
     WebElement date2 = driver.findElement(By.xpath("(//span[text()='" + date + "'])[2]"));
     date2.click();

    }
	
public void payment_status(String pstatus) {
	paymentstatus.click();
	Select s= new Select(paymentstatus);
	s.selectByVisibleText(pstatus);
	System.out.println(s.getFirstSelectedOption().getText());
}
public void fulfillment(String status) {
	fulfillment.click();
	Select s= new Select(fulfillment);
	s.selectByVisibleText(status);
	System.out.println(s.getFirstSelectedOption().getText());
}

public void clear_filter() {
	clearfilter.click();
}

public void filter() {
	filter.click();
	
}
 
public void search(String Orderno) {
	searchinput.sendKeys(Orderno);
	searchicon.click();
}

public void click_orderno(String order_no) {
	for (WebElement orderno : ordernolist) {
	if(orderno.getText().equals(order_no)) {
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",orderno );
    break;
	}}}
	
	

public void click_orderdate(String order_date) {
	for (WebElement orderdate : orderdatelist) {
	if(orderdate.getText().equals(order_date)) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",orderdate );
	    break;
		}}
}

public void click_customer(String customer) {
	for (WebElement customerinfo : customerinfolist) {
	if(customerinfo.getText().equals(customer)) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",customerinfo );
	    break;
		}}
}
public void getordertitle() {
	System.out.println(title.getText());
}

public void getcustomertitle() {
	System.out.println(title.getText());
}
public void getfiltered_ordertitle() {
	System.out.println(title.getText());
}
public void cancelledordertitle() {
	System.out.println(title.getText());
}



// all orders page

//checkbox of order details page
	@FindBy(xpath  ="(//input[@name='mail_notify'])")
	private WebElement checkbox_order;

	//payment status of order details page
		@FindBy(xpath  ="(//select[@class='form-select payment_set'])")
		private WebElement payment;
		
		//delivery status of order details page
				@FindBy(xpath  ="(//select[@name='status'])")
				private WebElement deliverystatus;
				
				//delivery date of order details page
				@FindBy(xpath  ="//input[@type='date']")
				private WebElement deliverydate;
				
				
				//save changes of order details page
				@FindBy(xpath  ="(//button[@type='submit'])[2]")
				private WebElement savechanges;	
				
				//print invoice of order details page
				@FindBy(xpath  ="(//a[text()='Print Receipt'])")
				private WebElement printinvoice;
				
				//download invoice of order details page
				@FindBy(xpath  ="(//a[text()='Download Invoice'])")
				private WebElement downloadinvoice;
				
				//print receipt of invoice page
				@FindBy(xpath  ="(//button[@class='btn btn-primary noPrint'])")
				private WebElement printreceipt;
				
				//title
				@FindBy(xpath ="//h2[@id='swal2-title']")
				private WebElement titleinvoice;
				
				//delivery agent name
				@FindBy(xpath ="//h4[text()='Delivery Agent']")
				private WebElement deliveryagent;
				
				//delivery agent name change
				@FindBy(xpath ="//span[text()='change']")
				private WebElement deliveryagent_change;
				
				//delivery agent  change page
				@FindBy(xpath ="//h1[text()='Change Delivery Agent']")
				private WebElement deliveryagentchange_text;
				
				//delivery agent  change dropdown arrow
				@FindBy(xpath ="//span[@class='select2-selection__arrow']")
				private WebElement deliveryagentchange_arrow;
				
				//delivery agent  change dropdown arrow
				@FindBy(xpath ="//li[@class='select2-results__option']")
				private List<WebElement> deliveryagentchange_list;
				
				//delivery agent  change save
				@FindBy(xpath ="//button[text()='Save']")
				private WebElement deliveryagentchange_save;
				
				//delivery agent  change discard
				@FindBy(xpath ="//button[text()='Discard']")
				private WebElement deliveryagentchange_discard;
				
				//create order button 
		        @FindBy(xpath="//span[contains(text(),'Create Order')]")
		        private WebElement Createorderbtn;
				
				
				
				
			// click checkbox	
		public void click_invoicecheckbox() {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0,500)");
			wait_for_element_to_appear(By.xpath("(//input[@name='mail_notify'])"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",checkbox_order );
		}
		
//			//change payment status	
//		public void paymentstatus_invoice(String status) {
//			if(payment.isEnabled()) {
//			((JavascriptExecutor) driver).executeScript("arguments[0].click();",payment);
//			Select s= new Select(payment);
//				s.selectByVisibleText( status);
//				String paystatus = s.getFirstSelectedOption().getText();
//		System.out.println(paystatus);}
//			else {
//				System.out.println("payment status is disabled");
//			}
//
//
//		}
		
		//change delivery status	
				public void deliverystatus_invoice(String status) {
					if(deliverystatus.isEnabled()) {
					((JavascriptExecutor) driver).executeScript("arguments[0].click();",deliverystatus );
					Select s= new Select(deliverystatus);
						s.selectByVisibleText( status);
						String delistatus = s.getFirstSelectedOption().getText();
				System.out.println(delistatus);}
					
					else {
						System.out.println("Delivery status is disabled");
					}

				}	
				
				
				// click savechanges	
			public void click_savechanges() {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",savechanges );
			}
			
			// click printinvoice	
		public void click_printinvoice() throws InterruptedException {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",printinvoice );
			Thread.sleep(3000);
			System.out.println(printreceipt.isEnabled());
			System.out.println(printreceipt.getText());
			
		}
		
		// click download invoice	
	public void click_downloadinvoice() throws InterruptedException {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",downloadinvoice );
		Thread.sleep(3000);
		
	}
	
	public void title() {
		System.out.println(titleinvoice.getText());
	}
		
	
	public void delivery_agent_change(String agent) {
		if(deliveryagent.isEnabled()) {
			System.out.println(deliveryagent.getText()); 
			deliveryagent_change.click();
			implicitwait();
			System.out.println(deliveryagentchange_text.getText());
			deliveryagentchange_arrow.click();
			for (WebElement agentlist : deliveryagentchange_list) {
				if(agentlist.getText().equals(agent)) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",agentlist );
			    break;
				}}
		deliveryagentchange_save.click();
		}
		else {
			System.out.println("no delivery agent");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
   
    //error msg    

    @FindBy(xpath="//h2[@id='swal2-title']")

    private WebElement errormessage;


    //click one order

    @FindBy(xpath="//tr/td[1]/a")

    private WebElement clickorderID;


    //click one product name

    @FindBy(xpath="//tr/td[3]/a")

    private WebElement clickproductname;


    //first option box

    @FindBy(xpath="(//span[@role='textbox'])[1]")

    private WebElement firstoption;


    //Choose option values

    @FindBy(xpath="//ul[@class='select2-results__options']/li")

    private List<WebElement> choosevalue;


    //second option box

    @FindBy(xpath="(//span[@role='textbox'])[2]")

    private WebElement secondoption;


    //search

    @FindBy(xpath="//input[@type='search']")

    private WebElement searchfield;


    //searched value click

    @FindBy(xpath="//li[@class='select2-results__option select2-results__option--highlighted']")

    private WebElement searchvalueclick;


    //clear quantity value

    @FindBy(xpath="(//input[@type='number'])[1]")

    private WebElement clearquantityvalue;


    //click delete btn

    @FindBy(xpath="(//i[@class='ph-trash'])[1]")

    private WebElement clickdeletebtn;


    //verification

    @FindBy(xpath="//span[contains(text(),'0')]")

    private WebElement verification;







//searchresult
    public void getsearch_result() {
         int size = searchresult.size();
            System.out.println("Size of the result: " + size);    

}

//error msg
public void errormessage() { 
    String err_message = errormessage.getText();
    System.out.println(err_message);
}


//clicking one product
   public void click_productname(String customer) {
       if(clickproductname.getText().equals(customer)) {
           clickproductname.click();}

   }

//clicking customer name
   public void click_oneordeID(String customer) {
       if(clickorderID.getText().equals(customer)) {
           clickorderID.click();}

   }
   //click one product cart
   public void click_oneproductcart(String ID) {    
    WebElement clickoneproductcart = driver.findElement(By.xpath("//button[@id='submitbtn"+ ID +"']"));
       clickoneproductcart.click();    
   }
//get validation message


   public void get_validation() {
String validation = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("validationMessage");
System.out.println(validation);   
   }

//click first option

   public void click_firstoption() {
       firstoption.click();
   }


//clicking customer name

   public void click_onevalue(String Value) {
       for(WebElement option1:choosevalue)
       if(option1.getText().equals(Value)) {
           option1.click();
           }
   }


//second first option

   public void click_secondoption() {
       secondoption.click();
   }


//click first option

   public void enter_search(String value) {
       searchfield.sendKeys(value);
   }


//second first option

   public void click_searchedvalue() {
       searchvalueclick.click();         
   }


   //clear quantity value
   public void clear_quantity() {
       clearquantityvalue.clear();         
   }

   //click delete btn
   public void click_deletebtn() {
       clickdeletebtn.click();         
   }

   //verification

public void get_verification() {

    if(verification.isDisplayed()) {
        System.out.println("Deleted");
    }
    else {
        System.out.println("Not Deleted");
    }
}

	
	
	
	//create order page
	
	@FindBy(xpath = "//a[contains(text(),'Proceed To CheckOut')]")
    private WebElement proceedToCheckoutLink;

	
	//cart button    
    @FindBy(xpath="//a[@type='button']")
    private WebElement cartbtn;
    
    // Elements on the checkout page
    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "phone")
    private WebElement phoneInput;

    @FindBy(xpath = "//select[@class='form-select']")
    private WebElement customertypeDropdown;

    @FindBy(xpath = "//select[@class='form-select type']")
    private WebElement deliverytypeDropdown;

    @FindBy(id = "address")
    private WebElement addressInput;

    @FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
    private WebElement locationtab;
    
    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement locationinput;
    
    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']/div/div/div[1]")
    private List<WebElement> locationlist_fullname;
    
    
    //xpath for choosing location from list without sendkeys 
    @FindBy(xpath = "//li[@class='select2-results__option']/div/div/div[1]")
    private List<WebElement> locationlist;
    
    @FindBy(id = "zip")
    private WebElement zipInput;

    @FindBy(xpath = "(//input[@value='1'])[2]")
    private WebElement paymentcompleted_checkbox;

    @FindBy(xpath = "(//input[@value='1'])[2]")
    private WebElement paymentpending_checkbox;

    @FindBy(xpath = "//input[@name='payment_method']/following-sibling::label")
    private List<WebElement> paymentmethod;

    @FindBy(xpath = "(//input[@name='shipping_mode'])")
    private WebElement shippingmethod;

    @FindBy(xpath = "(//input[@name='payment_id'])")
    private WebElement paymentid;

    @FindBy(xpath = "(//textarea[@name='comment'])")
    private WebElement ordernote;

    @FindBy(xpath = "//input[@placeholder='Promo code']")
    private WebElement promoCodeInput;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement redeemButton;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    private WebElement makeOrderButton;
    
    
    
    public void createorder() {
        Createorderbtn.click();
    }

    //click cart symbol of concern order
    public void clickcartsymbol_ofid(String id) {
    	
    		 WebElement cartbtn = driver.findElement(By.xpath(" //button[@id='submitbtn"+id+"']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",cartbtn ); 
        
        
    }
    
    
  //button[@id='submitbtn1530']
    // Actions on the checkout page
    public void enterName(String name) {
        nameInput.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPhone(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void customertype(int index) {
        Select s = new Select(customertypeDropdown);
        s.selectByIndex(index);
    }

    public void deliverytype(int index) {
        Select s = new Select(deliverytypeDropdown);
        s.selectByIndex(index);
    }

    public void enterAddress(String address) {
        addressInput.sendKeys(address);
    }

 
    public void enterZipCode(String zipCode) {
        zipInput.sendKeys(zipCode);
    }

    public void enterPromoCode(String promoCode) {
        promoCodeInput.sendKeys(promoCode);
    }

    public void clickRedeemButton() {
        redeemButton.click();
    }

    public void locationtabclick() {
    	wait_for_visibilty(By.xpath("//span[@class='select2-selection select2-selection--single']"));
    	locationtab.click(); 
    }
    public void location(String locationname) throws InterruptedException {
    	

wait_for_visibilty(By.xpath("//input[@class='select2-search__field']"));
    	locationinput.sendKeys(locationname);
    	Thread.sleep(2000);
    	for(WebElement location:locationlist_fullname) {
    		if(location.getText().equals(locationname)) {
    			location.click();
    			
    			break;
    		}
    		else {
    			System.out.println("not found");
    		}
    	}
    	
        
    }

    public void completepaymentstatus() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",paymentcompleted_checkbox );
    }
    
    public void pendingpaymentstatus() {
    	paymentpending_checkbox.click();
    }

    public void selectpaymentmethods( String pay) {
        for(WebElement payment:paymentmethod) {
        	if(payment.getText().equals(pay)) {
        		((JavascriptExecutor) driver).executeScript("arguments[0].click();",payment );
        	
        }}
    }

    public void shippingmethods() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",shippingmethod );
        
    }

    public void paymentid(String id) {
        paymentid.sendKeys(id);
    }

    public void ordernote(String note) {
        ordernote.sendKeys(note);
    }
    
    public void clickMakeOrderButton() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", makeOrderButton );
    }
    
    //cart btn
    public void click_cartbtn() {  
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",cartbtn );

    }
    
    
    // Action to click "Proceed To Checkout" link
    public void clickProceedToCheckoutLink() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", proceedToCheckoutLink );
    }
    
    
    
}


