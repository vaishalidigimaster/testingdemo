package com.sb.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.Settings.settings_paymentoptions;
import com.sb.pageobject.Settings.settings_plans;
import com.sb.pageobject.Settings.settings_shippingmethod;
import com.sb.pageobject.Settings.settings_subscriptionhistory;
import com.sb.pageobject.Settings.settings_userterms;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;

public class TC_Settings_seller extends extentreports{
	

	@BeforeMethod
	public void browseropening() throws InterruptedException {
 browserlaunch("https://app.pay380.com/verify-shop");
	implicitwait();
	loginpage_verifystore vs = new loginpage_verifystore(driver);
	vs.enterStoreName("instamart");
	vs.clickVerifyStoreButton();
	Thread.sleep(1000);
	loginpage_verifyemail ve = new loginpage_verifyemail(driver);
	ve.enterEmail("instamart@example.com");
	ve.enterPassword("12345678");
	
	ve.clickLoginButton();
	Thread.sleep(3000);}

	@Test
	public void TC_SF_001() throws InterruptedException {
		test=extent.createTest("TC_SF_001");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickusertermsinsetting();
       
        implicitwait();
        settings_userterms ut=new settings_userterms(driver);
        
        ut.captureusertermtxt();
        ut.usertermlink("https://fashionbag.singlebag.com/page/terms/92");
        ut.submitbutton(); 
        
        System.out.println("User Terms Created Successfully");
        
        
        
        

	}
	@Test
	public void TC_SF_002() throws InterruptedException {
		test=extent.createTest("TC_SF_002");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickusertermsinsetting();
        implicitwait();
        settings_userterms ut=new settings_userterms(driver);
        ut.captureusertermtxt();
        ut.usertermlink("");
        ut.submitbutton();
        System.out.println("please fill out this field");
        
       
	}
	
	
	
	
	//Testcase-Plans
	
	@Test
	public void TC_SF_003() throws InterruptedException {
		test=extent.createTest("TC_SF_003");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickplansetting();
        settings_plans p=new settings_plans(driver);
        p.capturepricingplantxt();
        p.capturebasictxt();
        p.click_basicsubscribe();
        p.makepayment("9876543212");
      

        
	}
	@Test
	public void TC_SF_004() throws InterruptedException {
		test=extent.createTest("TC_SF_004");
		Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickplansetting();
        settings_plans p=new settings_plans(driver);
        p.capturepricingplantxt();
        p.capturestartuptxt();
        p.click_startupsubscribe();
        p.makepayment("9876543212");
		
	}
	@Test
	public void TC_SF_005() throws InterruptedException {
		test=extent.createTest("TC_SF_005");
		Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickplansetting();
        settings_plans p=new settings_plans(driver);
        p.capturepricingplantxt();
        p.capturebussinesstxt();
        p.click_bussinesssubscribe();
        p.makepayment("9876543212");
        System.out.println("Payment page is displayed");
	}
	@Test
	public void TC_SF_006() throws InterruptedException {
		test=extent.createTest("TC_SF_006");
		Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickplansetting();
        settings_plans p=new settings_plans(driver);
        p.capturepricingplantxt();
        p.capturebussinesstxt();
        p.click_bussinesssubscribe();
        p.makepayment(" ");
	}
	
	@Test
	public void TC_SF_007() throws InterruptedException {
		test=extent.createTest("TC_SF_007");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickplansetting();
        settings_plans p=new settings_plans(driver);
        p.capturepricingplantxt();
        p.capturebasictxt();
        p.click_basicsubscribe();
        p.makepayment("9876543212");
       
	}
	@Test
	public void TC_SF_008() throws InterruptedException  {
		test=extent.createTest("TC_SF_008");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickplansetting();
        settings_plans p=new settings_plans(driver);
        p.capturepricingplantxt();
        p.capturestartuptxt();
        p.click_startupsubscribe();
        p.makepayment("9876543212");

	}
	
	@Test
	public void TC_SF_009() throws InterruptedException {
		test=extent.createTest("TC_SF_009");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickplansetting();
        settings_plans p=new settings_plans(driver);
        p.capturepricingplantxt();
        p.capturebussinesstxt();
        p.click_bussinesssubscribe();
        
        System.out.println("pricing plan page is displayed");
	}
	@Test
	public void TC_SF_010() throws InterruptedException {
		test=extent.createTest("TC_SF_010");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clickplansetting();
        Thread.sleep(2000);
        settings_plans p=new settings_plans(driver);
        Thread.sleep(2000);
        p.clickhome();
        System.out.println("Home page is displayed");
	}
	
