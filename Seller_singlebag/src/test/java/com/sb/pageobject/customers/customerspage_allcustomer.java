package com.sb.pageobject.customers;

    import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;

import com.sb.baseclass.Baseclass;


    public class customerspage_allcustomer extends Baseclass {

        JavascriptExecutor js=(JavascriptExecutor)driver;

        //Create Customer button
        @FindBy(xpath = "//span[contains(text(),'create')]")
        private WebElement createCustomerButton;

        //search bar
        @FindBy(xpath="//input[@id='src']")
        private WebElement searchbar;

        //search dropdown
        @FindBy(xpath="//select[@class='form-control selectric']")
        private WebElement searchdropdown;

        //search options
        @FindBy(xpath="(//button[@type='submit'])[2]")
        private WebElement searchicon;

        //click search icon
        @FindBy(xpath="//select[@class='form-control selectric']//option")
        private List<WebElement> searchoptions;

        //verify searched value
        @FindBy(xpath="//tbody//tr")
        private List<WebElement> verifysearchvalue;

        //check all box
        @FindBy(xpath = "//input[@class='checkAll']")
        private WebElement checkallbox;

        //customer status
        @FindBy(xpath = "//span[@role='combobox']")
        private WebElement customerStatus;

        //select action 
        @FindBy(xpath = "//select[@name='method']")
        private WebElement selectaction;

 

        //select active active
        @FindBy(xpath = "//option[@value='1']")
        private WebElement active;

        //inactive
        @FindBy(xpath = "//option[@value='0']")
        private WebElement inactive;

 

        //save button
        @FindBy(xpath = "(//button[@type='submit'])[2]")
        private WebElement customerSave;

        //submit button
        @FindBy(xpath = "(//button[@type='submit'])[3]")
        private WebElement submitbtn;

        //getting message
        @FindBy(xpath = "//h2[@class='swal2-title']")
        private WebElement gettingmsg;

        //clicking one customers email ID
        @FindBy(xpath = "//a[contains(text(),'sonagopi10@gmail.com')]")
        private WebElement emailID;

        //verify info page
        @FindBy(xpath = "//li[contains(text(),'Customer Info')]")
        private WebElement infopage;

 

        //edit user

        //edit password
        @FindBy(xpath="//input[@type='password']")
        private WebElement editpass;

        //confirm checkbox
        @FindBy(xpath="(//input[@type='checkbox'])[2]")
        private WebElement clickconfirmcheckbox;

        //edit active field
        @FindBy(xpath = "//span[@class='selection']")
        private WebElement editstatus;

 

        

 

        //click save button
        @FindBy(xpath = "(//button[@type='submit'])[2]")
        private WebElement editSave;

 

        //click customer navigation
        @FindBy(xpath = "//a[contains(text(),'Customers')]")
        private WebElement customerHome2;

        //edit first name
        @FindBy(xpath = "(//input[@type='text'])[1]")
        private WebElement editfirstname;

        //edit last name
        @FindBy(xpath = "(//input[@type='text'])[2]")
        private WebElement editlastname;

 

        //edit email
        @FindBy(xpath = "//input[@type='email']")
        private WebElement editemail;

        //Successful message
        @FindBy(xpath = "//li[contains(text(),'User Created Successfully')]")
        private WebElement customercreated;

         //enter first name
         @FindBy(xpath = "(//input[@type='text'])[1]")
         private WebElement firstname;

 

         //enter last name
         @FindBy(xpath = "(//input[@type='text'])[2]")
         private WebElement lastname;

 

         //enter email
         @FindBy(xpath = "//input[@type='email']")
         private WebElement email;

 

         //enter password
         @FindBy(xpath = "//input[@type='password']")
         private WebElement password;

         //Customer Navigation path
         @FindBy(xpath = "//a[contains(text(),'CUSTOMER')]")
         private WebElement customernavigation;

         //all customer page
         @FindBy(xpath = "//h2[contains(text(),'Customers')]")
         private WebElement customerhome;



           public customerspage_allcustomer(WebDriver driver) {
                this.driver = driver;  
                PageFactory.initElements(driver, this);

         }

         //create customer button
         public void clickcreatebtn() {
                createCustomerButton.click();
         }

         //search bar
         public void entervalueinsearch(String Source) {
                searchbar.sendKeys(Source);
         }

         //search dropdown
         public void clicksearchdropdown() {
                searchdropdown.click();
         }

         //choosing search option
         public void choosingsearchoptions(String Value) {

             for(WebElement option1:searchoptions)
                   if(option1.getText().equals(Value)) {
                       option1.click();
                 }
         }

         //click search icon
         public void clicksearch() {
             searchicon.click();
         }

         //click customer status
         public void clickCustomerStatus() {
             customerStatus.click();
         }

 

         //choose active
         public void selectActive() {
             active.click();
         }

 

         //choose inactive
         public void selectInActive() {
             inactive.click();
         }

         public void clickCustomerSave() {
             customerSave.click();
         }

         //click check all box
         public void clickcheckall() {
             checkallbox.click();
         }

         //click one customer checkbox    
         public void clickonecheckbox(String ID) {
             WebElement checkonebox = driver.findElement(By.xpath("(//tr[@id='row208'])/td[1]")); 
             checkonebox.click();
         }




         //click select action
         public void clickselectaction() {
             selectaction.click();
         }

         //click submit button
         public void clicksubmitbtn() {
             js.executeScript("window.scrollTo(0, 500)"); 
             implicitwait();
             submitbtn.click();
         }

         //click one customer email ID
         public void clickoneemail() {
             emailID.click();
         }

         //click action button of one customer
         public void clickonecustomeractionbtn(String rowID) {
             WebElement onecustomeraction = driver.findElement(By.xpath("(//tr[@id='row"+rowID+"'])/td[8]/div/button"));
             onecustomeraction.click();
         }

         //click view user of one customer
         public void clickviewuser(String ID) {
             WebElement viewUser = driver.findElement(By.xpath("(//tr[@id='row"+ID+"'])/td[8]/div/div/a[2]"));
             viewUser.click();
         }    

         //click view user of one customer
         public void clickedituser(String ID) {
             WebElement edituser = driver.findElement(By.xpath("(//tr[@id='row"+ID+"'])/td[8]/div/div/a[1]"));
             edituser.click();
         }

         //Edit password
         public void changepassword(String newpass) {
             editpass.sendKeys(newpass);
         }

         //Edit password
         public void clickconfirmchkbox() {
        	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();",clickconfirmcheckbox);
             
         }

         
         
       				         

		 //edit to inactive
			 @FindBy(xpath = "//li[@role='option']")
		 private List<WebElement> editstatusoptions;

	 
		
         
         
         //Click edit status
        public void clickEditstatus() {
        	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editstatus);
           
        }
 

        //click inactive status
        public void clickEditstatusoption(String status) {
            for(WebElement option:editstatusoptions)
                   if(option.getText().equals(status)) {
                      option.click();
                }
        }

 

         //click save
         public void clickEditSave() {
             js.executeScript("arguments[0].click()", editSave);
         }

 

         //scroll to top
         public void scrollToTop() {
             js.executeScript("window.scrollTo(0, -1000)");
         }

 

         //click customer breadcrumbs navigation
         public void clickCustomerHome2() {
             js.executeScript("arguments[0].click()", customerHome2);
         }

         //edit first name field
         public void editfirstnamefield(String firstname) {
             editfirstname.clear();
             editfirstname.sendKeys(firstname);
         }

         //edit last name field
         public void editlastnamefield(String lastname) {
             editlastname.clear();
             editlastname.sendKeys(lastname);
         }

         //edit email
         public void editemailfield(String email) {
             editemail.clear();
             editemail.sendKeys(email);
         }


         //enter first name
         public void enterfirstname(String name) {
             firstname.sendKeys(name);
         }

         //get verification message for first name
         public void firstnameerror() {     
         System.out.println("User Not Created. "+firstname.getAttribute("validationMessage"));
         }

         //get verification message for second name
         public void lastnameerror() {     
         System.out.println("User Not Created. "+lastname.getAttribute("validationMessage"));
         }

         //get verification message for email
         public void emailerror() {     
         System.out.println("User Not Created. "+email.getAttribute("validationMessage"));
         }

         //get verification message for password
         public void passworderror() {     
         System.out.println("User Not Created. "+editpass.getAttribute("validationMessage"));
         }

         //enter last name
         public void enterlastname(String name) {
             lastname.sendKeys(name);
         }

         //enter last name
         public void enteremail(String emailID) {
             email.sendKeys(emailID);
         }

         //enter last name
         public void clickcustomernavigation() {
             customernavigation.click();
         }

         //enter last name
         public void isallcustomerpage() {

             if(customerhome.isDisplayed()) {
                 System.out.println("Redirects to All customer page");
             }
             else {
                 System.out.println("Not redirects to all customer page.");
             }
         }

       //Successfully created customer message

         public void successfulmessage() {
             if(customercreated.isDisplayed()) {
                 System.out.println("User Created Successfully");
             }
             else {
                 System.out.println("User Not created");
             }
         }


         //verify customer info page
         public void isinfopage() {
             boolean displayed = infopage.isDisplayed();

             if(displayed==true){

                 System.out.println("Customers info page is displayed");
             }
             else {
                 System.out.println("Customer info page is not displayed");
             }
         } 

         //getting message
         public void getmessage() { 
         String message=gettingmsg.getText();
            System.out.println(message);
         }

         //verify searched option
         public void verifysearchedvalue() {
           int size = verifysearchvalue.size();
           System.out.println("Size of the result: " + size);  

           for (int i = 0; i < size; i++) {
              String resultText = verifysearchvalue.get(i).getText(); 
               System.out.println(resultText);
           }

    }}