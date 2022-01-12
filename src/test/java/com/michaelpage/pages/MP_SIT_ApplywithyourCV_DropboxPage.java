package com.michaelpage.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.common.utils.ValueDTO;
import com.michaelpage.utils.LogFile;

public class MP_SIT_ApplywithyourCV_DropboxPage extends ReusableMethodTC {

	ValueDTO dto = new ValueDTO();

	// Drop Box Page elements
	@FindBy(xpath = "//input[@name='login_email']")
	public WebElement dropBoxEmailId;
	@FindBy(xpath = "//input[@name='login_password']")
	public WebElement dropBoxPwd;
	@FindBy(css = ".login-button > .sign-in-text")
	public WebElement dropBoxLogin;
	@FindBy(css = ".dropins-search-input")
	public WebElement dropBoxSearchField;
	@FindBy(css = ".dropins-chooser-files-list-item:nth-child(2) .mc-checkbox-border")
	public WebElement selectCheckBox;
	@FindBy(xpath = "//span[contains(text(),'Choose')]")
	public WebElement ChooseButton;

	@FindBy(xpath = "//*[@id='regular-login-forms']/div/div/div[1]/button/div")
	public WebElement signInWithGoogle;

	public MP_SIT_ApplywithyourCV_DropboxPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterText(String webElementTitle) {

		switch (webElementTitle.toUpperCase()) {
		case "EMAIL ADDRESS": {
			ReusableMethodTC.highLighterMethod(driver, dropBoxEmailId);
			ReusableMethodTC.sendKeys(dropBoxEmailId, dto.getGmailAddress());
			Reporter.log("Entered Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Email Address");
			break;
		}
		case "PASSWORD": {
			ReusableMethodTC.highLighterMethod(driver, dropBoxPwd);
			ReusableMethodTC.sendKeys(dropBoxPwd, dto.getGmailPwd());
			Reporter.log("Entered Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Email Address");
			break;
		}

		}

	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "SIGNIN": {
			ReusableMethodTC.highLighterMethod(driver, dropBoxLogin);
			ReusableMethodTC.click(dropBoxLogin);

			Thread.sleep(1000);
			Reporter.log("Clicked on 'Delete' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Delete' button");
			break;
		}
		case "SIGN IN WITH GOOGLE": {
			ReusableMethodTC.highLighterMethod(driver, signInWithGoogle);
			ReusableMethodTC.click(signInWithGoogle);

			Thread.sleep(1000);
			Reporter.log("Clicked on 'SIGN IN WITH GOOGLE' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'SIGN IN WITH GOOGLE' button");
			break;
		}
		}
	}

	public void uploadFileinDropBox(String webElementTitle) throws Throwable {
		switch (webElementTitle) {
		case "docx": {
			ReusableMethodTC.elementToBeVisible(dropBoxSearchField);
			ReusableMethodTC.highLighterMethod(driver, dropBoxSearchField);
			ReusableMethodTC.sendKeys(dropBoxSearchField, "CV - Kylie Minogue_docx_Format.docx");
			Thread.sleep(1000);
			ReusableMethodTC.click(selectCheckBox);
			ReusableMethodTC.click(ChooseButton);
			ReusableMethodTC.navigateToOtherWindow();
			Thread.sleep(2000);
			System.out.println("docx File Uploaded through Dropbox");
			Reporter.log("docx File Uploaded through Dropbox");
			break;
		}
		case "doc": {
			ReusableMethodTC.elementToBeVisible(dropBoxSearchField);
			ReusableMethodTC.highLighterMethod(driver, dropBoxSearchField);
			ReusableMethodTC.sendKeys(dropBoxSearchField, "dummy digital cv london_doc_Format.doc");
			Thread.sleep(1000);
			ReusableMethodTC.click(selectCheckBox);
			ReusableMethodTC.click(ChooseButton);
			ReusableMethodTC.navigateToOtherWindow();
			Thread.sleep(2000);
			System.out.println("doc File Uploaded");
			Reporter.log("docx File Uploaded");
			break;
		}
		case "pdf": {
			ReusableMethodTC.elementToBeVisible(dropBoxSearchField);
			ReusableMethodTC.highLighterMethod(driver, dropBoxSearchField);
			ReusableMethodTC.sendKeys(dropBoxSearchField, "CV - Kylie Minogue_pdf_Format.pdf");
			Thread.sleep(1000);
			ReusableMethodTC.click(selectCheckBox);
			ReusableMethodTC.click(ChooseButton);
			ReusableMethodTC.navigateToOtherWindow();
			Thread.sleep(2000);
			Reporter.log("pdf File Uploaded");
			break;
		}
		case "txt": {
			ReusableMethodTC.elementToBeVisible(dropBoxSearchField);
			ReusableMethodTC.highLighterMethod(driver, dropBoxSearchField);
			ReusableMethodTC.sendKeys(dropBoxSearchField, "CV - Kylie Minogue_txt_Format.txt");
			Thread.sleep(1000);
			ReusableMethodTC.click(selectCheckBox);
			ReusableMethodTC.click(ChooseButton);
			ReusableMethodTC.navigateToOtherWindow();
			Thread.sleep(2000);
			Reporter.log("txt File Uploaded");
			break;
		}
		case "DOCX": {
			ReusableMethodTC.elementToBeVisible(dropBoxSearchField);
			ReusableMethodTC.highLighterMethod(driver, dropBoxSearchField);
			ReusableMethodTC.sendKeys(dropBoxSearchField, "CV - Kylie Minogue2_DOCX_Format.DOCX");
			Thread.sleep(1000);
			ReusableMethodTC.click(selectCheckBox);
			ReusableMethodTC.click(ChooseButton);
			ReusableMethodTC.navigateToOtherWindow();
			Thread.sleep(2000);
			Reporter.log("DOCX File Uploaded");
			break;
		}
		case "DOC": {
			ReusableMethodTC.elementToBeVisible(dropBoxSearchField);
			ReusableMethodTC.highLighterMethod(driver, dropBoxSearchField);
			ReusableMethodTC.sendKeys(dropBoxSearchField, "dummy digital cv london2_DOC_Format.DOC");
			Thread.sleep(1000);
			ReusableMethodTC.click(selectCheckBox);
			ReusableMethodTC.click(ChooseButton);
			ReusableMethodTC.navigateToOtherWindow();
			Thread.sleep(2000);
			Reporter.log("DOC File Uploaded");
			break;
		}
		case "PDF": {
			ReusableMethodTC.elementToBeVisible(dropBoxSearchField);
			ReusableMethodTC.highLighterMethod(driver, dropBoxSearchField);
			ReusableMethodTC.sendKeys(dropBoxSearchField, "CV - Kylie Minogue2_PDF_Format.PDF");
			Thread.sleep(1000);
			ReusableMethodTC.click(selectCheckBox);
			ReusableMethodTC.click(ChooseButton);
			ReusableMethodTC.navigateToOtherWindow();
			Thread.sleep(2000);
			Reporter.log("PDF File Uploaded");
			break;
		}
		case "TXT": {
			ReusableMethodTC.elementToBeVisible(dropBoxSearchField);
			ReusableMethodTC.highLighterMethod(driver, dropBoxSearchField);
			ReusableMethodTC.sendKeys(dropBoxSearchField, "CV - Kylie Minogue2_TXT_Format.TXT");
			Thread.sleep(1000);
			ReusableMethodTC.click(selectCheckBox);
			ReusableMethodTC.click(ChooseButton);
			ReusableMethodTC.navigateToOtherWindow();
			Thread.sleep(2000);
			Reporter.log("TXT File Uploaded");
			break;
		}

		case "xlsx": {
			ReusableMethodTC.uploadFile(dropBoxSearchField, "Resume_xlsx_Format.xlsx");
			break;
		}

		case "resume with max size": {
			ReusableMethodTC.elementToBeVisible(dropBoxSearchField);
			ReusableMethodTC.highLighterMethod(driver, dropBoxSearchField);
			ReusableMethodTC.sendKeys(dropBoxSearchField, "ResumeWithSize_8.2MB.TXT");
			Thread.sleep(1000);
			ReusableMethodTC.click(selectCheckBox);
			ReusableMethodTC.click(ChooseButton);
			ReusableMethodTC.navigateToOtherWindow();
			Thread.sleep(2000);
			break;
		}

		}
	}

}