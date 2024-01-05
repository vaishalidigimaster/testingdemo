package com.sb.pageogbject.products.seller;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sb.baseclass.Baseclass;


public class Productspage_allproducts  extends Baseclass{
	private WebDriver driver;
	
	 public Productspage_allproducts(WebDriver driver) {
	        this.driver = driver;  
	        PageFactory.initElements(driver, this);

	    }
	 
	 
	           // allcheckbox
				@FindBy(xpath ="//input[@class='checkAll']")
				private WebElement checkall;
	 
				// select action
				@FindBy(xpath ="//select[@class='form-select']")
				private WebElement selectaction;
	 
				// action submit
				@FindBy(xpath ="(//button[@type='submit'])[2]")
				private WebElement actionsubmit;
	 
	 
				// publish
				@FindBy(xpath ="//div[@class='col-12']/a[1]")
				private WebElement publish;
	 
				// draft
				@FindBy(xpath ="//div[@class='col-12']/a[2]")
				private WebElement draft;
	 
				// incomplete
				@FindBy(xpath ="//div[@class='col-12']/a[3]")
				private WebElement incomplete;
	 
				// trash
				@FindBy(xpath ="//div[@class='col-12']/a[4]")
				private WebElement trash;
				
				
				 public void clickcheckall() {
					 checkall.click();
   				}  
				
				
				 public void selectactions(String action) {
					 selectaction.click();
					 Select s= new Select(selectaction);
				s.selectByVisibleText(action);
   				} 
				
				 public void clicksubmit() {
					 actionsubmit.click();
   				}
				
				
				 public void clickpublish() {
					 publish.click();
   				}
	 
				 public void clickdraft() {
					 draft.click();
   				}
	 
				 public void clickincomplete() {
					 incomplete.click();
   				}
				 
				 public void clicktrash() {
					 trash.click();
   				}
				 
				 
				 
				 
				 public void publishtxt() {

              	   System.out.println(publish.getText());

                 }

                 

                 public void drafttxt() {

              	   System.out.println(draft.getText());

                 }

                 

                 public void trashtxt() {

              	   System.out.println(trash.getText());

                 }

                  

                 public void incompletetxt() {

              	   System.out.println(incomplete.getText());

                 }	 
				 
		
				 
				 
	// message on right top
			@FindBy(xpath ="//h2[@id='swal2-title']")
			private WebElement message;
	
// click create product
		@FindBy(xpath = "//i[@class='ph-plus-bold']")
	    private WebElement createproducts;

		public void clickcreateproducts() {
			createproducts.click();
			}
	 
		// enter product title
				@FindBy(xpath = "(//input[@name='title'])[1]")
			    private WebElement producttitle;
	 
				public void enterproducttitle(String title) {
					producttitle.clear();
					producttitle.sendKeys(title);
					}
				
				//enter short description
				@FindBy(xpath = "(//textarea[@name='short_description'])")
			    private WebElement shortdescription;
				
				public void entershortdescription(String title) {
					shortdescription.clear();
					shortdescription.sendKeys(title);
					}
				
				//+add category
				@FindBy(xpath = "(//a[@class='float-end'])[1]")
			    private WebElement addcategory;
				
				public void clickaddcategory() {
					addcategory.click();
					}
				
				
				//+add brand
				@FindBy(xpath = "(//a[@class='float-end'])[2]")
			    private WebElement addbrand;
				
				public void clickaddbrand() {
					addbrand.click();
					}
				
				//enter compare price
				@FindBy(xpath = "//input[@id='compare_price']")
			    private WebElement compareprice;
				
				public void entercompareprice(String price) {
					compareprice.clear();
					compareprice.sendKeys(price);
					}
				
				
				//enter compare price
				@FindBy(xpath = "//input[@id='selling_price']")
			    private WebElement sellingprice;
				
				public void entersellingprice(String price) {
					sellingprice.clear();
					sellingprice.sendKeys(price);
					}
				
				
				//enter offer price
				@FindBy(xpath = "//input[@id='offer_price']")
			    private WebElement offerprice;
				
				public void enterofferprice(String price) {
					offerprice.clear();
					offerprice.sendKeys(price);
					}
				
				@FindBy(xpath  ="(//input[@class='numInput cur-year'])[1]")
				private WebElement startingyear;
				
				@FindBy(xpath  ="(//input[@class='numInput cur-year'])[2]")
				private WebElement endyear;
				
