package com.sb.pageobject.brands;
import java.awt.AWTException;
import java.util.List;

 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sb.baseclass.Baseclass;

 



 

public class Products_Brands extends Baseclass {

 
	//driver initialize
		private WebDriver driver;

 

    // Create brand button
    @FindBy(xpath = "//span[contains(text(),'+create')]")
    private WebElement createBrandBtn;

 

    // Brand Name
    @FindBy(xpath = "//input[@type='text']")
    private WebElement brandNameInput;

 

    // Brand feature
    @FindBy(xpath = "(//span[@role='combobox'])[1]")
    private WebElement brandFeatureDropdown;

 

    // Brand image
    @FindBy(xpath = "//input[@type='file']")
    private WebElement brandimage;

 

    // Brand Status
    @FindBy(xpath = "(//span[@role='combobox'])[2]")
    private WebElement brandstatus;

 

    // Meta title
    @FindBy(xpath = "//input[@name='title']")
    private WebElement metatitle;

 

    // Meta description
    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement metadescription;

 

    // Meta keyword
    @FindBy(xpath = "//input[@name='keywords']")
    private WebElement metakeyword;

 

    // save
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement newbrandsave;

 

    // Brand home link in create page
    @FindBy(xpath = "(//a[contains(text(),'Brand')])[2]")
    private WebElement brandindexlink;

 

    // Brand index page
    @FindBy(xpath = "//h2[contains(text(),'Brands')]")
    private WebElement brandindexpage;

 

    // search bar
    @FindBy(xpath = "//input[@id='src']")
    private WebElement searchbar;

 

    // search dropdown
    @FindBy(xpath = "//select[@class='form-control selectric']")
    private WebElement searchdropdown;

 

    // search options
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement searchicon;

 

    // click search icon
    @FindBy(xpath = "//select[@class='form-control selectric']//option")
    private List<WebElement> searchoptions;

 

    // verify searched value
    @FindBy(xpath = "//tbody//tr")
    private List<WebElement> verifysearchvalue;

 

    // check all box
    @FindBy(xpath = "//input[@class='checkAll']")
    private WebElement checkallbox;

 

 

    // select action
    @FindBy(xpath = "//select[@name='method']")
    private WebElement selectaction;

 

    // select active active
    @FindBy(xpath = "//option[@value='1']")
    private WebElement active;

 

    // inactive
    @FindBy(xpath = "//option[@value='0']")
    private WebElement inactive;

 

    // Delete
    @FindBy(xpath = "//option[@value='5']")
    private WebElement delete;

 

    // save button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement brandSave;

 

    // getting message
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement gettingmsg;

 

    // click customer navigation
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;

 

    // Home page
    @FindBy(xpath = "//h2[contains(text(),'Dashboard')]")
    private WebElement homepage;

 

    // Home page
    @FindBy(xpath = "//a[contains(text(),'Singlebag')]")
    private WebElement singlebag;

 

