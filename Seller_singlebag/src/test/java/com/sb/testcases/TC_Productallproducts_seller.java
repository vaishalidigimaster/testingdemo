package com.sb.testcases;
import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;
import com.sb.pageogbject.products.seller.Productspage_allproducts;

 

public class TC_Productallproducts_seller extends extentreports {
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

    Thread.sleep(3000);

	}

	
	
	@Test(enabled=false)

	public void TC_PF_001() throws InterruptedException {
		test=extent.createTest("TC_PF_001");
    Dashboard d = new Dashboard(driver);
       d.click_products();
        d.clickallproducts();
        Productspage_allproducts ap=new Productspage_allproducts(driver);
        ap.drafttxt();
        Thread.sleep(2000);
        ap.clickcheckall();
        ap.selectactions("Draft");
        ap.clicksubmit();
        ap.getmessage();
        Thread.sleep(4000);
        ap.drafttxt();

	}

      @Test(enabled=false)

	public void TC_PF_002() throws InterruptedException {
		test=extent.createTest("TC_PF_002");

 

        Dashboard d = new Dashboard(driver);

 

        d.click_products();
        d.clickallproducts();
        Productspage_allproducts ap=new Productspage_allproducts(driver);
        ap.trashtxt();
        Thread.sleep(2000);
        ap.clickincomplete();
        ap.clickcheckall();
        ap.selectactions("Move To Trash");
        ap.clicksubmit();
        ap.getmessage();
        Thread.sleep(4000);
        ap.trashtxt();

	}

      @Test(enabled=false)

  	public void TC_PF_003() throws InterruptedException {
  		test=extent.createTest("TC_PF_003");

 

          Dashboard d = new Dashboard(driver);

 

          d.click_products();
          d.clickallproducts();
          Productspage_allproducts ap=new Productspage_allproducts(driver);
          ap.drafttxt();
          Thread.sleep(2000);
          ap.clicktrash();
          ap.clickcheckall();
          ap.selectactions("Draft");
          ap.clicksubmit();
          ap.getmessage();
          Thread.sleep(4000);
          ap.drafttxt();          
  	}

      @Test(enabled=false)

    	public void TC_PF_004() throws InterruptedException {
    		test=extent.createTest("TC_PF_004");

 

            Dashboard d = new Dashboard(driver);

 

            d.click_products();
            d.clickallproducts();
            Productspage_allproducts ap=new Productspage_allproducts(driver);
            ap.publishtxt();
            Thread.sleep(2000);
            ap.clickdraft();
            ap.clickcheckall();
            ap.selectactions("Publish Now");
            ap.clicksubmit();
            ap.getmessage();
            Thread.sleep(4000);
            ap.publishtxt();       

    	}

      @Test(enabled=false)

  	public void TC_PF_005() throws InterruptedException {
  		test=extent.createTest("TC_PF_005");

 

          Dashboard d = new Dashboard(driver);

 

          d.click_products();
          d.clickallproducts();
          Productspage_allproducts ap=new Productspage_allproducts(driver);
          ap.clickonecheckbox();
          ap.selectactions("Delete");
          ap.clicksubmit();
          ap.getmessage();
          }


 

      

      @Test(enabled=false)

  	public void TC_PF_006() throws InterruptedException {
  		test=extent.createTest("TC_PF_006");

 

          Dashboard d = new Dashboard(driver);

 

          d.click_products();
          d.clickallproducts();
          Productspage_allproducts ap=new Productspage_allproducts(driver);
         ap.clickpublish();
       System.out.println("Published Product is displayed");
          }

      @Test(enabled=false)

    	public void TC_PF_007() throws InterruptedException {
    		test=extent.createTest("TC_PF_007");

 

            Dashboard d = new Dashboard(driver);

 

            d.click_products();
            d.clickallproducts();
            Productspage_allproducts ap=new Productspage_allproducts(driver);
           ap.clickdraft();
           System.out.println("Draft product is displayed");

            }

      @Test(enabled=false)

  	public void TC_PF_008() throws InterruptedException {
  		test=extent.createTest("TC_PF_008");

 

          Dashboard d = new Dashboard(driver);

 

          d.click_products();
          d.clickallproducts();
          Productspage_allproducts ap=new Productspage_allproducts(driver);
         ap.clickincomplete();
         ap.incompletetxt();
         System.out.println("Incomplete product is displayed");

          }

      @Test(enabled=false)

  	public void TC_PF_009() throws InterruptedException {
  		test=extent.createTest("TC_PF_009");

 

          Dashboard d = new Dashboard(driver);

 

          d.click_products();
          d.clickallproducts();
          Productspage_allproducts ap=new Productspage_allproducts(driver);
         ap.clicktrash();
         ap.trashtxt();
         System.out.println("Trash product is displayed");

          }
      
      
      
      
      
      @Test(enabled=false)
    	public void TC_PF_030() throws InterruptedException, AWTException {
    		test=extent.createTest("TC_PF_030");
      Dashboard d = new Dashboard(driver);
        d.click_products();
            d.clickallproducts();
            Productspage_allproducts ap=new Productspage_allproducts(driver);
            
            ap.clickcreateproducts();
            ap.enterproducttitle("Gloves");
            ap.entershortdescription("Gloves");
            ((JavascriptExecutor) driver).executeScript("window.scroll(0,300);");
            Thread.sleep(1000);
       // add category    
            ap.clickaddcategory();
            ap.entername_category("Hand glove");
            ap.select_parentcategory("Womens");
            ap.select_featuredincategory("Yes");
            ap.select_assigntomenuincategory("Yes");
            ap.thumbnail_incategory("C:\\Users\\Digi-QA\\Pictures\\slider boy.png");
            ap.select_statusincategory("Active");
            ap.clicksave_incategory();
            implicitwait();
            ap.getmessage();
            Thread.sleep(5000);
           
           
      // add brand  
            ap.clickaddbrand();
            ap.entername_brand("zepto");
            ap.select_featuredinbrand("Yes");
            ap.thumbnail_inbrand("C:\\Users\\Digi-QA\\Pictures\\slider boy.png");
            ap.select_statusinbrand("Active");
            ap.clicksave_inbrand();
            implicitwait();
            ap.getmessage();
            Thread.sleep(5000);
            
        // price
            ap.entercompareprice("100");
            ap.entersellingprice("90");
            ((JavascriptExecutor) driver).executeScript("window.scroll(0,800);");
            Thread.sleep(2000);
            ap.enterofferprice("85");
            
            Thread.sleep(2000);
            ap.offerstarting_date("2023", "September", "25");
            Thread.sleep(2000);
            ap.offerending_date("2023","September", "30");
         Thread.sleep(2000);
    ((JavascriptExecutor) driver).executeScript("window.scroll(0,0);");
            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("window.scroll(0,0);");   
            ap.enterSKU("ABC118");
            ap.stocksttustog();
            ap.managestocktog();
            ap.enterstackquatity("50");
            ap.clicksave();
            ap.getmessage();
            System.out.println("Non Varient Product is created");
            
//      //    Basic information
//            ap.enterproductname("Hand glove");
//            ap.enterslug("Hand gloves");
//            ap.entershortdescription("Hand gloves");
//            ((JavascriptExecutor) driver).executeScript("window.scroll(0,500);");
//            ap.enterproductcontent("Hand gloves");
//            ((JavascriptExecutor) driver).executeScript("window.scroll(0,500);");
//            ap.entertax("10");
//            ((JavascriptExecutor) driver).executeScript("window.scroll(0,500);");
//            ap.selectvideo("Youtube");
//            
//            ap.entervideolink("https:youtubeproduct");
//            ap.selectfeatured("Trending products");
//            ap.clickpublished();
//            ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");
//            ap.clickstorefronttog();
//            ap.clickpostog();
//            ap.clicksavechanges();
//            ap.getmessage();
            
            
            
            
      }


      @Test(enabled=false)
  	public void TC_PF_010() throws InterruptedException, AWTException {
  		test=extent.createTest("TC_PF_010");
    Dashboard d = new Dashboard(driver);
      d.click_products();
          d.clickallproducts();
          Productspage_allproducts ap=new Productspage_allproducts(driver);
          
          ap.clickcreateproducts();
          ap.enterproducttitle("shoe");
          ap.entershortdescription("shoe");
          ((JavascriptExecutor) driver).executeScript("window.scroll(0,300);");
          Thread.sleep(1000);
     // add category    
          ap.clickaddcategory();
          ap.entername_category("women footware");
          ap.select_parentcategory("Womens");
          ap.select_featuredincategory("Yes");
          ap.select_assigntomenuincategory("Yes");
          ap.thumbnail_incategory("C:\\Users\\Digi-QA\\Pictures\\slider boy.png");
          ap.select_statusincategory("Active");
          ap.clicksave_incategory();
          implicitwait();
          ap.getmessage();
          Thread.sleep(5000);
         
         
    // add brand  
          ap.clickaddbrand();
          ap.entername_brand("sreeleathers");
          ap.select_featuredinbrand("Yes");
          ap.thumbnail_inbrand("C:\\Users\\Digi-QA\\Pictures\\slider boy.png");
          ap.select_statusinbrand("Active");
          ap.clicksave_inbrand();
          implicitwait();
          ap.getmessage();
          Thread.sleep(5000);
          
      // price
          ap.entercompareprice("100");
          ap.entersellingprice("90");
          ((JavascriptExecutor) driver).executeScript("window.scroll(0,800);");
          Thread.sleep(2000);
          ap.enterofferprice("85");
          
          Thread.sleep(2000);
          ap.offerstarting_date("2023", "September", "25");
          Thread.sleep(2000);
          ap.offerending_date("2023","September", "30");
       Thread.sleep(2000);
       ap.clickvarienttoggle();
       ap.selectoption("Size");
       Thread.sleep(1000);
       ap.selectoption("Design");
       
       ap.clickvarientsubmit();
       Thread.sleep(2000);
  
//          ((JavascriptExecutor) driver).executeScript("window.scroll(0,0);");   
//          ap.enterSKU("ABC118");
//          ap.stocksttustog();
//          ap.managestocktog();
//          ap.enterstackquatity("50");
//          ap.clicksave();
//          ap.getmessage();
//          System.out.println("Varient Product is created"); 
      
      }
      
      
      
      
      
      
      
      
      @Test(enabled=false)

    	public void TC_PF_031() throws InterruptedException {
    		test=extent.createTest("TC_PF_031");

 

            Dashboard d = new Dashboard(driver);

 

            d.click_products();
            d.clickallproducts();
            Productspage_allproducts ap=new Productspage_allproducts(driver);
            ap.clickeyeicon("black Crocs");
            System.out.println("Storefront page is displayed");
            }


 

      @Test(enabled=false)

  	public void TC_PF_032() throws InterruptedException {
  		test=extent.createTest("TC_PF_032");

 

          Dashboard d = new Dashboard(driver);

 

          d.click_products();
          d.clickallproducts();
          Productspage_allproducts ap=new Productspage_allproducts(driver);
          ap.clickedit("black Crocs");
          ap.clickproducts();
          ap.productscapturetxt();

          }

      @Test(enabled=false)

    	public void TC_PF_033() throws InterruptedException {
    		test=extent.createTest("TC_PF_033");

 

            Dashboard d = new Dashboard(driver);

 

            d.click_products();
            d.clickallproducts();
            Productspage_allproducts ap=new Productspage_allproducts(driver);
            ap.clickimg();
            ap.productdetailpage();
            System.out.println("productdetail page is displayed");

            }




 

      @Test(enabled=false)

    	public void TC_PF_038() throws InterruptedException {
    		test=extent.createTest("TC_PF_038");

 

            Dashboard d = new Dashboard(driver);

 

            d.click_products();
            d.clickallproducts();
            Productspage_allproducts ap=new Productspage_allproducts(driver);
            ap.clickhome();
            ap.capturedashboardtxt();
            }



     

      @Test(enabled=false)

    	

	      public void TC_PF_035() throws InterruptedException, AWTException {

		test=extent.createTest("TC_PF_035");



      Dashboard d = new Dashboard(driver);



      d.click_products();

      d.clickallproducts();

      Productspage_allproducts ap=new Productspage_allproducts(driver);

      ap.clickimport();

      Thread.sleep(1000);

    ap.clickchoosenfile();

    Thread.sleep(4000);

      ap.uploadfile("\"C:\\Import\\productname not given.csv\"");

     Thread.sleep(1000);

     ap.importsubmit();

      ap.getmessage();

     // Assert.assertTrue(true);

      System.out.println("Productname not provided");

      Thread.sleep(1000);

      ap.clickXbtn();

      Thread.sleep(2000);

      ap.clickimport();

      ap.clickchoosenfile();

     Thread.sleep(4000);

     ap.uploadfile("\"C:\\Import\\producttype not given.csv\"");

      Thread.sleep(1000);

        ap.importsubmit();

         ap.getmessage();

         System.out.println("Producttype not provided");

         

         Thread.sleep(1000);

         ap.clickXbtn();

         Thread.sleep(2000);

         ap.clickimport();

         ap.clickchoosenfile();

        Thread.sleep(4000);

        ap.uploadfile("\"C:\\Import\\shortdescription not given.csv\"");

         Thread.sleep(1000);

           ap.importsubmit();

            ap.getmessage();

            System.out.println("Productshort description not provided");

            

            Thread.sleep(1000);

            ap.clickXbtn();

            Thread.sleep(2000);

            ap.clickimport();

            ap.clickchoosenfile();

           Thread.sleep(4000);

           ap.uploadfile("\"C:\\Import\\featured not given.csv\"");

            Thread.sleep(1000);

              ap.importsubmit();

               ap.getmessage();

               System.out.println("featured not provided");

               

               Thread.sleep(1000);

               ap.clickXbtn();

               Thread.sleep(2000);

               ap.clickimport();

               ap.clickchoosenfile();

              Thread.sleep(4000);

              ap.uploadfile("\"C:\\Import\\status not given.csv\"");

               Thread.sleep(1000);

                 ap.importsubmit();

                  ap.getmessage();

                  System.out.println("status  not provided");

                  

                  Thread.sleep(1000);

                  ap.clickXbtn();

                  Thread.sleep(2000);

                  ap.clickimport();

                  ap.clickchoosenfile();

                 Thread.sleep(4000);

                 ap.uploadfile("\"C:\\Import\\compare price not given.csv\"");

                  Thread.sleep(1000);

                    ap.importsubmit();

                     ap.getmessage();

                     System.out.println("compareprice not provided");

            

                     Thread.sleep(1000);

                     ap.clickXbtn();

                     Thread.sleep(2000);

                     ap.clickimport();

                     ap.clickchoosenfile();

                    Thread.sleep(4000);

                    ap.uploadfile("\"C:\\Import\\sellingprice not given.csv\"");

                     Thread.sleep(1000);

                       ap.importsubmit();

                        ap.getmessage();

                        System.out.println("sellingprice description not provided");

      

      

      

  }

  

  @Test(enabled=false)

	

	public void TC_PF_036() throws InterruptedException {

		test=extent.createTest("TC_PF_036");



      Dashboard d = new Dashboard(driver);



      d.click_products();

      d.clickallproducts();

      Productspage_allproducts ap=new Productspage_allproducts(driver);

      Thread.sleep(1000);

      ap.entername("black Crocs");

      Thread.sleep(1000);

      ap.clicksearchdropdown();

      ap.choosingsearchoptions("Search By Name");

      Thread.sleep(2000);

      ap.clicksearch();

      Assert.assertTrue(true);

      System.out.println("searched value is displayed");

  

  }

  



  @Test(enabled=false)

	

	public void TC_PF_037() throws InterruptedException {

		test=extent.createTest("TC_PF_037");



      Dashboard d = new Dashboard(driver);



      d.click_products();

      d.clickallproducts();

      Productspage_allproducts ap=new Productspage_allproducts(driver);

      Thread.sleep(1000);

      ap.entername("");

      Thread.sleep(1000);

      ap.clicksearchdropdown();

      ap.choosingsearchoptions("Search By Name");

      Thread.sleep(2000);

      ap.clicksearch();

      ap.nameerrormsg();

      

  

  }

  

  

  
  @Test
	public void TC_PF_023() throws InterruptedException, AWTException {
		test=extent.createTest("TC_PF_023");
  Dashboard d = new Dashboard(driver);
    d.click_products();
        d.clickallproducts();
        Productspage_allproducts ap=new Productspage_allproducts(driver);
  ap.clickdraft();
  Thread.sleep(1000);
  ap.clickeditofproduct("pen");
  
//   Basic information
  ap.enterproductname("pen");
  ap.enterslug("pen");
   ap.entershortdescription("pen");
   ((JavascriptExecutor) driver).executeScript("window.scroll(0,500);");
   ap.enterproductcontent("pen");
   ((JavascriptExecutor) driver).executeScript("window.scroll(0,500);");
   ap.entertax("10");
  ((JavascriptExecutor) driver).executeScript("window.scroll(0,500);");
   ap.selectvideo("Youtube");
   
   ap.entervideolink("https:youtubeproduct");
   ((JavascriptExecutor) driver).executeScript("window.scroll(0,500);");
   ap.selectfeatured("Trending products");
   ap.clickpublished();
   ((JavascriptExecutor) driver).executeScript("window.scroll(0,1000);");
   ap.clickstorefronttog();
   ap.getmessage();
   Thread.sleep(3000);
   ap.clickpostog();
   Thread.sleep(3000);
  
 //Price
  ((JavascriptExecutor) driver).executeScript("window.scroll(0,0);");
  ap.clickprice();
  ap.entercompareprice("100");
  ap.entersellingprice("90");
  ((JavascriptExecutor) driver).executeScript("window.scroll(0,800);");
  Thread.sleep(2000);
  ap.enterofferprice("85");
  
  Thread.sleep(2000);
  ap.offerstarting_date("2023", "September", "25");
  Thread.sleep(2000);
  ap.offerending_date("2023","September", "30");
  
  
//  ap.clicksavechanges();
//  ap.getmessage();

  }
  

  

  

  

	



}





 


