package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.pages.MP_SIT_ApplywithyourCV_GoogleDrivePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MP_SIT_ApplywithyourCV_GoogleDrivePageStepDefination extends ExtentReportUtil {

	protected MP_SIT_ApplywithyourCV_GoogleDrivePage mpApplyWithCvgoogleDrivePage;
	WebDriver driver;
	ExtentTest logInfo = null;

	public MP_SIT_ApplywithyourCV_GoogleDrivePageStepDefination() {
		mpApplyWithCvgoogleDrivePage = new MP_SIT_ApplywithyourCV_GoogleDrivePage();
	}

	@And("^I Enter \"([^\"]*)\" field on googleDrive screen$")
	public void i_enter_field_on_googleDrive_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvgoogleDrivePage.enterText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Entered field on googleDrive screen :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I Click on \"([^\"]*)\" button on googleDrive screen$")
	public void i_click_on_button_on_googleDrive_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvgoogleDrivePage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Entered field on googleDrive screen :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I upload the CV with \"([^\"]*)\" format on googleDrive screen$")
	public void i_upload_the_cv_with_format_on_googleDrive_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvgoogleDrivePage.uploadFileinGoogleDrive(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Entered field on googleDrive screen :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Gmail signIn page then verify mail in mailInbox for new as an Anonymous user$")
	public void i_am_on_gmail_signin_page_then_verify_mail_in_mailinbox_for_new_as_an_anonymous_user()
			throws Throwable {
		try {
			mpApplyWithCvgoogleDrivePage.LunchGmailSignInURL();
			logInfo = test.createNode(new GherkinKeyword("Given"),
					"User navigates on gmail signIn page to check new mail in mailInbox");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify \"([^\"]*)\" on on googleDrive screen$")
	public void i_verify_on_on_googledrive_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvgoogleDrivePage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I verify Message on HomePage ::  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

}
