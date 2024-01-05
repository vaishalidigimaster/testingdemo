package com.sb.pageogbject.products.seller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

 

import com.sb.baseclass.Baseclass;

 

public class productspage_Inventory extends Baseclass {

 

    //driver initialize

     private WebDriver driver;



    //constructor Initialize

    public productspage_Inventory(WebDriver driver) {

         this.driver=driver;

         PageFactory.initElements(driver,this);    

         }

 

    

    

    //capture-inventorytxt

         @FindBy(xpath="//h2[text()='Inventory']")

         private WebElement inventorytxt;


     //click penicon 

     @FindBy(xpath="(//tr/td[6]/a)[1]")

     private WebElement clickpenicon;


     //pen-instock status

     @FindBy(xpath="//select/option[1]")

     private WebElement instockstatus;



     //pen-outofstock status

     @FindBy(xpath="//select/option[2]")

     private WebElement outofstockstatus;


     //pen-quantity

     @FindBy(xpath="(//input[@type='number'])[2]")

     private WebElement quantity;


     //click submit

     @FindBy(xpath="//button[@type='submit']")

     private WebElement submit;


     //click close

     @FindBy(xpath="(//button[@type='reset'])[2]")

     private WebElement close;


     //click x button

     @FindBy(xpath="(//button[@type='button'])[5]")

     private WebElement Xbtn;


     //enter search-sku

     @FindBy(xpath="//input[@type='text']")

     private WebElement searchsku;


     //click search

     @FindBy(xpath="//div/button[@class='btn btn-outline-primary waves-effect']")

     private WebElement search;


     //click bottom navigate

     @FindBy(xpath="//div/nav/ul/li[7]")

     private WebElement bottomarr;


     //click img

     @FindBy(xpath="((//div[@class='avatar me-50'])/a/img)[1]")

     private WebElement clickimg;


     //click home

     @FindBy(xpath="//a[text()='Home']")

     private WebElement home;


     //get message

     @FindBy(xpath ="//h2[@id='swal2-title']")
     private WebElement message;

 
     //click table

     @FindBy(xpath="//div/div[2]/h6")
     private List<WebElement> rows;
     
   //click totalbtn

     @FindBy(xpath="//div[@class='content-body']/div/a[1]")
     private WebElement totalbtn;
     
   //click instockbtn

     @FindBy(xpath="//div[@class='content-body']/div/a[2]")
     private WebElement instockbtn;
     
   //click outofstockbtn

     @FindBy(xpath="//div[@class='content-body']/div/a[3]")
     private WebElement outofstockbtn; 
     
   //click bottom next navigate

     @FindBy(xpath="//div/nav/ul/li[last()]/a")

     private WebElement bottomarrnext;
     
      //click inventory-total

     public void clicktotal() {
     ((JavascriptExecutor) driver).executeScript("arguments[0].click();",totalbtn);

     }
  

     
     public void gettablecount() throws InterruptedException {
    	 
    	 int totalSize = 0;
    	 
    	 int totalpages = driver.findElements(By.xpath("//li/a[@class='page-link']")).size(); 
    	for(int i=0; i<totalpages-1;i++) {
    		totalSize +=rows.size();
    		
    		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
    		Thread.sleep(1000);
            // Check if there's a next page
            WebElement nextPageButton = driver.findElement(By.xpath("//a[@rel='next']")); 
            if (!nextPageButton.getAttribute("class").contains("disabled")) {
         	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();",nextPageButton);
          	Thread.sleep(1000);
            } 
           else 
           {
           	break;
            }
           
    	}
    	 
    
  int   totalpagecontent=totalSize + rows.size();

         System.out.println("Total products: " + totalpagecontent);
         

     }

     
     
     //click inventory-Instock

     public void clickinstock() {

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",instockbtn);

     }


     //click inventory-Outofstock

     public void clickoutofstock() {


            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",outofstockbtn);

     }


     //click penicon

     public void penicon() {

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",clickpenicon);

     }


     //pen-instock

     public void instockstatus() {

         instockstatus.click();


     }


     public void outofstockstatus() {

         outofstockstatus.click();

     }


     public void quantity(String num) {

         quantity.clear();

         quantity.sendKeys(num);

     }

     public void submit() {

         submit.click();

     }

     public void close() {

         close.click();

     }

     public void Xbtn() {

         Xbtn.click();

     }

     public void searchsku(String text) {

         searchsku.clear();

         searchsku.sendKeys(text);

     }

     public void clicksearch() {

         search.click();

     }

     public void bottomarrow() {

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",bottomarr);

     }

     public void clickimg() {

         clickimg.click();

     }

     public void clickhome() {

         home.click();

     }




     public void getmessage() {

     System.out.println(message.getText());

}


     public void outofstockerrormsg() {

     System.out.println(outofstockstatus.getAttribute("validationMessage"));

 

       }


     public void quantityerrormsg() {

         System.out.println(quantity.getAttribute("validationMessage"));

 

           }


     public void searcherrormsg() {

         System.out.println(searchsku.getAttribute("validationMessage"));

 

           }

  

     public void bottomarrownxt() {

    	((JavascriptExecutor) driver).executeScript("arguments[0].click();",bottomarrnext);
    	 // Actions a = new Actions(driver);
    	  
    	  //a.moveToElement(bottomarrnext).click().perform();
                 System.out.println(driver.getCurrentUrl());
      

          }
     
     

          public void bottomarrowprev() {


           //  Actions a = new Actions(driver);

              WebElement bottomarrprev = driver.findElement(By.xpath("//div/nav/ul/li[1]/a"));
       // a.moveToElement(bottomarrprev).click().perform();
     ((JavascriptExecutor) driver).executeScript("arguments[0].click();",bottomarrprev);

      System.out.println(driver.getCurrentUrl());

          }

     public void getproductdetailspagetxt() {

              WebElement productdetailspge = driver.findElement(By.xpath("//div/h4[contains(text(),'Product Detail')]"));

              System.out.println(productdetailspge.getText());

          }

          
    
     }

 
