package com.michaelpage.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.common.utils.RandomDataUtil;
import com.michaelpage.common.utils.ReusableMethodTC;
import com.michaelpage.utils.LogFile;

public class MP_SIT_CC_Job_Details_Page extends ReusableMethodTC {
	static LoginTC login = new LoginTC();
	// CC Page- About us
	@FindBy(xpath = "//*[@class='heading']")
	public WebElement Aboutyoulabel;

	// CC Page- Country Error Mesage
	@FindBy(xpath = "//strong[@id='edit-country-error']")
	public WebElement countryerror;

	// CC Page- City Error Message
	@FindBy(xpath = "//strong[@id='edit-city-error']")
	public WebElement cityError;

	// CC Page- Nationality Error Message
	@FindBy(xpath = "//strong[@id='edit-nationality-1-error']")
	public WebElement nationalityError;

	// CC Page- If Known Error Message
	@FindBy(xpath = "//strong[@id='edit-availability-error']")
	public WebElement ifKnownError;

	// CC Page- location dropdown
	@FindBy(xpath = "//select[@id='edit-country']")
	public WebElement editCountryDropdown;

	// CC Page- Email Error
	@FindBy(xpath = "//strong[@id='edit-mp-user-mail-error']")
	public WebElement emailError;

	// CC Page- Firstname Error
	@FindBy(xpath = "//strong[@id='edit-mp-first-name-error']")
	public WebElement firstNameError;

	// CC Page- lastname Error
	@FindBy(xpath = "//strong[@id='edit-mp-last-name-error']")
	public WebElement lastNameError;

	// CC Page- Edit city
	@FindBy(xpath = "//input[@id='edit-city']")
	public WebElement editcityText;

	// CC Page- nationality
	@FindBy(xpath = "//select[@id='edit-nationality-1']")
	public WebElement nationalitydd;

	// CC page- Availablity field
	@FindBy(xpath = "//input[@id='edit-availability']")
	public WebElement availablityfield;

	// CC page- visaOption-Yes
	@FindBy(xpath = "//label[contains(text(),'Yes')]")
	public WebElement visaoptionYes;

	// CC page- visaOption-No
	@FindBy(xpath = "//label[contains(text(),'No')]")
	public WebElement visaoptionNo;

	// CC page- Your Role text
	@FindBy(xpath = "//*[@class='heading']")
	public WebElement YourRoleLabel;

	// CC page(2) - Working Visa text
	@FindBy(xpath = "//span[@class='fieldset-legend js-form-required form-required']")
	public WebElement WorkingVisatext;

	// CC page(2) - Country live in text
	@FindBy(xpath = "//label[contains(text(),'What country do you live in?')]")
	public WebElement Countrytext;

	// CC page(2) - City live in text
	@FindBy(xpath = "//label[contains(text(),'What city or town do you live in?')]")
	public WebElement Citytext;

	// CC page(2) - Nationality text
	@FindBy(xpath = "//label[contains(text(),'For which country do you hold nationality?')]")
	public WebElement Nationalitytext;

	// CC page(2) - Date text
	@FindBy(xpath = "//label[contains(text(),'If known, please let us know when you are available to start')]")
	public WebElement Datetext;

	// Your Role - Industry Level 1 text
	@FindBy(xpath = "//label[contains(text(),'Which industry best describes your current or most recent company?')]")
	public WebElement IndustryText;

	// Your Role - Sector level 1 text
	@FindBy(xpath = "//label[contains(text(),'Which sector do you work in?')]")
	public WebElement SectorText;

	// Your Role - Salary Frequency text
	@FindBy(xpath = "//label[contains(text(),'Salary frequency?')]")
	public WebElement SalaryText;

	// Your Role - Bonus text
	@FindBy(xpath = "//span[contains(text(),'What is your current salary including bonus and benefits?')]")
	public WebElement BonusText;

	// Your Role - Please Confirm text
	@FindBy(xpath = "//div[@class='options-label user-options-label']")
	public WebElement ConfirmText;

	// Your Role - Please Confirm text
	@FindBy(xpath = "//input[@id='edit-submit']")
	public WebElement ApplyNowbtn;

