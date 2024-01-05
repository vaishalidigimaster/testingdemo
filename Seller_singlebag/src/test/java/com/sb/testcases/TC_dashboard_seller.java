package com.sb.testcases;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;

public class TC_dashboard_seller extends extentreports {
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
	Thread.sleep(5000);
	}
	
	

//  @Test(enabled=false)
//  public void TC_DF_001() throws InterruptedException {
//      test=extent.createTest("TC_DF_001");
//      Dashboard d = new Dashboard(driver);
//      
//      if(d.Onlinemode()){
//          Wait();
//          d.onlinecheckbox("1 hour");
//           d.online_submitButton();
//      }
//      
//      else if(d.Offlinemode()){
//          d.clickOnlineSwitch(); 
//          
//      }
//      
//      Thread.sleep(4000);
//      d.Languagechoose();
//      d.Languagedropdownoption("ta");
//      
//      Wait();
//      
//      if (driver.getPageSource().equals(By.xpath("//h2[contains(text(),'டாஷ்போர்டு')]"))) {
//          System.out.println("Changed into Tamil Language");
//      }
//      
//      else {
//          System.out.println("Not changed into Tamil Language");
//      }
//      
//  }
//
//   



  @Test
  public void TC_DF_002() throws InterruptedException {
      test=extent.createTest("TC_DF_002");
      Dashboard d = new Dashboard(driver);
      //click profile 
      d.openProfileDropdown();
      //click profile settings
      d.profile_Settings();
      //change first name
      d.enterFirstName("Gayathri");
      //change second or last name
      d.enterSecondName("R");
      //click update button
      d.updateProfile();
      implicitwait();
  }


  @Test
  public void TC_DF_003() throws InterruptedException {
      test=extent.createTest("TC_DF_003");
      Dashboard d = new Dashboard(driver);
      //open profile
      d.openProfileDropdown();
      implicitwait();
      //click profile settings
      d.profile_Settings();
      implicitwait();
      //change old password
      d.old_password("12345678");
      //change new password
      d.new_password("123456789");
      //change confirm new password
      d.new_cfrmpassword("123456789");
      //click update button
      d.update_changepassword();
      implicitwait();
  }



//  @Test
//  public void TC_DF_004() throws InterruptedException {
//      test=extent.createTest("TC_DF_004");
//      Dashboard d = new Dashboard(driver);
//      
//      //clicking month dropdown
//      
//      d.Ordersmonthdropdown();   
//      
//      Wait();
//      
//      d.choosemonth("March");
//      
//      //clicking earning performance dropdown
//      
//      d.earningperformancedropdown(1);
//      Thread.sleep(3000);
//      
//      //clicking site analytics dropdown
//      
//      d.siteanalyticsdropdown(2);
//      Thread.sleep(3000);
//      
//    
//  }


  //products buttons

  @Test
  public void TC_DF_005() throws InterruptedException {
      test=extent.createTest("TC_DF_005");
      Dashboard d = new Dashboard(driver);
      JavascriptExecutor js=(JavascriptExecutor)driver;
      //Click categories
      d.clickAddCategories();
      implicitwait();
      if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/category/create")) {

          System.out.println("Categories page is displayed");

           }

          else {
          System.out.println("Categories page is not displayed");
          }
      d.navigateToHome();
      implicitwait();

      //click brands
      d.clickAddBrands();
      implicitwait();
      if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/brand/create")) {

          System.out.println("Brands page is displayed");

           }

          else {

          System.out.println("Brands page is not displayed");

          }
      d.navigateToHome();
      implicitwait();
      //click attributes
      js.executeScript("window.scrollTo(0,500)");
      Thread.sleep(1000);
      d.clickAddAttributes();
      if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/attribute/create")) {

          System.out.println("Attributes page is displayed");

           }

          else {

          System.out.println("Attributes page is not displayed");

          }

      d.navigateToHome();
      implicitwait();

      //click products
      js.executeScript("window.scrollTo(0,500)");
      Thread.sleep(1000);
      d.clickAddProducts();
      if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/products/create")) {

          System.out.println("Products page is displayed");

           }

          else {

          System.out.println("Products page is not displayed");

          }
      d.navigateToHome();
      implicitwait();
  }

//Storefront Customization    
@Test
public void TC_LF_006() throws InterruptedException {
    test=extent.createTest("TC_LF_006");

    Dashboard d=new Dashboard(driver);
    //Clicking themes button
    d.clickThemes();
    implicitwait();
    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/setting/theme")) {
    System.out.println("Themes page is displayed");
     }
    else {
    System.out.println("Themes page is not displayed");
    }
    d.navigateToHome();
    implicitwait();
    //Clicking banner ads button
    d.clickBanners();
    implicitwait();
    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/banner-ads")) {
        System.out.println("Banner Ad page is displayed");
    }

    else {
        System.out.println("Banner ad page is not displayed");
    }

    implicitwait();
    d.navigateToHome();
    implicitwait();
    //Clicking bump ads button

    d.clickBumps();
    implicitwait();
    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/bump-ads")) {
        System.out.println("Bump Ad page is displayed");
    }

    else {
        System.out.println("Bump ad page is not displayed");
    }

    implicitwait();
    d.navigateToHome();
    implicitwait();

    //Clicking sliders button
    d.clickSliders();
    implicitwait();
    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/setting/slider")) {
        System.out.println("Sliders page is displayed");
    }

    else {
        System.out.println("Sliders page is not displayed");
    }

    implicitwait();
    d.navigateToHome();
    implicitwait();

}

