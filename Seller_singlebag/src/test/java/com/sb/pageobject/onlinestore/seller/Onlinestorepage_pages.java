package com.sb.pageobject.onlinestore.seller;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

 

import com.sb.baseclass.Baseclass;

 

public class Onlinestorepage_pages extends Baseclass {

 

    // driver initialize
    private WebDriver driver;

 

    // create constructor
    public Onlinestorepage_pages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

 

    // capture pagestxt

 

    @FindBy(xpath = "//div/h2[text()='Pages']")
    private WebElement pagetxt;

 

    // create page
    @FindBy(xpath = "//div/a[@data-bs-target='#addplan']/span")
    private WebElement pagecreate;

 

    // create-page title
    @FindBy(xpath = "//input[@type='text']")
    private WebElement title;

 

    // create-page description
    @FindBy(xpath = "//textarea[@class='form-control ']")
    private WebElement description;

 

    // create-save
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement save;

 

    // create-discard
    @FindBy(xpath = "(//button[@type='reset'])[2]")
    private WebElement discard;

 

    // edit-title
    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement edit_title;

 

    // edit-slug
    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement edit_slug;

 

    // edit-description
    @FindBy(xpath = "//textarea[@class='form-control ']")
    private WebElement edit_description;

 

    // edit-save
    @FindBy(xpath = "//button[text()=' Save Changes']")
    private WebElement edit_save;

 

    // click edit-pages
    @FindBy(xpath = "//a[text()='Pages']")
    private WebElement edit_Pages;

 

    // titlemessage
    @FindBy(xpath = "//h2[@id='swal2-title']")
    private WebElement message;

    //edittitlemsg
    @FindBy(xpath="//div[@class='alert alert-success']")
    private WebElement edittitlemsg;

 

    // pass create-content
    @FindBy(xpath = "//body[@contenteditable='true']")
    private WebElement content;

 

    // pass edit-content
    @FindBy(xpath = "//body[@contenteditable='true']")
    private WebElement edit_content;

 

    // Methods

 

    public void capturepagetxt() {
        System.out.println(pagetxt.getText());
    }

 

    public void clickcreate() {
        pagecreate.click();
    }

 

    public void pagetitle(String pagetitle) {
        title.clear();
        title.sendKeys(pagetitle);
    }

 

    public void pagedescription(String pagedescription) {
        description.clear();
        description.sendKeys(pagedescription);
    }

 

    // create-content
    public void pagecontent(String pagecontent) {

 

        switchframe(driver);
        content.sendKeys(pagecontent);
        endframe(driver);

 

    }

 

    
 

    public void clicksave() {
        // save.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", save);

 

    }

 

//    //gettitlemessage
//    public void gettitlemessage() {
//
//        System.out.println(message.getText());
//
//      }

 

//    //errormessage
//    public void fileerror(String fileInput) {     
//
//        System.out.println("file not entered. "+fileInput+".getAttribute("validationMessage"));
//
//        }

 

    public void clickdiscard() {
        discard.click();
    }

 

    // click edit
    public void clickedit(String text) {
        WebElement editoption = driver.findElement(By.xpath("//td[contains(text(),'" + text + "')]//div//a[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",editoption);
    }

 

    public void edittitle(String edittitle) {
        edit_title.clear();
        edit_title.sendKeys(edittitle);
    }

 

    public void editslug(String editslug) {
        edit_slug.clear();
        edit_slug.sendKeys(editslug);
    }

 

    public void editdescription(String editdescription) {
        edit_description.clear();
        edit_description.sendKeys(editdescription);
    }

 

//        public void editcontent(String editcontent) {
//            edit_content.clear();
//            edit_content.sendKeys(editcontent);
//        }

 

    public void clicksavechanges() {
        //edit_save.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",edit_save);

 

    }

 

    // show
    public void clickshow(String show) {
        WebElement showoption = driver.findElement(By.xpath("//td[contains(text(),'" + show + "')]/div/a[2]"));
        showoption.click();
        System.out.println(driver.getCurrentUrl());

 

    }

 

    // click top navigate arrow
    public void clicktoparrow() {
        WebElement toparrow = driver.findElement(By.xpath("(//div/nav/ul/li/a[@rel='next'])[2]"));
        toparrow.click();
        //Assert.assertTrue(true);
    }

 

    // click bottom navigate arrow
    public void clickbottomarrow() {
        //Actions a = new Actions(driver);
        WebElement bottomarrow = driver.findElement(By.xpath("(//a[@rel='prev'])[3]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", bottomarrow);

 

        //a.moveToElement(bottomarrow).click().perform();
        //Assert.assertTrue(true);

 

    }

 

    public void clickeditpages() {
        edit_Pages.click();
    }

 

    public void gettitlemessage() {
        System.out.println(message.getText());

 

    }

    public void edittitlemsg() {
        System.out.println(edittitlemsg.getText());
    }

 

    // get title error msg
    public void gettitleerrormsg() {
        System.out.println(title.getAttribute("validationMessage"));
    }

 

    // get description error msg
    public void getdescriptionerrormsg() {
        System.out.println(description.getAttribute("validationMessage"));
    }

 

    // get edit-title errormsg
    public void edittitleerrormsg() {
        System.out.println(edit_title.getAttribute("validationMessage"));
    }

 

    // get edit-slug errormsg
    public void editslugerrormsg() {
        System.out.println(edit_slug.getAttribute("validationMessage"));
    }

 

    // get edit-description errormsg
    public void editdescripitionerrormsg() {
        System.out.println(edit_description.getAttribute("validationMessage"));
    }

 

}

