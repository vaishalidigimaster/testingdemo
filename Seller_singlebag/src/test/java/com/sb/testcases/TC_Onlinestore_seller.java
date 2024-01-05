package com.sb.testcases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;
import com.sb.pageobject.onlinestore.seller.Onlinestorepage_Bannerads;
import com.sb.pageobject.onlinestore.seller.Onlinestorepage_Bumpads;
import com.sb.pageobject.onlinestore.seller.Onlinestorepage_Menus;
import com.sb.pageobject.onlinestore.seller.Onlinestorepage_SEO;
import com.sb.pageobject.onlinestore.seller.Onlinestorepage_Sliders;
import com.sb.pageobject.onlinestore.seller.Onlinestorepage_pages;

public class TC_Onlinestore_seller extends  extentreports {
	
		@BeforeMethod()
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
		
		@Test(enabled=false)
		public void TC_OSF_001() throws InterruptedException {
			test=extent.createTest("TC_OSF_001");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSEO();
		implicitwait();
		Onlinestorepage_SEO seo = new Onlinestorepage_SEO(driver);
		seo.set_sitetitle("Online store for outfits world");
		seo.set_twitterTitle("Online store for outfits world");
		seo.setUrl("https://instamart.pay380.com/");
		seo.setTag("dress");
		seo.setDescription("Online store for adults, kids,etc");
		seo.clickUpdate();
		seo.getmessage();
		
	System.out.println("SEO of online store is updated");
		}
		
		
		// sliders
		
		
		@Test(enabled=false)
		public void TC_OSF_002() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_002");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		slid.clickcreate();
		slid.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		slid.settitle("Super sale");
		slid.setdescription("Summer sale");
		slid.enterbuttontext("summer sale");
		slid.selectposition("Right");
		slid.entertextcolor("Red");
		slid.enterurl("https://instamart.pay380.com/product/frock/1638");
		slid.clicksaveorupdate();
		slid.getmessage();
		System.out.println("successfully slider is created");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_003() throws InterruptedException {
			test=extent.createTest("TC_OSF_003");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		slid.clickcreate();
		
		slid.settitle("Super sale");
		slid.setdescription("Summer sale");
		slid.enterbuttontext("summer sale");
		slid.selectposition("Right");
		slid.entertextcolor("Red");
		slid.clicksaveorupdate();
		slid.fileerror();
		System.out.println("File not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_004() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_004");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		slid.clickcreate();
		slid.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		slid.settitle("");
		slid.setdescription("Summer sale");
		slid.enterbuttontext("summer sale");
		slid.selectposition("Right");
		slid.entertextcolor("Red");
		slid.clicksaveorupdate();
		slid.titleerror();
		System.out.println("Title not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_005() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_005");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		slid.clickcreate();
		slid.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		slid.settitle("Super sale");
		slid.setdescription("");
		slid.enterbuttontext("summer sale");
		slid.selectposition("Right");
		slid.entertextcolor("Red");
		slid.clicksaveorupdate();
		slid.descriptionerror();
		System.out.println("Description not provided");
		
		}
		
