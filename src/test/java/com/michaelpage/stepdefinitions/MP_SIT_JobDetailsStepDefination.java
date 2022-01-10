package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.pages.MP_SIT_JobDetailsPage;
import com.michaelpage.pages.MP_SIT_LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MP_SIT_JobDetailsStepDefination extends ExtentReportUtil {
	protected MP_SIT_JobDetailsPage mpJobDetailsPage;
	protected MP_SIT_LoginPage loginPage;
	static LoginTC login = new LoginTC();

	WebDriver driver;
	ExtentTest logInfo = null;

	public MP_SIT_JobDetailsStepDefination() {
		mpJobDetailsPage = new MP_SIT_JobDetailsPage();
		loginPage = new MP_SIT_LoginPage();
	}

	@When("^I click on \"([^\"]*)\" button on Job details page$")
	public void i_click_on_button_on_Job_details_page(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("When"),
					"I click on button  :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify job is saved and button name is \\\"([^\\\"]*)\\\"$")
	public void i_verify_job_is_saved_and_button_name_is(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I verify job is saved and button name is :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify job is unSaved and button name is \"([^\"]*)\"$")
	public void i_verify_job_is_unSaved_and_button_name_is(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I verify job is unSaved and button name is :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify job is \"([^\"]*)\"$")
	public void i_verify_job_is(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("When"),
					"I verify Job is Saved and button name is :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to Job details page of the same job saved by Anonymous user$")
	public void i_navigate_to_Job_details_page_of_the_same_job_saved_by_Anonymous_user() throws Throwable {
		try {
			login.navigateToJobDetailsPageURL();
			Thread.sleep(5000);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I am on MichaelPage Job details page as a Authenticated user: Job details page Displayed");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I Enter \"([^\"]*)\" field on Email pop up$")
	public void i_Enter_field_on_Email_pop_up(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.enterRandomText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Enter field on Email pop up :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I logout the Application$")
	public void i_logout_the_Application() throws Throwable {
		try {
			loginPage.logOut();
			logInfo = test.createNode(new GherkinKeyword("Then"), "I logout the Application:  Logout Successfully");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I click on \"([^\"]*)\" button on Email pop up$")
	public void i_click_on_button_on_Email_pop_up(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("When"),
					"I click on button on Email pop up : Clicked on :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify \"([^\"]*)\" Message on Email pop up$")
	public void i_verify_Message_on_Email_pop_up(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("When"),
					"I verify Message on HomePage ::  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to job details page$")
	public void i_navigate_to_job_details_page() throws Throwable {
		try {
			login.navigateToJobDetailsPageURL();
			logInfo = test.createNode(new GherkinKeyword("Then"), "I am on Michelpage : Navigated to Job Details Page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify \"([^\"]*)\" block displayed in job-detail pages$")
	public void i_verify_block_displayed_in_jobdetail_pages(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I_verify_block_displayed_in_jobdetail_pages::  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify \"([^\"]*)\" are displayed at a time in job-detail pages$")
	public void i_verify_are_displayed_at_a_time_in_jobdetail_pages(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I verified 'Only 3 Similar Jobs' are displayed at a time in job-detail pages");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to CC Enabled job details page$")
	public void i_navigate_to_cc_enabled_job_details_page() throws Throwable {
		try {
			login.navigateToCCJobDetailsPageURL();
			logInfo = test.createNode(new GherkinKeyword("Then"), "I am on Michelpage : Navigated to Job Details Page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I verify \"([^\"]*)\" in job-detail pages$")
	public void i_verify_in_jobdetail_pages(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"),
					"I verify in job-detail pages:: " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I click on \"([^\"]*)\" in job-detail pages$")
	public void i_click_on_in_jobdetail_pages(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I click on job-detail pages:: " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify \"([^\"]*)\" is displyed in job details page$")
	public void i_verify_is_displyed_in_job_details_page(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I verify in job Details Page :  " + webElementTitle.toString() + "  is displayed");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to inactive job details page$")
	public void i_navigate_to_inactive_job_details_page() throws Throwable {
		try {
			login.navigateToinactiveJobURL();
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I am on Michelpage : Navigated to Inactive Job Details Page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to similar job details page$")
	public void i_navigate_to_similar_job_details_page() throws Throwable {
		try {
			login.navigateTosimilarJobURl();
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I am on Michelpage : Navigated to Similar Job Details Page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to not client authorized job details page$")
	public void i_navigate_to_not_client_authorized_job_details_page() throws Throwable {
		try {
			login.navigateTonotCAJobURL();
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I am on Michelpage : Navigated to not client authorized Job Details Page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify the Star icon colour as an Anonymous user$")
	public void i_verify_the_Star_icon_colour_as_an_Anonymous_user() throws Throwable {
		try {
			mpJobDetailsPage.verifyStarColorAnonymous();
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I verify the Star icon colour  : Verified the Star Colour");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify the Star icon colour as an Authenticated user$")
	public void i_verify_the_Star_icon_colour_as_an_Authenticated_user() throws Throwable {
		try {
			mpJobDetailsPage.verifyStarColorAuthenticated();
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I verify the Star icon colour  : Verified the Star Colour");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to job details page for French Job$")
	public void i_navigate_to_job_details_page_for_French_Job() throws Throwable {
		try {
			login.navigateToFrenchJobURL();
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I am on Michelpage : Navigated to french job Details Page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to clientprofile page$")
	public void i_navigate_to_clientprofile_page() throws Throwable {
		try {
			login.navigateToClientProfileUrl();
			logInfo = test.createNode(new GherkinKeyword("Then"), "Navigated to Client Profile page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to LOGO job details page$")
	public void i_navigate_to_logo_job_details_page() throws Throwable {
		try {
			login.navigateTologoJOBDetailsURL();
			logInfo = test.createNode(new GherkinKeyword("Then"), "Navigated to Logo Job Details page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I verify the count of saved jobs \"([^\"]*)\" in Header$")
	public void i_verify_the_count_of_saved_jobs_in_Header(String webElementTitle) throws Throwable {
		try {
			mpJobDetailsPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("When"),
					"I verify the Presence of saved jobs Star Icon ::  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
}
