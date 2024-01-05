package com.sb.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;
import com.sb.pageobject.marketingtool.Marketingtool_facebookpixel;
import com.sb.pageobject.marketingtool.Marketingtool_googleanalytics;
import com.sb.pageobject.marketingtool.Marketingtool_googletagmanager;
import com.sb.pageobject.marketingtool.Marketingtool_whatsappapi;

public class TC_Marketingtool_seller extends extentreports {
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
	
	@Test
	public void TC_MT_001(){
		test=extent.createTest("TC_MT_001");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		
		ga.captureGAT();
		ga.enterGAMeasurementID("UA-987654321");
		ga.enterAnalyticsviewid("123456789");
		ga.selectEnability("Enable");
		ga.clicksavechanges();
		implicitwait();
		ga.updated_message("Google Analytics");
		System.out.println("Google analytics is updated");
	}
	
	@Test
	public void TC_MT_002() throws InterruptedException {
		test=extent.createTest("TC_MT_002");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		ga.enterGAMeasurementID("");
		ga.enterAnalyticsviewid("123456789");
		ga.selectEnability("Disable");
		Thread.sleep(3000);
		ga.clicksavechanges();
		System.out.println("GA ID not provided");
	}
	
	@Test
	public void TC_MT_003() throws InterruptedException {
		test=extent.createTest("TC_MT_003");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		
		ga.enterGAMeasurementID("UA-987654321");
		ga.enterAnalyticsviewid("");
		ga.selectEnability("Enable");
		Thread.sleep(3000);
		ga.clicksavechanges();
		System.out.println("Analytics id not provided");
	}
	
	@Test
	public void TC_MT_004() {
		
		test=extent.createTest("TC_MT_004");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		ga.clickGoogletagmanager();
		implicitwait();
		Marketingtool_googletagmanager gm=new Marketingtool_googletagmanager(driver);
		
		gm.captureGTManagerText();
		gm.enterGTManagerId("HSM-1234");
		gm.selectEnability("Enable");
		gm.clicksavechanges();
		implicitwait();
		gm.updated_message("Google Tag Manager");
		System.out.println("Google tag manager is updated");
	}
	
	@Test
	public void TC_MT_005() throws InterruptedException {
		test=extent.createTest("TC_MT_005");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		ga.clickGoogletagmanager();
		implicitwait();
		Marketingtool_googletagmanager gm=new Marketingtool_googletagmanager(driver);
		Thread.sleep(3000);
		gm.enterGTManagerId("");
		gm.selectEnability("Enable");
		
		gm.clicksavechanges();
		System.out.println("GT manager id  not provided");
	}
	
	@Test
	public void TC_MT_006() {
		test=extent.createTest("TC_MT_006");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		ga.clickfacebookpixel();
		implicitwait();
		Marketingtool_facebookpixel fp=new Marketingtool_facebookpixel(driver);
		fp.enterpixelid("1234567890");
		fp.selectEnability("Enable");
		fp.clicksavechanges();
		implicitwait();
		fp.updated_message("Facebook Pixel Settings");
		System.out.println("Facebook pixel is updated");
	}
	
	@Test
	public void TC_MT_007() {
		test=extent.createTest("TC_MT_007");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		ga.clickfacebookpixel();
		implicitwait();
		
		Marketingtool_facebookpixel fp=new Marketingtool_facebookpixel(driver);
		
		fp.enterpixelid("");
		fp.selectEnability("Enable");
		fp.clicksavechanges();
		fp.error_enterpixelid();
		System.out.println("Pixelid is not provided");
	}
	
	@Test
	public void TC_MT_008() throws InterruptedException {
		test=extent.createTest("TC_MT_008");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		ga.clickwhatsappapi();
		implicitwait();
		Marketingtool_whatsappapi wapi=new Marketingtool_whatsappapi(driver);
		
		wapi.enterwhatsappnumber("9876543210");
		wapi.selectEnability("Enable");
		wapi.enterpretextproduct("Your product has been placed");
		wapi.enterotherpage("Thank you for choosing us");
		Thread.sleep(2000);
		wapi.clicksavechanges();
		implicitwait();
		wapi.updated_message("Whatsapp Settings");
		System.out.println("Whatsapp api is updated");
	}
	
	@Test
	public void TC_MT_009() {
		test=extent.createTest("TC_MT_009");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		ga.clickwhatsappapi();
		implicitwait();
		Marketingtool_whatsappapi wapi=new Marketingtool_whatsappapi(driver);
		
		wapi.enterwhatsappnumber(" ");
		wapi.selectEnability("Enable");
		wapi.enterpretextproduct("Your product has been placed");
		wapi.enterotherpage("Thank you for choosing us");
		wapi.clicksavechanges();
		System.out.println("whatapp number not provided");
	}
	
	@Test
	public void TC_MT_010(){ 
		
		test=extent.createTest("TC_MT_010");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		ga.clickwhatsappapi();
		implicitwait();
		Marketingtool_whatsappapi wapi=new Marketingtool_whatsappapi(driver);
		
		wapi.enterwhatsappnumber("9876543210 ");
		wapi.selectEnability("Enable");
		wapi.enterpretextproduct("");
		wapi.enterotherpage("Thank you for choosing us");
		wapi.clicksavechanges();
		
		System.out.println("Pretext not provided");
	}
	
	@Test
	public void TC_MT_011() {
		
		test=extent.createTest("TC_MT_011");
		Dashboard d = new Dashboard(driver);
		d.click_marketingtool();
		implicitwait();
		Marketingtool_googleanalytics ga=new Marketingtool_googleanalytics(driver);
		ga.clickwhatsappapi();
		implicitwait();
		Marketingtool_whatsappapi wapi=new Marketingtool_whatsappapi(driver);
		
		wapi.enterwhatsappnumber("9876543210");
		wapi.selectEnability("Enable");
		wapi.enterpretextproduct("Your order has been placed");
		wapi.enterotherpage("");
		wapi.clicksavechanges();
		System.out.println("Otherpage text not provided");
	}
	

	
}
