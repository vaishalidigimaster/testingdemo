package com.sb.pageobject.register.seller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class homepage {

public WebDriver driver;
public homepage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//span[contains(text(),'Create Store')]")
WebElement createstore;

public void press_createstore() {
	
	createstore.click();
}

}
