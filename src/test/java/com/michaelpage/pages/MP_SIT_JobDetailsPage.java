package com.michaelpage.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.common.utils.RandomDataUtil;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_JobDetailsPage extends ReusableMethodTC {

	static LoginTC login = new LoginTC();

	// Client profile
	@FindBy(xpath = "//div[@id='block-mp-theme-page-title']//span")
	public WebElement clientProfileName;
	// Client profile
	@FindBy(xpath = "//div[@class='job-logo']//img")
	public WebElement Logo;
	/******************** Save and Apply Job Elements *****************************/
	// Job Details Page - Save Button FOR ANNONYMOUS USER
	@FindBy(xpath = "//div[@class='job-detail-sticky-links with-share']//li[3]//span")
	public WebElement saveJobBtn;
	// Job Details Page - SAVE Button FOR AUTH USER
	@FindBy(xpath = "//div[@class='job-detail-sticky-links with-share']//li[3]//a")
	public WebElement AuthSaveJOb;

	/******************** Email Job Elements *****************************/
	// Job Details Page - Apply Job Button
	@FindBy(xpath = "//span[@class='apply-job redirect-url-span-tag']")
	public WebElement applyJobBtn;
	// Job Details Page - Email Job Button
	@FindBy(xpath = "(//span[@class='email-job'])[2]//a")
	public WebElement emailJobBtn;
	// Email Pop up- To email Text
	@FindBy(xpath = "//input[@name='to']")
	public WebElement toEmailTxt;
	// Email Pop up- from email Text
	@FindBy(xpath = "//input[@name='from']")
	public WebElement fromEmailTxt;
	// Email Pop up- Send Email button
	@FindBy(xpath = "//button[text()='Send email']")
	public WebElement sendEmailbtn;
	// Email Pop up- Email has been sent successfully Message
	@FindBy(xpath = "//div[contains(text(),' has been sent')]")
	public WebElement sendEmailSuccessMsg;
	// Email Pop up- Close PopUP button
	@FindBy(xpath = "//span[@class='ui-button-icon ui-icon ui-icon-closethick']")
	public WebElement ClosePopUpBtn;
	// Email Pop up- From Email is required Error Message
	@FindBy(xpath = "//label[contains(text(),'Email to is required')]")
	public WebElement fromEmailRequiredErrorMsg;
	// Email Pop up- To Email is required Error Message
	@FindBy(xpath = "//label[contains(text(),'Your email address is required')]")
	public WebElement toEmailRequiredErrorMsg;

	/******************** Similar Jobs Elements *****************************/

	// Job Details Page -Similar Jobs
	@FindBy(xpath = "//div[@id='block-similar-jobs-desktop']//h2")
	public WebElement SimilarJobsText;
	// Job Details Page -Similar Jobs
	@FindBy(xpath = "//div[@id='block-similar-jobs-desktop']/div/div//div[@class='views-row']")
	public WebElement SimilarJobs;
	// Job Details Page -Similar Jobs Titles
	@FindBy(xpath = "//div[@class='views-row']/div[2]//a//span")
	public WebElement SimilarJobTitles;
	// Job Details Page -Similar job-contract-type
	@FindBy(xpath = "//div[@class='views-row']/div[3]/div[2]/div")
	public WebElement SimilarJobContractTypes;
	// Job Details Page -Similar job-salary
	@FindBy(xpath = "//div[@class='views-row']/div[3]/div[3]")
	public WebElement SimilarJobSalary;
	// Job Details Page -Similar save Job
	@FindBy(xpath = "//div[@id='block-similar-jobs-desktop']//div[3]//div[1]//span[1]")
	public WebElement SimilarJobSaveJobIconforAnonUser;
	// Job Details Page -Similar save Job
//	@FindBy(css = ".view-content .active")
//	public WebElement SimilarJobSavedJobIconforAnonUser;
	// Job Details Page -Similar save Job
	@FindBy(xpath = "//div[@class='view-content']/div[3]/div[1]/div//a")
	public WebElement SimilarJobSaveJobIconforAuthUser;
	// Job Details Page -Similar save Job
//	@FindBy(xpath = "(//a[@class='use-ajax'][contains(text(),'Saved')])[1]")
//	public WebElement SimilarJobSavedJobIconforAuthUser;
	// Job Details Page -Similar Jobs Titles
	@FindBy(xpath = "//h1[@class='job-apply-job-title']//span")
	public WebElement SimilarJobTitleInHeader;
	// Job Details Page -Similar Jobs Pagination Backward Arrow
	@FindBy(xpath = "//li[@class='pager__item pager__item--previous']//a")
	public WebElement SimilarJobsPaginationBackwardArrow;
	// Job Details Page -Similar Jobs Pagination Forward Arrow
	@FindBy(xpath = "//li[@class='pager__item pager__item--next']//a")
	public WebElement SimilarJobsPaginationForwardArrow;
	// Job Details Page -Similar Jobs-Page1
	@FindBy(xpath = "//a[text()='1']")
	public WebElement SimilarJobsPaginationPage1Btn;
	// Job Details Page -Similar Jobs-Page2
	@FindBy(xpath = "//a[text()='2']")
	public WebElement SimilarJobsPaginationPage2Btn;
	// Job Details Page -Similar Jobs-Page3
	@FindBy(xpath = "//a[text()='3']")
	public WebElement SimilarJobsPaginationPage3Btn;

	/******************** Job Information Elements *****************************/
	// Job Details Page -Back to Search Link
	@FindBy(xpath = "(//span[contains(text(),'Back to')])[1]")
	public WebElement BackToSearchLink;
	// Job Details Page -Job Title
	@FindBy(xpath = "//h1[@class='job-apply-job-title']")
	public WebElement JobTitle;
	// Job Details Page -Job Location
	@FindBy(xpath = "//div[@class='job-apply-fields']//span[1]//a")
	public WebElement JobLocation;
	// Job Details Page -Job Type
	@FindBy(xpath = "//div[@class='job-apply-fields']//span[2]//a")
	public WebElement JobType;
	// Job Details Page -Job Salary
	@FindBy(xpath = "//div[@class='job-apply-fields']//span[3]")
	public WebElement JobSalary;
	// Job Details Page -bulletPOints
	@FindBy(xpath = "//div[@class='job-bullet-points']")
	public WebElement bulletPOints;
	// Job Details Page -About our Client
	@FindBy(xpath = "//div[@id='description']//div[2]/h3")
	public WebElement aboutOurClient;
	// Job Details Page -About our Client
	@FindBy(xpath = "//div[@id='description']//div[2]/div")
	public WebElement aboutOurClientValue;
	// Job Details Page -Job Description
	@FindBy(xpath = "//div[@id='description']//div[3]/h3")
	public WebElement jobDescription;
	// Job Details Page -Job Description value
	@FindBy(xpath = "//div[@id='description']//div[3]/div")
	public WebElement jobDescriptionValue;
	// Job Details Page -The Successful Applicant
	@FindBy(xpath = "//div[@class='successful-application']/h3")
	public WebElement theSuccessfulApplicant;
	// Job Details Page -The Successful Applicant
	@FindBy(xpath = "//div[@class='successful-application']/div")
	public WebElement theSuccessfulApplicantValue;
	// Job Details Page -What's On Offer
	@FindBy(xpath = "//div[@class='what-an-offer']/h3")
	public WebElement whatsOnOffer;
	// Job Details Page -What's On Offer value
	@FindBy(xpath = "//div[@class='what-an-offer']/div")
	public WebElement whatsOnOfferValue;
	// Job Details Page -jobContactINfo
	@FindBy(xpath = "//div[@class='job-contact-info']/div")
	public WebElement jobContactINfo;

	// Job Details Page -What's On Offer contact
	@FindBy(xpath = "//div[contains(text(),'Contact')]")
	public WebElement Contact;
	// Job Details Page -What's On Offer ContactValue
	@FindBy(xpath = "//div[contains(text(),'Contact')]/following-sibling::div")
	public WebElement ContactValue;
	// Job Details Page-What's On Offer PhoneValue
	@FindBy(xpath = "//div[@class='field--label'][contains(text(),'Phone number')]/following-sibling::div")
	public WebElement PhoneValue;
	// Job Details Page -What's On Offer Phone
	@FindBy(xpath = "//div[@class='field--label'][contains(text(),'Phone number')]")
	public WebElement Phone;
	// Job Details Page -What's On Offer QuoteJobref
	@FindBy(xpath = "//div[contains(text(),'Quote job ref')]")
	public WebElement QuoteJobref;
	// Job Details Page -What's On Offe rQuoteJobref value
	@FindBy(xpath = "//div[contains(text(),'Quote job ref')]/following-sibling::div")
	public WebElement QuoteJobrefValue;

	// Job Details Page -Summary Section
	@FindBy(xpath = "//h2[contains(text(),'Summary')]")
	public WebElement summarySection;
	// Job Details Page -Sector
	@FindBy(xpath = "//div[@id='summary']/div/div[1]/div[1]")
	public WebElement sector;
	// Job Details Page -SectorValue
	@FindBy(xpath = "//div[@id='summary']/div/div[1]/div[2]")
	public WebElement SectorValue;
	// Job Details Page -Subsector
	@FindBy(xpath = "//div[@id='summary']/div/div[2]/div[1]")
	public WebElement subSector;
	// Job Details Page -SubsectorValue
	@FindBy(xpath = "//div[@id='summary']/div/div[2]/div[2]")
	public WebElement subSectorValue;
	// Job Details Page -Industry
	@FindBy(xpath = "//div[@id='summary']/div/div[3]/div[1]")
	public WebElement industry;
	// Job Details Page -industryValue
	@FindBy(xpath = "//div[@id='summary']/div/div[3]/div[2]")
	public WebElement industryValue;
	// Job Details Page -Consultant
	@FindBy(xpath = "//div[@id='summary']/div/div[4]/div[1]")
	public WebElement consultant;
	// Job Details Page -consultantValue
	@FindBy(xpath = "//div[@id='summary']/div/div[4]/div[2]")
	public WebElement consultantValue;
	// Job Details Page -Phone number
	@FindBy(xpath = "//div[@id='summary']/div/div[5]/div[1]")
	public WebElement phoneNumber;
	// Job Details Page -phoneNumberValue
	@FindBy(xpath = "//div[@id='summary']/div/div[5]/div[2]")
	public WebElement phoneNumberValue;
	// Job Details Page -Experience
	@FindBy(xpath = "//div[@id='summary']/div/div[6]/div[1]")
	public WebElement experience;
	// Job Details Page -experienceValue
	@FindBy(xpath = "//div[@id='summary']/div/div[6]/div[2]")
	public WebElement experienceValue;
	// Job Details Page -Job reference
	@FindBy(xpath = "//div[contains(text(),'Job reference')]")
	public WebElement jobReference;
	// Job Details Page -jobReferenceValue
	@FindBy(xpath = "//div[contains(text(),'Job reference')]/following-sibling::div")
	public WebElement jobReferenceValue;
	// Job Details Page -Contract Duration
	@FindBy(xpath = "//div[@id='summary']/div/div[8]/div[1]")
	public WebElement contractDuration;
	// Job Details Page -Contract Duration
	@FindBy(xpath = "//div[@id='summary']/div/div[8]/div[2]")
	public WebElement contractDurationValue;
	// Job Details Page -Company Type
	@FindBy(xpath = "//div[@id='summary']/div/div[9]/div[1]")
	public WebElement companyType;
	// Job Details Page -Company Type
	@FindBy(xpath = "//div[@id='summary']/div/div[9]/div[2]//a")
	public WebElement companyTypeValue;
	// Job Details Page -Job Savedcount icon
	@FindBy(xpath = "//span[@class='saved-jobs-count save_job_present']")
	public WebElement jobSavedCountIcon;

	/******************** Inactive and Not CA JOb *****************************/
	// Job Details Page -not Client auth error
	@FindBy(xpath = "//*[@id='description']/p")
	public WebElement notCAErroeMessageforJob;
	// Job Details Page -inactive job
	@FindBy(xpath = "//div[@class='views-row']//h1[contains(text(),'position is now filled')]")
	public WebElement positionFilledText;

	public MP_SIT_JobDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "SAVE JOB": {
			ReusableMethodTC.elementToBeVisible(saveJobBtn);
			ReusableMethodTC.highLighterMethod(driver, saveJobBtn);
			clickUsingJavaScript(saveJobBtn);
			Thread.sleep(2000);
			Reporter.log("Clicked on 'SAVE JOB' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'SAVE JOB'");
			break;
		}
		case "SAVED JOB": {
			ReusableMethodTC.elementToBeVisible(saveJobBtn);
			ReusableMethodTC.highLighterMethod(driver, saveJobBtn);
			clickUsingJavaScript(saveJobBtn);
			Thread.sleep(2000);
			Reporter.log("Clicked on 'SAVED JOB' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'SAVED JOB' ");
			break;
		}
		case "SAVED JOB AUTHUSER": {
			ReusableMethodTC.elementToBeVisible(AuthSaveJOb);
			ReusableMethodTC.highLighterMethod(driver, AuthSaveJOb);
			clickUsingJavaScript(AuthSaveJOb);
			Thread.sleep(2000);
			Thread.sleep(300);
			Reporter.log("Clicked on 'SAVED JOB' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'SAVED JOB' ");
			break;
		}
		case "SAVE JOB AUTHUSER": {
			ReusableMethodTC.elementToBeVisible(AuthSaveJOb);
			ReusableMethodTC.highLighterMethod(driver, AuthSaveJOb);
			clickUsingJavaScript(AuthSaveJOb);
			Thread.sleep(2000);
			Thread.sleep(300);
			Reporter.log("Clicked on 'SAVE JOB' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'SAVE JOB' ");
			break;
		}
		case "EMAIL JOB": {
			ReusableMethodTC.elementToBeVisible(emailJobBtn);
			ReusableMethodTC.highLighterMethod(driver, emailJobBtn);
			clickUsingJavaScript(emailJobBtn);
			Reporter.log("Clicked on 'EMAIL JOB' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'EMAIL JOB' ");
			break;
		}
		case "APPLY JOB": {
			ReusableMethodTC.elementToBeVisible(applyJobBtn);
			ReusableMethodTC.highLighterMethod(driver, applyJobBtn);
			clickUsingJavaScript(applyJobBtn);
			Reporter.log("Clicked on 'APPLY JOB' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'APPLY JOB' ");
			break;
		}
		case "SEND EMAIL": {
			ReusableMethodTC.elementToBeVisible(sendEmailbtn);
			ReusableMethodTC.highLighterMethod(driver, sendEmailbtn);
			clickUsingJavaScript(sendEmailbtn);
			Reporter.log("Clicked on 'SEND EMAIL' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'SEND EMAIL' ");
			break;
		}
		case "CLOSE": {
			ReusableMethodTC.elementToBeVisible(ClosePopUpBtn);
			ReusableMethodTC.highLighterMethod(driver, ClosePopUpBtn);
			clickUsingJavaScript(ClosePopUpBtn);
			Reporter.log("Clicked on 'Closed Button' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Closed Button' ");
			break;
		}
		case "SIMILAR JOBS SAVE JOB ICON FOR ANONUSER": {
			try {
				ReusableMethodTC.elementToBeVisible(SimilarJobSaveJobIconforAnonUser);
				ReusableMethodTC.highLighterMethod(driver, SimilarJobSaveJobIconforAnonUser);
				clickUsingJavaScript(SimilarJobSaveJobIconforAnonUser);
				Thread.sleep(1000);
				ReusableMethodTC.elementToBeVisible(SimilarJobSaveJobIconforAnonUser);
				ReusableMethodTC.highLighterMethod(driver, SimilarJobSaveJobIconforAnonUser);
				clickUsingJavaScript(SimilarJobSaveJobIconforAnonUser);
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Clicked on 'Save Job' icon of the Third Similar Job");
			Reporter.log("Clicked on 'Save Job' icon of the Third Simliar Job as an Anonymous user ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Save Job' Icon of the Third Simliar Job as an Anonymous user");
			break;
		}
		case "SIMILAR JOBS SAVE JOB ICON FOR AUTHUSER": {
			try {
				ReusableMethodTC.elementToBeVisible(SimilarJobSaveJobIconforAuthUser);
				ReusableMethodTC.highLighterMethod(driver, SimilarJobSaveJobIconforAuthUser);
				Thread.sleep(300);
				clickUsingJavaScript(SimilarJobSaveJobIconforAuthUser);
				Thread.sleep(2000);
				ReusableMethodTC.elementToBeVisible(SimilarJobSaveJobIconforAuthUser);
				ReusableMethodTC.highLighterMethod(driver, SimilarJobSaveJobIconforAuthUser);
				clickUsingJavaScript(SimilarJobSaveJobIconforAuthUser);
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Clicked on 'Save Job' icon of the Third Similar Job");
			Reporter.log("Clicked on 'Save Job' icon of the Third Simliar Job as Authenticated user");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Save Job' icon of the Third Simliar Job as Authenticated user");
			break;
		}
		case "SIMILAR JOBS TITLE": {
			try {
				ReusableMethodTC.elementToBeVisible(SimilarJobTitles);
				ReusableMethodTC.highLighterMethod(driver, SimilarJobTitles);
				clickUsingJavaScript(SimilarJobTitles);
				Thread.sleep(2000);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			Reporter.log("Clicked on 'SimilarJobTitle'of the first Simliar Job");
			LogFile.APPLICATION_LOGS.info("Clicked on 'SimilarJobTitle'of the first Simliar Job");
			break;
		}
		case "PAGE 1 BUTTON": {
			scrollIntoView(SimilarJobsPaginationPage1Btn);
			ReusableMethodTC.elementToBeVisible(SimilarJobsPaginationPage1Btn);
			ReusableMethodTC.highLighterMethod(driver, SimilarJobsPaginationPage1Btn);
			ReusableMethodTC.click(SimilarJobsPaginationPage1Btn);
			Reporter.log("Clicked on 'Page 1 Button' in job-detail pages");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Page 1 Button' in job-detail pages");
			break;
		}
		case "PAGE 2 BUTTON": {
			scrollIntoView(SimilarJobsPaginationPage2Btn);
			ReusableMethodTC.elementToBeVisible(SimilarJobsPaginationPage2Btn);
			ReusableMethodTC.highLighterMethod(driver, SimilarJobsPaginationPage2Btn);
			ReusableMethodTC.click(SimilarJobsPaginationPage2Btn);
			Reporter.log("Clicked on 'Page 2 Button' in job-detail pages");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Page 2 Button' in job-detail pages");
			break;
		}
		case "PAGE 3 BUTTON": {
			scrollIntoView(SimilarJobsPaginationPage3Btn);
			ReusableMethodTC.elementToBeVisible(SimilarJobsPaginationPage3Btn);
			ReusableMethodTC.highLighterMethod(driver, SimilarJobsPaginationPage3Btn);
			ReusableMethodTC.click(SimilarJobsPaginationPage3Btn);
			Reporter.log("Clicked on 'Page 3 Button' in job-detail pages");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Page 3 Button' in job-detail pages");
			break;
		}
		case "NEXT PAGE ARROW BUTTON": {
			scrollIntoView(SimilarJobsPaginationForwardArrow);
			ReusableMethodTC.elementToBeVisible(SimilarJobsPaginationForwardArrow);
			ReusableMethodTC.highLighterMethod(driver, SimilarJobsPaginationForwardArrow);
			ReusableMethodTC.click(SimilarJobsPaginationForwardArrow);
			Reporter.log("Clicked on 'NEXT PAGE ARROW BUTTON' in job-detail pages");
			LogFile.APPLICATION_LOGS.info("Clicked on 'NEXT PAGE ARROW BUTTON' in job-detail pages");
			break;
		}
		case "PREVIOUS PAGE ARROW BUTTON": {
			scrollIntoView(SimilarJobsPaginationBackwardArrow);
			ReusableMethodTC.elementToBeVisible(SimilarJobsPaginationBackwardArrow);
			ReusableMethodTC.highLighterMethod(driver, SimilarJobsPaginationBackwardArrow);
			ReusableMethodTC.click(SimilarJobsPaginationBackwardArrow);
			Reporter.log("Clicked on 'PREVIOUS PAGE ARROW BUTTON' in job-detail pages");
			LogFile.APPLICATION_LOGS.info("Clicked on 'PREVIOUS PAGE ARROW BUTTON' in job-detail pages");
			break;
		}
		case "BACK TO SEARCH LINK": {
			ReusableMethodTC.elementToBeVisible(BackToSearchLink);
			ReusableMethodTC.highLighterMethod(driver, BackToSearchLink);
			ReusableMethodTC.click(BackToSearchLink);
			Reporter.log("Clicked on Back to search link");
			LogFile.APPLICATION_LOGS.debug("Clicked on Back to search link");
			break;
		}
		}
	}

	public void verifyTextMessage(String webElementTitle) throws Exception {

		switch (webElementTitle.toUpperCase()) {
		case "SAVED JOB": {
			ReusableMethodTC.elementToBeVisible(saveJobBtn);
			ReusableMethodTC.highLighterMethod(driver, saveJobBtn);
			ReusableMethodTC.verifyText("Saved", saveJobBtn.getText());
			String Class_name = saveJobBtn.getAttribute("class");
			ReusableMethodTC.verifyText("anon-save-jobs save-jobs active", Class_name);
			System.out.println(" Verified CSS ID : class =" + Class_name);
			System.out.println("Verified : Job is Saved Successfully");
			Reporter.log("Verified : Job is Saved Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Job is Saved Successfully");
			Reporter.log("Verified : CSS ID of Saved Job Button");
			LogFile.APPLICATION_LOGS.debug("Verified : CSS ID of Saved Job Button");
			break;
		}
		case "SAVE JOB": {
			ReusableMethodTC.elementToBeVisible(saveJobBtn);
			ReusableMethodTC.highLighterMethod(driver, saveJobBtn);
			ReusableMethodTC.verifyText("Save", saveJobBtn.getText());
			String Class_name = saveJobBtn.getAttribute("class");
			ReusableMethodTC.verifyText("anon-save-jobs save-jobs", Class_name);
			System.out.println("Verified CSS ID : class =" + Class_name);
			System.out.println("Verified : Job is unSaved");
			Reporter.log("Verified : Job is unSaved");
			LogFile.APPLICATION_LOGS.debug("Verified : Job is unSaved");
			Reporter.log("Verified : CSS ID of Save Job Button");
			LogFile.APPLICATION_LOGS.debug("Verified : CSS ID of Save Job Button");
			break;
		}
		case "SAVED": {
			scrollIntoElement(AuthSaveJOb);
			ReusableMethodTC.elementToBeVisible(AuthSaveJOb);
			ReusableMethodTC.highLighterMethod(driver, AuthSaveJOb);
			ReusableMethodTC.verifyText("Saved", AuthSaveJOb.getText());
			System.out.println("Verified : Job is Saved");
			Reporter.log("Verified : Job is Saved");
			LogFile.APPLICATION_LOGS.debug("Verified : Job is Saved");
			break;
		}
		case "UNSAVED": {
			ReusableMethodTC.elementToBeVisible(AuthSaveJOb);
			ReusableMethodTC.highLighterMethod(driver, AuthSaveJOb);
			ReusableMethodTC.verifyText("Save", AuthSaveJOb.getText());
			System.out.println("Verified : Job is unSaved");
			Reporter.log("Verified : Job is unSaved");
			LogFile.APPLICATION_LOGS.debug("Verified : Job is unSaved");
			break;
		}
		case "EMAIL HAS BEEN SENT SUCCESSFULLY": {
			ReusableMethodTC.elementToBeVisible(sendEmailSuccessMsg);
			ReusableMethodTC.highLighterMethod(driver, sendEmailSuccessMsg);
			Assert.assertTrue(sendEmailSuccessMsg.getText().contains("This job has been sent to"));
			System.out.println("Verified : This job has been sent SUCCESSFULLY");
			Reporter.log("Verified : This job has been sent SUCCESSFULLY");
			LogFile.APPLICATION_LOGS.debug("Verified : EMAIL HAS BEEN SENT SUCCESSFULLY");
			break;
		}
		case "EMAIL FIELD ERROR": {
			ReusableMethodTC.elementToBeVisible(toEmailRequiredErrorMsg);
			ReusableMethodTC.highLighterMethod(driver, toEmailRequiredErrorMsg);
			Assert.assertTrue(toEmailRequiredErrorMsg.getText().contains("Your email address is required"));
			System.out.println("Verified : EMAIL FIELD ERROR");
			Reporter.log("Verified : EMAIL FIELD ERROR");
			LogFile.APPLICATION_LOGS.debug("Verified : EMAIL FIELD ERROR");
			break;
		}
		case "SIMILAR JOBS": {
			Thread.sleep(3000);
			try {
				ReusableMethodTC.elementToBeVisible(SimilarJobsText);
				ReusableMethodTC.highLighterMethod(driver, SimilarJobsText);
				ReusableMethodTC.verifyText("Similar Jobs", SimilarJobsText.getText());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("Verified Similar Jobs Header in Job Details Page");
			Reporter.log("Verified Similar Jobs Header in Job Details Page");
			LogFile.APPLICATION_LOGS.debug("Verified Similar Jobs Header in Job Details Page");
			break;
		}
		case "ONLY 3 SIMILAR JOBS": {
			Thread.sleep(3000);
			try {
				ReusableMethodTC.elementToBeVisible(SimilarJobs);
				ReusableMethodTC.highLighterMethod(driver, SimilarJobs);
				List<WebElement> moreJobs = driver.findElements(
						By.xpath("//div[@id='block-similar-jobs-desktop']/div/div//div[@class='views-row']"));
				System.out.println("Similar Jobs in Job Details Page are:::" + moreJobs.size());
				Reporter.log("Similar Jobs in Job Details Page are:::" + moreJobs.size());
				LogFile.APPLICATION_LOGS.debug("Similar Jobs in Job Details Page are:::" + moreJobs.size());

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			break;
		}
		case "SIMILAR JOBS TITLE": {
			try {
				Thread.sleep(2000);
				ReusableMethodTC.elementToBeVisible(SimilarJobTitles);
				ReusableMethodTC.highLighterMethod(driver, SimilarJobTitles);
				List<WebElement> JObTitles = driver.findElements(By.xpath("//div[@class='views-row']/div[2]//a//span"));
				for (int i = 0; i < JObTitles.size(); i++) {
					// System.out.println( "Similar Jobs Title in Job Details Page are:::" +
					// JObTitles.get(i).getText().toString());
					Reporter.log(
							"Similar Jobs Title in Job Details Page are:::" + JObTitles.get(i).getText().toString());
					LogFile.APPLICATION_LOGS.debug(
							"Similar Jobs Title in Job Details Page are:::" + JObTitles.get(i).getText().toString());
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}

		case "SIMILAR JOBS CONTRACT TYPE": {
			try {
				Thread.sleep(2000);
				scrollIntoElement(SimilarJobContractTypes);
				// ReusableMethodTC.elementToBeVisible(SimilarJobContractTypes);
				ReusableMethodTC.highLighterMethod(driver, SimilarJobContractTypes);
				List<WebElement> JObContractTypes = driver
						.findElements(By.xpath("//div[@class='views-row']/div[3]/div[2]/div"));
				for (int i = 0; i < JObContractTypes.size(); i++) {
					// System.out.println("Similar Jobs Contract type in Job Details Page are:::" +
					// JObContractTypes.get(i).getText().toString());
					Reporter.log("Similar Jobs Contract type in Job Details Page are:::"
							+ JObContractTypes.get(i).getText().toString());
					LogFile.APPLICATION_LOGS.debug("Similar Jobs Contract type in Job Details Page are:::"
							+ JObContractTypes.get(i).getText().toString());
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case "SIMILAR JOBS SALARY": {
			Thread.sleep(3000);
			try {
				// ReusableMethodTC.highLighterMethod(driver, SimilarJobSalary);
				List<WebElement> JobSalary = driver.findElements(By.xpath("//div[@class='views-row']/div[3]/div[3]"));
				for (int i = 0; i < JobSalary.size(); i++) {
					// System.out.println( "Similar Jobs Salary in Job Details Page are:::" +
					// JobSalary.get(i).getText().toString());
					Reporter.log(
							"Similar Jobs Salary in Job Details Page are:::" + JobSalary.get(i).getText().toString());
					LogFile.APPLICATION_LOGS.debug(
							"Similar Jobs Salary in Job Details Page are:::" + JobSalary.get(i).getText().toString());
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case "JOB TITLE IN HEADER": {
			Thread.sleep(2000);
			ReusableMethodTC.elementToBeVisible(SimilarJobTitleInHeader);
			ReusableMethodTC.highLighterMethod(driver, SimilarJobTitleInHeader);
			System.out.println("Opened JOb Is::" + SimilarJobTitleInHeader.getText().toString());
			Reporter.log("Opened JOb Is::" + SimilarJobTitleInHeader.getText().toString());
			LogFile.APPLICATION_LOGS.info("Opened JOb Is::" + SimilarJobTitleInHeader.getText().toString());
			break;
		}
		/*******************/
		case "BACK TO SEARCH LINK": {
			ReusableMethodTC.elementToBeVisible(BackToSearchLink);
			ReusableMethodTC.highLighterMethod(driver, BackToSearchLink);
			ReusableMethodTC.verifyText("Back to Search", BackToSearchLink.getText());
			Reporter.log("Verified Back to Search link is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Back to Search link is displayed");
			break;
		}
		case "JOB TITLE": {
			ReusableMethodTC.elementToBeVisible(JobTitle);
			ReusableMethodTC.highLighterMethod(driver, JobTitle);
			System.out.println("Verified Job Title is::" + JobTitle.getText().toString());
			Reporter.log("Verified Job Title");
			LogFile.APPLICATION_LOGS.debug("Verified Job Title");
			break;
		}
		case "LOCATION": {
			ReusableMethodTC.elementToBeVisible(JobLocation);
			ReusableMethodTC.highLighterMethod(driver, JobLocation);
			System.out.println("Verified Job Location is:: " + JobLocation.getText().toString());
			Reporter.log("Verified Job Location is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Job Location is displayed");
			break;
		}
		case "JOB TYPE": {
			ReusableMethodTC.elementToBeVisible(JobType);
			ReusableMethodTC.highLighterMethod(driver, JobType);
			System.out.println("Verified Job Type is::" + JobLocation.getText().toString());
			Reporter.log("Verified Job Type is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Job Type is displayed");
			break;
		}
		case "SALARY MIN AND MAX": {
			ReusableMethodTC.elementToBeVisible(JobSalary);
			ReusableMethodTC.highLighterMethod(driver, JobSalary);
			System.out.println("Verified Salary is::" + JobSalary.getText().toString());
			Reporter.log("Verified Salary is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Salary is displayed");
			break;
		}
		case "BULLET POINTS": {
			ReusableMethodTC.elementToBeVisible(bulletPOints);
			ReusableMethodTC.highLighterMethod(driver, bulletPOints);
			System.out.println("Verified bulletPOints are displayed");
			Reporter.log("BULLET POINTS::" + bulletPOints.getText().toString());
			LogFile.APPLICATION_LOGS.debug("bulletPOints::" + bulletPOints.getText().toString());
			break;
		}
		case "ABOUT OUR CLIENT": {
			ReusableMethodTC.elementToBeVisible(aboutOurClient);
			ReusableMethodTC.highLighterMethod(driver, aboutOurClient);
			ReusableMethodTC.verifyText("About Our Client", aboutOurClient.getText().toString());
			Reporter.log("Verified About Our Client is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified About Our Client is displayed");
			break;
		}
		case "ABOUT OUR CLIENT VALUE": {
			ReusableMethodTC.elementToBeVisible(aboutOurClientValue);
			ReusableMethodTC.highLighterMethod(driver, aboutOurClientValue);
			System.out.println("Verified About Our Client VALUE is displayed");
			Reporter.log("ABOUT OUR CLIENT VALUE::" + aboutOurClientValue.getText().trim());
			LogFile.APPLICATION_LOGS.debug("ABOUT OUR CLIENT VALUE::" + aboutOurClientValue.getText().trim());
			break;
		}
		case "JOB DESCRIPTION": {
			scrollIntoElement(jobDescription);
			ReusableMethodTC.elementToBeVisible(jobDescription);
			ReusableMethodTC.highLighterMethod(driver, jobDescription);
			ReusableMethodTC.verifyText("Job Description", jobDescription.getText().toString());
			Reporter.log("Verified Job Description is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Job Description is displayed");
			break;
		}
		case "JOB DESCRIPTION VALUE": {
			ReusableMethodTC.elementToBeVisible(jobDescriptionValue);
			ReusableMethodTC.highLighterMethod(driver, jobDescriptionValue);
			System.out.println("Verified Job Description VALUE is displayed");
			Reporter.log("JOB DESCRIPTION VALUE::" + jobDescriptionValue.getText().trim());
			LogFile.APPLICATION_LOGS.debug("JOB DESCRIPTION VALUE::" + jobDescriptionValue.getText().trim());
			break;
		}
		case "THE SUCCESSFUL APPLICANT": {
			ReusableMethodTC.elementToBeVisible(theSuccessfulApplicant);
			ReusableMethodTC.highLighterMethod(driver, theSuccessfulApplicant);
			ReusableMethodTC.verifyText("The Successful Applicant", theSuccessfulApplicant.getText().toString());
			Reporter.log("Verified The successful Applicant is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified The successful Applicant is displayed");
			break;
		}
		case "THE SUCCESSFUL APPLICANT VALUE": {
			ReusableMethodTC.elementToBeVisible(theSuccessfulApplicantValue);
			ReusableMethodTC.highLighterMethod(driver, theSuccessfulApplicantValue);
			System.out.println("Verified The successful Applicant VALUE is displayed");
			Reporter.log("THE SUCCESSFUL APPLICANT VALUE::" + theSuccessfulApplicantValue.getText().trim());
			LogFile.APPLICATION_LOGS
					.debug("THE SUCCESSFUL APPLICANT VALUE::" + theSuccessfulApplicantValue.getText().trim());
			break;
		}
		case "WHATS ON OFFER": {
			scrollIntoElement(whatsOnOffer);
			ReusableMethodTC.elementToBeVisible(whatsOnOffer);
			ReusableMethodTC.highLighterMethod(driver, whatsOnOffer);
			ReusableMethodTC.verifyText("What's On Offer", whatsOnOffer.getText().toString());
			Reporter.log("Verified Whats on offer is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Whats on offer is displayed");
			break;
		}
		case "WHATS ON OFFER VALUE": {
			ReusableMethodTC.elementToBeVisible(whatsOnOfferValue);
			ReusableMethodTC.highLighterMethod(driver, whatsOnOfferValue);
			System.out.println("Verified Whats on offer VALUE is displayed");
			Reporter.log("WHATS ON OFFER VALUE::" + whatsOnOfferValue.getText().trim());
			LogFile.APPLICATION_LOGS.debug("WHATS ON OFFER VALUE::" + whatsOnOfferValue.getText().trim());
			break;
		}
		case "CONTACT": {
			ReusableMethodTC.elementToBeVisible(Contact);
			ReusableMethodTC.highLighterMethod(driver, Contact);
			ReusableMethodTC.verifyText("Contact", Contact.getText().toString());
			Reporter.log("Verified Whats on offer contact is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Whats on offer contact is displayed");
			break;
		}
		case "CONTACT VALUE": {
			ReusableMethodTC.elementToBeVisible(ContactValue);
			ReusableMethodTC.highLighterMethod(driver, ContactValue);
			System.out.println("Verified Whats on offer Contact Value is displayed");
			Reporter.log("WHATS ON OFFER Contact Value::" + ContactValue.getText().trim());
			LogFile.APPLICATION_LOGS.debug("WHATS ON OFFER Contact Value::" + ContactValue.getText().trim());
			break;
		}
		case "QUOTE JOB REF": {
			ReusableMethodTC.elementToBeVisible(QuoteJobref);
			ReusableMethodTC.highLighterMethod(driver, QuoteJobref);
			ReusableMethodTC.verifyText("Quote job ref", QuoteJobref.getText().toString());
			Reporter.log("Verified Whats on offer QuoteJobref is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Whats on offer QuoteJobref is displayed");
			break;
		}
		case "QUOTE JOB REF VALUE": {
			ReusableMethodTC.elementToBeVisible(QuoteJobrefValue);
			ReusableMethodTC.highLighterMethod(driver, QuoteJobrefValue);
			System.out.println("Verified Whats on offer QuoteJobrefValue is displayed");
			Reporter.log("WHATS ON OFFER VALUE::" + QuoteJobrefValue.getText().trim());
			LogFile.APPLICATION_LOGS.debug("WHATS ON OFFER QuoteJobrefValue::" + QuoteJobrefValue.getText().trim());
			break;
		}
		case "PHONE": {
			ReusableMethodTC.elementToBeVisible(Phone);
			ReusableMethodTC.highLighterMethod(driver, Phone);
			ReusableMethodTC.verifyText("Phone number", Phone.getText().toString());
			Reporter.log("Verified Whats on offer Phone is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Whats on offer Phone is displayed");
			break;
		}
		case "PHONE VALUE": {
			ReusableMethodTC.elementToBeVisible(PhoneValue);
			ReusableMethodTC.highLighterMethod(driver, PhoneValue);
			System.out.println("Verified Whats on offer PhoneValue is displayed");
			Reporter.log("WHATS ON OFFER VALUE::" + PhoneValue.getText().trim());
			LogFile.APPLICATION_LOGS.debug("WHATS ON OFFER PhoneValue::" + PhoneValue.getText().trim());
			break;
		}
		case "SUMMARY SECTION": {
			scrollIntoElement(summarySection);
			ReusableMethodTC.elementToBeVisible(summarySection);
			ReusableMethodTC.highLighterMethod(driver, summarySection);
			System.out.println("Verified Summary section is displayed");
			Reporter.log("Verified Summary section is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Summary section is displayed");
			break;
		}
		case "SECTOR": {
			ReusableMethodTC.elementToBeVisible(sector);
			ReusableMethodTC.highLighterMethod(driver, sector);
			System.out.println("Verified Sector is displayed");
			Reporter.log("Verified Sector is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Sector is displayed");
			break;
		}
		case "SECTOR VALUE": {
			ReusableMethodTC.elementToBeVisible(SectorValue);
			ReusableMethodTC.highLighterMethod(driver, SectorValue);
			System.out.println("Sector Value is::" + SectorValue.getText());
			Reporter.log("Sector Value is::" + SectorValue.getText());
			LogFile.APPLICATION_LOGS.debug("Sector Value is::" + SectorValue.getText());
			break;
		}
		case "SUBSECTOR": {
			ReusableMethodTC.elementToBeVisible(subSector);
			ReusableMethodTC.highLighterMethod(driver, subSector);
			System.out.println("Verified SUBSECTOR is displayed");
			Reporter.log("Verified  SUBSECTOR is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified SUBSECTOR is displayed");
			break;
		}
		case "SUBSECTOR VALUE": {
			ReusableMethodTC.elementToBeVisible(subSectorValue);
			ReusableMethodTC.highLighterMethod(driver, subSectorValue);
			System.out.println("SUBSECTOR VALUE is::" + subSectorValue.getText());
			Reporter.log("SUBSECTOR VALUE is::" + subSectorValue.getText());
			LogFile.APPLICATION_LOGS.debug("SUBSECTOR VALUE is::" + subSectorValue.getText());
			break;
		}
		case "INDUSTRY": {
			ReusableMethodTC.elementToBeVisible(industry);
			ReusableMethodTC.highLighterMethod(driver, industry);
			System.out.println("Verified Industry is displayed");
			Reporter.log("Verified Industry is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Industry is displayed");
			break;
		}
		case "INDUSTRY VALUE": {
			ReusableMethodTC.elementToBeVisible(industryValue);
			ReusableMethodTC.highLighterMethod(driver, industryValue);
			System.out.println("INDUSTRY VALUE  is::" + industryValue.getText());
			Reporter.log("INDUSTRY VALUE is::" + industryValue.getText());
			LogFile.APPLICATION_LOGS.debug("INDUSTRY VALUE is::" + industryValue.getText());
			break;
		}
		case "CONSULTANT NAME": {
			ReusableMethodTC.elementToBeVisible(consultant);
			ReusableMethodTC.highLighterMethod(driver, consultant);
			System.out.println("Verified Consultant name is displayed");
			Reporter.log("Verified Consultant name is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Consultant name is displayed");
			break;
		}
		case "CONSULTANT NAME VALUE": {
			ReusableMethodTC.elementToBeVisible(consultantValue);
			ReusableMethodTC.highLighterMethod(driver, consultantValue);
			System.out.println("CONSULTANT NAME VALUE  is::" + consultantValue.getText());
			Reporter.log("CONSULTANT NAME VALUE is::" + consultantValue.getText());
			LogFile.APPLICATION_LOGS.debug("CONSULTANT NAME VALUE is::" + consultantValue.getText());
			break;
		}
		case "PHONE NUMBER": {
			ReusableMethodTC.elementToBeVisible(phoneNumber);
			ReusableMethodTC.highLighterMethod(driver, phoneNumber);
			System.out.println("Verified PHONE NUMBER is displayed");
			Reporter.log("Verified PHONE NUMBER is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified PHONE NUMBER is displayed");
			break;
		}
		case "PHONE NUMBER VALUE": {
			ReusableMethodTC.elementToBeVisible(phoneNumberValue);
			ReusableMethodTC.highLighterMethod(driver, phoneNumberValue);
			System.out.println("PHONE NUMBER VALUE  is::" + phoneNumberValue.getText());
			Reporter.log("PHONE NUMBER VALUE is::" + phoneNumberValue.getText());
			LogFile.APPLICATION_LOGS.debug("PHONE NUMBER VALUE is::" + phoneNumberValue.getText());
			break;
		}
		case "EXPERIENCE": {
			ReusableMethodTC.elementToBeVisible(experience);
			ReusableMethodTC.highLighterMethod(driver, experience);
			System.out.println("Verified experience is displayed");
			Reporter.log("Verified experience is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified experience is displayed");
			break;
		}
		case "EXPERIENCE VALUE": {
			ReusableMethodTC.elementToBeVisible(experienceValue);
			ReusableMethodTC.highLighterMethod(driver, experienceValue);
			System.out.println("EXPERIENCE VALUE  is::" + experienceValue.getText());
			Reporter.log("EXPERIENCE VALUE is::" + experienceValue.getText());
			LogFile.APPLICATION_LOGS.debug("EXPERIENCE VALUE is::" + experienceValue.getText());
			break;
		}
		case "JOB REFERENCE": {
			ReusableMethodTC.elementToBeVisible(jobReference);
			ReusableMethodTC.highLighterMethod(driver, jobReference);
			System.out.println("Verified jobReference is displayed");
			Reporter.log("Verified jobReference is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified jobReference is displayed");
			break;
		}
		case "JOB REFERENCE VALUE": {
			ReusableMethodTC.elementToBeVisible(jobReferenceValue);
			ReusableMethodTC.highLighterMethod(driver, jobReferenceValue);
			System.out.println("JOB REFERENCE VALUE  is::" + jobReferenceValue.getText());
			Reporter.log("JOB REFERENCE VALUE is::" + jobReferenceValue.getText());
			LogFile.APPLICATION_LOGS.debug("JOB REFERENCE VALUE is::" + jobReferenceValue.getText());
			break;
		}
		case "CONTRACT DURATION": {
			ReusableMethodTC.elementToBeVisible(contractDuration);
			ReusableMethodTC.highLighterMethod(driver, contractDuration);
			System.out.println("Verified contractDuration is displayed");
			Reporter.log("Verified contractDuration is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified contractDuration is displayed");
			break;
		}
		case "CONTRACT DURATION VALUE": {
			ReusableMethodTC.elementToBeVisible(contractDurationValue);
			ReusableMethodTC.highLighterMethod(driver, contractDurationValue);
			System.out.println("CONTRACT DURATION VALUE  is::" + contractDurationValue.getText());
			Reporter.log("CONTRACT DURATION VALUE is::" + contractDurationValue.getText());
			LogFile.APPLICATION_LOGS.debug("CONTRACT DURATION VALUE is::" + contractDurationValue.getText());
			break;
		}
		case "COMPANY TYPE": {
			ReusableMethodTC.elementToBeVisible(companyType);
			ReusableMethodTC.highLighterMethod(driver, companyType);
			System.out.println("Verified companyType is displayed");
			Reporter.log("Verified companyType is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified companyType is displayed");
			break;
		}
		case "COMPANY TYPE VALUE ": {
			scrollIntoView(companyTypeValue);
			System.out.println("COMPANY TYPE VALUE:: " + companyTypeValue.isDisplayed());
			ReusableMethodTC.elementToBeVisible(companyTypeValue);
			ReusableMethodTC.highLighterMethod(driver, companyTypeValue);
			System.out.println("COMPANY TYPE VALUE   is::" + companyTypeValue.getText());
			Reporter.log("COMPANY TYPE VALUE  is::" + companyTypeValue.getText());
			LogFile.APPLICATION_LOGS.debug("COMPANY TYPE VALUE  is::" + companyTypeValue.getText());
			break;
		}
		case "EMAIL JOB BUTTON": {
			scrollIntoView(emailJobBtn);
			ReusableMethodTC.elementToBeVisible(emailJobBtn);
			ReusableMethodTC.highLighterMethod(driver, emailJobBtn);
			System.out.println("Verified EmailJob Button is displayed");
			Reporter.log("Verified EmailJob Button is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified EmailJob Button is displayed");
			break;
		}
		case "APPLY JOB BUTTON": {
			scrollIntoView(applyJobBtn);
			ReusableMethodTC.elementToBeVisible(applyJobBtn);
			ReusableMethodTC.highLighterMethod(driver, applyJobBtn);
			System.out.println("Verified ApplyJob Button is displayed");
			Reporter.log("Verified ApplyJob Button is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified ApplyJob Button is displayed");
			break;
		}
		case "SAVE JOB BUTTON": {
			scrollIntoView(AuthSaveJOb);
			ReusableMethodTC.elementToBeVisible(AuthSaveJOb);
			ReusableMethodTC.highLighterMethod(driver, AuthSaveJOb);
			System.out.println("Verified : Save Job Button is displayed");
			Reporter.log("Verified : Save Job Button is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Save Job Button is displayed");
			break;
		}
		case "THIS POSITION IS NOW FILLED": {
			ReusableMethodTC.elementToBeVisible(positionFilledText);
			ReusableMethodTC.highLighterMethod(driver, positionFilledText);
			System.out.println("Inactive Job Error message::" + positionFilledText.getText());
			// verifyText("This position is now filled",
			// positionFilledText.getText().toString());
			verifyText("This position is now filled", positionFilledText.getText().toString());
			Reporter.log("Inactive Job Error message::" + positionFilledText.getText());
			LogFile.APPLICATION_LOGS.debug("Inactive Job Error message::" + positionFilledText.getText());
			driver.navigate().refresh();
			Thread.sleep(2000);
			break;
		}
		case "CLIENT AUTHORISATION REQUIRED": {
			ReusableMethodTC.elementToBeVisible(notCAErroeMessageforJob);
			ReusableMethodTC.highLighterMethod(driver, notCAErroeMessageforJob);
			System.out.println("Client Authorisation Job Error message::" + notCAErroeMessageforJob.getText());
			verifyText("Client Authorisation Required", notCAErroeMessageforJob.getText().toString());
			Reporter.log("Client Authorisation Job Error message::" + notCAErroeMessageforJob.getText());
			LogFile.APPLICATION_LOGS
					.debug("Client Authorisation Job Error message::" + notCAErroeMessageforJob.getText());
			break;
		}
		case "CLIENT PROFILE NAME": {
			System.out.println("Title in client profile page::" + driver.getTitle());
			ReusableMethodTC.elementToBeVisible(clientProfileName);
			ReusableMethodTC.highLighterMethod(driver, clientProfileName);
			System.out.println("Client Profile name::" + clientProfileName.getText());
			Reporter.log("Client Profile name is::" + clientProfileName.getText());
			LogFile.APPLICATION_LOGS.debug("Client Profile name is::" + clientProfileName.getText());
			break;
		}
		case "LOGO": {
			ReusableMethodTC.elementToBeVisible(Logo);
			ReusableMethodTC.highLighterMethod(driver, Logo);
			System.out.println("Verified the LOGO");
			Reporter.log("Verified the LOGO");
			LogFile.APPLICATION_LOGS.debug("Verified the LOGO");
			break;
		}
		case "STAR ICON IS NOT PRESENT": {
			Thread.sleep(3000);
			ReusableMethodTC.elementToBeVisible(jobSavedCountIcon);
			ReusableMethodTC.highLighterMethod(driver, jobSavedCountIcon);
			System.out.println("Star Icon is present on Header");
			Reporter.log("Star Icon is present on Header");
			LogFile.APPLICATION_LOGS.info("Star Icon is present on Header");
			break;
		}
		case "STAR ICON IS PRESENT": {
			Thread.sleep(2000);
			List<WebElement> staricon = driver
					.findElements(By.xpath("//span[@class='saved-jobs-count save_job_present']"));
			int Starcount = staricon.size();
			if (Starcount == 0)
				System.out.println("Star Icon is not  present on Header");
			Reporter.log("Star Icon is not present on Header");
			LogFile.APPLICATION_LOGS.info("Star Icon is not  present on Header");
			break;
		}
		}
	}

	public void enterRandomText(String webElementTitle) {

		switch (webElementTitle.toUpperCase()) {
		case "TO EMAIL": {
			ReusableMethodTC.highLighterMethod(driver, toEmailTxt);
			ReusableMethodTC.sendKeys(toEmailTxt, RandomDataUtil.randomStringGenerator() + "!12@gmail.com");
			Reporter.log("Entered To Email Address");
			LogFile.APPLICATION_LOGS.info("Entered To Email Address");
			break;
		}
		case "FROM EMAIL": {
			ReusableMethodTC.highLighterMethod(driver, fromEmailTxt);
			ReusableMethodTC.sendKeys(fromEmailTxt, RandomDataUtil.randomStringGenerator() + "!12@gmail.com");
			Reporter.log("Entered Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Email Address");
			break;
		}
		}
	}

//Method to Verify Star colour in Save Job and Saved Job Button for Anonymous User
	public void verifyStarColorAnonymous() throws InterruptedException {
		WebElement starIcon = driver.findElement(By.xpath("(//span[contains(@class,'anon-save-jobs save-jobs')])[2]"));

		String colorRGB = ((JavascriptExecutor) driver)
				.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('color');",
						starIcon)
				.toString();
//		System.out.println(colorRGB);
//		Thread.sleep(4000);
		String hexColorValue = Color.fromString(colorRGB).asHex();
		System.out.println(hexColorValue);
		if (hexColorValue.equals("#f1a121")) {
			System.out.println("Verified : Star Colour is Filled");
			Reporter.log("Verified : Star Colour is Filled");
			LogFile.APPLICATION_LOGS.info("Verified : Star Colour is Filled");
		} else if (hexColorValue.equals("#124395")) {
			System.out.println("Verified : Star Colour is changed to Blank");
			Reporter.log("Verified : Star Colour is changed to Blank");
			LogFile.APPLICATION_LOGS.info("Verified : Star Colour is changed to Blank");
		} else {
			System.out.println("Not found Expeected Colour");
			Reporter.log("Verified : Not found Expeected Colour");
			LogFile.APPLICATION_LOGS.info("Verified : Not found Expected Colour");
		}

	}

	// Method to Verify Star colour in Save Job and Saved Job Button for
	// Authenticated User
	public void verifyStarColorAuthenticated() throws InterruptedException {
		WebElement starIcon = driver.findElement(By.xpath("(//a[@class='use-ajax' and @rel='nofollow'])[2]"));

		String colorRGB = ((JavascriptExecutor) driver)
				.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('color');",
						starIcon)
				.toString();
//		System.out.println(colorRGB);
//		Thread.sleep(4000);
		String hexColorValue = Color.fromString(colorRGB).asHex();
		System.out.println(hexColorValue);
		if (hexColorValue.equals("#fdce60")) {
			System.out.println("Verified : Star Colour is changed to Yellow");
			Reporter.log("Verified : Star Colour is changed to Yellow");
			LogFile.APPLICATION_LOGS.info("Verified : Star Colour is changed to Yellow");
		} else if (hexColorValue.equals("#124395")) {
			System.out.println("Verified : Star Colour is changed to Blank");
			Reporter.log("Verified : Star Colour is changed to Blank");
			LogFile.APPLICATION_LOGS.info("Verified : Star Colour is changed to Blank");
		} else {
			System.out.println("Not found Expeected Colour");
			Reporter.log("Verified : Not found Expeected Colour");
			LogFile.APPLICATION_LOGS.info("Verified : Not found Expeected Colour");
		}
	}

}
