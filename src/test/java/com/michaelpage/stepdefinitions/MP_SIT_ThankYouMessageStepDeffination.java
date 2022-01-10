package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.pages.MP_SIT_ThankYouMessagePage;
import cucumber.api.java.en.Then;

public class MP_SIT_ThankYouMessageStepDeffination extends ExtentReportUtil {
	protected MP_SIT_ThankYouMessagePage thankYouMSGPage;
	WebDriver driver;
	ExtentTest logInfo = null;

	public MP_SIT_ThankYouMessageStepDeffination() {
		thankYouMSGPage = new MP_SIT_ThankYouMessagePage();
		
	}
	 @Then("^I verify \"([^\"]*)\" Message on thankyoumessage screen$")
		public void i_verify_Message_on_thankyoumessage_screen(String webElementTitle) throws Throwable {
			try {

				thankYouMSGPage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}  
	 @Then("^I verify \"([^\"]*)\" on ThankYoumessage Page$")
	    public void i_verify_on_thankyoumessage_page(String webElementTitle) throws Throwable {
		 try {
				thankYouMSGPage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"),
						"I verify successfully message url:  " + webElementTitle.toString());

			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^I click \"([^\"]*)\" link on thankyoumessage screen$")
	    public void i_click_something_link_on_thankyoumessage_screen(String webElementTitle) throws Throwable {
		 try {
			 thankYouMSGPage.clickOnElement(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I click on button :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
}