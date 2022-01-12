package com.michaelpage.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.michaelpage.common.utils.ExtentReportUtil;
import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.pages.MP_SIT_HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MP_SIT_HomePageStepDefination extends ExtentReportUtil {
	protected MP_SIT_HomePage mpHomepage;
	WebDriver driver;
	ExtentTest logInfo = null;
	static LoginTC login = new LoginTC();

	
	public MP_SIT_HomePageStepDefination() {
		mpHomepage = new MP_SIT_HomePage();
	}

	@Then("^I verify \"([^\"]*)\" Message on HomePage$")
	public void i_verify_Message_on_HomePage(String webElementTitle) throws Throwable {
		try {

			mpHomepage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("When"),
					"I verify Message on HomePage :  " + webElementTitle.toString());

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	
	@Then("^I navigate to Home Page$")
	public void i_navigate_to_home_page() throws Throwable {
		try {
			login.navigateTohomePageUrl();
			logInfo = test.createNode(new GherkinKeyword("Then"), "I am on Michaelpage : Navigated to Home Page");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	
	@And("^I click on \"([^\"]*)\" button on HomePage screen$")
	public void i_click_on_button_on_homepage_screen(String webElementTitle) throws Throwable {
		try {
			mpHomepage.clickOnElement(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I click on button :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
	
	@And("^I verify \"([^\"]*)\" label on HomePage screen$")
	public void i_verify_label_on_homepage_screen(String webElementTitle) throws Throwable {
		try {
			mpHomepage.verifyTextMessage(webElementTitle);
			logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	}
		
	@And("^I verify \"([^\"]*)\" image on HomePage screen$")
	    public void i_verify_something_image_on_homepage_screen(String webElementTitle) throws Throwable {
			try {
				mpHomepage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the Image :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}	
	}
	 @Then("^I enter \"([^\"]*)\" on lgoin page$")
	    public void i_enter_something_on_lgoin_page(String webElementTitle) throws Throwable {
		 try {
			 mpHomepage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I entered  :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @And("^I click on \"([^\"]*)\" link on HomePage screen$")
		public void i_click_on_link_on_homepage_screen(String webElementTitle) throws Throwable {
			try {
				mpHomepage.clickOnElement(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I click on button :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^I enter \"([^\"]*)\" on SignUP page$")
	    public void i_enter_on_signup_page(String webElementTitle) throws Throwable {
			try {
				mpHomepage.enterRandomText(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"),
						"I Enter field on ApplywithyourCV screen :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @And("^I click on \"([^\"]*)\" button on SignUp page$")
	    public void i_click_on_button_on_SignUp_page(String webElementTitle) throws Throwable {
		 try {
				mpHomepage.clickOnElement(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("And"), "I click on button :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^I verify \"([^\"]*)\" on SignUP page$")
	    public void i_verify_on_signup_page(String webElementTitle) throws Throwable {
		 try {
				mpHomepage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @And("^I verify \"([^\"]*)\" on HomePage screen$")
	    public void i_verify_on_homepage_screen(String webElementTitle) throws Throwable {
		 try {
				mpHomepage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^I click on \"([^\"]*)\" on Forgotten Password screen$")
	    public void I_click_on_Forgotten_Password_screen(String webElementTitle) throws Throwable {
		  try {
			        mpHomepage.clickOnElement(webElementTitle);
					logInfo = test.createNode(new GherkinKeyword("Then"),
							"I clicked on Button :  " + webElementTitle.toString());
				} catch (AssertionError | Exception e) {
					testStepHandle("FAIL", driver, logInfo, e);
				}
			}
	 @Then("^I verify \"([^\"]*)\" on Forgotten Password screen$")
	    public void I_verify_on_Forgotten_Password_screen(String webElementTitle) throws Throwable {
		 try {
			 mpHomepage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^I enter \"([^\"]*)\" on Forgotten Password screen$")
	    public void I_enter_Forgotten_Password_screen(String webElementTitle) throws Throwable {
		 try {
			 mpHomepage.enterRandomText(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^I verify \"([^\"]*)\" on myAccount page$")
	    public void I_verify_on_myAccount_page(String webElementTitle) throws Throwable {
		 try {
			 mpHomepage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^I verify \"([^\"]*)\" Message on yourCV page$")
		public void i_verify_Message_on_yourCV_page(String webElementTitle) throws Throwable {
			try {

				mpHomepage.verifyTextMessage(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("When"),
						"I verify Message on HomePage :  " + webElementTitle.toString());

			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @And("^I Click on \"([^\"]*)\" button on yourCV page$")
	    public void i_click_on_button_on_yourcv_page(String webElementTitle) throws Throwable {
		 try {
		        mpHomepage.clickOnElement(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"),
						"I clicked on Button :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^i entered \"([^\"]*)\" on Account setting page$")
	    public void i_entered_on_account_setting_page(String webElementTitle) throws Throwable {
		 try {
			 mpHomepage.enterRandomText(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
	 @Then("^I entered \"([^\"]*)\" on Personal Details page of my account page$")
	    public void i_entered_on_personal_details_page_of_my_account_page(String webElementTitle) throws Throwable {
		 try {
			 mpHomepage.enterRandomText(webElementTitle);
				logInfo = test.createNode(new GherkinKeyword("Then"), "I verify the text :  " + webElementTitle.toString());
			} catch (AssertionError | Exception e) {
				testStepHandle("FAIL", driver, logInfo, e);
			}
		}
}