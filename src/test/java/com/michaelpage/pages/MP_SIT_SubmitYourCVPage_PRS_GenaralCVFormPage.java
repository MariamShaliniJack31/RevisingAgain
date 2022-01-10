package com.michaelpage.pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.common.utils.RandomDataUtil;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_SubmitYourCVPage_PRS_GenaralCVFormPage extends ReusableMethodTC {
	String userName = Dto.getUsername();
	String passWord = Dto.getPassword();
	static LoginTC login = new LoginTC();
	// PRS general cv form page - submit your cv header
	@FindBy(xpath = "//h1[@class='cv-submit-banner-title']")
	public WebElement submitYourCVHeader;

	// PRS general cv form page - ProgressBar
	@FindBy(xpath = "//*[@class='progress progress_1']")
	public WebElement progressBar;

	// PRS general cv form page - aboutYouHeader
	@FindBy(xpath = "//*[@class='heading']")
	public WebElement aboutYouHeader;

	// About you page - Sector
	@FindBy(xpath = "//select[@id='edit-sector']")
	public WebElement selectSector;

	// About you page - Contract Type
	@FindBy(xpath = "//select[@id='edit-contract-type']")
	public WebElement contratType;

	// About you page - submit cv
	@FindBy(xpath = "//*[@id='edit-submit']")
	public WebElement submitCVButton;

	// Submit your cv page - Select Country
	@FindBy(xpath = "//select[@id='edit-page-country']")
	public WebElement selectCountry;

	// Submit your cv page - Sector Field Label
	@FindBy(xpath = "//label[contains(text(),'Contract type')]")
	public WebElement ContractTypeLabel;
	
	// Submit your cv page - Sign Up checkbox
	@FindBy(xpath = "//input[@type='checkbox']//following-sibling::label[text()='Sign up for an account']")
	public WebElement SignInchk;

	// Submit your cv page - Sector Field Label
	@FindBy(xpath = "//label[contains(text(),'sector')]")
	public WebElement sectorLabel;
	
	// Submit your cv page - SignIn link
	@FindBy(xpath = "//a[text()='Sign In']")
	public WebElement signInLinkSubmitCVPage;
	
	// Submit your cv page - Login header
	@FindBy(xpath = "//*[@class='ui-dialog-title']")
	public WebElement signInWindowTitle;
		
 /*// Submit your cv page - Forgotten link
	@FindBy(xpath = "//*[text()='Forgotten?']")
	public WebElement forgottenLink;*/
		
	// Submit your cv page - Forgotten link
	@FindBy(xpath = "//*[text()='Password']//preceding::a[1]")
	public WebElement forgottenLink;
	
	// Submit your cv page - Forgotten Password header
	@FindBy(xpath = "//span[text()='Forgotten Password']")
	public WebElement forgottenPasswordHeader;
					
	//Submit your cv page - Email Address field
	@FindBy(xpath = "(//*[contains(@id,'edit-name')])[1]")
	public WebElement emailTxbOnForgottenPassword;	
	
	//Submit your cv page -Submit button
	@FindBy(xpath = "(//*[contains(text(),'Submit')])[3]")
	public WebElement submitButton;	
	
	//Submit your cv page -Continue WithOut Signing In button
	@FindBy(xpath = "//*[text()='Continue without signing in']")
	public WebElement continueWithOutSignIn;	
	
	//Submit your cv page -CEmail id on Login window
	@FindBy(xpath = "//*[contains(@id,'edit-name')]")
	public WebElement emailUserIDOnLoginWindow;
	//Submit your cv page -Password on login window
	@FindBy(xpath = "//input[contains(@id,'edit-pass')]")
	public WebElement passwordOnLoginWindow;
			
	//Submit your cv page -Login button on login window
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement loginButtonOnLoginWindow;
	
	static String email = RandomDataUtil.randomStringGenerator() + "2@automation.com";

	public MP_SIT_SubmitYourCVPage_PRS_GenaralCVFormPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyTextMessage(String webElementTitle) throws Throwable {

		switch (webElementTitle.toUpperCase()) {
		case "SUBMIT YOUR CV AS HEADER": {
			ReusableMethodTC.elementToBeVisible(submitYourCVHeader);
			ReusableMethodTC.highLighterMethod(driver, submitYourCVHeader);
			ReusableMethodTC.verifyText("Submit your CV", submitYourCVHeader.getText().trim());
			Thread.sleep(500);
			System.out.println("Verified : " + submitYourCVHeader.getText().trim() + " header is Displayed");
			Reporter.log("Verified : "  + submitYourCVHeader.getText().trim() + " header is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Submit your cv header is Displayed");
			break;
		}
		case "PROGRESS BAR LINE": {
			ReusableMethodTC.elementToBeVisible(progressBar);
			ReusableMethodTC.highLighterMethod(driver, progressBar);
			ReusableMethodTC.isElementPresent(progressBar);
			System.out.println("Verified : The Progress Bar line is displayed");
			Reporter.log("Verified : The Progress Bar line is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The Progress Bar line is displayed");
			break;
		}
		case "SECTOR FIELD": {
			ReusableMethodTC.elementToBeVisible(sectorLabel);
			ReusableMethodTC.highLighterMethod(driver, sectorLabel);
			ReusableMethodTC.isElementPresent(sectorLabel);
			System.out.println("Verified that Sector field is displayed Successfully");
			Reporter.log("Verified that Sector field is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified Sector field is displayed Successfully");
			break;
		}

		case "CONTRACT TYPE FIELD": {
			ReusableMethodTC.elementToBeVisible(ContractTypeLabel);
			ReusableMethodTC.highLighterMethod(driver, ContractTypeLabel);
			ReusableMethodTC.isElementPresent(ContractTypeLabel);
			System.out.println("Verified that Contract Type field is displayed Successfully");
			Reporter.log("Verified that Contract Type field is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified Contract Type field is displayed Successfully");
			break;
		}
		case "LOGIN AS HEADER": {
			ReusableMethodTC.elementToBeVisible(signInWindowTitle);
			ReusableMethodTC.highLighterMethod(driver, signInWindowTitle);	
			ReusableMethodTC.verifyText("Login",signInWindowTitle.getText());
			System.out.println("Verified : Login header is displayed");
			Reporter.log("Verified : "+signInWindowTitle.getText()+" header is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : " +signInWindowTitle.getText()+ " header is displayed");
			break;
		}
		case "FORGOTTEN PASSWORD HEADER": {
			ReusableMethodTC.elementToBeVisible(signInWindowTitle);
			ReusableMethodTC.highLighterMethod(driver, signInWindowTitle);	
			ReusableMethodTC.verifyText("Login",signInWindowTitle.getText());
			System.out.println("Verified : Login header is displayed");
			Reporter.log("Verified : "+signInWindowTitle.getText()+" header is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : " +signInWindowTitle.getText()+ " header is displayed");
			break;
		}
		case "FURTHER INSTRUNCTION HEADER": {
			ReusableMethodTC.elementToBeVisible(signInWindowTitle);
			ReusableMethodTC.highLighterMethod(driver, signInWindowTitle);	
			ReusableMethodTC.verifyText("Login",signInWindowTitle.getText());
			System.out.println("Verified : Login header is displayed");
			Reporter.log("Verified : "+signInWindowTitle.getText()+" header is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : " +signInWindowTitle.getText()+ " header is displayed");
			break;
		}
		case "SIGN UP": {
			try {
				Thread.sleep(1000);
				if (SignInchk.isDisplayed()) {
					ReusableMethodTC.elementToBeVisible(SignInchk);
					ReusableMethodTC.highLighterMethod(driver, SignInchk);
					ReusableMethodTC.click(SignInchk);
					Reporter.log("Clicked on 'RADIO BUTTON' to create new account ");
					LogFile.APPLICATION_LOGS.info("Clicked on 'RADIO BUTTON' to create new account ");
				}
			} catch (Exception e) {
				e.getMessage();
				System.out
						.println("Sign Up for account option is not available becuse already entered existing details");
				Reporter.log("Sign Up account option is not available because you logged with existing creadentials");
			}
			break;
		}
		}
	}

	public void SelectDropdownValue(String webElementTitle) throws Exception {
		switch (webElementTitle.toUpperCase()) {
		case "SECTOR": {
			ReusableMethodTC.elementToBeVisible(selectSector);
			ReusableMethodTC.highLighterMethod(driver, selectSector);
			// ReusableMethodTC.selectByIndex(editCountryDropdown, 3);
			ReusableMethodTC.selectByVisibleText(selectSector, "IT Sector");
			System.out.println("Verified : The country selected is  : " + "IT Sector");
			Reporter.log("Verified : The Sector selected is : " + "IT Sector");
			LogFile.APPLICATION_LOGS.debug("Verified : The Sector selected is  : " + "IT Sector");
			ReusableMethodTC.sendKeys(contratType, Keys.TAB);
			break;
		}
		case "CONTRACT TYPE": {
			ReusableMethodTC.elementToBeVisible(contratType);
			ReusableMethodTC.highLighterMethod(driver, contratType);
			ReusableMethodTC.selectByVisibleText(contratType, "Permanent");
			System.out.println("Verified : The Contract Type selected is  : " + "Permanent");
			Reporter.log("Verified : The Contract Type selected is : " + "IT Sector");
			LogFile.APPLICATION_LOGS.debug("Verified : The Contract Type selected is  : " + "Permanent");

			break;
		}
		case "COUNTRY": {
			ReusableMethodTC.elementToBeVisible(selectCountry);
			ReusableMethodTC.highLighterMethod(driver, selectCountry);
			ReusableMethodTC.selectByVisibleText(selectCountry, "Angola");
			System.out.println("Verified : The selected country is  : " + "Angola");
			Reporter.log("Verified : The selected country is  : " + "France");
			LogFile.APPLICATION_LOGS.debug("Verified : The selected country is  : " + "Angola");
			break;
		}
		}
	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "SUBMIT CV": {
			ReusableMethodTC.highLighterMethod(driver, submitCVButton);
			ReusableMethodTC.click(submitCVButton);
			System.out.println("I clicked on Submit cv button");
			Reporter.log("Clicked on 'Submit CV' Button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Submit CV' Button");
			break;
		}
		case "SIGNIN LINK": {
			ReusableMethodTC.highLighterMethod(driver, signInLinkSubmitCVPage);
			ReusableMethodTC.click(signInLinkSubmitCVPage);
			System.out.println("I clicked on SignIn link");
			Reporter.log("Clicked on 'SignIn' link");
			LogFile.APPLICATION_LOGS.info("Clicked on 'SignIn' link");
			break;
		}
		case "FORGOTTEN LINK": {
			ReusableMethodTC.highLighterMethod(driver, forgottenLink);
			ReusableMethodTC.click(forgottenLink);
			System.out.println("I clicked on Forgotten link" );
			Reporter.log("Clicked on 'Forgotten' link");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Forgotten' link");
			break;
		}
		case "SUBMIT BUTTON": {
			ReusableMethodTC.highLighterMethod(driver, submitButton);
			ReusableMethodTC.click(submitButton);
			System.out.println("I clicked on Submit button on Forgotten Password window");
			Reporter.log("Clicked on 'Submit' button on Forgotten Password window");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Submit' button on Forgotten Password window");
			break;
		}
		case "CONTINUE WITHOUT SIGNINGIN": {
			ReusableMethodTC.highLighterMethod(driver, continueWithOutSignIn);
			ReusableMethodTC.click(continueWithOutSignIn);
			System.out.println("I clicked on continue WithOut SigningIn button");
			Reporter.log("Clicked on 'continue WithOut SigningIn' button on Forgotten Password window");
			LogFile.APPLICATION_LOGS.info("Clicked on 'continue WithOut SigningIn' button on Forgotten Password window");
			break;
		}
		case "LOGIN BUTTON": {
			ReusableMethodTC.highLighterMethod(driver, loginButtonOnLoginWindow);
			ReusableMethodTC.click(loginButtonOnLoginWindow);
			System.out.println("I clicked on Login button on Login window");
			Reporter.log("Clicked on 'Login' button on Login window");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Login' button on Login window");
			break;
		}
		}
		}
		public void enterRandomText(String webElementTitle) {

			switch (webElementTitle.toUpperCase()) {
			case "EMAIL ADDRESS": {			
				ReusableMethodTC.elementToBeVisible(emailTxbOnForgottenPassword);
				ReusableMethodTC.highLighterMethod(driver, emailTxbOnForgottenPassword);
				ReusableMethodTC.sendKeys(emailTxbOnForgottenPassword, userName);
				System.out.println("Entered Email Address on Forgotten Password window");
				Reporter.log("Entered Email Address on Forgotten Password window");
				LogFile.APPLICATION_LOGS.info("Entered Email Address on Forgotten Password window");
				break;
			}
			case "EMAILID": {	
				ReusableMethodTC.elementToBeVisible(emailUserIDOnLoginWindow);
				ReusableMethodTC.highLighterMethod(driver, emailUserIDOnLoginWindow);
				ReusableMethodTC.sendKeys(emailUserIDOnLoginWindow, userName);
				System.out.println("Entered Email ID on  Login window");
				Reporter.log("Entered Email ID on Login window");
				LogFile.APPLICATION_LOGS.info("Entered Email ID on Login window");
				break;
		    }
			case "PASSWORD": {	
				ReusableMethodTC.elementToBeVisible(passwordOnLoginWindow);
				ReusableMethodTC.highLighterMethod(driver, passwordOnLoginWindow);
				ReusableMethodTC.sendKeys(passwordOnLoginWindow, passWord);
				Reporter.log("Entered Password on login window");
				LogFile.APPLICATION_LOGS.info("Entered Password on login window");
				break;
			}
			}
	}
}
