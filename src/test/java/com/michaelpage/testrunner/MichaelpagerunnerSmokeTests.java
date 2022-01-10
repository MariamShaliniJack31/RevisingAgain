package com.michaelpage.testrunner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.michaelpage.common.utils.LoginTC;
import com.michaelpage.common.utils.TestBase;
import com.michaelpage.utils.LogFile;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = { "src/test/resources/features/" }, glue = {
		"com.michaelpage.stepdefinitions" }, monochrome = true, dryRun = false, tags = {
				"@SmokeTestAnonymous,@SmokeTestAuthenticate" })

public class MichaelpagerunnerSmokeTests extends TestBase {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeSuite
	public void initialize() {

		try {

			PropertyConfigurator
					.configure(System.getProperty("user.dir") + "//src//main//resources//Logs/log4j.properties");
			Logger.getRootLogger().setLevel(Level.ALL);

			LogFile.APPLICATION_LOGS.debug("Starting the Michael Page Regression suite");

		} catch (Throwable t) {
			t.printStackTrace();
			System.out.println("Unable to initialize the log file");
			LogFile.APPLICATION_LOGS.error("Error in initialize the Log file");
		}
	}

	@BeforeTest
	public void testSetUp() {
		LoginTC.getLoginTCObject();
	}

	@BeforeClass(alwaysRun = true)
	public void classSetUp() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

	}

	@Test(groups = "cucumber", description = "Run Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		LoginTC.CallBrowser();
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void classTearDown() throws Exception {
		testNGCucumberRunner.finish();
	}

	@AfterTest
	public void closeBrowser() {
		TestBase.tearDown();
	}

}