package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.pages.MP_SIT_SubmitYourCVPage_PRS_GenaralCVFormPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MP_SIT_PRS_GenaralCVForm_SubmitYourCVPageStepDeffination extends ExtentReportUtil {
	protected MP_SIT_SubmitYourCVPage_PRS_GenaralCVFormPage prsGeneralCVFormPage;
	WebDriver driver;
	ExtentTest logInfo = null;
	
	public MP_SIT_PRS_GenaralCVForm_SubmitYourCVPageStepDeffination() {
		prsGeneralCVFormPage = new MP_SIT_SubmitYourCVPage_PRS_GenaralCVFormPage();
	}

	 @Then("^I verify \"([^\"]*)\" on PRS generalCVForm screen$")
	    public void i_verify_on_prs_generalcvform_screen(String webElementTitle) throws Throwable {
		 try {
			 prsGeneralCVFormPage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 
	 @And("^I select \"([^\"]*)\" from dropdown on PRS generalCVForm screen$")
	    public void i_select_from_dropdown_on_prs_generalcvform_screen(String webElementTitle) throws Throwable {
		 try {

			  prsGeneralCVFormPage.SelectDropdownValue(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"),
					"I selected the value :  " + webElementTitle.toString());

		} catch (Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	     }
	 @And("^I click on \"([^\"]*)\" button on PRS generalCVForm screen$")
		    public void i_click_on_button_on_prs_generalcvform_screen(String webElementTitle) throws Throwable {
			 try {
				 prsGeneralCVFormPage.clickOnElement(webElementTitle);
					logInfo = test.createNode(new GherkinKeyword("And"),
							"I clicked on Button :  " + webElementTitle.toString());
				} catch (AssertionError | Exception e) {
					testStepHandle("FAIL", driver, logInfo, e);
				}
			}
	 @And("^I select \"([^\"]*)\" on PRS generalCVForm screen$")
	    public void i_select_on_prs_generalcvform_screen(String webElementTitle) throws Throwable {
		 try {

			 prsGeneralCVFormPage.SelectDropdownValue(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("And"),
						"I selected the value :  " + webElementTitle.toString());

			} catch (Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^I click \"([^\"]*)\" on login window of PRS generalCVForm screen$")
	    public void i_click_something_on_login_window_of_prs_generalcvform_screen(String webElementTitle) throws Throwable {
		  try {
				 prsGeneralCVFormPage.clickOnElement(webElementTitle);
					logInfo = test.createNode(new GherkinKeyword("And"),
							"I clicked on Button :  " + webElementTitle.toString());
				} catch (AssertionError | Exception e) {
					testStepHandle("FAIL", driver, logInfo, e);
				}
			}
	  @Then("^I Enter \"([^\"]*)\" on forgotten password window of PRS generalCVForm screen$")
		public void i_Enter_forgotten_password_window_of_PRS_generalCVForm_screen(String webElementTitle) throws Throwable {
			try {
				prsGeneralCVFormPage.enterRandomText(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"),
						"I Enter field on ApplywithyourCV screen :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	  @Then("^I click \"([^\"]*)\" on forgotten password window of PRS generalCVForm screen$")
	    public void i_click_something_on_forgotten_password_window_of_prs_generalcvform_screen(String webElementTitle) throws Throwable {
		  try {
				 prsGeneralCVFormPage.clickOnElement(webElementTitle);
					logInfo = test.createNode(new GherkinKeyword("And"),
							"I clicked on Button :  " + webElementTitle.toString());
				} catch (AssertionError | Exception e) {
					testStepHandle("FAIL", driver, logInfo, e);
				}
			}
	  @Then("^I verify \"([^\"]*)\" on login window screen$")
	    public void i_verify_on_login_window_screen(String webElementTitle) throws Throwable {
		 try {
			 prsGeneralCVFormPage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	  @And("^I Enter \"([^\"]*)\" on Login window of PRS generalCVForm screen$")
	    public void i_enter_something_on_login_window_of_prs_generalcvform_screen(String webElementTitle) throws Throwable {
		  try {
				prsGeneralCVFormPage.enterRandomText(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"),
						"I Enter field on ApplywithyourCV screen :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	  

	    @Then("^I click \"([^\"]*)\" on PRS generalCVForm screen$")
	    public void i_click_on_prs_generalcvform_screen(String webElementTitle) throws Throwable {
	    	 try {
	    	 prsGeneralCVFormPage.clickOnElement(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"),
						"I clicked on Button :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	  
	 
	}
