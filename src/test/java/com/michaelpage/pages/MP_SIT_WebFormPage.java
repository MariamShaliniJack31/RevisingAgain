package com.michaelpage.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_WebFormPage extends ReusableMethodTC {
	static LoginTC login = new LoginTC();

	// WebForm Page - Browse button
	@FindBy(xpath = "//span[contains(text(),'Browse')]")
	public WebElement browseBtnWebForm;

	// WebForm Page - Browse button
	@FindBy(xpath = "//input[@id='edit-submit']")
	public WebElement submitBtn;

	// WebForm Page - Invalid file upload error
	@FindBy(xpath = "//div[@class='form-item--error-message']")
	public WebElement invalidFileUploadError;

	// WebForm Page - Invalid file upload error
	@FindBy(xpath = "//a[contains(text(),'CV - Kylie Minogue')]")
	public WebElement uploadedFileName;

	// WebForm Page - Verify Success msg
	@FindBy(xpath = "//div[contains(text(),'New submission added to ')]")
	public WebElement successMsg;

	public MP_SIT_WebFormPage() {
		PageFactory.initElements(driver, this);
	}

	public void launchWebFormPage() {
		login.navigateToWebFormURL();
	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "BROWSE": {
			Thread.sleep(1000);
//			scrollIntoView(browseBtnWebForm);
			ReusableMethodTC.highLighterMethod(driver, browseBtnWebForm);
			ReusableMethodTC.click(browseBtnWebForm);
			Reporter.log("Clicked on 'Browse Button' ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Browse Button'");
			break;
		}
		case "SUBMIT": {
			try {
				Thread.sleep(1000);
				ReusableMethodTC.scrollIntoElement(submitBtn);
				ReusableMethodTC.highLighterMethod(driver, submitBtn);
				ReusableMethodTC.click(submitBtn);
				Reporter.log("Clicked on 'Submit Button' ");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Submit Button'");
			} catch (Exception e) {
				e.getMessage();
			}

		}
			break;
		}
	}

	public void uploadFileWithDiffFormat(String webElementTitle) throws Throwable {

		switch (webElementTitle) {
		case "docx": {
			ReusableMethodTC.uploadFileWebForm(browseBtnWebForm, "CV - Kylie Minogue_docx_Format.docx");
			Reporter.log("docx File Uploaded");
			break;
		}
		case "doc": {
			ReusableMethodTC.uploadFileWebForm(browseBtnWebForm, "dummy digital cv london_doc_Format.doc");
			Reporter.log("doc File Uploaded");
			break;
		}
		case "pdf": {
			ReusableMethodTC.uploadFileWebForm(browseBtnWebForm, "CV - Kylie Minogue_pdf_Format.pdf");
			Thread.sleep(5000);
			Reporter.log("pdf File Uploaded");
			break;
		}
		case "txt": {
			ReusableMethodTC.uploadFileWebForm(browseBtnWebForm, "CV - Kylie Minogue_txt_Format.txt");
			Reporter.log("txt File Uploaded");
			break;
		}
		case "xlsx": {
			ReusableMethodTC.uploadFileWebForm(browseBtnWebForm, "Resume_xlsx_Format.xlsx");
			break;
		}
		case "pdf With Max Size": {
			ReusableMethodTC.uploadFileWebForm(browseBtnWebForm, "CV - Kylie Minogue2_PDF_Format_3MB.pdf");
			Thread.sleep(3000);
			break;
		}

		}
	}

	public void verifyTextMessage(String webElementTitle) throws Throwable {

		switch (webElementTitle.toUpperCase()) {
		case "INVALID FILEEXTENSION ERROR": {
			ReusableMethodTC.scrollIntoElement(invalidFileUploadError);
			ReusableMethodTC.elementToBeVisible(invalidFileUploadError);
			ReusableMethodTC.highLighterMethod(driver, invalidFileUploadError);
			System.out.println(invalidFileUploadError.getText());
			System.out.println("Verified : The selected file  cannot be uploaded ");
			Reporter.log("Verified : The selected file  cannot be uploaded ");
			LogFile.APPLICATION_LOGS.debug("Verified : The selected file  cannot be uploaded ");
			break;
		}
		case "MAX SIZE ERROR": {
			ReusableMethodTC.elementToBeVisible(invalidFileUploadError);
			ReusableMethodTC.highLighterMethod(driver, invalidFileUploadError);
			System.out.println("Max size error::" + invalidFileUploadError.getText());
//			Assert.assertTrue(maxSizeCVError.getText().contains("exceeding the maximum file size of 5 MB"));
			System.out.println("Verified : The selected file  cannot be uploaded ");
			Reporter.log("Verified : The selected file  cannot be uploaded ");
			LogFile.APPLICATION_LOGS.debug("Verified : The selected file  cannot be uploaded ");
			break;
		}
		case "UPLOADED FILE NAME": {
			Thread.sleep(3000);
			ReusableMethodTC.scrollIntoElement(uploadedFileName);
			ReusableMethodTC.elementToBeVisible(uploadedFileName);
			ReusableMethodTC.highLighterMethod(driver, uploadedFileName);
			System.out.println(uploadedFileName.getText());
			System.out.println("Verified the uploaded file is:: " + uploadedFileName.getText().toString());
			Reporter.log("Verified the uploaded file is:: " + uploadedFileName.getText().toString());
			LogFile.APPLICATION_LOGS.debug("Verified the uploaded file is:: " + uploadedFileName.getText().toString());
			break;
		}
		case "SUCCESS": {
			Thread.sleep(3000);
			ReusableMethodTC.elementToBeVisible(successMsg);
			ReusableMethodTC.highLighterMethod(driver, successMsg);
			System.out.println(successMsg.getText());
			System.out.println("Verified the uploaded file is:: " + successMsg.getText().toString());
			Reporter.log("Verified the uploaded file is:: " + successMsg.getText().toString());
			LogFile.APPLICATION_LOGS.debug("Verified the uploaded file is:: " + successMsg.getText().toString());
			break;
		}
		}
	}
}
