package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.pages.MP_SIT_WebFormPage;

import cucumber.api.java.en.When;

public class MP_SIT_WebFormPageStepDefination extends ExtentReportUtil {

	protected MP_SIT_WebFormPage webFormPage;
	WebDriver driver;
	ExtentTest logInfo = null;

	public MP_SIT_WebFormPageStepDefination() {
		webFormPage = new MP_SIT_WebFormPage();

	}

	@When("^I navigate to WebForm page$")
	public void i_navigate_to_WebForm_page() throws Throwable {
		try {
			webFormPage.launchWebFormPage();
			logInfo = test.createNode(new GherkinKeyword("Then"), "I am on Michelpage : Navigated to WebForm Page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@When("^I Click on \"([^\"]*)\" button on WebForm Page$")
	public void i_Click_on_button_on_WebForm_Page(String webElementTitle) throws Throwable {
		try {
			webFormPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I click on button :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@When("^I upload the CV with \"([^\"]*)\" format on WebForm Page$")
	public void i_upload_the_CV_with_format_on_WebForm_Page(String webElementTitle) throws Throwable {
		try {
			webFormPage.uploadFileWithDiffFormat(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"),
					"I upload the file Successfully with Format::" + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@When("^I verify \"([^\"]*)\" Message on WebForm Page$")
	public void i_verify_Message_on_WebForm_Page(String webElementTitle) throws Throwable {
		try {
			webFormPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

}
