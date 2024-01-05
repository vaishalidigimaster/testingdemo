package com.sb.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.customers.customerpage_reviewandrating;
import com.sb.pageobject.customers.customerspage_allcustomer;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;

public class TC_Customers_seller  extends extentreports{
	@BeforeMethod
	public void browseropening() throws InterruptedException {
 browserlaunch("https://app.pay380.com/verify-store");
	implicitwait();
	loginpage_verifystore vs = new loginpage_verifystore(driver);
	vs.enterStoreName("instamart");

	vs.clickVerifyStoreButton();
	Thread.sleep(1000);
	loginpage_verifyemail ve = new loginpage_verifyemail(driver);
	ve.enterEmail("instamart@example.com");
	ve.enterPassword("12345678");
	
	ve.clickLoginButton();
	}
	
	
	
	//By clicking select all checkbox and choose active from select action dropdown.
    @Test
    public void TC_CF_001() throws InterruptedException {
        test=extent.createTest("TC_CF_001");
        Dashboard d = new Dashboard(driver);

        d.clickcustomers();

        d.clickallcustomers();

        customerspage_allcustomer al=new customerspage_allcustomer(driver);

        al.clickcheckall();

        al.clickselectaction();

        al.selectActive();

        implicitwait();

        al.clicksubmitbtn();

        implicitwait();

        al.getmessage();

        }


    //By clicking select all checkbox and choose inactive from select action dropdown.
    @Test
    public void TC_CF_002() throws InterruptedException {
        test=extent.createTest("TC_CF_002");
        Dashboard d = new Dashboard(driver);

        d.clickcustomers();

        d.clickallcustomers();

        customerspage_allcustomer al=new customerspage_allcustomer(driver);

        al.clickcheckall();

        al.clickselectaction();

        al.selectInActive();

        implicitwait();

        al.clicksubmitbtn();

        implicitwait();

        al.getmessage();

        }


    //By only choosing select action without choosing checkbox
    @Test
    public void TC_CF_003() throws InterruptedException {
        test=extent.createTest("TC_CF_003");
        Dashboard d = new Dashboard(driver);

        d.clickcustomers();

        d.clickallcustomers();

        customerspage_allcustomer al=new customerspage_allcustomer(driver);

        al.clickselectaction();

        al.selectInActive();

        implicitwait();

        al.clicksubmitbtn();

        implicitwait();

        al.getmessage();

        }

    //By choosing one checkbox and choose active and click submit button
    @Test
    public void TC_CF_004() throws InterruptedException {
        test=extent.createTest("TC_CF_004");
        Dashboard d = new Dashboard(driver);

        d.clickcustomers();

        d.clickallcustomers();

        customerspage_allcustomer al=new customerspage_allcustomer(driver);

        al.clickonecheckbox("208");

        al.clickselectaction();

        al.selectInActive();

        implicitwait();

        al.clicksubmitbtn();

        implicitwait();

        al.getmessage();

        implicitwait();

        }

 

    //When I click email of the customers, verify it goes to customer info page or not.
    @Test
    public void TC_CF_005() throws InterruptedException {
        test=extent.createTest("TC_CF_005");
        Dashboard d = new Dashboard(driver);

        d.clickcustomers();

        d.clickallcustomers();

        customerspage_allcustomer al=new customerspage_allcustomer(driver);

        al.clickoneemail();

        implicitwait();

        al.isinfopage();


        }

    //validate actions button "view user" option in all customers page.
    @Test
    public void TC_CF_006() throws InterruptedException {
        test=extent.createTest("TC_CF_006");
        Dashboard d = new Dashboard(driver);

        d.clickcustomers();

        d.clickallcustomers();

        customerspage_allcustomer al=new customerspage_allcustomer(driver);

        al.clickonecustomeractionbtn("214");

        implicitwait();

        al.clickviewuser("214");

        implicitwait();

        al.isinfopage();

    }

