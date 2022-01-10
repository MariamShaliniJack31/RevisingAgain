package com.michaelpage.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_JobSearchPage extends ReusableMethodTC {

	// HomePage - Authenticated User title
	@FindBy(xpath = "//div[@id='block-mp-theme-page-title']")
	public WebElement AuthenticatedUserTitle;

	// HomePage Job Match block - Upload your CV button
	@FindBy(xpath = "//a[@class='start-again upload-cv']")
	public WebElement UploadyourCVbtn;

	// HomePage Job Match block - Upload CV label
	@FindBy(xpath = "//a[contains(text(),'Upload CV')]")
	public WebElement UploadCVlabel;

	// HomePage Job Match block - Get Your Result label
	@FindBy(xpath = "//a[contains(text(),'Get your results')]")
	public WebElement GetYourResultlabel;

	// HomePage Job Match block - Job title textbox
	@FindBy(xpath = "//input[@placeholder='Job title']")
	public WebElement jobTtileTextBox;

	// HomePage Job Match block - search Button
	@FindBy(xpath = "//input[@value='Search']")
	public WebElement searchButton;

	// HomePage Job Match block - First job title
	@FindBy(xpath = "(//*[@class='job-title ']//a[1])[1]")
	public WebElement firstJobTitle;

	// HomePage Job Match block - jobSearchIcon
	@FindBy(xpath = "//*[text()='Job Search']")
	public WebElement jobSearchIcon;

	// HomePage Job Match block - viewJobButton
	@FindBy(xpath = "(//*[contains(@href,'job-detail')]//span[1])[1]")
	public WebElement viewJobButton;

	// JobSearchPage - Job title
	@FindBy(xpath = "//input[@placeholder='Job title']")
	public WebElement jobTitleTxb;

	// ***********************D8-874*************************
	// JobSearchPage - Matching jobs
	@FindBy(xpath = "//div[@id='block-mp-theme-page-title']//h1")
	public WebElement matchingJobsTxt;

	// JobSearchPage - Home Bread Crumb
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public WebElement homeBreadCrumbTxt;

	// JobSearchPage - Sales Bread Crumb
	@FindBy(xpath = "//li[contains(text(),'Sales')]")
	public WebElement salesBreadCrumbTxt;

	// JobSearchPage - Sector Drop Down
	@FindBy(xpath = "//span[@class='facet-header' and text()='Sector']")
	public WebElement sectorDropdown;

	// JobSearchPage - HealthCare Dropdown
	@FindBy(xpath = "(//span[@class='facet-item__value' and text()='Healthcare'])[3]")
	public WebElement healthCareRadioBtn;

	// JobSearchPage - Industry Drop Down
	@FindBy(xpath = "//span[@class='facet-header' and text()='Industry']")
	public WebElement industryDropdown;

	// JobSearchPage - Business servicess Drop Down
	@FindBy(xpath = "(//span[text()='Business Services'])[1]")
	public WebElement businessServicessRadioBtn;

	// JobSearchPage - Health Care
	@FindBy(xpath = "(//span[text()='Healthcare / Pharmaceutical'])[1]")
	public WebElement healthcarePharmaRadioBtn;

	// JobSearchPage - Location Drop Down
	@FindBy(xpath = "//span[@class='facet-header' and text()='Location']")
	public WebElement locationDropdown;

	// JobSearchPage - Location Drop Down
	@FindBy(xpath = "(//span[text()='England'])[1]")
	public WebElement selectLocationradioBtn;

	// JobSearchPage - Sales Breadcrumb
	@FindBy(xpath = "//a[contains(text(),'Sales')]")
	public WebElement salesBreadcrumbTxt;

	// JobSearchPage - Company type Drop Down
	@FindBy(xpath = "//span[@class='facet-header' and text()='Company Type']")
	public WebElement companyTypeDropdown;

	// JobSearchPage - Finance radio button
	@FindBy(xpath = "(//span[@class='facet-item__value'and text()='Finance'])[1]")
	public WebElement financeRadioBtn;

	// JobSearchPage - Finance radio button
	@FindBy(xpath = "//div[contains(text(),'Finance')]")
	public WebElement financeTxt;

	// JobSearchPage - job Title
	@FindBy(xpath = "//div[@class='job-tile search-job-tile']")
	public WebElement jobTitleForm;

	// JobSearchPage - finance count
	@FindBy(xpath = "(//*[text()='Company Type']//following::input[@type='checkbox']//following::span[text()='Finance']//following::span[1])[1]")
	public WebElement financeCount;

	// JobSearchPage - Home button
	@FindBy(xpath = "//a[text()='Home  /  ']")
	public WebElement homeBtn;

	// JobSearchPage - Language Drop Down
	@FindBy(xpath = "//span[@class='facet-header' and text()='Language']")
	public WebElement languageDropdown;

	// JobSearchPage - English Gb radio button
	@FindBy(xpath = "(//span[text()='English GB'])[1]")
	public WebElement englishGbradioBtn;

	// JobSearchPage - English Gb radio button
	@FindBy(xpath = "(//span[text()='English GB'])[2]")
	public WebElement englishGbRadioBtn;

	// JobSearchPage - French Gb radio button
	@FindBy(xpath = "(//span[text()='French'])[1]")
	public WebElement frenchradioBtn;

	// JobSearchPage - English GB count
	@FindBy(xpath = "(//*[text()='Language']//following::input[@type='checkbox']//following::span[text()='English GB']//following::span[1])[1]")
	public WebElement englishGbCount;

	// JobSearchPage - French GB count
	@FindBy(xpath = "(//*[text()='Language']//following::input[@type='checkbox']//following::span[text()='French']//following::span[1])[1]")
	public WebElement frenchGbCount;

	// JobSearchPage -Healthcare job count
	@FindBy(xpath = "(//*[text()='Industry']//following::input[@type='checkbox']//following::span[text()='Healthcare / Pharmaceutical']//following::span[1])[1]")
	public WebElement healthCareCount;

	// JobSearchPage - Financial services radio button
	@FindBy(xpath = "(//span[text()='Financial Services'])[1]")
	public WebElement financialServicesRadioBtn;

	// JobSearchPage - Location Expand button
	@FindBy(xpath = "(//a[@class='facet-item-toggle-link'])[1]")
	public WebElement locationExpandBtn;

	// JobSearchPage - Location Breadcrumb
	@FindBy(xpath = "//div[@class='container']//nav[@class='breadcrumb']")
	public WebElement locationBreadCrumb;

//********************D8-1119,D8-288,D8-290,D8-291*************************************
	// HomePage - Job Title text box
	@FindBy(xpath = "//input[@placeholder='Job title']")
	public WebElement Jobtitletxtbox;

	// HomePage - Location text box
	@FindBy(xpath = "//input[@name='location']")
	public WebElement Locationtxtbox;

	// HomePage - Search button
	@FindBy(xpath = "//input[@value='Search']")
	public WebElement Searchbtn;

	// Job Result page - Search field bar
	@FindBy(xpath = "//div[@class='search-form-wrapper']")
	public WebElement Searchfieldbar;

	// Job Result page - Cancel button
	@FindBy(xpath = "//div[@id='edit-actions--3']")
	public WebElement Cancelbtn;

	// Home page - Salary Min dropdown
	@FindBy(xpath = "//select[@name='field_job_salary_min']")
	public WebElement SalaryMindrpdwn;

	// Home page - Salary Max dropdown
	@FindBy(xpath = "//select[@name='field_job_salary_max']")
	public WebElement SalaryMaxdrpdwn;

	// Job Search page - Job Search section
	@FindBy(xpath = "//span[contains(text(),'Job Search')]")
	public WebElement JobSearchbtn;

	// Job Search page - Job Title error validation
	@FindBy(xpath = "//div[@class='form-item--error-message']")
	public WebElement JobTitleErr;

	// Job Search page - Browse by industry text
	@FindBy(xpath = "//a[contains(text(),'Browse by industry')]")
	public WebElement browseByIndustrytxt;

	// Job Search page - Browse by Job function text
	@FindBy(xpath = "a[contains(text(),'Browse by job function')]")
	public WebElement browseByJobFunctiontxt;

	// Job Search page - Browse by location text
	@FindBy(xpath = "//a[contains(text(),'Browse by location')]")
	public WebElement browseByLocationtxt;

	// Job Search page - Browse by job title text
	@FindBy(xpath = "//a[contains(text(),'Browse by job title')]")
	public WebElement browseByJobTitletxt;

	@FindBy(xpath = "//div[@id='block-mp-theme-page-title']/h1")
	public WebElement Counterlabel;

	// search option dropdown
	@FindBy(xpath = "//ul[@id='ui-id-1']/li")
	public WebElement options;

	// HomePage Job Match block - viewJobButton
	@FindBy(xpath = "//*[@class='logo-container']//img")
	public WebElement michaelPageLogo;

	// HomePage Job Match block - Salary high to Low the Low to Hogh
	@FindBy(xpath = "//*[@class='js-form-item form-item js-form-type-select form-item-sort-by js-form-item-sort-by']//select[1]")
	public WebElement selectSortByOptionAll;

	// HomePage Job Match block - SalaryMinimum
	@FindBy(xpath = "//select[contains(@id,'edit-field-job-salary-min')]")
	public WebElement salaryMinimum;

	// HomePage Job Match block - SalaryMaximum
	@FindBy(xpath = "//select[contains(@id,'edit-field-job-salary-max')]")
	public WebElement salaryMaximum;

	//////////////////// 852,853,865,856,834,866,3566/////////////////////

// JobSearchPage - Location
	@FindBy(xpath = "(//a[@class='facet-item-toggle-link'])[1]")
	public WebElement englandLocationExpandBtn;

	// JobSearchPage - Location
	@FindBy(xpath = "(//span[text()='South East England'])[1]")
	public WebElement selectSouthEastLondonRadioBtn;

	// JobSearchPage - Location
	@FindBy(xpath = "(//span[text()='South East England'])[2]")
	public WebElement selectSouthEastRadioBtn;

	// JobSearchPage - Location
	@FindBy(xpath = "//div[@class='container']//following::ol")
	public WebElement locationbreadCrumbTxt;

	// JobSearchPage - Health care expand button
	@FindBy(xpath = "(//a[@class='facet-item-toggle-link'])[16]")
	public WebElement healthCareExpandBtn;

	// JobSearchPage - Health Care Pharmacy
	@FindBy(xpath = "(//span[text()='Pharmacy'])[1]")
	public WebElement healthcarePharmacyRadioBtn;

	// JobSearchPage - Health Care Pharmacy
	@FindBy(xpath = "(//span[text()='Pharmacy'])[2]")
	public WebElement healthcarePharmacyRadioBtn1;

	// JobSearchPage - Reset
	@FindBy(xpath = "//a[text()='Reset']")
	public WebElement resetLnk;

	// JobSearchPage -Salary minimum filter
	@FindBy(xpath = "(//select[@name='field_job_salary_min'])[2]")
	public WebElement salaryMinimumFilter;

	// JobSearchPage -Salary maximum filter
	@FindBy(xpath = "(//select[@name='field_job_salary_max'])[2]")
	public WebElement salaryMaximumFilter;

	// JobSearchPage -Job Description
	@FindBy(xpath = "(//div[@class='job_advert__job-summary-text'])[1]")
	public WebElement jobDescriptionTxt;

	// JobSearchPage -Job location
	@FindBy(xpath = "(//div[@class='job-location'])[1]")
	public WebElement locationTxt;

	// JobSearchPage -Job type
	@FindBy(xpath = "(//div[@class='job_advert__job-contract-type'])[1]")
	public WebElement jobTypeTxt;

	// JobSearchPage -Job salary
	@FindBy(xpath = "(//div[@class='job-salary'])[1]")
	public WebElement jobSalaryTxt;

	// JobSearchPage -Save Job
	@FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
	public WebElement saveJobLnk;

	// JobSearchPage -View Job
	@FindBy(xpath = "(//span[contains(text(),'View Job')])[1]")
	public WebElement viewJobLnk;

	// JobSearchPage -Job Title
	@FindBy(xpath = "(//div[@class='job-title']//span)[1]")
	public WebElement jobTitle;

	// JobSearchPage -Job Title
	@FindBy(xpath = "(//div[@class='job-title ']//a)[1]")
	public WebElement titleofJobLnk;

	// JobSearchPage -Back to home page
	@FindBy(xpath = "(//span[contains(text(),'Back to Search')])[1]")
	public WebElement backToHomeLnk;

	// JobSearchPage -view job link
	@FindBy(xpath = "//span[@class='view-job-icon']")
	public WebElement viewjobfeaturedLnk;

	// JobSearchPage -Type of contract link
	@FindBy(xpath = "(//span[text()='Permanent'])[1]")
	public WebElement typeofcontractLnk;

	// JobSearch Page- show more Link
	@FindBy(xpath = "//li[@class='pager__item']/a")
	public WebElement showMoreLink;

	// Homepage- Create Alert Link
	@FindBy(xpath = "//a[text()='Create alert']")
	public WebElement CreateAlertLink;

	static String jobtitle = "Sales";
	static String invalidjobtitle = "xyz";
	static String validjobtitle = "sal";

	public MP_SIT_JobSearchPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyTextMessage(String webElementTitle) throws Exception {

		switch (webElementTitle.toUpperCase()) {
		case "HOME PAGE TITLE": {
			ReusableMethodTC.elementToBeVisible(AuthenticatedUserTitle);
			ReusableMethodTC.highLighterMethod(driver, AuthenticatedUserTitle);
			ReusableMethodTC.verifyText("Automation.SIT", AuthenticatedUserTitle.getText());
			System.out.println("Verified : Home page Displayed");
			Reporter.log("Verified : Home page Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Home page Displayed");
			break;
		}
		case "EMAIL ID": {
			Thread.sleep(5000);
			ReusableMethodTC.elementToBeVisible(AuthenticatedUserTitle);
			ReusableMethodTC.highLighterMethod(driver, AuthenticatedUserTitle);
			ReusableMethodTC.verifyText(MP_SIT_ApplywithyourCVPage.email, AuthenticatedUserTitle.getText());
			System.out.println("Verified : After login Emailid is Displayed successfully");
			Reporter.log("Verified : Home page Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : After login Emailid is Displayed successfully");
			break;
		}
		case "UPLOAD CV": {
			ReusableMethodTC.elementToBeVisible(UploadCVlabel);
			ReusableMethodTC.highLighterMethod(driver, UploadCVlabel);
			ReusableMethodTC.verifyText("Upload CV", UploadCVlabel.getText());
			System.out.println("Verified that Upload CV label is displayed Successfully");
			Reporter.log("Verified that Upload CV label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Upload CV label is displayed Successfully");
			break;
		}
		case "GET YOUR RESULTS": {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", GetYourResultlabel);
			ReusableMethodTC.elementToBeVisible(GetYourResultlabel);
			ReusableMethodTC.highLighterMethod(driver, GetYourResultlabel);
			ReusableMethodTC.verifyText("Get your results", GetYourResultlabel.getText());
			System.out.println("Verified that Get Your Result label is displayed Successfully");
			Reporter.log("Verified that Get Your Result label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Get Your Result label is displayed Successfully");
			break;
		}
		case "FIRST JOB TITLE": {
			ReusableMethodTC.elementToBeVisible(firstJobTitle);
			ReusableMethodTC.highLighterMethod(driver, firstJobTitle);
			System.out.println(
					"Verify: First job title: " + firstJobTitle.getText().toString() + " is displayed Successfully");
			Reporter.log("Verify: First job title after searching : " + firstJobTitle.getText().toString()
					+ " is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug(
					"Verify: First job title: " + firstJobTitle.getText().toString() + " is displayed Successfully");
			break;
		}

		case "JOB URL": {
			String strURL = driver.getCurrentUrl();
			Assert.assertTrue(strURL.contains("Sales"));
			System.out.println("Verified : The URl is : " + strURL.toString());
			Reporter.log("Verified : Apply job with linked in URl is : " + strURL);
			LogFile.APPLICATION_LOGS.debug("Verified : Apply job with linked in URl is : " + strURL);
			break;
		}
		case "VERIFY COUNT": {
			ReusableMethodTC.elementToBeVisible(matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, jobTitleForm);
			Actions action = new Actions(driver);
			action.moveToElement(companyTypeDropdown, 210, 0).click().perform();
			Thread.sleep(3000);
			String str = matchingJobsTxt.getText();
			String[] actualCount = str.split(" ");
			System.out.println("total count " + actualCount[0]);
			ReusableMethodTC.elementToBeVisible(financeCount);
			ReusableMethodTC.highLighterMethod(driver, financeCount);
			System.out.println("finance count : " + financeCount.getText().trim() + " is Displayed");
			ReusableMethodTC.verifyText(actualCount[0], financeCount.getText().trim());
			System.out.println("both count matched");
			Thread.sleep(5000);
			Reporter.log("Verified : Job Search page Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Job Search page Displayed");
			break;
		}
		case "ENGLISH JOB COUNT": {
			ReusableMethodTC.elementToBeVisible(matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, jobTitleForm);
			Actions action = new Actions(driver);
			action.moveToElement(languageDropdown, 210, 0).click().perform();
			Thread.sleep(3000);
			String str = matchingJobsTxt.getText();
			System.out.println("Matching jobs for English:------");
			String[] actualCount = str.split(" ");
			System.out.println("total count for english job: " + actualCount[0]);
			ReusableMethodTC.elementToBeVisible(englishGbCount);
			ReusableMethodTC.highLighterMethod(driver, englishGbCount);
			System.out.println("English Job count : " + englishGbCount.getText().trim() + " is Displayed");
			ReusableMethodTC.verifyText(actualCount[0], englishGbCount.getText().trim());
			System.out.println("both count matched");
			Thread.sleep(3000);
			ReusableMethodTC.highLighterMethod(driver, englishGbRadioBtn);
			ReusableMethodTC.click(englishGbRadioBtn);
			Thread.sleep(3000);
			Reporter.log("Verified : Job Search page Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Job Search page Displayed");
			break;
		}
		case "FRENCH JOB COUNT": {
			ReusableMethodTC.elementToBeVisible(matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, jobTitleForm);
			Actions action = new Actions(driver);
			action.moveToElement(languageDropdown, 210, 0).click().perform();
			Thread.sleep(3000);
			String str = matchingJobsTxt.getText();
			String[] actualCount = str.split(" ");
			System.out.println("total count for french job " + actualCount[0]);
			ReusableMethodTC.elementToBeVisible(frenchGbCount);
			ReusableMethodTC.highLighterMethod(driver, frenchGbCount);
			System.out.println("French job count : " + frenchGbCount.getText().trim() + " is Displayed");
			ReusableMethodTC.verifyText(actualCount[0], frenchGbCount.getText().trim());
			System.out.println("both count matched");
			Thread.sleep(5000);
			Reporter.log("Verified : Job Search page Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Job Search page Displayed");
			break;
		}
		case "HEALTHCARE COUNT": {
			ReusableMethodTC.elementToBeVisible(matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, jobTitleForm);
			Actions action = new Actions(driver);
			action.moveToElement(industryDropdown, 210, 0).click().perform();
			Thread.sleep(3000);
			String str = matchingJobsTxt.getText();
			String[] actualCount = str.split(" ");
			System.out.println("total count for Health care job is " + actualCount[0]);
			ReusableMethodTC.elementToBeVisible(healthCareCount);
			ReusableMethodTC.highLighterMethod(driver, healthCareCount);
			System.out.println("French job count : " + healthCareCount.getText().trim() + " is Displayed");
			ReusableMethodTC.verifyText(actualCount[0], healthCareCount.getText().trim());
			System.out.println("both count matched");
			Thread.sleep(5000);
			Reporter.log("Verified : Both count matched for Health care job");
			LogFile.APPLICATION_LOGS.debug("Verified : Both count matched for Health care job");
			break;
		}
		case "TOTAL JOB COUNT": {
			ReusableMethodTC.elementToBeVisible(matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, matchingJobsTxt);
			ReusableMethodTC.highLighterMethod(driver, jobTitleForm);
			String str = matchingJobsTxt.getText();
			String[] actualCount = str.split(" ");
			int var = Integer.parseInt(actualCount[0]);
			System.out.println("total count for Industry job " + actualCount[0]);
			int totalCount = driver.findElements(By.xpath("//div[@class='job-tile search-job-tile']")).size();
			System.out.println("Total count is:" + totalCount);
			if (var == totalCount) {
				System.out.println("both count matched");
			} else {
				System.out.println("both count are not matched");
			}
			Thread.sleep(5000);
			Reporter.log("Verified : Both count matched for Health care job");
			LogFile.APPLICATION_LOGS.debug("Verified : Both count matched for Health care job");
			break;
		}
		case "JOB TITLE ERROR": {
			Thread.sleep(2000);
			ReusableMethodTC.elementToBeVisible(JobTitleErr);
			ReusableMethodTC.highLighterMethod(driver, JobTitleErr);
			ReusableMethodTC.verifyText("Keyword is required", JobTitleErr.getText());
			System.out.println("Verified that Job title error is displayed Successfully");
			Reporter.log("Verified that Job title error is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Job title error is displayed Successfully");
			break;
		}
		case "BROWSE BY INDUSTRY": {
			ReusableMethodTC.elementToBeVisible(browseByIndustrytxt);
			ReusableMethodTC.highLighterMethod(driver, browseByIndustrytxt);
			ReusableMethodTC.verifyText("Browse by industry", browseByIndustrytxt.getText());
			System.out.println("Verified that Browse by industry text is displayed Successfully");
			Reporter.log("Verified that Browse by industry text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Browse by industry text is displayed Successfully");
			break;
		}
		case "BROWSE BY JOB FUNCTION": {
			ReusableMethodTC.elementToBeVisible(browseByJobFunctiontxt);
			ReusableMethodTC.highLighterMethod(driver, browseByJobFunctiontxt);
			ReusableMethodTC.verifyText("Browse by job function", browseByJobFunctiontxt.getText());
			System.out.println("Verified that Browse by job function text is displayed Successfully");
			Reporter.log("Verified that Browse by job function text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Browse by job function text is displayed Successfully");
			break;
		}
		case "BROWSE BY LOCATION": {
			ReusableMethodTC.elementToBeVisible(browseByLocationtxt);
			ReusableMethodTC.highLighterMethod(driver, browseByLocationtxt);
			ReusableMethodTC.verifyText("Browse by location", browseByLocationtxt.getText());
			System.out.println("Verified that Browse by location text is displayed Successfully");
			Reporter.log("Verified that Browse by location text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Browse by location text is displayed Successfully");
			break;
		}
		case "BROWSE BY JOB TITLE": {
			ReusableMethodTC.elementToBeVisible(browseByJobTitletxt);
			ReusableMethodTC.highLighterMethod(driver, browseByJobTitletxt);
			ReusableMethodTC.verifyText("Browse by job title", browseByJobTitletxt.getText());
			System.out.println("Verified that Browse by job title text is displayed Successfully");
			Reporter.log("Verified that Browse by job title text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Browse by job title text is displayed Successfully");
			break;
		}
		case "SEARCH JOB COUNT": {
			ReusableMethodTC.elementToBeVisible(Counterlabel);
			ReusableMethodTC.highLighterMethod(driver, Counterlabel);
			Assert.assertTrue(Counterlabel.getText().trim().contains("Sales"));
			System.out.println("Verified :  received header is displayed Successfully");
			Reporter.log("Verified : " + Counterlabel.getText().trim() + "is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : " + Counterlabel.getText().trim() + "is displayed Successfully");
			break;
		}
		case "JOBSEARCH VALUE": {
			ReusableMethodTC.elementToBeVisible(jobTtileTextBox);
			ReusableMethodTC.highLighterMethod(driver, jobTtileTextBox);
			Assert.assertTrue(jobTtileTextBox.getText().trim().contains(jobtitle));
			System.out.println("Verified :  The SearchText box is autofilled  : " + jobTtileTextBox.getText());
			Reporter.log("Verified :  The SearchText box is autofilled  : " + jobTtileTextBox.getText());
			LogFile.APPLICATION_LOGS
					.debug("Verified :  The SearchText box is autofilled  : " + jobTtileTextBox.getText());
			break;
		}
		case "LOCATION NAME": {
			ReusableMethodTC.elementToBeVisible(locationbreadCrumbTxt);
			ReusableMethodTC.highLighterMethod(driver, locationbreadCrumbTxt);
			System.out.println("Location bread crumb text is: " + locationbreadCrumbTxt.getText());
			ReusableMethodTC.verifyText("Home / Sales / South East England", locationbreadCrumbTxt.getText().trim());
			Reporter.log("Verified : Location Bread crumb is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Location Bread crumb is Displayed");
			break;
		}
		case "LOCATION SOUTHEAST": {
			ReusableMethodTC.elementToBeVisible(locationbreadCrumbTxt);
			ReusableMethodTC.highLighterMethod(driver, locationbreadCrumbTxt);
			System.out.println("Location bread crumb text is: " + locationbreadCrumbTxt.getText());
			ReusableMethodTC.verifyText("Home / Sales", locationbreadCrumbTxt.getText().trim());
			Reporter.log("Verified : Location Bread crumb is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Location Bread crumb is Displayed");
			break;
		}
		case "SECTOR PHARMACY": {
			ReusableMethodTC.elementToBeVisible(locationbreadCrumbTxt);
			ReusableMethodTC.highLighterMethod(driver, locationbreadCrumbTxt);
			System.out.println("Location bread crumb text is: " + locationbreadCrumbTxt.getText());
			ReusableMethodTC.verifyText("Home / Sales / Healthcare", locationbreadCrumbTxt.getText().trim());
			Reporter.log("Verified : Location Bread crumb is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Location Bread crumb is Displayed");
			break;
		}
		case "JOB MATCH URL": {
			Thread.sleep(3000);
			String strURL = driver.getCurrentUrl();
			System.out.println("Verified : The URl is : " + strURL.toString());
			Assert.assertTrue(strURL.contains("Sales"));
			Reporter.log("Verified : Apply job with linked in URl is : " + strURL);
			LogFile.APPLICATION_LOGS.debug("Verified : Apply job with linked in URl is : " + strURL);
			break;
		}
		case "LOCATION NAMES": {
			ReusableMethodTC.elementToBeVisible(locationTxt);
			ReusableMethodTC.highLighterMethod(driver, locationTxt);
			System.out.println("Location name is: " + locationTxt.getText());
			Reporter.log("Verified : Location name is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified :  Location name is Displayed");
			break;
		}
		case "JOB TYPE": {
			ReusableMethodTC.elementToBeVisible(jobTypeTxt);
			ReusableMethodTC.highLighterMethod(driver, jobTypeTxt);
			System.out.println("Job Type is: " + jobTypeTxt.getText());
			Reporter.log("Verified : Job type is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Job type is Displayed");
			break;
		}
		case "SALARY": {
			ReusableMethodTC.elementToBeVisible(jobSalaryTxt);
			ReusableMethodTC.highLighterMethod(driver, jobSalaryTxt);
			System.out.println("Salary Type is: " + jobSalaryTxt.getText());
			Reporter.log("Verified : Salary type is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Salary type is Displayed");
			break;
		}
		case "TITLE OF JOB": {
			ReusableMethodTC.elementToBeVisible(titleofJobLnk);
			ReusableMethodTC.highLighterMethod(driver, titleofJobLnk);
			Reporter.log("Verified : Job Title is Displayed" + titleofJobLnk.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : Job Title is Displayed");
			break;
		}
		case "SAVE JOB": {
			ReusableMethodTC.elementToBeVisible(saveJobLnk);
			ReusableMethodTC.highLighterMethod(driver, saveJobLnk);
			System.out.println("Save job is: " + saveJobLnk.getText());
			Reporter.log("Verified : Save job is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : save job is Displayed");
			break;
		}
		case "VIEW JOB": {
			ReusableMethodTC.elementToBeVisible(viewJobLnk);
			ReusableMethodTC.highLighterMethod(driver, viewJobLnk);
			System.out.println("View job is: " + viewJobLnk.getText());
			Reporter.log("Verified : View job is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : View job is Displayed");
			break;
		}
		case "JOB TITLE": {
			ReusableMethodTC.elementToBeVisible(jobTitle);
			ReusableMethodTC.highLighterMethod(driver, jobTitle);
			System.out.println("Title of job is: " + jobTitle.getText());
			Reporter.log("Verified : Tile of job is " + jobTitle.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : Title job is Displayed");
			break;
		}
		case "JOB MATCH SECTOR": {
			Thread.sleep(3000);
			String strURL = driver.getCurrentUrl();
			System.out.println("Verified : The Job Match Sector URL is : " + strURL.toString());
			Assert.assertTrue(strURL.contains("jobs/sector"));
			Reporter.log("Verified : Apply job with linked in URl is : " + strURL);
			LogFile.APPLICATION_LOGS.debug("Verified : Apply job with linked in URl is : " + strURL);
			break;
		}

		case "SHOW MORE": {
			int count = JobRowsSize();
			if (count == 20) {
				ReusableMethodTC.elementToBeVisible(showMoreLink);
				ReusableMethodTC.highLighterMethod(driver, showMoreLink);
				System.out.println("Verified : Show More Link is present");
				Reporter.log("Verified : Show More Link is present");
				LogFile.APPLICATION_LOGS.debug("Verified : Show More Link is present");
			} else {
				System.out.println("Verified : Show More Link is not present");
				Reporter.log("Verified : Show More Link is not present");
				LogFile.APPLICATION_LOGS.debug("Verified : Show More Link is not present");
			}
			break;
		}

		case "SHOW MORE URL": {
			Thread.sleep(6000);
			String strshowMoreURL = driver.getCurrentUrl();
			System.out.println("Verified : The Page Index is present in URl  : " + strshowMoreURL.toString());
			Assert.assertTrue(strshowMoreURL.contains("page"));
			Reporter.log("Verified : The Page Index is present in URl  : " + strshowMoreURL);
			LogFile.APPLICATION_LOGS.debug("Verified : The Page Index is present in URl  : " + strshowMoreURL);
			break;
		}

		case "SEARCHED JOBDETAILS LIST": {
			List<WebElement> job_Details = driver
					.findElements(By.xpath("//div[@class='views-row']/div/div[normalize-space(@class)='job-title']"));

			for (int i = 1; i <= job_Details.size(); i++) {
				String jobTitle = driver
						.findElement(By.xpath(
								"(//div[@class='views-row']/div/div[normalize-space(@class)='job-title'])[" + i + "]"))
						.getText();

				String Location = driver.findElement(By.xpath(
						"(//div[@class='views-row']/div/div[normalize-space(@class)='job-properties']/div[@class='job-location'])["
								+ i + "]"))
						.getText().trim();

				System.out.println("Verified : The Searched Job Title is  : " + jobTitle);
				System.out.println("Verified : The Searched Job Location is  : " + Location);

				Reporter.log("Verified : The Searched Job Title is  : " + jobTitle);
				Reporter.log("Verified : The Searched Job Location is  : " + Location);

				LogFile.APPLICATION_LOGS.debug("Verified : The Searched Job Title is  : " + jobTitle);
				LogFile.APPLICATION_LOGS.debug("Verified : The Searched Job Location is  : " + Location);

			}
			break;
		}

		case "CREATE ALERT LINK": {
			ReusableMethodTC.elementToBeVisible(CreateAlertLink);
			ReusableMethodTC.highLighterMethod(driver, CreateAlertLink);
			System.out.println("The Element is Displayed: " + CreateAlertLink.getText());
			Reporter.log("Verified : The Element is Displayed" + CreateAlertLink.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : The Element is Displayed" + CreateAlertLink.getText());
			break;
		}

		}
	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "UPLOAD YOUR CV": {
			ReusableMethodTC.highLighterMethod(driver, UploadyourCVbtn);
			ReusableMethodTC.click(UploadyourCVbtn);
			Reporter.log("Clicked on Upload your CV button");
			LogFile.APPLICATION_LOGS.info("Clicked on Upload your CV button");
			break;
		}
		case "SHOW MORE LINK": {
			ReusableMethodTC.highLighterMethod(driver, showMoreLink);
			Actions action = new Actions(driver);
			action.moveToElement(showMoreLink).click().perform();
			Thread.sleep(3000);
			Reporter.log("Clicked on Show More Link in Job Search");
			LogFile.APPLICATION_LOGS.info("Clicked on Show More Link in Job Search");
			break;
		}
		case "SEARCH BUTTON": {
			ReusableMethodTC.elementToBeVisible(searchButton);
			ReusableMethodTC.highLighterMethod(driver, searchButton);
			ReusableMethodTC.click(searchButton);
			Reporter.log("Clicked on search button");
			LogFile.APPLICATION_LOGS.info("Clicked on search button");
			break;
		}
		case "FIRST JOB TITLE": {
			ReusableMethodTC.elementToBeVisible(firstJobTitle);
			ReusableMethodTC.highLighterMethod(driver, firstJobTitle);
			ReusableMethodTC.clickByJS(firstJobTitle);
			System.out.println("Verify: First job title:" + firstJobTitle.getText().toString());
			Reporter.log("Clicked on First job title link and the Tilt is :" + firstJobTitle.getText().toString());
			LogFile.APPLICATION_LOGS.info("Clicked on First job title link");
			break;
		}
		case "JOB SEARCH ICON": {
			ReusableMethodTC.elementToBeVisible(jobSearchIcon);
			ReusableMethodTC.highLighterMethod(driver, jobSearchIcon);
			ReusableMethodTC.click(jobSearchIcon);
			Reporter.log("Clicked on job search icon");
			LogFile.APPLICATION_LOGS.info("Clicked on job search icon");
			break;
		}
		case "VIEW JOB BUTTON": {
			ReusableMethodTC.elementToBeVisible(viewJobButton);
			ReusableMethodTC.highLighterMethod(driver, viewJobButton);
			ReusableMethodTC.click(viewJobButton);
			System.out.println("Clicked on view job button ");
			Reporter.log("Clicked on view job button");
			LogFile.APPLICATION_LOGS.info("Clicked on view job button");
			break;
		}
		case "SECTOR": {
			ReusableMethodTC.elementToBeVisible(sectorDropdown);
			ReusableMethodTC.highLighterMethod(driver, sectorDropdown);
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.moveToElement(sectorDropdown, 210, 0).click().perform();
			Thread.sleep(5000);
			Reporter.log("Clicked on 'Sector' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Sector' button");
			break;
		}
		case "INDUSTRY": {
			ReusableMethodTC.elementToBeVisible(industryDropdown);
			ReusableMethodTC.highLighterMethod(driver, industryDropdown);
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.moveToElement(industryDropdown, 210, 0).click().perform();
			Thread.sleep(5000);
			Reporter.log("Clicked on 'Industry' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Industry' button");
			break;
		}
		case "HEALTHCARE": {
			ReusableMethodTC.elementToBeVisible(healthCareRadioBtn);
			ReusableMethodTC.highLighterMethod(driver, healthCareRadioBtn);
			ReusableMethodTC.click(healthCareRadioBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Healthcare' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Healthcare' button");
			break;
		}
		case "HEALTHCARE PHARMA": {
			ReusableMethodTC.elementToBeVisible(healthcarePharmaRadioBtn);
			ReusableMethodTC.highLighterMethod(driver, healthcarePharmaRadioBtn);
			ReusableMethodTC.click(healthcarePharmaRadioBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Healthcare' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Healthcare' button");
			break;
		}
		case "BUSINESS SERVICES": {
			ReusableMethodTC.elementToBeVisible(businessServicessRadioBtn);
			ReusableMethodTC.highLighterMethod(driver, businessServicessRadioBtn);
			ReusableMethodTC.click(businessServicessRadioBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Healthcare' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Healthcare' button");
			break;
		}
		case "LOCATION": {
			ReusableMethodTC.elementToBeVisible(locationDropdown);
			ReusableMethodTC.highLighterMethod(driver, locationDropdown);
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.moveToElement(locationDropdown, 210, 0).click().perform();
			Thread.sleep(5000);
			Reporter.log("Clicked on 'Location' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Location' button");
			break;
		}
		case "LOCATION NAME": {
			ReusableMethodTC.elementToBeVisible(selectLocationradioBtn);
			ReusableMethodTC.highLighterMethod(driver, selectLocationradioBtn);
			ReusableMethodTC.click(selectLocationradioBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Select Location' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Select Location' button");
			break;
		}
		case "LANGUAGE": {
			ReusableMethodTC.elementToBeVisible(languageDropdown);
			ReusableMethodTC.highLighterMethod(driver, languageDropdown);
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.moveToElement(languageDropdown, 210, 0).click().perform();
			Thread.sleep(5000);
			Reporter.log("Clicked on 'Language' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Language' button");
			break;
		}
		case "SALES": {
			ReusableMethodTC.elementToBeVisible(salesBreadcrumbTxt);
			ReusableMethodTC.highLighterMethod(driver, salesBreadcrumbTxt);
			ReusableMethodTC.click(salesBreadcrumbTxt);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Sales Bread Crumb' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Sales Bread Crum' button");
			break;
		}
		case "COMPANY TYPE": {
			ReusableMethodTC.elementToBeVisible(companyTypeDropdown);
			ReusableMethodTC.highLighterMethod(driver, companyTypeDropdown);
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.moveToElement(companyTypeDropdown, 210, 0).click().perform();
			Thread.sleep(5000);
			Reporter.log("Clicked on 'Company type' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Company Type' button");
			break;
		}
		case "COMPANY TYPE NAME": {
			ReusableMethodTC.elementToBeVisible(financeRadioBtn);
			ReusableMethodTC.highLighterMethod(driver, financeRadioBtn);
			ReusableMethodTC.click(financeRadioBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Company type Name' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Company Type' button");
			break;
		}
		case "HOME": {
			ReusableMethodTC.elementToBeVisible(homeBtn);
			ReusableMethodTC.highLighterMethod(driver, homeBtn);
			ReusableMethodTC.click(homeBtn);
			Reporter.log("Clicked on home button");
			LogFile.APPLICATION_LOGS.info("Clicked on home button");
			break;
		}
		case "JOB TITLE": {
			ReusableMethodTC.elementToBeVisible(jobTitleTxb);
			ReusableMethodTC.highLighterMethod(driver, jobTitleTxb);
			ReusableMethodTC.sendKeys(jobTitleTxb, "Analyst");
			ReusableMethodTC.click(searchButton);
			ReusableMethodTC.highLighterMethod(driver, matchingJobsTxt);
			System.out.println("Verified : Job Search page Displayed");
			Reporter.log("Verified : Job Search page Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Job Search page Displayed");
			break;
		}
		case "FRENCH JOB": {
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.moveToElement(languageDropdown, 210, 0).click().perform();
			ReusableMethodTC.elementToBeVisible(frenchradioBtn);
			ReusableMethodTC.highLighterMethod(driver, frenchradioBtn);
			ReusableMethodTC.click(frenchradioBtn);
			Reporter.log("Clicked on French button");
			LogFile.APPLICATION_LOGS.info("Clicked on French button");
			break;
		}
		case "ENGLISH JOB": {
			ReusableMethodTC.elementToBeVisible(englishGbradioBtn);
			ReusableMethodTC.highLighterMethod(driver, englishGbradioBtn);
			ReusableMethodTC.click(englishGbradioBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'English radio button' button");
			LogFile.APPLICATION_LOGS.info("English radio button' button");
			break;
		}
		case "FINANCIAL SERVICES": {
			ReusableMethodTC.elementToBeVisible(financialServicesRadioBtn);
			ReusableMethodTC.highLighterMethod(driver, financialServicesRadioBtn);
			ReusableMethodTC.click(financialServicesRadioBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Financial Services radio button' button");
			LogFile.APPLICATION_LOGS.info("Financial Services radio button' button");
			break;
		}
		case "SEARCH FIELD BAR": {
			ReusableMethodTC.elementToBeVisible(Searchfieldbar);
			ReusableMethodTC.highLighterMethod(driver, Searchfieldbar);
			ReusableMethodTC.click(Searchfieldbar);
			Reporter.log("Clicked on Search field");
			LogFile.APPLICATION_LOGS.info("Clicked on Search field");
			break;
		}
		case "CANCEL": {
			ReusableMethodTC.elementToBeVisible(Cancelbtn);
			ReusableMethodTC.highLighterMethod(driver, Cancelbtn);
			ReusableMethodTC.click(Cancelbtn);
			Reporter.log("Clicked on cancel button");
			LogFile.APPLICATION_LOGS.info("Clicked on cancel button");
			break;
		}
		case "JOB SEARCH": {
			ReusableMethodTC.elementToBeVisible(JobSearchbtn);
			ReusableMethodTC.highLighterMethod(driver, JobSearchbtn);
			ReusableMethodTC.click(JobSearchbtn);
			Reporter.log("Clicked on Job Search section in header");
			LogFile.APPLICATION_LOGS.info("Clicked on Job Search section in header");
			break;
		}
		case "MICHAEL PAGE LOGO": {
			ReusableMethodTC.elementToBeVisible(michaelPageLogo);
			ReusableMethodTC.highLighterMethod(driver, michaelPageLogo);
			ReusableMethodTC.click(michaelPageLogo);
			System.out.println("Clicked on Michael Page Logo link");
			Reporter.log("Clicked on Michael Page Logo link");
			LogFile.APPLICATION_LOGS.info("Clicked on Michael Page Logo link");
			break;
		}
		case "LOCATION SOUTHEAST": {
			Actions action = new Actions(driver);
			action.moveToElement(locationDropdown, 210, 0).click().perform();
			Thread.sleep(5000);
			ReusableMethodTC.elementToBeVisible(englandLocationExpandBtn);
			ReusableMethodTC.highLighterMethod(driver, englandLocationExpandBtn);
			ReusableMethodTC.click(englandLocationExpandBtn);
			Thread.sleep(1000);
			ReusableMethodTC.click(selectSouthEastLondonRadioBtn);
			Reporter.log("Clicked on 'South East London radio button' button");
			LogFile.APPLICATION_LOGS.info("South East London radio button' button");
			break;
		}
		case "LOCATION SOUTHEAST LONDON": {
			Actions action = new Actions(driver);
			action.moveToElement(locationDropdown, 210, 0).click().perform();
			Thread.sleep(5000);
			ReusableMethodTC.elementToBeVisible(selectSouthEastRadioBtn);
			ReusableMethodTC.highLighterMethod(driver, selectSouthEastRadioBtn);
			ReusableMethodTC.click(selectSouthEastRadioBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'South East London radio button' button");
			LogFile.APPLICATION_LOGS.info("South East London radio button' button");
			break;
		}
		case "HEALTHCARE PHARMACY": {
			Actions action = new Actions(driver);
			action.moveToElement(sectorDropdown, 210, 0).click().perform();
			Thread.sleep(5000);
			ReusableMethodTC.elementToBeVisible(healthCareExpandBtn);
			ReusableMethodTC.highLighterMethod(driver, healthCareExpandBtn);
			ReusableMethodTC.click(healthCareExpandBtn);
			ReusableMethodTC.highLighterMethod(driver, healthcarePharmacyRadioBtn);
			ReusableMethodTC.click(healthcarePharmacyRadioBtn);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Health care Pharmacy' button");
			LogFile.APPLICATION_LOGS.info("Health care Pharmacy' button");
			break;
		}
		case "PHARMACY": {
			Actions action = new Actions(driver);
			action.moveToElement(sectorDropdown, 210, 0).click().perform();
			Thread.sleep(5000);
			ReusableMethodTC.elementToBeVisible(healthcarePharmacyRadioBtn1);
			ReusableMethodTC.highLighterMethod(driver, healthcarePharmacyRadioBtn1);
			ReusableMethodTC.click(healthcarePharmacyRadioBtn1);
			Thread.sleep(1000);
			Reporter.log("Clicked on 'Health care Pharmacy' button");
			LogFile.APPLICATION_LOGS.info("Health care Pharmacy' button");
			break;
		}
		case "RESET": {
			ReusableMethodTC.elementToBeVisible(resetLnk);
			ReusableMethodTC.highLighterMethod(driver, resetLnk);
			ReusableMethodTC.click(resetLnk);
			Reporter.log("Clicked on Reset button");
			LogFile.APPLICATION_LOGS.info("Clicked on Reset button");
			Thread.sleep(3000);
			break;
		}
		case "SALARY MINIMUM": {
			ReusableMethodTC.elementToBeVisible(salaryMinimumFilter);
			ReusableMethodTC.highLighterMethod(driver, salaryMinimumFilter);
			ReusableMethodTC.selectByVisibleText(salaryMinimumFilter, "20k");
			Reporter.log("Select Slary minimum value" + " 20k");
			LogFile.APPLICATION_LOGS.info("Select salary minimum value" + "20k");
			break;
		}
		case "SALARY MAXIMUM": {
			ReusableMethodTC.elementToBeVisible(salaryMaximumFilter);
			ReusableMethodTC.highLighterMethod(driver, salaryMaximumFilter);
			ReusableMethodTC.selectByVisibleText(salaryMaximumFilter, "30k");
			Reporter.log("Select Slary maximum value" + " 30k");
			LogFile.APPLICATION_LOGS.info("Select salary maximum value" + "30k");
			break;
		}
		case "SAVE JOB": {
			ReusableMethodTC.elementToBeVisible(saveJobLnk);
			ReusableMethodTC.highLighterMethod(driver, saveJobLnk);
			ReusableMethodTC.click(saveJobLnk);
			Reporter.log("Cliked on save job");
			LogFile.APPLICATION_LOGS.info("Clicked on save job");
			break;
		}
		case "VIEW JOB": {
			ReusableMethodTC.elementToBeVisible(viewJobLnk);
			ReusableMethodTC.scrollIntoView(viewJobLnk);
			ReusableMethodTC.highLighterMethod(driver, viewJobLnk);
			ReusableMethodTC.click(viewJobLnk);
			Reporter.log("Cliked on View job");
			LogFile.APPLICATION_LOGS.info("Clicked on View job");
			break;
		}
		case "VIEW JOB FEATURED": {
			ReusableMethodTC.elementToBeVisible(viewjobfeaturedLnk);
			ReusableMethodTC.scrollIntoView(viewjobfeaturedLnk);
			ReusableMethodTC.highLighterMethod(driver, viewjobfeaturedLnk);
			ReusableMethodTC.click(viewjobfeaturedLnk);
			Reporter.log("Cliked on View job");
			LogFile.APPLICATION_LOGS.info("Clicked on View job");
			break;
		}
		case "BACK TO HOME": {
			ReusableMethodTC.elementToBeVisible(backToHomeLnk);
			ReusableMethodTC.highLighterMethod(driver, backToHomeLnk);
			ReusableMethodTC.click(backToHomeLnk);
			Reporter.log("Cliked on Back to home link");
			LogFile.APPLICATION_LOGS.info("Clicked on Back to home link");
			break;
		}
		case "TYPE OF CONTRACT": {
			ReusableMethodTC.elementToBeVisible(typeofcontractLnk);
			ReusableMethodTC.highLighterMethod(driver, typeofcontractLnk);
			ReusableMethodTC.click(typeofcontractLnk);
			Reporter.log("Cliked on TYPE OF contract link");
			LogFile.APPLICATION_LOGS.info("Cliked on TYPE OF contract link");
			break;
		}
		}

	}

	public void enterRandomText(String webElementTitle) throws InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "JOB TITLE TEXTBOX": {
			Thread.sleep(3000);
			ReusableMethodTC.elementToBeVisible(jobTtileTextBox);
			ReusableMethodTC.highLighterMethod(driver, jobTtileTextBox);
			ReusableMethodTC.sendKeys(jobTtileTextBox, jobtitle);
			System.out.println("Entered jobtitle is :" + jobtitle);
			Reporter.log("Entered jobtitle is :" + jobtitle);
			LogFile.APPLICATION_LOGS.info("Entered jobtitle is :" + jobtitle);
			break;
		}
		case "LOCATION": {
			Thread.sleep(3000);
			ReusableMethodTC.highLighterMethod(driver, Locationtxtbox);
			ReusableMethodTC.sendKeys(Locationtxtbox, "city of london");
			Reporter.log("Verified : The location Entered is  : " + Locationtxtbox.getAttribute("value").toString());
			LogFile.APPLICATION_LOGS.info("Verified : The location Entered is  : " + Locationtxtbox.getText());
			break;
		}
		case "INVALID JOB TITLE": {
			ReusableMethodTC.elementToBeVisible(jobTtileTextBox);
			ReusableMethodTC.highLighterMethod(driver, jobTtileTextBox);
			ReusableMethodTC.clear(jobTtileTextBox);
			ReusableMethodTC.sendKeys(jobTtileTextBox, invalidjobtitle);
			System.out.println("Entered jobtitle is :" + invalidjobtitle);
			Reporter.log("Entered jobtitle is :" + invalidjobtitle);
			LogFile.APPLICATION_LOGS.info("Entered jobtitle is :" + invalidjobtitle);
			break;
		}
		case "VALID JOB TITLE": {
			ReusableMethodTC.elementToBeVisible(jobTtileTextBox);
			ReusableMethodTC.highLighterMethod(driver, jobTtileTextBox);
			ReusableMethodTC.clear(jobTtileTextBox);
			ReusableMethodTC.sendKeys(jobTtileTextBox, validjobtitle);
			System.out.println("Entered jobtitle is :" + validjobtitle);
			Reporter.log("Entered jobtitle is :" + validjobtitle);
			LogFile.APPLICATION_LOGS.info("Entered jobtitle is :" + validjobtitle);
			break;
		}
		}
	}

	public void SelectDropdownValue(String webElementTitle) throws Exception {

		switch (webElementTitle.toUpperCase()) {
		case "SALARY MIN": {
			ReusableMethodTC.elementToBeVisible(SalaryMindrpdwn);
			ReusableMethodTC.highLighterMethod(driver, SalaryMindrpdwn);
			ReusableMethodTC.selectByVisibleText(SalaryMindrpdwn, "20k");
			Reporter.log("Verified : The Salary Min is  : " + "20k");
			LogFile.APPLICATION_LOGS.debug("Verified : The End date selected is  : " + "20k");
			break;
		}
		case "SALARY MAX": {
			ReusableMethodTC.elementToBeVisible(SalaryMaxdrpdwn);
			ReusableMethodTC.highLighterMethod(driver, SalaryMaxdrpdwn);
			ReusableMethodTC.selectByVisibleText(SalaryMaxdrpdwn, "100k");
			Reporter.log("Verified : The Salary Min is  : " + "100k");
			LogFile.APPLICATION_LOGS.debug("Verified : The End date selected is  : " + "100k");
			break;
		}
		case "SALARY MINIMUM": {
			ReusableMethodTC.elementToBeVisible(salaryMinimum);
			ReusableMethodTC.highLighterMethod(driver, salaryMinimum);
			ReusableMethodTC.selectByVisibleText(salaryMinimum, "20k");
			System.out.println("Selected : Minimum salary is  : " + "20k");
			Reporter.log("Selected : Minimum salary is: " + "50k");
			LogFile.APPLICATION_LOGS.debug("Selected : Minimum salary is :" + "20k");
			break;
		}
		case "SALARY MAXIMUM": {
			ReusableMethodTC.elementToBeVisible(salaryMaximum);
			ReusableMethodTC.highLighterMethod(driver, salaryMaximum);
			ReusableMethodTC.selectByVisibleText(salaryMaximum, "200k");
			System.out.println("Selected : Maximum salary is:" + "200k");
			Reporter.log("Selected : Maximum salary is:" + "France");
			LogFile.APPLICATION_LOGS.debug("Selected : Maximum salary is:" + "200k");
			break;
		}
		case "MOST RECENT": {
			ReusableMethodTC.elementToBeVisible(selectSortByOptionAll);
			// ReusableMethodTC.highLighterMethod(driver, selectSortByOptionAll);
			ReusableMethodTC.selectByVisibleText(selectSortByOptionAll, "Most recent");
			System.out.println("Selected : Mostrecent job details is:" + "Most recent");
			Reporter.log("Selected : Mostrecent job details is:" + "Most recent");
			LogFile.APPLICATION_LOGS.debug("Selected : The Mostrecent job details is:" + "Most recent");
			break;
		}
		case "SALARY HIGHTOLOW": {
			ReusableMethodTC.elementToBeVisible(selectSortByOptionAll);
			// ReusableMethodTC.highLighterMethod(driver, selectSortByOptionAll);
			ReusableMethodTC.selectByVisibleText(selectSortByOptionAll, "Salary (high to low)");
			System.out.println("Selected : High To Low job details is:" + "Salary (high to low)");
			Reporter.log("Selected : High To Low job details is:" + "Salary (high to low)");
			LogFile.APPLICATION_LOGS.debug("Selected : High To Low job details is:" + "Salary (high to low)");
			break;
		}
		case "SALARY LOWTOHIGH": {
			ReusableMethodTC.elementToBeVisible(selectSortByOptionAll);
			// ReusableMethodTC.highLighterMethod(driver, selectSortByOptionAll);
			ReusableMethodTC.selectByVisibleText(selectSortByOptionAll, "Salary (low to high)");
			System.out.println("Selected : Low To high job details is:" + "Salary (low to high)");
			Reporter.log("Selected : Low To high job details is:" + "Salary (low to high)");
			LogFile.APPLICATION_LOGS.debug("Selected :Low To high job details is:" + "Salary (low to high)");
			break;
		}
		}
	}

	public int verifySearch() {
		int size = 0;
		try {
			Thread.sleep(7000);
			List<WebElement> listoption = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
			size = listoption.size();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return size;
	}

	public int JobRowsSize() {
		int size = 0;
		List<WebElement> jobCount = driver.findElements(By.xpath("//div[@class='views-row']"));
		size = jobCount.size();

		return size;
	}

}