	//Testcase-Subscription history
	@Test
	public void TC_SF_011() throws InterruptedException {
		test=extent.createTest("TC_SF_011");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clicksubscriptionhistorysettings();
        settings_subscriptionhistory sh=new settings_subscriptionhistory(driver);
        sh.capturesubscriptiontxt();
        sh.clickaction("SB1181");
        sh.clickview("SB1181");
        sh.capturesubscriptiondetailstxt();
        sh.clickstoreemail();
        System.out.println("Email page is displayed");
        
	}
	@Test
	public void TC_SF_012() throws InterruptedException {
		test=extent.createTest("TC_SF_012");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clicksubscriptionhistorysettings();
        settings_subscriptionhistory sh=new settings_subscriptionhistory(driver);
        sh.capturesubscriptiontxt();
        sh.clickaction("SB1181");
        sh.clickview("SB1181");
        sh.capturesubscriptiondetailstxt();
        sh.clickstoredomain();
        System.out.println("Store Domain page is displayed");
	}
	@Test
	public void TC_SF_013() throws InterruptedException {
		test=extent.createTest("TC_SF_013");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clicksubscriptionhistorysettings();
        settings_subscriptionhistory sh=new settings_subscriptionhistory(driver);
        sh.capturesubscriptiontxt();
        sh.clickaction("SB1181");
        Thread.sleep(1000);
        sh.clickdownloadinvoice("SB1181");
        
        System.out.println("Invoice is downloaded");
	}
	@Test
	public void TC_SF_014() throws InterruptedException {
		test=extent.createTest("TC_SF_014");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        Thread.sleep(1000);
        d.clicksubscriptionhistorysettings();
        settings_subscriptionhistory sh=new settings_subscriptionhistory(driver);
        sh.capturesubscriptiontxt();
        sh.clickaction("SB1181");
        sh.clickview("SB1181");
        sh.capturesubscriptiondetailstxt();
        sh.clicksubscriptions();
        Thread.sleep(1000);
        System.out.println("subscription history page is displayed");
	}
	
	//Testcase-payment options
	@Test
	public void TC_SF_015() throws InterruptedException {
		test=extent.createTest("TC_SF_015");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        d.clickpaymentoptionsettings();
        settings_paymentoptions po=new settings_paymentoptions(driver);
        po.capturepaymentoptions();
        po.capturecod();
        po.click_codconnected();
        po.capturecodmethod();
        Thread.sleep(1000);
        po.cod_name("COD");
        Thread.sleep(1000);
        po.cod_additionaldetails("Cash On Delivery(COD)");
        Thread.sleep(1000);
        po.cod_enable();
        Thread.sleep(1000);
        po.cod_save();
        System.out.println("Information Updated!!");
	}
	
	@Test
	public void TC_SF_016() throws InterruptedException {
		test=extent.createTest("TC_SF_016");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        d.clickpaymentoptionsettings();
        settings_paymentoptions po=new settings_paymentoptions(driver);
        po.capturepaymentoptions();
        Thread.sleep(2000);
     ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
       Thread.sleep(2000);
        po.click_anypayment("razorpay");
        Thread.sleep(2000);
        po.razorpay_name("RAZORPAY");
        po.razorpay_keyid("123");
        po.razorpay_secretkey("#1234");
        po.razorpay_purpose("Online Payments");
        po.razorpay_enable();
        po.razorpay_save();
        System.out.println("Information Updated!!");
        Thread.sleep(1000);
        
        
	}
	
