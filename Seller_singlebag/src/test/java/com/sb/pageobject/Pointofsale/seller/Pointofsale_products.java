package com.sb.pageobject.Pointofsale.seller;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Pointofsale_products {



	// driver initialize
	public WebDriver driver;



	// create constructor
	public Pointofsale_products(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	// home link in header
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement homelink;



	// Singlebag link in footer
	@FindBy(xpath = "//a[contains(text(),'Singlebag')]")
	private WebElement singlebaglink;



	// verify home page
	@FindBy(xpath = "//h2[contains(text(),'Dashboard')]")
	private WebElement dashboardtxt;



	// edit product page
	@FindBy(xpath = "//h2[contains(text(),'Edit Product')]")
	private WebElement editpage;



	// click home link in header
	public void clickhome() {
		homelink.click();
	}



	// Singlebag link in footer
	public void clicksinglebag() {
		singlebaglink.click();
	}



	// verify home page
	public void ishomepage() {
		if (dashboardtxt.isDisplayed()) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is not displayed");
		}
	}



	// verify Singlebag home page
	public void issinglebagweb() {
		if (driver.getCurrentUrl().equals("https://singlebag.com/")) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is not displayed");
		}
	}



	// verify edit product page
	public void iseditpage() {
		if (editpage.isDisplayed()) {
			System.out.println("Edit page is displayed");
		} else {
			System.out.println("Edit page is not displayed");
		}
	}



	// click separate image
	public void clickoneimage(String imgname) {
		WebElement imagename = driver.findElement(By.xpath("//div//h6[contains(text(),'" + imgname + "')]"));
		  ((JavascriptExecutor) driver).executeScript("arguments[0].click();",imagename);
	}



}