				@FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[1]")
				private WebElement startingmonth;
				
				
				@FindBy(xpath  ="(//select[@class='flatpickr-monthDropdown-months'])[2]")
				private WebElement endmonth;
				
				
				
				//enter offer price start
				@FindBy(xpath = "//input[@id='special_price_start']")
			    private WebElement offerpricestart;
				
				public  void offerstarting_date(String year, String month, String date) {
					offerpricestart.click();
			        // Select the desired year
		                startingyear.clear();
		                startingyear.sendKeys(year);

			        // Select the desired month
			        startingmonth.click();
			      //  wait_for_visibilty(By.xpath("//option[text()='" + month + "']"));
			        WebElement monthOption = driver.findElement(By.xpath("(//option[text()='" + month + "'])[1]"));
			        monthOption.click();
		            //   wait_for_visibilty(By.xpath("//option[text()='" + date + "']"));
			        // Select the desired date
			        WebElement dateCell = driver.findElement(By.xpath("(//span[text()='" + date + "'])[1]"));
			        dateCell.click();

			    }
			
			public  void offerending_date(String year, String month, String date) {
				offerpriceend.click();
		     // Select the desired year
		         endyear.clear();
		         endyear.sendKeys(year);

		     // Select the desired month
		     endmonth.click();
		     //wait_for_visibilty(By.xpath("(//option[text()='" + month + "'])[2]"));
		     WebElement monthOption1 = driver.findElement(By.xpath("(//option[text()='" + month + "'])[2]"));
		     monthOption1.click();
		     //wait_for_visibilty(By.xpath("//option[text()='" + date + "']"));
		     // Select the desired date
		     WebElement date2 = driver.findElement(By.xpath("(//span[text()='" + date + "'])[4]"));
		     date2.click();

		    }
				
				
				//enter offer price end
				@FindBy(xpath = "//input[@id='special_price_end']")
			    private WebElement offerpriceend;
				
				//enter sku
				@FindBy(xpath = "//input[@name='sku']")
			    private WebElement SKU;
				
				public void enterSKU(String sku) {
					Actions a= new Actions(driver);
				a.moveToElement(SKU).click().build().perform();
				SKU.clear();
					SKU.sendKeys(sku);
					}
				
				
				
				//stock status
				@FindBy(xpath = "//input[@name='stock_status']")
			    private WebElement stockstatus;
				
				public void stocksttustog() {
					stockstatus.click();
					}
				
				//enter Manage stock
				@FindBy(xpath = "//input[@name='manage_stock']")
			    private WebElement managestock;
				
				public void managestocktog() {
					managestock.click();
					}
				
				
				//enter stack quatity
				@FindBy(xpath = "//input[@id='qty']")
			    private WebElement stackquatity;
				
				public void enterstackquatity(String qty) {
					stackquatity.clear();
					stackquatity.sendKeys(qty);
					}
				
				//click save
				@FindBy(xpath = "//button[@id='submit_btn']")
			    private WebElement save;
				
				public void clicksave() {
					save.click();
					}
				
				
// varvarient selection
				
				//click varienttoggle
				@FindBy(xpath = "//input[@name='variant_manage']")
			    private WebElement varienttoggle;
				

				//click submitvarient
				@FindBy(xpath = "(//button[contains(text(),'Submit')])[2]")
			    private WebElement submitvarient;
				
				
				
				 public void clickvarienttoggle() {
					 varienttoggle.click();
	   				}  
				
				
				 public void selectoption(String option) {
					WebElement optionselect = driver.findElement(By.xpath("//label[contains(text(),'"+option+"')]/preceding-sibling::input"));
					 
					 optionselect.click();
	   				}
				 
				 public void clickvarientsubmit() {
					 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,500)");
					 implicitwait();
					 submitvarient.click();
					 
	   				} 

				
				 
				 
				
