package com.sb.pageobject.analytics;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sb.baseclass.YourExcelUtilsClass;
import com.sb.baseclass.extentreports;
import com.sb.pageobject.register.seller.registerpage_category;
import com.sb.pageobject.register.seller.registerpage_createstore;
import com.sb.pageobject.register.seller.registerpage_language;
import com.sb.pageobject.register.seller.registerpage_storedescription;
import com.sb.pageobject.register.seller.registerpage_storelocation;

public  class TC_Register_seller_excel extends extentreports {
	
@BeforeMethod
	public void browseropening() {
 browserlaunch("https://app.pay380.com/store/register");
	implicitwait();
	}

@DataProvider(name = "registration")
public Object[][] testData() {
    return YourExcelUtilsClass.getTestData("registration");
}


     @Test(dataProvider = "registration")
	public void TC_RF_002(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
	
    	 
System.out.println("complete store registration");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(1000);
	rc.category_selection(category);
	rc.register_nextbtn();
 implicitwait();
registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description(description);
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location(address, city, state, pincode);
	implicitwait();
	registerpage_language rlang= new registerpage_language(driver);
     rlang.store_language(language);
    rlang.submit_button();
    System.out.println("successful registration");
}

@Test(dataProvider = "registration")
public void TC_RF_001(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {

	//test=extent.createTest("TC_RF_001");
	System.out.println("complete store registration with skip ");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	rc.register_skipbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description_skip();
	//rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location_skip();
	implicitwait();
registerpage_language rlang= new registerpage_language(driver);
	rlang.store_language_skip();
	System.out.println("successful registration");
}

   @Test(dataProvider = "registration")
	public void TC_RF_003(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {

test=extent.createTest("TC_RF_003");
	System.out.println("Invalid First name");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();

}

@Test(dataProvider = "registration")
	public void TC_RF_004(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {

	//test=extent.createTest("TC_RF_004");
	System.out.println("Invalid Last name");
registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();

	rp.storecreate_error();
	
}
     @Test(dataProvider = "registration")
	public void TC_RF_005(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
    test=extent.createTest("TC_RF_005");	
    	 System.out.println("Invalid emailID");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
	
}

   @Test(dataProvider = "registration")
	public void TC_RF_006(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {

	test=extent.createTest("TC_RF_006");
	System.out.println("Existing emailID");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}

   @Test(dataProvider = "registration")
	public void TC_RF_007(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {

	test=extent.createTest("TC_RF_007");	
	System.out.println("Invalid mobile number");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}

   @Test(dataProvider = "registration")
	public void TC_RF_008(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
	test=extent.createTest("TC_RF_008");
	System.out.println("Different password and confirm password");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}
   @Test(dataProvider = "registration")
	public void TC_RF_009(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
	test=extent.createTest("TC_RF_009");
	System.out.println("Invalid password ");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}
   
    @Test(dataProvider = "registration")
	public void TC_RF_010(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
	//test=extent.createTest("TC_RF_010");
	System.out.println("Invalid shoptype");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);	
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}

  @Test(dataProvider = "registration")
	public void TC_RF_011(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
	test=extent.createTest("TC_RF_011");
	System.out.println("shopname not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);	
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}

    @Test(dataProvider = "registration")
	public void TC_RF_012(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
	test=extent.createTest("TC_RF_012");
	System.out.println("Invalid shopname");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);	
	Thread.sleep(50000);
	rp.agreebox();
rp.nextbtn();
	rp.invalidshopname_error();;
}

   @Test(dataProvider = "registration")
	public void TC_RF_013(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
test=extent.createTest("TC_RF_013");
System.out.println("Agree Box not clicked");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.nextbtn();
	rp.storecreate_error();
	
}

  @Test(dataProvider = "registration")
	public void TC_RF_014(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
	test=extent.createTest("TC_RF_014");
	System.out.println("Category not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	rc.register_nextbtn();
	rc.selectcategoryerror();
}

@Test(dataProvider = "registration")
	public void TC_RF_015(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
test=extent.createTest("TC_RF_015");
System.out.println("Description not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(1000);
	implicitwait();
	rc.category_selection(category);
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description(description);
	rd.store_description_nextbtn();
Thread.sleep(1000);
	rd.store_description_errormessage();
}
@Test(dataProvider = "registration")
	public void TC_RF_016(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {
test=extent.createTest("TC_RF_016");
System.out.println("Address not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);	
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(1000);
	rc.category_selection(category);
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description(description);
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location(address,city,state,pincode);
rl.address_errormessage();

}
@Test(dataProvider = "registration")
	public void TC_RF_017(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {

	test=extent.createTest("TC_RF_017");
System.out.println("City not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(1000);
	rc.category_selection(category);
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description(description);
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location(address,city,state,pincode);
	rl.city_errormessage();;
	}
@Test(dataProvider = "registration")
	public void TC_RF_018(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {

	test=extent.createTest("TC_RF_018");
System.out.println("Statename not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(1000);
	rc.category_selection(category);
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description(description);
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location(address,city,state,pincode);
	rl.state_errormessage();;

	}
@Test(dataProvider = "registration")
	public void TC_RF_019(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {

	test=extent.createTest("TC_RF_019");
System.out.println("Pincode not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(1000);
	rc.category_selection(category);
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description(description);
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location(address,city,state,pincode);
	rl.pincode_errormessage();
}
@Test(dataProvider = "registration")
	public void TC_RF_020(String firstname,String Lastname,String email,String mobile,String password,String confirmpwd,String shoptype,String shopname,String category,String description,String address,String city,String state,String pincode,String language) throws InterruptedException {

	test=extent.createTest("TC_RF_020");
System.out.println("Language not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(firstname, Lastname, email, mobile, password,confirmpwd,shoptype,shopname);
	Thread.sleep(50000);
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(1000);
	rc.category_selection(category);
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description(description);
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location(address,city,state,pincode);
	implicitwait();
	registerpage_language rlang= new registerpage_language(driver);
    rlang.submit_button();
     rlang.store_language_errormessage();
}

}