package com.sb.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.Pointofsale.seller.Pointofsale_products;
import com.sb.pageobject.Pointofsale.seller.Pointofsalepage_users;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;

public class TC_POS_seller extends extentreports {
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
	
	@Test(enabled = false)
	public void TC_POSF_001() throws InterruptedException {
		test=extent.createTest("TC_POSF_001");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_create();
	up.enter_firstname("vaish");
	up.enter_lastname("B");
	up.enter_email("vshvaishali1.7@gmail.com");
	up.enter_password("12345678");
	up.eyebutton();
	up.password_visibility();
	up.select_status("Active");
	up.clicksave_update();
	up.getmessage();
	System.out.println("POS user is created successfully");
	}
	
	@Test(enabled = false)
	public void TC_POSF_002() throws InterruptedException {
		test=extent.createTest("TC_POSF_002");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_create();
	up.enter_firstname("");
	up.enter_lastname("B");
	up.enter_email("vshvaishali@gmail.com");
	up.enter_password("12345678");
	
	up.select_status("Active");
	up.clicksave_update();
	up.error_firstname();
	System.out.println("First name not provided");
	}
	@Test(enabled = false)
	public void TC_POSF_003() throws InterruptedException {
		test=extent.createTest("TC_POSF_003");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_create();
	up.enter_firstname("vaishali");
	up.enter_lastname("");
	up.enter_email("vshvaishali@gmail.com");
	up.enter_password("12345678");
	
	up.select_status("Active");
	up.clicksave_update();
	up.error_lastname();
	System.out.println("last name not provided");
	}
	
	@Test(enabled = false)
	public void TC_POSF_004() throws InterruptedException {
		test=extent.createTest("TC_POSF_004");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_create();
	up.enter_firstname("vaishali");
	up.enter_lastname("B");
	up.enter_email("vshvaishaligmail.com");
	up.enter_password("12345678");
	
	up.select_status("Active");
	up.clicksave_update();
	up.error_email();
	System.out.println("Invalid email id provided");
	}
	
	@Test(enabled = false)
	public void TC_POSF_005() throws InterruptedException {
		test=extent.createTest("TC_POSF_005");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_create();
	up.enter_firstname("vaishali");
	up.enter_lastname("B");
	up.enter_email("");
	up.enter_password("12345678");
	
	up.select_status("Active");
	up.clicksave_update();
	up.error_email();
	System.out.println("Email id not provided");
	}
	
	@Test(enabled = false)
	public void TC_POSF_006() throws InterruptedException {
		test=extent.createTest("TC_POSF_006");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_create();
	up.enter_firstname("vaishali");
	up.enter_lastname("B");
	up.enter_email("vshvaishali@gmail.com");
	up.enter_password("");
	
	up.select_status("Active");
	up.clicksave_update();
	up.error_password();
	System.out.println("Password not provided");
	}
	
	
	@Test(enabled = false)
	public void TC_POSF_007() throws InterruptedException {
		test=extent.createTest("TC_POSF_007");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_emailofuser("gayu.deepi73@gmail.com");
	Thread.sleep(3000);
	System.out.println("Email suggestion page is opened");}
	
	@Test(enabled = false)
	public void TC_POSF_008() throws InterruptedException {
		test=extent.createTest("TC_POSF_008");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_actions("Gayathree R");
	up.click_editactions("Gayathree R");
	up.enter_firstname("Gayathri");
	up.enter_lastname("Ravichandran");
	up.enter_email("gayu.deepi73@gmail.com");
	up.enter_password("12345678");
	up.click_passwordcheckbox();
	
	up.select_status("Active");
	up.clicksave_update();
	up.getmessage();
	System.out.println("POS user is updated successfully");
	}
	
	@Test(enabled = false)
	public void TC_POSF_009() throws InterruptedException {
		test=extent.createTest("TC_POSF_009");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_actions("vaishali B");
	up.click_editactions("vaishali B");
	up.enter_firstname("Gayathree");
	up.enter_lastname("R");
	up.enter_email("gayudeepi@gmail.com");
	
	up.click_passwordcheckbox();
	
	up.select_status("Active");
	up.clicksave_update();
	up.getmessage();
	System.out.println("POS user is not updated because password not provided");
	}
	