//add category
                   
                   
                 //enter name
   				@FindBy(xpath = "(//input[@type='text'])[6]")
   			    private WebElement nameincategory;   
   				
   				
   			 //enter parent category
   				@FindBy(xpath = "(//select[@id='p_id'])")
   			    private WebElement parentcategory;
   				
   			//enter featured
   				@FindBy(xpath = "(//select[@name='featured'])[2]")
   			    private WebElement featuredincategory;
   				
   			//assign to menu
   				@FindBy(xpath = "(//select[@name='menu_status'])")
   			    private WebElement assigntomenucategory;
   				
   			//select status
   				@FindBy(xpath = "(//select[@name='status'])[2]")
   			    private WebElement statusincategory;
   				
   			//submit
   				@FindBy(xpath = "(//button[@id='submit'])")
   			    private WebElement saveincategory; 
   				
   			//upload thumbnail in category
   				@FindBy(xpath = "(//input[@id='file'])[2]")
   			    private WebElement thumbnailincategory;
                   
                   public void entername_category(String name) {
   					nameincategory.sendKeys(name);
   				}   
				
				
                   public void select_parentcategory(String pc) {
      					parentcategory.click();
      					Select s = new Select(parentcategory);
      					s.selectByVisibleText(pc);
      					System.out.println(s.getFirstSelectedOption().getText());
      				}  
				
                   public void select_featuredincategory(String feature) {
     					featuredincategory.click();
     					Select s = new Select(featuredincategory);
     					s.selectByVisibleText(feature);
     					System.out.println(s.getFirstSelectedOption().getText());
     				}  
                   public void select_assigntomenuincategory(String am) {
     					assigntomenucategory.click();
     					Select s = new Select(assigntomenucategory);
     					s.selectByVisibleText(am);
     					System.out.println(s.getFirstSelectedOption().getText());
     				}
                   
                   public void select_statusincategory(String status) {
    					statusincategory.click();
    					Select s = new Select(statusincategory);
    					s.selectByVisibleText(status);
    					System.out.println(s.getFirstSelectedOption().getText());
    				}    
                   
                   public void thumbnail_incategory(String imagepath) throws AWTException, InterruptedException {
      				 Actions a = new Actions(driver);

      			        // Upload first image
      			        a.moveToElement(thumbnailincategory).click().perform();
      			        
      			        uploadfile(imagepath);
      			    }
                   
                   
                   public void clicksave_incategory() {
      					saveincategory.click();
      				}   
                   
                   
                   
 //add brand
                   
                 //enter name
      				@FindBy(xpath = "(//input[@type='text'])[5]")
      			    private WebElement nameinbrand;            
      			//enter featured
       				@FindBy(xpath = "(//select[@name='featured'])[1]")
       			    private WebElement featuredinbrand;
       			//select status
       				@FindBy(xpath = "(//select[@name='status'])[1]")
       			    private WebElement statusinbrand;
       			//upload thumbnail in category
       				@FindBy(xpath = "(//input[@id='file'])[1]")
       			    private WebElement thumbnailinbrand;
       			//save
       				@FindBy(xpath = "(//button[@type='submit'])[2]")
       			    private WebElement saveinbrand; 
       				
       				
       				
       				public void entername_brand(String name) {
       					nameinbrand.clear();
       					nameinbrand.sendKeys(name);
       				}   
       				
       			 public void select_featuredinbrand(String feature) {
  					featuredinbrand.click();
  					Select s = new Select(featuredinbrand);
  					s.selectByVisibleText(feature);
  					System.out.println(s.getFirstSelectedOption().getText());
  				}  
       				
       				
       			public void select_statusinbrand(String status) {
					statusinbrand.click();
					Select s = new Select(statusinbrand);
					s.selectByVisibleText(status);
					System.out.println(s.getFirstSelectedOption().getText());
				} 	
       				
       				
       			public void thumbnail_inbrand(String imagepath) throws AWTException, InterruptedException {
     				 Actions a = new Actions(driver);

     			        // Upload first image
     			        a.moveToElement(thumbnailinbrand).click().perform();
     			        
     			        uploadfile(imagepath);
     			    }	
       				
       			public void clicksave_inbrand() {
       			 ((JavascriptExecutor) driver).executeScript("arguments[0].click();",saveinbrand);
  				} 
       				
       			public void getmessage() {
	    			  System.out.println(message.getText());
	    		    }
       			
       			
       			
       			
   // pages in edit click button
       	
       		//Basic information
   				@FindBy(xpath = "//a[contains(text(),' Basic Information')]")
   			    private WebElement basicinformationinmenu;
       			
   			//price
   				@FindBy(xpath = "//a[contains(text(),'Price')]")
   			    private WebElement priceinmenu;
       			
   			//Attribute
   				@FindBy(xpath = "//a[contains(text(),'Attribute')]")
   			    private WebElement attributeinmenu;
       			
   			//images
   				@FindBy(xpath = "//a[contains(text(),'Images')]")
   			    private WebElement imagesinmenu;
   				
   			//varient
   				@FindBy(xpath = "//a[contains(text(),'Varient')]")
   			    private WebElement varientinmenu;	
   				
   				
   			//inventory
   				@FindBy(xpath = "//a[contains(text(),'Inventory')]")
   			    private WebElement inventoryinmenu;	
   				
   			//files
   				@FindBy(xpath = "//a[contains(text(),'Files')]")
   			    private WebElement filesinmenu;		
   				
   				
   			//SEO
   				@FindBy(xpath = "//a[contains(text(),'SEO')]")
   			    private WebElement SEOinmenu;	
   				
   				public void clickbasicinformation() {
   					basicinformationinmenu.click();
  				}	
   				public void clickprice() {
   					priceinmenu.click();
  				}
   				public void clickattribute() {
   					attributeinmenu.click();
  				}
   				public void clickimages() {
   					imagesinmenu.click();
  				}
   			
   				public void clickvarient() {
   					varientinmenu.click();
  				}
   				
   				public void clickinventory() {
   					inventoryinmenu.click();
  				}
   				public void clickfiles() {
   					filesinmenu.click();
  				}
   				public void clickSEO() {
   					SEOinmenu.click();
  				}
   				
   				
   				
   				
    //edit
       			
       			
       		//product name
   				@FindBy(xpath = "//input[@name='title']")
   			    private WebElement productname; 	
       			
   			//slug
   				@FindBy(xpath = "//input[@name='slug']")
   			    private WebElement slug;
       			
   			//short description
   				@FindBy(xpath = "//textarea[@name='short_description']")
   			    private WebElement shortdes;	
       			
       		//product content	
   				@FindBy(xpath = "//body[@contenteditable='true']")
   			    private WebElement productcontent;
       			
       			
   			//brand	
   				@FindBy(xpath = "//select[@id='brand-select']")
   			    private WebElement brand;
       				
   				
   			//category
   				@FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
   			    private WebElement category;
   				
   				//categorydropdown
   				@FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
   			    private WebElement categorydropdownvalue;
       				
   				//tax
   				@FindBy(xpath = "//input[@id='tax_amount']")
   			    private WebElement tax;
   				
   			//video provider
   				@FindBy(xpath = "//select[@name='video_provider']")
   			    private WebElement video;
   				
   			//video link
   				@FindBy(xpath = "//input[@name='video_url']")
   			    private WebElement videolink;	
   				
   				//featured
   				@FindBy(xpath = "(//select[@name='featured'])[1]")
   			    private WebElement featured;	
   				
   			//published checkbox
   				@FindBy(xpath = "//input[@name='status']")
   			    private WebElement publishcheckbox;	
   				
   				
   			//storefront toggle
   				@FindBy(xpath = "(//input[@name='enabled'])[1]")
   			    private WebElement storefronttoggle;	
   				
   			//pos toggle
   				@FindBy(xpath = "(//input[@name='enabled'])[2]")
   			    private WebElement postoggle;
   				
   				
   				public void enterproductname(String title) {
   					productname.clear();
   					productname.sendKeys(title);
  				} 
   				
   				public void enterslug(String title) {
   					slug.clear();
   					slug.sendKeys(title);
  				} 
   				
   				
   				public void enterdescription(String title) {
   					
   					
   					shortdes.clear();
   					shortdes.sendKeys(title);
  				} 
   				
   				public void enterproductcontent(String title) {
   					switchframe(driver);
   					productcontent.clear();
   					productcontent.sendKeys(title);
   					endframe(driver);
  				}
   				
   				public void selectbrand(String brand1) {
   					brand.click();
   					Select s = new Select(brand);
   				s.selectByIndex(1);
   					
  				}
   				
   				public void selectcategory(String cat) {
   					category.clear();
   					category.sendKeys(cat);
   					categorydropdownvalue.click();
   					
   					
  				}
   				
   				public void entertax(String tax1) {
   					
   					tax.clear();
   					tax.sendKeys(tax1);
  				}
   				
   				public void selectvideo(String v) {
   					((JavascriptExecutor) driver).executeScript("arguments[0].click();",video);
   					Select s = new Select(video);
   				s.selectByVisibleText(v);
   					
  				}
   				
   				public void entervideolink(String link) {
   					videolink.clear();
   					videolink.sendKeys(link);
  				}
   				
   				
   				public void selectfeatured(String f) {
   					((JavascriptExecutor) driver).executeScript("arguments[0].click();",featured);
   					Select s = new Select(featured);
   				s.selectByVisibleText(f);
   					
  				}
   				
   				public void clickpublished() {
   					((JavascriptExecutor) driver).executeScript("arguments[0].click();",publishcheckbox);
  				}
   				
   				public void clickstorefronttog() {
   					((JavascriptExecutor) driver).executeScript("arguments[0].click();",storefronttoggle);
  				}
   				
   				public void clickpostog() {
   					((JavascriptExecutor) driver).executeScript("arguments[0].click();",postoggle);
  				}
   				
  //Attribute
   				
   				
   			//create value
   				@FindBy(xpath = "(//button[contains(text(),'Create Values')])[1]")
   			    private WebElement createvalue;	
   				
   				//select attribute
   				
   				@FindBy(xpath = "//select[@class='form-control parent_attr']")
   			    private WebElement attribute;
   				
   				//selectvalue
   				@FindBy(xpath = "//select[@name='child[]']")
   			    private WebElement value;
   				
   				//savechanges in attributes
   				
   				@FindBy(xpath = "(//button[@type='submit'])[1]")
   			    private WebElement savechanges;
   				
   				public void clickcreatevalue() {
   					createvalue.click();
  				}
   				
   				public void selectattributeforvalue(String f) {
   					attribute.click();
   					Select s = new Select(attribute);
   				s.selectByVisibleText(f);
   					
  				}
   				
   				public void selectvalue(String f) {
   					value.click();
   					Select s = new Select(value);
   				s.selectByVisibleText(f);
   					
  				}
   				
   				public void clicksavechanges() {
   					savechanges.click();
  				}
   				
  	// images	
   				
   				@FindBy(xpath = "//label[contains(text(),'Upload')]")
   			    private WebElement upload;
   				
   				
   				@FindBy(xpath = "//button[contains(text(),'Drop files here to upload')]")
   			    private WebElement dragfile;
   				
   				public void clickupload(String filepath) throws AWTException, InterruptedException {
   					upload.click();
   					uploadfile(filepath);
  				}
   				
   				public void clickdragfile(String filepath) throws AWTException, InterruptedException {
   					dragfile.click();
   					uploadfile(filepath);
  				}
   				
   				
   				
   // Files		
   				
   				@FindBy(xpath = "//span[contains(text(),'Create File')]")
   			    private WebElement createfile;
   				
   				@FindBy(xpath = "//input[@name='url']")
   			    private WebElement addurl;
   				
   				@FindBy(xpath = "(//button[@type='submit'])[1]")
   			    private WebElement saveurl;
   				
   				public void clickcreatefile() {
   					createfile.click();
  				}
   				
   				public void enterurl(String url) {
   					addurl.clear();
   					addurl.sendKeys(url);
  				}
   				
   				public void clicksaveurl() {
   					saveurl.click();
  				}
   				
   //SEO		
   				
   				@FindBy(xpath = "//span[contains(text(),'Create File')]")
   			    private WebElement metatitle;	
   				
   				@FindBy(xpath = "//span[contains(text(),'Create File')]")
   			    private WebElement metakeyword;
   				
   				@FindBy(xpath = "//span[contains(text(),'Create File')]")
   			    private WebElement metadescription;
   				
   				
   				
   				public void entermetatitle(String title) {
   					metatitle.clear();
   					metatitle.sendKeys(title);
  				}
   				public void entermetakeyword(String key) {
   					metakeyword.clear();
   					metakeyword.sendKeys(key);
  				}
   				
   				public void entermetadescription(String des) {
   					metadescription.clear();
   					metadescription.sendKeys(des);
  				}
   		
   				
   				
   				
   				
  //click home

    		    @FindBy(xpath="//a[text()='Home']")

    		    private WebElement home;

    		    

    		    public void clickhome() {

    		    	home.click();

    		    }

    		    

  //capture dashboardtxt

    		    @FindBy(xpath="//div/h2[text()='Dashboard']")

    		    private WebElement hometxt;

    		    

    		    public void capturedashboardtxt() {

    		    	System.out.println(hometxt.getText());

    		    }

    		    

  //edit-one product

                public void clickedit(String edittxt) {

	               WebElement edit = driver.findElement(By.xpath("(//h6[contains(text(),'"+edittxt+"')])[1]/ancestor::td/following-sibling::td[4]/a[1]"));

                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",edit);



       

   }

   

   //click-one product edit

   

                       public void clickonecheckbox() {
	                     WebElement onecheck = driver.findElement(By.xpath("//tr[2]/td/div/input[@type='checkbox']"));

                                ((JavascriptExecutor) driver).executeScript("arguments[0].click();",onecheck);

                             //(//h6[contains(text(),'1234')])[1]/ancestor::td/following-sibling::td[4]/a[1]

   }

   

   

   //edit-navigate products page

                         @FindBy(xpath="//li/a[text()='Products']")

                         private WebElement products;

   

                        public void clickproducts() {

	                          products.click();

	   

                                 }

                             public void productscapturetxt() {

	                             WebElement producttxt = driver.findElement(By.xpath("//div/h2[text()='Products']"));

	                             System.out.println(producttxt.getText());

                                  }

   

   //click eyeicon

                           public void clickeyeicon(String eyetxt) {

	                        WebElement eye = driver.findElement(By.xpath("(//h6[contains(text(),'"+eyetxt+"')])[1]/ancestor::td/following-sibling::td[4]/a[2]"));

	                           eye.click();

	                          System.out.println(driver.getCurrentUrl());

      

                                   }

   

   //click image

   

                                   @FindBy(xpath="(//div[@class='avatar me-50']/a/img)[1]")

                                   private WebElement image;
        
   

                                    public void clickimg() {

	                                 image.click();

                                      }

   

   //image-navigate editproductdetailpage

                             @FindBy(xpath="//h4[@class='card-header-title']")

                                    private WebElement productdetailtxt;

   

                              public void productdetailpage() {
   
	                           System.out.println(productdetailtxt.getText());

                                                        }

   

  

   
                            //click import

                       	   @FindBy(xpath="//div/a[text()='+Import']")

                       	   private WebElement clickimport;

                       	   

                       	   public void clickimport() {

                       		   clickimport.click();

                       	   }

                       	   

                       	   //import-choose file

                       	   @FindBy(xpath="//input[@type='file']")

                       	   private WebElement choosefile;

                       	   

                       	   public void clickchoosenfile() {

                                  ((JavascriptExecutor) driver).executeScript("arguments[0].click();",choosefile);

                        

                       		  // choosefile.click();

                       	   }

                       	   

                       	   //click X

                       	   @FindBy(xpath="(//button[@aria-label='Close'])[3]")

                       	   private WebElement Xbtn;

                       	   

                       	   public void clickXbtn() {

                       		   Xbtn.click();

                       	   }

                       	   

                            //search-name

                       	   @FindBy(xpath="//input[@type='text']")

                       	   private WebElement name;

                       	   

                       	   public void entername(String names) {

                       		   name.sendKeys(names);

                       	   }

                       	   

                       	// search dropdown

                       	    @FindBy(xpath = "//select[@class='form-control selectric']")

                       	    private WebElement searchdropdown;

                       	    

                       	    // click search icon

                       	    @FindBy(xpath = "//select[@class='form-control selectric']//option")

                       	    private List<WebElement> searchoptions;

                       	    

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

                       	   

                       	    public void nameerrormsg() {

                       			 System.out.println(name.getAttribute("validationMessage"));

                        

                       		 }

//                       	 //search-searchbyname

//                       	   public void clicksearchbyname() {

//                       		   Actions a=new Actions(driver);

//                       		   WebElement searchname = driver.findElement(By.xpath("//select/option[1]"));

//                       		   a.moveToElement(searchname).click().perform();

//                       	   }

                       	   

                       	   //search-click search

                       	   @FindBy(xpath="//button[@type='submit']/i")

                       	   private WebElement search;

                       	   

                       	   public void clicksearch() {

                                  ((JavascriptExecutor) driver).executeScript("arguments[0].click();",search);

                        

                       		   //search.click();

                       	   }

                       	  

                       	  //import-submit import

                       	  @FindBy(xpath="(//button[@type='submit'])[11]")

                       	  private WebElement Import;

                       	  

                       	 public void importsubmit() {

                       		 Import.click();

                       	 }

                       	   
public void clickeditofproduct(String product) {

		WebElement prod= driver.findElement(By.xpath("//h6[contains(text(),'"+product+"')]/ancestor::td/following-sibling::td[4]/a/i"));
prod.click();
	 }

                        

                       	}		
   				
   				
   				
   				
   				
   				






