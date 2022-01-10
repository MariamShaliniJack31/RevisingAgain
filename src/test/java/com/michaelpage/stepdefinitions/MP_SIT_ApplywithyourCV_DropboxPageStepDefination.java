package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.pages.MP_SIT_ApplywithyourCV_DropboxPage;

import cucumber.api.java.en.And;

public class MP_SIT_ApplywithyourCV_DropboxPageStepDefination extends ExtentReportUtil {

	protected MP_SIT_ApplywithyourCV_DropboxPage mpApplyWithCvdropboxPage;
	WebDriver driver;
	ExtentTest logInfo = null;

	
	public MP_SIT_ApplywithyourCV_DropboxPageStepDefination() {
		mpApplyWithCvdropboxPage = new MP_SIT_ApplywithyourCV_DropboxPage();
	}

	@And("^I Enter \"([^\"]*)\" field on dropbox screen$")
	public void i_enter_field_on_dropbox_screen(String webElementTitle) throws Throwable {
		try {

			mpApplyWithCvdropboxPage.enterText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Entered field on dropbox screen :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I Click on \"([^\"]*)\" button on dropbox screen$")
	public void i_click_on_button_on_dropbox_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvdropboxPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Entered field on dropbox screen :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I upload the CV with \"([^\"]*)\" format on dropbox screen$")
	public void i_upload_the_cv_with_format_on_dropbox_screen(String webElementTitle) throws Throwable {
		try {

			mpApplyWithCvdropboxPage.uploadFileinDropBox(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Entered field on dropbox screen :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

}