	@Test(enabled = false)
	public void TC_POSF_010() throws InterruptedException {
		test=extent.createTest("TC_POSF_010");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.choosingsearchoptions("Search By First Name");
	up.entervalueinsearch("vaishali");
	up.clicksearch();
	up.verifysearchedvalue();
	System.out.println("User is displayed as per search");
	}
	

	@Test(enabled = false)
	public void TC_POSF_011() throws InterruptedException {
		test=extent.createTest("TC_POSF_011");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.choosingsearchoptions("Search By Last Name");
	up.entervalueinsearch("B");
	up.clicksearch();
	up.verifysearchedvalue();
	System.out.println("User is displayed as per search");
	}
	

	@Test(enabled = false)
	public void TC_POSF_012() throws InterruptedException {
		test=extent.createTest("TC_POSF_012");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.choosingsearchoptions("Search By User Mail");
	up.entervalueinsearch("usertest@example.com");
	up.clicksearch();
	up.verifysearchedvalue();
	System.out.println("User is displayed as per search");
	}
	
	@Test(enabled = false)
	public void TC_POSF_013() throws InterruptedException {
		test=extent.createTest("TC_POSF_013");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.choosingsearchoptions("Search By First Name");
	up.entervalueinsearch("Ravichanran");
	up.clicksearch();
	up.verifysearchedvalue();
	System.out.println("Negative search for firstname");
	}
	
	@Test(enabled = false)
	public void TC_POSF_014() throws InterruptedException {
		test=extent.createTest("TC_POSF_014");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.choosingsearchoptions("Search By Last Name");
	up.entervalueinsearch("vshvaishali17@gmail.com");
	up.clicksearch();
	up.verifysearchedvalue();
	System.out.println("Negative search for lastname");
	}
	
	@Test(enabled = false)
	public void TC_POSF_015() throws InterruptedException {
		test=extent.createTest("TC_POSF_015");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.choosingsearchoptions("Search By User Mail");
	up.entervalueinsearch("Gayathri");
	up.clicksearch();
	up.verifysearchedvalue();
	System.out.println("Negative search for email");
	}
	
	@Test(enabled = false)
	public void TC_POSF_016() throws InterruptedException {
		test=extent.createTest("TC_POSF_016");
		Dashboard d = new Dashboard(driver);
	d.clickPOS();
	d.click_usersinPOS();
	Pointofsalepage_users up = new Pointofsalepage_users(driver);
	up.click_create();
	up.clickusers();
	up.getpagetitle();
	System.out.println("user page is displayed");}
	
	
	
	
	
	@Test(enabled = true)
	public void TC_POSF_063() throws InterruptedException {
		test = extent.createTest("TC_POSF_016");
		Dashboard d = new Dashboard(driver);
		d.clickPOS();
		Thread.sleep(1000);
		d.click_POSProducts();
		Pointofsale_products pp = new Pointofsale_products(driver);
		implicitwait();
		pp.clickoneimage("Croptop");
		implicitwait();
		pp.iseditpage();



	}



	@Test(enabled = false)
	public void TC_POSF_064() throws InterruptedException {
		test = extent.createTest("TC_POSF_016");
		Dashboard d = new Dashboard(driver);
		d.clickPOS();
		d.click_POSProducts();
		Pointofsale_products pp = new Pointofsale_products(driver);
		pp.clickhome();
		implicitwait();
		pp.ishomepage();



	}

//	@Test(enabled = true)
//	public void TC_POSF_065() throws InterruptedException {
//		test = extent.createTest("TC_POSF_016");
//		Dashboard d = new Dashboard(driver);
//		d.clickPOS();
//		d.click_POSProducts();
//		Pointofsale_products pp = new Pointofsale_products(driver);
//		pp.clicksinglebag();
//		implicitwait();
//		pp.issinglebagweb();
//
//
//
//	}
}
