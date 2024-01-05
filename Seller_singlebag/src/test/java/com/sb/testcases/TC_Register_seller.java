package com.sb.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.sb.baseclass.extentreports;
import com.sb.pageobject.register.seller.registerpage_category;
import com.sb.pageobject.register.seller.registerpage_createstore;
import com.sb.pageobject.register.seller.registerpage_language;
import com.sb.pageobject.register.seller.registerpage_storedescription;
import com.sb.pageobject.register.seller.registerpage_storelocation;

public  class TC_Register_seller extends extentreports {
	
@BeforeMethod
	public void browseropening() {
 browserlaunch("https://app.pay380.com/store/register");
	implicitwait();
	}


@Test
public void TC_RF_002() throws InterruptedException {
	test=extent.createTest("TC_RF_002");
System.out.println("complete store registration");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("candies", "AC", "v111.ai3811443.sha4515l4i1bas.3k.ar0308@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller", "tes24abc");
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(1000);
	rc.category_selection("Outfits");
	rc.register_nextbtn();
implicitwait();
registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description("fashion store for kids with selected brand and discounted price");
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location("38,2nd st, anna nagar", "chennai", "tamilnadu", "600101");
	implicitwait();
	registerpage_language rlang= new registerpage_language(driver);
     rlang.store_language("English");
    rlang.submit_button();
    System.out.println("successful registration");
}

@Test
public void TC_RF_001() throws InterruptedException  {
	
	test=extent.createTest("TC_RF_001");
	System.out.println("complete store registration with skip ");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("jo", "A", "v611.ai4sh144al.iba4sk59a.r283108@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller", "test14abc");
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

@Test
public void TC_RF_003() throws InterruptedException  {
	test=extent.createTest("TC_RF_003");
	System.out.println("Invalid First name");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register(" ", "AbC", "v.1aish5a.li1b5as.21455ka4r307@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller","test1224551032");

	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
	
}

@Test
public void TC_RF_004() throws InterruptedException  {
	test=extent.createTest("TC_RF_004");
	System.out.println("Invalid Last name");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "12$s", "va.i.s1.h14al352iba45sk4ar137@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller","test14221501543");
	rp.agreebox();
	rp.nextbtn();

	rp.storecreate_error();
	
}
@Test
public void TC_RF_005() throws InterruptedException  {
	test=extent.createTest("TC_RF_005");
	System.out.println("Invalid emailID");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "abc", "vaisha1.l4i211bask.a.r37gmailcom", "9876543284", "abcd1fgh", "abcd1fgh", "Seller","test2241555104");
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
	
}

@Test
public void TC_RF_006() throws InterruptedException  {
	test=extent.createTest("TC_RF_006");
	System.out.println("Existing emailID");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "abc", "gayuravi030801@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller","test22556015");
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}

@Test
public void TC_RF_007() throws InterruptedException  {
	test=extent.createTest("TC_RF_007");
	System.out.println("Invalid mobile number");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "abc", "gayur412a145701v4i.03.01@gmail.com", "987654328", "abcd1fgh", "abcd1fgh", "Seller", "test1422105776");
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}

@Test
public void TC_RF_008() throws InterruptedException  {
	test=extent.createTest("TC_RF_008");
	System.out.println("Different password and confirm password");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "abc", "ga11y4u2r.avi47550.31007@gmail.com", "9876543282", "abcd1fg", "abcd1fgh", "Seller","test2145721087");
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}
@Test
public void TC_RF_009() throws InterruptedException  {
	test=extent.createTest("TC_RF_009");
	System.out.println("Invalid password ");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "abc", "gayu15r1751at20v4i0.3.07@gmail.com", "9876543282", "abcd1fg", "abcd1fg", "Seller","tes47t21502819");
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}
@Test
public void TC_RF_010() throws InterruptedException  {
	test=extent.createTest("TC_RF_010");
	System.out.println("Invalid shoptype");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "abc", "g12ay.5ur412a4v1704i0.30.7@gmail.com", "9876543282", "abcd1fgh", "abcd1fgh", "Select Shop Type","tes4t522177109");
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}

@Test
public void TC_RF_011() throws InterruptedException  {
	test=extent.createTest("TC_RF_011");
	System.out.println("shopname not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "abc", "ga215y.u2r7a.v10i.0143077@gmail.com", "9876543282", "abcd1fgh", "abcd1fgh", "Seller","");
	rp.agreebox();
	rp.nextbtn();
	rp.storecreate_error();
}

@Test
public void TC_RF_012() throws InterruptedException  {
	test=extent.createTest("TC_RF_012");
	System.out.println("Invalid shopname");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "abc", "ga12yur2a.vi.5014743160057@gmail.com", "9876543282", "abcd1fgh", "abcd1fgh", "Seller","abc");
	rp.agreebox();
	rp.nextbtn();
	rp.invalidshopname_error();
}