		@Test(enabled=false)
		public void TC_OSF_006() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_006");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		slid.clickcreate();
		slid.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		slid.settitle("Super sale");
		slid.setdescription("summer sale");
		slid.enterbuttontext("");
		slid.selectposition("Right");
		slid.entertextcolor("Red");
		slid.clicksaveorupdate();
		slid.buttontaxterror();
		System.out.println("Button text not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_007() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_007");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		slid.clickcreate();
		slid.setimage();
	Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		slid.settitle("Super sale");
		slid.setdescription("summer sale");
		slid.enterbuttontext("summer sale");
		slid.selectposition("Right");
		slid.entertextcolor("");
		slid.clicksaveorupdate();
		slid.textcolorerror();
		System.out.println("Text color not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_008() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_008");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		slid.clickcreate();
		slid.clickdiscard();
		System.out.println("Discard option is working");
		}
		
		@Test(enabled=false)
		public void TC_OSF_009() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_009");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
	slid.clickedit("Sale");
		slid.clickslidersbtn();
		System.out.println("Slider page is displayed");
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_010() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_010");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500, 0)");
		slid.clickedit("Sale");
		
		
		implicitwait();
		slid.settitle("Sale");
		slid.setdescriptioninedit("Tuesday sale");
		slid.enterbuttontext("Tuesday sale");
		slid.selectposition("Left");
		slid.entertextcolor("Blue");
		slid.clicksaveorupdate();
		slid.getmessage();
		System.out.println("successfully slider is updated");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_011() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_011");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500, 0)");
		slid.clickdeleteicon("slider");//change everytime while testing
		
		slid.clickyesdoitbtn();
		slid.gettitlemessage();
		
		System.out.println("successfully slider is deleted");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_012() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_012");
			Dashboard d = new Dashboard(driver); 
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreSliders();
		Onlinestorepage_Sliders slid= new Onlinestorepage_Sliders(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500, 0)");
		slid.clickdeleteicon("Sale");
		
		slid.clickcancelbtn();
		
		System.out.println("cancel button in delete is working successfully");
		
		}
		
		
		
		// bump ads
		
		
		
		@Test(enabled=false)
		public void TC_OSF_013() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_013");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		
		bp.clickcreate();
		bp.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		bp.settitle("Super sale");
		bp.setdescription("Summer sale");
		bp.enterbuttontext("summer sale");
		bp.selectposition("Right");
		bp.entertextcolor("Red");
		bp.enterurl("https://instamart.pay380.com/product/frock/1638");
		bp.clicksaveorupdate();
		bp.getmessage();
		System.out.println("successfully Bump ad is created");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_014() throws InterruptedException {
			test=extent.createTest("TC_OSF_014");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		bp.clickcreate();
		
		bp.settitle("Super sale");
		bp.setdescription("Summer sale");
		bp.enterbuttontext("summer sale");
		bp.selectposition("Right");
		bp.entertextcolor("Red");
		bp.clicksaveorupdate();
		bp.fileerror();
		System.out.println("File not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_015() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_015");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		bp.clickcreate();
		bp.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		bp.settitle("");
		bp.setdescription("Summer sale");
		bp.enterbuttontext("summer sale");
		bp.selectposition("Right");
		bp.entertextcolor("Red");
		bp.clicksaveorupdate();
		bp.titleerror();
		System.out.println("Title not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_016() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_016");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		bp.clickcreate();
		bp.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		bp.settitle("Super sale");
		bp.setdescription("");
		bp.enterbuttontext("summer sale");
		bp.selectposition("Right");
		bp.entertextcolor("Red");
		bp.clicksaveorupdate();
		bp.descriptionerror();
		System.out.println("Description not provided");
		
		}
		
		@Test(enabled=false)
		public void TC_OSF_017() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_017");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		bp.clickcreate();
		bp.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		bp.settitle("Super sale");
		bp.setdescription("summer sale");
		bp.enterbuttontext("");
		bp.selectposition("Right");
		bp.entertextcolor("Red");
		bp.clicksaveorupdate();
		bp.buttontaxterror();
		System.out.println("Button text not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_018() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_018");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		bp.clickcreate();
		bp.setimage();
	Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		bp.settitle("Super sale");
		bp.setdescription("summer sale");
		bp.enterbuttontext("summer sale");
		bp.selectposition("Right");
		bp.entertextcolor("");
		bp.clicksaveorupdate();
		bp.textcolorerror();
		System.out.println("Text color not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_019() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_019");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		bp.clickcreate();
		bp.clickdiscard();
		System.out.println("Discard option is working");
		}
		
		@Test(enabled=false)
		public void TC_OSF_020() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_020");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
	bp.clickedit("Sale");
		bp.clickbumpadbtn();
		System.out.println("Bump ad page is displayed");
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_021() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_021");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500, 0)");
		bp.clickedit("Sale");
		
		
		implicitwait();
		bp.settitle("Sale");
		bp.setdescriptioninedit("Tuesday sale");
		bp.enterbuttontext("Tuesday sale");
		bp.selectposition("Left");
		bp.entertextcolor("Blue");
		bp.clicksaveorupdate();
		bp.getmessage();
		System.out.println("successfully Bump ad is updated");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_022() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_022");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500, 0)");
		
		bp.clickdeleteicon("kadal alai pol un kalthottu orasi kadal ula poraven naan ela di.");//change everytime while testing
		
		bp.clickyesdoitbtn();
		bp.gettitlemessage1();
		
		System.out.println("successfully Bump ad is deleted");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_023() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_023");
			Dashboard d = new Dashboard(driver); 
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBumpads();
		Onlinestorepage_Bumpads bp= new Onlinestorepage_Bumpads(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500, 0)");
		bp.clickdeleteicon("Sale");
		
		bp.clickcancelbtn();
		
		System.out.println("cancel button in delete is working successfully");
		
		}
		
		
		// Banner ads
		
		
		@Test(enabled=false)
		public void TC_OSF_024() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_024");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		
		ba.clickcreate();
		ba.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		ba.settitle("Super sale");
		ba.setdescription("Summer sale");
		ba.enterbuttontext("summer sale");
		ba.selectposition("Right");
		ba.entertextcolor("Red");
		ba.enterurl("https://instamart.pay380.com/product/frock/1638");
		ba.clicksaveorupdate();
		ba.getmessage();
		System.out.println("successfully Banner ad is created");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_025() throws InterruptedException {
			test=extent.createTest("TC_OSF_025");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		ba.clickcreate();
		
		ba.settitle("Super sale");
		ba.setdescription("Summer sale");
		ba.enterbuttontext("summer sale");
		ba.selectposition("Right");
		ba.entertextcolor("Red");
		ba.clicksaveorupdate();
		ba.fileerror();
		System.out.println("File not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_026() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_026");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		ba.clickcreate();
		ba.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		ba.settitle("");
		ba.setdescription("Summer sale");
		ba.enterbuttontext("summer sale");
		ba.selectposition("Right");
		ba.entertextcolor("Red");
		ba.clicksaveorupdate();
		ba.titleerror();
		System.out.println("Title not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_027() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_027");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		ba.clickcreate();
		ba.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		ba.settitle("Super sale");
		ba.setdescription("");
		ba.enterbuttontext("summer sale");
		ba.selectposition("Right");
		ba.entertextcolor("Red");
		ba.clicksaveorupdate();
		ba.descriptionerror();
		System.out.println("Description not provided");
		
		}
		
		@Test(enabled=false)
		public void TC_OSF_028() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_028");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		ba.clickcreate();
		ba.setimage();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		ba.settitle("Super sale");
		ba.setdescription("summer sale");
		ba.enterbuttontext("");
		ba.selectposition("Right");
		ba.entertextcolor("Red");
		ba.clicksaveorupdate();
		ba.buttontaxterror();
		System.out.println("Button text not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_029() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_029");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		ba.clickcreate();
		ba.setimage();
	Thread.sleep(2000);
		uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		implicitwait();
		ba.settitle("Super sale");
		ba.setdescription("summer sale");
		ba.enterbuttontext("summer sale");
		ba.selectposition("Right");
		ba.entertextcolor("");
		ba.clicksaveorupdate();
		ba.textcolorerror();
		System.out.println("Text color not provided");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_030() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_030");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		ba.clickcreate();
		ba.clickdiscard();
		System.out.println("Discard option is working");
		}
		
		@Test(enabled=false)
		public void TC_OSF_031() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_031");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
	ba.clickedit("booster");
		ba.clickbanneradbtn();
		System.out.println("Banner ad page is displayed");
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_032() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_032");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500, 0)");
		ba.clickedit("booster");
		
		
		implicitwait();
		ba.settitle("booster");
		ba.setdescriptioninedit("Tuesday sale");
		ba.enterbuttontext("Tuesday sale");
		ba.selectposition("Left");
		ba.entertextcolor("Blue");
		ba.clicksaveorupdate();
		ba.getmessage();
		System.out.println("successfully Banner ad is updated");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_033() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_033");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500, 0)");
		
		ba.clickdeleteicon("dummy");//change everytime while testing
		
		ba.clickyesdoitbtn();
		ba.gettitlemessage2();
		
		System.out.println("successfully Banner ad is deleted");
		
		}
		
		
		@Test(enabled=false)
		public void TC_OSF_034() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_034");
			Dashboard d = new Dashboard(driver); 
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoreBannerads();
		Onlinestorepage_Bannerads ba= new Onlinestorepage_Bannerads(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500, 0)");
		ba.clickdeleteicon("booster");
		
		ba.clickcancelbtn();
		
		System.out.println("cancel button in delete is working successfully");
		
		}
		
		
		
		// pages
		
		@Test(enabled=false)

        public void TC_OSF_035() throws InterruptedException {

            

            test=extent.createTest("TC_OSF_035");

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            p.clickcreate();

            p.pagetitle("Privacy Policy");

            p.pagedescription("privacy-policy");

            Thread.sleep(1000);

           

         ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");

            p.pagecontent("About privacy and policy");

            Thread.sleep(2000);

            p.clicksave();

            p.gettitlemessage();

            System.out.println("Page Create message is displayed");

        }

        @Test(enabled=false)

        public void TC_OSF_036() throws InterruptedException {

            test=extent.createTest("TC_OSF_036()");

            Dashboard d =new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            p.clickcreate();

            p.pagetitle("");

            p.pagedescription("privacy-policy");

            ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");



            p.pagecontent("About privacy and policy");

            p.clicksave();

            p.gettitleerrormsg();

     //System.out.println("Please fill out this field");

            

            

        }



        @Test(enabled=false)

        public void TC_OSF_037() throws InterruptedException {

            test=extent.createTest("TC_OSF_037()");

            Dashboard d =new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            p.clickcreate();

            p.pagetitle("Privacy Policy");

            p.pagedescription("");

            ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");



            p.pagecontent("About privacy and policy");

            p.clicksave();

            p.getdescriptionerrormsg();

            

           

            

        }

        

        @Test(enabled=false)

        public void TC_OSF_038() throws InterruptedException {

            

            test=extent.createTest("TC_OSF_038");

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            p.clickcreate();

            p.pagetitle("Privacy Policy");

            p.pagedescription("privacy-policy");

            ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");



            p.pagecontent(" ");

            p.clicksave();

            p.gettitlemessage();

            //System.out.println("Page created message is displayed");

        }

        

        @Test(enabled=false)

        public void TC_OSF_039() throws InterruptedException {

            test=extent.createTest("TC_OSF_039");

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            Thread.sleep(1000);

           p.clickedit("test");

           implicitwait();

           p.edittitle("policy");

            p.editslug("terms-conditions");

            p.editdescription("Terms&Description");

            ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");



            p.pagecontent("About Terms and Condition of pages");

            

            p.clicksavechanges();

            p.edittitlemsg();

           

        }

        

        @Test(enabled=false)

        public void TC_OSF_040() throws InterruptedException {

            test=extent.createTest("TC_OSF_040");

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            implicitwait();

            p.clickedit("About Us");

            implicitwait();

            p.edittitle("");

            p.editslug("terms-conditions");

            p.editdescription("Terms&Description");

         ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");



            p.pagecontent("About Terms and Condition of pages");

            p.clicksavechanges();

            p.edittitleerrormsg();

        }

        

        @Test(enabled=false)

        public void TC_OSF_041() throws InterruptedException {

            test=extent.createTest("TC_OSF_041");

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            implicitwait();

            p.clickedit("About Us");

            implicitwait();

            p.edittitle("condition");

            p.editslug("");

            p.editdescription("Terms&Description");

            ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");



            p.pagecontent("About Terms and Condition of pages");

            p.clicksavechanges();

            p.editslugerrormsg();

        }

        

        @Test(enabled=false)

        public void TC_OSF_042() throws InterruptedException {

            test=extent.createTest("TC_OSF_042");

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            implicitwait();

            p.clickedit("condition");

            implicitwait();

            p.edittitle("About Us");

            p.editslug("terms-conditions");

            p.editdescription("");

            ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");



            p.pagecontent("About Terms and Condition of pages");

            p.clicksavechanges();

            p.editdescripitionerrormsg();

        }

        

        @Test(enabled=false)
        public void TC_OSF_043() throws InterruptedException {

            test=extent.createTest("TC_OSF_043");

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            implicitwait();

            p.clickedit("policy");

            implicitwait();

            p.edittitle("test");

            p.editslug("terms-conditions");

            p.editdescription("Terms&Description");

            ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");



            p.pagecontent("");

            p.clicksavechanges();

            p.edittitlemsg();

        }

        

        @Test(enabled=false)

        public void TC_OSF_044() throws InterruptedException {

            test=extent.createTest("TC_OSF_044");

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            p.clickshow("condition");

            System.out.println("Store domain page is displayed");

        }

        

        @Test(enabled=false)

        public void TC_OSF_045() throws InterruptedException {

            test=extent.createTest("TC_OSF_045");

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            p.clicktoparrow();

           Thread.sleep(4000);

          // ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");



            p.clickbottomarrow();

            Thread.sleep(1000);

            

        }

        

        @Test(enabled=false)

        public void TC_OSF_046() throws InterruptedException {

            Dashboard d = new Dashboard(driver);

            d.click_onlinestore();

            Thread.sleep(1000);

            d.click_Pagesonlinestore();

            Onlinestorepage_pages p=new Onlinestorepage_pages(driver);

            p.capturepagetxt();

            p.clickedit("test");

            implicitwait();

            p.clickeditpages();

            System.out.println("Pages page is displayed");

        }

        
        
        
        
        
  //   menus
        
        
        
        
        @Test
		public void TC_OSF_047() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_047");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
		m.clickheaderedit();
		System.out.println(driver.getCurrentUrl());
		m.clickhowtouse();
		
		
		Set<String> tab= driver.getWindowHandles();
		Iterator<String> it= tab.iterator();
		String parent= it.next();
		String child= it.next();
			driver.switchTo().window(child);
			String currenturl=driver.getCurrentUrl();
			System.out.println(currenturl);
			Assert.assertEquals(currenturl, "https://community.singlebag.com/docs/menus/");
		
		System.out.println("How to use is clicked");
		
		}
        
        
        
        @Test
		public void TC_OSF_054() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_054");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
		m.clickfooterleftedit();
		System.out.println(driver.getCurrentUrl());
		m.clickhowtouse();
		
		
		Set<String> tab= driver.getWindowHandles();
		Iterator<String> it= tab.iterator();
		String parent= it.next();
		String child= it.next();
			driver.switchTo().window(child);
			String currenturl=driver.getCurrentUrl();
			System.out.println(currenturl);
			Assert.assertEquals(currenturl, "https://community.singlebag.com/docs/menus/");
		
		System.out.println("How to use is clicked");
		
		}
        
        
        @Test
		public void TC_OSF_061() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_061");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
	m.clickfootercenteredit();
		System.out.println(driver.getCurrentUrl());
		m.clickhowtouse();
		
		
		Set<String> tab= driver.getWindowHandles();
		Iterator<String> it= tab.iterator();
		String parent= it.next();
		String child= it.next();
			driver.switchTo().window(child);
			String currenturl=driver.getCurrentUrl();
			System.out.println(currenturl);
			Assert.assertEquals(currenturl, "https://community.singlebag.com/docs/menus/");
		
		System.out.println("How to use is clicked");
		
		}
        
        
        @Test
		public void TC_OSF_068() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_068");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
