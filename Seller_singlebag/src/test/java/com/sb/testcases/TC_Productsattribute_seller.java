package com.sb.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;
import com.sb.pageogbject.products.seller.Productpage_attribute;

public class TC_Productsattribute_seller extends extentreports {
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
	public void TC_AF_001() throws InterruptedException {
		test=extent.createTest("TC_AF_001");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.click_overallcheckbox();
		pa.selectaction("Active");
		pa.click_submitinactions();
		pa.getmessage();
		System.out.println("All attributes are made active");
	}
	
	
	@Test
	public void TC_AF_002() throws InterruptedException {
		test=extent.createTest("TC_AF_002");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.click_overallcheckbox();
		pa.selectaction("Inactive");
		pa.click_submitinactions();
		pa.getmessage();
		System.out.println("All attributes cannot made inactive as it is mapped with products");
	}
	
	
	
	
	@Test
	public void TC_AF_003() throws InterruptedException {
		test=extent.createTest("TC_AF_003");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		Thread.sleep(1000);
		pa.click_partivularcheckbox("material");
		Thread.sleep(1000);
		pa.selectaction("Active");
		
		pa.click_submitinactions();
		Thread.sleep(500);
		pa.getmessage();
		System.out.println("Particular attribute action is changed as per action select");
	}
	
	
	@Test
	public void TC_AF_004() throws InterruptedException {
		test=extent.createTest("TC_AF_004");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		Thread.sleep(1000);
		pa.click_createofattribute();
		Thread.sleep(1000);
		pa.entername_attribute("MaterialType");
		pa.selectfeatured_attribute("Yes");
		Thread.sleep(2000);
		pa.clickstatus();
		Thread.sleep(1000);
		pa.clickstatusoption("Active");
		Thread.sleep(2000);
		pa.clicksave_attribute();
		pa.getmessage();
		System.out.println("Attribute is created successfully");
	}
	
	
	
	@Test
	public void TC_AF_005() throws InterruptedException {
		test=extent.createTest("TC_AF_005");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		Thread.sleep(1000);
		pa.click_createofattribute();
		Thread.sleep(1000);
		pa.entername_attribute("");
		
		
		pa.selectfeatured_attribute("Yes");
		Thread.sleep(2000);
		pa.clickstatus();
		Thread.sleep(1000);
		pa.clickstatusoption("Active");
		Thread.sleep(2000);
		pa.clicksave_attribute();
pa.clicksave_attribute();
pa.errorname_attribute();

		System.out.println("Name not provided for attribute creation");
	}
	
	
	@Test
	public void TC_AF_006() throws InterruptedException {
		test=extent.createTest("TC_AF_006");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.choosingsearchoptions("Search By Name");
		pa.entervalueinsearch("Design");
		pa.clicksearch();
		pa.verifysearchedvalue();


		System.out.println("Search result is displayed");
	}
	
	
	@Test
	public void TC_AF_007() throws InterruptedException {
		test=extent.createTest("TC_AF_007");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.choosingsearchoptions("Search By Name");
		
		pa.clicksearch();
	pa.error_valueinsearch();
		System.out.println("Negative search");
		
	}
	

	@Test
	public void TC_AF_008() throws InterruptedException {
		test=extent.createTest("TC_AF_008");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.clickediticon_attribute("MaterialType");
	
		pa.entername_attribute("MaterialType");
	
		pa.clickstatus();
		
		pa.clickstatusoption("Active");
		
		pa.clicksave_attribute();
		pa.getmessage();
		System.out.println("Attribute is updated successfully");
		
	}
	
	
	@Test
	public void TC_AF_009() throws InterruptedException {
		test=extent.createTest("TC_AF_009");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.clicksettingicon_attribute("material");
		implicitwait();
		pa.click_createofattributevalues();
		implicitwait();
		pa.entername_attribute("velvet");
		pa.selectattribute("material");
		pa.selectfeatured_attribute("Yes");
		pa.clickstatus();
		pa.clickstatusoption("Active");
		pa.clicksave_attribute();
		pa.getmessage();
		System.out.println("Attributevalue is created successfully");
		
	}
	
	
	
	@Test
	public void TC_AF_010() throws InterruptedException {
		test=extent.createTest("TC_AF_010");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.clicksettingicon_attribute("material");
		implicitwait();
		pa.click_createofattributevalues();
		implicitwait();
		pa.entername_attribute("");
		pa.errorname_attribute();
		pa.selectattribute("Colour");
		pa.selectfeatured_attribute("Yes");
		pa.clickstatus();
		pa.clickstatusoption("Active");
		pa.clicksave_attribute();
		
		System.out.println("Name not provided for attribute value creation");
		
	}
	
	
	@Test
	public void TC_AF_011() throws InterruptedException {
		test=extent.createTest("TC_AF_011");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.clicksettingicon_attribute("material");
		Thread.sleep(2000);
		pa.clickediticon_attributevalue("ciffon");
		Thread.sleep(2000);
		pa.entername_attribute("ciffon");
		pa.errorname_attribute();
		pa.selectattribute("material");
		pa.selectfeatured_attribute("Yes");
		implicitwait();
		pa.clickstatus();
		implicitwait();
		pa.clickstatusoption("Inactive");
		implicitwait();
		pa.clicksave_attribute();
		pa.getmessage();
		
		System.out.println("Attributevalue is updated successfully");
		
	}
	
	
	@Test
	public void TC_AF_012() throws InterruptedException {
		test=extent.createTest("TC_AF_012");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.click_createofattribute();
		pa.clickattributebtn_intop();
	
		
		System.out.println("Attribute page is displayed");
		
	}
	
	
	@Test
	public void TC_AF_013() throws InterruptedException {
		test=extent.createTest("TC_AF_013");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.click_attribute_products();
		Productpage_attribute pa= new Productpage_attribute(driver);
		pa.clicksettingicon_attribute("material");
		pa.click_createofattributevalues();
		pa.clickattribute_valuebtn_intop();
		System.out.println("Attributevalue page is displayed");
		
	}
}