@Test
public void TC_RF_013() throws InterruptedException  {
	test=extent.createTest("TC_RF_013");
	System.out.println("Agree Box not clicked");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("john", "abc", "ga.yur4a71v25i7415103.0057@gmail.com", "9876543282", "abcd1fgh", "abcd1fgh", "Seller","test2724115910");
	rp.nextbtn();
	rp.storecreate_error();
	
}

@Test
public void TC_RF_014() throws InterruptedException  {
	test=extent.createTest("TC_RF_014");
	System.out.println("Category not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("johnsA", "AbC", "vais.ha541l4071i21b.aska.r3637@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller", "test4251792111");
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	rc.register_nextbtn();
	rc.selectcategoryerror();
}

@Test
public void TC_RF_015() throws InterruptedException {
	test=extent.createTest("TC_RF_015");
System.out.println("Description not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("johnsA", "AbC", "va.is3211.h5al.10i5b2117a4s0kar1336675@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller", "test27585131212");
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(2000);
	rc.category_selection("Outfits");
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description("");
	rd.store_description_nextbtn();
Thread.sleep(1000);
	rd.store_description_errormessage();
}
@Test
public void TC_RF_016() throws InterruptedException {
	test=extent.createTest("TC_RF_016");
System.out.println("Address not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("johnsA", "AbC", "v.1a.1ish.5a3751lib2951as10ka4r369075@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller", "test26216551713");
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(2000);
	rc.category_selection("Outfits");
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description("fashion store for kids with selected brand and discounted price");
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location("", "chennai", "tamilnadu", "600101");
rl.address_errormessage();

}
@Test
public void TC_RF_017() throws InterruptedException {
	test=extent.createTest("TC_RF_017");
System.out.println("City not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("johnsA", "AbC", "va.isha7310l525i13bas.ka.r50395167@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller", "test12752518194");
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(2000);
	rc.category_selection("Outfits");
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description("fashion store for kids with selected brand and discounted price");
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location("38,2nd st, anna nagar", "", "tamilnadu", "600101");
	rl.city_errormessage();;
	}
@Test
public void TC_RF_018() throws InterruptedException {
	test=extent.createTest("TC_RF_018");
System.out.println("Statename not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("johnsA", "AbC", "va.ish4a17l5i0b1a2125s0k5a.r135.8807@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller", "test721552291715");
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(2000);
	rc.category_selection("Outfits");
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description("fashion store for kids with selected brand and discounted price");
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location("38,2nd st, anna nagar", "chennai", "", "600101");
	rl.state_errormessage();;

	}
@Test
public void TC_RF_019() throws InterruptedException {
	test=extent.createTest("TC_RF_019");
System.out.println("Pincode not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("johnsA", "AbC", "va.ish.ali5b511a5s52k1ar0173.8950475@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller", "test82615521167");
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(2000);
	rc.category_selection("Outfits");
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description("fashion store for kids with selected brand and discounted price");
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location("38,2nd st, anna nagar", "chennai", "tamilnadu", "");
	rl.pincode_errormessage();;
}
@Test
public void TC_RF_020() throws InterruptedException {
	test=extent.createTest("TC_RF_020");
System.out.println("Language not provided");
	registerpage_createstore rp= new registerpage_createstore(driver);
	rp.register("johnsA", "AbC", "vai4sh1g4a1l5ib0aska15562r17.3587@gmail.com", "9876543284", "abcd1fgh", "abcd1fgh", "Seller", "testab5c");
	rp.agreebox();
	rp.nextbtn();
	implicitwait();
	registerpage_category  rc= new registerpage_category(driver);
	Thread.sleep(2000);
	rc.category_selection("Outfits");
	rc.register_nextbtn();
	implicitwait();
	registerpage_storedescription rd= new registerpage_storedescription(driver);
	rd.store_description("fashion store for kids with selected brand and discounted price");
	rd.store_description_nextbtn();
	implicitwait();
	registerpage_storelocation rl = new registerpage_storelocation(driver);
	rl.store_location("38,2nd st, anna nagar", "chennai", "tamilnadu", "600101");
	implicitwait();
	registerpage_language rlang= new registerpage_language(driver);
     rlang.submit_button();
     rlang.store_language_errormessage();
}
}


