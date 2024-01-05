package com.sb.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;
import com.sb.pageogbject.products.seller.Productpage_coupons;

public class TC_Productcoupons_seller extends extentreports {

	
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
	Thread.sleep(3000);}
	
	@Test
	public void TC_CF_001() throws InterruptedException {
		test=extent.createTest("TC_CF_001");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		pc.click_overallcheckbox();
		pc.selectaction("Active");
		pc.click_submitinactions();
		pc.getmessage();
		System.out.println("All coupons are active");
	}
	
	
	@Test
	public void TC_CF_002() throws InterruptedException {
		test=extent.createTest("TC_CF_002");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		pc.click_overallcheckbox();
		pc.selectaction("Inactive");
		pc.click_submitinactions();
		pc.getmessage();
		System.out.println("All coupons are inactive");
	}
	
	
	@Test
	public void TC_CF_003() throws InterruptedException {
		test=extent.createTest("TC_CF_003");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		
		pc.click_submitinactions();
		pc.getmessage();
		System.out.println("Clicking submit without selecting checkbox");
	}
	
	
	@Test
	public void TC_CF_004() throws InterruptedException {
		test=extent.createTest("TC_CF_004");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		pc.click_create();
		pc.entertitle("special summer cool offer");
		pc.entercode("abcd");
pc.expiry_date("2023", "August","26");
pc.enterpercentage("30");

Thread.sleep(2000);
pc.clickstatus();
Thread.sleep(2000);
pc.clickstatusoption("Active");
Thread.sleep(1000);
pc.clicksaveorupdate();
pc.getmessage();
System.out.println("Coupon is created successfully");
	}
	
	@Test
	public void TC_CF_005() throws InterruptedException {
		test=extent.createTest("TC_CF_005");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		pc.click_create();
		pc.entertitle("");
		pc.entercode("abcd");
pc.expiry_date("2023", "August","25");
pc.enterpercentage("30");
Thread.sleep(2000);
pc.clickstatus();
Thread.sleep(2000);
pc.clickstatusoption("Active");
Thread.sleep(1000);
pc.clicksaveorupdate();
System.out.println("Title not provided so coupon not created");
	}

	@Test
	public void TC_CF_006() throws InterruptedException {
		test=extent.createTest("TC_CF_006");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		pc.click_create();
		pc.entertitle("summer offer");
		pc.entercode("");
pc.expiry_date("2023", "August","25");
pc.enterpercentage("30");
Thread.sleep(2000);
pc.clickstatus();
Thread.sleep(2000);
pc.clickstatusoption("Active");
Thread.sleep(1000);
pc.clicksaveorupdate();

System.out.println("Code not provided so coupon not created");
	}
	
	@Test
	public void TC_CF_007() throws InterruptedException {
		test=extent.createTest("TC_CF_007");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		pc.click_create();
		pc.entertitle("summer offer");
		pc.entercode("abcd");

pc.enterpercentage("30");
Thread.sleep(2000);
pc.clickstatus();
Thread.sleep(2000);
pc.clickstatusoption("Active");
Thread.sleep(1000);
pc.clicksaveorupdate();
pc.getmessage();

System.out.println("Expiry date not provided");
	}
	
	
	@Test
	public void TC_CF_008() throws InterruptedException {
		test=extent.createTest("TC_CF_008");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		pc.click_create();
		pc.entertitle("summer offer");
		pc.entercode("abcd");
		pc.expiry_date("2023", "August","25");
pc.enterpercentage("");
Thread.sleep(2000);
pc.clickstatus();
Thread.sleep(2000);
pc.clickstatusoption("Active");
Thread.sleep(1000);
pc.clicksaveorupdate();

System.out.println("Percentage not provided so coupon not created");
	}
	
	@Test
	public void TC_CF_009() throws InterruptedException {
		test=extent.createTest("TC_CF_009");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		pc.click_partivularcheckbox("disc");
		pc.selectaction("Active");
		pc.click_submitinactions();
		pc.getmessage();

System.out.println("Particular coupon status is changed as per action select");
	}
	
	@Test
	public void TC_CF_010() throws InterruptedException {
		test=extent.createTest("TC_CF_010");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
	pc.clickediticon("winter offer");
		pc.entertitle("winter offer");
		pc.entercode("abcd");
pc.expiry_date("2023", "August","26");
pc.enterpercentage("30");
Thread.sleep(2000);
pc.clickstatus();
Thread.sleep(2000);
pc.clickstatusoption("Active");
Thread.sleep(1000);
pc.clicksaveorupdate();
pc.getmessage();
System.out.println("Coupon is updated successfully");
	}
	
	@Test
	public void TC_CF_011() throws InterruptedException {
		test=extent.createTest("TC_CF_011");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		pc.click_create();
		pc.click_couponintop();
		pc.getpagetitle();
		System.out.println("coupon page is displayed");
	}
	
	
	@Test
	public void TC_CF_012() throws InterruptedException {
		test=extent.createTest("TC_CF_012");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_coupon_products();
		Productpage_coupons pc = new Productpage_coupons(driver);
		
		pc.click_home();
	pc.gethometitle();
		System.out.println("Home page is displayed");
	}
	
}