    //Validate actions button's "edit option" of one customer by changing password, firstname, lastname, email and changing inactive status.
    @Test
    public void TC_CF_007() throws InterruptedException {
        test=extent.createTest("TC_CF_007");
        Dashboard d = new Dashboard(driver);

        d.clickcustomers();

        d.clickallcustomers();

        customerspage_allcustomer al=new customerspage_allcustomer(driver);

        al.clickonecustomeractionbtn("208");

        implicitwait();

        al.clickedituser("208");

        al.editfirstnamefield("Gayu");

        al.editlastnamefield("R");

        al.editemailfield("gayura56vi09@gmail.com");

        implicitwait();

        al.changepassword("1234567890");

        al.clickconfirmchkbox();

        al.clickEditstatus();

        Thread.sleep(2000);

        al.clickEditstatusoption(" Active");

        Thread.sleep(2000);

        al.clickEditSave();

        al.getmessage();    

    }

    //Validate all customers functions -create option        
    @Test
        public void TC_CF_008() throws InterruptedException {
            test=extent.createTest("TC_CF_008");
            Dashboard d = new Dashboard(driver);

            d.clickcustomers();

            d.clickallcustomers();

            customerspage_allcustomer al=new customerspage_allcustomer(driver);

            al.clickcreatebtn();

            al.editfirstnamefield("Gayathree");

            al.enterlastname("Ravichandran");

            al.enteremail("gyv354775@gmail.com");

            al.changepassword("1234790");
            
            ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");

            al.clickEditstatus();

            Thread.sleep(3000);

            al.clickEditstatusoption("Inactive");

            Thread.sleep(3000);

            al.clickCustomerSave();

            al.successfulmessage();  

        }


    //Validate all customers functions -create(First name not privided)    
        @Test
            public void TC_CF_009() throws InterruptedException {
                test=extent.createTest("TC_CF_009");
                Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);

                al.clickcreatebtn();

                al.enterlastname("R");

                al.enteremail("Gay3@gmail.com");

                al.changepassword("123456789");  
                ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");
             

                al.clickEditstatus();

                Thread.sleep(3000);

                al.clickEditstatusoption("Inactive");

               implicitwait();

                al.clickCustomerSave();

