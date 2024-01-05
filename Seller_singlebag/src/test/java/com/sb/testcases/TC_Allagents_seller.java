package com.sb.testcases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sb.baseclass.extentreports;
import com.sb.pageobject.dashboard.seller.Dashboard;
import com.sb.pageobject.deliveryagent.seller.Deliveryagentpage_allagents;
import com.sb.pageobject.login.seller.loginpage_verifyemail;
import com.sb.pageobject.login.seller.loginpage_verifystore;

public class TC_Allagents_seller extends extentreports{

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
	Thread.sleep(3000);}
	
	@Test
	public void TC_DF_001() throws InterruptedException {
		test=extent.createTest("TC_DF_001");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_allcheckbox();
	aa.select_actions("Active");
	aa.click_actionsubmit();
	aa.getmessage();
	System.out.println("status of all agents are made active");
	
	}	
	
	@Test
	public void TC_DF_002() throws InterruptedException {
		test=extent.createTest("TC_DF_001");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_allcheckbox();
	aa.select_actions("Inactive");
	aa.click_actionsubmit();
	aa.getmessage();
	System.out.println("status of all agents are made inactive");
	}
	
	@Test
	public void TC_DF_003() throws InterruptedException {
		test=extent.createTest("TC_DF_003");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.select_actions("Inactive");
	aa.click_actionsubmit();
	aa.getmessage();
	System.out.println("Submit button is clicked without selecting checkbox");
	}
	
	@Test
	public void TC_DF_004() throws InterruptedException {
		test=extent.createTest("TC_DF_004");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_particularcheckbox("250");
	aa.select_actions("Delete");
	aa.click_actionsubmit();
	aa.getmessage();
	System.out.println(" Agents  is deleted");
	}
	
	@Test
	public void TC_DF_005() throws InterruptedException {
		test=extent.createTest("TC_DF_005");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_actions("226");
	aa.click_editagent("226");
	implicitwait();
	aa.enter_firstname("vaishu");
	aa.enter_lastname("baskar");
	aa.enter_email("v.shva.ishali17@gmail.com");
	aa.enter_mobilenumber("9876548888"); // has to change for every test
	aa.enter_password("12345678");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("2226");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.getmessage();
	System.out.println("Agent is updated successfully");
	}
	
	@Test
	public void TC_DF_006() throws InterruptedException {
		test=extent.createTest("TC_DF_006");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_actions("227");
	aa.click_editagent("227");
	implicitwait();
	aa.enter_firstname("vaishali");
	aa.enter_lastname("b");
	aa.enter_email("vshvais.hali1.7@gmail.com");
	aa.enter_mobilenumber("9876543889"); // has to change for every test
	aa.enter_password("");
	Thread.sleep(3000);
	aa.click_passwordcheckbox();
	
	aa.enter_agentid("218");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.getmessage();
	System.out.println("Password field is not provided");
	}
	
	
	@Test
	public void TC_DF_009() throws InterruptedException {
		test=extent.createTest("TC_DF_009");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_actions("227");
	aa.click_login("227");
	implicitwait();
	aa.click_ordersoflogin();
	aa.click_allordersoflogin();
	System.out.println("Password field is not provided");
	}
	
	
	
	@Test
	public void TC_DF_008() throws InterruptedException {
		test=extent.createTest("TC_DF_008");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_actions("227");
	aa.click_viewagent("227");
	implicitwait();
	aa.from_date("2022","March","20");
	aa.to_date("2023","June","25");
	aa.click_exporttoexcel();
	
	System.out.println("Export excel is dowloaded");
	}
	
	@Test
	public void TC_DF_007() throws InterruptedException {
		test=extent.createTest("TC_DF_007");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_actions("227");
	aa.click_viewagent("227");
	implicitwait();
	aa.click_clickhereof_view();
	Thread.sleep(2000);
	aa.click_closeof_view();
	System.out.println("Id proff of agent is viewed");
	}
	
	
	
	
	
	@Test
	public void TC_DF_010() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_010");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	aa.avatar("C:\\Users\\Digi-QA\\Downloads\\imagefile.jpeg");
	implicitwait();
	aa.enter_firstname("john");
	aa.enter_lastname("john");
	aa.enter_email("johnjohn@gmail.com");
	aa.enter_mobilenumber("9876543291");
	aa.enter_password("12345678");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("240");
	aa.agentid_image("C:\\Users\\Digi-QA\\Downloads\\imagefile.jpeg");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.getmessage();
	System.out.println("new delivery agent is created");
	}
	
	
	@Test
	public void TC_DF_011() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_011");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	implicitwait();
	aa.enter_firstname("");
	aa.enter_lastname("b");
	aa.enter_email("vshvaishali17@gmail.com");
	aa.enter_mobilenumber("9876543217");
	aa.enter_password("12345678");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("240");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.error_firstname();
	System.out.println("First name not provided");
	}
	
	@Test
	public void TC_DF_012() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_012");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	implicitwait();
	aa.enter_firstname("vaishu");
	aa.enter_lastname("");
	aa.enter_email("vshvaishali17@gmail.com");
	aa.enter_mobilenumber("9876543266");
	aa.enter_password("12345678");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("240");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.error_lastname();
	System.out.println("Last name not provided");
	}
	
	@Test
	public void TC_DF_013() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_013");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	implicitwait();
	aa.enter_firstname("vaishu");
	aa.enter_lastname("b");
	aa.enter_email("vshvaishali17gmail.com");
	aa.enter_mobilenumber("9876543277");
	aa.enter_password("12345678");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("240");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.error_email();
	System.out.println("Invalid email provided");
	}
	
	@Test
	public void TC_DF_014() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_014");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	implicitwait();
	aa.enter_firstname("vaishu");
	aa.enter_lastname("b");
	aa.enter_email("");

	aa.enter_mobilenumber("9876543288");
	aa.enter_password("12345678");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("240");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.error_email();
	System.out.println("Email id  not provided");
	}
	
	
	@Test
	public void TC_DF_015() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_015");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	implicitwait();
	aa.enter_firstname("vaishu");
	aa.enter_lastname("b");
	aa.enter_email("vshva.ishali17@gmail.com");
	aa.enter_mobilenumber("987664321");
	aa.enter_password("12345678");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("240");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.getmessage();
	System.out.println("Invalid mobile number provided");
	}
	
	@Test
	public void TC_DF_016() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_016");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	implicitwait();
	aa.enter_firstname("vaishu");
	aa.enter_lastname("b");
	aa.enter_email("vshvaishali17@gmail.com");
	aa.enter_mobilenumber("");
	aa.enter_password("12345678");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("240");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.error_mobilenumber();
	System.out.println("Mobile number  not provided");
	}
	
	@Test
	public void TC_DF_017() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_017");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	implicitwait();
	aa.enter_firstname("vaishu");
	aa.enter_lastname("b");
	aa.enter_email("vshvaishali17@gmail.com");
	aa.enter_mobilenumber("9878543217");
	aa.enter_password("");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("240");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	
	aa.error_password();
	System.out.println("Password  not provided");
	}
	
	@Test
	public void TC_DF_018() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_018");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	implicitwait();
	aa.enter_firstname("vaishu");
	aa.enter_lastname("b");
	aa.enter_email("vshvaishali17@gmail.com");
	aa.enter_mobilenumber("9076543219");
	aa.enter_password("12345678");
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	aa.enter_agentid("");
	implicitwait();
	aa.enter_statusinform("Active");
	aa.saveDeliveryAgent();
	aa.error_agentid();
	System.out.println("Agent id not provided");
	}
	
	@Test
	public void TC_DF_019() throws InterruptedException, AWTException {
		test=extent.createTest("TC_DF_019");
		Dashboard d = new Dashboard(driver);
	d.click_deliveryagent();
	d.click_allagents();
	Thread.sleep(2000);
	Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);
	aa.click_create();
	aa.click_deliveryagent();
	aa.getpagetitle();
	System.out.println("Back to delivery page is done");
	}
	
	//Validate all agents functions -search(firstname)    
    @Test
    public void TC_DF_020() throws InterruptedException {
    test=extent.createTest("TC_CF_020");
    Dashboard d = new Dashboard(driver);
    d.click_deliveryagent();
	d.click_allagents();

            Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);

            aa.entervalueinsearch("Gayathri");

            aa.choosingsearchoptions("Search By First Name");

            aa.clicksearch();

            aa.verifysearchedvalue();


    }

    //Validate all agents functions -search(Lastname)    
            @Test
            public void TC_DF_021() throws InterruptedException {
            test=extent.createTest("TC_DF_021");
            Dashboard d = new Dashboard(driver);

            d.click_deliveryagent();
        	d.click_allagents();

            Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);

            aa.entervalueinsearch("Ravichandran");

            aa.choosingsearchoptions("Search By Last Name");

            aa.clicksearch();

            aa.verifysearchedvalue();

}    

   //Validate all agents functions -search(Email)    
            @Test
            public void TC_DF_022() throws InterruptedException {
            test=extent.createTest("TC_DF_022");
            Dashboard d = new Dashboard(driver);

            d.click_deliveryagent();
        	d.click_allagents();

            Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);

            aa.entervalueinsearch("gayuravi030801@gmail.com");

            aa.choosingsearchoptions("Search By Email");

            aa.clicksearch();

            aa.verifysearchedvalue();

}    
            
          //Validate all customers functions -search(ID)    
            @Test
            public void TC_DF_023() throws InterruptedException {
            test=extent.createTest("TC_DF_023");
            Dashboard d = new Dashboard(driver);
            d.click_deliveryagent();
        	d.click_allagents();

            Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);

            aa.entervalueinsearch("226");

            aa.choosingsearchoptions("Search By Id");

            aa.clicksearch();

            aa.verifysearchedvalue();

}
            
            
          //Validate all agents functions - negativesearch(firstname)    
			@Test
			public void TC_DF_024() throws InterruptedException {
				test = extent.createTest("TC_CF_024");
				Dashboard d = new Dashboard(driver);
				d.click_deliveryagent();
				d.click_allagents();

				Deliveryagentpage_allagents aa = new Deliveryagentpage_allagents(driver);

				aa.entervalueinsearch("226");

				aa.choosingsearchoptions("Search By First Name");

				aa.clicksearch();

				aa.verifysearchedvalue();
				System.out.println("Negative search for firstname");

            }

            //Validate all agents functions - negative search(Lastname)    
                    @Test
                    public void TC_DF_025() throws InterruptedException {
                    test=extent.createTest("TC_DF_025");
                    Dashboard d = new Dashboard(driver);

                    d.click_deliveryagent();
                	d.click_allagents();

                    Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);

                    aa.entervalueinsearch("226");

                    aa.choosingsearchoptions("Search By Last Name");

                    aa.clicksearch();

                    aa.verifysearchedvalue();
                    System.out.println("Negative search for lastname");

        }    

           //Validate all agents functions -search(Email)    
                    @Test
                    public void TC_DF_026() throws InterruptedException {
                    test=extent.createTest("TC_DF_026");
                    Dashboard d = new Dashboard(driver);

                    d.click_deliveryagent();
                	d.click_allagents();

                    Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);

                    aa.entervalueinsearch("226");

                    aa.choosingsearchoptions("Search By Email");

                    aa.clicksearch();

                    aa.verifysearchedvalue();
                    System.out.println("Negative search for email");
        }    
                    
                  //Validate all customers functions -search(ID)    
                    @Test
                    public void TC_DF_027() throws InterruptedException {
                    test=extent.createTest("TC_DF_027");
                    Dashboard d = new Dashboard(driver);
                    d.click_deliveryagent();
                	d.click_allagents();

                    Deliveryagentpage_allagents aa= new Deliveryagentpage_allagents(driver);

                    aa.entervalueinsearch("gayuravi030801@gmail.com");

                    aa.choosingsearchoptions("Search By Id");

                    aa.clicksearch();

                    aa.verifysearchedvalue();
                    System.out.println("Negative search for id");
        }           
            

}
