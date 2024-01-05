package com.sb.testcases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.Settings.settings_storesettings;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;

public class TC_Storesettings_seller extends extentreports {

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

		Thread.sleep(4000);

	}

	// Validate store setting-general(success)

	@Test
	public void TC_AF_001() throws InterruptedException {
		test = extent.createTest("TC_AF_001");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription("Welcome To our fashion store.");

		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862167");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("#ABCD");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		implicitwait();

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(1000);

		s.getmessage();

	}
	// Validate store setting-general- store name not provided

	@Test
	public void TC_AF_002() throws InterruptedException {
		test = extent.createTest("TC_AF_002");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("         ");

		s.enterstoredescription("Welcome To our fashion store.");

		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862167");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("123456");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		implicitwait();

		s.storenameerrormessage();

	}

	// store name with less than 4 letters

	@Test
	public void TC_AF_003() throws InterruptedException {
		test = extent.createTest("TC_AF_003");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("abc");

		s.enterstoredescription("Welcome To our fashion store.");

		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862167");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		implicitwait();

		s.warningmessage();

		implicitwait();

	}

	// store name with more than 15 characters

	@Test
	public void TC_AF_004() throws InterruptedException {
		test = extent.createTest("TC_AF_004");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription("Welcome To our fashion store.");

		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862167");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		implicitwait();

	}
	// store description not provided

	@Test
	public void TC_AF_005() throws InterruptedException {
		test = extent.createTest("TC_AF_005");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription("   ");

		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862167");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		Thread.sleep(1000);

		s.storedescriptionerrormessage();

		implicitwait();

	}

	// store description by entering many characters

	@Test
	public void TC_AF_006() throws InterruptedException {
		test = extent.createTest("TC_AF_006");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription(
				"Google Doodle on Friday (Aug 4) celebrated the life of US-based designer Altina Schinasi. She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting Altina inside a cat-eye framed eyeglass.");

		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862167");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		implicitwait();

		s.descriptionerror();
	}

	// email not provided
	@Test
	public void TC_AF_007() throws InterruptedException {
		test = extent.createTest("TC_AF_007");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);
		s.enterstorename("instamart");

		s.enterstoredescription(
				"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");

		s.enteremail("               ");

		s.entermobile("9447862167");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		implicitwait();

		s.eamilerrormessage();

	}

	// entered invalid email
	@Test
	public void TC_AF_008() throws InterruptedException {
		test = extent.createTest("TC_AF_008");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription(
				"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");

		s.enteremail("sellersingleojrgmail.com");

		s.entermobile("9447862167");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		implicitwait();

		s.eamilerrormessage();

	}

	// mobile number not provided
	@Test
	public void TC_AF_009() throws InterruptedException {
		test = extent.createTest("TC_AF_009");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription(
				"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");

		s.enteremail("sellersingleojrgmail.com");

		s.entermobile("        ");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		implicitwait();

		s.mobileerrormessage();

	}

	// invalid mobile number provided
	@Test
	         public void TC_AF_010() throws InterruptedException {
					test = extent.createTest("TC_AF_010");
					JavascriptExecutor js = (JavascriptExecutor) driver;
  
					Dashboard d = new Dashboard(driver);

					d.clicksettings();

					d.clickstoresettings();

					  settings_storesettings s=new settings_storesettings(driver);
	                                                                
						s.enterstorename("instamart");

						s.enterstoredescription(
								"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");

						s.enteremail("sellersinglebag123@gmail.com");

						s.entermobile("9447862");
             
						s.orderreceivemethod("whatsapp");

						s.removelanguage();

						s.chooseenglish();

						s.defaultlanguage("en");

						s.entertax("5");

						s.entergst("12345");

						s.choosecurrency("INR");

					    s.enterorderID("ABCDE");

						js.executeScript("window.scrollTo(0, 500)");

						Thread.sleep(3000);

						s.clicksave();

						js.executeScript("window.scrollTo(0, -500)");

						implicitwait();

						s.mobileerrormessage();

						Thread.sleep(3000);

					}

	// Language not provided
	@Test
	public void TC_AF_011() throws InterruptedException {
		test = extent.createTest("TC_AF_011");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

           settings_storesettings s=new settings_storesettings(driver);
	                                                                
			s.enterstorename("instamart");

			s.enterstoredescription(
					"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");

			s.enteremail("sellersinglebag123@gmail.com");

			s.entermobile("9447862123");

			s.orderreceivemethod("whatsapp");

			s.removelanguage();

			s.defaultlanguage("en");

			s.entertax("5");

			s.entergst("12345");

			s.choosecurrency("INR");

			s.enterorderID("ABCDE");

			js.executeScript("window.scrollTo(0, 500)");

			Thread.sleep(3000);

	          s.clicksave();
	                                                                
				js.executeScript("window.scrollTo(0,-1000)");

				implicitwait();

				s.languageerror();

				Thread.sleep(3000);

			}

	// Tax not provided
	@Test
	public void TC_AF_012() throws InterruptedException {
		test = extent.createTest("TC_AF_012");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription(
				"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");
        
		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862123");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax(" ");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		js.executeScript("window.scrollTo(0,-1000)");

		implicitwait();

		s.taxerror();

		Thread.sleep(3000);

	}

	// Invalid Tax provided
	@Test
	public void TC_AF_013() throws InterruptedException {
		test = extent.createTest("TC_AF_013");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription(
				"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");

		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862123");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("ADGTDF");

		s.entergst("12345");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		js.executeScript("window.scrollTo(0,-1000)");

		implicitwait();

		s.taxerror();

		Thread.sleep(3000);

	}

	// GST not provided
	@Test
	public void TC_AF_014() throws InterruptedException {
		test = extent.createTest("TC_AF_014");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription(
				"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");

		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862123");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst(" ");

		s.choosecurrency("INR");

		s.enterorderID("ABCDE");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		js.executeScript("window.scrollTo(0,-1000)");

		implicitwait();

		s.gsterror();

		Thread.sleep(3000);

	}

	// Order ID not provided
	@Test
	public void TC_AF_015() throws InterruptedException {
		test = extent.createTest("TC_AF_015");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Dashboard d = new Dashboard(driver);

		d.clicksettings();

		d.clickstoresettings();

		settings_storesettings s = new settings_storesettings(driver);

		s.enterstorename("instamart");

		s.enterstoredescription(
				"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");

		s.enteremail("sellersinglebag123@gmail.com");

		s.entermobile("9447862123");

		s.orderreceivemethod("whatsapp");

		s.removelanguage();

		s.chooseenglish();

		s.defaultlanguage("en");

		s.entertax("5");

		s.entergst("ABJKH");

		s.choosecurrency("INR");

		s.enterorderID(" ");

		js.executeScript("window.scrollTo(0, 500)");

		Thread.sleep(3000);

		s.clicksave();

		implicitwait();

		s.orderIDerror();

		Thread.sleep(3000);

	}

	// Invalid order ID provided
	@Test
	public void TC_AF_016() throws InterruptedException {
		test = extent.createTest("TC_AF_016");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.enterstorename("instamart");
		s.enterstoredescription(
				"She is most famously known for the trendy ‘cat-eye’ eyeglass frame design. The doodle marked the 116th birthday of the American designer with a doodle depicting glass.");
		s.enteremail("sellersinglebag123@gmail.com");
		s.entermobile("9447862123");
		s.orderreceivemethod("whatsapp");
		s.removelanguage();
		s.chooseenglish();
		s.defaultlanguage("en");
		s.entertax("5");
		s.entergst("ABJKH");
		s.choosecurrency("INR");
		s.enterorderID("12345");
		js.executeScript("window.scrollTo(0, 500)");
		Thread.sleep(3000);
		s.clicksave();
		implicitwait();
		s.orderIDwithnumbermsg();
		Thread.sleep(3000);
	}

	// Validate store setting-general by clicking upgrade plan button
	@Test
	public void TC_AF_017() throws InterruptedException {
		test = extent.createTest("TC_AF_017");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		js.executeScript("window.scrollTo(0, 500)");
		Thread.sleep(2000);
		s.clickupgradeplan();
		s.pricingplanpageisdisplayed();
	}

	// location
	// Validate store setting-general by clicking upgrade plan button
	@Test
	public void TC_AF_018() throws InterruptedException {
		test = extent.createTest("TC_AF_018");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("sellersinglebag123@gmail.com");
		s.l_enterPhone("8925321680");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("Sirkali");
		s.l_enterState("TamilNadu");
		s.l_enterZip("609110");
		s.l_enterDescription("Handle with care");
		s.l_savelocation();
		s.l_successmsg();
	}

	// company name not provided
	@Test
	public void TC_AF_019() {
		test = extent.createTest("TC_AF_019");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("");
		s.l_enterEmail("sellersinglebag123@gmail.com");
		s.l_enterPhone("8925321680");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("Sirkali");
		s.l_enterState("TamilNadu");
		s.l_enterZip("609110");
		s.l_enterDescription("Handle with care");
		s.l_savelocation();
		s.l_companynameerror();
		implicitwait();
	}

	// Email not entered
	@Test
	public void TC_AF_020() throws InterruptedException {
		test = extent.createTest("TC_AF_020");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("");
		s.l_enterPhone("8925321680");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("Sirkali");
		s.l_enterState("TamilNadu");
		s.l_enterZip("609110");
		s.l_enterDescription("Handle with care");
		s.l_savelocation();
		s.l_emaileerror();
		implicitwait();
	}

	// Invalid email ID
	@Test
	public void TC_AF_021() throws InterruptedException {
		test = extent.createTest("TC_AF_021");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("sellersinglebag123gmail.com");
		s.l_enterPhone("8925321680");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("Sirkali");
		s.l_enterState("TamilNadu");
		s.l_enterZip("609110");
		s.l_enterDescription("Handle with care");
		s.l_savelocation();
		s.l_emaileerror();
		implicitwait();
	}

	// Phone number not entered
	@Test
	public void TC_AF_022() throws InterruptedException {
		test = extent.createTest("TC_AF_022");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("sellersinglebag123@gmail.com");
		s.l_enterPhone("");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("Sirkali");
		s.l_enterState("TamilNadu");
		s.l_enterZip("609110");
		s.l_enterDescription("Handle with care");
		s.l_savelocation();
		s.l_phoneerror();
		implicitwait();
	}

	// invalid Phone number not entered
	@Test
	public void TC_AF_023() throws InterruptedException {
		test = extent.createTest("TC_AF_023");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("sellersinglebag123@gmail.com");
		s.l_enterPhone("892531");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("Sirkali");
		s.l_enterState("TamilNadu");
		s.l_enterZip("609110");
		s.l_enterDescription("Handle with care");
		s.l_phonevalidation();
		implicitwait();
	}

	// address not provided
	@Test
	public void TC_AF_024() throws InterruptedException {
		test = extent.createTest("TC_AF_024");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("sellersinglebag123@gmail.com");
		s.l_enterPhone("8925321680");
		s.l_enterAddress("");
		s.l_enterCity("Sirkali");
		s.l_enterState("TamilNadu");
		s.l_enterZip("609110");
		s.l_enterDescription("Handle with care");
		s.l_savelocation();
		s.l_addresserror();
		implicitwait();
	}

	// City not provided
	@Test
	public void TC_AF_025() throws InterruptedException {
		test = extent.createTest("TC_AF_025");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("sellersinglebag123@gmail.com");
		s.l_enterPhone("8925321680");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("");
		s.l_enterState("TamilNadu");
		s.l_enterZip("609110");
		s.l_enterDescription("Handle with care");
		s.l_savelocation();
		s.l_cityerror();
		implicitwait();
	}

	// State not provided
	@Test
	public void TC_AF_026() throws InterruptedException {
		test = extent.createTest("TC_AF_026");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("sellersinglebag123@gmail.com");
		s.l_enterPhone("8925321680");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("Mayiladuthurai");
		s.l_enterState("");
		s.l_enterZip("609110");
		s.l_enterDescription("Handle with care");
		s.l_savelocation();
		s.l_stateerror();
		implicitwait();
	}

	// Zip not provided
	@Test
	public void TC_AF_027() throws InterruptedException {
		test = extent.createTest("TC_AF_027");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("sellersinglebag123@gmail.com");
		s.l_enterPhone("8925321680");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("Mayiladuthurai");
		s.l_enterState("TamilNadu");
		s.l_enterZip("");
		s.l_enterDescription("Handle with care");
		s.l_savelocation();
		s.l_ziperror();
		implicitwait();
	}

	// Invoice description not provided
	@Test
	public void TC_AF_028() throws InterruptedException {
		test = extent.createTest("TC_AF_028");
		Dashboard d = new Dashboard(driver);
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clicklocationTab();
		s.l_entercompanyname("Instamart");
		s.l_enterEmail("sellersinglebag123@gmail.com");
		s.l_enterPhone("8925321680");
		s.l_enterAddress("VLS Illam");
		s.l_enterCity("Mayiladuthurai");
		s.l_enterState("TamilNadu");
		s.l_enterZip("609110");
		s.l_enterDescription("");
		s.l_savelocation();
		s.l_invoiceerror();
		implicitwait();
	}

	// PWA Settings with success
	@Test
	public void TC_AF_029() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_029");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamart");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.PWAsuccessmesg();
	}

	// App title not provided
	@Test
	public void TC_AF_030() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_030");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("");
		s.p_enterName("Instamart");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_titleerror();
	}

	// App name not provided
	@Test
	public void TC_AF_031() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_031");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_nameerror();
	}

	// BG color not provided
	@Test
	public void TC_AF_032() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_032");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamrt");
		s.p_enterBackgroundColor("");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_bgerror();
	}

	// Theme color not provided
	@Test
	public void TC_AF_033() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_033");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamrt");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_themeerror();
	}

	// Language not provided
	@Test
	public void TC_AF_034() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_034");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamrt");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_languageerror();
	}

	// App icon128 not provided
	@Test
	public void TC_AF_035() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_035");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamrt");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_128error();
	}

	// App icon144 not provided
	@Test
	public void TC_AF_036() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_036");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamrt");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_144error();
	}

	// App icon152 not provided
	@Test
	public void TC_AF_037() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_037");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamrt");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_152error();
	}

	// App icon 192 not provided
	@Test
	public void TC_AF_038() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_038");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamrt");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_192error();
	}

	// App icon 256 not provided
	@Test
	public void TC_AF_039() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_039");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamrt");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_512image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\512x512.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_256error();
	}

	// App icon 512 not provided
	@Test
	public void TC_AF_040() throws InterruptedException, AWTException {
		test = extent.createTest("TC_AF_040");
		Dashboard d = new Dashboard(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		d.clicksettings();
		d.clickstoresettings();
		settings_storesettings s = new settings_storesettings(driver);
		s.clickPWATab();
		s.p_enterTitle("Instamart");
		s.p_enterName("Instamrt");
		s.p_enterBackgroundColor("Red");
		s.p_enterThemeColor("Pink");
		s.p_enterLanguage("en");
		Thread.sleep(500);
		s.l_128image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\128x128.png");
		Thread.sleep(500);
		s.l_144image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\144x144.png");
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 400)");
		Thread.sleep(2000);
		s.l_152image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\152x152.png");
		Thread.sleep(500);
		s.l_192image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\192x192.png");
		Thread.sleep(500);
		s.l_256image();
		d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\256x256.png");
		Thread.sleep(500);
		s.p_savePWASettings();
		js.executeScript("window.scrollTo(0, -1000)");
		implicitwait();
		s.p_512error();
	}

	
	
	//validate store settings others
    @Test
           public void TC_AF_041() throws InterruptedException, AWTException {
           test=extent.createTest("TC_AF_041");
           JavascriptExecutor js=(JavascriptExecutor)driver;            
           Dashboard d = new Dashboard(driver);
           d.clicksettings();                
           d.clickstoresettings();               
           settings_storesettings s = new settings_storesettings(driver);
           s.clickothers();
           implicitwait();
           s.o_themecolor("rgb(33, 32, 96)");
           s.o_clicklogo();
           implicitwait();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\others 250x120.png");
           s.o_clickfavicon();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\Fashionbag_logo_1_64x64 (1).ico");
           ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");
           s.o_clickAddNewBtn();
           Thread.sleep(2000);
           s.o_enterFacebookUrl("https://www.facebook.com");
           s.o_enterUrl("fa fa-facebook");
           js.executeScript("window.scrollTo(0, 500)");
           implicitwait();
           s.o_clickothersave();
           s.o_getsuccessmsg();        
    }

   //validate store settings others by theme color not provided
    @Test
           public void TC_AF_042() throws InterruptedException, AWTException {
           test=extent.createTest("TC_AF_042");
           JavascriptExecutor js=(JavascriptExecutor)driver;            
           Dashboard d = new Dashboard(driver);
           d.clicksettings();                
           d.clickstoresettings();               
           settings_storesettings s = new settings_storesettings(driver);
           s.clickothers();
           implicitwait();
           s.o_themecolor("");
           s.o_clicklogo();
           implicitwait();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\others 250x120.png");
           s.o_clickfavicon();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\Fashionbag_logo_1_64x64 (1).ico");
           ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");
           s.o_clickAddNewBtn();
           Thread.sleep(2000);
           s.o_enterFacebookUrl("https://www.facebook.com");
           s.o_enterUrl("fa fa-facebook");
           js.executeScript("window.scrollTo(0, 500)");
           implicitwait();
           s.o_clickothersave();
           s.o_themeerror();
    }


    //validate store settings others by URL not provided
    @Test
           public void TC_AF_043() throws InterruptedException, AWTException {
           test=extent.createTest("TC_AF_043");
           JavascriptExecutor js=(JavascriptExecutor)driver;            
           Dashboard d = new Dashboard(driver);
           d.clicksettings();                
           d.clickstoresettings();               
           settings_storesettings s = new settings_storesettings(driver);
           s.clickothers();
           implicitwait();
           s.o_themecolor("rgb(33, 32, 96)");
           s.o_clicklogo();
           implicitwait();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\others 250x120.png");
           s.o_clickfavicon();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\Fashionbag_logo_1_64x64 (1).ico");
           ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");
           s.o_clickAddNewBtn();
           Thread.sleep(2000);
           s.o_enterFacebookUrl("");
           s.o_enterUrl("fa fa-facebook");
           js.executeScript("window.scrollTo(0, 500)");
           implicitwait();
           s.o_clickothersave();
           s.o_urlerror();
    }

  //validate store settings others by social media not provided
    @Test
           public void TC_AF_044() throws InterruptedException, AWTException {
           test=extent.createTest("TC_AF_044");
           JavascriptExecutor js=(JavascriptExecutor)driver;            
           Dashboard d = new Dashboard(driver);
           d.clicksettings();                
           d.clickstoresettings();               
           settings_storesettings s = new settings_storesettings(driver);
           s.clickothers();
           implicitwait();
           s.o_themecolor("rgb(33, 32, 96)");
           s.o_clicklogo();
           implicitwait();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\others 250x120.png");
           s.o_clickfavicon();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\Fashionbag_logo_1_64x64 (1).ico");
           ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");
           s.o_clickAddNewBtn();
           Thread.sleep(2000);
           s.o_enterFacebookUrl("https://www.facebook.com");
           s.o_enterUrl("");
           js.executeScript("window.scrollTo(0, 500)");
           implicitwait();
           s.o_clickothersave();
           s.o_socialmediaerror();
    }

  //validate store settings others by social media not provided
    @Test
           public void TC_AF_045() throws InterruptedException, AWTException {
           test=extent.createTest("TC_AF_045");
           JavascriptExecutor js=(JavascriptExecutor)driver;            
           Dashboard d = new Dashboard(driver);
           d.clicksettings();                
           d.clickstoresettings();               
           settings_storesettings s = new settings_storesettings(driver);
           s.clickothers();
           implicitwait();
           s.o_themecolor("rgb(33, 32, 96)");
           s.o_clicklogo();
           implicitwait();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\others 250x120.png");
           s.o_clickfavicon();
           d.uploadfile("C:\\Users\\Digi-QA\\Downloads\\Fashionbag_logo_1_64x64 (1).ico");
           ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");
           
           Thread.sleep(2000);
           s.o_clickremove();
           js.executeScript("window.scrollTo(0, 500)");
           implicitwait();
           s.o_clickothersave();
           s.o_getsuccessmsg();  
          
    }
}


