package com.sb.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.login.seller.loginpage_resetpassword;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;

public class TC_Login_seller extends extentreports {
	@BeforeMethod
	public void browseropening() {
 browserlaunch("https://app.pay380.com/verify-shop");
	implicitwait();
	}
	
	
@Test
public void TC_LF_001() throws InterruptedException {
	test=extent.createTest("TC_LF_001");
	loginpage_verifystore vs = new loginpage_verifystore(driver);
	vs.enterStoreName("instamart");
	vs.clickVerifyStoreButton();
	Thread.sleep(1000);
	loginpage_verifyemail ve = new loginpage_verifyemail(driver);
	ve.enterEmail("instamart@example.com");
	ve.enterPassword("12345678");
	ve.clickLoginButton();
	Thread.sleep(1000);
	vs.isadminpanel("instamart");
	System.out.println("successful login");
}

@Test(enabled=false)
public void TC_LF_002() {
	test=extent.createTest("TC_LF_002");
	loginpage_verifystore vs = new loginpage_verifystore(driver);
	vs.enterStoreName("instaemart");
	vs.clickVerifyStoreButton();
	vs.shopname_errormessage();
	System.out.println("Invalid shopname provided");
	}


@Test(enabled=false)
public void TC_LF_003() throws InterruptedException {
test=extent.createTest("TC_LF_003");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.enterStoreName("instamart");
vs.clickVerifyStoreButton();
Thread.sleep(1000);
loginpage_verifyemail ve = new loginpage_verifyemail(driver);
ve.enterEmail("instama3rt@example.com");
ve.enterPassword("1234535678");
ve.clickLoginButton();
implicitwait();
ve.invalid_credential_error();
System.out.println("Invalid login credentials");
}


@Test(enabled=false)
public void TC_LF_004() throws InterruptedException {
test=extent.createTest("TC_LF_004");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.enterStoreName("instamart");
vs.clickVerifyStoreButton();
Thread.sleep(1000);
loginpage_verifyemail ve = new loginpage_verifyemail(driver);
ve.enterEmail("instamart@example.com");
ve.enterPassword("123455678");
ve.clickLoginButton();
implicitwait();
ve.invalid_credential_error();
System.out.println("Invalid password-login credentials");
}

@Test(enabled=false)
public void TC_LF_005() throws InterruptedException {
test=extent.createTest("TC_LF_005");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.enterStoreName("instamart");
vs.clickVerifyStoreButton();
Thread.sleep(1000);
loginpage_verifyemail ve = new loginpage_verifyemail(driver);
ve.enterEmail("inst4amart@example.com");
ve.enterPassword("12345678");
ve.clickLoginButton();
ve.invalid_credential_error();
System.out.println("Invalid email-login credentials");
}


@Test(enabled=false)
public void TC_LF_006() throws InterruptedException {
test=extent.createTest("TC_LF_006");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.enterStoreName("instamart");
vs.clickVerifyStoreButton();
Thread.sleep(1000);
loginpage_verifyemail ve = new loginpage_verifyemail(driver);
ve.enterEmail("instamart@example.com");
ve.enterPassword("12345678");

ve.eyebutton();
System.out.println("Eyeicon is clicked");
ve.password_visibility();

ve.eyebutton();
System.out.println("Eyeicon is clicked again ");
ve.password_visibility();
System.out.println("Validation of eye button");
}

@Test(enabled=false)
public void TC_LF_007() throws InterruptedException {
test=extent.createTest("TC_LF_007");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.enterStoreName("instamart");
vs.clickVerifyStoreButton();
Thread.sleep(1000);
loginpage_verifyemail ve = new loginpage_verifyemail(driver);
ve.clickFOrgotPassword();
Thread.sleep(1000);
loginpage_resetpassword rp = new loginpage_resetpassword(driver);
rp.enteremailID("instamart@example.com");
rp.resetpassword();
implicitwait();
rp.iscorrectemail();
rp.validemail_success_msg();
System.out.println("successful resetting of password");
}



@Test(enabled=false)
public void TC_LF_008() throws InterruptedException {
test=extent.createTest("TC_LF_008");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.enterStoreName("instamart");
vs.clickVerifyStoreButton();
Thread.sleep(1000);
loginpage_verifyemail ve = new loginpage_verifyemail(driver);
ve.clickFOrgotPassword();
Thread.sleep(1000);
loginpage_resetpassword rp = new loginpage_resetpassword(driver);
rp.enteremailID("instam4art@example.com");
rp.resetpassword();
implicitwait();
rp.invalidemail_error();
System.out.println("Invalid email ID -resetting of password");
}


@Test(enabled=false)
public void TC_LF_009() throws InterruptedException {
test=extent.createTest("TC_LF_009");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.enterStoreName("instamart");
vs.clickVerifyStoreButton();    
Thread.sleep(1000);
loginpage_verifyemail ve = new loginpage_verifyemail(driver);
ve.clickFOrgotPassword();
implicitwait();
loginpage_resetpassword rp = new loginpage_resetpassword(driver);
rp.clickbacktosigninbutton();
vs.isinstamartLoginPage("instamart");
}


@Test(enabled=false)

public void TC_LF_010() throws InterruptedException {
 test=extent.createTest("TC_LF_010");
System.out.println("Clicking Singlebag logo");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.clickWebHomeLogo();
implicitwait();
 vs.issinglebagwebsite();  
}     


@Test(enabled=false)
public void TC_LF_011() throws InterruptedException {
test=extent.createTest("TC_LF_011");
System.out.println("Clicking get Started btn");
loginpage_verifystore vs = new loginpage_verifystore(driver);
 vs.clickGetStartedLink();
implicitwait();
vs.isregistrationpage();
}


@Test(enabled=false)

public void TC_LF_012() throws InterruptedException {
 test=extent.createTest("TC_LF_012");
System.out.println("Clicking create store link");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.click_create_StoreLink();
implicitwait();
vs.isregistrationpage();
}
  


@Test(enabled=false)
public void TC_LF_013() throws InterruptedException {
test=extent.createTest("TC_LF_013");
System.out.println("Clicking - Dont have an account link");
loginpage_verifystore vs = new loginpage_verifystore(driver);
vs.enterStoreName("instamart");
vs.clickVerifyStoreButton();
implicitwait();
loginpage_verifyemail ve = new loginpage_verifyemail(driver);
ve.click_Dont_have_an_accountLink();
implicitwait();
vs.isregistrationpage();

 }

}




 

  