	@Test
	public void TC_SF_017() throws InterruptedException {
		test=extent.createTest("TC_SF_017");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        d.clickpaymentoptionsettings();
        settings_paymentoptions po=new settings_paymentoptions(driver);
        po.capturepaymentoptions();
        Thread.sleep(2000);
     ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
       Thread.sleep(2000);
        po.click_anypayment("razorpay");
        Thread.sleep(2000);
        po.razorpay_name("");
        po.razorpay_keyid("123");
        po.razorpay_secretkey("#1234");
        po.razorpay_purpose("Online Payments");
        po.razorpay_enable();
        po.razorpay_save();
        System.out.println("Please fill out this field");
	}
	@Test
	public void TC_SF_018() throws InterruptedException {
		test=extent.createTest("TC_SF_018");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        d.clickpaymentoptionsettings();
        settings_paymentoptions po=new settings_paymentoptions(driver);
        po.capturepaymentoptions();
        Thread.sleep(2000);
     ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
       Thread.sleep(2000);
        po.click_anypayment("razorpay");
        Thread.sleep(2000);
        po.razorpay_name("RAZORPAY");
        po.razorpay_keyid("");
        po.razorpay_secretkey("#1234");
        po.razorpay_purpose("Online Payments");
        po.razorpay_enable();
        po.razorpay_save();
        System.out.println("Please fill out this field");
}
	@Test
	public void TC_SF_019() throws InterruptedException {
		test=extent.createTest("TC_SF_019");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        d.clickpaymentoptionsettings();
        settings_paymentoptions po=new settings_paymentoptions(driver);
        po.capturepaymentoptions();
        Thread.sleep(2000);
     ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
       Thread.sleep(2000);
        po.click_anypayment("razorpay");
        Thread.sleep(2000);
        po.razorpay_name("RAZORPAY");
        po.razorpay_keyid("123");
        po.razorpay_secretkey("");
        po.razorpay_purpose("Online Payments");
        po.razorpay_enable();
        po.razorpay_save();
        System.out.println("Please fill out this field");
}
	@Test
	public void TC_SF_020() throws InterruptedException {
		test=extent.createTest("TC_SF_020");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        d.clickpaymentoptionsettings();
        settings_paymentoptions po=new settings_paymentoptions(driver);
        po.capturepaymentoptions();
        Thread.sleep(2000);
     ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
       Thread.sleep(2000);
        po.click_anypayment("razorpay");
        Thread.sleep(2000);
        po.razorpay_name("RAZORPAY");
        po.razorpay_keyid("123");
        po.razorpay_secretkey("#1234");
        po.razorpay_purpose(" ");
        po.razorpay_enable();
        po.razorpay_save();
        System.out.println("Please fill out this field");
}
	@Test
	public void TC_SF_021() throws InterruptedException {
		test=extent.createTest("TC_SF_021");
        Dashboard d = new Dashboard(driver);
        d.click_settings();
        d.clickpaymentoptionsettings();
        settings_paymentoptions po=new settings_paymentoptions(driver);
        po.capturepaymentoptions();
        Thread.sleep(2000);
     ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
       Thread.sleep(2000);
        po.click_anypayment("razorpay");
        Thread.sleep(2000);
        po.razorpay_cancel();
        Thread.sleep(1000);
        System.out.println("payment page is displayed");
	}
	
	//settings-shipping methods

		@Test(enabled=false)

		public void TC_SF_022() throws InterruptedException {

			test=extent.createTest("TC_SF_022");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	        sm.clickallcheckbox();

	        sm.selectaction("Active");

	        Thread.sleep(3000);

	       sm.clicksubmit();

	        sm.getmessage();

		}

	 

		@Test(enabled=false)

		public void TC_SF_023() throws InterruptedException {

			test=extent.createTest("TC_SF_023");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	        sm.clickallcheckbox();

	        sm.selectaction("Inactive");

	        Thread.sleep(3000);

	       sm.clicksubmit();

	        sm.getmessage();

		}

		

		@Test(enabled=false)

		public void TC_SF_024() throws InterruptedException {

			test=extent.createTest("TC_SF_024");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	        sm.click_singlecheckbox("speed courier");

	        sm.selectaction("Delete");

	        Thread.sleep(3000);

	       sm.clicksubmit();

	        sm.getmessage();

		}

		

		@Test(enabled=false)

		public void TC_SF_025() throws InterruptedException {

			test=extent.createTest("TC_SF_025");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	        sm.clickallcheckbox();

	        sm.clicksubmit();

	        sm.getmessage();

		}

		

		@Test(enabled=false)

		public void TC_SF_026() throws InterruptedException {

			test=extent.createTest("TC_SF_026");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	        sm.clickcreate();

	        sm.createtitle("courier");

	        sm.selectactions("Active");

	        sm.clickfreeshipping();

	        sm.clicksave();

	        sm.getmessage();

		}

		

		@Test(enabled=false)

		public void TC_SF_027() throws InterruptedException {

			test=extent.createTest("TC_SF_027");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	        sm.clickcreate();

	        sm.createtitle("");

	        sm.selectactions("Active");

	        sm.clickfreeshipping();

	        sm.clicksave();

	       sm.titleerrormsg();

		}

		

		@Test(enabled=false)

		public void TC_SF_028() throws InterruptedException {

			test=extent.createTest("TC_SF_028");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	       sm.click_editofshippingmethod("courier");

	       sm.edit_title("speed courier");

	       sm.selectactions("Active");

	       sm.clickedit_freeshipping();

	       sm.edit_submit();

	      sm.geteditsuccessmsg();

		}

		

