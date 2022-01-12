package com.michaelpage.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_MyPage extends ReusableMethodTC {

	// Homepage Saved Jobs tab
	@FindBy(xpath = "//h3[normalize-space(text()) = 'Saved Jobs']/parent::div/parent::div/parent::a")
	public WebElement SavedJobsTab;

	// Homepage Applied Jobs
	@FindBy(xpath = "//h3[normalize-space(text()) = 'Applied jobs']/parent::div/parent::div/parent::a")
	public WebElement AppliedJobsTab;

	// Homepage Search&Alerts Jobs
	@FindBy(xpath = "//h3[normalize-space(text()) = 'Searches & Alerts']/parent::div/parent::div/parent::a")
	public WebElement SearchAlertsTab;

	// Homepage Personal Details Jobs
	@FindBy(xpath = "//h3[normalize-space(text()) = 'Personal details']/parent::div/parent::div/parent::a")
	public WebElement PersonalDetailsTab;

	// Homepage Your CV Jobs
	@FindBy(xpath = "//h3[normalize-space(text()) = 'Your CV']/parent::div/parent::div/parent::a")
	public WebElement YourCVTab;

	// Homepage Your CV Jobs
	@FindBy(xpath = "//h3[normalize-space(text()) = 'Login & Security']/parent::div/parent::div/parent::a")
	public WebElement LoginSecurityTab;

	// Title of page
	@FindBy(xpath = "//div[@id='block-mp-theme-page-title']/h1")
	public WebElement pageTitle;

	// Homepage Saved Jobs tab
	@FindBy(xpath = "//div[@class='back-to-mydashboard']/a/span")
	public WebElement MyAccountTab;

	// HomePage - My AccountTab
	@FindBy(xpath = "//*[@id='block-headerblock']/div/div[3]//a//span[@class='text']")
	public WebElement myAccountTab;

	// HomePage- dashboard
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	public WebElement myDashboardButton;

	// Homepage- moreoptionicon
	@FindBy(xpath = "(//div[@class='views-row']/div/span/i)[1]")
	public WebElement MoreOptionIcon;

	public MP_SIT_MyPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnElement(String webElementTitle) throws Exception {

		switch (webElementTitle.toUpperCase()) {
		case "SAVED JOBS": {
			ReusableMethodTC.elementToBeVisible(SavedJobsTab);
			ReusableMethodTC.highLighterMethod(driver, SavedJobsTab);
			ReusableMethodTC.click(SavedJobsTab);
			Reporter.log("Clicked on 'Saved Jobs' Tab");
			LogFile.APPLICATION_LOGS.info("Clicked on Saved Jobs Button");
			break;
		}
		case "APPLIED JOBS": {
			ReusableMethodTC.elementToBeVisible(AppliedJobsTab);
			ReusableMethodTC.highLighterMethod(driver, AppliedJobsTab);
			ReusableMethodTC.click(AppliedJobsTab);
			Reporter.log("Clicked on 'Applied Jobs' Tab");
			LogFile.APPLICATION_LOGS.info("Clicked on Applied Jobs Button");
			break;
		}
		case "SEARCH AND ALERTS": {
			ReusableMethodTC.elementToBeVisible(SearchAlertsTab);
			ReusableMethodTC.highLighterMethod(driver, SearchAlertsTab);
			ReusableMethodTC.click(SearchAlertsTab);
			Reporter.log("Clicked on 'Search And Alerts' Button");
			LogFile.APPLICATION_LOGS.info("Clicked on Search and Alerts Button");
			break;
		}
		case "PERSONAL DETAILS": {
			ReusableMethodTC.elementToBeVisible(PersonalDetailsTab);
			ReusableMethodTC.highLighterMethod(driver, SearchAlertsTab);
			ReusableMethodTC.click(SearchAlertsTab);
			Reporter.log("Clicked on 'Personal Details' Button");
			LogFile.APPLICATION_LOGS.info("Clicked on Personal Details Button");
			break;
		}
		case "YOUR CV": {
			ReusableMethodTC.elementToBeVisible(YourCVTab);
			ReusableMethodTC.highLighterMethod(driver, YourCVTab);
			ReusableMethodTC.click(YourCVTab);
			Reporter.log("Clicked on 'Your CV' Button");
			LogFile.APPLICATION_LOGS.info("Clicked on Your CV Button");
			break;
		}
		case "LOGIN AND SECURITY": {
			ReusableMethodTC.elementToBeVisible(LoginSecurityTab);
			ReusableMethodTC.highLighterMethod(driver, LoginSecurityTab);
			ReusableMethodTC.click(LoginSecurityTab);
			Reporter.log("Clicked on 'Login And Security' Tab");
			LogFile.APPLICATION_LOGS.info("Clicked on Login And Security Button");
			break;
		}
		case "MY ACCOUNT": {
			ReusableMethodTC.elementToBeVisible(MyAccountTab);
			ReusableMethodTC.highLighterMethod(driver, MyAccountTab);
			ReusableMethodTC.click(MyAccountTab);
			Reporter.log("Clicked on 'My Account' Tab");
			LogFile.APPLICATION_LOGS.info("Clicked on My Account Button");
			break;
		}

		case "VIEW JOB": {
			int Jobcount = JobCount();
			if (Jobcount > 0) {
				WebElement ViewJobButton = driver
						.findElement(By.xpath("(//div[@class='views-row']/div/div/a[contains(text(),'View Job')])[1]"));
				ReusableMethodTC.elementToBeVisible(ViewJobButton);
				ReusableMethodTC.highLighterMethod(driver, ViewJobButton);
				ReusableMethodTC.click(ViewJobButton);
				Reporter.log("Clicked on 'View Job' Button");
				LogFile.APPLICATION_LOGS.info("Clicked on View Job Button");
			} else {
				Reporter.log("No Jobs are Applied");
				LogFile.APPLICATION_LOGS.info("No Jobs are Applied");
			}

			break;
		}

		case "VIEW SIMILAR JOBS": {
			int Jobcount = JobCount();
			if (Jobcount > 0) {
				WebElement MoreOption = driver.findElement(By.xpath("(//div[@class='views-row']/div/span/i)[1]"));
				ReusableMethodTC.elementToBeVisible(MoreOption);
				ReusableMethodTC.highLighterMethod(driver, MoreOption);
				ReusableMethodTC.click(MoreOption);
				WebElement viewSimilarJobs = driver.findElement(By.xpath("(//div[@class='views-row']/div/div[@class='saved-job-option-wrapper applied-jobs-options']/span/a)[1]"));
				ReusableMethodTC.elementToBeVisible(viewSimilarJobs);
				ReusableMethodTC.highLighterMethod(driver, viewSimilarJobs);
				ReusableMethodTC.click(viewSimilarJobs);
				Reporter.log("Clicked on 'View Similar Jobs' Button");
				LogFile.APPLICATION_LOGS.info("Clicked on View Similar Jobs Button");
			} else {
				Reporter.log("No Jobs are Applied");
				LogFile.APPLICATION_LOGS.info("No Jobs are Applied");
			}
			break;
		}
		}
	}

	public void verifyTextMessage(String webElementTitle) throws Throwable {

		switch (webElementTitle.toUpperCase()) {
		case "SAVED JOBS": {
			ReusableMethodTC.elementToBeVisible(pageTitle);
			ReusableMethodTC.highLighterMethod(driver, pageTitle);
			ReusableMethodTC.verifyText("Saved Jobs", pageTitle.getText());
			System.out.println("Verified :  " + pageTitle.getText() + " text is displayed Successfully");
			Reporter.log("Verified : " + pageTitle.getText() + " text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Saved Jobs text displayed Successfully");
			break;
		}
		case "APPLIED JOBS": {
			ReusableMethodTC.elementToBeVisible(pageTitle);
			ReusableMethodTC.highLighterMethod(driver, pageTitle);
			ReusableMethodTC.verifyText("Applied Jobs", pageTitle.getText());
			System.out.println("Verified :  " + pageTitle.getText() + " text is displayed Successfully");
			Reporter.log("Verified : " + pageTitle.getText() + " text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Applied Jobs text displayed Successfully");
			break;
		}
		case "SEARCH AND ALERTS": {
			ReusableMethodTC.elementToBeVisible(pageTitle);
			ReusableMethodTC.highLighterMethod(driver, pageTitle);
			ReusableMethodTC.verifyText("Searches & Alerts", pageTitle.getText());
			System.out.println("Verified :  " + pageTitle.getText() + " text is displayed Successfully");
			Reporter.log("Verified : " + pageTitle.getText() + " text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Searches & Alerts text displayed Successfully");
			break;
		}
		case "PERSONAL DETAILS": {
			ReusableMethodTC.elementToBeVisible(pageTitle);
			ReusableMethodTC.highLighterMethod(driver, pageTitle);
			ReusableMethodTC.verifyText("Personal Details", pageTitle.getText());
			System.out.println("Verified :  " + pageTitle.getText() + " text is displayed Successfully");
			Reporter.log("Verified : " + pageTitle.getText() + " text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Searches & Alerts text displayed Successfully");
			break;
		}
		case "YOUR CV": {
			ReusableMethodTC.elementToBeVisible(pageTitle);
			ReusableMethodTC.highLighterMethod(driver, pageTitle);
			ReusableMethodTC.verifyText("Your CV", pageTitle.getText());
			System.out.println("Verified :  " + pageTitle.getText() + " text is displayed Successfully");
			Reporter.log("Verified : " + pageTitle.getText() + " text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Your CV text displayed Successfully");
			break;
		}
		case "ACCOUNT SETTINGS": {
			ReusableMethodTC.elementToBeVisible(pageTitle);
			ReusableMethodTC.highLighterMethod(driver, pageTitle);
			ReusableMethodTC.verifyText("Account Settings", pageTitle.getText());
			System.out.println("Verified :  " + pageTitle.getText() + " text is displayed Successfully");
			Reporter.log("Verified : " + pageTitle.getText() + " text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified : Account Settings text displayed Successfully");
			break;
		}
		}
	}

	public int JobCount() {
		List<WebElement> lsJobCount = driver.findElements(By.xpath("//div[@class='views-row']"));
		return lsJobCount.size();
	}

	public void Dashboard() {
		if (myAccountTab.isDisplayed() == true) {
			System.out.println("myAccountTab isDisplayed::" + myAccountTab.isDisplayed());
			ReusableMethodTC.elementToBeVisible(myAccountTab);
			ReusableMethodTC.highLighterMethod(driver, myAccountTab);
			clickUsingJavaScript(myAccountTab);
		}
		ReusableMethodTC.elementToBeVisible(myDashboardButton);
		ReusableMethodTC.highLighterMethod(driver, myDashboardButton);
		ReusableMethodTC.click(myDashboardButton);

		System.out.println("Navigated to Dashboard Successfully ");
		Reporter.log(" Navigated to Dashboard Successfully ");

	}
}
