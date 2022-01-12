package com.michaelpage.stepdefinitions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.pages.MP_SIT_CC_Job_Details_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MP_SIT_CC_Job_Details_StepDefination extends ExtentReportUtil {
	protected MP_SIT_CC_Job_Details_Page mpsitCCJobDetailspage;
	WebDriver driver;
	ExtentTest logInfo = null;
	public MP_SIT_CC_Job_Details_StepDefination() {
		mpsitCCJobDetailspage = new MP_SIT_CC_Job_Details_Page();
	}
	
	@Then("^I verify \"([^\"]*)\" is displayed on CC_Form$")
	public void i_verify_is_displayed_on_ccform(String webElementTitle) throws Throwable {
		try {

			mpsitCCJobDetailspage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I select \"([^\"]*)\" field on CC_Form$")
	public void i_select_field_on_ccform(String webElementTitle) throws Throwable {
		try {

			mpsitCCJobDetailspage.SelectDropdownValue(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"),
					"I selected the value :  " + webElementTitle.toString());

		} catch (Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify All Errors are displayed$")
	public void i_verify_all_errors_are_displayed() throws Throwable {
		try {
			ArrayList<String> errors = mpsitCCJobDetailspage.Error();
			for (String errormessage : errors)
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the Error :  " + errormessage);
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I Enter \"([^\"]*)\" field on CC_Form$")
	public void i_enter_field_on_ccform(String webElementTitle) throws Throwable {
		try {
			mpsitCCJobDetailspage.enterRandomText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Enter field on CC Form :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I Click on \"([^\"]*)\" button on CC_Form$")
	public void i_click_on_button_on_ccform(String webElementTitle) throws Throwable {
		try {
			mpsitCCJobDetailspage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I clicked on Button :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to PRS general CV Form page for French Job$")
    public void i_navigate_to_prs_general_cv_Form_page_for_French_Job() throws Throwable {
	 try {
		 mpsitCCJobDetailspage.launchPRSJobPageURL_ForFrenchJob();
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I am on Michelpage : Navigated to PRS general CV form Page with French Language");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	@Then("^I verify \"([^\"]*)\" field are Prepopulated on CC_Form$")
    public void i_verify_prepopulated_field_are_prepopulated_on_ccform(String webElementTitle) throws Throwable {
	 try {
			mpsitCCJobDetailspage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
}
