package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.pages.MP_SIT_MyPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MP_SIT_MyPage_StepDefination extends ExtentReportUtil {

	protected MP_SIT_MyPage mpSitMyPage;
	WebDriver driver;
	ExtentTest logInfo = null;

	public MP_SIT_MyPage_StepDefination() {
		mpSitMyPage = new MP_SIT_MyPage();
	}

	@Then("^I click on \"([^\"]*)\" button on MyPage$")
	public void i_click_on_button_on_mypage(String webElementTitle) throws Throwable {
		try {
			mpSitMyPage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I click on button on MyPage : Clicked on :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@Then("^I verify the Title \"([^\"]*)\" on MyPage$")
	public void i_verify_the_title_on_mypage(String webElementTitle) throws Throwable {
		try {
			mpSitMyPage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I verify the count of the Applied Jobs$")
	public void i_verify_the_count_of_the_applied_jobs() throws Throwable {
		try {
			int JobCount = mpSitMyPage.JobCount();
			if (JobCount == 1)
				logInfo = test.createNode(new GherkinKeyword("And"),
						"The Verfied Count of the Job Applied is :  " + JobCount);
			else if (JobCount > 1)
				logInfo = test.createNode(new GherkinKeyword("And"),
						"The Verfied Count of the Job Applied are :  " + JobCount);
			else
				logInfo = test.createNode(new GherkinKeyword("And"), "No Jobs are Applied   ");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}

	@And("^I navigate to MyPage dashboard$")
	public void i_navigate_to_mypage_dashboard() throws Throwable {
		try {
			mpSitMyPage.Dashboard();
			logInfo = test.createNode(new GherkinKeyword("And"), "I Navigateto:  MyPage Dashboard Successfully");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
}
