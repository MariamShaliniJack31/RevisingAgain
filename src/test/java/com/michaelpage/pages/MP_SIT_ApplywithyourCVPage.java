package com.michaelpage.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.michaelpage.common.utils.RandomDataUtil;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_ApplywithyourCVPage extends ReusableMethodTC {
	String passWord = Dto.getPassword();
	// Apply with your CV Page - Apply with your CV text
	@FindBy(xpath = "//label[contains(text(),'Apply with your CV')]")
	public WebElement ApplywithyourCVtext;
	// Apply with your CV Page - Email
	@FindBy(xpath = "//input[@type='email']")
	public WebElement emailTxb;
	// Apply with your CV Page - FirstName
	@FindBy(xpath = "//input[@id='edit-mp-first-name']")
	public WebElement firstNameTxb;
	// Apply with your CV Page - LastName
	@FindBy(xpath = "//input[@id='edit-mp-last-name']")
	public WebElement lastNameTxb;
	// Apply with your CV Page - Browse button
	@FindBy(xpath = "//a[@class='button browse']")
	public WebElement browseBtn;
	// Apply with your CV Page - Can Not Be Uploaded text
	@FindBy(xpath = "//div[@class='messages--error file-upload-js-error']")
	public WebElement canNotBeUploadedErrorMsg;

	// Apply with your CV Page - Max size error
	@FindBy(xpath = "//div[@class='form-item--error-message']")
	public WebElement maxSizeCVError;

	@FindBy(xpath = "//*[@id='edit-mp-user-mail-error']")
	public WebElement emailError;
	@FindBy(xpath = "//*[@id='edit-mp-first-name-error']")
	public WebElement FNameError;;
	@FindBy(xpath = "//*[@id='edit-mp-last-name-error']")
	public WebElement LNameError;
	// Apply with your CV Page -Next Button
	@FindBy(xpath = "//input[@id='option-next-button']")
	public WebElement nextBtn;
	// Apply with your CV Page -Next Button
	@FindBy(xpath = "//*[@value='Suivant']")
	public WebElement frencJobnextBtn;

	// Apply with your CV Page - Upload CV
	@FindBy(xpath = "//*[contains(@id,'edit-field-cv')]//a[contains(text(),'Upload CV')]")
	public WebElement UploadCVlink;

	// Apply with your CV Page - Upload CV link after uploading a CV
	@FindBy(xpath = "//*[contains(@id,'edit-field-cv-1')]//a[contains(text(),'Upload CV')]")
	public WebElement UploadCVlinkAfter1Upload;

	// Apply with your CV Page - Upload CV link after uploading a CV
	@FindBy(xpath = "//div[contains(@id,'edit-field-cv-2')]//a[contains(text(),'Upload CV')]")
	public WebElement UploadCVlinkAfter2Upload;

	// Apply with your CV Page - dropBox button
	@FindBy(xpath = "//a[@class='button dropbox-chooser']//span")
	public WebElement dropBoxLink;

	// Apply with your CV Page - googleDrive button
	@FindBy(xpath = "//a[@class='button google-picker']//span")
	public WebElement googleDriveLInk;

	// Apply with your CV Page - oneDrive button
	@FindBy(xpath = "//a[@class='button one-drive-picker']//span")
	public WebElement oneDriveLink;

	// Apply with your CV Page - show option button
	@FindBy(xpath = "//div[@class='file-list']/ul/li/a")
	public WebElement showOption;

	// Apply with your CV Page - delete button
	@FindBy(xpath = "//div[@class='file-list']/ul/li/span[2]/a[1]")
	public WebElement DeleteBtn;

	// Apply with your CV Page - oneDrive button
	@FindBy(xpath = "//div[@class='file-list']/ul/li//span/a[2]")
	public WebElement viewCVBtn;

	// Apply with your CV Page - Uploaded file name
	@FindBy(xpath = "//a[@class='file-view-link menu-item__link']")
	public WebElement uploadedFileName;

//	// Apply with your CV Page - show option button
//	@FindBy(xpath = "//a[contains(@class,'show-options')]")
//	public WebElement showOption;
//
//	// Apply with your CV Page - delete button
//	@FindBy(xpath = "//a[contains(@class,'remove-link')]")
//	public WebElement DeleteBtn;
//
//	// Apply with your CV Page - oneDrive button
//	@FindBy(xpath = "//a[@class='show-options']//following::a[text()='View CV']")
//	public WebElement viewCVBtn;
//
//	// Apply with your CV Page - Uploaded file name
//	@FindBy(xpath = "//*[contains(@class,'file-view-link')]")
//	public WebElement uploadedFileName;

	// Apply with your CV Page -SPINNER loading
	@FindBy(xpath = "//div[@class='upload-spinner']//i")
	public WebElement spinner;

	// Apply with Linked in Page - Apply with Linkedin text
	@FindBy(xpath = "//label[contains(text(),'Apply with LinkedIn')]")
	public WebElement ApplywithLinkedInText;

	/******************** Aplly with your CV page *********************/
	// Apply with your cv radio button
	@FindBy(xpath = "//*[@id='edit-job-apply-method']//*[text()='Apply with your CV']")
	public WebElement radioButtonApplywithyourCV;

	// Apply with your cv header in apply with your cv page
	@FindBy(xpath = "//h2[@class='heading']")
	public WebElement headerApplyWithYourCV;

	@FindBy(xpath = "//span[@class='status-msg-text']")
	public WebElement successfullyCVUploadMSG;

	// Apply now button in apply with your cv page
	@FindBy(xpath = "//input[@class='form-submission-button button js-form-submit form-submit']")
	public WebElement applyNowButton;

	@FindBy(xpath = "//a[text()='Standard Conditions for Recruitment Services']")
	public WebElement StandardCondtiontxt;

	@FindBy(xpath = "//a[text()='Terms and Conditions']")
	public WebElement Termsandconditiontxt;

	@FindBy(xpath = "//a[text()='Privacy Policy']")
	public WebElement PrivacyPolicytxt;

	// Apply With your CV- already applied Text
	@FindBy(xpath = "//div[@class='already-applied']/div/h3")
	public WebElement alreadyAppliedLabel;
	
	@FindBy(xpath = "//input[@id='edit-next']")
	public WebElement Nextbtn;

	@FindBy(xpath = "//span[@class='uploaded-file']/parent::li")
	public WebElement FilePanel;

	@FindBy(xpath = "//span[@class='uploaded-file']/a")
	public WebElement uploadedlabel;

	// Apply with your CV Page - Upload CV link after uploading a CV
	@FindBy(xpath = "//div[contains(@id,'edit-field-cv-1')]//a[contains(text(),'Upload CV')]")
	public WebElement UploadCVlinkAfterUpload;
	// Apply with your CV Page - Maximum number of CVs reached
	@FindBy(xpath = "//*[@id='mp_job_apply']/div/div[6]/div[2]")
	public WebElement maxCVreachedTxt;

	@FindBy(xpath = "//span[@class='status-msg-text']")
	public WebElement applylabel;

	@FindBy(xpath = "//a[contains(text(),'Back to Search')]")
	public WebElement Searchbtn;

	@FindBy(xpath = "//h2[@class='ty-title']")
	public WebElement applicationreceivedlabel;

	// create new account text box in apply with your cv page
	@FindBy(xpath = "//input[@type='checkbox']//following-sibling::label[contains(text(),'Create an account')]")
	public WebElement createAccountCheckBox;

	// Password text box in apply with your cv page
	@FindBy(xpath = "//*[text()='Enter the password']//following-sibling::input[1]")
	public WebElement passwordTextBoxUploadPage;

	// How would you like to apply header in job details page
	@FindBy(xpath = "//*[contains(text(),'How would you')]")
	public WebElement howWouldYouLikeToApplyHeader;

	// Apply with your CV Page - ReApply the same job
	@FindBy(xpath = "(//div[contains(text(),'You had already applied for the job, do you want to reapply?')])[1]")
	public WebElement reApplySameJob;

	// Apply with your CV Page -Previous Button
	@FindBy(xpath = "//a[contains(text(),'Previous')]")
	public WebElement previousBtn;

	// Apply with your CV page - Job Banner
	@FindBy(xpath = "//div[@class='job-apply-block-container']")
	public WebElement JobBanner;

	// Apply with your CV page - Email Address text
	@FindBy(xpath = "//label[contains(text(),'Email address')]")
	public WebElement EmailAddresstext;

	// Apply with your CV page - First Name text
	@FindBy(xpath = "//label[contains(text(),'First')]")
	public WebElement FirstNametext;

	// Apply with your CV page - Last Name text
	@FindBy(xpath = "//label[contains(text(),'Last')]")
	public WebElement LastNametext;

	// Apply with your CV page - Phone Number text
	@FindBy(xpath = "//label[contains(text(),'Phone Number (Optional)')]")
	public WebElement PhoneNumbertext;

	// Apply with your CV page - Step text
	@FindBy(xpath = "//span[@class='steps']")
	public WebElement Steptext;

	// Apply With Your CV- Apply CV text
	@FindBy(xpath = "//div[@class='cv-upload-options']")
	public WebElement YourCVlabel;

	// Apply With Your CV- By clicking you are agreeing to all the terms check box
	@FindBy(xpath = "//*[@class='option js-form-required form-required']")
	public WebElement agreeingAllterms;

	// Apply With Your CV- By clicking you are agreeing to all the terms check box
	@FindBy(xpath = "(//input[contains(@id,'edit-next')])[2]")
	public WebElement NextbtnNew;

	// Apply With Your CV- By clicking you are agreeing to all the terms check box
	@FindBy(xpath = "//*[@id='edit-mp-phone-number']")
	public WebElement phonNumber;

	static String email = RandomDataUtil.randomStringGenerator() + "2@automation.com";
	static String firstName = RandomDataUtil.randomStringGenerator();
	static String lastName = RandomDataUtil.randomStringGenerator();
	static String phoneNo = "85858585";

	public MP_SIT_ApplywithyourCVPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyTextMessage(String webElementTitle) throws Throwable {

		switch (webElementTitle.toUpperCase()) {
		case "APPLY WITH YOUR CV": {
			ReusableMethodTC.elementToBeVisible(ApplywithyourCVtext);
			ReusableMethodTC.highLighterMethod(driver, ApplywithyourCVtext);
			ReusableMethodTC.verifyText("Apply with your CV", ApplywithyourCVtext.getText());
			System.out.println("Verified :  " + ApplywithyourCVtext.getText() + "  page displayed Successfully");
			Reporter.log("Verified : " + ApplywithyourCVtext.getText() + " page displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Apply with your CV page displayed Successfully");
			break;
		}
		case "APPLY WITH YOUR CV AS HEADER": {
			ReusableMethodTC.elementToBeVisible(headerApplyWithYourCV);
			ReusableMethodTC.highLighterMethod(driver, headerApplyWithYourCV);
			ReusableMethodTC.verifyText("Apply with your CV", headerApplyWithYourCV.getText());
			System.out.println("Verified : " + headerApplyWithYourCV.getText() + "  page is displayed Successfully");
			Reporter.log("Verified : " + headerApplyWithYourCV.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : Apply with your CV page is displayed Successfully");
			break;
		}
		case "INVALID FILEEXTENSION ERROR": {
			Thread.sleep(3000);
			scrollIntoView(canNotBeUploadedErrorMsg);
			ReusableMethodTC.elementToBeVisible(canNotBeUploadedErrorMsg);
			ReusableMethodTC.highLighterMethod(driver, canNotBeUploadedErrorMsg);
			Assert.assertTrue(canNotBeUploadedErrorMsg.getText().contains("The selected file"));
			System.out.println("Verified : The file extension error is: "
					+ canNotBeUploadedErrorMsg.getText().toString() + " is displayed");
			Reporter.log("Verified : The file extension error is: " + canNotBeUploadedErrorMsg.getText().toString()
					+ " is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The file extension error is: "
					+ canNotBeUploadedErrorMsg.getText().toString() + " is displayed");
			break;
		}
		case "MAX SIZE ERROR": {
			Thread.sleep(3000);
			scrollIntoView(canNotBeUploadedErrorMsg);
			ReusableMethodTC.elementToBeVisible(maxSizeCVError);
			ReusableMethodTC.highLighterMethod(driver, maxSizeCVError);
			System.out.println("Max size error::" + maxSizeCVError.getText());
			Assert.assertTrue(
					maxSizeCVError.getText().contains("The file is 8.2 MB exceeding the maximum file size of 5 MB."));
			System.out.println("Verified : The selected file  cannot be uploaded ");
			Reporter.log("Verified : The selected file  cannot be uploaded ");
			LogFile.APPLICATION_LOGS.debug("Verified : The selected file  cannot be uploaded ");
			break;
		}
		case "FRENCH JOB MAX SIZE ERROR": {
			Thread.sleep(3000);
			scrollIntoView(canNotBeUploadedErrorMsg);
			ReusableMethodTC.elementToBeVisible(maxSizeCVError);
			ReusableMethodTC.highLighterMethod(driver, maxSizeCVError);
			System.out.println("French job CV Upload error::" + maxSizeCVError.getText().toString());
			Assert.assertTrue(maxSizeCVError.getText()
					.contains("Le fichier fait 8.2 Mo, ce qui dépasse la taille maximale autorisée (5 Mo)"));
			System.out.println("Verified : The selected file cannot be uploaded ");
			Reporter.log("Verified : The selected file  cannot be uploaded ");
			LogFile.APPLICATION_LOGS.debug("Verified : The selected file  cannot be uploaded ");
			break;
		}
		case "UPLOADED FILE NAME": {
			Thread.sleep(1000);
			ReusableMethodTC.elementToBeVisible(uploadedFileName);
			ReusableMethodTC.highLighterMethod(driver, uploadedFileName);
			System.out.println("Verified the uploaded file is:: " + uploadedFileName.getText().toString());
			Reporter.log("Verified the uploaded file is:: " + uploadedFileName.getText().toString());
			LogFile.APPLICATION_LOGS.debug("Verified the uploaded file is:: " + uploadedFileName.getText().toString());
			break;
		}
		case "UPLOADED FILE NAMES": {
			Thread.sleep(1000);
			List<WebElement> uploadedCvs = driver.findElements(By.xpath("//div[@class='file-list']//li//span[1]//a"));
			for (int i = 0; i < uploadedCvs.size(); i++) {
				System.out.println("Uploaded files are::" + uploadedCvs.get(i).getText().toString());
				Reporter.log("Uploaded files are::" + uploadedCvs.get(i).getText().toString());
				LogFile.APPLICATION_LOGS.debug("Uploaded files are::" + uploadedCvs.get(i).getText().toString());
			}
			break;
		}
		case "SPINNER": {
			ReusableMethodTC.elementToBeVisible(spinner);
			ReusableMethodTC.highLighterMethod(driver, spinner);
			Reporter.log("Verified the spinner");
			LogFile.APPLICATION_LOGS.debug("Verified the spinner");
			break;
		}
		case "APPLY WITH LINKEDIN": {
			ReusableMethodTC.elementToBeVisible(ApplywithLinkedInText);
			ReusableMethodTC.highLighterMethod(driver, ApplywithLinkedInText);
			ReusableMethodTC.verifyText("Apply with LinkedIn", ApplywithLinkedInText.getText());
			System.out.println("Verified : Apply with linked in displayed Successfully");
			Reporter.log("Verified : Apply with linked in displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Apply with linked in displayed Successfully");
			break;
		}
		case "FIRST NAME": {
			ReusableMethodTC.elementToBeVisible(firstNameTxb);
			ReusableMethodTC.highLighterMethod(driver, firstNameTxb);
			System.out.println("First Name is::" + firstNameTxb.getAttribute("value").toString());
			Reporter.log("First Name is::" + firstNameTxb.getAttribute("value").toString());
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in First Name field");
			break;

		}
		case "LAST NAME": {
			ReusableMethodTC.elementToBeVisible(lastNameTxb);
			ReusableMethodTC.highLighterMethod(driver, lastNameTxb);
			System.out.println("Last Name is::" + lastNameTxb.getAttribute("value").toString());
			Reporter.log("Last Name is::" + lastNameTxb.getAttribute("value").toString());
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Last Name field");
			break;
		}
		case "EMAIL ADDRESS": {
			ReusableMethodTC.elementToBeVisible(emailTxb);
			ReusableMethodTC.highLighterMethod(driver, emailTxb);
			System.out.println("Email Address is::" + emailTxb.getAttribute("value").toString());
			Reporter.log("Email Address is::" + emailTxb.getAttribute("value").toString());
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Email Address field");
			break;
		}
		case "FIRST NAME ERROR": {
			ReusableMethodTC.elementToBeVisible(FNameError);
			ReusableMethodTC.highLighterMethod(driver, FNameError);
			System.out.println("Verified: First Name error field is::" + FNameError.getText().toString());
			Reporter.log("Verified: First Name error field is:" + FNameError.getText().toString());
			LogFile.APPLICATION_LOGS.debug("Verified: First Name error field");
			break;
		}
		case "LAST NAME ERROR": {
			ReusableMethodTC.elementToBeVisible(LNameError);
			ReusableMethodTC.highLighterMethod(driver, LNameError);
			System.out.println("Verified: Last Name error field is::" + LNameError.getText().toString());
			Reporter.log("Verified: Last Name error field is: " + LNameError.getText().toString());
			LogFile.APPLICATION_LOGS.debug("Verified: Last Name error field");
			break;
		}
		case "EMAIL ERROR": {
			ReusableMethodTC.elementToBeVisible(emailError);
			ReusableMethodTC.highLighterMethod(driver, emailError);
			System.out.println("Verified: Email Address error field is::" + emailError.getText().toString());
			Reporter.log("Verified: Email Address error field is : " + emailError.getText().toString());
			LogFile.APPLICATION_LOGS.debug("Verified Email field ERROR");
			break;
		}
		case "STANDARD CONDITIONS FOR RECRUITMENT SERVICES": {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", StandardCondtiontxt);
			ReusableMethodTC.elementToBeVisible(StandardCondtiontxt);
			ReusableMethodTC.highLighterMethod(driver, StandardCondtiontxt);
			System.out.println(StandardCondtiontxt.getText());
			ReusableMethodTC.verifyText("Standard Conditions for Recruitment Services", StandardCondtiontxt.getText());
			System.out.println("Verified : Standard Conditions for Recruitment Services is displayed Successfully");
			Reporter.log("Verified : Standard Conditions for Recruitment Services is displayed Successfully");
			LogFile.APPLICATION_LOGS
					.debug("Verified : Standard Conditions for Recruitment Services is displayed Successfully");
			break;
		}
		case "TERMS AND CONDITIONS": {
			ReusableMethodTC.elementToBeVisible(Termsandconditiontxt);
			ReusableMethodTC.highLighterMethod(driver, Termsandconditiontxt);
			ReusableMethodTC.verifyText("Terms and Conditions", Termsandconditiontxt.getText());
			System.out.println("Verified : Terms and Conditions is displayed Successfully");
			Reporter.log("Verified : Terms and Conditions is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Terms and Conditions is displayed Successfully");
			break;
		}
		case "PRIVACY POLICY": {
			ReusableMethodTC.elementToBeVisible(PrivacyPolicytxt);
			ReusableMethodTC.highLighterMethod(driver, PrivacyPolicytxt);
			ReusableMethodTC.verifyText("Privacy Policy", PrivacyPolicytxt.getText());
			System.out.println("Verified : Privacy Policy is displayed Successfully");
			Reporter.log("Verified : Privacy Policy is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Privacy Policy is displayed Successfully");
			Thread.sleep(1000);
			break;
		}
		case "UPLOAD CV": {
			try {
				Thread.sleep(1000);
			//	System.out.println("Is UploadCVlink displayed ::" + UploadCVlink.isDisplayed());
				//Reporter.log("Is UploadCVlink displayed ::" + UploadCVlink.isDisplayed());
			//	LogFile.APPLICATION_LOGS.info("Is UploadCVlink displayed ::" + UploadCVlink.isDisplayed());
			} catch (Exception e) {
				System.out.println("Is UploadCVlink displayed ::" + UploadCVlink.isDisplayed());
				Reporter.log("Is UploadCVlink displayed ::" + UploadCVlink.isDisplayed());
				LogFile.APPLICATION_LOGS.info("Is UploadCVlink displayed ::" + UploadCVlink.isDisplayed());
			System.out.println(e.getMessage());
			
			}
			break;
		}
		case "MAXIMUM NUMBER OF CVS REACHED": {
			scrollIntoView(maxCVreachedTxt);
			ReusableMethodTC.elementToBeVisible(maxCVreachedTxt);
			ReusableMethodTC.highLighterMethod(driver, maxCVreachedTxt);
			ReusableMethodTC.verifyText("Maximum number of CVs reached. To upload a new CV, please delete a CV first",
					maxCVreachedTxt.getText());
			System.out.println("Max Cv Msg::" + maxCVreachedTxt.getText().toString());
			Reporter.log("Max Cv Msg::" + maxCVreachedTxt.getText().toString());
			LogFile.APPLICATION_LOGS.debug("Max Cv Msg::" + maxCVreachedTxt.getText().toString());
			break;
		}

		case "HOW WOULD YOU LIKE TO APPLY": {
			ReusableMethodTC.elementToBeVisible(howWouldYouLikeToApplyHeader);
			ReusableMethodTC.highLighterMethod(driver, howWouldYouLikeToApplyHeader);
			ReusableMethodTC.verifyText("How would you like to apply?", howWouldYouLikeToApplyHeader.getText());
			System.out.println("Verified : " + howWouldYouLikeToApplyHeader.getText() + " is displayed Successfully");
			Reporter.log("Verified : " + howWouldYouLikeToApplyHeader.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : Application received is displayed Successfully");
			break;
		}
		case "YOU HAD ALREADY APPLIED FOR THE JOB, DO YOU WANT TO REAPPLY?": {
			ReusableMethodTC.elementToBeVisible(reApplySameJob);
			ReusableMethodTC.highLighterMethod(driver, reApplySameJob);
			ReusableMethodTC.verifyText("You had already applied for the job, do you want to reapply?",
					reApplySameJob.getText());
			System.out.println("Verified : You had already applied for the job, do you want to reapply?");
			Reporter.log("Verified : You had already applied for the job, do you want to reapply?");
			LogFile.APPLICATION_LOGS.debug("Verified : You had already applied for the job, do you want to reapply?");
			break;
		}
		case "JOBBANNER": {
			ReusableMethodTC.elementToBeVisible(JobBanner);
			ReusableMethodTC.highLighterMethod(driver, JobBanner);
			List<WebElement> Jobs = driver.findElements(By.xpath("//div[@class='job-apply-block-container']"));
			System.out.println("Job banner is displayed successfully::" + Jobs.size());
			Reporter.log("Job banner is displayed successfully:::" + Jobs.size());
			LogFile.APPLICATION_LOGS.debug("Job details is displayed successfully:::" + Jobs.size());

			break;
		}

		case "EMAIL ADDRESS FIELD": {
			ReusableMethodTC.elementToBeVisible(EmailAddresstext);
			ReusableMethodTC.highLighterMethod(driver, EmailAddresstext);
			ReusableMethodTC.verifyText("Email address", EmailAddresstext.getText());
			System.out.println("Verified that Email Address text is displayed Successfully");
			Reporter.log("Verified that Email Address text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Email Address text is displayed Successfully");
			break;
		}
		case "FIRST NAME FIELD": {
			ReusableMethodTC.elementToBeVisible(FirstNametext);
			ReusableMethodTC.highLighterMethod(driver, FirstNametext);
			Assert.assertTrue(FirstNametext.getText().contains("First"));
			System.out.println("Verified that First Name text is displayed Successfully");
			Reporter.log("Verified that First Name text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that First Name text is displayed Successfully");
			break;
		}
		case "LAST NAME FIELD": {
			ReusableMethodTC.elementToBeVisible(LastNametext);
			ReusableMethodTC.highLighterMethod(driver, LastNametext);
			Assert.assertTrue(LastNametext.getText().contains("Last"));
			System.out.println("Verified that Last Name text is displayed Successfully");
			Reporter.log("Verified that Last Name text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Last Name text is displayed Successfully");
			break;
		}
		case "PHONE NUMBER FIELD": {
			ReusableMethodTC.elementToBeVisible(PhoneNumbertext);
			ReusableMethodTC.highLighterMethod(driver, PhoneNumbertext);
			ReusableMethodTC.verifyText("Phone Number (Optional)", PhoneNumbertext.getText());
			System.out.println("Verified that Phone Number text is displayed Successfully");
			Reporter.log("Verified that Phone Number text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Phone Number text is displayed Successfully");
			break;
		}

		case "STEPS": {
			ReusableMethodTC.elementToBeVisible(Steptext);
			ReusableMethodTC.highLighterMethod(driver, Steptext);
			Assert.assertTrue(Steptext.getText().contains("Step"));
			System.out.println("Verified that Steps text is displayed Successfully");
			Reporter.log("Verified that text is displayed Successfully:: " + Steptext.getText());
			LogFile.APPLICATION_LOGS.debug("Verified that text is displayed Successfully:: " + Steptext.getText());
			break;
		}
		case "YOUR CV FIELD": {
			ReusableMethodTC.elementToBeVisible(YourCVlabel);
			ReusableMethodTC.highLighterMethod(driver, YourCVlabel);
			Assert.assertTrue(YourCVlabel.getText().contains("Your CV"));
			System.out.println("Your CV text is displayed Successfully");
			Reporter.log("Verified that Your CV text is displayed Successfully:: ");
			LogFile.APPLICATION_LOGS.debug("Verified that Your CV text is displayed Successfully:: ");
			break;
		}

		case "CHECK FIRST NAME": {
			ReusableMethodTC.elementToBeVisible(firstNameTxb);
			ReusableMethodTC.highLighterMethod(driver, firstNameTxb);
			ReusableMethodTC.verifyText("Automation", firstNameTxb.getAttribute("value"));
			System.out.println("First Name is::" + firstNameTxb.getAttribute("value").toString());
			Reporter.log("First Name is::" + firstNameTxb.getAttribute("value").toString());
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in First Name field");
			break;
		}
		case "CHECK LAST NAME": {
			ReusableMethodTC.elementToBeVisible(lastNameTxb);
			ReusableMethodTC.highLighterMethod(driver, lastNameTxb);
			ReusableMethodTC.verifyText("MichaelPage", lastNameTxb.getAttribute("value"));
			System.out.println("Last Name is::" + lastNameTxb.getAttribute("value").toString());

			Reporter.log("Last Name is::" + lastNameTxb.getAttribute("value").toString());
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Last Name field");
			break;
		}

		case "ALREADY APPLIED": {
			ReusableMethodTC.elementToBeVisible(alreadyAppliedLabel);
			ReusableMethodTC.highLighterMethod(driver, alreadyAppliedLabel);
			Assert.assertTrue(alreadyAppliedLabel.getText().contains("You applied for this role on"));
			System.out.println(alreadyAppliedLabel.getText().toString());

			Reporter.log(alreadyAppliedLabel.getText().toString());
			LogFile.APPLICATION_LOGS.debug(alreadyAppliedLabel.getText().toString());
			break;
		}
		case "CHECK EMAIL ADDRESS": {
			ReusableMethodTC.elementToBeVisible(emailTxb);
			ReusableMethodTC.highLighterMethod(driver, emailTxb);
			ReusableMethodTC.verifyText("Automation.SIT@gmail.com", emailTxb.getAttribute("value"));
			System.out.println("Email Address is::" + emailTxb.getAttribute("value").toString());

			Reporter.log("Email Address is::" + emailTxb.getAttribute("value").toString());
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Email Address field");
			break;
		}
		}
	}

	public void enterRandomText(String webElementTitle) {

		switch (webElementTitle.toUpperCase()) {
		case "FIRST NAME": {

			ReusableMethodTC.highLighterMethod(driver, firstNameTxb);
			ReusableMethodTC.sendKeys(firstNameTxb, firstName);
			ReusableMethodTC.sendKeys(firstNameTxb, Keys.TAB);
			System.out.println("Entered First Name is:: " + firstName);
			Reporter.log("Entered First Name is:: " + firstName.toString());
			LogFile.APPLICATION_LOGS.info("Entered First Name");
			break;
		}
		case "LAST NAME": {
			ReusableMethodTC.highLighterMethod(driver, lastNameTxb);
			ReusableMethodTC.sendKeys(lastNameTxb, lastName);
			ReusableMethodTC.sendKeys(lastNameTxb, Keys.TAB);
			Reporter.log("Entered Last Name is::" + lastName.toString());
			LogFile.APPLICATION_LOGS.info("Entered Last Name is" + lastName);
			break;
		}
		case "PHONE NUMBER": {
			ReusableMethodTC.highLighterMethod(driver, phonNumber);
			ReusableMethodTC.sendKeys(phonNumber, phoneNo);
			ReusableMethodTC.sendKeys(phonNumber, Keys.TAB);
			Reporter.log("Entered Last Name is::" + lastName.toString());
			LogFile.APPLICATION_LOGS.info("Entered Last Name is" + lastName);
			break;
		}
		case "EMAIL ADDRESS": {
			ReusableMethodTC.highLighterMethod(driver, emailTxb);
			ReusableMethodTC.sendKeys(emailTxb, RandomDataUtil.randomStringGenerator() + "12@gmail.com");
			ReusableMethodTC.sendKeys(emailTxb, Keys.TAB);
			Reporter.log("Entered Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Email Address");
			break;
		}

		case "INVALID FIRST NAME": {
			ReusableMethodTC.highLighterMethod(driver, firstNameTxb);
			ReusableMethodTC.sendKeys(firstNameTxb, RandomDataUtil.randomStringGenerator() + "232!!");
			ReusableMethodTC.sendKeys(firstNameTxb, Keys.TAB);
			Reporter.log("Entered invalid First Name");
			LogFile.APPLICATION_LOGS.info("Entered invalid First Name");
			break;
		}
		case "INVALID LAST NAME": {
			ReusableMethodTC.highLighterMethod(driver, lastNameTxb);
			ReusableMethodTC.sendKeys(lastNameTxb, RandomDataUtil.randomStringGenerator() + "@#767");
			ReusableMethodTC.sendKeys(lastNameTxb, Keys.TAB);
			Reporter.log("Entered invalid Last Name");
			LogFile.APPLICATION_LOGS.info("Entered INVALID Last Name");
			break;
		}
		case "INVALID EMAIL ADDRESS": {
			ReusableMethodTC.highLighterMethod(driver, emailTxb);
			ReusableMethodTC.sendKeys(emailTxb, RandomDataUtil.randomStringGenerator() + "%^12@gmail.com" + "%#%#");
			ReusableMethodTC.sendKeys(emailTxb, Keys.TAB);
			Reporter.log("Entered invalid  Email Address");
			LogFile.APPLICATION_LOGS.info("Entered invalid  Email Address");
			break;
		}
		case "UPLOAD CV": {
			ReusableMethodTC.elementToBeInvisible(UploadCVlink);
			System.out.println("Verified 'UploadCV' link is not visible");
			Reporter.log("Verified 'UploadCV' link is not visible");
			LogFile.APPLICATION_LOGS.info("Verified 'UploadCV' link is not visible");
			break;
		}
		case "UNIQUE EMAILID": {
			ReusableMethodTC.highLighterMethod(driver, emailTxb);
			ReusableMethodTC.sendKeys(emailTxb, email);
			ReusableMethodTC.sendKeys(emailTxb, Keys.TAB);
			System.out.println("Unique Email ID:: " + email);
			Reporter.log("Entered Unique Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Unique Email Address");
			break;
		}
		case "INDIVIDUAL PASSWORD": {
			ReusableMethodTC.highLighterMethod(driver, passwordTextBoxUploadPage);
			ReusableMethodTC.sendKeys(passwordTextBoxUploadPage, passWord);
			Reporter.log("Entered unique password");
			LogFile.APPLICATION_LOGS.info("Entered unique password");
			break;
		}
		}
	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "NEXT": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, nextBtn);
			ReusableMethodTC.click(nextBtn);
			Reporter.log("Clicked on 'Next' Button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Next' Button");
			break;
		}
		case "UPLOAD CV": {
			Thread.sleep(1000);
			scrollIntoView(UploadCVlink);
			ReusableMethodTC.highLighterMethod(driver, UploadCVlink);
			ReusableMethodTC.click(UploadCVlink);
			Reporter.log("Clicked on 'UploadCV' link");
			LogFile.APPLICATION_LOGS.info("Clicked on 'UploadCV' link");
			break;
		}
		case "UPLOAD CV AGAIN": {
			Thread.sleep(2000);
			try {
				if (UploadCVlinkAfter1Upload.isDisplayed()) {
					scrollIntoView(UploadCVlinkAfter1Upload);
					ReusableMethodTC.highLighterMethod(driver, UploadCVlinkAfter1Upload);
					ReusableMethodTC.click(UploadCVlinkAfter1Upload);
					Reporter.log("Clicked on 'UploadCV' link Again");
					LogFile.APPLICATION_LOGS.info("Clicked on 'UploadCV' link Again");

				} else {
					scrollIntoView(UploadCVlinkAfter2Upload);
					ReusableMethodTC.highLighterMethod(driver, UploadCVlinkAfter2Upload);
					ReusableMethodTC.click(UploadCVlinkAfter2Upload);
					Reporter.log("Clicked on 'UploadCV' link Again");
					LogFile.APPLICATION_LOGS.info("Clicked on 'UploadCV' link Again");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case "BROWSE": {
			Thread.sleep(1000);
			scrollIntoView(browseBtn);
			ReusableMethodTC.highLighterMethod(driver, browseBtn);
			ReusableMethodTC.click(browseBtn);
			Reporter.log("Clicked on 'Browse Button' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Browse Button'");
			break;
		}
		case "DROPBOX": {
			Thread.sleep(1000);
			scrollIntoView(dropBoxLink);
			try {
				ReusableMethodTC.highLighterMethod(driver, dropBoxLink);
				ReusableMethodTC.click(dropBoxLink);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Reporter.log("Clicked on 'DROPBOX Button' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'DROPBOX Button'");
			break;
		}
		case "GOOGLE DRIVE": {
			ReusableMethodTC.highLighterMethod(driver, googleDriveLInk);
			ReusableMethodTC.click(googleDriveLInk);
			Reporter.log("Clicked on 'GOOGLE DRIVE Button' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'GOOGLE DRIVE Button'");
			break;
		}
		case "ONEDRIVE": {
			ReusableMethodTC.highLighterMethod(driver, oneDriveLink);
			ReusableMethodTC.click(oneDriveLink);
			Reporter.log("Clicked on 'ONEDRIVE Button' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'ONEDRIVE Button'");
			break;
		}
		case "DELETE": {
			Thread.sleep(2000);
			try {
				ReusableMethodTC.highLighterMethod(driver, showOption);
				ReusableMethodTC.click(showOption);
				ReusableMethodTC.highLighterMethod(driver, DeleteBtn);
				ReusableMethodTC.click(DeleteBtn);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Reporter.log("Clicked on 'Delete' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Delete' button");
			break;
		}
		case "APPLY WITH YOUR CV RADIO BUTTON": {
			ReusableMethodTC.elementToBeVisible(radioButtonApplywithyourCV);
			ReusableMethodTC.highLighterMethod(driver, radioButtonApplywithyourCV);
			if (radioButtonApplywithyourCV.isSelected()) {
				System.out.println("APPLY WITH YOUR CV Radio button is Already Selected");
				Reporter.log("APPLY WITH YOUR CV Radio button is Already Selected");
				LogFile.APPLICATION_LOGS
						.info("Clicked on 'APPLY WITH YOUR CV' radio button in apply with your CV pages");
			} else {
				ReusableMethodTC.elementToBeVisible(radioButtonApplywithyourCV);
				ReusableMethodTC.highLighterMethod(driver, radioButtonApplywithyourCV);
				ReusableMethodTC.click(radioButtonApplywithyourCV);
				Reporter.log("Clicked on 'APPLY WITH YOUR CV' radio button in apply with your CV pages");
				LogFile.APPLICATION_LOGS
						.info("Clicked on 'APPLY WITH YOUR CV' radio button in apply with your CV pages");
				break;
			}
		}
		case "APPLY NOW": {
			scrollIntoElement(applyNowButton);
			try {
				// ReusableMethodTC.elementToBeVisible(applyNowButton);
				ReusableMethodTC.highLighterMethod(driver, applyNowButton);
				ReusableMethodTC.click(applyNowButton);
				Thread.sleep(5000);
				System.out.println("Cliked on apply now button");
				Reporter.log("Clicked on Button " + applyNowButton.getText());
				LogFile.APPLICATION_LOGS.info("Clicked on 'Apply now Button'");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				LogFile.APPLICATION_LOGS.error("Cannot find object with key -- " + e.getMessage());
			}
			break;
		}
		case "CCJOBNEXT": {
			ReusableMethodTC.highLighterMethod(driver, Nextbtn);
			ReusableMethodTC.click(Nextbtn);
			Reporter.log("Clicked on 'Next Button' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Next Button'");
			break;
		}
		case "CCJOBNEXTNEW": {
			ReusableMethodTC.highLighterMethod(driver, NextbtnNew);
			ReusableMethodTC.click(NextbtnNew);
			Reporter.log("Clicked on 'NextbtnNew' Button ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'NextbtnNew' Button");
			break;
		}
		case "APPLY WITH LINKEDIN": {
			ReusableMethodTC.elementToBeVisible(ApplywithLinkedInText);
			ReusableMethodTC.highLighterMethod(driver, ApplywithLinkedInText);
			if (ApplywithLinkedInText.isSelected()) {
				System.out.println("APPLY WITH YOUR LINKEDIN Radio button is Already Selected");
				Reporter.log("APPLY WITH LINKEDIN Radio button is Already Selected");
			} else {
				ReusableMethodTC.elementToBeVisible(ApplywithLinkedInText);
				ReusableMethodTC.highLighterMethod(driver, ApplywithLinkedInText);
				ReusableMethodTC.click(ApplywithLinkedInText);
				Reporter.log("Clicked on 'APPLY WITH LINKEDIN CV' radio button in aplly CV pages");
				LogFile.APPLICATION_LOGS
						.info("Clicked on 'APPLY WITH lINKEDIN' radio button in aplly WITH LINKEDIN pages");
				break;
			}
		}
		case "VIEW CV": {
			Thread.sleep(1000);
			ReusableMethodTC.highLighterMethod(driver, showOption);
			ReusableMethodTC.click(showOption);
			ReusableMethodTC.highLighterMethod(driver, viewCVBtn);
			ReusableMethodTC.click(viewCVBtn);
			Thread.sleep(1000);
			System.out.println("Clicked on 'VIEW CV' button");
			Reporter.log("Clicked on 'VIEW CV' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'VIEW CV' button");
			break;
		}
		case "CREATE NEW ACCOUNT CHECK BOX": {
			try {
				Thread.sleep(1000);
				if (createAccountCheckBox.isDisplayed()) {
					ReusableMethodTC.elementToBeVisible(createAccountCheckBox);
					ReusableMethodTC.highLighterMethod(driver, createAccountCheckBox);
					ReusableMethodTC.click(createAccountCheckBox);
					Reporter.log("Clicked on 'RADIO BUTTON' to create new account ");
					LogFile.APPLICATION_LOGS.info("Clicked on 'RADIO BUTTON' to create new account ");
				}
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Create new account option is not available becuse already entered exsting details");
				Reporter.log(
						"Now Create new account option is not available because you logged with exsting creadentials");
			}
			break;
		}
		case "PREVIOUS": {
			ReusableMethodTC.highLighterMethod(driver, previousBtn);
			ReusableMethodTC.click(previousBtn);
			Reporter.log("Clicked on 'Previous' Button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Previous' Button");
			break;
		}
		case "AGREEING TERMS": {
			ReusableMethodTC.highLighterMethod(driver, agreeingAllterms);
			ReusableMethodTC.click(agreeingAllterms);
			Reporter.log("Clicked on 'By clicking you are agreeing to all the terms' Checkbox Button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'By clicking you are agreeing to all the terms' Checkbox Button");
			break;
		}
		}
	}

	public void uploadFileWithDiffFormat(String webElementTitle) throws Throwable {

		switch (webElementTitle) {
		case "docx": {
			ReusableMethodTC.uploadFile(browseBtn, "CV - Kylie Minogue_docx_Format.docx");
			Reporter.log("docx File Uploaded");
			break;
		}
		case "doc": {
			ReusableMethodTC.uploadFile(browseBtn, "dummy digital cv london_doc_Format.doc");
			Reporter.log("doc File Uploaded");
			break;
		}
		case "pdf": {
			ReusableMethodTC.uploadFile(browseBtn, "CV - Kylie Minogue_pdf_Format.pdf");
			Reporter.log("pdf File Uploaded");
			break;
		}
		case "txt": {
			ReusableMethodTC.uploadFile(browseBtn, "CV - Kylie Minogue_txt_Format.txt");
			Reporter.log("txt File Uploaded");
			break;
		}
		case "DOCX": {
			ReusableMethodTC.uploadFile(browseBtn, "CV - Kylie Minogue2_DOCX_Format.DOCX");
			Reporter.log("DOCX File Uploaded");
			break;
		}
		case "DOC": {
			ReusableMethodTC.uploadFile(browseBtn, "dummy digital cv london2_DOC_Format.DOC");
			Reporter.log("DOC File Uploaded");
			break;
		}
		case "PDF": {
			ReusableMethodTC.uploadFile(browseBtn, "CV - Kylie Minogue2_PDF_Format.PDF");
			Reporter.log("PDF File Uploaded");
			break;
		}
		case "TXT": {
			ReusableMethodTC.uploadFile(browseBtn, "CV - Kylie Minogue2_TXT_Format.TXT");
			Reporter.log("TXT File Uploaded");
			break;
		}
		case "xlsx": {
			ReusableMethodTC.uploadFile(browseBtn, "Resume_xlsx_Format.xlsx");
			break;
		}
		case "resume with max size": {
			ReusableMethodTC.uploadFile(browseBtn, "ResumeWithSize_8.2MB.TXT");
			Thread.sleep(3000);
			break;
		}

		}
	}
}
