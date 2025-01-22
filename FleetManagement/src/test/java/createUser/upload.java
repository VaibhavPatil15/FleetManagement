package createUser;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.browserInitilizer;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

public class upload {


	public static final Logger logger = Logger.getLogger(handleWait.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils(reusableComponent.uploadUrl);
		logger.info("is using URL " + reusableComponent.uploadUrl);
	}

	@Test(priority = 1)
	public static void handleWaitSelenium() throws Exception {
		seleniumActions.uploadFile();
	}

	@AfterTest
	public static void pub() {
		browserInitilizer.driver.quit();
	}


}
