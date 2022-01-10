package com.michaelpage.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.michaelpage.common.utils.BrowserCallingTC;
import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_LoginPage extends ReusableMethodTC {

	String userName = Dto.getUsername();
	String passWord = Dto.getPassword();

	static LoginTC login = new LoginTC();
	// Login Page - User Name
	@FindBy(xpath = "//input[@id='edit-name']")
	public WebElement userNameTxb;
	// Login Page - Password
	@FindBy(xpath = "//input[@id='edit-pass']")
	public WebElement passWordTxb;
	// Login Page - Login Button
	@FindBy(xpath = "//input[@id='edit-submit']")
	public WebElement loginBtn;
	// Job Details Page - Privacy Policy Advance Button to proceed to unsafe url
	@FindBy(xpath = "//button[contains(text(),'Advanced')]")
	public WebElement advancedPrivacyBtn;
	// Job Details Page - proceed to unsafe url link
	@FindBy(xpath = "//a[@id='proceed-link']")
	public WebElement proceedToUnSafeUrlLink;

	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//div[@class='messages messages--error']")
	public WebElement unrecognizedError;

	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//a[contains(text(),'Create new account')]")
	public WebElement createNewAccountLink;
	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//input[@id='edit-mail']")
	public WebElement createEmailAddressText;

	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//*[@id='edit-conf-mail']")
	public WebElement createConfirmEmailAddressText;

	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//input[@id='edit-pass']")
	public WebElement createPasswordText;

	/*
	 * // Job Details Page - Unrecognized email error
	 * 
	 * @FindBy(xpath = "//input[@id='edit-pass-pass2']") public WebElement
	 * createConfirmPasswordText;
	 */
	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//input[@id='edit-field-first-name-0-value']")
	public WebElement firstNameText;
	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//input[@id='edit-field-last-name-0-value']")
	public WebElement lastNameText;

	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//input[@id='edit-submit']")
	public WebElement signUpBtn;

	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//div[@id='edit-actions']//input")
	public WebElement createNewAccountTab;
	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//*[@id='highlighted']/div/div[3]/h2")
	public WebElement RegistraionSucessMSg;

	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//span[contains(text(),'Login or Sign up')]")
	public WebElement loginOrSignUpIcon;
	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//*[@id='block-headerblock']/div/div[3]//a//span[@class='text']")
	public WebElement myAccountTab;
	// Job Details Page - Unrecognized email error
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public WebElement logoutBtn;
	// Job Details Page - englishGB
	@FindBy(xpath = "//ul[@class='links']//li[2]")
	public WebElement englishGB;

	// Job Details Page -cookies button
	@FindBy(xpath = "//button[text()='OK, I agree']")
	public WebElement cookiesBtn;
	// Job Details Page -hide button
	@FindBy(xpath = "// button[text()='Hide']")
	public WebElement hideBtn;

	// Job Details Page -hide button
	@FindBy(xpath = "//*[@id='block-mp-theme-page-title']")
	public WebElement userIDHeaderAfterLogin;

	protected MP_SIT_ApplywithyourCVPage applyWithYourCV;
	BrowserCallingTC bc = new BrowserCallingTC();

	public MP_SIT_LoginPage() {
		PageFactory.initElements(driver, this);
		applyWithYourCV = new MP_SIT_ApplywithyourCVPage();
	}

	public void launchSITApplication() throws InterruptedException, Exception {
		login.navigateToSITURL();
		Thread.sleep(2000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10 /* timeout in seconds */);
			if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
				System.out.println("alert was not present");
			} else {
				Alert alert = driver.switchTo().alert();
				alert.accept();
				System.out.println("alert was present and accepted");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("MP Title::" + driver.getTitle());
		cookiesHandel();
	}

	public void launchPRSJobPageURL() throws InterruptedException {
		login.navigateToPRSgeneralCVFormPageURL();
		Thread.sleep(4000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10 /* timeout in seconds */);
			if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
				System.out.println("alert was not present");
			} else {
				Alert alert = driver.switchTo().alert();
				alert.accept();
				System.out.println("alert was present and accepted");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void enterText(String webElementTitle) throws InterruptedException {
		switch (webElementTitle.toUpperCase()) {
		case "USERNAME": {
			ReusableMethodTC.elementToBeVisible(userNameTxb);
			ReusableMethodTC.highLighterMethod(driver, userNameTxb);
			ReusableMethodTC.sendKeys(userNameTxb, userName);
			Reporter.log("Entered User Name");
			LogFile.APPLICATION_LOGS.info("Entered User Name");
			break;
		}
		case "PASSWORD": {
			try {
				ReusableMethodTC.elementToBeVisible(passWordTxb);
				ReusableMethodTC.highLighterMethod(driver, passWordTxb);
				ReusableMethodTC.sendKeys(passWordTxb, passWord);
				Thread.sleep(2000);
				Reporter.log("Entered Password");
				LogFile.APPLICATION_LOGS.info("Entered Password");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case "UNIQUE EMAILID": {
			ReusableMethodTC.elementToBeVisible(userNameTxb);
			ReusableMethodTC.highLighterMethod(driver, userNameTxb);
			System.out.println("U ID:: " + MP_SIT_ApplywithyourCVPage.email);
			ReusableMethodTC.sendKeys(userNameTxb, MP_SIT_ApplywithyourCVPage.email);
			ReusableMethodTC.sendKeys(userNameTxb, Keys.TAB);
			Reporter.log("Entered Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Email Address");
			break;
		}
		}
	}

	public void clickOnElement(String webElementTitle) throws Exception {

		switch (webElementTitle.toUpperCase()) {

		case "LOGIN": {
			try {
				ReusableMethodTC.elementToBeVisible(loginBtn);
				ReusableMethodTC.highLighterMethod(driver, loginBtn);
				Thread.sleep(2000);
				ReusableMethodTC.click(loginBtn);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			String titlePage = driver.getTitle();
			System.out.println("Home Page Title::" + titlePage);

			if (titlePage.contains("SIT")) {
				System.out.println("Logged Sucessfully");
				Reporter.log("Clicked on 'Login' Button");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Login' Button");
			} else {
				String errorMsg = unrecognizedError.getText();
				System.out.println("User not registered Error:::" + errorMsg);
				Thread.sleep(1000);
				createNewUserAccount();
				Thread.sleep(1000);
				logOut();
				Thread.sleep(1000);
				launchSITApplication();
				Thread.sleep(1000);
				ReusableMethodTC.sendKeys(userNameTxb, userName);
				ReusableMethodTC.sendKeys(passWordTxb, passWord);
				ReusableMethodTC.elementToBeVisible(loginBtn);
				ReusableMethodTC.click(loginBtn);
				Thread.sleep(1000);
				System.out.println("Created New User for Automation and Logged Sucessfully ");
				Reporter.log("Created New User for Automation and Logged Sucessfully ");
			}
			break;
		}

		case "LOGIN BUTTON": {
			ReusableMethodTC.elementToBeVisible(loginBtn);
			ReusableMethodTC.highLighterMethod(driver, loginBtn);
			ReusableMethodTC.click(loginBtn);
			Reporter.log("Clicked on 'Login' Button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Login' Button");
			} 
			break;
		}
		}

	public void createNewUserAccount() throws InterruptedException {
		ReusableMethodTC.elementToBeVisible(createNewAccountLink);
		ReusableMethodTC.highLighterMethod(driver, createNewAccountLink);
		ReusableMethodTC.click(createNewAccountLink);
		Thread.sleep(1000);

		ReusableMethodTC.elementToBeVisible(firstNameText);
		ReusableMethodTC.sendKeys(firstNameText, "Automation");
		ReusableMethodTC.sendKeys(lastNameText, "MichaelPage");
		ReusableMethodTC.elementToBeVisible(createEmailAddressText);
		ReusableMethodTC.sendKeys(createEmailAddressText, userName);
		ReusableMethodTC.sendKeys(createConfirmEmailAddressText, userName);
		ReusableMethodTC.sendKeys(createPasswordText, passWord);
		// scrollIntoElement(createConfirmPasswordText);
		// ReusableMethodTC.sendKeys(createConfirmPasswordText, passWord);
		try {
			Thread.sleep(1200);
			ReusableMethodTC.elementToBeVisible(signUpBtn);
			scrollIntoElement(signUpBtn);
			ReusableMethodTC.highLighterMethod(driver, signUpBtn);
			// Assert.assertTrue(signUpBtn.getAttribute("value").contains("Create new
			// account"));
			System.out.println(createNewAccountTab.getAttribute("value").toString());
			ReusableMethodTC.click(signUpBtn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(1200);
		System.out.println(RegistraionSucessMSg.getText());
	}

	public void logOut() throws InterruptedException {
		try {
			Thread.sleep(1000);
			if (myAccountTab.isDisplayed() == true) {
				System.out.println("myAccountTab isDisplayed::" + myAccountTab.isDisplayed());
				ReusableMethodTC.elementToBeVisible(myAccountTab);
				ReusableMethodTC.highLighterMethod(driver, myAccountTab);
				clickUsingJavaScript(myAccountTab);
				// ReusableMethodTC.click(myAccountTab);

			} else {
				System.out.println("Login isDisplayed::" + loginOrSignUpIcon.isDisplayed());
				ReusableMethodTC.elementToBeVisible(loginOrSignUpIcon);
				ReusableMethodTC.highLighterMethod(driver, loginOrSignUpIcon);
				ReusableMethodTC.click(loginOrSignUpIcon);
				ReusableMethodTC.elementToBeVisible(myAccountTab);
				ReusableMethodTC.highLighterMethod(driver, myAccountTab);
				ReusableMethodTC.click(myAccountTab);

			}

			ReusableMethodTC.elementToBeVisible(logoutBtn);
			ReusableMethodTC.highLighterMethod(driver, logoutBtn);
			ReusableMethodTC.click(logoutBtn);

			System.out.println("Logged out Sucessfully ");
			Reporter.log(" Logged out Sucessfully ");

			if (driver.switchTo().alert() != null) {
				System.out.println("Alert");
				driver.switchTo().alert().accept();
				System.out.println("Alert Accepted");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void cookiesHandel() {
		try {

			if (cookiesBtn.isDisplayed() == true) {
				System.out.println("Is cookies displayed ::" + cookiesBtn.isDisplayed());

				ReusableMethodTC.elementToBeVisible(cookiesBtn);
				ReusableMethodTC.highLighterMethod(driver, cookiesBtn);
				ReusableMethodTC.click(cookiesBtn);
				Thread.sleep(1000);
			} else {
				System.out.println("No cookies");
			}

			if (hideBtn.isDisplayed() == true) {
				ReusableMethodTC.elementToBeVisible(hideBtn);
				ReusableMethodTC.highLighterMethod(driver, hideBtn);
				ReusableMethodTC.click(hideBtn);

			}
			System.out.println("Cookies Closed");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
