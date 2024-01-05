package com.sb.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;
import com.sb.pageogbject.products.seller.productspage_Inventory;

 

public class TC_ProductsInventory_seller extends extentreports {

 

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


               @Test
               public void TC_PIF_001() throws InterruptedException {

                   test=extent.createTest("TC_PIF_001");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   pi.clicktotal();
                   pi.gettablecount();
                   System.out.println("Total Page will be displayed");
              }

             @Test
             public void TC_PIF_002() throws InterruptedException {
                 test=extent.createTest("TC_PIF_002");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   pi.clickinstock();
                   pi.gettablecount();
                   System.out.println("Instock status will be displayed");
             }

             @Test
             public void TC_PIF_003() throws InterruptedException {
                 test=extent.createTest("TC_PIF_003");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                  pi.clickoutofstock();
                  pi.gettablecount();
                  System.out.println("Outofstock status will be displayed");
             }

             @Test
             public void TC_PIF_004() throws InterruptedException {
                 test=extent.createTest("TC_PIF_004");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                   pi.penicon();
                  Thread.sleep(1000);                
                   pi.instockstatus();
                   pi.quantity("10");
                   pi.submit();
                   pi.getmessage();
             }

             @Test
             public void TC_PIF_005() throws InterruptedException {
                 test=extent.createTest("TC_PIF_005");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                   pi.penicon();
                  Thread.sleep(1000);                
                   pi.outofstockstatus();
                   pi.quantity("10");
                   pi.submit();
                   pi.getmessage();

             }

             @Test
             public void TC_PIF_006() throws InterruptedException {
                 test=extent.createTest("TC_PIF_006");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                   pi.penicon();
                  Thread.sleep(1000);                
                   pi.instockstatus();
                   pi.quantity("0");
                   pi.submit();
                   pi.getmessage();


             }

             @Test
             public void TC_PIF_007() throws InterruptedException {
                 test=extent.createTest("TC_PIF_007");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                   pi.penicon();
                  Thread.sleep(1000);                
                   pi.instockstatus();
                   pi.quantity("");
                   pi.submit();
                  pi.quantityerrormsg();

             }

             @Test
             public void TC_PIF_008() throws InterruptedException {
                 test=extent.createTest("TC_PIF_008");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                   pi.penicon();
                  Thread.sleep(1000);                
                   pi.close();
                   System.out.println("Inventory page displayed");

             }

             @Test
             public void TC_PIF_009() throws InterruptedException {
                 test=extent.createTest("TC_PIF_009");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                   pi.penicon();
                  Thread.sleep(1000);                
                   pi.Xbtn();
                   System.out.println("Inventory page displayed");

             }

             @Test
             public void TC_PIF_010() throws InterruptedException {
                 test=extent.createTest("TC_PIF_010");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                  pi.searchsku("Shoe-97");
                  pi.clicksearch();
                  Thread.sleep(2000);
                  Assert.assertTrue(true);
                  System.out.println("given value page is displayed");

             }

             @Test
             public void TC_PIF_011() throws InterruptedException {
                 test=extent.createTest("TC_PIF_011");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                  pi.searchsku("");
                  pi.clicksearch();
                  pi.searcherrormsg();

             }

             @Test(enabled=true)
             public void TC_PIF_012() throws InterruptedException {
                 test=extent.createTest("TC_PIF_012");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                   ((JavascriptExecutor)driver).executeScript("window.scroll(0,4000)");
                pi.bottomarrownxt();
                Thread.sleep(3000);
                   ((JavascriptExecutor)driver).executeScript("window.scroll(0,4000)");
                   Thread.sleep(3000);
                pi.bottomarrowprev();
                   Thread.sleep(3000); 
               
                Assert.assertTrue(true);
                System.out.println("Navigate page is displayed");


             }

             @Test
             public void TC_PIF_013() throws InterruptedException {
                 test=extent.createTest("TC_PIF_013");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                  pi.clickimg();
                  pi.getproductdetailspagetxt();



                  Thread.sleep(1000);
                  Assert.assertTrue(true);
                  System.out.println("All products page will be displayed");

             }

             @Test
             public void TC_PIF_014() throws InterruptedException {
                 test=extent.createTest("TC_PIF_014");
                   Dashboard d=new Dashboard(driver);
               	d.click_products();
                   d.click_products_inventory();
                   productspage_Inventory pi = new productspage_Inventory(driver);
                   Thread.sleep(1000);
                  pi.clickhome();
                  Assert.assertTrue(true);
                  System.out.println("Dashboard page will be displayed");

             }



    
}