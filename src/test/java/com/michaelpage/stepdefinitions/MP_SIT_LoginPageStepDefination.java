package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.michaelpage.common.utils.BrowserCallingTC;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.pages.MP_SIT_LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MP_SIT_LoginPageStepDefination extends ExtentReportUtil {

	protected MP_SIT_LoginPage mploginpage;
	WebDriver driver;
	ExtentTest logInfo = null;
	BrowserCallingTC bc = new BrowserCallingTC();
	LoginTC login = new LoginTC();

	public MP_SIT_LoginPageStepDefination() {
		mploginpage = new MP_SIT_LoginPage();
	}

	@Given("^I am on Michelpage$")
	public void i_am_on_MichelPage() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticated  user saves job and re-visits saved job ");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to validate emailing job$")
	public void i_am_on_Michelpage_to_validate_emailing_job() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticated user emailing job");
			logInfo = test.createNode(new GherkinKeyword("Given"),
					"I am on Michelpage to validate emailing job: Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I Enter \"([^\"]*)\" field on LoginPage$")
	public void i_Enter_field_on_LoginPage(String webElementTitle) throws Throwable {
		try {
			mploginpage.enterText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Enter field on LoginPage : " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

	@Then("^I click on \"([^\"]*)\" button on LoginPage$")
	public void i_click_on_button_on_LoginPage(String webElementTitle) throws Throwable {
		try {
			mploginpage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I click on button on Job details page : Clicked on :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for View more jobs, save and view similar jobs as an Anonymous user$")
	public void i_am_on_michelpage_for_view_more_jobs_save_and_view_similar_jobs_as_an_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"#D8-92,#D8-112::View more jobs, save and view similar jobs in job-detail pages");
			test = test.createNode(Scenario.class, "Anonymous user:Views more job, save and view similar jobs");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for View more jobs, save and view similar jobs as an Authenticated user$")
	public void i_am_on_michelpage_for_view_more_jobs_save_and_view_similar_jobs_as_an_authenticated_user()
			throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticated user:Views more job, save and view similar jobs");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to verify the job information$")
	public void i_am_on_Michelpage_to_verify_the_job_information() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user Verify full job information in Job details Page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page as an Anonymous user to verify the inactive job$")
	public void i_navigate_to_job_details_page_as_an_anonymous_user_to_verify_the_inactive_job() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-319,D8-1284: Verify inactive job");
			test = test.createNode(Scenario.class, "Anonymous user:Verify inactive job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to verify the inactive job as an Authenticated user$")
	public void i_am_on_michelpage_to_verify_the_inactive_job_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticated user:Verify inactive job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page as an Anonymous user to verify the not client authorized Jobs$")
	public void i_navigate_to_job_details_page_as_an_anonymous_user_to_verify_the_not_client_authorized_jobs()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-320:Verify not client authorized Job");
			test = test.createNode(Scenario.class, "Anonymous user:Verify not client authorized Job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to verify not client authorized Jobs as an Authenticated user$")
	public void i_am_on_michelpage_to_verify_not_client_authorized_jobs_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticated user:Verify not client authorized Job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CVs and delete as an Anonymous user$")
	public void i_am_on_michelpage_for_uploading_cvs_and_delete_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-203,D8-204,D8-205,239,1989:Eng JOb:Verify CV is uploaded from different sources,formats and size with Delete functionality");
			test = test.createNode(Scenario.class,
					"Anonymous user:Verify CV is uploaded from different formats and size with Delete functionality");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CVs and delete as an Authenticated user$")
	public void i_am_on_michelpage_for_uploading_cvs_and_delete_as_an_Authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();

			test = test.createNode(Scenario.class,
					"Authenticated user:Verify CV is uploaded from different formats and size with Delete functionality");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CV from different sources as an Anonymous user$")
	public void i_am_on_michelpage_for_uploading_cv_from_different_sources_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Anonymous user:Verify CV is uploaded from different sources");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page to verify Linkedin Option an Anonymous user$")
	public void i_navigate_to_job_details_page_to_verify_linkedin_option_an_Anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();

			test = extent.createTest(Feature.class,
					"D8-549,552::Verify user can apply English language job in linkdin");
			test = test.createNode(Scenario.class, "Anonymous user navigates to  CV Apply page to Verify Linkedin job");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page to verify Linkedin Option an Authenticated user$")
	public void i_navigate_to_job_details_page_to_verify_linkedin_option_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigates to  CV Apply page to Verify Linkedin job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to verify the pre-populated data as an Authenticated user$")
	public void i_am_on_michelpage_to_verify_the_prepopulated_data_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-467::Verify the pre-populated data as an Authenticated user in CV Upload Page");
			test = test.createNode(Scenario.class,
					"Authenticated user verifies the pre-populated data in CV Upload Page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CV with Invalid Data as an Anonymous user$")
	public void i_am_on_michelpage_for_uploading_cv_with_invalid_data_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-260,474::Uploading CV with Invalid Data");
			test = test.createNode(Scenario.class,
					"Anonymous user navigating from Job Details Page to upload cv page with invalid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CV with Invalid Data as an Authenticated user$")
	public void i_am_on_michelpage_for_uploading_cv_with_invalid_data_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated navigating from Job Details Page to upload cv page with invalid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to validate emailing for French language job as an Anonymous user$")
	public void i_am_on_Michelpage_to_validate_emailing_for_French_language_job_as_an_Anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-353::User email French language jobs to others from job-detail page");
			test = test.createNode(Scenario.class, "Anonymous user emailing job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to validate emailing for French language job as an Authenticated user$")
	public void i_am_on_Michelpage_to_validate_emailing_for_French_language_job_as_an_Authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticated user emailing job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to Job apply page to verify link of T&C,Privacy policy and Standard Conditions as Anonymous user$")
	public void i_navigate_to_job_apply_page_to_verify_link_of_tcprivacy_policy_and_standard_conditions_as_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-550::User navigates to Job apply page to verify link of T&C,Privacy policy and Standard Conditions");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to  Job apply page to verify link of T&C,Privacy policy and Standard Conditions");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

	@Given("^I navigate to Job apply page to verify link of T&C,Privacy policy and Standard Conditions as Authenticated user$")
	public void i_navigate_to_job_apply_page_to_verify_link_of_tcprivacy_policy_and_standard_conditions_as_authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigates to  Job apply page to verify link of T&C,Privacy policy and Standard Conditions");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate upload CV and verifies Application Received Message as Anonymous user$")
	public void i_navigate_upload_cv_and_verifies_application_received_message_as_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-257,258,259,264,265,266,464,487,550,929,1145,1146::User Applies a PRS Jobs and verifies the Application Received Message");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Job Details Page and Verifies Application Received Message");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate upload CV and verifies CC Enabled form as Anonymous user$")
	public void i_navigate_upload_cv_and_verifies_cc_enabled_form_as_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-258,261,277,356,357,466,595,646,904,1013,1674,3162::User Applies a CC Enabled Jobs and verifies the CC Enabled Form");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Job Details Page and Verifies CC Enabled Form");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage page then go to thank you message page as an Anonymous user$")
	public void i_am_on_michelpage_page_then_go_to_thank_you_message_page_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-262::User navigates to Job Details Page and check create new account option from Apply with your CV page with valid data");
			test = test.createNode(Scenario.class,
					"Anonymous user navigating from Job Details Page to Apply with your CV page then check create new account option with valid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate upload CV and verifies whether create new account option is enable as Authenticate user$")
	public void i_navigate_upload_cv_and_verifies_whether_create_new_account_option_is_enable_as_authenticate_user()
			throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticate user navigates to Job Details Page then check whether Create new Account option is Enable");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CV with valid Data as an Anonymous user$")
	public void i_am_on_michelpage_for_uploading_cv_with_valid_data_as_an_anonymous_user() throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-260,474::Uploading CV with valid Data");
			test = test.createNode(Scenario.class,
					" Anonymous user navigates to Job Details Page and upload cv page with valid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CV with valid Data as an Authenticated user$")
	public void i_am_on_michelpage_for_uploading_cv_with_valid_data_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigates to Job Details Page and upload cv page with valid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to validate saved and unsaved job as an Anonymous user$")
	public void i_am_on_Michelpage_to_validate_saved_and_unsaved_job_as_an_Anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-86,D8-110::Verify Job is saved successfully");
			test = test.createNode(Scenario.class, "Anonymous user saves job and re-visits saved job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage as an Anonymous user to validate emailing job$")
	public void i_am_on_Michelpage_as_an_Anonymous_user_to_validate_emailing_job() throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-87,D8-128::User email jobs to others from job-detail page");
			test = test.createNode(Scenario.class, "Anonymous user emailing job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage as an Anonymous user to Verify full job information$")
	public void i_am_on_Michelpage_as_an_Anonymous_user_to_Verify_full_job_information() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-106,D8-250::Verify Full Job Information");
			test = test.createNode(Scenario.class, "Anonymous user Verify full job information in Job details Page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {

		}
	}

	@Given("^I am on Michelpage to validate the ReApply of same job functionality as an Anonymous user$")
	public void i_am_on_Michelpage_to_validate_the_ReApply_of_same_job_functionality_as_an_Anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-1283::Candidate ReApply the same job and verify the Message");
			test = test.createNode(Scenario.class, "Anonymous user ReApply the same job and verify the Message");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to validate the ReApply of same job functionality as an Authenticate user$")
	public void i_am_on_Michelpage_to_validate_the_ReApply_of_same_job_functionality_as_an_Authenticate_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticate user ReApply the same job and verify the Message");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I verify Linkedin Option and apply Job as an Authenticated user$")
	public void i_verify_Linkedin_Option_and_apply_Job_as_an_Authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticated user navigates to Apply with LinkedIn page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page to verify Linkedin Option an Anonymous user for French Job$")
	public void i_navigate_to_job_details_page_to_verify_Linkedin_Option_an_Anonymous_user_for_French_Job()
			throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-549,552::Verify user can apply French language job in linkdin");
			test = test.createNode(Scenario.class, "Anonymous user navigates to CV Apply page to Verify Linkedin job ");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

	@Given("^I navigate to job details page to verify Linkedin Option an Authenticated user for French Job$")
	public void i_navigate_to_job_details_page_to_verify_Linkedin_Option_an_Authenticated_user_for_French_Job()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticate user navigates to CV Apply page to Verify Linkedin job");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CVs and delete for French as an Anonymous user$")
	public void i_am_on_michelpage_for_uploading_cvs_and_delete_for_french_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-203,204,205,239,1989:French job:Verify CV is uploaded from different sources,formats and size with Delete functionality");
			test = test.createNode(Scenario.class,
					"Anonymous user:Verify CV is uploaded from different formats and size with Delete functionality");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CVs and delete for French as an Authenticated user$")
	public void i_am_on_michelpage_for_uploading_cvs_and_delete_for_french_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user:Verify CV is uploaded from different formats and size with Delete functionality");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate SIT page as an Anonymous user$")
	public void i_navigate_sit_page_as_an_anonymous_user() throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "End to End flow for Anonymous user");
			test = test.createNode(Scenario.class, "Anonymous user Verifies the End to End Process");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate SIT page as an Authenticate user$")
	public void i_navigate_sit_page_as_an_authenticate_user() throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "End to End flow for Authenticate user");
			test = test.createNode(Scenario.class, "Authenticate user Verifies the End to End Process");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page to edit the details of Linkedin profile for anonymous user$")
	public void i_navigate_to_job_details_page_to_edit_the_details_of_linkedin_profile_for_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();

			test = extent.createTest(Feature.class,
					"D8-556::User navigates to Job Details Page and edit the details for Linkedin profile");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Job details page to Verify the updated details");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page to edit the details of Linkedin profile for Authenticated user$")
	public void i_navigate_to_job_details_page_to_edit_the_details_of_linkedin_profile_for_authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigates to Linkedin page to Verify the updated details");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page to edit the details of Linkedin profile as anonymous user for French Job$")
	public void i_navigate_to_job_details_page_to_edit_the_details_of_linkedin_profile_as_anonymous_user_for_french_job()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();

			test = extent.createTest(Feature.class,
					"D8-556::User navigates to Job Details Page and edit the details for French language Job in Linkedin profile ");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Linkedin page to Verify the updated details");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page to edit the details of Linkedin profile as authenticate user for French Job$")
	public void i_navigate_to_job_details_page_to_edit_the_details_of_linkedin_profile_as_authenticate_user_for_french_job()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticate user navigates to linkedin page to Verify the updated details");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to Verify CV upload validation on WebForm Page as an Anonymous user$")
	public void i_am_on_Michelpage_to_Verify_CV_upload_validation_on_WebForm_Page_as_an_Anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-818::Verify CV upload validation on WebForm Page ");
			test = test.createNode(Scenario.class, "Anonymous user Verify CV upload validation on WebForm Page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to Verify CV upload validation on WebForm Page as an Authenticated user$")
	public void i_am_on_Michelpage_to_Verify_CV_upload_validation_on_WebForm_Page_as_an_Authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticated user Verify CV upload validation on WebForm Page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page with valide data as an Anonymous user for French language$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_with_valide_data_as_an_anonymous_user_for_French_language()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-1689::User uploading CV on PRS general CV form page with valide data for French language");
			test = test.createNode(Scenario.class,
					"Anonymous user navigating from Job Details Page to PRS general CV form Page with valid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page with valide data as an Authenticated user for French language$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_with_valide_data_as_an_Authenticated_user_for_French_language()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigating from Job Details Page to PRS general CV form Page with valid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page with Invalide data as an Anonymous user for French language$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_with_Invalide_data_as_an_anonymous_user_for_French_language()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-1689::User uploading CV on PRS general CV form page with Invalide data for French language");
			test = test.createNode(Scenario.class,
					"Anonymous user navigating from Job Details Page to PRS general CV form Page with Invalid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page with Invalide data as an Authenticated user for French language$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_with_Invalide_data_as_an_Authenticated_user_for_French_language()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigating from Job Details Page to PRS general CV form Page with Invalid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page with valide data as an Anonymous user$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_with_valide_data_as_an_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-1689::User uploading CV on PRS general CV form page with valide data for English Language");
			test = test.createNode(Scenario.class,
					"Anonymous user navigating from Job Details Page to PRS general CV form Page with valid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I navigate to PRS general CV Form page$")
	public void i_navigate_to_prs_general_cv_Form_page() throws Throwable {
		try {
			mploginpage.launchPRSJobPageURL();
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I am on Michelpage : Navigated to PRS general CV form Page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page with valide data as an Authenticated user$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_with_valide_data_as_an_Authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigating from Job Details Page to PRS general CV form Page with valid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page with Invalide data as an Anonymous user$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_with_Invalide_data_as_an_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-1689::User uploading CV on PRS general CV form page with Invalide data for English Language");
			test = test.createNode(Scenario.class,
					"Anonymous user navigating from Job Details Page to PRS general CV form Page with Invalid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page with Invalide data as an Authenticated user$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_with_Invalide_data_as_an_Authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigating from Job Details Page to PRS general CV form Page with Invalid data");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate upload CV page and verifies CC and PRS Enabled form for Anonymous user$")
	public void i_navigate_upload_cv_page_and_verifies_cc_PRS_enabled_form_for_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-1867::User Applies a CC and PRS Enabled Jobs and verifies the CC and PRS Enabled Form");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Job Details Page to CC and PRS enabled form page then redirect to the CC and PRS form based on their country ");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate upload CV page and verifies CC Enabled form as Authenticate user$")
	public void i_navigate_upload_cv_page_and_verifies_cc_enabled_form_as_authenticate_user() throws Throwable {
		try {

			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigates to Job Details Page to CC and PRS enabled form page then redirect to the CC and PRS form based on their country ");
			logInfo = test.createNode(new GherkinKeyword("Given"),
					"I navigate to job details page as an Authenticated user: Job details page Displayed");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page and able to see the details which are fetched from LinkedIn profile$")
	public void i_navigate_to_job_details_page_and_able_to_see_the_details_which_are_fetched_from_LinkedIn_profile()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();

			test = extent.createTest(Feature.class,
					"D8-557,1977::User should able to see the details which are fetched from LinkedIn profile ");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Job details page and fetch the details for Linkedin profile");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page to fetch the details of Linkedin profile for Authenticated user$")
	public void i_navigate_to_job_details_page_to_fetch_the_details_of_Linkedin_profile_for_Authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigating from Job Details Page and fetch the details for Linkedin profile");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for uploading CV from Job Match as an Anonymous user$")
	public void i_am_on_michelpage_for_uploading_cv_from_job_match_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-651,D8-652,D8-656,D8-657,D8-793,D8-792::User verifies the Job Match screen from Job Match block");
			test = test.createNode(Scenario.class, "Anonymous user verifies the Job Match screen from Job Match block");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);

		}
	}

	@Given("^I am on Michelpage for uploading CV from Job Match as an Authenticated user$")
	public void i_am_on_michelpage_for_uploading_cv_from_job_match_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user verifies the Job Match screen from Job Match block");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

	@Given("^I navigate Application to verify the employer created via API as an Anonymous user$")
	public void i_navigate_application_to_verify_the_employer_created_via_api_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-332:: Verify the employer created via API");
			test = test.createNode(Scenario.class, " Anonymous user to verify the employer created via API");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);

		}
	}

	@Given("^I navigate Application to verify the employer created via API as an Authenticated user$")
	public void i_navigate_application_to_verify_the_employer_created_via_api_as_an_authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, " Authenticated user to verify the employer created via API");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);

		}
	}

	@Given("^I navigate Application to verify the LOGO created via API as an Anonymous user$")
	public void i_navigate_application_to_verify_the_LOGO_created_via_api_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-333::Verify the LOGO created via API");
			test = test.createNode(Scenario.class, " Anonymous user to verify the LOGO created via API");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);

		}
	}

	@Given("^I navigate Application to verify the LOGO created via API as an Authenticated user$")
	public void i_navigate_application_to_verify_the_LOGO_created_via_api_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, " Authenticated user to verify the LOGO created via API");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);

		}
	}

	@Given("^I am on Michelpage for uploading CV then check prepopulated details by clicking on go back link as an Anonymous user$")
	public void i_am_on_michelpage_for_uploading_cv_then_check_prepopulated_details_by_clicking_on_go_back_link_as_an_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-472::User navigates from jobdetails Page to thank you message page by uploading CV then check existing detail by clicking on go back link");
			test = test.createNode(Scenario.class,
					"Anonymous navigating from Job Details Page to thank you message page then back to previous page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on CC form page as an Anonymous user$")
	public void I_am_on_Michelpage_and_uploading_CV_on_CC_form_page_as_an_Anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-473::User Applies a job on CC and PRS form page and verifies the CC and PRS form page as CC job is enabled");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to the CC and PRS form page as CC job is enabled");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate upload CV page and verifies CC and PRS form is Enabled as Authenticated user$")
	public void i_navigate_upload_cv_page_and_verifies_cc_PRS_enabled_form_is_Enabled_as_Authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigates to the CC and PRS form page as CC job is enabled");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page as an Anonymous user$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_as_an_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-473::User uploading CV on PRS general CV form page as PRS form is enabled");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to the PRS general cv form page as PRS form is enabled ");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage and uploading CV on PRS general CV form page as an Authenticated user$")
	public void i_am_on_michelpage_and_uploading_cv_on_prs_general_cv_form_page_as_an_Authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigates to the PRS general cv form page as PRS form is enabled ");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page and with no experience and education in LinkedIn profile as an anonymous user$")
	public void i_navigate_to_job_details_page_and_with_no_experience_and_education_in_linkedin_profile_as_an_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();

			test = extent.createTest(Feature.class,
					"D8-2362,2698::User should able to fetch the details from LinkedIn profile which has no Job Experience and Education");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Job details page and fetch the details for Linkedin profile has no Job Experience and Education");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page with no experience and education in LinkedIn profile as for Authenticated user$")
	public void i_navigate_to_job_details_page_with_no_experience_and_education_in_linkedin_profile_as_for_authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigates to job details fetch the details from LinkedIn profile which has no Job Experience and Education");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to validate Count Of Saved job as an Anonymous user$")
	public void i_am_on_Michelpage_to_validate_Count_Of_Saved_job_as_an_Anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-631::Verify Count Of Saved JObs");
			test = test.createNode(Scenario.class, "Anonymous user Verify Count Of Saved JOb ");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to validate Count Of Saved job as an Authenticated user$")
	public void i_am_on_Michelpage_to_validate_Count_Of_Saved_job_as_an_Authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Anonymous user Verify Count Of Saved JOb ");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to Register user on CV Submit as Authenticate User$")
	public void i_am_on_michelpage_to_register_user_on_cv_submit_as_authenticate_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticate User navigates to Submit CV page For Register Menu");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to Register user on CV Submit as Anonymous User$")
	public void i_am_on_michelpage_to_register_user_on_cv_submit_as_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-468,D8-1881::User Submits CV and Registers on Submit CV Page");
			test = test.createNode(Scenario.class,
					"Anonymous user navigating to Submit CV page to uplaod Cv and Register");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to job details page and verify CC Enabled form as Anonymous user$")
	public void i_navigate_to_job_details_page_and_verify_cc_enabled_form_as_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-2411,559,558::User process a CC Enabled Job application form with LinkedIn profile");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Job Details Page and Verifies CC Enabled Form");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

	@Given("^I navigate to job details page and Process the CC enabled job application form as Authenticated user$")
	public void i_navigate_to_job_details_page_and_process_the_cc_enabled_job_application_form_as_authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigating from Job Details Page and fetch the details for Linkedin profile");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}

	@Given("^I navigates genral cv submit form page then signIn for Anonymous user$")
	public void i_navigates_genral_cv_submit_form_page_then_signin_for_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-1873::User navigates to genral cv submit form page then signIn for Anonymous user");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to genral cv submit form page then signIn for Anonymous user");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then verify jobtitle and navigating to job details page as an Authenticated user$")
	public void i_am_on_michelpage_then_verify_jobtitle_and_navigating_to_job_details_page_as_an_Authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user Verify job title in Job search Page and navigating to job details page then go back to joblisting");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to Job Search Page and apply filters on job listing page for anonymous user$")
	public void i_navigate_to_job_search_page_and_apply_filters_on_job_listing_page_for_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();

			test = extent.createTest(Feature.class,
					"D8-874,859,857,854::User navigate to Job Search Page and apply filters on job listing page for anonymous user");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Job Search page to Verify different filters on job listing page");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to Job Search Page and apply filters on job listing page for authenticate user$")
	public void i_navigate_to_job_search_page_and_apply_filters_on_job_listing_page_for_authenticate_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticat user navigates to Job Search Page and and view the breadcrumb when they apply filters on job listing page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for search Jobs from Job result page as an Authenticated user$")
	public void i_am_on_michelpage_for_search_jobs_from_job_result_page_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated User navigates to Home page and Search for jobs from the job result page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for search Jobs from Job result page as an Anonymous user$")
	public void i_am_on_michelpage_for_search_jobs_from_job_result_page_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-1119,D8-288,D8-290,D8-291,D8-312,D8-313,D8::Verify that candidate searching for Jobs from job result page");
			test = test.createNode(Scenario.class,
					"Anonymous User navigates to Home page and Search for jobs from the job result page");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for valid and Invalid search as Anonymous user$")
	public void i_am_on_michelpage_for_valid_and_invalid_search_as_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-292,D8-297,D8-299,D8-892,D8-897::Verify that candidate searching for Jobs from job result page");
			test = test.createNode(Scenario.class,
					"Anonymous User navigates to Home page and Search for jobs from the job result page");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for validating homepage as an Anonymous user$")
	public void i_am_on_michelpage_for_validating_homepage_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-1522,D8-1523,D8-1533,D8-1540::Anonymous User navigates to Home page to verify the Elements");
			test = test.createNode(Scenario.class, "Anonymous User navigates to Home page to verify the Elements");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for valid and Invalid search as Authenticate user$")
	public void i_am_on_michelpage_for_valid_and_invalid_search_as_authenticate_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticate User navigates to Home page and Search for jobs from the job result page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for validating homepage as an Authenticated user$")
	public void i_am_on_michelpage_for_validating_homepage_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class, "Authenticate User navigates to Home page To verify Elements");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michaelpage for viewing Featured Employers and Clients as an Anonymous user$")
	public void i_am_on_michaelpage_for_viewing_featured_employers_and_clients_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-2238,D8-1542,D8-1543,D8-1547::Verify that candidate should be able to view Featured Employers and Clients");
			test = test.createNode(Scenario.class, "Anonymous User navigates to Home page and view Featured Employees");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michaelpage for viewing Featured Employers and Clients as an Authenticated user$")
	public void i_am_on_michaelpage_for_viewing_featured_employers_and_clients_as_an_authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated User navigates to Home page and view Featured Employees");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michaelpage for viewing articles as an Anonymous user$")
	public void i_am_on_michaelpage_for_viewing_articles_as_an_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-3164,D8-625::Candidate should be able to view Articles and blocks");
			test = test.createNode(Scenario.class,
					" Anonymous User navigates to Home page and view the latest Articles");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michaelpage for viewing articles as an Authenticated user$")
	public void i_am_on_michaelpage_for_viewing_articles_as_an_authenticated_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated User navigates to Home page and view the latest Articles");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account page$")
	public void i_am_on_michelpage_then_navigating_to_my_account_page() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-708::Verify the errors by entering invalid credentials");
			test = test.createNode(Scenario.class,
					"Anonymous User navigates from michael page to my Account page then verify the errors by entering invalid credentials");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account page then login$")
	public void i_am_on_michelpage_then_navigating_to_my_account_page_then_login() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated User navigates from michael page to my Account page then verify the errors by entering valid credentials");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on michael page then navigates to signUP page$")
	public void i_am_on_michael_page_then_navigates_to_signUP_page() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-683::User navigates to my account home page then verify errors by entering invalid details on signUP page");
			test = test.createNode(Scenario.class,
					"User navigates to my account home page then verify errors by entering invalid details on signUP page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage to verifying signup functionality with new and existing email address$")
	public void I_am_on_Michelpage_to_verifying_signup_functionality_with_new_and_existing_email_address()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-684::User navigates on my account home page then check error on email already exists and check receive email after signUP");
			test = test.createNode(Scenario.class,
					"User navigates to my account home page then enter details for signUP and check error on email already exists");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then unhide password text by clicking on EyeEncyrpt option$")
	public void I_am_on_Michelpage_then_unhide_password_text_by_clicking_on_EyeEncyrpt_option() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-685::User navigates on my account home page then check error on email already exists and check receive email after signUP");
			test = test.createNode(Scenario.class,
					"User navigates to my account home page then unhide password text by clicking on EyeEncyrpt option");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigates to forgotten password page$")
	public void i_am_on_Michelpage_then_navigates_to_forgotten_password_page() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-697::User navigates to My Account page then check receive email from inbox as used password recovery link ");
			test = test.createNode(Scenario.class,
					"User navigates to my account page then click forgotten link and check receive email from inbox as used password recovery link");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michaelpage then navigates to forgotten password page and verify error$")
	public void i_am_on_michaelpage_then_navigates_to_forgotten_password_page_and_verify_error() throws Throwable {

		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-698::User navigates to My Account page then check receive email from inbox as used password recovery link ");
			test = test.createNode(Scenario.class,
					"User navigates to my account page then click forgotten link and check receive email from inbox and verify error as entered used password");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then enter jobtitle then navigating to job results page as an Anonymous user$")
	public void i_am_on_michelpage_then_enter_jobtitle_then_navigating_to_job_results_page_as_an_anonymous_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-867::User navigating from job search page to job results page then verify detail after sorting");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to genral cv submit form page then signIn for Anonymous user");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then enter jobtitle then navigating to job results page as an Authenticated user$")
	public void i_am_on_michelpage_then_enter_jobtitle_then_navigating_to_job_results_page_as_an_Authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated user navigates to genral cv submit form page then signIn for Anonymous user");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account page then login with valid creadentials$")
	public void i_am_on_michelpage_then_navigating_to_my_account_page_then_login_with_valid_creadentials()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-708::Verify status after upload CV then Remove CV on my account page");
			test = test.createNode(Scenario.class,
					"Authenticated User navigates from michael page to my Account page then uploading cv and removing cv");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account dashboard page with valid creadentials then$")
	public void i_am_on_michelpage_then_navigating_to_my_account_dashboard_page_with_valid_creadentials_then()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-2947::Verify password error message then change password from my account dashboard page");
			test = test.createNode(Scenario.class,
					"Authenticated User navigates from michael page to my Account dashboard page then changing password");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account dashboard page then verify all the titles$")
	public void i_am_on_michelpage_then_navigating_to_my_account_dashboard_page_then_verify_all_the_titles()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-686::Verify all the titles from sections and sub sections on my account dashboard page");
			test = test.createNode(Scenario.class,
					"Authenticated User navigates from michael page to my Account dashboard page then verify all the titles from sections and sub sections");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account dashboard page then Login from My DashBoard Page$")
	public void i_am_on_michelpage_then_navigating_to_my_account_dashboard_page_then_login_from_my_dashboard_page()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-701::Verify JobMatchNProfile then back to MyDashBoard Page then Login from My DashBoard Page ");
			test = test.createNode(Scenario.class,
					"Anonymous User navigates from michael page to my Account dashboard page then verify JobMatchNProfile then back to MyDashBoard Page then Login from My DashBoard Page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I navigate to Job Search Page and apply filters on Location for anonymous user$")
	public void i_navigate_to_job_search_page_and_apply_filters_on_location_for_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();

			test = extent.createTest(Feature.class,
					"D8-852,853,856,865,834,866,3566,851::User navigate to Job Search Page and apply filters on job listing page for anonymous user");
			test = test.createNode(Scenario.class,
					"Anonymous user navigates to Job Search page to Verify different filters on job listing page");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account home page then verify all the saved job$")
	public void i_am_on_michelpage_then_navigating_to_my_account_home_page_then_verify_all_the_saved_job()
			throws Throwable {

		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-699::Save Multiple Job BeforeLogin Then Verify All the SavedJob Afterlogin and also similar job then remove save job");
			test = test.createNode(Scenario.class,
					"Anonymous User navigates from michael page to my Account dashboard page then verify all the SavedJob Afterlogin and also similar job then remove save job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account home page then login as Authenticated User$")
	public void i_am_on_michelpage_then_navigating_to_my_account_home_page_then_login_as_authenticated_user()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticated User save multiple Job beforeLogin Then verify all the savedJob afterlogin and also similar job then remove save job");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account home page then save job$")
	public void I_am_on_michelpage_then_navigating_to_my_account_home_page_then_save_job() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-700::Verify JobnoLonger SimilarJob RecentlySavedJob Then removeJob from My DashBoard Page");
			test = test.createNode(Scenario.class,
					"Anonymous User navigates from michael page to my Account dashboard page then verify JobMatchNProfile then back to MyDashBoard Page then Login from My DashBoard Page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage then navigating to my Account page then verify Error Message After eddit phone number$")
	public void i_am_on_michelpage_then_navigating_to_my_account_page_then_verify_error_message_after_eddit_phone_number()
			throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-706::Verify error Message After eddit phone number then back to My Account DashBoard Page");
			test = test.createNode(Scenario.class,
					"Authenticated User navigates from michael page to my Account dashboard page then verify Error Message After eddit phone number then back to My Account DashBoard Page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for Location search as Anonymous user$")
	public void i_am_on_michelpage_for_location_search_as_anonymous_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class,
					"D8-300::Anonymous User navigates to Home page and Search for jobs from the job result page");
			test = test.createNode(Scenario.class,
					"Anonymous User navigates to Home page and Search for jobs from the job result page");

			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Given("^I am on Michelpage for Location search as Authenticate user$")
	public void i_am_on_michelpage_for_location_search_as_authenticate_user() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = test.createNode(Scenario.class,
					"Authenticate User navigates to Home page and Search for jobs from the job result page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	
	@Given("^I am on Michelpage then navigating to my Account page to verify menus$")
    public void i_am_on_michelpage_then_navigating_to_my_account_page_to_verify_menus() throws Throwable {
		try {
			mploginpage.launchSITApplication();
			test = extent.createTest(Feature.class, "D8-4176,D8-702::Verify the Funationality of Menu tabs present on My Page ");
			test = test.createNode(Scenario.class,
					"Authenticate User navigates from michael page to my Account page");
			logInfo = test.createNode(new GherkinKeyword("Given"), "I am on Michelpage : Launched SIT Application");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
}