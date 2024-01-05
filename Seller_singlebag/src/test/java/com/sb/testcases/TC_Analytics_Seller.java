package com.sb.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.analytics.analytics;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;


	
	public class TC_Analytics_Seller extends extentreports {
		
    @BeforeMethod
    public void browseropening() throws InterruptedException {
  browserlaunch("https://app.pay380.com/verify-shop");
    
 loginpage_verifystore vs = new loginpage_verifystore(driver);
    vs.enterStoreName("instamart");
    vs.clickVerifyStoreButton();
    Thread.sleep(1000);    
    loginpage_verifyemail ve = new loginpage_verifyemail(driver);
    ve.enterEmail("instamart@example.com");    
 ve.enterPassword("12345678");    
    ve.clickLoginButton();        
    Thread.sleep(4000);       

    }

    //Validate Analytics page functions by choosing days in the calendar

    @Test
    public void TC_AF_001() throws InterruptedException {
      test=extent.createTest("TC_AF_001");
        Dashboard d = new Dashboard(driver);

        d.clickAnalytics();

        implicitwait();
        analytics a=new analytics(driver);
        a.starting_date("2023", "January", "25");
        Thread.sleep(2000);
        a.ending_date("2023", "July", "20");
        a.clickSubmit();
      implicitwait();

        if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/report?start=2023-01-25&end=2023-07-20")) {

        System.out.println("Analytics details is displaying");    
        }

       else {

        System.out.println("Not displayed ");
       }

    }

 
    //Validate Analytics page functions by choosing last date

    @Test
    public void TC_AF_002() throws InterruptedException {
        test=extent.createTest("TC_AF_002");
        Dashboard d = new Dashboard(driver);
        d.clickAnalytics();
    implicitwait();
        analytics a=new analytics(driver);
      implicitwait();
        a.revenuedropdown();
    implicitwait();





    }
}

