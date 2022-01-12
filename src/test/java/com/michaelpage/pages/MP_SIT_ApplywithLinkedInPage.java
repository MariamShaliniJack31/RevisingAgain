package com.michaelpage.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.michaelpage.common.utils.RandomDataUtil;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_ApplywithLinkedInPage extends ReusableMethodTC {

	String usernameLinkedIn = Dto.getUsernameLinkedIn();
	String passwordLinkedIn = Dto.getPasswordLinkedIn();
	String passwordUnlockFeature = Dto.getPasswordUnlock();
	String usernameLinkedIn1 = Dto.getUsernameLinkedIn1();
	String passwordLinkedIn1 = Dto.getPasswordLinkedIn1();

	// Apply with LinkedIn Page - Apply with LinkedIn text
	@FindBy(xpath = "//h2[contains(text(),'Apply with LinkedIn')]")
	public WebElement ApplywithLinkedIntext;

	// Apply with LinkedIn Page -Apply with LinkedIn Profile text
	@FindBy(xpath = "//div[contains(text(),'You can apply for this job using your LinkedIn profile')]")
	public WebElement applyLinkedinProfileText;

	// Apply with LinkedIn Page -Apply with CV instead link
	@FindBy(xpath = "//a[text()='Apply with CV Instead']")
	public WebElement applyWithCvinsteadLnk;

	// Apply with LinkedIn Page -Apply with CV instead
	@FindBy(xpath = "//div[text()='Apply with your CV']")
	public WebElement applyWithyourCvinsteadText;

	// Apply with LinkedIn Page -Attach cv apply form text
	@FindBy(xpath = "//h2[text()='Apply with your CV']//following-sibling::h3")
	public WebElement attachCvApplyForm;

	// Apply with LinkedIn Page -Signin with LinkedIn Button
	@FindBy(xpath = "//span[text()='Sign in with LinkedIn']")
	public WebElement signinWithLinkedInBtn;

	// Apply with LinkedIn Page -Signin with LinkedIn Button
	@FindBy(xpath = "//span[text()='Apply with LinkedIn']")
	public WebElement applyWithLinkedInBtn;

	// Apply with LinkedIn Page -username text box
	@FindBy(xpath = "//input[@id='username']")
	public WebElement usernameTxb;

	// Apply with LinkedIn Page -Password text box
	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordTxb;

	// Apply with LinkedIn Page -SignIn Button
	@FindBy(xpath = "//button[text()='Sign in']")
	public WebElement signInBtn;

	// Apply with LinkedIn Page -Apply with linkedin Button
	@FindBy(xpath = "//span[text()='Apply with LinkedIn']")
	public WebElement applyWithLinkedInBtnBtn;

	// Apply with LinkedIn Page -LinkedIn name text box
	@FindBy(xpath = "//input[@id='edit-mp-name']")
	public WebElement nameTxb;

	// Apply with LinkedIn Page -LinkedIn role text box
	@FindBy(xpath = "//input[@id='edit-mp-role']")
	public WebElement roleTxb;

	// Apply with LinkedIn Page -LinkedIn email text box
	@FindBy(xpath = "//input[@id='edit-mp-user-mail']")
	public WebElement emailTxb;

	// Apply with LinkedIn Page -LinkedIn education text box
	@FindBy(xpath = "//textarea[@id='edit-education']")
	public WebElement educationTxb;

	// Apply with LinkedIn Page -LinkedIn experience text box
	@FindBy(xpath = "//textarea[@id='edit-experience']")
	public WebElement experienceTxb;

	// Apply with LinkedIn Page -LinkedIn experience text box
	@FindBy(xpath = "//label[contains(text(),'Create an account to unlock features including One Click Apply')]")
	public WebElement accountUnlockOptionTxb;

	// Apply with LinkedIn Page -LinkedIn experience text box
	@FindBy(xpath = "//input[@id='edit-password']")
	public WebElement unlockFeaturePasswordTxb;

	// Apply with LinkedIn Page -LinkedIn experience text box
	@FindBy(xpath = "//input[@id='edit-submit']")
	public WebElement submitBtn;

	// Apply with LinkedIn Page -LinkedIn Phone number text box
	@FindBy(xpath = "//input[@id='edit-mp-phone-number']")
	public WebElement phoneNumberTxb;

	// Apply with LinkedIn Page -Instruction Link
	@FindBy(xpath = "//h3[contains(text(),'Please review the information captured from your Linkedin profile')]")
	public WebElement instructionLnk;

	// Apply with LinkedIn Page -Name error text
	@FindBy(xpath = "//strong[contains(text(),'Name is required.')]")
	public WebElement nameErrorTxt;

	// Apply with LinkedIn Page -Name error text
	@FindBy(xpath = "//strong[contains(text(),'Email address is required.')]")
	public WebElement emailErrorTxt;

	// Apply with LinkedIn Page -Role error text
	@FindBy(xpath = "//strong[contains(text(),'Role field has a maximum length of 65.')]")
	public WebElement roleErrorTxt;

	// Apply with LinkedIn Page -Phone number error text
	@FindBy(xpath = "//strong[contains(text(),'Please enter a valid phone number.')]")
	public WebElement phoneNumberErrorTxt;

	// Apply with LinkedIn Page -Education link
	@FindBy(xpath = "//h3[contains(text(),'Education')]")
	public WebElement educationLnk;

	// Apply with LinkedIn Page -Experience link
	@FindBy(xpath = "//h3[contains(text(),'Experience')]")
	public WebElement experienceLnk;

	// Apply with LinkedIn Page -LinkedIn Next Button
	@FindBy(xpath = "//input[@id='edit-next']")
	public WebElement nextLinkedInBtn;

	public MP_SIT_ApplywithLinkedInPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyTextMessage(String webElementTitle) throws Exception {

		switch (webElementTitle.toUpperCase()) {

		case "APPLY WITH LINKEDIN TEXT": {
			ReusableMethodTC.elementToBeVisible(ApplywithLinkedIntext);
			ReusableMethodTC.highLighterMethod(driver, ApplywithLinkedIntext);
			ReusableMethodTC.verifyText("Apply with LinkedIn", ApplywithLinkedIntext.getText());
			System.out.println("Verified : Apply with LINKEDIN Text displayed Successfully");
			Reporter.log("Verified :Apply with LINKEDIN text displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Apply with LINKEDIN text displayed Successfully");
			break;
		}

		case "APPLY WITH CV INSTEAD": {
			ReusableMethodTC.elementToBeVisible(applyWithCvinsteadLnk);
			ReusableMethodTC.highLighterMethod(driver, applyWithCvinsteadLnk);
			ReusableMethodTC.verifyText("Apply with CV Instead", applyWithCvinsteadLnk.getText());
			System.out.println("Verified : APPLY WITH CV INSTEAD DISPLAYING");
			Reporter.log("Verified : APPLY WITH CV INSTEAD DISPLAYING");
			LogFile.APPLICATION_LOGS.debug("Verified : APPLY WITH CV INSTEAD DISPLAYING");
			break;
		}

		case "APPLY WITH CV INSTEAD LNK": {
			ReusableMethodTC.elementToBeVisible(applyWithyourCvinsteadText);
			ReusableMethodTC.highLighterMethod(driver, applyWithyourCvinsteadText);
			ReusableMethodTC.verifyText("Apply with your CV", applyWithyourCvinsteadText.getText());
			System.out.println("Verified : APPLY WITH CV INSTEAD LINK DISPLAYING");
			Reporter.log("Verified : APPLY WITH CV INSTEAD Link DISPLAYING");
			LogFile.APPLICATION_LOGS.debug("Verified : APPLY WITH CV INSTEAD Link DISPLAYING");
			break;
		}

		case "APPLY WITH CV FORM": {

			ReusableMethodTC.elementToBeVisible(attachCvApplyForm);
			ReusableMethodTC.highLighterMethod(driver, attachCvApplyForm);
			ReusableMethodTC.verifyText("Please complete the below form and attach a CV to apply",
					attachCvApplyForm.getText());
			// ReusableMethodTC.alertAccept_Dismiss(0);
			// ReusableMethodTC.alertAccept_Leave();
			System.out.println("Verified : APPLY WITH Cv Form IS DISPLAYING");
			Reporter.log("Verified : APPLY WITH Cv FORM IS DISPLAYING");
			LogFile.APPLICATION_LOGS.debug("Verified : APPLY WITH Cv FORM IS DISPLAYING");
			Thread.sleep(2000);
			System.out.println("URL:" + driver.getCurrentUrl());
			break;
		}

		case "APPLY JOB IN LINKEDIN PROFILE": {

			ReusableMethodTC.elementToBeVisible(applyLinkedinProfileText);
			ReusableMethodTC.highLighterMethod(driver, applyLinkedinProfileText);
			ReusableMethodTC.verifyText("You can apply for this job using your LinkedIn profile",
					applyLinkedinProfileText.getText());
			System.out.println("Verified : APPLY WITH LINKED IN JOB PROFILE IS DISPLAYING ");
			Reporter.log("Verified : APPLY WITH LINKED IN JOB PROFILE IS DISPLAYING");
			LogFile.APPLICATION_LOGS.debug("Verified : APPLY WITH LINKED IN JOB PROFILE IS DISPLAYING");
			break;
		}

		case "ACCOUNT NAME": {

			ReusableMethodTC.elementToBeVisible(nameTxb);
			ReusableMethodTC.highLighterMethod(driver, nameTxb);
			ReusableMethodTC.verifyText("Account Apply journey", nameTxb.getAttribute("value"));
			System.out.println("Verified : Apply with LINKEDIN page displayed Successfully");
			Reporter.log("Verified :Apply Name displayed Successfully in apply with linked in page");
			LogFile.APPLICATION_LOGS.debug(
					"Verified : Apply Name displayed Successfully displayed Successfully in apply with linked in page");
			break;
		}
		case "JOB ROLE": {
			ReusableMethodTC.elementToBeVisible(roleTxb);
			ReusableMethodTC.highLighterMethod(driver, roleTxb);
			ReusableMethodTC.verifyText("Test Marketing & Communications Manager EMEA & Global at Capgemini",
					roleTxb.getAttribute("value"));
			System.out.println("Verified : Job Role displayed Successfully in apply with linked in page");
			Reporter.log("Verified :Job Role displayed Successfully in apply with linked in page");
			LogFile.APPLICATION_LOGS.debug("Verified : Job Role displayed Successfully in apply with linked in page");
			break;
		}
		case "EMAIL ADDRESS": {
			scrollIntoElement(emailTxb);
			ReusableMethodTC.elementToBeVisible(emailTxb);
			ReusableMethodTC.highLighterMethod(driver, emailTxb);
			ReusableMethodTC.verifyText("testmichaelpage@gmail.com", emailTxb.getAttribute("value"));
			System.out.println("Verified : E-mail Address displayed Successfully in apply with linked in page");
			Reporter.log("Verified :E-mail Address Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : E-mail Address Successfully");
			break;
		}
		case "PHONE NUMBER": {
			scrollIntoElement(phoneNumberTxb);
			ReusableMethodTC.elementToBeVisible(phoneNumberTxb);
			ReusableMethodTC.highLighterMethod(driver, phoneNumberTxb);
			ReusableMethodTC.verifyText("+4467890345", phoneNumberTxb.getAttribute("value"));
			System.out.println("Verified : Phone Number displayed Successfully");
			Reporter.log("Verified :Phone Number  displayed Successfully in apply with linked in page");
			LogFile.APPLICATION_LOGS.debug(
					"Verified : Phone Number  displayed Successfully displayed Successfully in apply with linked in page");
			break;
		}
		case "EDUCATION": {
			scrollIntoElement(educationTxb);
			ReusableMethodTC.elementToBeVisible(educationTxb);
			ReusableMethodTC.highLighterMethod(driver, educationTxb);
			ReusableMethodTC.verifyTextPresent("Calcutta University, Kolkata", educationTxb.getAttribute("value"));
			System.out.println("Verified : Education details displyed Successfully in apply with linked in page");
			Reporter.log("Verified :Education details displayed Successfully in apply with linked in page");
			LogFile.APPLICATION_LOGS
					.debug("Verified : Education details displayed Successfully in apply with linked in page");
			break;
		}
		case "JOB EXPERIENCE": {
			scrollIntoElement(experienceTxb);
			ReusableMethodTC.elementToBeVisible(experienceTxb);
			ReusableMethodTC.highLighterMethod(driver, experienceTxb);
			ReusableMethodTC.verifyTextPresent("Test Marketing & Communications Manager",
					experienceTxb.getAttribute("value"));

			System.out.println("Verified : Experience details displayed Successfully in apply with linked in page");
			Reporter.log("Verified :Experience details displayed Successfully in apply with linked in page");
			LogFile.APPLICATION_LOGS
					.debug("Verified : Experience details displayed Successfully in apply with linked in page");
			break;
		}
		case "ACCOUNT UNLOCK FEATURE": {
			scrollIntoView(accountUnlockOptionTxb);
			ReusableMethodTC.elementToBeVisible(accountUnlockOptionTxb);
			ReusableMethodTC.highLighterMethod(driver, accountUnlockOptionTxb);
			ReusableMethodTC.verifyText("Create an account to unlock features including One Click Apply",
					accountUnlockOptionTxb.getText());
			System.out.println(
					"Verified :Account unlock feature radio button displayed Successfully in apply with linked in page");
			Reporter.log(
					"Verified :Account unlock feature radio button displayed Successfully in apply with linked in page");
			LogFile.APPLICATION_LOGS.debug(
					"Verified : Account unlock feature radio button displayed Successfully in apply with linked in page");
			break;
		}

		case "INSTRUCTION NOTE": {
			ReusableMethodTC.elementToBeVisible(instructionLnk);
			ReusableMethodTC.highLighterMethod(driver, instructionLnk);
			ReusableMethodTC.verifyText(
					"Please review the information captured from your Linkedin profile and provide contact details.",
					instructionLnk.getText());
			System.out.println(instructionLnk.getText());
			System.out.println("Verified : Apply with LINKEDIN Text displayed Successfully");
			Reporter.log("Verified :Instruction note displayed Successfully in linked in page");
			LogFile.APPLICATION_LOGS.debug("Instruction note displayed Successfully in linked in page");
			break;
		}
		case "NAME ERROR": {
			ReusableMethodTC.elementToBeVisible(nameTxb);
			ReusableMethodTC.highLighterMethod(driver, nameTxb);
			ReusableMethodTC.clear(nameTxb);
			Thread.sleep(1000);
			ReusableMethodTC.verifyText("Name is required.", nameErrorTxt.getText());
			System.out.println("Verified : Name error displayed Successfully");
			Reporter.log("Verified :Name error  displayed Successfully in linked in page");
			LogFile.APPLICATION_LOGS.debug("Name error displayed Successfully in linked in page");
			break;
		}
		case "EMAIL ERROR": {
			ReusableMethodTC.elementToBeVisible(emailTxb);
			ReusableMethodTC.highLighterMethod(driver, emailTxb);
			ReusableMethodTC.clear(emailTxb);
			Thread.sleep(1000);
			ReusableMethodTC.verifyText("Email address is required.", emailErrorTxt.getText());
			System.out.println("Verified : email error displayed Successfully");
			Reporter.log("Verified :email error  displayed Successfully in linked in page");
			LogFile.APPLICATION_LOGS.debug("email error displayed Successfully in linked in page");
			break;
		}
		case "ROLE ERROR": {
			ReusableMethodTC.elementToBeVisible(roleErrorTxt);
			ReusableMethodTC.highLighterMethod(driver, roleErrorTxt);
			Thread.sleep(1000);
			ReusableMethodTC.verifyText("Role field has a maximum length of 65.", roleErrorTxt.getText());
			System.out.println("Verified : role error displayed Successfully");
			Reporter.log("Verified :role error  displayed Successfully in linked in page");
			LogFile.APPLICATION_LOGS.debug("role error displayed Successfully in linked in page");
			break;
		}
		case "PHONE ERROR": {
			ReusableMethodTC.elementToBeVisible(phoneNumberTxb);
			ReusableMethodTC.highLighterMethod(driver, phoneNumberTxb);
			ReusableMethodTC.clear(phoneNumberTxb);
			ReusableMethodTC.sendKeys(phoneNumberTxb, "Michael");
			ReusableMethodTC.sendKeys(roleTxb, "Test Marketing & Communications Manager EMEA & Global at Capgeminii");
			Thread.sleep(1000);
			ReusableMethodTC.verifyText("Please enter a valid phone number.", phoneNumberErrorTxt.getText());
			System.out.println("Verified : role error displayed Successfully");
			Reporter.log("Verified :role error  displayed Successfully in linked in page");
			LogFile.APPLICATION_LOGS.debug("role error displayed Successfully in linked in page");
			break;
		}
		case "JOB ROLEEXP": {
			ReusableMethodTC.elementToBeVisible(roleTxb);
			ReusableMethodTC.highLighterMethod(driver, roleTxb);
			String text = roleTxb.getAttribute("value");
			System.out.println("---------" + text);
			if (!text.trim().equals("")) {
				System.out.println("Job Role input box is not empty");
				Reporter.log("Verified :Job Role input box is not empty in apply with linked in page");
				LogFile.APPLICATION_LOGS.debug("Verified : Job Role input box is empty in apply with linked in page");
			} else {
				System.out.println("Job Role input box is  empty");
				Reporter.log("Verified :Job Role input box is  empty in apply with linked in page");
				LogFile.APPLICATION_LOGS.debug("Verified :Job Role input box is  empty in apply with linked in page");
			}
			break;
		}

		case "JOB URL": {
			String strURL = driver.getCurrentUrl();
			Assert.assertTrue(strURL.contains("source&utm"));
			System.out.println("Verified : The URl is : " + strURL.toString());
			Reporter.log("Verified : Apply job with linked in URl is : " + strURL);
			LogFile.APPLICATION_LOGS.debug("Verified : Apply job with linked in URl is : " + strURL);
			break;
		}
		}

	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException, AWTException {

		switch (webElementTitle.toUpperCase()) {
		case "APPLY CV INSTEAD": {
			ReusableMethodTC.highLighterMethod(driver, applyWithCvinsteadLnk);
			ReusableMethodTC.click(applyWithCvinsteadLnk);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Apply CV Instead' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Apply linked in' button");
			break;
		}
		case "SIGNIN WITH LINKEDIN": {
			Thread.sleep(3000);
			driver.switchTo().frame(
					driver.findElement(By.xpath("//*[@id='job-apply-linkedin-widget']/div[3]/span/span/iframe")));
			ReusableMethodTC.elementToBeVisible(signinWithLinkedInBtn);
			ReusableMethodTC.highLighterMethod(driver, signinWithLinkedInBtn);
			ReusableMethodTC.click(signinWithLinkedInBtn);
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Reporter.log("Clicked on 'SignIn with linked in' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'SignIn linked in' button");
			break;
		}
		case "SIGNIN": {
			ReusableMethodTC.elementToBeVisible(signInBtn);
			ReusableMethodTC.highLighterMethod(driver, signInBtn);
			ReusableMethodTC.click(signInBtn);
			Thread.sleep(2000);
			ReusableMethodTC.navigateToMainWindow();
			Reporter.log("Clicked on 'SignIn with linked in' button");
			LogFile.APPLICATION_LOGS.info("SignIn with linked in' button");
			break;
		}
		case "APPLY WITH LINKEDIN": {
			driver.switchTo().frame(
					driver.findElement(By.xpath("//*[@id='job-apply-linkedin-widget']/div[3]/span/span/iframe")));
			ReusableMethodTC.elementToBeVisible(applyWithLinkedInBtn);
			ReusableMethodTC.highLighterMethod(driver, applyWithLinkedInBtn);
			ReusableMethodTC.click(applyWithLinkedInBtn);
			ReusableMethodTC.alertAccept_Dismiss(0);
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Reporter.log("Clicked on 'Apply with linked in' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Apply WITH linked in' button");
			Thread.sleep(2000);
			break;
		}
		case "UNLOCK FEATURE": {
			ReusableMethodTC.elementToBeVisible(accountUnlockOptionTxb);
			ReusableMethodTC.highLighterMethod(driver, accountUnlockOptionTxb);
			ReusableMethodTC.click(accountUnlockOptionTxb);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Unlock Feature' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Unlock Feature' button");
			break;
		}
		case "SUBMIT": {
			ReusableMethodTC.elementToBeVisible(submitBtn);
			ReusableMethodTC.highLighterMethod(driver, submitBtn);
			ReusableMethodTC.click(submitBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Apply with Sumit' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Submit' button");
			break;
		}

		case "APPLY NOW": {
			ReusableMethodTC.elementToBeVisible(submitBtn);
			ReusableMethodTC.highLighterMethod(driver, submitBtn);
			ReusableMethodTC.click(submitBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Apply with Sumit' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Submit' button");
			break;
		}

		case "EDUCATION": {
			ReusableMethodTC.elementToBeVisible(educationLnk);
			ReusableMethodTC.highLighterMethod(driver, educationLnk);
			ReusableMethodTC.click(educationLnk);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Education' Link");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Education' link");
			break;
		}
		case "EXPERIENCE": {
			ReusableMethodTC.elementToBeVisible(experienceLnk);
			ReusableMethodTC.highLighterMethod(driver, experienceLnk);
			ReusableMethodTC.click(experienceLnk);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Experience' Link");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Experience' link");
			break;
		}
		case "NEXT": {
			ReusableMethodTC.elementToBeVisible(nextLinkedInBtn);
			ReusableMethodTC.highLighterMethod(driver, nextLinkedInBtn);
			ReusableMethodTC.click(nextLinkedInBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Next' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Next' button");
			break;
		}


		}

	}

	public void enterText(String webElementTitle) {

		switch (webElementTitle.toUpperCase()) {
		case "USERNAME": {
			try {
				ReusableMethodTC.navigateToOtherWindow();
			} catch (InterruptedException e) {
				System.out.println("Window is not present");
			}
			ReusableMethodTC.highLighterMethod(driver, usernameTxb);
			ReusableMethodTC.sendKeys(usernameTxb, usernameLinkedIn);
			Reporter.log("Entered User Name");
			LogFile.APPLICATION_LOGS.info("Entered User Name");
			break;
		}
		case "PASSWORD": {
			ReusableMethodTC.highLighterMethod(driver, passwordTxb);
			ReusableMethodTC.sendKeys(passwordTxb, passwordLinkedIn);
			Reporter.log("Entered Password");
			LogFile.APPLICATION_LOGS.info("Entered Password");
			break;

		}
		case "UNLOCK PASSWORD": {
			ReusableMethodTC.highLighterMethod(driver, unlockFeaturePasswordTxb);
			ReusableMethodTC.sendKeys(unlockFeaturePasswordTxb, passwordLinkedIn);
			Reporter.log("Entered Password");
			LogFile.APPLICATION_LOGS.info("Entered Password");
			break;

		}
		case "USERNAME1": {
			try {
				ReusableMethodTC.navigateToOtherWindow();
			} catch (InterruptedException e) {
				System.out.println("Window is not present");
			}
			ReusableMethodTC.highLighterMethod(driver, usernameTxb);
			ReusableMethodTC.sendKeys(usernameTxb, usernameLinkedIn1);
			Reporter.log("Entered User Name");
			LogFile.APPLICATION_LOGS.info("Entered User Name");
			break;
		}
		case "PASSWORD1": {
			ReusableMethodTC.highLighterMethod(driver, passwordTxb);
			ReusableMethodTC.sendKeys(passwordTxb, passwordLinkedIn1);
			Reporter.log("Entered Password");
			LogFile.APPLICATION_LOGS.info("Entered Password");
			break;

		}
		}
	}

	public void verifyInputBoxEditable(String webElementTitle) throws Exception {

		switch (webElementTitle.toUpperCase()) {

		case "ACCOUNT NAME EDITABLE": {
			elementToBeVisible(nameTxb);
			ReusableMethodTC.highLighterMethod(driver, nameTxb);
			ReusableMethodTC.editableInputBox(nameTxb, RandomDataUtil.randomStringGenerator());
			Reporter.log("Account name is editable");
			LogFile.APPLICATION_LOGS.info("Account name is editable");
			break;
		}
		case "JOB ROLE EDITABLE": {
			elementToBeVisible(roleTxb);
			ReusableMethodTC.highLighterMethod(driver, roleTxb);
			Thread.sleep(2000);
			ReusableMethodTC.editableInputBox(roleTxb, RandomDataUtil.randomStringGenerator());
			Reporter.log("Job role is editable");
			LogFile.APPLICATION_LOGS.info("Job role is editable");
			break;
		}
		case "EMAIL ADDRESS EDITABLE": {
			elementToBeVisible(emailTxb);
			ReusableMethodTC.highLighterMethod(driver, emailTxb);
			scrollIntoView(emailTxb);
			ReusableMethodTC.editableInputBox(emailTxb, RandomDataUtil.randomStringGenerator() + "12@gmail.com");
			Thread.sleep(2000);
			Reporter.log("email validation complete");
			Reporter.log("Email is editable");
			LogFile.APPLICATION_LOGS.info("Email is editable");
			break;
		}
		case "EDUCATION EDITABLE": {
			elementToBeVisible(educationTxb);
			ReusableMethodTC.highLighterMethod(driver, educationTxb);
			ReusableMethodTC.editableInputBox(educationTxb, RandomDataUtil.randomIntegerGenerator());
			Reporter.log("Education is editable");
			LogFile.APPLICATION_LOGS.info("EDUCATION is editable");
			break;
		}
		case "EXPERIENCE EDITABLE": {
			elementToBeVisible(experienceTxb);
			ReusableMethodTC.highLighterMethod(driver, experienceTxb);
			Random ran = new Random();
			String exp = ran.nextInt(10) + "";
			ReusableMethodTC.editableInputBox(experienceTxb, exp);
			ReusableMethodTC.verifyText(exp, experienceTxb.getAttribute("value"));
			Reporter.log("Experience is editable");
			LogFile.APPLICATION_LOGS.info("Experience is editable");
			break;
		}
		case "PHONE NUMBER EDITABLE": {
			elementToBeVisible(phoneNumberTxb);
			ReusableMethodTC.highLighterMethod(driver, phoneNumberTxb);
			scrollIntoView(phoneNumberTxb);
			ReusableMethodTC.editableInputBox(phoneNumberTxb, RandomDataUtil.randomIntegerGenerator());
			Reporter.log("Phone number is editable");
			LogFile.APPLICATION_LOGS.info("Account name is editable");
			break;
		}
		}
	}

	public void verifyField(String webElementTitle) {

		switch (webElementTitle.toUpperCase()) {

		case "EXPERIENCE": {
			List<WebElement> elementname = driver.findElements(By.xpath("//textarea[@id='edit-experience']"));
			int count = elementname.size();
			if (count == 0) {
				Reporter.log("Verified :Experience field is not present in apply with linked in page");
				LogFile.APPLICATION_LOGS.debug("Verified :Experience field is not present in apply with linked in page");
			}
			break;
		}

		case "EDUCATION": {
			List<WebElement> elementname = driver.findElements(By.xpath("//textarea[@id='edit-education']"));
			int count = elementname.size();
			if (count == 0) {
				Reporter.log("Verified :Education field is not present in apply with linked in page");
				LogFile.APPLICATION_LOGS.debug("Verified :Education field is not present in apply with linked in page");
			}
			break;
		}
		}

	}
}