	// Your Role - Industry dropdown
	@FindBy(xpath = "//select[@id='edit-cc-industry-cc-industry-1']")
	public WebElement Industrydropdown;

	// Your Role - Sector dropdown
	@FindBy(xpath = "//select[@id='edit-cc-job-function-cc-job-function-1']")
	public WebElement Sectordropdown;

	// Your Role - Salary Frequency dropdown
	@FindBy(xpath = "//select[@id='edit-salary-frequency']")
	public WebElement Salarydropdown;

	// Your Role - Currency dropdown
	@FindBy(xpath = "//select[@id='edit-salary-container-currency']")
	public WebElement Currencydropdown;

	// Your Role - Amount field
	@FindBy(xpath = "//input[@id='edit-salary-container-salary']")
	public WebElement AmountEnter;

	// Your Role- SubIndustry
	@FindBy(xpath = "//select[@id='edit-cc-industry-cc-industry-2']")
	public WebElement subindustrydropdown;

	// Your Role- Sub-sector dropdown
	@FindBy(xpath = "//select[@id='edit-cc-job-function-cc-job-function-2']")
	public WebElement subsectordropdown;
	
	// Your Role- Agreeing Terms checkbox
	@FindBy(xpath = "//label[contains(text(),'By clicking you are agreeing to all the terms.')]")
	public WebElement AgreeTermschkBox;
	
	@FindBy(xpath = "//select[@id='edit-cc-industry-cc-industry-1']//option[@selected]")
    public WebElement IndustrydropdownSelectedOption;
	
	// Your Role- SubIndustry
    @FindBy(xpath = "//select[@id='edit-cc-industry-cc-industry-2']//option[@selected]")
    public WebElement subindustrySelectDropdown;
    
 // Your Role- Sub-sector dropdown
    @FindBy(xpath = "//select[@id='edit-cc-job-function-cc-job-function-2']//option[@selected]")
    public WebElement subsectorSelectdropdown;
	
	static String cityName = "Paries";
	static String amount = "100000";
	public MP_SIT_CC_Job_Details_Page() {
		PageFactory.initElements(driver, this);
	}