m.clickfooterrightedit();
		System.out.println(driver.getCurrentUrl());
		m.clickhowtouse();
		
		
		Set<String> tab= driver.getWindowHandles();
		Iterator<String> it= tab.iterator();
		String parent= it.next();
		String child= it.next();
			driver.switchTo().window(child);
			String currenturl=driver.getCurrentUrl();
			System.out.println(currenturl);
			Assert.assertEquals(currenturl, "https://community.singlebag.com/docs/menus/");
		
		System.out.println("How to use is clicked");
		
		}
        
        @Test
		public void TC_OSF_048() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_048");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
            m.clickheaderedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		Thread.sleep(1000);
	
		m.selecturl("Kurti");
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		Thread.sleep(1000);
		m.drag_dropmenu("Shop", "new arrival");
		Thread.sleep(1000);
		m.savetext("Term");
		m.save();
		Thread.sleep(1000);
		m.getmessage();
		System.out.println("menu is successfully saved");
		
		}
        
        
        
        @Test
		public void TC_OSF_055() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_055");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
           m.clickfooterleftedit();
           System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		Thread.sleep(1000);
	
		m.selecturl("Kurti");
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		Thread.sleep(1000);
		m.save();
		Thread.sleep(1000);
		m.getmessage();
		System.out.println("menu is successfully saved");
		
		}
        
        
        @Test
		public void TC_OSF_062() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_062");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
          m.clickfootercenteredit();
          System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		Thread.sleep(1000);
	
		m.selecturl("Kurti");
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		Thread.sleep(1000);
		m.save();
		Thread.sleep(1000);
		m.getmessage();
		System.out.println("menu is successfully saved");
		
		}
        
        
        @Test
		public void TC_OSF_069() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_069");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
         m.clickfooterrightedit();
         System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		Thread.sleep(1000);
	
		m.selecturl("Kurti");
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		Thread.sleep(1000);
		m.save();
		Thread.sleep(1000);
		m.getmessage();
		System.out.println("menu is successfully saved");
		
		}
        
        
        @Test
		public void TC_OSF_049() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_049");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
		m.clickheaderedit();
		System.out.println(driver.getCurrentUrl());  
		m.delete("new arrival");
		Thread.sleep(2000);
		alertaccept();
		Thread.sleep(2000);
		
		System.out.println("menu is deleted");
        }
      
        
        @Test
		public void TC_OSF_056() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_056");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
	m.clickfooterleftedit();
		System.out.println(driver.getCurrentUrl());  
		m.delete("new arrival");
		Thread.sleep(2000);
		alertaccept();
		Thread.sleep(2000);
		
		System.out.println("menu is deleted");
        } 
        

        @Test
		public void TC_OSF_063() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_063");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
	m.clickfootercenteredit();
		System.out.println(driver.getCurrentUrl());  
		m.delete("new arrival");
		Thread.sleep(2000);
		alertaccept();
		Thread.sleep(2000);
		
		System.out.println("menu is deleted");
        } 
        
        
        
        @Test
		public void TC_OSF_070() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_070");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
	m.clickfooterrightedit();
		System.out.println(driver.getCurrentUrl());  
		m.delete("new arrival");
		Thread.sleep(2000);
		alertaccept();
		Thread.sleep(2000);
		
		System.out.println("menu is deleted");
        } 
        
        
        @Test
		public void TC_OSF_051() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_051");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
            m.clickheaderedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		Thread.sleep(1000);
	
		m.selecturl("Kurti");
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("text not provided");
		
		}
        
        
        
        @Test
		public void TC_OSF_052() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_052");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
            m.clickheaderedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("Menu list not provided");
		
		}
        
        
        @Test
		public void TC_OSF_053() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_053");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
            m.clickheaderedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("URL not provided");
		
		}
        
        
       
        @Test
		public void TC_OSF_058() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_058");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
           m.clickfooterleftedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		Thread.sleep(1000);
	
		m.selecturl("Kurti");
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("text not provided");
		
		}
        
        
        
        @Test
		public void TC_OSF_059() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_059");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
		 m.clickfooterleftedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("Menu list not provided");
		
		}
        
        
        @Test
		public void TC_OSF_060() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_060");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
		 m.clickfooterleftedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("URL not provided");
		
		}
        
        
       
        @Test
		public void TC_OSF_065() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_065");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
           m.clickfootercenteredit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		Thread.sleep(1000);
	
		m.selecturl("Kurti");
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("text not provided");
		
		}
        
        
        
        @Test
		public void TC_OSF_066() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_066");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
		 m.clickfootercenteredit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("Menu list not provided");
		
		}
        
        
        @Test
		public void TC_OSF_067() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_067");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
		 m.clickfootercenteredit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("URL not provided");
		
		}
        
        
        @Test
		public void TC_OSF_072() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_072");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
           m.clickfooterrightedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		Thread.sleep(1000);
	
		m.selecturl("Kurti");
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("text not provided");
		
		}
        
        
        
        @Test
		public void TC_OSF_073() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_073");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
		 m.clickfooterrightedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("Menu list not provided");
		
		}
        
        
        @Test
		public void TC_OSF_074() throws InterruptedException, AWTException {
			test=extent.createTest("TC_OSF_074");
			Dashboard d = new Dashboard(driver);
		d.click_onlinestore();
		implicitwait();
		d.click_onlinestoremenus();
		Onlinestorepage_Menus m = new Onlinestorepage_Menus(driver);
		 m.clickfooterrightedit();
            System.out.println(driver.getCurrentUrl());
            m.entertext("new arrival");
            Thread.sleep(1000);
		m.selectmenulist("Products");
		
		Thread.sleep(1000);
		m.selecttarget("Top");
	scroll();
		m.add();
		
		Thread.sleep(1000);
		
		m.getmessage();
		System.out.println("URL not provided");
		
		}
        
        
   }

   
		
		
		
		