//Store setup

@Test
public void TC_LF_007() throws InterruptedException {
    test=extent.createTest("TC_LF_007");

    Dashboard d=new Dashboard(driver);        
    //Clicking store details button
    d.clickStoreDetails();
    implicitwait();
    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/settings/shop-settings")) {
        System.out.println("Settings page is displayed");
    }

    else {
        System.out.println("Settings page is not displayed");
    }

    implicitwait();
    d.navigateToHome();
    implicitwait();
    //Clicking Logo&Favicon button
    d.clickLogoFavicon();
    implicitwait();

    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/settings/logo")) {
        System.out.println("Logo page is displayed");
    }

    else {
        System.out.println("Logo page is not displayed");
    }

    Thread.sleep(3000);
    d.navigateToHome();
    implicitwait();
    //Clicking menus button
    d.clickMenus();
    implicitwait();

    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/setting/menu")) {
        System.out.println("Menus page is displayed");
    }

    else {
        System.out.println("Menus page is not displayed");
    }

    implicitwait();
    d.navigateToHome();
    implicitwait();
    //clicking pages button

    d.clickPages();
    implicitwait();

    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/setting/page")) {
        System.out.println("Pages page is displayed");
    }

    else {
        System.out.println("Pages page is not displayed");
    }

    implicitwait();
    d.navigateToHome();
    implicitwait();
}    


//Shipping price

@Test
public void TC_LF_008() throws InterruptedException {
    test=extent.createTest("TC_LF_008");

    Dashboard d=new Dashboard(driver);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    //Clicking shipping button
    js.executeScript("window.scrollTo(0,500)");
    Thread.sleep(1000);
    d.clickShipping();
    implicitwait();

    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/shipping-methods")) {
        System.out.println("Shipping page is displayed");
    }

    else {
        System.out.println("Shipping page is not displayed");
    }
    implicitwait();
    d.navigateToHome();
    implicitwait();

}


//User terms

@Test
public void TC_LF_009() throws InterruptedException {
    test=extent.createTest("TC_LF_009");
    Dashboard d=new Dashboard(driver);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    //Clicking User terms

    js.executeScript("window.scrollTo(0,500)");
    Thread.sleep(1000);
    d.clickUserTerms();
    implicitwait();
    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/user/term")) {
        System.out.println("User terms page is displayed");
    }

    else {
        System.out.println("User Terms page is not displayed");
    }
    implicitwait();
    d.navigateToHome();
    implicitwait();

}

//payment options

@Test
public void TC_LF_010() throws InterruptedException {
    test=extent.createTest("TC_LF_0010");

    Dashboard d=new Dashboard(driver);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    //Clicking payment options
    js.executeScript("window.scrollTo(0,500)");
    Thread.sleep(1000);
    d.clickPayment();
    implicitwait();

    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/settings/payment")) {
        System.out.println("Payment page is displayed");
    }

    else {
        System.out.println("Payment page is not displayed");
    }
    d.navigateToHome();
    implicitwait();

}

//QR code

@Test
public void TC_LF_011() throws InterruptedException {
    test=extent.createTest("TC_LF_0011");

    Dashboard d=new Dashboard(driver);
    JavascriptExecutor js=(JavascriptExecutor)driver;

    js.executeScript("window.scrollTo(0,1500)");
    Thread.sleep(1000);
    d.clickQR();

    Thread.sleep(1000);
    // Verify if the QR code file is downloaded
    String downloadPath = "C:\\Users\\Singlebag\\Downloads"; // Update this with your download folder path
    String fileName = "qrcode (10).png"; // Update this with the expected file name
    String filePath = downloadPath + File.separator + fileName;

    File qrCodeFile = new File(filePath);

    Thread.sleep(1000);

    if (qrCodeFile.exists()) {
        System.out.println("QR code was downloaded successfully!");

    } else {
        System.out.println("QR code download failed or not completed.");
    }

}

//profile

@Test
public void TC_LF_012() throws InterruptedException {
    test=extent.createTest("TC_LF_0012");

    Dashboard d=new Dashboard(driver);
    d.openProfileDropdown();
    d.clicksinglebag_community();
    implicitwait();

    if(driver.getCurrentUrl().equals("https://community.singlebag.com/")) {
        System.out.println("Singlebag Community page is displayed");
    }

    else {
        System.out.println("Singlebag Community page is not displayed");
    }

    driver.navigate().back();
    implicitwait();
    d.openProfileDropdown();
    d.clicklogout();






}}


