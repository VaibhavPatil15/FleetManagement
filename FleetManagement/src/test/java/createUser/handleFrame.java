package createUser;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectPropertiesUtils.readORData;
import browser.browserInitilizer;
import excelUtils.readExcelData;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

public class handleFrame {

	public static final Logger logger = Logger.getLogger(handleFrame.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils(reusableComponent.url);
		logger.info("is using URL " + reusableComponent.url);
	}

	@Test(priority = 1)
	public static void launchBrowser() throws Exception {

	}

	@AfterTest
	public static void pub() {
		browserInitilizer.driver.quit();
	}

}
