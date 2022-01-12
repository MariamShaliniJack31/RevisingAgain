package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.pages.MP_SIT_JobMatchPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MP_SIT_JobMatch_StepDefinition extends ExtentReportUtil {
	protected MP_SIT_JobMatchPage mpsitJobMatchpage;
	WebDriver driver;
	ExtentTest logInfo = null;
	static LoginTC login = new LoginTC();

	public MP_SIT_JobMatch_StepDefinition() {
		mpsitJobMatchpage = new MP_SIT_JobMatchPage();

	}

	@And("^I upload the CV with \"([^\"]*)\" format on Job Match screen$")
	public void i_upload_the_cv_format_on_job_match_screen(String webElementTitle) throws Throwable {
		try {
			mpsitJobMatchpage.uploadFileWithDiffFormat(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"),
					"I upload the file Successfully with Format::" + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify \"([^\"]*)\" label on Job Match screen$")
	public void i_verify_label_on_job_match_screen(String webElementTitle) throws Throwable {
		try {
			mpsitJobMatchpage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I click on \"([^\"]*)\" button on Job Match screen$")
	public void i_click_on_button_on_job_match_screen(String webElementTitle) throws Throwable {
		try {
			mpsitJobMatchpage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I click on button :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I enter \"([^\"]*)\" on Job Match screen$")
	public void i_enter_on_job_match_screen(String webElementTitle) throws Throwable {
		try {
			mpsitJobMatchpage.enterRandomText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Enter field on Job Match :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	 @And("^I verify \"([^\"]*)\" on Job Match screen$")
	    public void i_verify_on_job_match_screen(String webElementTitle) throws Throwable {
		try {
			mpsitJobMatchpage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"Max length is 40 :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I verify \"([^\"]*)\" of Skill field on Job Match screen$")
	public void i_verify_skill_field_on_job_match_screen(String webElementTitle) throws Throwable {
		try {
			mpsitJobMatchpage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"Skill Max length is 40 :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	
	@And("^I select \"([^\"]*)\" field on Job Match screen$")
    public void i_select_on_job_match_screen(String webElementTitle) throws Throwable {
		try {

			mpsitJobMatchpage.SelectDropdownValue(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"),
					"I selected the value :  " + webElementTitle.toString());

		} catch (Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	
	@And("^I verify \"([^\"]*)\" message on Job Match screen$")
    public void i_verify_message_on_job_match_screen(String webElementTitle) throws Throwable {
		try {
			mpsitJobMatchpage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
	}
	}

}
