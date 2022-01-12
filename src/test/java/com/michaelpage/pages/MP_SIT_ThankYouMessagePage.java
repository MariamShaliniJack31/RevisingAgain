package com.michaelpage.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_ThankYouMessagePage extends ReusableMethodTC {
	String strURL;
	
	//PasswordTextbox 
	@FindBy(xpath = "//*[text()='Enter the password']//following-sibling::input")
	public WebElement passwordTextBoxUploadPage;
	//Applied successfully message 
	@FindBy(xpath = "//*[@class='status-msg-text']")
	public WebElement successfullyMSGHeader;

	//Application receive header
	@FindBy(xpath = "//h2[@class='ty-title']")
	public WebElement applicationReceivedHeader;
	
	//Back search button 
	@FindBy(xpath = "//a[contains(text(),'Back to Search')]")
	public WebElement Searchbtn;
	
	public MP_SIT_ThankYouMessagePage() {
		PageFactory.initElements(driver, this);
	}
	public void verifyTextMessage(String webElementTitle) throws Exception {

		switch (webElementTitle.toUpperCase()) {
		case "SUCCESSFULLY MESSAGE": {			
			ReusableMethodTC.elementToBeVisible(successfullyMSGHeader);
			ReusableMethodTC.highLighterMethod(driver, successfullyMSGHeader);
			Assert.assertTrue(successfullyMSGHeader.getText().trim().contains("successfully"));
			System.out.println("Verified :  You have successfully applied header   header is displayed Successfully");
			Reporter.log("Verified : " + successfullyMSGHeader.getText().trim()+"header is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : You have successfully applied header is displayed Successfully");
			break;
		}
		case "APPLICATION RECEIVED": {	
			ReusableMethodTC.elementToBeVisible(applicationReceivedHeader);
			ReusableMethodTC.highLighterMethod(driver, applicationReceivedHeader);	
			Assert.assertTrue(applicationReceivedHeader.getText().trim().contains("received"));
			System.out.println("Verified :  received header is displayed Successfully");
			Reporter.log("Verified : " + applicationReceivedHeader.getText().trim()+"is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : received header is displayed Successfully");
			break;
		}
		case "CV RECU": {	
			ReusableMethodTC.elementToBeVisible(applicationReceivedHeader);
			ReusableMethodTC.highLighterMethod(driver, applicationReceivedHeader);
			ReusableMethodTC.verifyText("CV reçu", applicationReceivedHeader.getText().trim());
			System.out.println("Verified : CV Recu header for French language is displayed Successfully" );
			Reporter.log("Verified : " + applicationReceivedHeader.getText().trim());
			LogFile.APPLICATION_LOGS.debug("Verified : CV Recu header is displayed Successfully");
			break;
		}
		case "BACK TO SEARCH": {		
			ReusableMethodTC.elementToBeVisible(Searchbtn);
			ReusableMethodTC.highLighterMethod(driver, Searchbtn);
			ReusableMethodTC.verifyText("Back to Search", Searchbtn.getText());
			System.out.println("Verified : "+ Searchbtn.getText()+"  Button is displayed Successfully");
			Reporter.log("Verified : Back to Search button is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Back to Search Button is displayed Successfully");
			break;
		}
		case "THANK YOU MESSAGE URL": {					
			strURL = driver.getCurrentUrl();	
			Assert.assertTrue(strURL.contains("success=true"));
			System.out.println("Verified : The URl is : " + strURL.toString());
			Reporter.log("Verified : The thank you message URl is : " + strURL);
			LogFile.APPLICATION_LOGS.debug("Verified : The thank you message URl is : " + strURL);
			break;
		}
		}		
		}
	public void clickOnElement(String webElementTitle) throws InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "GO BACK": {
			try {
				
				driver.navigate().back();
				System.out.println("Redirect to previous page");
				Reporter.log("Clicked on 'Go Back' link");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Go Back' link");				
				if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
					System.out.println("alert was not present");
				} else {
					Alert alert = driver.switchTo().alert();
					alert.accept();
					System.out.println("alert was present and accepted");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		}
		}
	
		}
	
	
	
	}
