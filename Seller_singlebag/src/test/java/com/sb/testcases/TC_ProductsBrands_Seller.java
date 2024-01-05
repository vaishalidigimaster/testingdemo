package com.sb.testcases;


import java.awt.AWTException;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.sb.baseclass.extentreports;
import com.sb.pageobject.brands.Products_Brands;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;



public class TC_ProductsBrands_Seller extends extentreports {


// change brand name for every test


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



       Thread.sleep(4000);



   }



   // By clicking select all checkbox and choose active from select action



   @Test
   public void TC_CF_001() throws InterruptedException {
       test = extent.createTest("TC_CF_001");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickcheckall();



       b.clickselectaction();



       b.selectActive();



       implicitwait();



       b.clickbrandSave();



       b.getmessage();



   }



   // By clicking select all checkbox and choose inactive from select action



   @Test
   public void TC_CF_002() throws InterruptedException {
       test = extent.createTest("TC_CF_002");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickcheckall();



       b.clickselectaction();



       b.selectInActive();



       implicitwait();



       b.clickbrandSave();



       b.getmessage();



   }



   // By only choosing select action without choosing checkbox



   @Test
   public void TC_CF_003() throws InterruptedException {
       test = extent.createTest("TC_CF_003");
       Dashboard d = new Dashboard(driver);

       

       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickselectaction();



       b.selectInActive();



       implicitwait();



       b.clickbrandSave();



       b.getmessage();



   }



   // By only choosing checkbox without choosing select action



   @Test
   public void TC_CF_004() throws InterruptedException {
       test = extent.createTest("TC_CF_004");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickcheckall();



       implicitwait();



       b.clickbrandSave();



       b.getmessage();



   }



   // By without choosing checkbox and select action



   @Test
   public void TC_CF_005() throws InterruptedException {
       test = extent.createTest("TC_CF_005");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       implicitwait();



       b.clickbrandSave();



       b.getmessage();



   }



   // select action dropdown by choosing one checkbox and choose active



   @Test
   public void TC_CF_006() throws InterruptedException {
       test = extent.createTest("TC_CF_006");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       implicitwait();



       b.clickonecheckbox("Sty4");



       b.clickselectaction();



       b.selectActive();



       implicitwait();



       b.clickbrandSave();



       b.getmessage();



   }



   // select action dropdown by choosing one checkbox and choose inactive



   @Test
   public void TC_CF_007() throws InterruptedException {
       test = extent.createTest("TC_CF_007");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       implicitwait();



       b.clickonecheckbox("Sty4");



       b.clickselectaction();



       b.selectInActive();



       implicitwait();



       b.clickbrandSave();



       b.getmessage();



   }



   // Validate the search bar by entering brand name



   @Test
   public void TC_CF_008() throws InterruptedException {
       test = extent.createTest("TC_CF_008");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       implicitwait();



       b.clickonecheckbox("Sty33");// change every test



       b.clickselectaction();



       b.selectdelete();



       implicitwait();



       b.clickbrandSave();



       b.getmessage();



   }



   // select action dropdown by choosing one checkbox and choose delete



   @Test
   public void TC_CF_009() throws InterruptedException {
       test = extent.createTest("TC_CF_009");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);
       

       implicitwait();



       b.entervalueinsearch("Hawkins");



       b.clicksearchdropdown();



       b.choosingsearchoptions("Search By Name");



       b.clicksearch();



       implicitwait();



       b.verifysearchedvalue();



   }



   // seach bar without entering brand name



   @Test
   public void TC_CF_010() throws InterruptedException {
       test = extent.createTest("TC_CF_010");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       implicitwait();



       b.entervalueinsearch("");



       b.clicksearchdropdown();



       b.choosingsearchoptions("Search By Name");



       b.clicksearch();



       implicitwait();



       b.getsearcherror();



   }



   // Validate the home link in brands page



   @Test
   public void TC_CF_011() throws InterruptedException {
       test = extent.createTest("TC_CF_011");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickhome();



       b.ishomepage();



   }



   // Validate header next page option by clicking number.



   @Test
   public void TC_CF_012() throws InterruptedException {
       test = extent.createTest("TC_CF_012");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickheadernextpage("2");



       b.isnextpage("2");



   }



   // Validate header next page option by clicking arrow.



   @Test
   public void TC_CF_013() throws InterruptedException {
       test = extent.createTest("TC_CF_013");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickheadernextpagearrow("next");



       b.isnextpage("2");



   }



   // Validate footer next page option by clicking number from page 2.



   @Test
   public void TC_CF_014() throws InterruptedException {
       test = extent.createTest("TC_CF_014");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickheadernextpage("2");



       b.clickfooternextpage("1");



       b.isnextpage("1");



   }



   // Validate footer next page option by clicking arrow from page 2.



   @Test
   public void TC_CF_015() throws InterruptedException {
       test = extent.createTest("TC_CF_015");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickheadernextpage("2");



       Thread.sleep(3000);



       b.clickheadernextpagearrow("prev");



       Thread.sleep(3000);



       b.isnextpage("1");



   }



   // Validate the "Singlebag" link text in brands page.



   @Test
   public void TC_CF_016() throws InterruptedException {
       test = extent.createTest("TC_CF_016");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clicksinglebag();



       Thread.sleep(1000);



       b.issinglebagwebsite();
   }



   // Validate brands functions -create option by giving all details.



   @Test
   public void TC_CF_017() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_017");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.enterBrandName("chillout");



       b.clickBrandFeatureDropdown();



       b.selectFeatureOption("Yes");



       b.brandimg("C:\\Users\\Digi-QA\\Pictures\\brand pioc.png");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,300)");

       b.clicknewbrandstatus();



       b.choosestatus("Active");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");

       b.entermetatitle("Mayool Kurtis");



       b.entermetakeyword("Kurtis for women");



       b.entermetadescription("Womens Kurtis Collection");



       b.clicknewbrandsave();



       b.getmessage();



   }



   // Validate brands functions -create option by without name



   @Test
   public void TC_CF_018() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_018");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.clickBrandFeatureDropdown();



       b.selectFeatureOption("Yes");



       b.brandimg("C:\\Users\\Digi-QA\\Pictures\\brand pioc.png");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,300)");

       b.clicknewbrandstatus();



       b.choosestatus("Active");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");

       b.entermetatitle("Mayool Kurtis");



       b.entermetakeyword("Kurtis for women");



       b.entermetadescription("Womens Kurtis Collection");



       b.clicknewbrandsave();



       b.getnameerror();



   }



   // Validate brands functions -create option by without choosing featured option



   @Test
   public void TC_CF_019() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_019");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.enterBrandName("chil");



       b.brandimg("C:\\Users\\Digi-QA\\Pictures\\brand pioc.png");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,300)");

       b.clicknewbrandstatus();



       b.choosestatus("Active");
       ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");


       b.entermetatitle("Mayool Kurtis");



       b.entermetakeyword("Kurtis for women");



       b.entermetadescription("Womens Kurtis Collection");



       b.clicknewbrandsave();



       b.getmessage();



   }



   // Validate brands functions -create option by without choosing file



   @Test
   public void TC_CF_020() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_020");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.enterBrandName("St");



       b.clickBrandFeatureDropdown();



       b.selectFeatureOption("No");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,300)");

       b.clicknewbrandstatus();



       b.choosestatus("Active");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");
       b.entermetatitle("Mayool Kurtis");



       b.entermetakeyword("Kurtis for women");



       b.entermetadescription("Womens Kurtis Collection");



       b.clicknewbrandsave();



       b.getmessage();



   }



   // Validate brands functions -create option by without choosing status
   @Test
   public void TC_CF_021() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_021");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.enterBrandName("hub");



       b.clickBrandFeatureDropdown();



       b.selectFeatureOption("No");



       b.brandimg("C:\\Users\\Digi-QA\\Pictures\\brand pioc.png");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");

       b.entermetatitle("Mayool Kurtis");



       b.entermetakeyword("Kurtis for women");



       b.entermetadescription("Womens Kurtis Collection");



       b.clicknewbrandsave();



       b.getmessage();



   }



   // Validate brands functions -create option by without giving meta title
   @Test
   public void TC_CF_022() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_022");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.enterBrandName("Sty7");



       b.clickBrandFeatureDropdown();



       b.selectFeatureOption("No");



       b.brandimg("C:\\Users\\Digi-QA\\Pictures\\brand pioc.png");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,300)");

       b.clicknewbrandstatus();



       b.choosestatus("Inactive");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");

       b.entermetakeyword("Kurtis for women");



       b.entermetadescription("Womens Kurtis Collection");



       b.clicknewbrandsave();



       b.getmessage();



   }



   // Validate brands functions -create option by without giving meta keyword
   @Test
   public void TC_CF_023() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_023");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.enterBrandName("baby hub");



       b.clickBrandFeatureDropdown();



       b.selectFeatureOption("No");



       b.brandimg("C:\\Users\\Digi-QA\\Pictures\\brand pioc.png");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,300)");

       b.clicknewbrandstatus();



       b.choosestatus("Inactive");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");

       b.entermetatitle("Mayool Kurtis");



       b.entermetadescription("Womens Kurtis Collection");



       b.clicknewbrandsave();



       b.getmessage();



   }



   // Validate brands functions -create option by without giving meta description
   @Test
   public void TC_CF_024() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_024");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.enterBrandName("cool");



       b.clickBrandFeatureDropdown();



       b.selectFeatureOption("No");



       b.brandimg("C:\\Users\\Digi-QA\\Pictures\\brand pioc.png");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,300)");

       b.clicknewbrandstatus();



       b.choosestatus("Active");


       ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");
       b.entermetatitle("Mayool Kurtis");



       b.entermetakeyword("Kurtis for women");



       b.clicknewbrandsave();



       b.getmessage();



   }



   // Validate brand link text in create page
   @Test
   public void TC_CF_025() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_025");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.clickbrandlink();



       b.isbrandindexpage();
   }



   // Validate the home link in create brands page
   @Test
   public void TC_CF_026() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_026");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickCreateBrandButton();



       b.clickhome();



       b.ishomepage();



   }




   // Validate brand page pencil icon
   @Test
   public void TC_CF_027() throws InterruptedException, AWTException {
       test = extent.createTest("TC_CF_027");
       Dashboard d = new Dashboard(driver);



       d.click_products();



       d.clickbrands();



       Products_Brands b = new Products_Brands(driver);



       b.clickonebrandactionbtn("chillout");



       b.enterBrandName("chillout");



       b.clickBrandFeatureDropdown();



       b.selectFeatureOption("Yes");



       b.brandimg("C:\\Users\\Digi-QA\\Pictures\\brand pioc.png");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,300)");

       b.clicknewbrandstatus();



       b.choosestatus("Active");

       ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");

       b.entermetatitle("Mayool Kurtis");



       b.entermetakeyword("Kurtis for women");



       b.entermetadescription("Womens Kurtis Collection");



       b.clicknewbrandsave();



       b.getmessage();
   }

   // Validate brand page with eye symbol in "Active brands"
       @Test
       public void TC_CF_028() throws InterruptedException, AWTException {
           test = extent.createTest("TC_CF_028");
           Dashboard d = new Dashboard(driver);



           d.click_products();



           d.clickbrands();



           Products_Brands b = new Products_Brands(driver);

           Thread.sleep(2000);



           b.clickonebrandshowbtn("cool");

           implicitwait();

           b.isstorefront("cool");


       }



}

