package com.sb.testcases;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;
import com.sb.pageobject.order.seller.orderpage_allorders;
import com.sb.pageobject.order.seller.orderpage_cancelled;
import com.sb.pageobject.order.seller.orderpage_transaction;

public class TC_order_seller extends extentreports {
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
	
	
@Test
public void TC_OF_001() throws InterruptedException {
	test=extent.createTest("TC_OF_001");
	Dashboard d = new Dashboard(driver);
	d.click_order();
	d.click_cancelorder();
	implicitwait();
	orderpage_cancelled o = new orderpage_cancelled(driver);
	o.filter_funnel();
	implicitwait();
	o.payment_status("Complete");
	implicitwait();
	o.fulfillment("Ready for pickup");
	implicitwait();
	o.starting_date("2023", "January", "25");
	Thread.sleep(2000);
	o.ending_date("2023", "July", "20");
	implicitwait();
	o.filter();
	Thread.sleep(4000);
	o.getfiltered_ordertitle();
}


@Test
public void TC_OF_002() throws InterruptedException {
test=extent.createTest("TC_OF_002");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_cancelorder();
implicitwait();
orderpage_cancelled o = new orderpage_cancelled(driver);
o.filter_funnel();
implicitwait();
o.payment_status("Complete");
implicitwait();
o.fulfillment("Ready for pickup");
implicitwait();
o.starting_date("2023", "January", "25");
Thread.sleep(2000);
o.ending_date("2023", "July", "20");
implicitwait();
o.clear_filter();
Thread.sleep(4000);
o.cancelledordertitle();
}


@Test
public void TC_OF_003() throws InterruptedException {
test=extent.createTest("TC_OF_003");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_cancelorder();
implicitwait();
orderpage_cancelled o = new orderpage_cancelled(driver);
o.search("#ORD000004");
Thread.sleep(3000);

}


@Test
public void TC_OF_004() throws InterruptedException {
test=extent.createTest("TC_OF_004");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_cancelorder();
implicitwait();
orderpage_cancelled o = new orderpage_cancelled(driver);
o.click_orderno("#ORD000005");
implicitwait();
o.getordertitle();

}


@Test
public void TC_OF_005() throws InterruptedException {
test=extent.createTest("TC_OF_005");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_cancelorder();
implicitwait();
orderpage_cancelled o = new orderpage_cancelled(driver);
o.click_orderdate("23-March-2023");
implicitwait();
o.getordertitle();

}

@Test
public void TC_OF_006() throws InterruptedException {
test=extent.createTest("TC_OF_006");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_cancelorder();
implicitwait();
orderpage_cancelled o = new orderpage_cancelled(driver);
o.click_customer("Guest User");
//o.getcustomertitle();
implicitwait();
o.getordertitle();

}

@Test
public void TC_OF_007() throws InterruptedException {
test=extent.createTest("TC_OF_007");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_transactionorder();
implicitwait();
orderpage_transaction ot=  new orderpage_transaction(driver);
ot.search("12345");
ot.searchicon();
implicitwait();
ot.getsearch_result();
System.out.println("Orderlist is displayed");

}


@Test
public void TC_OF_008() throws InterruptedException {
test=extent.createTest("TC_OF_008");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_transactionorder();
implicitwait();
orderpage_transaction ot=  new orderpage_transaction(driver);
ot.click_orderno("2023-08-#tester000045");
implicitwait();
ot.getordertitle();
System.out.println("Order detail page is displayed");
}


@Test
public void TC_OF_009() throws InterruptedException {
test=extent.createTest("TC_OF_009");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_transactionorder();
implicitwait();
orderpage_transaction ot=  new orderpage_transaction(driver);

ot.click_transaction_id("zyxxxxx");// change in every test
implicitwait();
ot.edit_text();
ot.payment_method("cod");
Thread.sleep(1000);
ot.edit_transaction_id("zyx");
Thread.sleep(1000);
ot.submit();
implicitwait();

System.out.println("Transaction id is changed");
}

@Test
public void TC_OF_010() throws InterruptedException {
test=extent.createTest("TC_OF_010");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_transactionorder();
implicitwait();
orderpage_transaction ot=  new orderpage_transaction(driver);
ot.click_transaction_id("zyx"); // change in every test
implicitwait();
ot.edit_text();
ot.payment_method("cod");

Thread.sleep(1000);

ot.submit();


System.out.println("Warning message for Transaction id is displayed");
}

@Test
public void TC_OF_011() throws InterruptedException {
test=extent.createTest("TC_OF_011");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_transactionorder();
implicitwait();
orderpage_transaction ot=  new orderpage_transaction(driver);
ot.click_updatedate("04-August-2023");
ot.getordertitle();
implicitwait();

System.out.println("Order detail page is displayed");
}

@Test
public void TC_OF_012() throws InterruptedException {
test=extent.createTest("TC_OF_012");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_transactionorder();
implicitwait();
orderpage_transaction ot=  new orderpage_transaction(driver);
ot.click_customername("So Gopi");

ot.getcustomertitle();
implicitwait();

System.out.println("Customer info page is displayed");
}


@Test
public void TC_OF_013() throws InterruptedException {
	test=extent.createTest("TC_OF_013");
	Dashboard d = new Dashboard(driver);
	d.click_order();
	d.click_allorder();
	implicitwait();
	orderpage_allorders oa = new orderpage_allorders(driver);
	oa.filter_funnel();
	implicitwait();
	oa.payment_status("Complete");
	implicitwait();
	oa.fulfillment("picked_up");
	implicitwait();
	oa.starting_date("2023", "January", "25");
	Thread.sleep(2000);
	oa.ending_date("2023", "July", "20");
	implicitwait();
	oa.filter();
	Thread.sleep(4000);
	oa.getsearch_result();
}

@Test
public void TC_OF_014() throws InterruptedException {
	test=extent.createTest("TC_OF_014");
	Dashboard d = new Dashboard(driver);
	d.click_order();
	d.click_allorder();
	implicitwait();
	orderpage_allorders oa = new orderpage_allorders(driver);
	oa.filter_funnel();
	implicitwait();
	oa.payment_status("Complete");
	implicitwait();
	oa.fulfillment("picked_up");
	implicitwait();
	oa.starting_date("2023", "January", "25");
	Thread.sleep(2000);
	oa.ending_date("2023", "July", "20");
	implicitwait();
	oa.clear_filter();
	Thread.sleep(4000);
	oa.cancelledordertitle();}


@Test
public void TC_OF_015() throws InterruptedException {
test=extent.createTest("TC_OF_015");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
Thread.sleep(3000);
oa.search("#ORD000002");
oa.getsearch_result();}

@Test
public void TC_OF_016() throws InterruptedException {
test=extent.createTest("TC_OF_016");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.click_orderno("#tester000007");
implicitwait();
oa.getordertitle();
oa.getsearch_result();

}


@Test
public void TC_OF_017() throws InterruptedException {
test=extent.createTest("TC_OF_017");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.click_orderno("#tester000016");
implicitwait();
oa.getordertitle();
implicitwait();
oa.click_invoicecheckbox();
Thread.sleep(2000);
//oa.paymentstatus_invoice("Payment Incomplete");
//Thread.sleep(2000);
oa.deliverystatus_invoice("Cancelled");
Thread.sleep(2000);
oa.click_savechanges();
oa.title();
Thread.sleep(1000);
oa.click_printinvoice();


}
@Test
public void TC_OF_018() throws InterruptedException {
test=extent.createTest("TC_OF_018");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.click_orderno("#tester000007");
implicitwait();
oa.getordertitle();
implicitwait();
oa.click_invoicecheckbox();
Thread.sleep(2000);
//oa.paymentstatus_invoice("Payment Cancel");
//Thread.sleep(2000);
oa.deliverystatus_invoice("Processing");
Thread.sleep(2000);
oa.click_savechanges();
oa.title();
Thread.sleep(1000);
oa.click_downloadinvoice();
}


@Test
public void TC_OF_019() throws InterruptedException {
test=extent.createTest("TC_OF_019");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.click_orderdate("23-March-2023");
implicitwait();
oa.getordertitle();
oa.getsearch_result();

}

@Test
public void TC_OF_020() throws InterruptedException {
test=extent.createTest("TC_OF_020");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.click_customer("Test Asf");

implicitwait();
oa.getordertitle();
oa.getsearch_result();
}

@Test(enabled=false)
public void TC_OF_021() throws InterruptedException {
    test=extent.createTest("TC_OF_021");
    Dashboard d = new Dashboard(driver);

   
    //click order button
    d.click_order();
    implicitwait();
    d.click_allorder();
    implicitwait();
    orderpage_allorders oa = new orderpage_allorders(driver);
    //click create order button
    oa.createorder();
    implicitwait();
    //search product
    oa.search("Kurti");
    oa.getsearch_result();
}

//Validate the search functionality in create order page with invalid product name.