                al.firstnameerror();

        }

 

        //Validate all customers functions -create(Last name not privided)    
        @Test
            public void TC_CF_010() throws InterruptedException {
                test=extent.createTest("TC_CF_010");
                Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);

                al.clickcreatebtn();

                al.enterfirstname("Gayathri");

                al.enteremail("Ga2y3@gmail.com");

                al.changepassword("123456789"); 
                ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");

                al.clickEditstatus();

                Thread.sleep(3000);

                al.clickEditstatusoption("Inactive");

                implicitwait();

                al.clickCustomerSave();

                al.lastnameerror();

        }

        //Validate all customers functions -create(Email not privided)    
        @Test
        public void TC_CF_011() throws InterruptedException {
        test=extent.createTest("TC_CF_011");
        Dashboard d = new Dashboard(driver);

           d.clickcustomers();

           d.clickallcustomers();

           customerspage_allcustomer al=new customerspage_allcustomer(driver);

           al.clickcreatebtn();

           al.enterfirstname("Gayathri");

           al.enterlastname("R");

           al.changepassword("123456789");   
           ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");

           al.clickEditstatus();

           Thread.sleep(3000);

           al.clickEditstatusoption("Inactive");

           implicitwait();

           al.clickCustomerSave();

           al.emailerror();

        }


        //Validate all customers functions -create(Password not provided)    
        @Test
        public void TC_CF_012() throws InterruptedException {
        test=extent.createTest("TC_CF_012");
        Dashboard d = new Dashboard(driver);

            d.clickcustomers();

            d.clickallcustomers();

            customerspage_allcustomer al=new customerspage_allcustomer(driver);

            al.clickcreatebtn();

            al.enterfirstname("Gayathri");

            al.enterlastname("R");

            al.enteremail("hhgsdiu@gmail.com");    

            al.clickEditstatus();

            Thread.sleep(3000);

            al.clickEditstatusoption("Inactive");

            implicitwait();

            al.clickCustomerSave();

            al.passworderror();

                }    

        //Validate all customers functions -search(firstname)    
        @Test
        public void TC_CF_013() throws InterruptedException {
        test=extent.createTest("TC_CF_013");
        Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);

                al.entervalueinsearch("Sona");

                al.choosingsearchoptions("Search By First Name");

                al.clicksearch();

                al.verifysearchedvalue();


        }

        //Validate all customers functions -search(Lastname)    
                @Test
                public void TC_CF_014() throws InterruptedException {
                test=extent.createTest("TC_CF_014");
                Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);

                al.entervalueinsearch("Ravichandran");

                al.choosingsearchoptions("Search By Last Name");

                al.clicksearch();

                al.verifysearchedvalue();

}    

       //Validate all customers functions -search(Email)    
                @Test
                public void TC_CF_015() throws InterruptedException {
                test=extent.createTest("TC_CF_015");
                Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);

                al.entervalueinsearch("gayuravi030801@gmail.com");

                al.choosingsearchoptions("Search By Email");

                al.clicksearch();

                al.verifysearchedvalue();

}    

      //Validate all customers functions -search(Mobile Number)    
                @Test
                public void TC_CF_016() throws InterruptedException {
                test=extent.createTest("TC_CF_016");
                Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);

                al.entervalueinsearch("8925321680");

                al.choosingsearchoptions("Search By Mobile Number");

                al.clicksearch();

                al.verifysearchedvalue();

}    


        //Validate all customers functions -search(ID)    
                @Test
                public void TC_CF_017() throws InterruptedException {
                test=extent.createTest("TC_CF_017");
                Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);

                al.entervalueinsearch("#213");

                al.choosingsearchoptions("Search By Id");

                al.clicksearch();

                al.verifysearchedvalue();
}

        //Validate all customers functions -negative search( first name)    
                @Test
                public void TC_CF_018() throws InterruptedException {
                test=extent.createTest("TC_CF_018");
                Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);
                