	public void launchPRSJobPageURL_ForFrenchJob() {
		login.navigateToPRSgeneralCVFormPageURL_FrenchJob();

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

	// Method for Verifying test
	public void verifyTextMessage(String webElementTitle) throws Exception {
		switch (webElementTitle.toUpperCase()) {
		case "YOUR ROLE": {
			ReusableMethodTC.elementToBeVisible(YourRoleLabel);
			ReusableMethodTC.isElementPresent(YourRoleLabel);
			ReusableMethodTC.highLighterMethod(driver, YourRoleLabel);
			Assert.assertTrue(YourRoleLabel.getText().contains("Your"));
			System.out.println("Verified that Customer Connect form is visible:: " + YourRoleLabel.getText().toString());
			Reporter.log("Verified that Customer Connect form is visible:: " + YourRoleLabel.getText().toString());
			LogFile.APPLICATION_LOGS
					.debug("Verified that Customer Connect form is visible:: " + YourRoleLabel.getText().toString());
			break;
		}

		case "ABOUT YOU": {
			ReusableMethodTC.elementToBeVisible(Aboutyoulabel);
			ReusableMethodTC.isElementPresent(Aboutyoulabel);
			ReusableMethodTC.highLighterMethod(driver, Aboutyoulabel);
			Assert.assertTrue(Aboutyoulabel.getText().contains("About"));
			System.out.println("Verified that Customer Connect form is visible:: " + Aboutyoulabel.getText().toString());
			Reporter.log("Verified that Customer Connect form is visible:: " + Aboutyoulabel.getText().toString());
			LogFile.APPLICATION_LOGS
					.debug("Verified that Customer Connect form is visible:: " + Aboutyoulabel.getText().toString());
			break;
		}

		case "DO YOU CURRENTLY HAVE A WORKING VISA FOR THE MIDDLE EAST": {
			ReusableMethodTC.elementToBeVisible(WorkingVisatext);
			ReusableMethodTC.highLighterMethod(driver, WorkingVisatext);
			ReusableMethodTC.verifyText("Do you currently have a working visa for the Middle East?",
					WorkingVisatext.getText());
			System.out.println("Verified that Working Visa additional question is displayed Successfully");
			Reporter.log("Verified that Working Visa additional question is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Working Visa additional question is displayed Successfully");

			break;
		}
		case "WHAT COUNTRY DO YOU LIVE IN": {
			ReusableMethodTC.elementToBeVisible(Countrytext);
			ReusableMethodTC.highLighterMethod(driver, Countrytext);
			ReusableMethodTC.verifyText("What country do you live in?", Countrytext.getText());
			System.out.println("Verified that Country additional question is displayed Successfully");
			Reporter.log("Verified that Country additional question is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Country additional question is displayed Successfully");
			break;
		}
		case "WHAT CITY OR TOWN DO YOU lIVE IN": {
			ReusableMethodTC.elementToBeVisible(Citytext);
			ReusableMethodTC.highLighterMethod(driver, Citytext);
			ReusableMethodTC.verifyText("What city or town do you live in?", Citytext.getText());
			System.out.println("Verified that City additional question is displayed Successfully");
			Reporter.log("Verified that City additional question is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that City additional question is displayed Successfully");
			break;
		}
		case "FOR WHICH COUNTRY DO YOU HOLD NATIONALITY": {
			ReusableMethodTC.elementToBeVisible(Nationalitytext);
			ReusableMethodTC.highLighterMethod(driver, Nationalitytext);
			ReusableMethodTC.verifyText("For which country do you hold nationality?", Nationalitytext.getText());
			System.out.println("Verified that Nationality additional question is displayed Successfully");
			Reporter.log("Verified that Nationality additional question is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Nationality additional question is displayed Successfully");
			break;
		}
		case "IF KNOWN, PLEASE LET US KNOW WHEN YOU ARE AVAILABLE TO START": {
			ReusableMethodTC.elementToBeVisible(Datetext);
			ReusableMethodTC.highLighterMethod(driver, Datetext);
			ReusableMethodTC.verifyText("If known, please let us know when you are available to start",
					Datetext.getText());
			System.out.println("Verified that Date additional question is displayed Successfully");
			Reporter.log("Verified that Date additional question is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Date additional question is displayed Successfully");
			break;
		}

		case "WHICH INDUSTRY BEST DESCRIBES YOUR CURRENT OR MOST RECENT COMPANY": {
			ReusableMethodTC.elementToBeVisible(IndustryText);
			ReusableMethodTC.highLighterMethod(driver, IndustryText);
			ReusableMethodTC.verifyText("Which industry best describes your current or most recent company?",
					IndustryText.getText());
			System.out.println("Verified that Industry text is displayed Successfully");
			Reporter.log("Verified that Industry text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Industry text is displayed Successfully");
			break;
		}
		case "WHICH SECTOR DO YOU WORK IN": {
			ReusableMethodTC.elementToBeVisible(SectorText);
			ReusableMethodTC.highLighterMethod(driver, SectorText);
			ReusableMethodTC.verifyText("Which sector do you work in?", SectorText.getText());
			System.out.println("Verified that Sector text is displayed Successfully");
			Reporter.log("Verified that Sector text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Sector text is displayed Successfully");
			break;
		}
		case "SALARY FREQUENCY": {
			ReusableMethodTC.elementToBeVisible(SalaryText);
			ReusableMethodTC.highLighterMethod(driver, SalaryText);
			ReusableMethodTC.verifyText("Salary frequency?", SalaryText.getText());
			System.out.println("Verified that Salary Frequency text is displayed Successfully");
			Reporter.log("Verified that Salary Frequency text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Salary Frequency text is displayed Successfully");
			break;
		}
		case "WHAT IS YOUR CURRENT SALARY INCLUDING BONUS AND BENEFITS?": {
			ReusableMethodTC.elementToBeVisible(BonusText);
			ReusableMethodTC.highLighterMethod(driver, BonusText);
			System.out.println("got text as  :   " + BonusText.getText());
			ReusableMethodTC.verifyText("What is your current salary including bonus and benefits?",
					BonusText.getText());
			System.out.println("Verified that Salary Bonus text is displayed Successfully");
			Reporter.log("Verified that Salary Bonus text is displayed Successfully");
			LogFile.APPLICATION_LOGS.debug("Verified that Salary Bonus text is displayed Successfully");
			break;
		}
		case "VISA OPTION": {
			ReusableMethodTC.elementToBeVisible(visaoptionYes);
			visaoptionYes.isSelected();
			ReusableMethodTC.highLighterMethod(driver, visaoptionYes);
			Reporter.log("Verified : Visa option is Displayed");
			LogFile.APPLICATION_LOGS.info("Verified : Visa option is Displayed");
			break;
		}
		case "HOME COUNTRY": {

			ReusableMethodTC.elementToBeVisible(editCountryDropdown);
			editCountryDropdown.isSelected();
			ReusableMethodTC.highLighterMethod(driver, editCountryDropdown);
			System.out.println("Verified : The Country is Displayed");
			Reporter.log("Verified : The Country is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The Country is Displayed");
			break;
		}
		case "CITY": {
			ReusableMethodTC.elementToBeVisible(editcityText);
			ReusableMethodTC.highLighterMethod(driver, editcityText);
			Reporter.log("Verified : The City Entered is : " + cityName.toString() + " is Displayed");
			LogFile.APPLICATION_LOGS.info("Verified : The City Entered is: " + cityName.toString() + " is Displayed");
			break;
		}
		case "NATIONALITY": {
			ReusableMethodTC.elementToBeVisible(nationalitydd);
			ReusableMethodTC.highLighterMethod(driver, nationalitydd);
			nationalitydd.isSelected();
			System.out.println("Verified : The nationality is Displayed");
			Reporter.log("Verified : The nationality is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The nationality is Displayed");
			break;
		}
		case "AVAILABLE DATE": {
			Thread.sleep(1000);
			if (nationalitydd.getText().equals(RandomDataUtil.getTodaysdate())) {
				ReusableMethodTC.highLighterMethod(driver, availablityfield);
				Thread.sleep(1000);
				Reporter.log("Verified : Date entered is  : " + RandomDataUtil.getTodaysdate() + " is Displayed");
				LogFile.APPLICATION_LOGS
						.info("Verified : Date entered is  : " + availablityfield.getText() + " is Displayed");
			} else {
				Reporter.log("Verified : Date field is blank");
				LogFile.APPLICATION_LOGS.info("Verified : Date field is blank");
			}
			break;
		}
		case "INDUSTRY": {
			ReusableMethodTC.elementToBeVisible(Industrydropdown);
			ReusableMethodTC.highLighterMethod(driver, Industrydropdown);
			Industrydropdown.isSelected();
			System.out.println("Verified : The industry selected is Displayed");
			Reporter.log("Verified : The industry selected is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The industry selected is Displayed");
			break;
		}
		case "SECTOR": {
			ReusableMethodTC.elementToBeVisible(Sectordropdown);
			ReusableMethodTC.highLighterMethod(driver, Sectordropdown);
			Sectordropdown.isSelected();
			System.out.println("Verified : The sector is Displayed");
			Reporter.log("Verified : The sector is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The sector is Displayed");
			break;
		}
		case "SALARY FREQUENCY FIELD": {
			ReusableMethodTC.elementToBeVisible(Salarydropdown);
			ReusableMethodTC.highLighterMethod(driver, Salarydropdown);
			Salarydropdown.isSelected();
			System.out.println("Verified : The salary frequency is Displayed");
			Reporter.log("Verified : The salary frequency selected is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The salary frequency selected is Displayed");
			break;
		}

		case "CURRENCY": {
			ReusableMethodTC.elementToBeVisible(Currencydropdown);
			ReusableMethodTC.highLighterMethod(driver, Currencydropdown);
			Currencydropdown.isSelected();
			System.out.println("Verified : The currency is Displayed");
			Reporter.log("Verified : The currency selected is Displayed");
			LogFile.APPLICATION_LOGS.debug("Verified : The currency selected is Displayed");
			break;
		}
		case "AMOUNT": {

			ReusableMethodTC.elementToBeVisible(AmountEnter);
			ReusableMethodTC.highLighterMethod(driver, AmountEnter);
			Reporter.log("Verified : The Amount Entered : "+amount.toString()+" is Displayed");
			LogFile.APPLICATION_LOGS.info("Verified : The Amount Entered :"+amount.toString()+" is Displayed");
			break;
		}
		case "COUNTRY NAME": {
			ReusableMethodTC.elementToBeVisible(editCountryDropdown);
			ReusableMethodTC.highLighterMethod(driver, editCountryDropdown);
			ReusableMethodTC.verifyText("FR", editCountryDropdown.getAttribute("value"));
			System.out.println("Country name prepopulated:"+editCountryDropdown.getAttribute("value"));
			System.out.println("Verified Pre populated data in COUNTRY Name field");
			Reporter.log("Verified: Pre populated data in COUNTRY Name field");
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in COUNTRY Name displayed Successfully");
			break;
		}
		case "CITY NAME": {
			ReusableMethodTC.elementToBeVisible(editcityText);
			ReusableMethodTC.highLighterMethod(driver, editcityText);
			System.out.println("City name prepopulated:"+cityName.toString());		
			Reporter.log("Verified: City name pre populated data in CITY Name field:"+cityName.toString()+ "is displayed");
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in CITY Name displayed Successfully");
			break;
		}
		case "NATIONALITY NAME": {
			ReusableMethodTC.elementToBeVisible(nationalitydd);
			ReusableMethodTC.highLighterMethod(driver, nationalitydd);
			System.out.println("Nationality name prepopulated:"+nationalitydd.getAttribute("value"));
			ReusableMethodTC.verifyText("FR", nationalitydd.getAttribute("value"));
			System.out.println("Verified Pre populated data in Nationality  field");
			Reporter.log("Verified: Pre populated data in Nationality field");
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Nationality field displayed Successfully");
			break;
		}
		case "INDUSTRY NAME": {
			ReusableMethodTC.elementToBeVisible(Industrydropdown);
			ReusableMethodTC.highLighterMethod(driver, Industrydropdown);
		    System.out.println("Industry name prepopulated:" + IndustrydropdownSelectedOption.getText().trim());
		    ReusableMethodTC.verifyText("Educations", IndustrydropdownSelectedOption.getText().trim());
			System.out.println("Verified Pre populated data in Industry field");
			Reporter.log("Verified: Pre populated data in Industry field");
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Industry field displayed Successfully");
			break;
		}
		case "SUBINDUSTRY NAME": {
			ReusableMethodTC.elementToBeVisible(subindustrydropdown);
			ReusableMethodTC.highLighterMethod(driver, subindustrydropdown);
			System.out.println("SubIndustry name prepopulated:" + subindustrySelectDropdown.getText().trim());
            ReusableMethodTC.verifyText("IT", subindustrySelectDropdown.getText().trim());	
			System.out.println("Verified Pre populated data in SubIndustry field");
			Reporter.log("Verified: Pre populated data in SubIndustry field");
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in SubIndustry field displayed Successfully");
			break;
		}
		case "SECTOR NAME": {
			ReusableMethodTC.elementToBeVisible(Sectordropdown);
			ReusableMethodTC.highLighterMethod(driver, Sectordropdown);
			System.out.println("Sector name prepopulated:" + subsectorSelectdropdown.getText().trim());
            ReusableMethodTC.verifyText("Softwares", subsectorSelectdropdown.getText().trim());	
			Reporter.log("Verified: Pre populated data in Sector field");
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Sector field displayed Successfully");
			break;
		}
		case "SALARY": {
			ReusableMethodTC.elementToBeVisible(Salarydropdown);
			ReusableMethodTC.highLighterMethod(driver, Salarydropdown);
			System.out.println("Salary name prepopulated:"+Salarydropdown.getAttribute("value"));
			ReusableMethodTC.verifyText("Yearly", Salarydropdown.getAttribute("value"));
			System.out.println("Verified Pre populated data in Salary field");
			Reporter.log("Verified: Pre populated data in Salary field");
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Salary field displayed Successfully");
			break;
		}
		case "CURRENCY NAME": {
			ReusableMethodTC.elementToBeVisible(Currencydropdown);
			ReusableMethodTC.highLighterMethod(driver, Currencydropdown);
			System.out.println("Currency name prepopulated:"+Currencydropdown.getAttribute("value"));
			ReusableMethodTC.verifyText("AED", Currencydropdown.getAttribute("value"));
			System.out.println("Verified Pre populated data in Currency field");
			Reporter.log("Verified: Pre populated data in Currency field");
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Currency field displayed Successfully");
			break;
		}
		case "PACKAGE": {
			ReusableMethodTC.elementToBeVisible(AmountEnter);
			ReusableMethodTC.highLighterMethod(driver, AmountEnter);
			System.out.println("Amount enter prepopulated:"+AmountEnter.getAttribute("value"));
			ReusableMethodTC.verifyText("100000", AmountEnter.getAttribute("value"));
			System.out.println("Verified Pre populated data in Amount field");
			Reporter.log("Verified: Pre populated data in Amount field");
			LogFile.APPLICATION_LOGS.debug("Verified Pre populated data in Amount field displayed Successfully");
			break;
		}
		}
	}

	public void SelectDropdownValue(String webElementTitle) throws Exception {
		switch (webElementTitle.toUpperCase()) {
		case "HOME COUNTRY": {
			ReusableMethodTC.elementToBeVisible(editCountryDropdown);
			ReusableMethodTC.highLighterMethod(driver, editCountryDropdown);
			// ReusableMethodTC.selectByIndex(editCountryDropdown, 3);
			ReusableMethodTC.selectByVisibleText(editCountryDropdown, "France");
			System.out.println("Verified : The country selected is  : " + "France");
			Reporter.log("Verified : The country selected is  : " + "France");
			LogFile.APPLICATION_LOGS.debug("Verified : The country selected is  : " + "France");
			break;
		}

		case "NATIONALITY": {
			ReusableMethodTC.elementToBeVisible(nationalitydd);
			ReusableMethodTC.highLighterMethod(driver, nationalitydd);
			ReusableMethodTC.selectByVisibleText(nationalitydd, "France");
			System.out.println("Verified : The nationality selected is  : " + "France");
			Reporter.log("Verified : The nationality selected is  : " + "France");
			LogFile.APPLICATION_LOGS.debug("Verified : The nationality selected is  : " + "France");
			break;
		}

		case "INDUSTRY": {
			ReusableMethodTC.elementToBeVisible(Industrydropdown);
			ReusableMethodTC.highLighterMethod(driver, Industrydropdown);
			ReusableMethodTC.selectByVisibleText(Industrydropdown, "Educations");
			System.out.println("Verified : The industry selected is  : " + "Educations");
			Reporter.log("Verified : The industry selected is  : " + "Educations");
			LogFile.APPLICATION_LOGS.debug("Verified : The industry selected is  : " + "Educations");
			break;
		}

		case "SUBINDUSTRY": {
			ReusableMethodTC.elementToBeVisible(subindustrydropdown);
			ReusableMethodTC.highLighterMethod(driver, subindustrydropdown);
			ReusableMethodTC.selectByVisibleText(subindustrydropdown, "IT");
			System.out.println("Verified : The Sub industry selected is  : " + "IT");
			Reporter.log("Verified : The Sub industry selected is  : " + "IT");
			LogFile.APPLICATION_LOGS.debug("Verified : The Sub industry selected is  : " + "IT");
			break;
		}

		case "SECTOR": {
			ReusableMethodTC.elementToBeVisible(Sectordropdown);
			ReusableMethodTC.highLighterMethod(driver, Sectordropdown);
			ReusableMethodTC.selectByVisibleText(Sectordropdown, "IT");
			System.out.println("Verified : The sector selected is  : " + "IT");
			Reporter.log("Verified : The sector selected is  : " + "IT");
			LogFile.APPLICATION_LOGS.debug("Verified : The sector selected is  : " + "IT");
			break;
		}

		case "SUBSECTOR": {
			Thread.sleep(3000);
			ReusableMethodTC.elementToBeVisible(subsectordropdown);
			ReusableMethodTC.highLighterMethod(driver, subsectordropdown);
			ReusableMethodTC.selectByVisibleText(subsectordropdown, "Softwares");
			System.out.println("Verified : The Sub sector selected is  : " + "Softwares");
			Reporter.log("Verified : The Sub sector selected is  : " + "Softwares");
			LogFile.APPLICATION_LOGS.debug("Verified : The Sub sector selected is  : " + "Softwares");
			break;
		}

		case "SALARY FREQUENCY": {
			ReusableMethodTC.elementToBeVisible(Salarydropdown);
			ReusableMethodTC.highLighterMethod(driver, Salarydropdown);
			ReusableMethodTC.selectByVisibleText(Salarydropdown, "Yearly");
			System.out.println("Verified : The salary frequency selected is  : " + "Yearly");
			Reporter.log("Verified : The salary frequency selected is  : " + "Yearly");
			LogFile.APPLICATION_LOGS.debug("Verified : The salary frequency selected is  : " + "Yearly");
			break;
		}

		case "CURRENCY": {
			ReusableMethodTC.elementToBeVisible(Currencydropdown);
			ReusableMethodTC.highLighterMethod(driver, Currencydropdown);
			ReusableMethodTC.selectByVisibleText(Currencydropdown, "AED");
			System.out.println("Verified : The currency selected is  : " + "AED");
			Reporter.log("Verified : The currency selected is  : " + "AED");
			LogFile.APPLICATION_LOGS.debug("Verified : The currency selected is  : " + "AED");
			break;
		}
		}
	}

	public void enterRandomText(String webElementTitle) {

		switch (webElementTitle.toUpperCase()) {
		case "CITY": {
			ReusableMethodTC.highLighterMethod(driver, editcityText);
			ReusableMethodTC.sendKeys(editcityText, cityName);
			ReusableMethodTC.sendKeys(editcityText, Keys.TAB);
			Reporter.log("Verified : The City Entered is  : "+cityName.toString());
			LogFile.APPLICATION_LOGS.info("Verified : The City Entered is  :"+ cityName);
			break;
		}

		case "AVAILABLE DATE": {
			ReusableMethodTC.highLighterMethod(driver, availablityfield);
			ReusableMethodTC.sendKeys(availablityfield, RandomDataUtil.getTodaysdate());
			ReusableMethodTC.sendKeys(editcityText, Keys.TAB);
			Reporter.log("Verified : Available Date is  : RandomDataUtil.getTodaysdate()");
			LogFile.APPLICATION_LOGS.info("Verified : Available Date is  : RandomDataUtil.getTodaysdate()");
			break;
		}

		case "AMOUNT": {
			ReusableMethodTC.highLighterMethod(driver, AmountEnter);
			ReusableMethodTC.sendKeys(AmountEnter, amount);
			Reporter.log("Verified : The Amount Entered is  :"+ amount.toString());
			LogFile.APPLICATION_LOGS.info("Verified : The Amount Entered is  :"+ amount);
			break;
		}
		}
	}

	public void clickOnElement(String webElementTitle) throws IOException, InterruptedException {

		switch (webElementTitle.toUpperCase()) {
		case "VISA OPTION": {
			ReusableMethodTC.highLighterMethod(driver, visaoptionYes);
			ReusableMethodTC.click(visaoptionYes);
			Reporter.log("Selected the visa option as Yes");
			LogFile.APPLICATION_LOGS.info("Selected the visa option as Yes");
			break;
		}

		case "APPLY NOW": {
			ReusableMethodTC.highLighterMethod(driver, ApplyNowbtn);
			ReusableMethodTC.click(ApplyNowbtn);
			Reporter.log("I clicked on 'Apply Now' Button");
			LogFile.APPLICATION_LOGS.info("I clicked on 'Apply Now' Button");
			break;
		}
		
		case "AGREE ALL TERMS": {
			ReusableMethodTC.highLighterMethod(driver, AgreeTermschkBox);
			ReusableMethodTC.click(AgreeTermschkBox);
			Reporter.log("I clicked on Agreeing all the terms checkbox");
			LogFile.APPLICATION_LOGS.info("I clicked on Agreeing all the terms checkbox");
			break;
		}
		}
	}
}