 @Test(enabled=false)
 public void TC_OF_022() throws InterruptedException {
    test=extent.createTest("TC_OF_022");
    //object creation for dashboard page
    Dashboard d = new Dashboard(driver);
    
    //click order button
    d.click_order();
    implicitwait();
    //click all orders in menu
    d.click_allorder();
    implicitwait();
    orderpage_allorders oa = new orderpage_allorders(driver);
    //click create order button
    oa.createorder();
    implicitwait();
    //search product
    oa.search("scsojisfv");
    //Get search result
    oa.getsearch_result();
 }

 //Without adding product to cart, verify when I click cart button able to go to cart items page or not.

 @Test(enabled=false)
 public void TC_OF_023() throws InterruptedException {
    test=extent.createTest("TC_OF_023");
    //object creation for dashboard page
    Dashboard d = new Dashboard(driver);
    //click order button
    d.click_order();
    implicitwait();

    //click all orders in menu
    d.click_allorder();
    orderpage_allorders oa = new orderpage_allorders(driver);
    //click create order button
    oa.createorder();

    //click cart btn
    oa.click_cartbtn();

    //capture error message
    oa.errormessage();

 }

 //When I click the product ID in create order page, verify It redirect to product edit page or not.

  @Test(enabled=false)
  public void TC_OF_024() throws InterruptedException {
    test=extent.createTest("TC_OF_024");

    //object creation for dashboard page
    Dashboard d = new Dashboard(driver);

    //click order button
    d.click_order();

    implicitwait();

    //click all orders in menu
    d.click_allorder();
    
  //object creation for all orders page
    orderpage_allorders oa = new orderpage_allorders(driver);
    
    //click create order button
    oa.createorder();
    implicitwait();

    //click one product ID

    oa.click_oneordeID("#1607");
    implicitwait();

    //verify it redirects to edit page or not

    if(driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/products/1607/edit")) {
        System.out.println("Redirects to edit page");       
    }

    else {
        System.out.println("It was not redirect to edit page");
    }

  }    




@Test(enabled=false)
public void TC_OF_025() throws InterruptedException {
    test=extent.createTest("TC_OF_025");

    //object creation for dashboard page
    Dashboard d = new Dashboard(driver);

    //click order button
    d.click_order();
    implicitwait();
    //click all orders in menu
    d.click_allorder();

  //object creation for all orders page
    orderpage_allorders oa = new orderpage_allorders(driver);

    //click create order button
    oa.createorder();

    Thread.sleep(2000);

    //click one product name
    oa.click_productname("Kurti");

    Thread.sleep(3000);

    //verify it goes to storefront or not

    Set<String> allwindows = driver.getWindowHandles();

    String oldwindow = driver.getWindowHandle();

    for (String windowHandle : allwindows) {
        driver.switchTo().window(windowHandle);
        if (!windowHandle.equals(oldwindow)) {
            driver.switchTo().window(windowHandle);
            if(driver.getCurrentUrl().equals("https://instamart.pay380.com/product/kurti/1607")) {
                System.out.println("Redirects to Storefront");       
                }

                else {
                    System.out.println("It was not redirect to storefront");
                }
            }

        }
    }    


@Test(enabled=false)
public void TC_OF_026() throws InterruptedException {
    test=extent.createTest("TC_OF_026"); 


    //object creation for dashboard page
    Dashboard d = new Dashboard(driver);

    //click order button
    d.click_order();
    implicitwait();

    //click all orders in menu
    d.click_allorder();

  //object creation for all orders page
    orderpage_allorders oa = new orderpage_allorders(driver);
    
    //click create order button
    oa.createorder();

    implicitwait();

    //click one product cart
    oa.click_oneproductcart("1607");

    implicitwait();

    oa.get_validation();

} 

@Test(enabled=false)
public void TC_OF_027() throws InterruptedException {
    test=extent.createTest("TC_OF_027"); 

    //object creation for dashboard page
    Dashboard d = new Dashboard(driver);

    //click order button
    d.click_order();

    implicitwait();

    //click all orders in menu
    d.click_allorder();

  //object creation for all orders page
    orderpage_allorders oa = new orderpage_allorders(driver);
    
    //click create order button
    oa.createorder();

    implicitwait();

    oa.click_firstoption();

    Thread.sleep(3000);

    oa.enter_search("Blue");

    implicitwait();

    oa.click_searchedvalue();

    implicitwait();

    oa.click_oneproductcart("1607");

    oa.get_validation();     
}


@Test(enabled=false)
public void TC_OF_028() throws InterruptedException {
    test=extent.createTest("TC_OF_028"); 

    //object creation for dashboard page
    Dashboard d = new Dashboard(driver);

    //click order button
    d.click_order();

    implicitwait();

    //click all orders in menu
    d.click_allorder();
    
  //object creation for all orders page
    orderpage_allorders oa = new orderpage_allorders(driver);

    //click create order button
    oa.createorder();

    implicitwait();

    //click first option
    oa.click_firstoption();

    //enter sendkey in search
    oa.enter_search("Blue");
    implicitwait();

    //click searched value
    oa.click_searchedvalue();

    //click second option
    oa.click_secondoption();

    implicitwait();

    //enter
    oa.enter_search("L");
    implicitwait();

    //click searched value
    oa.click_searchedvalue();
    implicitwait();

    //clear quantity
    oa.clear_quantity();

    implicitwait();

    //click one product cart
    oa.click_oneproductcart("1607");

    implicitwait();

    //get validation
    oa.get_validation();

}


@Test(enabled=false)
public void TC_OF_029() throws InterruptedException {
test=extent.createTest("TC_OF_029");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("john@gmail.com");
oa.enterPhone("1234567891");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("600101");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");
oa.shippingmethods();
oa.paymentid("paid123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}



@Test(enabled=false)
public void TC_OF_030() throws InterruptedException {
test=extent.createTest("TC_OF_030");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("john2@gmail.com");
oa.enterPhone("1234567891");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("600101");
Thread.sleep(1000);
oa.pendingpaymentstatus();
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");
oa.shippingmethods();
oa.paymentid("abc123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}


@Test(enabled=false)
public void TC_OF_031() throws InterruptedException {
test=extent.createTest("TC_OF_031");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("john2@gmail.com");
oa.enterPhone("1234567891");
oa.customertype(1);
oa.deliverytype(1);

((JavascriptExecutor) driver).executeScript("window.scroll(0,300)");

oa.selectpaymentmethods("razorpay");

oa.paymentid("abc123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();}

@Test(enabled=false)
public void TC_OF_033() throws InterruptedException {
test=extent.createTest("TC_OF_033");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("Sona Gopi");
oa.enterEmail("sonagopi10@gmail.com");
oa.enterPhone("1234567891");
oa.customertype(0);
oa.deliverytype(1);

((JavascriptExecutor) driver).executeScript("window.scroll(0,300)");

oa.selectpaymentmethods("razorpay");

oa.paymentid("abc123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();}


@Test(enabled=false)
public void TC_OF_032() throws InterruptedException {
test=extent.createTest("TC_OF_032");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("Sona");
oa.enterEmail("sonagoi10@gmail.com");
oa.enterPhone("1234567891");
oa.customertype(0);
oa.deliverytype(1);

((JavascriptExecutor) driver).executeScript("window.scroll(0,300)");

oa.selectpaymentmethods("razorpay");

oa.paymentid("abc123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();}

@Test(enabled=false)
public void TC_OF_034() throws InterruptedException {
test=extent.createTest("TC_OF_034");
System.out.println("customer name not provided");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("");
oa.enterEmail("john@gmail.com");
oa.enterPhone("1235567891");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("600101");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");
oa.shippingmethods();
oa.paymentid("paid123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}

@Test(enabled=false)
public void TC_OF_035() throws InterruptedException {
test=extent.createTest("TC_OF_035");
System.out.println("invalid email");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("johngmail.com");
oa.enterPhone("1234567891");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("600101");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");
oa.shippingmethods();
oa.paymentid("paid123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}

@Test(enabled=false)
public void TC_OF_036() throws InterruptedException {
test=extent.createTest("TC_OF_036");
System.out.println("invalid mobile number");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("john@gmail.com");
oa.enterPhone("123456789");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("600101");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");
oa.shippingmethods();
oa.paymentid("paid123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}

@Test(enabled=false)
public void TC_OF_037() throws InterruptedException {
test=extent.createTest("TC_OF_037");
System.out.println("address not provided");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("johngmail.com");
oa.enterPhone("12345678918");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("600101");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");
oa.shippingmethods();
oa.paymentid("paid123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}

@Test(enabled=false)
public void TC_OF_038() throws InterruptedException {
test=extent.createTest("TC_OF_038");
System.out.println("location not provided");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("john@gmail.com");
oa.enterPhone("1234567891");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("");
Thread.sleep(1000);
oa.enterZipCode("600101");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");

oa.paymentid("paid123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}

@Test(enabled=false)
public void TC_OF_039() throws InterruptedException {
test=extent.createTest("TC_OF_039");
System.out.println("zip not provided");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("john@gmail.com");
oa.enterPhone("1234567891");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");
oa.shippingmethods();
oa.paymentid("paid123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}

@Test(enabled=false)
public void TC_OF_040() throws InterruptedException {
test=extent.createTest("TC_OF_040");
System.out.println("shipping method not provided");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("john@gmail.com");
oa.enterPhone("1234567891");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("600101");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");

oa.paymentid("paid123");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}

@Test(enabled=false)
public void TC_OF_041() throws InterruptedException {
test=extent.createTest("TC_OF_041");
System.out.println("payment id not provided");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("john@gmail.com");
oa.enterPhone("1234567891");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("600101");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");
oa.shippingmethods();
oa.paymentid("");
oa.ordernote("order completed");
oa.clickMakeOrderButton();
oa.title();
}

@Test(enabled=false)
public void TC_OF_042() throws InterruptedException {
test=extent.createTest("TC_OF_042");
System.out.println("order note not provided");
Dashboard d = new Dashboard(driver);
d.click_order();
d.click_allorder();
implicitwait();
orderpage_allorders oa = new orderpage_allorders(driver);
oa.createorder();
oa.clickcartsymbol_ofid("1530");
Thread.sleep(3000);
oa.click_cartbtn();
implicitwait();
oa.clickProceedToCheckoutLink();
implicitwait();
oa.enterName("john");
oa.enterEmail("johngmail.com");
oa.enterPhone("1234567891");
oa.customertype(1);
oa.deliverytype(0);
oa.enterAddress("2, 3nd st");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(2000);
oa.locationtabclick();
Thread.sleep(1000);
oa.location("Chennai");
Thread.sleep(1000);
oa.enterZipCode("600101");
((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
Thread.sleep(1000);
oa.selectpaymentmethods("razorpay");
oa.shippingmethods();
oa.paymentid("paid123");
oa.ordernote("");
oa.clickMakeOrderButton();
oa.title();
}

@Test(enabled=false)
public void TC_OF_043() throws InterruptedException {
    test=extent.createTest("TC_OF_043"); 
    //object creation for dashboard page
    Dashboard d = new Dashboard(driver);
    
    //click order button
    d.click_order();
    implicitwait();
    //click all orders in menu
    d.click_allorder();
    
  //object creation for all orders page
    orderpage_allorders oa = new orderpage_allorders(driver);
    
    //click create order button
    oa.createorder();
    implicitwait();
    //click first option
    oa.click_firstoption();
    //enter sendkey in search
    oa.enter_search("Blue");
    implicitwait();
    //click searched value
    oa.click_searchedvalue();
    //click second option
    oa.click_secondoption();
    implicitwait();
    //enter
    oa.enter_search("L");
    implicitwait();
    //click searched value
    oa.click_searchedvalue();
    implicitwait();
    //click one product cart
    oa.click_oneproductcart("1607");
    Thread.sleep(4000);
    //click cart btn
    oa.click_cartbtn();
    Thread.sleep(3000);
    //click delete btn
    oa.click_deletebtn();
    //verification
    oa.get_verification();



} 


}
