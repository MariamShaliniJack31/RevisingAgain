package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.pages.MP_SIT_ApplywithLinkedInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MP_SIT_ApplywithLinkedIn_StepDefination extends ExtentReportUtil {

	
	protected MP_SIT_ApplywithLinkedInPage applywithlinkedinpage;
	WebDriver driver;
	ExtentTest logInfo = null;

	public MP_SIT_ApplywithLinkedIn_StepDefination() {
		
		applywithlinkedinpage=new MP_SIT_ApplywithLinkedInPage();
	}

	

    @Then("^I verify \"([^\"]*)\" Message on SigninWithLinkedin screen$")
    public void i_verify_linkedin_message_on_SigninWithLinkedin_screen(String webElementTitle) throws Throwable {
    	try {
    		applywithlinkedinpage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
        
    }

    @And("^I Click on \"([^\"]*)\" Link on SigninWithLinkedin screen$")
    public void i_click_on_link_on_signinwithlinkedin_screen(String webElementTitle) throws Throwable {
    	try {

    		applywithlinkedinpage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"), "I click on button :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
    
    @And("^I Click on \"([^\"]*)\" button on ApplyWithLinkedIn screen$")
    public void i_click_on_applywithlinkedin_button_on_applywithlinkedin_screen(String webElementTitle) throws Throwable {
    	try {

    		applywithlinkedinpage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"), "I click on button :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
    
    
    @Then("^I Enter on \"([^\"]*)\" field on ApplyWithLinkedIn Page$")
    public void i_Enter_on_field_on_ApplyWithLinkedIn_Page(String webElementTitle) throws Throwable {
        
    	try {
			Thread.sleep(3000);
			applywithlinkedinpage.enterText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Enter field on LoginPage : " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
    
    @Then("^I Enter \"([^\"]*)\" field on ApplyWithLinkedIn Page$")
    public void i_Enter_field_on_ApplyWithLinkedIn_Page(String webElementTitle) throws Throwable {
    	try {
			Thread.sleep(3000);
			applywithlinkedinpage.enterText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Enter field on LoginPage : " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }

    @Then("^I Click on \"([^\"]*)\" button on ApplyWithLinkedIn Page$")
    public void i_Click_on_button_on_ApplyWithLinkedIn_Page(String webElementTitle) throws Throwable {
    	try {

    		applywithlinkedinpage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("And"), "I click on button :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
    
    @Then("^I verify \"([^\"]*)\" Message on ApplyWithLinkedIn Page$")
    public void i_verify_Message_on_ApplyWithLinkedIn_Page(String webElementTitle) throws Throwable {
    	try {
    		applywithlinkedinpage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
    @And("^I verify \"([^\"]*)\" on ApplyWithLinkedIn Page$")
    public void i_verify_editable_on_applywithlinkedin_page(String webElementTitle) throws Throwable {
    	try {
    		applywithlinkedinpage.verifyInputBoxEditable(webElementTitle);
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
    
    @Then("^I Enter \"([^\"]*)\" on unlock feature of ApplyWithLinkedIn Page$")
    public void i_enter_something_on_unlock_feature_of_applywithlinkedin_page(String webElementTitle) throws Throwable {
    	try {
			Thread.sleep(3000);
			applywithlinkedinpage.enterText(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"I Enter field on LoginPage : " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
    }
    @And("^I verify \"([^\"]*)\" Field is not present on ApplyWithLinkedIn Page$")
    public void i_verify_input_field_is_not_present_on_applywithlinkedin_page(String webElementTitle) throws Throwable {
    			try {
    				Thread.sleep(3000);
    				applywithlinkedinpage.verifyField(webElementTitle);
    			} catch (AssertionError | Exception e) {
    				testStepHandle("FAIL", driver, logInfo, e);
    			}
    }
 
}
