package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.pages.MP_SIT_JobSearchPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MP_SIT_JobSearchPageStepDefination extends ExtentReportUtil {
	protected MP_SIT_JobSearchPage jobSearchPage;
	WebDriver driver;
	ExtentTest logInfo = null;
	static LoginTC login = new LoginTC();

	public MP_SIT_JobSearchPageStepDefination() {
		jobSearchPage = new MP_SIT_JobSearchPage();
	}

	@And("^I click on \"([^\"]*)\" button on jobsearch page$")
	public void i_click_on_button_on_jobsearch_page(String webElementTitle) throws Throwable {
		try {
			jobSearchPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I click on button :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I verify \"([^\"]*)\" label on jobsearch page$")
	public void i_verify_label_on_jobsearch_page(String webElementTitle) throws Throwable {
		try {
			jobSearchPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then verify jobtitle and navigating to job details page as an Anonymous user$")
	public void i_am_on_michelpage_then_verify_jobtitle_and_navigating_to_job_details_page_as_an_anonymous_user()
			throws Throwable {
		try {
			login.navigateTohomePageUrl();
			test = extent.createTest(Feature.class,
					"D8-877::user Verify job title in Job search Page and navigating to job details page then go back to joblisting");
			test = test.createNode(Scenario.class,
					"Anonymous user Verify job title in Job search Page and navigating to job details page then go back to joblisting");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@When("^I enter \"([^\"]*)\" on jobsearch page$")
	public void i_enter_on_jobsearch_page(String webElementTitle) throws Throwable {
		try {
			jobSearchPage.enterRandomText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("When"),
					"I Entered job title on home page:  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify \"([^\"]*)\" on jobsearch page$")
	public void i_verify_something_on_jobsearch_page(String webElementTitle) throws Throwable {
		try {
			jobSearchPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I verify the Title :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I select \"([^\"]*)\" on jobsearch page$")
	public void i_select_something_on_jobsearch_page(String webElementTitle) throws Throwable {
		try {

			jobSearchPage.SelectDropdownValue(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"),
					"I selected the value :  " + webElementTitle.toString());

		} catch (Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify \"([^\"]*)\" on Job Search page$")
	public void i_verify_breadcrumb_on_job_search_page(String webElementTitle) throws Throwable {
		try {

			jobSearchPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("When"),
					"I verify Message on JobSearchPage :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I Click on \"([^\"]*)\" button on Job Search page$")
	public void i_click_on_sector_button_on_job_search_page(String webElementTitle) throws Throwable {
		try {

			jobSearchPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"), "I click on button :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I select \"([^\"]*)\" on Job Search page$")
	public void i_select_element_on_job_search_page(String webElementTitle) throws Throwable {
		try {

			jobSearchPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"), "I click on button :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify that dropdown is visible or not$")
	public void i_verify_that_dropdown_is_visible_or_not() throws Throwable {
		try {

			int menusize=jobSearchPage.verifySearch();
			System.out.println("The element present: "+menusize);
			if(menusize==0)
				logInfo = test.createNode(new GherkinKeyword("Then"), "The data searched is not Present  ");
			else
				logInfo = test.createNode(new GherkinKeyword("Then"), "The data searched is Present and count is:  "+menusize );

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	 @And("^I click on \"([^\"]*)\" on jobsearch page$")
		public void i_click_on_jobsearch_page(String webElementTitle) throws Throwable {
			try {
				jobSearchPage.clickOnElement(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I click on button :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @And("^I deselect \"([^\"]*)\" on Job Search page$")
	    public void i_deselect_location_on_job_search_page(String webElementTitle) throws Throwable {
		 try {

			 jobSearchPage.clickOnElement(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("And"), "I click on button :  " + webElementTitle.toString());

			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
	    }
}
