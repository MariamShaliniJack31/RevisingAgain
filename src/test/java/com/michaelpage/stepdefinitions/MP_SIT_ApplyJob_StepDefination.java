	package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.pages.MP_SIT_JobDetailsPage;
import com.michaelpage.pages.MP_SIT_LoginPage;
import com.michaelpage.pages.MP_SIT_Upload_CVPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MP_SIT_ApplyJob_StepDefination extends ExtentReportUtil {
	protected MP_SIT_JobDetailsPage mpJobDetailsPage;
	protected MP_SIT_Upload_CVPage mpApplyWithCvPage;
	protected MP_SIT_LoginPage mploginpage;
	WebDriver driver;
	ExtentTest logInfo = null;

	public MP_SIT_ApplyJob_StepDefination() {
		mpJobDetailsPage = new MP_SIT_JobDetailsPage();
		mpApplyWithCvPage = new MP_SIT_Upload_CVPage();
		mploginpage = new MP_SIT_LoginPage();
	}

	@Given("^I navigate to job details page as an Authenticated user to verify CV Upload$")
	public void i_navigate_to_job_details_page_as_an_authenticated_user_to_verify_cv_upload() throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticatd user navigates to Job Details Page and Uploads the CV");
			logInfo = test.createNode(new GherkinKeyword("Given"),
					"I navigate to job details page as an Authenticated user: Job details page Displayed");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate upload CV and verifies Application Received Message as Authenticate user$")
	public void i_navigate_upload_cv_and_verifies_application_received_message_as_authenticate_user() throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticatd user navigates to PRS Job Details Page and Verifies the Application Received Message");
			logInfo = test.createNode(new GherkinKeyword("Given"),
					"I navigate to job details page as an Authenticated user: Job details page Displayed");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate upload CV and verifies CC Enabled form as Authenticate user$")
    public void i_navigate_upload_cv_and_verifies_cc_enabled_form_as_authenticate_user() throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticatd user navigates to CC Job Details Page and Verifies the CC Form");
			logInfo = test.createNode(new GherkinKeyword("Given"),
					"I navigate to job details page as an Authenticated user: Job details page Displayed");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
	
	@Given("^I navigate upload CV and verifies CC Enabled form as Authenticated user$")
	public void i_navigate_upload_cv_and_verifies_cc_enabled_form_as_authenticated_user() throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Anonymous user Applies the Job to verify that CC Enabled Form is Enable");
			logInfo = test.createNode(new GherkinKeyword("Given"),
					"I navigate to job details page as an Authenticated user: Job details page Displayed");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I accept alert$")
	public void i_accept_alert() throws Throwable {
		try {

			ReusableMethodTC.alertAccept_Dismiss(0);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I Cancelled the ALert pop up window");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
}
