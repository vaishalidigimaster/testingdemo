package com.sb.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;
import com.sb.pageogbject.products.seller.Productpage_productoptions;

public class TC_Productoptions_seller extends extentreports{

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
		test=extent.createTest("TC_PO_001");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_create_options();
		po.enter_name("height");
		po.click_save();
		po.getmessage();
		System.out.println("Product option is created");
	
	}
	
	
	@Test
	public void TC_AF_002() throws InterruptedException {
		test=extent.createTest("TC_PO_002");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_create_options();
		po.enter_name("");
		po.click_save();
		po.optionname_errormessage();
		System.out.println(" Option name not provided");
	
	}
	
	
	@Test
	public void TC_AF_003() throws InterruptedException {
		test=extent.createTest("TC_PO_003");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_editofoptions("Test Size");
		po.enter_name("Test Size");
		po.click_save();
		po.getmessage();
		System.out.println("Product option is updated");
	
	}
	
	@Test
	public void TC_AF_004() throws InterruptedException {
		test=extent.createTest("TC_PO_004");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_settingsofoptions("height");
		po.click_create_optionsvalue();
		po.enter_name("50-100");
		po.click_save();
		po.getmessage();
		System.out.println("Product option value is created");
	
	}
	
	
	@Test
	public void TC_AF_005() throws InterruptedException {
		test=extent.createTest("TC_PO_005");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_settingsofoptions("height");
		po.click_create_optionsvalue();
		po.enter_name("");
		po.click_save();
		po.optionnamevalue_errormessage();
		System.out.println("Product option value  name not provided ");
	
	}
	
	
	
	@Test
	public void TC_AF_006() throws InterruptedException {
		test=extent.createTest("TC_PO_006");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_settingsofoptions("height");
		po.edit_optionsvalues("50-100");
		po.enter_name("50-100");
		po.click_save();
		po.getmessage();
		System.out.println("Product option value  is updated ");
	
	}
	
	@Test
	public void TC_AF_007() throws InterruptedException {
		test=extent.createTest("TC_PO_007");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_create_options();
		po.productoption_navigate();
		po.getpagetitle();
		System.out.println("product option page is displayed");
	}
	
	
	@Test
	public void TC_AF_008() throws InterruptedException {
		test=extent.createTest("TC_PO_008");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_editofoptions("height");
		po.productoption_navigate();
		po.getpagetitle();
		System.out.println("product option page is displayed");
	}
	
	
	
	@Test
	public void TC_AF_009() throws InterruptedException {
		test=extent.createTest("TC_PO_009");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_settingsofoptions("height");
		po.click_create_optionsvalue();
		po.optionvalue_navigate();
		po.getpagetitle();
		System.out.println("product option  value page is displayed");
	}
	
	@Test
	public void TC_AF_010() throws InterruptedException {
		test=extent.createTest("TC_PO_010");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.click_settingsofoptions("height");
		po.edit_optionsvalues("50-100");
		po.optionvalue_navigate();
		po.getpagetitle();
		System.out.println("product option  value page is displayed");
	}
	
	
	
	@Test
	public void TC_AF_012() throws InterruptedException {
		test=extent.createTest("TC_PO_012");
		Dashboard d = new Dashboard(driver);
		d.click_products();
		d.clickproductoption_products();
		Productpage_productoptions po = new Productpage_productoptions(driver);
		po.clickhome();
		po.gethometitle();
		System.out.println("Home page is displayed");
	}
	
}
