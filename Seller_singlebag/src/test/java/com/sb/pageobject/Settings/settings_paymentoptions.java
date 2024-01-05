package com.sb.pageobject.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class settings_paymentoptions {
	//driver initialize

    private WebDriver driver ;

   //create constructor

    public settings_paymentoptions(WebDriver driver) {
    	

                  this.driver=driver;

                  PageFactory.initElements(driver, this);

                  }
    
    //click settingstab
    @FindBy(xpath="(//span[@class='menu-title text-truncate'])[8]")
    private WebElement settings;
    
    //click paymentoptionstab
    @FindBy(xpath="(//span[@class='menu-item text-truncate'])[8]")
    private WebElement paymentoptions;
    
    //capture paymentoptiontxt
    @FindBy(xpath="//h2[text()='Payment Options']")
    private WebElement paymentoptiontxt;
    
    //capture CODtxt
    @FindBy(xpath="//h6[text()='COD']")
    private WebElement codtxt;
    
    
    //click COD-connected
    @FindBy(xpath="(//button[@type='submit'])[2]")
    private WebElement codconnected;
    
    //capture codmethod
    @FindBy(xpath="//h2[text()='COD Method']")
    private WebElement codmethodtxt;
    
    //click cod-name
    @FindBy(xpath="//input[@type='text']")
    private WebElement codname;
    
    //click cod-additional details
    @FindBy(xpath="//textarea[@name='additional_details']")
    private WebElement codadditionaldetails;
    
    //click cod-enable
    @FindBy(xpath="(//input[@type='checkbox'])[2]")
    private WebElement codenableoption;
    
    //click cod-save
    @FindBy(xpath="(//button[@type='submit'])[2]")
    private WebElement codsave;
    
    //click cod-methodcancel
    @FindBy(xpath="//a[text()='Method Cancel']")
    private WebElement codmethodcancel;
    
    //click cod-paymentoptions
    @FindBy(xpath="//a[text()='Payment Options']")
    private WebElement codpaymentoptions;
    
    //capture razorpaytxt
    @FindBy(xpath="//h6[text()='RAZORPAY']")
    private WebElement razorpaytxt;
    
    //click razorpay-connected
    @FindBy(xpath="//button[@data-id='razorpay']")
    private WebElement razorpayconnected;
    
    //capture razorpaymethodtxt
    @FindBy(xpath="//h2[text()='Razorpay Method']")
    private WebElement razorpaymethodtxt;
    
    //click razorpay-name
    @FindBy(xpath="(//input[@type='text'])[1]")
    private WebElement razorpayname;
    
    //click razorpay-key_id
    @FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement razorpaykey_id;
    
    //click razorpay-secretkey
    @FindBy(xpath="(//input[@type='text'])[3]")
    private WebElement razorpaysecretkey;
    
    //click razorpay-purpose
    @FindBy(xpath="(//input[@type='text'])[4]")
    private WebElement razorpaypurpose;
    
    //click razorpay-enable
    @FindBy(xpath="(//input[@type='checkbox'])[2]")
    private WebElement razorpayenable;
    //click razorpay-save
    @FindBy(xpath="(//button[@type='submit'])[2]")
    private WebElement razorpaysave;
    
    //click razorpay-cancel
    @FindBy(xpath="//a[text()='Cancel']")
    private WebElement razorpaycancel;
    
    //click razorpay-paymentoptions
    @FindBy(xpath="//a[text()='Payment Options']")
    private WebElement razorpaypaymentoptions;
    
    
    
    //methods-cod
    public void click_settings() {
    settings.click();
    }
    
    public void click_paymentoptions() {
    	paymentoptions.click();
    }
    public void capturepaymentoptions() {
    	System.out.println(paymentoptiontxt.getText());
    }
    public void capturecod() {
    	System.out.println(codtxt.getText());
    }
    public void click_codconnected() {
    	codconnected.click();
    }
    //click-razorpay
    public void click_anypayment(String pay) {

    	Actions a = new  Actions(driver);
    	WebElement payment = driver.findElement(By.xpath("//button[@data-id='razorpay']"));
    	a.moveToElement(payment).click().perform();
    	
    	
    }
    public void capturecodmethod() {
    	System.out.println(codmethodtxt.getText());
    }
    public void cod_name(String name) {
    	codname.clear();
    	codname.sendKeys(name);
    }
    public void cod_additionaldetails(String details) {
    	codadditionaldetails.clear();
    	codadditionaldetails.sendKeys(details);
    	
    }
    public void cod_enable() {
    	codenableoption.click();
    }
    public void cod_save() {
    	codsave.click();
    }
    public void cod_cancelmethod() {
    	codmethodcancel.click();
    }
    public void cod_paymentoptions() {
    	paymentoptions.click();
    }
    //methods-razorpay
    public void capturerazorpay() {
    	System.out.println(razorpaytxt.getText());
    }
    
    public void capture_razorpaymethodtxt() {
    	System.out.println(razorpaymethodtxt.getText());
    }
    public void razorpay_name(String name) {
    	razorpayname.clear();
    	razorpayname.sendKeys(name);
    	
    }
    public void razorpay_keyid(String id) {
    	razorpaykey_id.clear();
    	razorpaykey_id.sendKeys(id);
    }
    public void razorpay_secretkey(String keyname) {
    	razorpaysecretkey.clear();
    	razorpaysecretkey.sendKeys(keyname);
    }
    public void razorpay_purpose(String purpose) {
    	razorpaypurpose.clear();
    	razorpaypurpose.sendKeys(purpose);
    }
    public void razorpay_enable() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",razorpayenable);
    	//razorpayenable.click();
    }
    public void razorpay_save() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",razorpaysave);
    	//razorpaysave.click();
    	
    }
    public void razorpay_cancel() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",razorpaycancel);
    }
    

}