    // Constructor
    public Products_Brands(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

 

    // Create Brand button
    public void clickCreateBrandButton() {
        createBrandBtn.click();
    }

 

    // Click brand link in create brand page
    public void clickbrandlink() {
        brandindexlink.click();
    }

 

    // Create Brand button
    public void clicksinglebag() {
    	((JavascriptExecutor)driver).executeScript("arguments[0].click()", singlebag);

 

        // New Window
        java.util.Set<String> allwindows = driver.getWindowHandles();

 

        String oldwindow = driver.getWindowHandle();

 

        for (String windowHandle : allwindows) {
            driver.switchTo().window(windowHandle);
            if (windowHandle.equals(oldwindow)) {
                driver.switchTo().window(windowHandle);
            }
        }
    }

 

    // brand name
    public void enterBrandName(String name) {
        brandNameInput.sendKeys(name);
    }

 

    // Brand name verification
    public void getnameerror() {
        System.out.println(brandNameInput.getAttribute("validationMessage"));
    }

 

    // Meta title
    public void entermetatitle(String name) {
        metatitle.sendKeys(name);
    }

 

    // meta description
    public void entermetakeyword(String descri) {
        metadescription.sendKeys(descri);
    }

 

    // meta keyword
    public void entermetadescription(String keyword) {
        metakeyword.sendKeys(keyword);
    }

 

    // feature
    public void clickBrandFeatureDropdown() {
        brandFeatureDropdown.click();
    }

 

    // new brands save
    public void clicknewbrandsave() {
        newbrandsave.click();
    }

 

    // new brands save
    public void clicknewbrandstatus() {
    	brandstatus.click();
    }

 

    // feature option
    public void selectFeatureOption(String option) {
        WebElement featureoptions = driver.findElement(By.xpath("//li[contains(text(),'" + option + "')]"));
        featureoptions.click();
    }

 

    // choose brand status
    public void choosestatus(String option) {
        WebElement statusoptions = driver.findElement(By.xpath("//li[contains(text(),'" + option + "')]"));
        statusoptions.click();

 

    }
 

    // click select action
    public void clickselectaction() {
        selectaction.click();
    }

 

    // choose active
    public void selectActive() {
        active.click();
    }

 

    // choose inactive
    public void selectInActive() {
        inactive.click();
    }

 

    // choose inactive
    public void selectdelete() {
        delete.click();
    }

 

    // click check all box
    public void clickcheckall() {
        checkallbox.click();
    }

 

    // search bar
    public void entervalueinsearch(String Source) {
        searchbar.sendKeys(Source);
    }

 

    // search dropdown
    public void clicksearchdropdown() {
        searchdropdown.click();
    }

 

    // choosing search option
    public void choosingsearchoptions(String Value) {
        for (WebElement option1 : searchoptions)
            if (option1.getText().equals(Value)) {
                option1.click();
            }
    }

 

    // click search icon
    public void clicksearch() {
        searchicon.click();
    }

 

    public void clickbrandSave() {
        brandSave.click();
    }

 

    // clicking home
    public void clickhome() {
        home.click();
    }

 

    // getting message
    public void getmessage() {
        String message = gettingmsg.getText();
        System.out.println(message);
    }

 

    // get verification message for first name
    public void getsearcherror() {
        System.out.println(searchbar.getAttribute("validationMessage"));
    }

 

    // click one brand checkbox
    public void clickonecheckbox(String Name) {
        WebElement checkonebox = driver.findElement(By.xpath("//h6[contains(text(),'"+Name+"')]/ancestor::td/preceding-sibling::td/input"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", checkonebox);
    }

 

    // click next page number in header
    public void clickheadernextpage(String no) {
        WebElement nextpage = driver.findElement(
                By.xpath("//div[@class='d-flex flex-row justify-content-end']//a[contains(text(),'" + no + "')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", nextpage);
    }

 

    // click next page number in footer
    public void clickfooternextpage(String no) {
        WebElement nextpage = driver.findElement(By.xpath(
                "(//div[@class='d-flex flex-row justify-content-end mt-2']//a[contains(text(),'" + no + "')])[2]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", nextpage);
    }

 

    // click next page arrow mark in header
    public void clickheadernextpagearrow(String Arrow) {
        WebElement nextpagearrow = driver
                .findElement(By.xpath("//div[@class='d-flex flex-row justify-content-end']//a[@rel='" + Arrow + "']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", nextpagearrow);
    }

 

    // verify next page
    public void isnextpage(String no) {
        if (driver.getCurrentUrl().equals("https://instamart.pay380.com/seller/brand?page=" + no + "")) {
            System.out.println("Redirects to that page");
        } else {
            System.out.println("Not redirects to that page");
        }
    }

 

    // verify searched option
    public void verifysearchedvalue() {
        int size = verifysearchvalue.size();
        System.out.println("Size of the result: " + size);

 

        for (int i = 0; i < size; i++) {
            String resultText = verifysearchvalue.get(i).getText();
            System.out.println(resultText);
        }

 

    }

 

    // home page
    public void ishomepage() {
        if (homepage.isDisplayed()) {
            System.out.println("Redirects to home page");
        } else {
            System.out.println("Not redirects home page.");
        }
    }

 

    // Brand index page verification
    public void isbrandindexpage() {
        if (brandindexpage.isDisplayed()) {
            System.out.println("Redirects to index page");
        } else {
            System.out.println("Not redirects index page.");
        }
    }

 

    // home page
    public void issinglebagwebsite() {

 

        if (driver.getCurrentUrl().equals("https://singlebag.com/")) {
            System.out.println("Redirects to Singlebag home page");
        } else {
            System.out.println("Not redirects to singlebag home page");
        }
    }

 

    // choosing image for brand
    public void brandimg(String imagepath) throws AWTException, InterruptedException {
        Actions a = new Actions(driver);
        // Upload image
        a.moveToElement(brandimage).click().perform();
        uploadfile(imagepath);
    }

 

    // click edit button of one brand
    public void clickonebrandactionbtn(String name) {
        WebElement onebrandaction = driver
                .findElement(By.xpath("//h6[contains(text(),'"+ name +"')]/ancestor::td/following-sibling::td[4]/a"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", onebrandaction);

    }

 

    // click show button of one brand
    public void clickonebrandshowbtn(String name) {
        WebElement onebrandaction = driver.findElement(
                By.xpath("//h6[contains(text(),'"+name+"')]/ancestor::td/following-sibling::td[4]/a[2]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", onebrandaction);

 

    }

 

    // verify brand storefront

 

    public void isstorefront(String name) {

 

        if (driver.getCurrentUrl().contains("https://instamart.pay380.com/brand/"+name+"")){
            System.out.println("Redirects to storefront brand page");
        } else {
            System.out.println("Not redirects to storefront brand page");
        }

    }
}

