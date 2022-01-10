package com.michaelpage.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_JobMatchPage extends ReusableMethodTC {

	
	// HomePage Job Match block - Upload CV label
	@FindBy(xpath = "//a[contains(text(),'Upload CV')]")
	public WebElement UploadCVlabel;

	// HomePage Job Match block - Upload your CV button
	@FindBy(xpath = "//a[@class='start-again upload-cv']")
	public WebElement UploadyourCVbtn;

	// HomePage Job Match block - Upload your CV button
	@FindBy(xpath = "//h2[contains(text(),'Upload your CV')]")
	public WebElement UploadyourCVlabel;

	// HomePage Job Match block - Upload CV link on Job Match page
	@FindBy(xpath = "//a[contains(text(),'Upload CV')]")
	public WebElement UploadCVlnk;

	// HomePage Job Match block - Browse option on Job Match page
	@FindBy(xpath = "//a[@class='button browse']")
	public WebElement browseOpt;

	// HomePage Job Match block - Next Button
	@FindBy(xpath = "//input[@id='edit-submit']")
	public WebElement NxtBtn;

	// HomePage Job Match block - Uploaded file name
	@FindBy(xpath = "//a[@class='file-view-link']")
	public WebElement uploadFileName;

	// HomePage Job Match block - Job Match label
	@FindBy(xpath = "//h2[contains(text(),'Job Match')]")
	public WebElement JobMatchlabel;

	// Job Match screen - Your Job Match Profile label
	@FindBy(xpath = "//h2[contains(text(),'Your Job Match Profile')]")
	public WebElement JobMatchProflabel;

	// Job Match screen - Location label
	@FindBy(xpath = "//span[contains(text(),'Where do you want to work?')]")
	public WebElement Locationlabel;

	// Job Match screen - Experience label
	@FindBy(xpath = "//span[contains(text(),'Add your experience')]")
	public WebElement Experiencelabel;

	// Job Match screen - Skill label
	@FindBy(xpath = "//span[contains(text(),'Add your skills')]")
	public WebElement skilllabel;

	// Job Match screen - Save Your Profile label
	@FindBy(xpath = "//span[contains(text(),'Save your profile')]")
	public WebElement SaveProflabel;

	// Job Match screen - Location textbox
	@FindBy(xpath = "//input[@placeholder='Add town, city or region']")
	public WebElement Locationtxt;

	// Job Match screen - Add Location button
	@FindBy(xpath = "(//i[@class='far fa-plus'])[1]")
	public WebElement AddLocationbtn;

	// Job Match screen - Remove Location button
	@FindBy(xpath = "//div[@class='remove-item-wrapper']/input")
	public WebElement RemoveLocbtn;

	// Job Match screen - Skill textbox
	@FindBy(xpath = "(//div[@class='add-option-item']/div/input)[2]")
	public WebElement Skilltxt;

	// Job Match screen - Add skill button
	@FindBy(xpath = "(//i[@class='far fa-plus'])[2]")
	public WebElement AddSkillbtn;

	// Job Match screen - Remove skill button
	@FindBy(xpath = "//input[@name='removeskill_14']")
	public WebElement Removeskillbtn;

	// Job Match screen - Remove CV button
	@FindBy(xpath = "//a[@class='remove-link']")
	public WebElement RemoveBtn;
	
	// Job Match screen - Add Experience button
	@FindBy(xpath = "//a[@class='add-new-experience form-submit']")
	public WebElement AddExpbtn;
	
	// Job Match screen - Job Title label
	@FindBy(xpath = "(//label[contains(text(),'Job title')])[8]")
	public WebElement Jobtitlelbl;
	
	// Job Match screen - Company Name label
	@FindBy(xpath = "(//label[contains(text(),'Company name')])[8]")
	public WebElement CompNamelbl;
		
	// Job Match screen - Start date label
	@FindBy(xpath = "(//h4[contains(text(),'Start date')])[8]")
	public WebElement Startdatelbl;
		
	// Job Match screen - End date label
	@FindBy(xpath = "(//h4[contains(text(),'End date')])[8]")
	public WebElement Enddatelbl;
	
	// Job Match screen - Job experience - Save button
	@FindBy(xpath = "//input[@name='addexperience']")
	public WebElement Savebtn;
	
	// Job Match screen - Selecting End date dropdown
	@FindBy(xpath = "//select[@id='edit-experience-fieldset-experience-7-end-date-year']")
	public WebElement Enddatedrpdwn;
	
	// Job Match screen - Job title error message
	@FindBy(xpath = "(//div[contains(text(),'Please enter a value')])[1]")
	public WebElement Jobtitleerror;
	
	// Job Match screen - Company name error message
	@FindBy(xpath = "(//div[contains(text(),'Please enter a value')])[2]")
	public WebElement CompanyNameerror;
	
	// Job Match screen - Date error message
	@FindBy(xpath = "(//div[contains(text(),'The date must be in the future')])[1]")
	public WebElement Dateerror;
	
	// Job Match screen - Job Title textbox
	@FindBy(xpath = "(//input[@placeholder='Job title'])[2]")
	public WebElement JobTitletxt;
	
	// Job Match screen - Company Name textbox
	@FindBy(xpath = "(//input[@placeholder='Company name'])")
	public WebElement CompanyNametxt;
	
	// Job Match screen - Currently Work here checkbox
	@FindBy(xpath = "(//label[contains(text(),'I currently work here')])[8]")
	public WebElement Workherechkbox;
	
	// Job Match screen - Cancel button
	@FindBy(xpath = "//input[@name='rebuildexperience_7']")
	public WebElement Cancelbtn;
	
	// Job Match screen - Edit Job title
	@FindBy(xpath = "//input[@value='HR OPS']")
	public WebElement EditJobtitletxt;
	
	// Job Match screen - Edit Company name
	@FindBy(xpath = "//input[@value='HR Service']")
	public WebElement EditCompnametxt;
	
	// Job Match screen - Show options
	@FindBy(xpath = "(//a[contains(text(),'More option')])[8]")
	public WebElement ShowOptiontxt;
	
	// Job Match screen - Edit experience button
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[8]")
	public WebElement EditExptxt;
	
	// Job Match screen - Delete button
	@FindBy(xpath = "(//a[contains(text(),'Delete')])[8]")
	public WebElement Deltxt;
	
	// Job Match screen - Update button
	@FindBy(xpath = "//input[@name='saveexperience_7']")
	public WebElement Updatebtn;
	
	// Job Match screen - View Save experience
	@FindBy(xpath = "(//div[@class='experience-content'])[8]")
	public WebElement ViewSaveExplabel;
	
	// Job Match screen - Show option link
	@FindBy(xpath = "//a[@class='show-options']")
	public WebElement ShowOptlnk;

	public MP_SIT_JobMatchPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyTextMessage(String webElementTitle) throws Exception {
		switch (webElementTitle.toUpperCase()) {
		case "JOB MATCH": {
			ReusableMethodTC.elementToBeVisible(JobMatchlabel);
			ReusableMethodTC.highLighterMethod(driver, JobMatchlabel);
			ReusableMethodTC.verifyText("Job Match", JobMatchlabel.getText());
			System.out.println("Verified that Job Match label is displayed Successfully");
			Reporter.log("Verified that Job Match label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Job Match label is displayed Successfully");
			break;
		}
		case "UPLOAD YOUR CV": {
			ReusableMethodTC.elementToBeVisible(UploadyourCVlabel);
			ReusableMethodTC.highLighterMethod(driver, UploadyourCVlabel);
			ReusableMethodTC.verifyText("Upload your CV", UploadyourCVlabel.getText());
			System.out.println("Verified that Upload your CV message is displayed Successfully");
			Reporter.log("Verified that Upload CV message is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Upload CV message is displayed Successfully");
			break;
		}
		case "UPLOAD FILE NAME": {
			Thread.sleep(5000);
			ReusableMethodTC.elementToBeVisible(uploadFileName);
			ReusableMethodTC.highLighterMethod(driver, uploadFileName);
			System.out.println("Verified the uploaded file is:: " + uploadFileName.getText().toString());
			Reporter.log("Verified the uploaded file is:: " + uploadFileName.getText().toString());
			LogFile.APPLICATION_LOGS.debug("Verified the uploaded file is:: " + uploadFileName.getText().toString());
			break;
		}
		case "YOUR JOB MATCH PROFILE": {
			ReusableMethodTC.elementToBeVisible(JobMatchProflabel);
			ReusableMethodTC.highLighterMethod(driver, JobMatchProflabel);
			ReusableMethodTC.verifyText("Your Job Match Profile", JobMatchProflabel.getText());
			System.out.println("Verified that Your Job Match Profile label is displayed Successfully");
			Reporter.log("Verified that Your Job Match Profile label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Your Job Match Profile label is displayed Successfully");
			break;
		}
		case "WHERE DO YOU WANT TO WORK": {
			Thread.sleep(10000);
			ReusableMethodTC.elementToBeVisible(Locationlabel);
			ReusableMethodTC.highLighterMethod(driver, Locationlabel);
			ReusableMethodTC.verifyText("Where do you want to work?", Locationlabel.getText());
			System.out.println("Verified that Location label is displayed Successfully");
			Reporter.log("Verified that Where do you want to work label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Where do you want to work label is displayed Successfully");
			break;
		}
		case "ADD YOUR Experience": {
			ReusableMethodTC.elementToBeVisible(Experiencelabel);
			ReusableMethodTC.highLighterMethod(driver, Experiencelabel);
			ReusableMethodTC.verifyText("Add your experience", Experiencelabel.getText());
			System.out.println("Verified that Experience label is displayed Successfully");
			Reporter.log("Verified that Experience label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Experience label is displayed Successfully");
			break;
		}
		case "ADD YOUR SKILLS": {
			ReusableMethodTC.elementToBeVisible(skilllabel);
			ReusableMethodTC.highLighterMethod(driver, skilllabel);
			ReusableMethodTC.verifyText("Add your skills", skilllabel.getText());
			System.out.println("Verified that skill label is displayed Successfully");
			Reporter.log("Verified that skill label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that skill label is displayed Successfully");
			break;
		}
		case "SAVE YOUR PROFILE": {
			ReusableMethodTC.elementToBeVisible(SaveProflabel);
			ReusableMethodTC.highLighterMethod(driver, SaveProflabel);
			ReusableMethodTC.verifyText("Save your profile (Optional)", SaveProflabel.getText());
			System.out.println("Verified that Save Profile label is displayed Successfully");
			Reporter.log("Verified that Save Profile label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Save Profile label is displayed Successfully");
			break;
		}
		case "LOCATION MAX LENGTH": {
			ReusableMethodTC.elementToBeVisible(Locationtxt);
			ReusableMethodTC.highLighterMethod(driver, Locationtxt);
			System.out.println("Max Length is::" + Locationtxt.getAttribute("maxlength").toString());
			System.out.println("Location Max length is 40");
			Reporter.log("Location Max length is 40");
			LogFile.APPLICATION_LOGS.debug("Location Max length is 40");
			break;
		}
		case "SKILL MAX LENGTH": {
			Thread.sleep(2000);
			ReusableMethodTC.elementToBeVisible(Skilltxt);
			ReusableMethodTC.highLighterMethod(driver, Skilltxt);
			System.out.println("Max Length is::" + Skilltxt.getAttribute("maxlength").toString());
			System.out.println("Skill Max length is 40");
			Reporter.log("Skill Max length is 40");
			LogFile.APPLICATION_LOGS.debug("Skill Max length is 40");
			break;
		}
		case "JOB TITLE": {
			ReusableMethodTC.elementToBeVisible(Jobtitlelbl);
			ReusableMethodTC.highLighterMethod(driver, Jobtitlelbl);
			ReusableMethodTC.verifyText("Job title", Jobtitlelbl.getText());
			System.out.println("Verified that Job title label is displayed Successfully");
			Reporter.log("Verified that Job title label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Job title label is displayed Successfully");
			break;
		}
		case "COMPANY NAME": {
			ReusableMethodTC.elementToBeVisible(CompNamelbl);
			ReusableMethodTC.highLighterMethod(driver, CompNamelbl);
			ReusableMethodTC.verifyText("Company name", CompNamelbl.getText());
			System.out.println("Verified that Company name label is displayed Successfully");
			Reporter.log("Verified that Company name label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Company name label is displayed Successfully");
			break;
		}
		case "START DATE": {
			ReusableMethodTC.elementToBeVisible(Startdatelbl);
			ReusableMethodTC.highLighterMethod(driver, Startdatelbl);
			ReusableMethodTC.verifyText("Start date", Startdatelbl.getText());
			System.out.println("Verified that Start date label is displayed Successfully");
			Reporter.log("Verified that Start date label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Start date label is displayed Successfully");
			break;
		}
		case "END DATE": {
			ReusableMethodTC.elementToBeVisible(Enddatelbl);
			ReusableMethodTC.highLighterMethod(driver, Enddatelbl);
			ReusableMethodTC.verifyText("End date", Enddatelbl.getText());
			System.out.println("Verified that End date label is displayed Successfully");
			Reporter.log("Verified that End date label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that End date label is displayed Successfully");
			break;
		}
		case "JOB TITLE ERROR": {
			Thread.sleep(2000);
			ReusableMethodTC.elementToBeVisible(Jobtitleerror);
			ReusableMethodTC.highLighterMethod(driver, Jobtitleerror);
			ReusableMethodTC.verifyText("Please enter a value", Jobtitleerror.getText());
			System.out.println("Verified that Job title error is displayed Successfully");
			Reporter.log("Verified that Job title error is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Job title error is displayed Successfully");
			break;
		}
		case "COMPANY NAME ERROR": {
			ReusableMethodTC.elementToBeVisible(CompanyNameerror);
			ReusableMethodTC.highLighterMethod(driver, CompanyNameerror);
			ReusableMethodTC.verifyText("Please enter a value", CompanyNameerror.getText());
			System.out.println("Verified that Company name error is displayed Successfully");
			Reporter.log("Verified that Company name error is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Company name error is displayed Successfully");
			break;
		}
		case "DATE ERROR": {
			ReusableMethodTC.elementToBeVisible(Dateerror);
			ReusableMethodTC.highLighterMethod(driver, Dateerror);
			ReusableMethodTC.verifyText("The date must be in the future", Dateerror.getText());
			System.out.println("Verified that Date must be in the future");
			Reporter.log("Verified that Date must be in the future");
			LogFile.APPLICATION_LOGS.debug("Verified that Date must be in the future");
			break;
		}
		case "VIEW SAVED EXPERIENCE": {
			Thread.sleep(2000);
			ReusableMethodTC.elementToBeVisible(ViewSaveExplabel);
			ReusableMethodTC.highLighterMethod(driver, ViewSaveExplabel);
			System.out.println("Verified the Saved Experience");
			Reporter.log("Verified the Saved Experience");
			LogFile.APPLICATION_LOGS.debug("Verified the Saved Experience");
			break;
		}
		}
	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "UPLOAD CV": {
			ReusableMethodTC.highLighterMethod(driver, UploadCVlnk);
			ReusableMethodTC.click(UploadCVlnk);
			Reporter.log("Clicked on Upload CV link");
			LogFile.APPLICATION_LOGS.info("Clicked on Upload CV link");
			break;
		}
		case "BROWSE": {
			ReusableMethodTC.highLighterMethod(driver, browseOpt);
			ReusableMethodTC.click(browseOpt);
			Reporter.log("Clicked on Browse button");
			LogFile.APPLICATION_LOGS.info("Clicked on Browse button");
			break;
		}
		case "NEXT": {
			ReusableMethodTC.highLighterMethod(driver, NxtBtn);
			ReusableMethodTC.click(NxtBtn);
			Reporter.log("Clicked on Next button");
			LogFile.APPLICATION_LOGS.info("Clicked on Next button");
			break;
		}
		case "ADDLOCATION": {
			ReusableMethodTC.highLighterMethod(driver, AddLocationbtn);
			ReusableMethodTC.click(AddLocationbtn);
			Reporter.log("Location has been added");
			LogFile.APPLICATION_LOGS.info("Location has been added");
			break;
		}
		case "REMOVELOCATION": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, RemoveLocbtn);
			ReusableMethodTC.click(RemoveLocbtn);
			Reporter.log("Location has been removed");
			LogFile.APPLICATION_LOGS.info("Location has been removed");
			break;
		}
		case "ADDSKILL": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, AddSkillbtn);
			ReusableMethodTC.click(AddSkillbtn);
			Reporter.log("Skill has been added");
			LogFile.APPLICATION_LOGS.info("Skill has been added");
			break;
		}
		case "REMOVESKILL": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, Removeskillbtn);
			ReusableMethodTC.click(Removeskillbtn);
			Reporter.log("Skill has been removed");
			LogFile.APPLICATION_LOGS.info("Skill has been removed");
			break;
		}
		case "REMOVE": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, RemoveBtn);
			ReusableMethodTC.click(RemoveBtn);
			Reporter.log("Clicked on 'Remove' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Remove' button");
			break;
		}
		case "ADD EXPERIENCE": {
			Thread.sleep(5000);
			ReusableMethodTC.highLighterMethod(driver, AddExpbtn);
			ReusableMethodTC.click(AddExpbtn);
			Reporter.log("Clicked on Add Experience");
			LogFile.APPLICATION_LOGS.info("Clicked on Add Experience");
			break;
		}
		case "SAVE": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, Savebtn);
			ReusableMethodTC.click(Savebtn);
			Reporter.log("Clicked on Save Button");
			LogFile.APPLICATION_LOGS.info("Clicked on Save Button");
			break;
		}
		case "CURRENTLY WORK HERE CHECKBOX": {
			Thread.sleep(5000);
			ReusableMethodTC.highLighterMethod(driver, Workherechkbox);
			ReusableMethodTC.click(Workherechkbox);
			Reporter.log("Clicked on Currently work here checkbox");
			LogFile.APPLICATION_LOGS.info("Clicked on Currently work here checkbox");
			break;
		}
		case "CANCEL": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, Cancelbtn);
			ReusableMethodTC.click(Cancelbtn);
			Reporter.log("Clicked on Cancel button");
			LogFile.APPLICATION_LOGS.info("Clicked on Cancel button");
			break;
		}
		case "MORE OPTION": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, ShowOptiontxt);
			ReusableMethodTC.click(ShowOptiontxt);
			Reporter.log("Clicked on More Option");
			LogFile.APPLICATION_LOGS.info("Clicked on More Option");
			break;
		}
		case "EDIT EXPERIENCE": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, EditExptxt);
			ReusableMethodTC.click(EditExptxt);
			Reporter.log("Clicked on edit button");
			LogFile.APPLICATION_LOGS.info("Clicked on edit button");
			break;
		}
		case "DELETE": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, Deltxt);
			ReusableMethodTC.click(Deltxt);
			Reporter.log("Clicked on delete button");
			LogFile.APPLICATION_LOGS.info("Clicked on delete button");
			break;
		}
		case "UPDATE": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, Updatebtn);
			ReusableMethodTC.click(Updatebtn);
			Reporter.log("Clicked on update button");
			LogFile.APPLICATION_LOGS.info("Clicked on update button");
			break;
		}
		case "SHOW OPTION": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, ShowOptlnk);
			ReusableMethodTC.click(ShowOptlnk);
			Reporter.log("Clicked on Show Option link");
			LogFile.APPLICATION_LOGS.info("Clicked on update button");
			break;
		}
		}
		}
		
	

	public void enterRandomText(String webElementTitle) throws InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "LOCATION": {
			ReusableMethodTC.highLighterMethod(driver, Locationtxt);
			ReusableMethodTC.sendKeys(Locationtxt, "INDIA");
			Reporter.log("Verified : The Location Entered is  : " + Locationtxt.getText());
			LogFile.APPLICATION_LOGS.info("Verified : The Location Entered is  : " + Locationtxt.getText());
			break;
		}
		case "LOCATION1": {
			Thread.sleep(10000);
			ReusableMethodTC.highLighterMethod(driver, Locationtxt);
			ReusableMethodTC.sendKeys(Locationtxt, "234@$%");
			Reporter.log("Verified : The Location Entered is  : " + Locationtxt.getText());
			LogFile.APPLICATION_LOGS.info("Verified : The Location Entered is  : " + Locationtxt.getText());
			break;
		}
		case "LOCATION2": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, Locationtxt);
			ReusableMethodTC.sendKeys(Locationtxt, "SDFSD1232%#%#");
			Reporter.log("Verified : The Location Entered is  : " + Locationtxt.getText());
			LogFile.APPLICATION_LOGS.info("Verified : The Location Entered is  : " + Locationtxt.getText());
			break;
		}
		case "SKILL": {
			ReusableMethodTC.highLighterMethod(driver, Skilltxt);
			ReusableMethodTC.sendKeys(Skilltxt, "Testing");
			ReusableMethodTC.sendKeys(Skilltxt, Keys.TAB);
			Reporter.log("Verified : The Skill Entered is  : " + Skilltxt.getText());
			LogFile.APPLICATION_LOGS.info("Verified : The Skill Entered is  : " + Skilltxt.getText());
			break;
		}
		case "JOB TITLE": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, JobTitletxt);
			ReusableMethodTC.sendKeys(JobTitletxt, "HR OPS");
			Reporter.log("Verified : The Job Title Entered is  : " + JobTitletxt.getText());
			LogFile.APPLICATION_LOGS.info("Verified : The Job Title Entered is  : " + JobTitletxt.getText());
			break;
		}
		case "COMPANY NAME": {
//			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, CompanyNametxt);
			ReusableMethodTC.sendKeys(CompanyNametxt, "HR Service");
			Reporter.log("Verified : The Company name Entered is  : " + CompanyNametxt.getText());
			LogFile.APPLICATION_LOGS.info("Verified : The Company name Entered is  : " + CompanyNametxt.getText());
			break;
		}
		case "EDIT JOB TITLE": {
//			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, EditJobtitletxt);
			ReusableMethodTC.sendKeys(EditJobtitletxt, "HR Execs");
			Reporter.log("Verified : The updated Job Title Entered is  : " + EditJobtitletxt.getText());
			LogFile.APPLICATION_LOGS.info("Verified : The updated Job Title Entered is  : " + EditJobtitletxt.getText());
			break;
		}
		case "EDIT COMPANY NAME": {
//			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, EditCompnametxt);
			ReusableMethodTC.sendKeys(EditCompnametxt, "HR Dept");
			Reporter.log("Verified : The updated Company name Entered is  : " + EditCompnametxt.getText());
			LogFile.APPLICATION_LOGS.info("Verified : The updated Company name Entered is  : " + EditCompnametxt.getText());
			break;
		}
		}
	}
	
	public void uploadFileWithDiffFormat(String webElementTitle) throws Throwable {

		switch (webElementTitle) {
		case "docx": {
			ReusableMethodTC.uploadFile(browseOpt, "CV - Kylie Minogue_docx_Format.docx");
			Reporter.log("docx File Uploaded");
			break;
		}
		case "doc": {
			ReusableMethodTC.uploadFile(browseOpt, "dummy digital cv london_doc_Format.doc");
			Reporter.log("doc File Uploaded");
			break;
		}
		case "pdf": {
			ReusableMethodTC.uploadFile(browseOpt, "CV - Kylie Minogue_pdf_Format.pdf");
			Reporter.log("pdf File Uploaded");
			break;
		}
		case "txt": {
			ReusableMethodTC.uploadFile(browseOpt, "CV - Kylie Minogue_txt_Format.txt");
			Reporter.log("txt File Uploaded");
			break;
		}
		case "DOCX": {
			ReusableMethodTC.uploadFile(browseOpt, "CV - Kylie Minogue2_DOCX_Format.DOCX");
			Reporter.log("DOCX File Uploaded");
			break;
		}
		case "DOC": {
			ReusableMethodTC.uploadFile(browseOpt, "dummy digital cv london2_DOC_Format.DOC");
			Reporter.log("DOC File Uploaded");
			break;
		}
		case "PDF": {
			ReusableMethodTC.uploadFile(browseOpt, "CV - Kylie Minogue2_PDF_Format.PDF");
			Reporter.log("PDF File Uploaded");
			break;
		}
		case "TXT": {
			ReusableMethodTC.uploadFile(browseOpt, "CV - Kylie Minogue2_TXT_Format.TXT");
			Reporter.log("TXT File Uploaded");
			break;
		}
		case "xlsx": {
			ReusableMethodTC.uploadFile(browseOpt, "Resume_xlsx_Format.xlsx");
			break;
		}
		case "resume with max size": {
			ReusableMethodTC.uploadFile(browseOpt, "ResumeWithSize_8.2MB.TXT");
			Thread.sleep(3000);
			break;
		}
}
	}
	
	public void SelectDropdownValue(String webElementTitle) throws Exception {
		switch (webElementTitle.toUpperCase()) {
		case "END DATE": {
			ReusableMethodTC.elementToBeVisible(Enddatedrpdwn);
			ReusableMethodTC.highLighterMethod(driver, Enddatedrpdwn);
			ReusableMethodTC.selectByVisibleText(Enddatedrpdwn, "2017");
			System.out.println("Verified : The End date selected is  : " + "2017");
			Reporter.log("Verified : The End date selected is  : " + "2017");
			LogFile.APPLICATION_LOGS.debug("Verified : The End date selected is  : " + "2017");
			break;
		}
		}
	}
}
