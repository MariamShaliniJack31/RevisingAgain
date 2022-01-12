package com.michaelpage.common.utils;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TimeoutException;
import org.testng.Reporter;
import com.michaelpage.utils.LogFile;

public class LoginTC extends TestBase implements Cloneable {

	private static LoginTC object = null;
	String url = Dto.getURl();
	String siturl = Dto.getSITURl();
	String similarJobURl = Dto.getsimilarJobURl();
	String jobDetailPageUrl = Dto.getJobDetailsPageURl();
	String inactiveJobURL = Dto.getinactiveJobURL();
	String notCAJobURL = Dto.getnotCAJobURL();
	String jobCCDetailPageUrl = Dto.getJobCCDetailPageUrl();
	String frenchJobUrl = Dto.getfrenchJobUrl();
	String webFormUrl = Dto.getWebFormUrl();
	String homePageUrl = Dto.gethomePageUrl();
	String clientprofileURL = Dto.getclientProfileURL();
	String logoJOBDetailsURL = Dto.getlogoJobDetailURL();
	String prscvformpagefrenchjobURL = Dto.getPrscvformpageForFrenchJobURL();
	String prscvformpageURl = Dto.getPRSgeneralcvpageURl();
	String gmailLoginURL = Dto.getGmailURL();

	public static synchronized LoginTC getLoginTCObject() {
		if (object == null) {
			synchronized (LoginTC.class) {
				if (object == null) {
					object = new LoginTC();
				}
			}
		}
		return object;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	// Call browser
	public static void CallBrowser() {
		try {
			BrowserCallingTC bc = new BrowserCallingTC();
			bc.browserSelection();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void navigateToURL() {
		try {

			driver.get(url);
			Reporter.log("Launched Application");
			LogFile.APPLICATION_LOGS.info("Launched Application");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToJobDetailsPageURL() {
		try {
			driver.navigate().to(jobDetailPageUrl);
			Reporter.log("Launched Job details Page");
			LogFile.APPLICATION_LOGS.info("Launched Job details Page");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void navigateToSITURL() {
		try {
			if (Dto.getWebDriverObj().equalsIgnoreCase("Edge")) {
				Robot robot = new Robot();
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				try {
					driver.get(url);
				} catch (TimeoutException e) {
					robot.keyPress(KeyEvent.VK_ENTER);
					Thread.sleep(2000);
				} finally {
					robot.keyPress(KeyEvent.VK_ENTER);
					Thread.sleep(2000);
				}

			} else {
				driver.get(siturl);
			}

			Reporter.log("Launched SIT Application");
			LogFile.APPLICATION_LOGS.info("Launched SIT Application");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateTosimilarJobURl() {
		try {
			driver.get(similarJobURl);
			Reporter.log("Launched Similar Job Page");
			LogFile.APPLICATION_LOGS.info("Launched Similar Job Page");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToinactiveJobURL() {
		try {
			driver.get(inactiveJobURL);
			Reporter.log("Launched Inactive Job Page");
			LogFile.APPLICATION_LOGS.info("Launched Inactive Job Page");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateTonotCAJobURL() {
		try {
			driver.get(notCAJobURL);
			Reporter.log("Launched Not Client Auth Job Page");
			LogFile.APPLICATION_LOGS.info("Launched Not Client Auth Job Page");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToCCJobDetailsPageURL() {
		try {
			driver.navigate().to(jobCCDetailPageUrl);
			Reporter.log("Launched Job details Page");
			LogFile.APPLICATION_LOGS.info("Launched Job details Page");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToFrenchJobURL() {
		try {
			driver.get(frenchJobUrl);
			Reporter.log("Launched SIT Application for french job");
			LogFile.APPLICATION_LOGS.info("Launched SIT Application for french job");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToWebFormURL() {
		try {
			driver.get(webFormUrl);
			Thread.sleep(2000);
			Reporter.log("Launched SIT WebForm");
			LogFile.APPLICATION_LOGS.info("Launched SIT WebForm");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToPRSgeneralCVFormPageURL_FrenchJob() {
		try {
			driver.navigate().to(prscvformpagefrenchjobURL);
			Reporter.log("Launched PRS general cv form page URL for French Job");
			LogFile.APPLICATION_LOGS.info("Navigate PRS general cv form page for French Language");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToPRSgeneralCVFormPageURL() {
		try {
			driver.navigate().to(prscvformpageURl);
			Reporter.log("Launched PRS general cv form URL");
			LogFile.APPLICATION_LOGS.info("Navigate PRS general cv form URL");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateTohomePageUrl() {
		try {
			driver.get(homePageUrl);
			Reporter.log("Launched SIT Home Page");
			LogFile.APPLICATION_LOGS.info("Launched SIT HomePage");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToClientProfileUrl() {
		try {
			driver.get(clientprofileURL);
			Reporter.log("Launched Client Profile Page");
			LogFile.APPLICATION_LOGS.info("Launched Client Profile Page");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateTologoJOBDetailsURL() {
		try {
			driver.get(logoJOBDetailsURL);
			Reporter.log("Launched JOb Details Page with Logo");
			LogFile.APPLICATION_LOGS.info("Launched JOb Details Page with Logo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void navigateGmailSignInURL() {
		try {
			driver.get(gmailLoginURL);
			Reporter.log("Launched SIT MyAccount Page");
			LogFile.APPLICATION_LOGS.info("Launched SIT MyAccount Page");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
