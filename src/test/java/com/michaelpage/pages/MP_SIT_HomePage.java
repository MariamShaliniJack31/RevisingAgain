package com.michaelpage.pages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.michaelpage.common.utils.MichaelpageConstants;
import com.michaelpage.common.utils.RandomDataUtil;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_HomePage extends ReusableMethodTC {
	String userName = Dto.getUsername();
	String passWord = Dto.getPassword();
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

//****************************************D8-2238 Client Profile*************************************//
	// HomePage Featured Employer - Featured Employer label
	@FindBy(xpath = "//h2[contains(text(),'Featured Employer')]")
	public WebElement FeaturedEmployerlabel;

	// HomePage Featured Employer - Featured Employer image
	@FindBy(xpath = "(//div[@class='image__image'])[1]")
	public WebElement FeaturedEmployerclk;

	// HomePage Featured Employer - Featured Client header
	@FindBy(xpath = "//div[@id='block-mp-theme-page-title']//h1")
	public WebElement FeaturedClientlabel;

	// HomePage Featured Employer - Featured Client Breadcrumb
	@FindBy(xpath = "//span[@class='bg-screen']")
	public WebElement ClientBreadcrumblabel;

	// HomePage TradeMark
	@FindBy(xpath = "//div[@class='trademark-text']")
	public WebElement TradeMarklabel;

	// FeturedJob Next Button
	@FindBy(xpath = "//a[@class='swiper-button-next']")
	public WebElement swiperNextButton;

	// FeturedJob Previous Button
	@FindBy(xpath = "//a[@class='swiper-button-prev']")
	public WebElement swiperPreviousButton;

	// FeaturedJob Save Button
	@FindBy(xpath = "(//span[@class='anon-save-jobs save-jobs jquery-once-1-processed'])[1]")
	public WebElement saveButton;

	// facebook Link
	@FindBy(xpath = "//img[@alt='Follow us on Facebook']")
	public WebElement FacebookLink;

	// LinkedIn Link
	@FindBy(xpath = "//img[@alt='Follow us on LinkedIn']")
	public WebElement LinkedInLink;

	// facebook Link
	@FindBy(xpath = "//img[@alt='Watch us on YouTube']")
	public WebElement YoutubeLink;

	// Twitter Link
	@FindBy(xpath = "//img[@alt='Follow us on Twitter']")
	public WebElement TwitterLink;

	// Headertext
	@FindBy(xpath = "(//div[@class='banner-text']/h2)[3]")
	public WebElement headertext;

	// Headersubtext
	@FindBy(xpath = "((//div[@class='banner-text']/p)[2]")
	public WebElement headersubtext;

	// Headerlink
	@FindBy(xpath = "((//div[@class='banner-text']/a)[2]")
	public WebElement headerLink;

	// Feature Job Corosouel
	@FindBy(xpath = "//div[@class='job-tile slider-job-tile']")
	public WebElement FeaturedJobCorosouel;

	// Feature Job Title
	@FindBy(xpath = "//div[@class='job-tile slider-job-tile']/a/div/h3/span")
	public WebElement FeaturedJobTitle;

	// Feature Job Location
	@FindBy(xpath = "//div[@class='job-tile slider-job-tile']/a/div[@class='job-properties']/div[@class='job-location']")
	public WebElement FeaturedJobLocation;

	// Feature Job Salary
	@FindBy(xpath = "//div[@class='job-tile slider-job-tile']/a/div[@class='job-properties']/div[@class='job-contract-type']")
	public WebElement FeaturedJobType;

	// Feature Job Save
	@FindBy(xpath = "//div[@class='job-tile slider-job-tile']/div/div/span")
	public WebElement FeaturedJobSave;

	// Feature Job ViewJob
	@FindBy(xpath = "(//div[@class='job-tile slider-job-tile']/div/div[@class='view_job']/a/span)[1]")
	public WebElement FeaturedJobView;

//****************************************D8-625 Blog Content*************************************//
	// HomePage - Latest Articles label
	@FindBy(xpath = "//h2[contains(text(),'Popular Articles')]")
	public WebElement populararticleslabel;

	// HomePage - Blog Article Click
	@FindBy(xpath = "//div[@class='content_second_wrapper']//div[5]//div[1]//span[1]//a[1]//img[1]")
	public WebElement BlogArticleclk;

	// HomePage - Blog Title label
	@FindBy(xpath = "//div[@id='block-advicepagetitleblock']")
	public WebElement blogTitlelabel;

	// HomePage - Blog Author label
	@FindBy(xpath = "//div[@class='author-name']")
	public WebElement blogAuthorlabel;
	
	// HomePage - All the Featured Employers Section
	@FindBy(xpath = "(//div[@class='view-content'])[2]")
	public WebElement AllFeaturedempSection;
		
	// HomePage - All the Featured Employers Section
	@FindBy(xpath = "//a[contains(text(),'View all')]")
	public WebElement ViewAllbtn;
	
	// HomePage - Popular Article section View all
	@FindBy(xpath = "(//a[contains(text(),'View all')])[1]")
	public WebElement PopularArticleViewAllbtn;
	
	// HomePage - Explore All categories label
	@FindBy(xpath = "//h2[contains(text(),'Explore all categories')]")
	public WebElement ExploreCategorieslabel;
	
	// HomePage - Topic Label
	@FindBy(xpath = "//a[@class='active-browse down']")
	public WebElement Topicslabel;
	
	// HomePage - SubTopic Label
	@FindBy(xpath = "//div[@class='sub_topic_links']")
	public WebElement SubTopicslabel;

	// Login Page - User Name
	@FindBy(xpath = "//input[@id='edit-name']")
	public WebElement userNameTxb;
	// Login Page - Password
	@FindBy(xpath = "//input[@id='edit-pass']")
	public WebElement passWordTxb;
	
	// Login Page - email Addressable
	@FindBy(xpath = "//*[text()='Email address']")
	public WebElement emailAddresslable;
	
	// Login Page - passWord Addressable
	@FindBy(xpath = "//*[text()='Password']")
	public WebElement passWordAddresslable;
	
	// Login Page - passWord Addressable
	@FindBy(xpath = "//*[@id='edit-name-error']")
	public WebElement emailErrorField;
	
 // Login Page - passWord Addressable
	@FindBy(xpath = "//*[@id='edit-pass-error']")
	public WebElement passwordErrorField;
	
	// Login Page - Login Title MyAccountPage
	@FindBy(xpath = "//*[@id='user-login-form-title']")
	public WebElement LoginTitleMyAccountPage;
	
	// Login Page - signUP Title MyAccountPage
	@FindBy(xpath = "//*[@id='sign-up-block-title']")
	public WebElement signUPTitleMyAccountPage;
	
	// My account page - Successfully Account creation Message 
	@FindBy(xpath = "//*[@id='block-mp-theme-page-title']")
	public WebElement myAccountPageHeader;
	// My account page - Create new account link
	@FindBy(xpath = "//a[@href='/user/register']")
	public WebElement createNewAccountLink;
	
	//My account page - First Name
	@FindBy(xpath = "//input[contains(@id,'edit-field-first-name')]")
	public WebElement firstNameText;
	//My account page - Last Name
	@FindBy(xpath = "//input[contains(@id,'edit-field-last-name')]")
	public WebElement lastNameText;

	// My account page- USignup button
	@FindBy(xpath = "//input[@id='edit-submit']")
	public WebElement signUpBtn;
	
	// My account page  - New email id while creating new
	@FindBy(xpath = "//input[@id='edit-mail']")
	public WebElement createEmailAddressText;

	//My account page  - Confirm email id while creating new
	@FindBy(xpath = "//*[@id='edit-conf-mail']")
	public WebElement createConfirmEmailAddressText;

	//My account page - Password while creating new
	@FindBy(xpath = "//input[@id='edit-pass']")
	public WebElement createPasswordText;
	
	// My account page - Email Already Exists 
	@FindBy(xpath = "//*[@class='message']")
	public WebElement errorMessageEmailExists;
	
	// My account page - Successfully Account creation Message 
	@FindBy(xpath = "//*[@class='message']")
	public WebElement successfullyAccountCreationMSG;
	
	// My account page - Eye encrypt option 
	@FindBy(xpath = "//*[@id='pass-eye-icon']")
	public WebElement eyeEncryptOption;
	
	// My account page - Forgotten link
	@FindBy(xpath = "//*[text()='Password']//preceding::a[1]")
	public WebElement forgottenLink;
	
	// My account page - Forgotten password Header
	@FindBy(xpath = "//*[@id='edit-subtitle']//label[1]")
	public WebElement signInWindowTitle;
	
	//My account page - Email Address field
	@FindBy(xpath = "(//*[contains(@id,'edit-name')])[1]")
	public WebElement emailTxbOnForgottenPassword;	
		
	//My account page - Email Address field
	@FindBy(xpath = "//*[@id='edit-submit']")
	public WebElement sendRecoveryLinkButton;	
			
	//My account page - Successfully send Email message 
	@FindBy(xpath = "(//*[@class='message'])[1]")
	public WebElement successfullySentEmailMSG;	
	
	//My account page -Return to Login button
	@FindBy(xpath = "//a[@href='/mypage']")
	public WebElement returnToLoginButton;

	//My account page -Login title
	@FindBy(xpath = "//*[@id='user-login-form-title']")
	public WebElement loginTtileOfMyAccountPage;
	
	//My account page -Error fields 
	@FindBy(xpath = "//*[@class='error'][\" + i + \"]")
	public List<WebElement> errorMessageSignUPPage;
	
	//My account page -Password Error field
	@FindBy(xpath = "//*[@class='password-error error']")
	public WebElement passwordErrorFieldSignUP;
	
	// My Account Page - Unrecognized email error
	@FindBy(xpath = "//span[contains(text(),'Login or Sign up')]")
	public WebElement loginOrSignUpIcon;
	
	// My Account Page - Your cv link 
	@FindBy(xpath = "(//*[contains(text(),'Your CV')])[2]")
	public WebElement yourCVLinkMyAccountPage;
	
	// My Account Page - Your cv link 
	@FindBy(xpath = "//*[contains(text(),' Login & Security')]")
	public WebElement loginNSecurity;
	
	// My Account Page - Your cv header 
	@FindBy(xpath = "//*[@id='block-mp-theme-page-title']")
	public WebElement yourCVHeaderMyAccountPage;

	// My Account Page -Add cv button 
	@FindBy(xpath = "//*[@id='edit-submit']")
	public WebElement addCVMyAccountPage;
	
	// My Account Page - Remove cv option 
	@FindBy(xpath = "//a[@class='show-options']//following::a[text()='Remove']")
	public WebElement removeCVOptionMAccountPage;

	// My Account Page - Your cv header 
	@FindBy(xpath = "//a[@class='show-options']//following::a[text()='View CV']")
	public WebElement viewCVOptionMAccountPage;
	
	//  My Account Page - show option button
	@FindBy(xpath = "//a[contains(@class,'show-options')]")
	public WebElement showOption;
	
	@FindBy(xpath = "(//*[@class='fal fa-ellipsis-v'])[1]")
	private  WebElement deleteshowOption1;
	
	@FindBy(xpath = "(//*[@class='fal fa-ellipsis-v'])[2]")
	private  WebElement deleteshowOption2;
	
	@FindBy(xpath = "(//*[@class='fal fa-ellipsis-v'])[3]")
	private  WebElement deleteshowOption3;

//  My Account Page - To add cv then delete cv from list
	@FindBy(xpath = "//*[@class='mypage-cvmessage show']")
	public WebElement toAddCVFirstDeleteCVFromList;

	// My Account Page - Remove cv option 
	@FindBy(xpath = "(//*[@class='fal fa-ellipsis-v']//following::a[text()='Delete'])[1]")
	public WebElement deleteCVOptionMAccountPage1;

	// My Account Page - Remove cv option 
	@FindBy(xpath = "(//*[@class='fal fa-ellipsis-v']//following::a[text()='Delete'])[2]")
	public WebElement deleteCVOptionMAccountPage2;

	// My Account Page - Remove cv option 
	@FindBy(xpath = "(//*[@class='fal fa-ellipsis-v']//following::a[text()='Delete'])[3]")
	public WebElement deleteCVOptionMAccountPage3;
	
	// My Account Page - Remove cv option 
	@FindBy(xpath = "//button[text()='Confirm']")
	public WebElement deleteCVConfirmButton;
	
	//My Account Page - Uploaded file name
	@FindBy(xpath = "//*[contains(@class,'file-view-link')]")
	public WebElement uploadedFileName;
	
	//My Account Page - Account setting
	@FindBy(xpath = "//h1[text()='Account Settings']")
	public WebElement accountsetting;
	
   // My Account Page - curren tPassword
	@FindBy(xpath = "//input[@id='edit-current-pass']")
	public WebElement currentPassword;
	
	 //My Account Page - New Password
	@FindBy(xpath = "//input[@id='edit-pass']")
	public WebElement newPassword;
	
	//My Account Page - New Password
	@FindBy(xpath = "//li[text()='Password must not match last 3 passwords.']")
	public WebElement passwordMustNotMatch3ExistingPassword;
	
	//My Account Page - Save Button
	@FindBy(xpath = "//*[@id='edit-submit']")
	public WebElement saveButtonMyAccountPage;
	
	//My account page -section Titles MyAccount Dasboard
	@FindBy(xpath = "//*[@class='section-title'][\" + i + \"]")
	public List<WebElement> sectionTitlesMyAccountDasboard;
	
	//My account page -section Titles MyAccount Dasboard
	@FindBy(xpath = "//*[@class='tile_title'][\" + i + \"]")
	public List<WebElement> subSectionTitlesMyAccountDasboard;
	
	//Home Page - Save Job link
	@FindBy(xpath = "//*[text()='Saved Jobs']")
	public WebElement saveJobLinkHomePage;
	
	//Home Page - MyAccount link
	@FindBy(xpath = "//*[@class='mydashboard-link-text']")
	public WebElement myAccountLinkGoBack;
	
	//My Account Page - Login link
	@FindBy(xpath = "//a[text()='Login']")
	public WebElement loginLinkMyAccountDashBoardPage;
	
	//My Account Page - Error PageNotFound after click on JobMatch N MatchedProfile link 
	@FindBy(xpath = "//*[@id='block-mp-theme-page-title']")
	public WebElement PageNotFoundJobMatchNMatchedProfile;
	
	// My account page -section Titles MyAccount Dasboard
	@FindBy(xpath = "//input[contains(@id,'edit-mp')][\" + i + \"]")
	public List<WebElement> personalDetailsOnMyPage;

	// My account page -Phone number
	@FindBy(xpath = "//*[@id='edit-mp-phone-number']")
	public WebElement phoneNumberMyPage;

	// My account page -Phone number
	@FindBy(xpath = "//*[@id='mypage-contact-details-form-submit']")
	public WebElement saveButtonMyPage;

	// My account page -section Titles MyAccount Dasboard
	@FindBy(xpath = "//*[@class='error'][\" + i + \"]")
	public List<WebElement> errorpersonalDetailsOnMyPage;

	// My account page -savedJob Title
	@FindBy(xpath = "//h1[text()='Saved Jobs']")
	public WebElement savedJobTitle;

	// My account page -starIcon To saveJob
	@FindBy(xpath = "//*[text()=' Saved jobs will appear here ']")
	public WebElement savedJobwillAppearHere;

	// Job rsults page - SalaryMaximum
	@FindBy(xpath = "(//span[@class='anon-save-jobs save-jobs'])[1]")
	public WebElement saveJobOption;

	// My account -Save job page -recently SavedJobs Header
	@FindBy(xpath = "//*[@class='saved-jobs-subtitle mypage-subtitle']")
	public WebElement recentlySavedJobsHeader;

	// My account -Save job page -Job Option list
	@FindBy(xpath = "//*[@class='fal fa-ellipsis-v']")
	public WebElement savedJobListOption;

	// My account -Save job page -ViewSimilar job
	@FindBy(xpath = "//*[@class='fal fa-ellipsis-v']//following::a[@class='button view-similar-jobs']")
	public WebElement viewSimilarJobOption;

	// HomePage - Authenticated User title
	@FindBy(xpath = "//*[@id='block-mp-theme-page-title']")
	public WebElement JobListPageTitle;

	// My Account - remove SavedJob OnSaved JobPage
	@FindBy(xpath = "//*[@class='fal fa-ellipsis-v']//following::a[text()='Remove saved job']")
	public WebElement removeSavedJobOnSavedJobPage;

	// My Account - saved Job Title To View SavedJOb
	@FindBy(xpath = "(//a[@href='/job-detail/sales-manager/ref/4455?source=mypage-saved-jobs'])[1]")
	public WebElement clickJobTitleToOpenSavedJob;
	
	// My Account - saved Job Title To View SavedJOb
	@FindBy(xpath = "//*[@class='job-apply-job-title']")
	public WebElement titleAfterClickingOnSavedJobTitle;
	
	// My Account Page - Edit Button PersonalDetails
	@FindBy(xpath = "(//*[@class='contact-edit-link'][text()='Edit'])[1]")
	public WebElement editButtonPersonalDetails;
	
	// Job rsults page - SalaryMaximum
	@FindBy(xpath = "//span[@class='anon-save-jobs save-jobs'][\" + i + \"]")
	public List<WebElement> multiplesaveJobOption;

	// My Account Page -  Remove Confirm Anonymous user
	@FindBy(xpath = "//*[@id='edit-confirm']")
	public WebElement deleteCVConfirmButtonAnonms;

	// My Account Page - Remove Confirm Authenticated user
	@FindBy(xpath = "//*[@value='Confirm']")
	public WebElement deleteCVConfirmButtonAuthctd;
	
    @FindBy(xpath = "//*[@id='edit-cancel']")
	public WebElement cancelSavedJobFromRemoveWindowAnonms;
  
	// My Account Page - Remove cv option
	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement cancelSavedJobFromRemoveWindowAuthentd;
				
	static String newEmailAddress = RandomDataUtil.randomStringGenerator() + "1@gmail.com";	
	public MP_SIT_HomePage() {
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
		case "FEATURED EMPLOYER": {
			ReusableMethodTC.elementToBeVisible(FeaturedEmployerlabel);
			ReusableMethodTC.highLighterMethod(driver, FeaturedEmployerlabel);
			ReusableMethodTC.verifyText("Featured Employer", FeaturedEmployerlabel.getText());
			System.out.println("Verified that Featured Employer label is displayed Successfully");
			Reporter.log("Verified that Featured Employer label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Featured Employer label is displayed Successfully");
			break;
		}
		case "FEATURED CLIENT": {
			Thread.sleep(2000);
			ReusableMethodTC.elementToBeVisible(FeaturedClientlabel);
			ReusableMethodTC.highLighterMethod(driver, FeaturedClientlabel);
			System.out.println("Verified: Featured Client is: " + FeaturedClientlabel.getText());
			Reporter.log("Verified: Featured Client is: " + FeaturedClientlabel.getText());
			LogFile.APPLICATION_LOGS.debug("Verified: Featured Client is: " + FeaturedClientlabel.getText());
			break;
		}
		case "BREADCRUMB": {
			Thread.sleep(2000);
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			ReusableMethodTC.elementToBeVisible(ClientBreadcrumblabel);
			ReusableMethodTC.highLighterMethod(driver, ClientBreadcrumblabel);
			System.out.println("Verified: Breadcrumb: " + ClientBreadcrumblabel.getText());
			Reporter.log("Verified: Breadcrumb: " + ClientBreadcrumblabel.getText());
			LogFile.APPLICATION_LOGS.debug("Verified: Breadcrumb: " + ClientBreadcrumblabel.getText());
			break;
		}
		case "AUTH BREADCRUMB": {
			Thread.sleep(2000);
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(2));
			ReusableMethodTC.elementToBeVisible(ClientBreadcrumblabel);
			ReusableMethodTC.highLighterMethod(driver, ClientBreadcrumblabel);
			System.out.println("Verified: Breadcrumb: " + ClientBreadcrumblabel.getText());
			Reporter.log("Verified: Breadcrumb: " + ClientBreadcrumblabel.getText());
			LogFile.APPLICATION_LOGS.debug("Verified: Breadcrumb: " + ClientBreadcrumblabel.getText());
			break;
		}
		case "EMPLOYER IMAGE": {
			Thread.sleep(2000);
//			ReusableMethodTC.elementToBeVisible(FeaturedClientlabel);
			ReusableMethodTC.highLighterMethod(driver, FeaturedEmployerclk);
			if (FeaturedEmployerclk.isDisplayed()) {
				System.out.println("Featured Employer image is displayed successfully");
				Reporter.log("Featured Employer image is displayed successfully");
				LogFile.APPLICATION_LOGS.info("Featured Employer image is displayed successfully");
			} else {
				System.out.println("Featured Employer image is not displayed successfully");
			}
			break;
		}
		case "POPULAR ARTICLES": {
			ReusableMethodTC.elementToBeVisible(populararticleslabel);
			ReusableMethodTC.highLighterMethod(driver, populararticleslabel);
			ReusableMethodTC.verifyText("Popular Articles", populararticleslabel.getText());
			System.out.println("Verified that Popular articles label is displayed Successfully");
			Reporter.log("Verified that Popular articles label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Popular articles label is displayed Successfully");
			break;
		}
		case "BLOG TITLE": {
			ReusableMethodTC.elementToBeVisible(blogTitlelabel);
			ReusableMethodTC.highLighterMethod(driver, blogTitlelabel);
			System.out.println("Verified: Blog Title is: " + blogTitlelabel.getText());
			Reporter.log("Verified: Blog Title is: " + blogTitlelabel.getText());
			LogFile.APPLICATION_LOGS.debug("Verified: Blog Title is: " + blogTitlelabel.getText());
			break;
		}
		case "BLOG AUTHOR": {
			ReusableMethodTC.elementToBeVisible(blogAuthorlabel);
			ReusableMethodTC.highLighterMethod(driver, blogAuthorlabel);
			System.out.println("Verified: Blog Author is: " + blogAuthorlabel.getText());
			Reporter.log("Verified: Blog Author is: " + blogAuthorlabel.getText());
			LogFile.APPLICATION_LOGS.debug("Verified: Blog Author is: " + blogAuthorlabel.getText());
			break;
		}
		case "TRADEMARK": {
			ReusableMethodTC.elementToBeVisible(TradeMarklabel);
			ReusableMethodTC.highLighterMethod(driver, TradeMarklabel);
			ReusableMethodTC.verifyText(
					"Michael Page is part of the PageGroup. Michael Page is a trading name of Michael Page International Recruitment Limited. Registered in England No. 04130921 Registered Office: Page House, 1 Dashwood Lang Road, Addlestone, Weybridge, Surrey, KT15 2QW",
					TradeMarklabel.getText().trim());
			System.out.println("Verified : Home page Displayed");
			Reporter.log("Verified : Home page Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Home page Displayed");
			break;
		}
		case "FEATUREDJOBTITLE": {
			ReusableMethodTC.elementToBeVisible(FeaturedJobTitle);
			ReusableMethodTC.highLighterMethod(driver, FeaturedJobTitle);
			System.out.println("Verified : The Featured Job Displayed" + FeaturedJobTitle.getText());
			Reporter.log("Verified : The Featured Job Displayed" + FeaturedJobTitle.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : The Featured Job Displayed" + FeaturedJobTitle.getText());
			break;
		}
		case "FEATUREDJOBLOCATION": {
			ReusableMethodTC.elementToBeVisible(FeaturedJobLocation);
			ReusableMethodTC.highLighterMethod(driver, FeaturedJobLocation);
			System.out.println("Verified : The Featured Job Location" + FeaturedJobLocation.getText());
			Reporter.log("Verified : The Featured Job Location" + FeaturedJobLocation.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : The Featured Job Location" + FeaturedJobLocation.getText());
			break;
		}
		case "FEATUREDJOBTYPE": {
			ReusableMethodTC.elementToBeVisible(FeaturedJobType);
			ReusableMethodTC.highLighterMethod(driver, FeaturedJobType);
			System.out.println("Verified : The Featured Job Type" + FeaturedJobType.getText());
			Reporter.log("Verified : The Featured Job Type" + FeaturedJobType.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : The Featured Job Type" + FeaturedJobType.getText());
			break;
		}
		case "FEATUREDJOBSAVE": {
			ReusableMethodTC.elementToBeVisible(FeaturedJobSave);
			ReusableMethodTC.highLighterMethod(driver, FeaturedJobSave);
			System.out.println("Verified : The Featured Job Save" + FeaturedJobSave.getText());
			Reporter.log("Verified : The Featured Job Save" + FeaturedJobSave.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : The Featured Job Save" + FeaturedJobSave.getText());
			break;
		}
		case "HEADER": {
			ReusableMethodTC.elementToBeVisible(headertext);
			ReusableMethodTC.highLighterMethod(driver, headertext);
			System.out.println("Verified : The Header is Displayed" + headertext.getText());
			Reporter.log("Verified : The Header is Displayed" + headertext.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : The Header is Displayed" + headertext.getText());
			break;
		}
		case "SUBHEADER": {
			ReusableMethodTC.elementToBeVisible(headersubtext);
			ReusableMethodTC.highLighterMethod(driver, headersubtext);
			System.out.println("Verified : The Sub-Header is Displayed" + headersubtext.getText());
			Reporter.log("Verified : The Sub-Header is Displayed" + headersubtext.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : The Sub-Header is Displayed" + headersubtext.getText());
			break;
		}
		case "HEADERLINK": {
			ReusableMethodTC.elementToBeVisible(headerLink);
			ReusableMethodTC.highLighterMethod(driver, headerLink);
			System.out.println("Verified : The Sub-Header Link is Displayed" + headerLink.getText());
			Reporter.log("Verified : The Sub-Header Link is Displayed" + headerLink.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : The Sub-Header Link is Displayed" + headerLink.getText());
			break;
		}
		case "FEATUREDJOBVIEW": {
			ReusableMethodTC.elementToBeVisible(FeaturedJobView);
			ReusableMethodTC.highLighterMethod(driver, FeaturedJobView);
			System.out.println("Verified : The Featured Job Displayed" + FeaturedJobView.getText());
			Reporter.log("Verified : The Featured Job Displayed" + FeaturedJobView.getText());
			LogFile.APPLICATION_LOGS.debug("Verified : The Featured Job Displayed" + FeaturedJobView.getText());
			break;
		}
		case "FACEBOOK": {
			ReusableMethodTC.elementToBeVisible(FacebookLink);
			ReusableMethodTC.highLighterMethod(driver, FacebookLink);
			System.out.println("Verified : The FaceBook Link Displayed");
			Reporter.log("Verified : The FaceBook Link Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The FaceBook Link Displayed");
			break;
		}
		case "LINKEDIN": {
			ReusableMethodTC.elementToBeVisible(LinkedInLink);
			ReusableMethodTC.highLighterMethod(driver, LinkedInLink);
			System.out.println("Verified : The LinkedIn Link Displayed");
			Reporter.log("Verified : The LinkedIn Link Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The LinkedIn Link Displayed");
			break;
		}
		case "TWITTER": {
			ReusableMethodTC.elementToBeVisible(TwitterLink);
			ReusableMethodTC.highLighterMethod(driver, TwitterLink);
			System.out.println("Verified : The Twitter Link Displayed");
			Reporter.log("Verified : The Twitter Link Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The Twitter Link Displayed");
			break;
		}
		case "YOUTUBE": {
			ReusableMethodTC.elementToBeVisible(YoutubeLink);
			ReusableMethodTC.highLighterMethod(driver, YoutubeLink);
			System.out.println("Verified : The Youtube Link Displayed");
			Reporter.log("Verified : The Youtube Link Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The Youtube Link Displayed");
			break;
		}
		case "EMAIL ADDRESS LABEL": {
			ReusableMethodTC.elementToBeVisible(emailAddresslable);
			ReusableMethodTC.highLighterMethod(driver, emailAddresslable);
			System.out.println("Verified : The Email addressable :" + emailAddresslable.getText()+" is Displayed");
			Reporter.log("Verified : The Email addressable :" + emailAddresslable.getText()+" is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The Email addressable is Displayed");
			break;
		}
		case "PASSWORD ADDRESS LABEL": {
			ReusableMethodTC.elementToBeVisible(passWordAddresslable);
			ReusableMethodTC.highLighterMethod(driver, passWordAddresslable);
			Reporter.log("Verified : The Password addressable :" + passWordAddresslable.getText()+" is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The Password addressable is Displayed");
			break;
		}
		case "LOGIN TITLE MY ACCOUNT PAGE": {
			ReusableMethodTC.elementToBeVisible(LoginTitleMyAccountPage);
			ReusableMethodTC.highLighterMethod(driver, LoginTitleMyAccountPage);
			Reporter.log("Verified : Login title :" + LoginTitleMyAccountPage.getText()+" is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : Login title is Displayed");
			break;
		}
		case "SIGNUP TITLE MY ACCOUNT PAGE": {
			ReusableMethodTC.elementToBeVisible(signUPTitleMyAccountPage);
			ReusableMethodTC.highLighterMethod(driver, signUPTitleMyAccountPage);
			Reporter.log("Verified : SignUP title :" + signUPTitleMyAccountPage.getText()+" is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : SignUP title is Displayed");
			break;
		}
		case "MY ACCOUNT PAGE HEADER": {
			ReusableMethodTC.elementToBeVisible(myAccountPageHeader);
			ReusableMethodTC.highLighterMethod(driver, myAccountPageHeader);
			System.out.println("Verified :My account page header: "+myAccountPageHeader.getText().trim()+" is Displayed");
			Reporter.log("Verified :My account page header: "+myAccountPageHeader.getText().trim()+" is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified :My account page header is Displayed");
			break;
		}
		 case "EMAIL ADDRESS ERROR FIELD": {
            ReusableMethodTC.elementToBeVisible(emailErrorField);
            ReusableMethodTC.highLighterMethod(driver, emailErrorField);
            Reporter.log("Verified Email error field is::" + emailErrorField.getText());
            LogFile.APPLICATION_LOGS.debug("Verified Email error field is::" + emailErrorField.getText());
            break;
        }
		 case "PASSWORD ERROR FIELD": {
            ReusableMethodTC.elementToBeVisible(passwordErrorField);
            ReusableMethodTC.highLighterMethod(driver, passwordErrorField);
            Reporter.log("Verified Password error field is::" + passwordErrorField.getText());
            LogFile.APPLICATION_LOGS.debug("Verified Password error field is::" + passwordErrorField.getText());
            break;
	        }
		 case "EMAIL ALREADY EXISTS": {
				ReusableMethodTC.elementToBeVisible(errorMessageEmailExists);
				ReusableMethodTC.highLighterMethod(driver, errorMessageEmailExists);
				System.out.println("Verified :Email already exists: "+errorMessageEmailExists.getText().trim()+" is Displayed");
				Reporter.log("Verified :Email already exists: "+errorMessageEmailExists.getText().trim()+" is Displayed");
				LogFile.APPLICATION_LOGS.debug("Verified : Email already exists error message is Displayed");
				break;
			}
			case "ACCOUNT CREATED SUCCESSFULLY": {
				ReusableMethodTC.elementToBeVisible(successfullyAccountCreationMSG);
				ReusableMethodTC.highLighterMethod(driver, successfullyAccountCreationMSG);
				System.out.println("Verified : "+successfullyAccountCreationMSG.getText().trim()+" is Displayed");
				Reporter.log("Verified : "+successfullyAccountCreationMSG.getText().trim()+" is Displayed");
				LogFile.APPLICATION_LOGS.debug("Verified : Email already exists error message is Displayed");
				break;
			}
			case "PASSWORD TEXT VALUE": {
				ReusableMethodTC.elementToBeVisible(passWordTxb);
				ReusableMethodTC.highLighterMethod(driver, passWordTxb);
				System.out.println("Verified :Password Text value: "+passWordTxb.getAttribute("value").toString()+" is Displayed");
				Reporter.log("Verified :Password Text value: "+passWordTxb.getAttribute("value").toString()+" is Displayed");
				LogFile.APPLICATION_LOGS.debug("Verified :Password Text value ");
				break;
			}
			case "FORGOTTEN PASSWORD HEADER": {
				ReusableMethodTC.elementToBeVisible(signInWindowTitle);  
				ReusableMethodTC.highLighterMethod(driver, signInWindowTitle);	
				Reporter.log("Verified : header "+signInWindowTitle.getText()+" is displayed"); 
				LogFile.APPLICATION_LOGS.debug("Verified : header " +signInWindowTitle.getText()+ "  is displayed"); 
				break;
			}
			case "SUCCESSFULLY SENT EMAIL MESSAGE": {
				ReusableMethodTC.elementToBeVisible(successfullySentEmailMSG);
				ReusableMethodTC.highLighterMethod(driver, successfullySentEmailMSG);
				System.out.println("Verified :Email already exists: "+successfullySentEmailMSG.getText().trim()+" is Displayed");
				Reporter.log("Verified :Email already exists: "+successfullySentEmailMSG.getText().trim()+" is Displayed");
				LogFile.APPLICATION_LOGS.debug("Verified : Email already exists error message is Displayed");
				break;
			}
			case "LOGIN TITLE": {
				ReusableMethodTC.elementToBeVisible(loginTtileOfMyAccountPage);
				ReusableMethodTC.highLighterMethod(driver, loginTtileOfMyAccountPage);
				System.out.println("Verified :Login title : "+loginTtileOfMyAccountPage.getText().trim()+" is Displayed");
				Reporter.log("Verified :Login title : "+loginTtileOfMyAccountPage.getText().trim()+" is Displayed");
				LogFile.APPLICATION_LOGS.debug("Verified : Login title is Displayed");
				break;
			}
			case "YOUR CV HEADER": {
				ReusableMethodTC.elementToBeVisible(yourCVHeaderMyAccountPage);
				ReusableMethodTC.highLighterMethod(driver, yourCVHeaderMyAccountPage);
				System.out.println("Verified :Your CV header : "+yourCVHeaderMyAccountPage.getText().trim()+" is Displayed");
				Reporter.log("Verified :Your CV header : "+yourCVHeaderMyAccountPage.getText().trim()+" is Displayed");
				LogFile.APPLICATION_LOGS.debug("Verified : Your CV header is Displayed");
				break;
			}
			case "ERROR PASSWORD FIELD": {
				ReusableMethodTC.elementToBeVisible(passwordErrorFieldSignUP);
				ReusableMethodTC.highLighterMethod(driver, passwordErrorFieldSignUP);
				Reporter.log("Verified :Password error field : "+passwordErrorFieldSignUP.getText().trim()+" is Displayed");
				LogFile.APPLICATION_LOGS.debug("Verified : Password error field");
				break;
			}	
			case "TO ADD CV FIRST DELETE CV": {
				ReusableMethodTC.elementToBeVisible(toAddCVFirstDeleteCVFromList);
				ReusableMethodTC.highLighterMethod(driver, toAddCVFirstDeleteCVFromList);
				Reporter.log("Verified : Message after uploading moethen 3 CV's  : "+toAddCVFirstDeleteCVFromList.getText().trim()+" is Displayed");
				LogFile.APPLICATION_LOGS.debug("Verified : Message after uploading moethen 3 CV's  : "+toAddCVFirstDeleteCVFromList.getText().trim()+" is Displayed");
				break;
			}
			case "ACCOUNT SETTING": {
				ReusableMethodTC.elementToBeVisible(accountsetting);
				ReusableMethodTC.highLighterMethod(driver, accountsetting);
				Reporter.log("Verified : header after click on account setting link : "+accountsetting.getText().trim()+" is Displayed");
				LogFile.APPLICATION_LOGS.debug("Verified : header after click on account setting link : "+accountsetting.getText().trim()+" is Displayed");
				break;
			    }
			
			case "ERRORS SIGNUP FIELDS": {
				
				try {
					Thread.sleep(1000);
					if (errorMessageSignUPPage.size() > 0) {
						for (int i = 0; i <= errorMessageSignUPPage.size(); i++) {
							String validatios = errorMessageSignUPPage.get(i).getText();
							Thread.sleep(2000);
							System.out.println("Verified : The Error  : " + i + " is : " + validatios);
							Reporter.log("Verified : The Error  : " + i + " is : " + validatios);
							LogFile.APPLICATION_LOGS.debug("The Error  : " + i + " is : " + validatios);
						}
					}
				  } catch (Exception e) {
					LogFile.APPLICATION_LOGS.error("There is no validations: ");
				  }	
				break;
			      }	
			case "SECTION TITLES OF MYACCOUNT DASHBOARD": {			
				try {
					Thread.sleep(1000);
					if (sectionTitlesMyAccountDasboard.size() > 0) {
						for (int i = 0; i <= sectionTitlesMyAccountDasboard.size(); i++) {
							String validatios = sectionTitlesMyAccountDasboard.get(i).getText();
							Thread.sleep(1000);
							System.out.println("Verified : The Section Tiles from My Account Dashboard page is : " + validatios);
							Reporter.log("Verified : The Section Tiles from My Account Dashboard page is : " + validatios);
							LogFile.APPLICATION_LOGS.debug("Verified : The Section Tiles from My Account Dashboard page is : " + validatios);
						}
					}
				} catch (Exception e) {
					LogFile.APPLICATION_LOGS.error("There is no Section titles on my account dashboard page: ");
				}	
				break;
			}	
          
   		case "SAVED JOB TITLE": {
   			ReusableMethodTC.elementToBeVisible(savedJobTitle);
   			ReusableMethodTC.highLighterMethod(driver, savedJobTitle);
   			System.out.println("Verified: Saved job title is: " + savedJobTitle.getText());
   			Reporter.log("Verified: Saved job title is: " + savedJobTitle.getText());
   			LogFile.APPLICATION_LOGS.debug("Verified: Saved job title is:  " + savedJobTitle.getText());
   			break;
   		}
   		case "RECENTLY SAVEDJOBS HEADER": {
   			ReusableMethodTC.elementToBeVisible(recentlySavedJobsHeader);
   			ReusableMethodTC.highLighterMethod(driver, recentlySavedJobsHeader);
   			System.out.println("Verified: header saved jobs header is: " + recentlySavedJobsHeader.getText());
   			Reporter.log("Verified: header saved jobs header is: " + recentlySavedJobsHeader.getText());
   			LogFile.APPLICATION_LOGS
   					.debug("Verified: header saved jobs header is:  " + recentlySavedJobsHeader.getText());
   			break;
   		}
   		case "JOB LIST PAGE TILE": {
   			ReusableMethodTC.elementToBeVisible(JobListPageTitle);
   			ReusableMethodTC.highLighterMethod(driver, JobListPageTitle);
   			System.out.println("Verified: Job list title is: " + JobListPageTitle.getText());
   			Reporter.log("Verified: Job list title is: " + JobListPageTitle.getText());
   			LogFile.APPLICATION_LOGS.debug("Verified:Job list title is:  " + JobListPageTitle.getText());
   			break;
   		}
   		case "JOB TILE AFTER CLICKING ON SAVED JOB TITLE": {
   			ReusableMethodTC.elementToBeVisible(titleAfterClickingOnSavedJobTitle);
   			ReusableMethodTC.highLighterMethod(driver, titleAfterClickingOnSavedJobTitle);
   			System.out.println("Verified: title is: " + titleAfterClickingOnSavedJobTitle.getText());
   			driver.navigate().back();
   			Reporter.log("Verified:  title is: " + JobListPageTitle.getText());
   			LogFile.APPLICATION_LOGS.debug("Verified: title is:  " + JobListPageTitle.getText());
   			
   			break;
   		}   		
   		case "SAVED JOBS WILL APPEAR HERE": {
   			if (savedJobwillAppearHere.isDisplayed()) {
   				ReusableMethodTC.elementToBeVisible(savedJobwillAppearHere);
   				ReusableMethodTC.highLighterMethod(driver, savedJobwillAppearHere);
   				System.out.println("Verified: There is no saved job press the star icon to Saved job is: "
   						+ savedJobwillAppearHere.getText().trim());
   				Reporter.log("Verified:There is no saved job press the star icon to Saved job is: "
   						+ savedJobwillAppearHere.getText().trim());
   				LogFile.APPLICATION_LOGS.debug("Verified:There is no saved job press the star icon to Saved job is:  "
   						+ savedJobwillAppearHere.getText().trim());
   			} else {
   				Reporter.log("Currently jobs are saved in list");
   				LogFile.APPLICATION_LOGS.debug("Currently jobs are saved in list");
   				break;
   			}
   			break;
   		}
   		
   		case "SUB SECTION TITLES OF MYACCOUNT DASHBOARD": {
   			try {
   				Thread.sleep(1000);
   				if (subSectionTitlesMyAccountDasboard.size() > 0) {
   					for (int i = 0; i <= subSectionTitlesMyAccountDasboard.size(); i++) {
   						String validatios = subSectionTitlesMyAccountDasboard.get(i).getText();
   						Thread.sleep(1000);
   						System.out.println(
   								"Verified : The Sub Section Tiles from My Account Dashboard page is : " + validatios);
   						Reporter.log(
   								"Verified : The Sub Section Tiles from My Account Dashboard page is : " + validatios);
   						LogFile.APPLICATION_LOGS.debug(
   								"Verified : The Sub Section Tiles from My Account Dashboard page is : " + validatios);
   					}
   				}
   			} catch (Exception e) {
   				LogFile.APPLICATION_LOGS.error("There is no Section titles on my account dashboard page: ");
   			}
   			break;
   		}
   		case "PASSWORD MUST NOT MATCH": {
   			ReusableMethodTC.elementToBeVisible(savedJobTitle);
   			ReusableMethodTC.highLighterMethod(driver, savedJobTitle);
   			ReusableMethodTC.sendKeys(passwordMustNotMatch3ExistingPassword, Keys.TAB);
   			Reporter.log("Verified : Error password must not match : "
   					+ passwordMustNotMatch3ExistingPassword.getText().trim() + " is Displayed");
   			LogFile.APPLICATION_LOGS.debug("Verified : Error password must not match : "
   					+ passwordMustNotMatch3ExistingPassword.getText().trim() + " is Displayed");
   			break;
   		}
   		case "ALL FEATURED EMPLOYERS": {
			ReusableMethodTC.elementToBeVisible(AllFeaturedempSection);
			ReusableMethodTC.highLighterMethod(driver, AllFeaturedempSection);
			System.out.println("Verified : All Featured Employers are Displayed");
			Reporter.log("Verified : All Featured Employers are Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : All Featured Employers are Displayed");
			break;
		}
   		case "EXPLORE ALL CATEGORIES": {
			ReusableMethodTC.elementToBeVisible(ExploreCategorieslabel);
			ReusableMethodTC.highLighterMethod(driver, ExploreCategorieslabel);
			ReusableMethodTC.verifyText("Explore all categories", ExploreCategorieslabel.getText());
			System.out.println("Verified that Explore all categories label is displayed Successfully");
			Reporter.log("Verified that Explore all categories label is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Explore all categories label is displayed Successfully");
			break;
   		}
   		case "TOPIC": {
   			ReusableMethodTC.elementToBeVisible(Topicslabel );
   			ReusableMethodTC.highLighterMethod(driver, Topicslabel );
   			System.out.println("Verified: Topic is: " + Topicslabel.getText());
   			Reporter.log("Verified: Topic is: " + Topicslabel.getText());
   			LogFile.APPLICATION_LOGS.debug("Verified: Topic is:  " + Topicslabel.getText());
   			break;
   		}
   		case "SUB TOPIC": {
   			ReusableMethodTC.elementToBeVisible(SubTopicslabel );
   			ReusableMethodTC.highLighterMethod(driver, SubTopicslabel );
   			System.out.println("Verified: Sub topic is: " + SubTopicslabel.getText());
   			Reporter.log("Verified:  Sub topic is: " + SubTopicslabel.getText());
   			LogFile.APPLICATION_LOGS.debug("Verified: Sub topic is:  " + SubTopicslabel.getText());
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
		case "FEATURED EMPLOYER IMAGE": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, FeaturedEmployerclk);
			ReusableMethodTC.click(FeaturedEmployerclk);
			Reporter.log("Clicked on Featured Employer Image");
			LogFile.APPLICATION_LOGS.info("Clicked on Featured Employer Image");
			break;
		}
		case "BLOG ARTICLE": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, BlogArticleclk);
			ReusableMethodTC.click(BlogArticleclk);
			Reporter.log("Clicked on Latest Article Image");
			LogFile.APPLICATION_LOGS.info("Clicked on Latest Article Image");
			break;
		}
		case "VIEW ALL": {
			Thread.sleep(2000);
			ReusableMethodTC.highLighterMethod(driver, ViewAllbtn);
			ReusableMethodTC.click(ViewAllbtn);
			Reporter.log("Clicked on View All link");
			LogFile.APPLICATION_LOGS.info("Clicked on View All link");
			break;
		}
		case "CREATE NEW ACCOUNT": {
			ReusableMethodTC.highLighterMethod(driver, createNewAccountLink);
			ReusableMethodTC.click(createNewAccountLink);
			Reporter.log("Clicked on Upload your CV button");
			LogFile.APPLICATION_LOGS.info("Clicked on Upload your CV button");
			break;
		}
		case "SIGNUP": {
			ReusableMethodTC.highLighterMethod(driver, signUpBtn);
			ReusableMethodTC.click(signUpBtn);
			Reporter.log("Clicked on SignUP button");
			LogFile.APPLICATION_LOGS.info("Clicked on SignUP button");
			break;
		}
		case "EYE ENCRYPT OPTION": {
			ReusableMethodTC.highLighterMethod(driver, eyeEncryptOption);
			ReusableMethodTC.click(eyeEncryptOption);
			Reporter.log("Clicked on EYE ENCRYPT button");
			LogFile.APPLICATION_LOGS.info("Clicked on EYE ENCRYPT button");
			break;
		}
		case "FORGOTTEN LINK": {
			ReusableMethodTC.highLighterMethod(driver, forgottenLink);
			ReusableMethodTC.click(forgottenLink);
			System.out.println("Clicked on Forgotten link" );
			Reporter.log("Clicked on 'Forgotten' link");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Forgotten' link");
			break;
		}
		case "SEND RECOVERY LINK": {
			ReusableMethodTC.highLighterMethod(driver, sendRecoveryLinkButton);
			ReusableMethodTC.click(sendRecoveryLinkButton);
			System.out.println("Clicked on SendRecoverLink button on Forgotten Password window");
			Reporter.log("Clicked on SendRecoverLink button on Forgotten Password window");
			LogFile.APPLICATION_LOGS.info("Clicked on SendRecoverLink button on Forgotten Password window");
			break;
		}
		
		case "RETURN TO LOGIN BUTTON": {
			ReusableMethodTC.highLighterMethod(driver, returnToLoginButton);
			ReusableMethodTC.click(returnToLoginButton);
			System.out.println("Clicked on Return To Login button" );
			Reporter.log("Clicked on Return To Login button");
			LogFile.APPLICATION_LOGS.info("Clicked on Return To Login button");
			break;
		}
		case "LOGINORSIGNUP": {
			ReusableMethodTC.elementToBeVisible(loginOrSignUpIcon);
			ReusableMethodTC.highLighterMethod(driver, loginOrSignUpIcon);
			ReusableMethodTC.click(loginOrSignUpIcon);
			System.out.println("Clicked on Return To Login button" );
			Reporter.log("Clicked on Return To Login button");
			LogFile.APPLICATION_LOGS.info("Clicked on Return To Login button");
			break;
		}
		case "YOUR CV": {
			ReusableMethodTC.elementToBeVisible(yourCVLinkMyAccountPage);
			ReusableMethodTC.highLighterMethod(driver, yourCVLinkMyAccountPage);
			ReusableMethodTC.click(yourCVLinkMyAccountPage);
			System.out.println("Clicked on My Account Page link" );
			Reporter.log("Clicked on My Account Page link");
			LogFile.APPLICATION_LOGS.info("Clicked on My Account Page link");
			break;
		}
		case "LOGIN AND SECURITY": {
			ReusableMethodTC.elementToBeVisible(loginNSecurity);
			ReusableMethodTC.highLighterMethod(driver, loginNSecurity);
			ReusableMethodTC.click(loginNSecurity);
			System.out.println("Clicked on loginNSecurity link" );
			Reporter.log("Clicked on loginNSecurity link");
			LogFile.APPLICATION_LOGS.info("Clicked on loginNSecurity link");
			break;
		}
		case "ADD CV": {
			ReusableMethodTC.elementToBeVisible(addCVMyAccountPage);
			ReusableMethodTC.highLighterMethod(driver, addCVMyAccountPage);
			ReusableMethodTC.click(addCVMyAccountPage);
			System.out.println("Clicked on Add CV button" );
			Reporter.log("Clicked on Add CV button");
			LogFile.APPLICATION_LOGS.info("Clicked on Add CV button");
			break;
		}
		case "REMOVE CV": {
			Thread.sleep(1000);
			ReusableMethodTC.highLighterMethod(driver, showOption);
			ReusableMethodTC.click(showOption);
			ReusableMethodTC.highLighterMethod(driver, removeCVOptionMAccountPage);
			ReusableMethodTC.click(removeCVOptionMAccountPage);
			Thread.sleep(1000);
			System.out.println("Clicked on 'Remove' option");
			Reporter.log("Clicked on 'Remove' option");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Remove' option");
			break;
		}
		case "DELETE CV": {	
			try {
				
				if (uploadedFileName.isDisplayed()) {
					ReusableMethodTC.highLighterMethod(driver, deleteshowOption1);
					ReusableMethodTC.click(deleteshowOption1);	
					ReusableMethodTC.highLighterMethod(driver, deleteCVOptionMAccountPage1);
					ReusableMethodTC.click(deleteCVOptionMAccountPage1);
					ReusableMethodTC.highLighterMethod(driver, deleteCVConfirmButton);
					ReusableMethodTC.click(deleteCVConfirmButton);
					
					Thread.sleep(2000);
					ReusableMethodTC.highLighterMethod(driver, deleteshowOption2);
					ReusableMethodTC.click(deleteshowOption2);	
					ReusableMethodTC.highLighterMethod(driver, deleteCVOptionMAccountPage2);
					ReusableMethodTC.click(deleteCVOptionMAccountPage2);
					ReusableMethodTC.elementToBeVisible(deleteCVConfirmButton);
					ReusableMethodTC.highLighterMethod(driver, deleteCVConfirmButton);
					ReusableMethodTC.click(deleteCVConfirmButton);
				
					Thread.sleep(2000);
					ReusableMethodTC.highLighterMethod(driver, deleteshowOption3);
					ReusableMethodTC.click(deleteshowOption3);	
					ReusableMethodTC.highLighterMethod(driver, deleteCVOptionMAccountPage3);
					ReusableMethodTC.click(deleteCVOptionMAccountPage3);
					ReusableMethodTC.elementToBeVisible(deleteCVConfirmButton);
					ReusableMethodTC.highLighterMethod(driver, deleteCVConfirmButton);
					ReusableMethodTC.click(deleteCVConfirmButton);
					ReusableMethodTC.elementToBeInvisible(uploadedFileName);
					System.out.println("Deleted all the cv's from list");
					Reporter.log("Deleted all the cv's from list");
					LogFile.APPLICATION_LOGS.debug("Deleted all the cv's from list");
					break;
					}						
			} catch (Exception e) {
				LogFile.APPLICATION_LOGS.error("There is no Delete option to delete cv  ");
			}	
		}	
		case "VIEW CV": {
			Thread.sleep(1000);
			ReusableMethodTC.highLighterMethod(driver, showOption);
			ReusableMethodTC.click(showOption);
			ReusableMethodTC.highLighterMethod(driver, viewCVOptionMAccountPage);
			ReusableMethodTC.click(viewCVOptionMAccountPage);
			Thread.sleep(2000);
			viewCVAfterDownloaded();
			System.out.println("Clicked on 'VIEW CV' button");
			Reporter.log("Clicked on 'VIEW CV' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'VIEW CV' button");
			break;
		}
		case "SAVE BUTTON": {
			ReusableMethodTC.highLighterMethod(driver, saveButtonMyAccountPage);
			ReusableMethodTC.click(saveButtonMyAccountPage);
			System.out.println("Clicked on 'Save' button");
			Reporter.log("Clicked on 'Save' button");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Save' button");
			break;
		}
		case "SAVE JOB": {
			ReusableMethodTC.highLighterMethod(driver, saveJobLinkHomePage);
			ReusableMethodTC.click(saveJobLinkHomePage);
			System.out.println("Clicked on 'Save Job' link");
			Reporter.log("Clicked on 'Save Job' link");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Save Job' link");
			break;
		}
		
		case "MY ACCOUNT": {
			ReusableMethodTC.highLighterMethod(driver, myAccountLinkGoBack);
			ReusableMethodTC.click(myAccountLinkGoBack);
			System.out.println("Go Back to previous page after click on 'MyAccount' Link ");
			Reporter.log("Go Back to previous page after click on 'MyAccount' Link ");
			LogFile.APPLICATION_LOGS.info("Go Back to previous page after click on 'MyAccount' Link ");
			break;
		}
		case "LOGIN": {
			ReusableMethodTC.highLighterMethod(driver, loginLinkMyAccountDashBoardPage);
			ReusableMethodTC.click(loginLinkMyAccountDashBoardPage);
			System.out.println("Clicked on 'Login' Link on My Account DashBoard page ");
			Reporter.log("Clicked on 'Login' Link on My Account DashBoard page ");
			LogFile.APPLICATION_LOGS.info("Clicked on 'Login' Link on My Account DashBoard page ");
			break;
		}		
		 case "EDIT BUTTON": {
				ReusableMethodTC.highLighterMethod(driver, editButtonPersonalDetails);
				ReusableMethodTC.click(editButtonPersonalDetails);
				System.out.println("Clicked on 'Edit Button' on My Account DashBoard page ");
				Reporter.log("Clicked on 'Edit Button' on My Account DashBoard page ");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Edit Button' on My Account DashBoard page ");
				break;
			}
			case "SAVE OPTION TO SAVEJOB": {
				ReusableMethodTC.highLighterMethod(driver, saveJobOption);
				ReusableMethodTC.click(saveJobOption);
				System.out.println("Clicked on 'Save Option' on Job results page");
				Reporter.log("Clicked on 'Save Option' on Job results page");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Save Option' on Job results page");
				break;
			}

			case "SAVE BUTTON PERSONAL DETAILS": {
				ReusableMethodTC.highLighterMethod(driver, saveButtonMyPage);
				ReusableMethodTC.click(saveButtonMyPage);
				System.out.println("Clicked on 'Save Button' on personal details page ");
				Reporter.log("Clicked on 'Save Button' on personal details page ");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Save Button' on personal details page ");
				break;
			}
			case "JOB LIST OPTION": {
				ReusableMethodTC.highLighterMethod(driver, savedJobListOption);
				ReusableMethodTC.click(savedJobListOption);
				System.out.println("Clicked on 'Job Option' on Saved Job page ");
				Reporter.log("Clicked on 'Job Option' on Saved Job page ");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Job Option' on Saved Job page ");
				break;
			}
			case "VIEW SIMILAR JOB OPTION": {
				ReusableMethodTC.highLighterMethod(driver, viewSimilarJobOption);
				ReusableMethodTC.click(viewSimilarJobOption);
				System.out.println("Clicked on 'View similar job' option ");
				Reporter.log("Clicked on 'View similar job' option ");
				LogFile.APPLICATION_LOGS.info("Clicked on 'View similar job' option ");
				break;
			}
			case "REMOVE SAVED JOB": {
				ReusableMethodTC.highLighterMethod(driver, removeSavedJobOnSavedJobPage);
				ReusableMethodTC.click(removeSavedJobOnSavedJobPage);
				System.out.println("Clicked on 'Removed Save Job' option ");
				Reporter.log("Clicked on 'Removed Save Job' option ");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Removed Save Job' option ");
				break;
			}
			case "CONFIRM REMOVE SAVE JOB AUTHENTICATED": {
				ReusableMethodTC.highLighterMethod(driver, deleteCVConfirmButtonAuthctd);
				ReusableMethodTC.click(deleteCVConfirmButtonAuthctd);
				System.out.println("Clicked on 'Confirm Removed Save Job' button");
				Reporter.log("Clicked on 'Confirm Removed Save Job' option");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Confirm Removed Save Job' button");
				break;
			}
			case "CONFIRM REMOVE SAVE JOB ANONYMOUS": {
				ReusableMethodTC.highLighterMethod(driver, deleteCVConfirmButtonAnonms);
				ReusableMethodTC.click(deleteCVConfirmButtonAnonms);
				System.out.println("Clicked on 'Confirm Removed Save Job' button");
				Reporter.log("Clicked on 'Confirm Removed Save Job' option");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Confirm Removed Save Job' button");
				break;
			}
			case "CANCEL FROM REMOVE SAVE JOB WINDOW AUTH": {		
				ReusableMethodTC.highLighterMethod(driver, cancelSavedJobFromRemoveWindowAuthentd);
				ReusableMethodTC.click(cancelSavedJobFromRemoveWindowAuthentd);
				System.out.println("Clicked on 'Cancel' from Removed Save Job window");
				Reporter.log("Clicked on 'Cancel' from Removed Save Job window ");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Cancel' from Removed Save Job window");
				break;
			}
	        case "CANCEL FROM REMOVE SAVE JOB WINDOW ANON": {	
	        	ReusableMethodTC.elementToBeVisible(cancelSavedJobFromRemoveWindowAnonms);
				ReusableMethodTC.highLighterMethod(driver, cancelSavedJobFromRemoveWindowAnonms);
				ReusableMethodTC.clickByJS(cancelSavedJobFromRemoveWindowAnonms);
				System.out.println("Clicked on 'Cancel' from Removed Save Job window");
				Reporter.log("Clicked on 'Cancel' from Removed Save Job window ");
				LogFile.APPLICATION_LOGS.info("Clicked on 'Cancel' from Removed Save Job window");
				break;
			}
			case "TO VIEW SAVED JOB BYCLICKING TITLE": {
				ReusableMethodTC.elementToBeVisible(clickJobTitleToOpenSavedJob);
				ReusableMethodTC.highLighterMethod(driver, clickJobTitleToOpenSavedJob);
				ReusableMethodTC.clickByJS(clickJobTitleToOpenSavedJob);
				System.out.println("Clicked on title to open saved job");
				Reporter.log("Clicked on title to open saved job");
				LogFile.APPLICATION_LOGS.info("Clicked on title to open saved job");
				break;
			}
			case "SAVE MULTIPLE JOB": {
				try {
					Thread.sleep(2000);
					if (multiplesaveJobOption.size() > 0) {
						for (int i = 0; i <= 3; i++) {
							multiplesaveJobOption.get(i).click();
							Thread.sleep(1000);
							System.out.println("Saved multiple job by clcking 'Save' button");
							Reporter.log("Saved multiple job by clcking 'Save' button");
							LogFile.APPLICATION_LOGS.debug("Saved multiple job by clcking 'Save' button");
							
						}
					}
				} catch (Exception e) {
					LogFile.APPLICATION_LOGS.error("There is no Section titles on my account dashboard page: ");
					break;
				}
				break;
			}
			case "SUB SECTION TITLES JOB MATCHANDMATCHED PROFILE": {
				try {
					Thread.sleep(1000);
					if (subSectionTitlesMyAccountDasboard.size() > 0) {
						for (int i = 0; i <= subSectionTitlesMyAccountDasboard.size(); i++) {
							String validatios = subSectionTitlesMyAccountDasboard.get(i).getText();
							if (validatios.contains("Job Match")) {
								subSectionTitlesMyAccountDasboard.get(i).click();
								ReusableMethodTC.elementToBeInvisible(PageNotFoundJobMatchNMatchedProfile);
								Reporter.log("Verified Error after clicking on Job matched Profile title :"
										+ PageNotFoundJobMatchNMatchedProfile.getText().trim());
								Thread.sleep(1000);
								ReusableMethodTC.highLighterMethod(driver, myAccountLinkGoBack);
								ReusableMethodTC.click(myAccountLinkGoBack);
								Thread.sleep(1000);
								if (validatios.contains("Job Match Profile")) {
									subSectionTitlesMyAccountDasboard.get(i).click();
									ReusableMethodTC.elementToBeInvisible(PageNotFoundJobMatchNMatchedProfile);
									System.out.println("Verified Error after clicking on Job matched Profile title :"
											+ PageNotFoundJobMatchNMatchedProfile.getText().trim());
									Reporter.log("Verified Error after clicking on Job matched Profile title :"
											+ PageNotFoundJobMatchNMatchedProfile.getText().trim());
									LogFile.APPLICATION_LOGS
											.debug("Verified Error after clicking on Job matched Profile title :"
													+ PageNotFoundJobMatchNMatchedProfile.getText().trim());
								}
							}
						}
					}
				} catch (Exception e) {
					LogFile.APPLICATION_LOGS.error("There is no Section titles on my account dashboard page: ");
				}
				break;
			}
			case "VIEW ALL LINK": {
				Thread.sleep(2000);
				ReusableMethodTC.highLighterMethod(driver, PopularArticleViewAllbtn);
				ReusableMethodTC.click(PopularArticleViewAllbtn);
				Reporter.log("Clicked on View All link");
				LogFile.APPLICATION_LOGS.info("Clicked on View All link");
				break;
			}
			}	
		}

	public void enterRandomText(String webElementTitle) {

		switch (webElementTitle.toUpperCase()) {
		case "FIRST NAME": {
			ReusableMethodTC.elementToBeVisible(firstNameText);
			ReusableMethodTC.sendKeys(firstNameText, "Automation");
			System.out.println("Entered First Name is::  Automation");
			Reporter.log("Entered First Name is:: Automation");
			LogFile.APPLICATION_LOGS.info("Entered First Name");
			break;					
		}
		case "LAST NAME": {
			ReusableMethodTC.elementToBeVisible(lastNameText);
			ReusableMethodTC.sendKeys(lastNameText, "MichaelPage");	
			Reporter.log("Entered Last Name is:: MichaelPage");
			LogFile.APPLICATION_LOGS.info("Entered Last Name is: MichaelPage");
			break;
		}
		case "EMAIL ADDRESS": {		
			ReusableMethodTC.elementToBeVisible(createEmailAddressText);
			ReusableMethodTC.sendKeys(createEmailAddressText, userName);
			Reporter.log("Entered Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Email Address");
			break;
		}
		case "CONFIRM EMAIL ADDRESS": {
			ReusableMethodTC.elementToBeVisible(createConfirmEmailAddressText);
			ReusableMethodTC.sendKeys(createConfirmEmailAddressText, userName);
			Reporter.log("Entered Confirm Email Address");
			LogFile.APPLICATION_LOGS.info("Entered Confirm Email Address");
			break;
		}
		case "PASSWORD TEXTBOX": {
			ReusableMethodTC.elementToBeVisible(createPasswordText);
			
			ReusableMethodTC.sendKeys(createPasswordText, passWord);
			Reporter.log("Entered Password");
			LogFile.APPLICATION_LOGS.info("Entered Password");
			break;
		}
		case "INVALID FIRST NAME": {
			ReusableMethodTC.highLighterMethod(driver, firstNameText);
			ReusableMethodTC.sendKeys(firstNameText, RandomDataUtil.randomStringGenerator() + "232!!");
			Reporter.log("Entered invalid First Name");
			LogFile.APPLICATION_LOGS.info("Entered invalid First Name");
			break;
		}
		case "INVALID LAST NAME": {
			ReusableMethodTC.highLighterMethod(driver, lastNameText);
			ReusableMethodTC.sendKeys(lastNameText, RandomDataUtil.randomStringGenerator() + "@#767");
			ReusableMethodTC.sendKeys(lastNameText, Keys.TAB);
			Reporter.log("Entered invalid Last Name");
			LogFile.APPLICATION_LOGS.info("Entered INVALID Last Name");
			break;
		}
		case "INVALID EMAIL ADDRESS": {
			ReusableMethodTC.highLighterMethod(driver, createEmailAddressText);
			ReusableMethodTC.sendKeys(createEmailAddressText, RandomDataUtil.randomStringGenerator() + "%^12@gmail.com" + "%#%#");
			ReusableMethodTC.sendKeys(createEmailAddressText, Keys.TAB);
			Reporter.log("Entered invalid  Email Address");
			LogFile.APPLICATION_LOGS.info("Entered invalid  Email Address");
			break;
		}
		case "INVALID CONFIRM EMAIL ADDRESS": {
			ReusableMethodTC.highLighterMethod(driver, createConfirmEmailAddressText);
			ReusableMethodTC.sendKeys(createConfirmEmailAddressText, RandomDataUtil.randomStringGenerator() + "%^12@gmail.com" + "%#%#");
			ReusableMethodTC.sendKeys(createConfirmEmailAddressText, Keys.TAB);
			Reporter.log("Entered invalid  Email Address");
			LogFile.APPLICATION_LOGS.info("Entered invalid  Email Address");
			break;
		}
		case "INVALID PASSWORD": {
			ReusableMethodTC.highLighterMethod(driver, createPasswordText);
			ReusableMethodTC.sendKeys(createPasswordText, RandomDataUtil.randomStringGenerator());
			ReusableMethodTC.sendKeys(createPasswordText, Keys.TAB);
			Reporter.log("Entered invalid password");
			LogFile.APPLICATION_LOGS.info("Entered invalid password");
			break;
		}	
       case "NEW EMAIL ADDRESS": {		
			ReusableMethodTC.elementToBeVisible(createEmailAddressText);
			ReusableMethodTC.sendKeys(createEmailAddressText, newEmailAddress);
			System.out.println("Entered new email address is: " +newEmailAddress);
			Reporter.log("Entered new email address is: " +newEmailAddress);
			LogFile.APPLICATION_LOGS.info("Entered Email Address");
			break;
		}
		case "NEW CONFIRM EMAIL ADDRESS": {
			ReusableMethodTC.elementToBeVisible(createConfirmEmailAddressText);
			ReusableMethodTC.sendKeys(createConfirmEmailAddressText, newEmailAddress);
			System.out.println("Entered new Confirm email address is: " +newEmailAddress);
			Reporter.log("Entered new Confirm email address is: " +newEmailAddress);
			LogFile.APPLICATION_LOGS.info("Entered new Confirm Email Address");
			break;
		}
		case "RECOVERY EMAIL ADDRESS": {			
			ReusableMethodTC.elementToBeVisible(emailTxbOnForgottenPassword);
			ReusableMethodTC.highLighterMethod(driver, emailTxbOnForgottenPassword);
			ReusableMethodTC.sendKeys(emailTxbOnForgottenPassword, userName);
			System.out.println("Entered Email Address on Forgotten Password window");
			Reporter.log("Entered Email Address on Forgotten Password window");
			LogFile.APPLICATION_LOGS.info("Entered Email Address on Forgotten Password window");
			break;
		}
		case "CURRENT PASSWORD": {			
			ReusableMethodTC.elementToBeVisible(currentPassword);
			ReusableMethodTC.highLighterMethod(driver, currentPassword);
			ReusableMethodTC.sendKeys(currentPassword, passWord);
			System.out.println("Entered current password :" + passWord);
			Reporter.log("Entered current password :" + passWord);
			LogFile.APPLICATION_LOGS.info("Entered current password :" + passWord);
			break;
		}
		case "NEW PASSWORD": {			
			ReusableMethodTC.elementToBeVisible(newPassword);
			ReusableMethodTC.highLighterMethod(driver, newPassword);
			ReusableMethodTC.sendKeys(newPassword, passWord);
			System.out.println("Entered new password :" + passWord);
			Reporter.log("Entered new password :" + passWord);
			LogFile.APPLICATION_LOGS.info("Entered current password :" + passWord);
			break;
		}
		case "PHONE NUMBER": {
			ReusableMethodTC.elementToBeVisible(phoneNumberMyPage);
			ReusableMethodTC.highLighterMethod(driver, phoneNumberMyPage);
			ReusableMethodTC.sendKeys(phoneNumberMyPage, "85858585");
			Reporter.log("Entered Phone number :" + 85858585);
			LogFile.APPLICATION_LOGS.info("Entered Phone number :" + 85858585);
			break;
		}
		case "ERROR All PERSONAL DETAILS": {

			try {
				Thread.sleep(1000);
				if (errorpersonalDetailsOnMyPage.size() > 0) {
					for (int i = 0; i <= errorpersonalDetailsOnMyPage.size(); i++) {
						System.out.println("Verified Error on Personal details page: "
								+ errorpersonalDetailsOnMyPage.get(i).getText());

						Reporter.log("Verified : All the Error fields of personal details page on my page :"
								+ errorpersonalDetailsOnMyPage.get(i).getText());
						LogFile.APPLICATION_LOGS
								.debug("Verified : All the Error fields of personal details page on my page :"
										+ errorpersonalDetailsOnMyPage.get(i).getText());
					}
				}
			} catch (Exception e) {
				LogFile.APPLICATION_LOGS.error("There is no Section titles on my account dashboard page: ");
			}
			break;
		}

		case "CLEAR ALL PERSONAL DETAILS": {

			try {
				Thread.sleep(1000);
				if (personalDetailsOnMyPage.size() > 0) {
					for (int i = 0; i <= personalDetailsOnMyPage.size(); i++) {
						personalDetailsOnMyPage.get(i).clear();

						Reporter.log("Cleared all the field of Personal details page");
						LogFile.APPLICATION_LOGS.debug("Cleared all the field of Personal details page"
								+ PageNotFoundJobMatchNMatchedProfile.getText().trim());
					}
				}
			} catch (Exception e) {
				LogFile.APPLICATION_LOGS.error("There is no Section titles on my account dashboard page: ");
			}
			break;
		}
		}
		}
	public boolean viewCVAfterDownloaded() {
		boolean flag = false;
	    File dir = new File(MichaelpageConstants.DOWNLOAD_PATH);
	    File[] dir_contents = dir.listFiles();
	  	    
	    for (int i = 0; i < dir_contents.length; i++) {
	        if (dir_contents[i].getName().equals("CV_Kylie Minogue.dock"))
	            return flag=true;
	        System.out.println("Successfully downloaded CV after click on View CV option");
	            }

	    return flag;
	}
}