al.entervalueinsearch("213");
                al.choosingsearchoptions("Search By First Name");
                

                al.clicksearch();

                al.verifysearchedvalue();
}


        //Validate all customers functions -negative search(Last name)    
        @Test
            public void TC_CF_019() throws InterruptedException {
            test=extent.createTest("TC_CF_019");
            Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);
                al.entervalueinsearch("sona");

                al.choosingsearchoptions("Search By Last Name");

                al.clicksearch();

                al.verifysearchedvalue();
        }


 

        //Validate all customers functions -negative search(Email name)    
        @Test
            public void TC_CF_020() throws InterruptedException {
            test=extent.createTest("TC_CF_020");
            Dashboard d = new Dashboard(driver);

                d.clickcustomers();

                d.clickallcustomers();

                customerspage_allcustomer al=new customerspage_allcustomer(driver);
                al.entervalueinsearch("213");

                al.choosingsearchoptions("Search By Email");

                al.clicksearch();

                al.verifysearchedvalue();
        }

        //Validate all customers functions -negative search(Email name)    
        @Test
        public void TC_CF_021() throws InterruptedException {
        test=extent.createTest("TC_CF_021");
        Dashboard d = new Dashboard(driver);

            d.clickcustomers();

            d.clickallcustomers();

            customerspage_allcustomer al=new customerspage_allcustomer(driver);
            al.entervalueinsearch("sona");

            al.choosingsearchoptions("Search By Mobile Number");

            al.clicksearch();

            al.verifysearchedvalue();
            }


        //Validate all customers functions -negative search(Email name)    
        @Test
        public void TC_CF_022() throws InterruptedException {
        test=extent.createTest("TC_CF_022");
        Dashboard d = new Dashboard(driver);                                

            d.clickcustomers();

            d.clickallcustomers();

            customerspage_allcustomer al=new customerspage_allcustomer(driver);
            al.entervalueinsearch("gayuravi@gmail.com");

            al.choosingsearchoptions("Search By ID");

            al.clicksearch();

            al.verifysearchedvalue();

        }                        


           
        @Test
        public void TC_CF_023() throws InterruptedException {
        test=extent.createTest("TC_CF_023");
        Dashboard d = new Dashboard(driver);

            d.clickcustomers();

            d.clickallcustomers();

            customerspage_allcustomer al=new customerspage_allcustomer(driver);

            al.clickcreatebtn();

            al.clickcustomernavigation();

            al.isallcustomerpage();

            implicitwait();

                        }                            


 

 

 

 

 
	@Test
	public void TC_CF_024() throws InterruptedException {
		test=extent.createTest("TC_CF_024");
		Dashboard d = new Dashboard(driver);
		d.clickcustomers();
		d.clickReviewsandRatings();
		
		customerpage_reviewandrating rr =new customerpage_reviewandrating(driver);
	    rr.ReviewsText();
	 
	    rr.clickallcheckbox();
	    rr.selectAction(1);
	    rr.clicksubmit();
	    implicitwait();
	 rr.getmessage();
	    System.out.println("Action status is changed to active");
	}
	
	
	@Test
	public void TC_CF_025() throws InterruptedException {
		test=extent.createTest("TC_CF_025");
		Dashboard d = new Dashboard(driver);
		d.clickcustomers();
		d.clickReviewsandRatings();
		
		customerpage_reviewandrating rr =new customerpage_reviewandrating(driver);
		 rr.ReviewsText();
	    rr.clickallcheckbox();
	    rr.selectAction(2);
	    rr.clicksubmit();
	    implicitwait();
		 rr.getmessage();
	    System.out.println("Action status is changed to inactive");
	}
	
	
	@Test
	public void TC_CF_026() throws InterruptedException {
		test=extent.createTest("TC_CF_026");
		Dashboard d = new Dashboard(driver);
		d.clickcustomers();
		d.clickReviewsandRatings();
		
		customerpage_reviewandrating rr =new customerpage_reviewandrating(driver);
		 rr.ReviewsText();
		rr.checkboxanyone("Manju Manju");
	rr.pencil_icon("Manju Manju");
	
	
	Thread.sleep(2000);
	rr.clickstatustab();
	implicitwait();
		rr.StatusEnablility("Inactive");
		
		Thread.sleep(2000);
		
		rr.clickupdate();
		rr.getmessage();
	
		 System.out.println("Review updated");
		
	}
	
	@Test
	public void TC_CF_027() {
		test=extent.createTest("TC_CF_027");
		Dashboard d = new Dashboard(driver);
		d.clickcustomers();
		d.clickReviewsandRatings();
		
		customerpage_reviewandrating rr =new customerpage_reviewandrating(driver);
	    rr.clickoneproduct("Leggins");
	    System.out.println("Product is clicked");
	}
	
	@Test
	public void TC_CF_028() {
		test=extent.createTest("TC_CF_028");
		Dashboard d = new Dashboard(driver);
		d.clickcustomers();
		d.clickReviewsandRatings();
		
		customerpage_reviewandrating rr =new customerpage_reviewandrating(driver);
		 rr.ReviewsText();
		rr.pencil_icon("Gayathri R");
		rr.review();
		 System.out.println("Review is clicked");
	}
	@Test
	public void TC_CF_029() {
		test=extent.createTest("TC_CF_029");
		Dashboard d = new Dashboard(driver);
		d.clickcustomers();
		d.clickReviewsandRatings();
		
		customerpage_reviewandrating rr =new customerpage_reviewandrating(driver);
		rr.ReviewsText();
		
		rr.clicksubmit();
		rr.getmessage();
		 System.out.println("Error for status");
	}

	
	
}


