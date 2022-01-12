package com.michaelpage.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.common.utils.RandomDataUtil;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_Upload_CVPage extends ReusableMethodTC {

	static LoginTC login = new LoginTC();
	String strURL;

	// Upload CV Page - Apply with your CV text
	@FindBy(xpath = "//div[contains(text(),'Apply with your CV')]")
	public WebElement ApplywithyourCVlabel;

	// Job Details Page - Apply Job Button
	@FindBy(xpath = "//span[contains(text(),'Apply Job')]")
	public WebElement applyJobBtn;

	// Upload CV- Aplly now button
	@FindBy(xpath = "//input[@value='Apply Now']")
	public WebElement applynowbtn;

	// Apply with your CV Page - How would you like to apply?
	@FindBy(xpath = "//div[contains(text(),'How would you like to apply?')]")
	public WebElement ApplyCVlbl;

	// Apply with your CV Page- Next button
	@FindBy(xpath = "//input[@value='Next']")
	public WebElement nextbtn;

	// Apply with your CV Page- Apply Now Button
	@FindBy(xpath = "//input[@value='Apply Now']")
	public WebElement applybtn;

	// Apply with CV- Email address
	@FindBy(xpath = "//input[@placeholder='Email address']")
	public WebElement EmailAddrestext;

	// Apply with CV- Last Name
	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement FirstNametext;

	// Apply with CV- First Name
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement LastNametext;

	// Upload CV- uploadCV panel label
	@FindBy(xpath = "//li[@class='uploaded-cv pdf']/span/a")
	public WebElement uploadfilelabel;

	// apply with CV -Browse Button
	@FindBy(xpath = "//a[@class='button browse']")
	public WebElement browseBtn;

	// apply with cv -upload cv dropdown
	@FindBy(xpath = "//div[@class='upload-list']/a")
	public WebElement uploadcvdd;

	// apply with cv- status
	@FindBy(xpath = "//span[@class='status-msg-text']")
	public WebElement uploadstatuslabel;

	// apply with CV-menuoption
	@FindBy(xpath = "//span[@class='uploaded-file']/a")
	public WebElement uploadcvmenu;

	// Upload CV- uploadCV panel
	@FindBy(xpath = "//li[@class='uploaded-cv pdf']")
	public WebElement uploadCvlst;

	public MP_SIT_Upload_CVPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyTextMessage(String webElementTitle) throws Exception {

		switch (webElementTitle.toUpperCase()) {
		case "APPLY WITH YOUR CV": {
			ReusableMethodTC.elementToBeVisible(ApplywithyourCVlabel);
			ReusableMethodTC.isElementPresent(ApplywithyourCVlabel);
			ReusableMethodTC.highLighterMethod(driver, ApplywithyourCVlabel);
			ReusableMethodTC.elementToBeVisible(ApplywithyourCVlabel);
			ReusableMethodTC.verifyText("Apply with your CV", ApplywithyourCVlabel.getText());
			System.out.println("Verified : Apply with your CV page displayed Successfully");
			Reporter.log("Verified : Apply with your CV page displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Apply with your CV page displayed Successfully");
			break;
		}
		case "HOW WOULD YOU LIKE TO APPLY?": {
			ReusableMethodTC.highLighterMethod(driver, ApplyCVlbl);
			ReusableMethodTC.elementToBeVisible(ApplyCVlbl);
			ReusableMethodTC.verifyText("How would you like to apply?", ApplyCVlbl.getText());
			System.out.println("Verified : How would you like to apply is displayed Successfully");
			Reporter.log("Verified : How would you like to apply is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : How would you like to apply is displayed Successfully");
			Thread.sleep(300);
			break;
		}

		case "APPLICATION RECEIVED": {
			ReusableMethodTC.highLighterMethod(driver, ApplyCVlbl);
			ReusableMethodTC.elementToBeVisible(ApplyCVlbl);
			ReusableMethodTC.verifyText("How would you like to apply?", ApplyCVlbl.getText());
			System.out.println("Verified : How would you like to apply is displayed Successfully");
			Reporter.log("Verified : How would you like to apply is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : How would you like to apply is displayed Successfully");
			break;
		}
		case "CV FILE": {
			ReusableMethodTC.elementToBeVisible(uploadCvlst);
			ReusableMethodTC.highLighterMethod(driver, uploadCvlst);
			ReusableMethodTC.verifyText("CV_Kylie Minogue.docx", uploadfilelabel.getText());
			System.out.println("Verified : The File is successfully Uploaded");
			Reporter.log("Verified : The File is successfully Uploaded");
			LogFile.APPLICATION_LOGS.debug("Verified : The File is successfully Uploaded");
			break;
		}
		/*
		 * case "CC-PRS FORM":{ ReusableMethodTC.elementToBeVisible(uploadstatuslabel);
		 * ReusableMethodTC.highLighterMethod(driver, uploadstatuslabel);
		 * ReusableMethodTC.elementToBeVisible(uploadstatuslabel); String
		 * msg="You've successfully applied"; ReusableMethodTC.verifyText(msg.strip(),
		 * uploadstatuslabel.getText());
		 * System.out.println("Verified : CC/PRS form is not displayed");
		 * Reporter.log("Verified : CC/PRS form is not displayed");
		 * LogFile.APPLICATION_LOGS.debug("Verified : CC/PRS form is not displayed");
		 * break; }
		 */
		}
	}

	public String verifyURL() throws Exception {
		strURL = driver.getCurrentUrl();
		if (strURL.equalsIgnoreCase("https://wwwsit3.michaelpage.co.uk/job-apply/test1/ref/897")) {
			System.out.println("Verified : The URl is : " + strURL);
			Reporter.log("Verified : The URl is : " + strURL);
			LogFile.APPLICATION_LOGS.debug("Verified : The URl is : " + strURL);
		}
		return strURL;
	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {

		case "APPLY JOB": {
			ReusableMethodTC.highLighterMethod(driver, applyJobBtn);
			ReusableMethodTC.click(applyJobBtn);
			Reporter.log("Clicked on 'APPLY JOB' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'APPLY JOB' ");
			break;
		}

		case "NEXT": {
			Thread.sleep(5000);
			ReusableMethodTC.isElementPresent(nextbtn);
			ReusableMethodTC.elementToBeVisible(nextbtn);
			ReusableMethodTC.highLighterMethod(driver, nextbtn);
			ReusableMethodTC.mouseOver(nextbtn);
			ReusableMethodTC.click(nextbtn);
			System.out.println("Click on the next button");
			Reporter.log("Clicked on 'Next' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Next' ");
			break;
		}
		case "BROWSE": {
			ReusableMethodTC.mouseOver(uploadcvdd);
			ReusableMethodTC.highLighterMethod(driver, uploadcvdd);
			ReusableMethodTC.sendKeys(uploadcvdd, Keys.RETURN);
			ReusableMethodTC.click(browseBtn);
			Reporter.log("Clicked on 'Browse Button' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Browse Button'");
			break;
		}
		case "APPLY NOW": {
			ReusableMethodTC.elementToBeVisible(applybtn);
			ReusableMethodTC.highLighterMethod(driver, applybtn);
			Thread.sleep(5000);
			ReusableMethodTC.mouseOver(applybtn);
			ReusableMethodTC.click(applybtn);
			System.out.println("Click on the Apply Now button");
			Reporter.log("Clicked on 'Apply Now' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Apply Now' ");
			break;
		}
		}
	}

	public void enterText(String webElementTitle) {

		switch (webElementTitle.toUpperCase()) {

		case "EMAIL ADDRESS": {
			ReusableMethodTC.highLighterMethod(driver, EmailAddrestext);
			ReusableMethodTC.clear(EmailAddrestext);
			ReusableMethodTC.sendKeys(EmailAddrestext, RandomDataUtil.randomStringGenerator() + "12@gmail.com");
			Reporter.log("Entered Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Email Address");
			break;
		}

		case "FIRST NAME": {
			ReusableMethodTC.highLighterMethod(driver, FirstNametext);
			ReusableMethodTC.clear(FirstNametext);
			ReusableMethodTC.sendKeys(FirstNametext, RandomDataUtil.randomStringGenerator());
			Reporter.log("Entered First Name");
			LogFile.APPLICATION_LOGS.info("Entered First Name");
			break;
		}

		case "LAST NAME": {
			ReusableMethodTC.highLighterMethod(driver, LastNametext);
			ReusableMethodTC.clear(LastNametext);
			ReusableMethodTC.sendKeys(LastNametext, RandomDataUtil.randomStringGenerator());
			Reporter.log("Entered Last Name");
			LogFile.APPLICATION_LOGS.info("Entered Last Name");
			break;
		}
		}
	}

}
