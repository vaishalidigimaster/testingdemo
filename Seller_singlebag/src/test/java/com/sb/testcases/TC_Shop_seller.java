package com.sb.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;
import com.sb.pageobject.shops.seller.shoppage_createstore;
import com.sb.pageobject.shops.seller.shoppage_myshops;

public class TC_Shop_seller extends extentreports {

	
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
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_switchstore("instamart");
	System.out.println("click switch store");
	}
	
	@Test
	public void TC_SF_002() throws InterruptedException {
		test=extent.createTest("TC_SF_002");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	implicitwait();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("test04");
	cs.emailid("s.i.ngleb.ag123@gmail.com");
	cs.mobilenumber("9876543888");
	cs.address("2,3nd st");
	cs.storetype("seller");
	cs.town("chennai");
	cs.state("tamilnadu");
	cs.pincode("600101");
	cs.click_language("English");
	cs.description("happy store");
	Thread.sleep(1000);
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.getmessage();
	System.out.println("successfully shop created");
	}
	
	@Test
	public void TC_SF_003() throws InterruptedException {
		test=extent.createTest("TC_SF_003");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("");
	cs.emailid("singlebag1.23@gmail.com");
	cs.mobilenumber("9876543217");
	cs.address("2,3nd st");
	cs.storetype("seller");
	cs.town("chennai");
	cs.state("tamilnadu");
	cs.pincode("600101");
	cs.click_language("English");
	cs.description("happy store");
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.errormessage("shop-name");
	System.out.println("shoname not provided");
	}
	
	@Test
	public void TC_SF_004() throws InterruptedException {
		test=extent.createTest("TC_SF_004");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("test01");
	cs.emailid("singlebag123gmail.com");
	cs.mobilenumber("9876543217");
	cs.address("2,3nd st");
	cs.storetype("seller");
	cs.town("chennai");
	cs.state("tamilnadu");
	cs.pincode("600101");
	cs.click_language("English");
	cs.description("happy store");
	cs.clicksubmit();
	
	System.out.println("Invalid emailid provided");
	}
	
	@Test
	public void TC_SF_005() throws InterruptedException {
		test=extent.createTest("TC_SF_005");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("test01");
	cs.emailid("sing.lebag123@gmail.com");
	cs.mobilenumber("987654321");
	cs.address("2,3nd st");
	cs.storetype("seller");
	cs.town("chennai");
	cs.state("tamilnadu");
	cs.pincode("600101");
	cs.click_language("English");
	cs.description("happy store");
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.errormessage("mobile_number");
	System.out.println("Invalid mobileno. provided");
	}
	
	@Test
	public void TC_SF_006() throws InterruptedException {
		test=extent.createTest("TC_SF_006");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("test01");
	cs.emailid("singlebag123@gmail.com");
	cs.mobilenumber("9876543210");
	cs.address("");
	cs.storetype("seller");
	cs.town("chennai");
	cs.state("tamilnadu");
	cs.pincode("600101");
	cs.click_language("English");
	cs.description("happy store");
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.errormessage("address");
	System.out.println("Address not provided");
	}
	
	@Test
	public void TC_SF_007() throws InterruptedException {
		test=extent.createTest("TC_SF_007");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("testdata");
	cs.emailid("singlebag123@gmail.com");
	cs.mobilenumber("9876543210");
	cs.address("2,3nd st");
	
	cs.town("chennai");
	cs.state("tamilnadu");
	cs.pincode("600101");
	cs.click_language("English");
	cs.description("happy store");
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.errormessage_for_storetype();
	System.out.println("Storetype not provided");
	}
	
	@Test
	public void TC_SF_008() throws InterruptedException {
		test=extent.createTest("TC_SF_008");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("testdata");
	cs.emailid("singlebag123@gmail.com");
	cs.mobilenumber("9876543210");
	cs.address("2,3nd st");
	cs.storetype("seller");
	cs.town("");
	cs.state("tamilnadu");
	cs.pincode("600101");
	cs.click_language("English");
	cs.description("happy store");
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.errormessage("city");
	System.out.println("town not provided");
	}
	
	@Test
	public void TC_SF_009() throws InterruptedException {
		test=extent.createTest("TC_SF_009");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("testdata");
	cs.emailid("singlebag123@gmail.com");
	cs.mobilenumber("9876543210");
	cs.address("2,3nd st");
	cs.storetype("seller");
	cs.town("chennai");
	cs.state("");
	cs.pincode("600101");
	cs.click_language("English");
	cs.description("happy store");
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.errormessage("state");
	System.out.println("State not provided");
	}
	
	@Test
	public void TC_SF_010() throws InterruptedException {
		test=extent.createTest("TC_SF_010");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("testdata");
	cs.emailid("singlebag123@gmail.com");
	cs.mobilenumber("9876543210");
	cs.address("2,3nd st");
	cs.storetype("seller");
	cs.town("chennai");
	cs.state("tamilnadu");
	cs.pincode("");
	cs.click_language("English");
	cs.description("happy store");
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.errormessage("zip_code");
	System.out.println("Pincode not provided");
	}
	
	@Test
	public void TC_SF_011() throws InterruptedException {
		test=extent.createTest("TC_SF_011");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("testdata");
	cs.emailid("singlebag123@gmail.com");
	cs.mobilenumber("9876543210");
	cs.address("2,3nd st");
	cs.storetype("seller");
	cs.town("chennai");
	cs.state("tamilnadu");
	cs.pincode("600101");
	cs.click_language("");
	cs.description("happy store");
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.errormessage("language");
	System.out.println("Language not provided");
	}
	
	@Test
	public void TC_SF_012() throws InterruptedException {
		test=extent.createTest("TC_SF_012");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.entershopname("testdata");
	cs.emailid("singlebag123@gmail.com");
	cs.mobilenumber("9876543210");
	cs.address("2,3nd st");
	cs.storetype("seller");
	cs.town("chennai");
	cs.state("tamilnadu");
	cs.pincode("600101");
	cs.click_language("");
	
	cs.clicksubmit();
	Thread.sleep(3000);
	cs.errormessage("description");
	System.out.println("description not provided");
	}
	
	@Test
	public void TC_SF_013() throws InterruptedException {
		test=extent.createTest("TC_SF_013");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		implicitwait();
		shoppage_myshops ms = new shoppage_myshops(driver);
	ms.click_createstore();
	shoppage_createstore cs= new shoppage_createstore(driver);
	cs.clickmyshops();
	Thread.sleep(3000);
	cs.gettitle();
	System.out.println("my shop page is displayed");}
	
	
	@Test
	public void TC_SF_014() throws InterruptedException {
		test=extent.createTest("TC_SF_014");
		Dashboard d = new Dashboard(driver);
		d.click_shop();
		shoppage_myshops ms = new shoppage_myshops(driver);
		ms.capture_storename("test01");
		System.out.println("new shop is present");
	}
}