		@Test(enabled=false)

		public void TC_SF_029() throws InterruptedException {

			test=extent.createTest("TC_SF_029");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	       sm.click_editofshippingmethod("courier");

	       sm.edit_shippingmethods();

	       sm.captureshippingmethods();

		}

		

		@Test(enabled=false)

		public void TC_SF_030() throws InterruptedException {

			test=extent.createTest("TC_SF_030");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	       sm.click_settingsofshippingmethod("ST courier");

	       sm.clickallcheckbox();

	       sm.selectaction("Inactive");

	       sm.actionsubmit();

	       sm.getmessage();

	       

		}

		

		@Test(enabled=false)

		public void TC_SF_031() throws InterruptedException {

			test=extent.createTest("TC_SF_031");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	       sm.click_settingsofshippingmethod("ST courier");

	       sm.settings_create();

	       Thread.sleep(1000);

	     //  sm.selectcountry("India");

	    //   Thread.sleep(1000);

	  //     sm.selectstate("Tam");

	     //  Thread.sleep(1000);

	   //    sm.clickstate();

	      // Thread.sleep(1000);

	       sm.settings_city("Trichy");

	       sm.settings_deliverydays("2-4");

	       sm.settings_deliverynotes("Delivery ontime");

	       sm.settings_rate("50");

	       sm.settings_postcode("60001");

	       sm.selectactions("Active");

	       sm.settings_save();

	       sm.getmessage();

		}

		

		@Test(enabled=false)

		public void TC_SF_032() throws InterruptedException {

			test=extent.createTest("TC_SF_032");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	       sm.click_settingsofshippingmethod("ST courier");

	       Thread.sleep(1000);

	       sm.click_settingsedit("Trichy");

	       sm.settingsedit_city("coimbatore");

	       sm.settingsedit_days("1");

	       sm.settingsedit_notes("Speed delivery");

	       sm.settingsedit_rate("60");

	       sm.settingsedit_postcode("600097");

	       ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");

	       Thread.sleep(2000);

		   sm.selectactions("Inactive");

		   sm.settingsedit_save();

		   sm.getmessage();

		}

		

		@Test(enabled=false)

		public void TC_SF_033() throws InterruptedException {

			test=extent.createTest("TC_SF_033");

	        Dashboard d = new Dashboard(driver);

	        d.click_settings();

	        d.clickshippingmethod();

	        settings_shippingmethod sm=new settings_shippingmethod(driver);

	       sm.click_settingsofshippingmethod("ST courier");

	       Thread.sleep(1000);

	       sm.click_settingsedit("Trichy");

	       sm.clickeditshippinglocations();

	       sm.captureshippinglocations();

	      

		}

		

		@Test(enabled=false)

		public void TC_SF_034() throws InterruptedException {

		test=extent.createTest("TC_SF_034");

	       Dashboard d = new Dashboard(driver);

	       d.click_settings();

	       d.clickshippingmethod();

	       settings_shippingmethod sm=new settings_shippingmethod(driver);

	      sm.click_settingsofshippingmethod("courier");

	       Thread.sleep(1000);

	       sm.click_settingsedit("Trichy");

	       sm.settingsedit_city("Trichy");

	       sm.settingsedit_days("");

	       sm.settingsedit_notes("Speed delivery");

	       sm.settingsedit_rate("60");

	       sm.settingsedit_postcode("600097");

	       ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");

	       Thread.sleep(2000);

		   sm.selectactions("Inactive");

		   sm.settingsedit_save();

		   sm.settingsedit_dayserrormsg();

	     

	     

	     

		}

		

	 

		@Test

		public void TC_SF_035() throws InterruptedException {

		test=extent.createTest("TC_SF_035");

	       Dashboard d = new Dashboard(driver);

	       d.click_settings();

	       d.clickshippingmethod();

	       settings_shippingmethod sm=new settings_shippingmethod(driver);

	      sm.click_settingsofshippingmethod("courier");

	       Thread.sleep(1000);

	       sm.click_settingsedit("Trichy");

	       sm.settingsedit_city("Trichy");

	       sm.settingsedit_days("1");

	       sm.settingsedit_notes("Speed delivery");

	       sm.settingsedit_rate("");

	       sm.settingsedit_postcode("600097");

	       ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");

	       Thread.sleep(2000);

		   sm.selectactions("Inactive");

		   sm.settingsedit_save();

		   sm.settingsedit_rateerrormsg();

	     

	     

	     

		}

		

		

		

		

		

	}

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	










