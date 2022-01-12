package com.michaelpage.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.michaelpage.common.utils.BrowserCallingTC;
import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.common.utils.ValueDTO;
import com.michaelpage.utils.LogFile;

public class MP_SIT_ApplywithyourCV_GoogleDrivePage extends ReusableMethodTC {

	ValueDTO dto = new ValueDTO();
	static LoginTC login = new LoginTC();

	@FindBy(xpath = "//*[@id='identifierId']")
	public WebElement googleDriveMailId;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement googleDrivePwd;
	@FindBy(xpath = "//div[@id='identifierNext']/div/button/div[2]")
	public WebElement emailIDNextBtn;
	@FindBy(xpath = "//div[@id='passwordNext']/div/button/div[2]")
	public WebElement PwdNextBtn;
	@FindBy(xpath = "//div[contains(text(),'Select')]")
	public WebElement selectBtn;

//
//	@FindBy(xpath = "//div[@id='identifierNext']/span/span")
//	public WebElement emailIDNextBtn;
//
//	@FindBy(css = "#passwordNext .RveJvd")
//	public WebElement PwdNextBtn;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement googleDriveSearchField;
	@FindBy(xpath = "(//a[contains(text(),'Sign in')])[2]")
	public WebElement signInLink;
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement gmailNextButton;
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement gmailTtile;
	@FindBy(xpath = "//*[@aria-label='Inbox']")
	public WebElement mailInboxTab;
	@FindBy(xpath = "(//*[@class='Tm aeJ']//tr//following::span[contains(text(),'Replacement login information for ss ssd at Michael Page')])[2]")
	public WebElement receivedMailInBox;
	@FindBy(xpath = "(//*[@class='Tm aeJ']//tr//following::div[contains(text(),'request to reset the password')])[2]")
	public WebElement multiplereceivedMailInSameMail;
	@FindBy(xpath = "//*[@class='hP']")
	public WebElement verifyMailSubject;

	// From gmail -After clcik on new mail
	@FindBy(xpath = "//a[text()='Reset Password']")
	public WebElement resetPasswordButton;
	// From gmail -After clcik on reset password link
	@FindBy(xpath = "//h1[@class='title']")
	public WebElement forgottenPasswordTtile;
	// From gmail -After clcik on reset password link
	@FindBy(xpath = "//*[@id='edit-name']")
	public WebElement emailAddressAfterResetPassword;
	// From gmail -After clcik on reset password link
	@FindBy(xpath = "//*[@class='messages status']")
	public WebElement furtherInstructionsMessage;
	// From gmail -After clcik on reset password link
	@FindBy(xpath = "//*[@class='messages error']")
	public WebElement errorMSGChangePassword;

	public MP_SIT_ApplywithyourCV_GoogleDrivePage() {
		PageFactory.initElements(driver, this);
	}

	public void LunchGmailSignInURL() throws InterruptedException {
		login.navigateGmailSignInURL();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
	}

