package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.common.utils.TestBase;
import com.michaelpage.common.utils.ValueDTO;
import com.michaelpage.pages.MP_SIT_ApplywithyourCVPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MP_SIT_ApplywithyourCVPageStepDefination extends ExtentReportUtil {
	protected MP_SIT_ApplywithyourCVPage mpApplyWithCvPage;
	WebDriver driver;
	ExtentTest logInfo = null;
	public static ValueDTO Dto = new ValueDTO();
	public MP_SIT_ApplywithyourCVPageStepDefination() {
		mpApplyWithCvPage = new MP_SIT_ApplywithyourCVPage();
	}
	@Then("^I Enter \"([^\"]*)\" field on ApplywithyourCV screen$")
	public void i_Enter_field_on_ApplywithyourCV_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvPage.enterRandomText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Enter field on ApplywithyourCV screen :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	@Then("^I Click on \"([^\"]*)\" button on ApplywithyourCV screen$")
	public void i_Click_on_button_on_ApplywithyourCV_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I click on button :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I upload the CV with \"([^\"]*)\" format on ApplywithyourCV screen$")
	public void i_upload_the_cv_with_on_applywithyourcv_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvPage.uploadFileWithDiffFormat(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"),
					"I upload the file Successfully with Format::" + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify \"([^\"]*)\" field pre-pouplated on ApplywithyourCV screen$")
	public void i_verify_field_prepouplated_on_applywithyourcv_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@When("^I check \"([^\"]*)\" whether selected in ApplywithyourCV screen$")
	public void i_check_whether_selected_in_applywithyourcv_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I click on:  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I Enter \"([^\"]*)\" field with invalid data on ApplywithyourCV screen$")
	public void i_enter_field_with_invalid_data_on_applywithyourcv_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvPage.enterRandomText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I entered  :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I verify \"([^\"]*)\" link on ApplywithyourCV screen$")
	public void i_verify_link_on_applywithyourcv_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I navigate to \"([^\"]*)\" Page$")
	public void i_navigate_to_page(String webElementTitle) throws Throwable {
		try {
			ReusableMethodTC.navigateToOtherWindow();
			logInfo = test.createNode(new GherkinKeyword("And"), "I navigated to Page::" + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I verify \"([^\"]*)\" button is not visible on ApplywithyourCV screen$")
	public void i_verify__button_is_not_visible_on_applywithyourcv_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I verify not visible :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I download CV on ApplywithyourCV screen$")
	public void i_download_cv_on_applywithyourcv_screen() throws Throwable {
		try {
			TestBase.downloadFiles();
			logInfo = test.createNode(new GherkinKeyword("And"),
					"I downloaded the CV using browser:::" + Dto.getWebDriverObj());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}

	}
	@Then("^Enter \"([^\"]*)\" field on ApplywithyourCV screen$")
    public void Enter_field_on_applywithyourcv_screen(String webElementTitle) throws Throwable {
		try {

			mpApplyWithCvPage.enterRandomText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Enter field on ApplywithyourCV screen :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	
	@Then("^I verify \"([^\"]*)\" Message on ApplywithyourCV screen$")
	public void i_verify_Message_on_ApplywithyourCV_screen(String webElementTitle) throws Throwable {
		try {
			mpApplyWithCvPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	 @Then("^I verify \"([^\"]*)\" on ApplywithyourCV screen$")
	    public void i_verify_something_on_applywithyourcv_screen(String webElementTitle) throws Throwable {
		 try {
			 mpApplyWithCvPage.clickOnElement(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I click on:  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	

}