	public void enterText(String webElementTitle) throws AWTException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "EMAIL ADDRESS": {
			ReusableMethodTC.elementToBeVisible(googleDriveMailId);
			ReusableMethodTC.highLighterMethod(driver, googleDriveMailId);
			System.out.println(dto.getGmailAddress());
			ReusableMethodTC.sendKeys(googleDriveMailId, dto.getGmailAddress());
			Reporter.log("Entered Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Email Address");
			break;
		}
		case "PASSWORD": {
			ReusableMethodTC.elementToBeVisible(googleDrivePwd);
			ReusableMethodTC.highLighterMethod(driver, googleDrivePwd);
			ReusableMethodTC.sendKeys(googleDrivePwd, dto.getGmailPwd());
			Reporter.log("Entered Password");
			LogFile.APPLICATION_LOGS.info("Entered Password");
			break;
		}
		case "GMAIL ADDRESS": {
			ReusableMethodTC.elementToBeVisible(googleDriveMailId);
			ReusableMethodTC.highLighterMethod(driver, googleDriveMailId);
			System.out.println(dto.getGmailAddress());
			ReusableMethodTC.sendKeys(googleDriveMailId, dto.getGmailAddress());
			ReusableMethodTC.sendKeys(googleDriveMailId, Keys.TAB);
			ReusableMethodTC.sendKeys(googleDriveMailId, Keys.ENTER);
			Reporter.log("Entered gmail Address");
			LogFile.APPLICATION_LOGS.info("Entered gmail Address");
			break;
		}
		case "GMAIL PASSWORD": {
			ReusableMethodTC.elementToBeVisible(googleDrivePwd);
			ReusableMethodTC.highLighterMethod(driver, googleDrivePwd);
			ReusableMethodTC.sendKeys(googleDrivePwd, dto.getGmailPwd());
			Robot ro = new Robot();
			ro.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			ro.keyPress(KeyEvent.VK_TAB);
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);
			break;
		}
		case "GMAIL ADDRESS AFTER RESET PASSWORD": {
			ReusableMethodTC.elementToBeVisible(emailAddressAfterResetPassword);
			ReusableMethodTC.highLighterMethod(driver, emailAddressAfterResetPassword);
			System.out.println(dto.getGmailAddress());
			ReusableMethodTC.sendKeys(emailAddressAfterResetPassword, dto.getGmailAddress());
			ReusableMethodTC.sendKeys(emailAddressAfterResetPassword, Keys.TAB);
			ReusableMethodTC.sendKeys(googleDriveMailId, Keys.ENTER);
			Reporter.log("Entered gmail Address after reset password in gmail");
			LogFile.APPLICATION_LOGS.info("Entered gmail Address after reset password in gmail");
			break;
		}
		}
	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {

		case "EMAIL ID NEXT": {
			ReusableMethodTC.highLighterMethod(driver, emailIDNextBtn);
			ReusableMethodTC.click(emailIDNextBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Next' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Next' button");
			break;
		}
		case "PASSWORD NEXT": {
			ReusableMethodTC.highLighterMethod(driver, PwdNextBtn);
			ReusableMethodTC.click(PwdNextBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Next' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Next' button");
			break;
		}
		case "GMAIL NEXT": {
			ReusableMethodTC.highLighterMethod(driver, gmailNextButton);
			ReusableMethodTC.clickByJS(gmailNextButton);
			Reporter.log("Clicked on 'Next' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Next' button");
			break;
		}
		case "INBOX TAB": {
			ReusableMethodTC.elementToBeVisible(mailInboxTab);
			ReusableMethodTC.highLighterMethod(driver, mailInboxTab);
			ReusableMethodTC.click(mailInboxTab);
			System.out.println("Clicked on 'Inbox' tab");
			Reporter.log("Clicked on 'Inbox' tab");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Inbox' tab");
			break;
		}
		case "RECEIVED MAILINBOX": {
			try {
				ReusableMethodTC.elementToBeVisible(receivedMailInBox);
				ReusableMethodTC.highLighterMethod(driver, receivedMailInBox);
				ReusableMethodTC.click(receivedMailInBox);
				System.out.println("Clicked on 'Received Mail' link");
				Reporter.log("Clicked on 'Received Mail' link");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Received Mail' link");
				if (multiplereceivedMailInSameMail.isDisplayed()) {
					ReusableMethodTC.highLighterMethod(driver, multiplereceivedMailInSameMail);
					ReusableMethodTC.click(multiplereceivedMailInSameMail);

					ReusableMethodTC.elementToBeVisible(resetPasswordButton);
					ReusableMethodTC.highLighterMethod(driver, resetPasswordButton);
					ReusableMethodTC.click(resetPasswordButton);
					System.out.println("Clicked on 'Reset Password button");
					Reporter.log("Clicked on 'Reset Password button");
					LogFile.APPLICATION_LOGS.info("Clicked on 'Reset Password button");
				} else {
					ReusableMethodTC.elementToBeVisible(resetPasswordButton);
					ReusableMethodTC.highLighterMethod(driver, resetPasswordButton);
					ReusableMethodTC.click(resetPasswordButton);
					System.out.println("Clicked on 'Reset Password button");
					Reporter.log("Clicked on 'Reset Password button");
					LogFile.APPLICATION_LOGS.info("Clicked on 'Reset Password button");
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		case "RESET PASSWORD": {
			ReusableMethodTC.elementToBeVisible(resetPasswordButton);
			ReusableMethodTC.highLighterMethod(driver, resetPasswordButton);
			ReusableMethodTC.click(resetPasswordButton);
			System.out.println("Clicked on 'Reset Password button");
			Reporter.log("Clicked on 'Reset Password button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Reset Password button");
			break;
		}
		}
	}

	public void verifyTextMessage(String webElementTitle) throws Exception {
		switch (webElementTitle.toUpperCase()) {
		case "GMAIL TITLE": {
			ReusableMethodTC.elementToBeVisible(gmailTtile);
			ReusableMethodTC.highLighterMethod(driver, gmailTtile);
			System.out.println("Verified : After login Gmail Title is: " + gmailTtile.getText());
			Reporter.log("Verified : After login Gmail Title is: " + gmailTtile.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : After login Gmail Title is:");
			break;
		}
		case "MAIL SUBJECT": {
			ReusableMethodTC.elementToBeVisible(verifyMailSubject);
			ReusableMethodTC.highLighterMethod(driver, verifyMailSubject);
			System.out.println("Verified : Mail subject after opening new mail is: " + verifyMailSubject.getText());
			Reporter.log("Verified : Gmail Title is: " + verifyMailSubject.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : Gmail Title is:");
			break;
		}
		case "FORGOTTEN PASSWORD IN GMAIL": {
			ReusableMethodTC.elementToBeVisible(forgottenPasswordTtile);
			ReusableMethodTC.highLighterMethod(driver, forgottenPasswordTtile);
			System.out.println("Verified : " + forgottenPasswordTtile.getText() + "  is Displayed");
			Reporter.log("Verified : " + forgottenPasswordTtile.getText() + "  is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Forgotten Password title after click on reset password link");
			break;
		}
		case "FURTHER INSTRUCTIONS SUCCESSFULLY MESSAGE IN GMAIL": {
			ReusableMethodTC.elementToBeVisible(furtherInstructionsMessage);
			ReusableMethodTC.highLighterMethod(driver, furtherInstructionsMessage);
			System.out.println("Verified : " + furtherInstructionsMessage.getText() + "  is Displayed");
			Reporter.log("Verified : " + furtherInstructionsMessage.getText() + "  is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Further Instruction Message is Displayed");
			break;
		}
		case "CHANGE PASSWORD ERROR MESSAGE IN GMAIL": {
			ReusableMethodTC.elementToBeVisible(errorMSGChangePassword);
			ReusableMethodTC.highLighterMethod(driver, errorMSGChangePassword);
			System.out.println("Verified : " + errorMSGChangePassword.getText() + "  is Displayed");
			Reporter.log("Verified : " + errorMSGChangePassword.getText() + "  is Displayed");
			LogFile.APPLICATION_LOGS
					.debug("Verified :Error Message Password must not match last 3 passwords   is Displayed");
			break;
		}

		}
	}

	public void uploadFileinGoogleDrive(String webElementTitle) throws Throwable {
		Robot robotObj = new Robot();
		switch (webElementTitle) {

		case "DOC": {
			ReusableMethodTC.navigateToFrame();
			driver.switchTo().activeElement().click();
			Thread.sleep(2000);

			robotObj.keyPress(KeyEvent.VK_TAB);
			robotObj.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

			driver.close();
			BrowserCallingTC bc = new BrowserCallingTC();
			bc.browserSelection();

			break;
		}
		}
	}

}