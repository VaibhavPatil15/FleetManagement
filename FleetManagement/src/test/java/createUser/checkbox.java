package createUser;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.browserInitilizer;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

public class checkbox {

	public static final Logger logger = Logger.getLogger(handleWait.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils(reusableComponent.check);
		logger.info("is using URL " + reusableComponent.check);
	}

	@Test(priority = 1)
	public static void checkBox() throws InterruptedException {
		Thread.sleep(2000);
		seleniumActions.chkBox(1);
		seleniumActions.chkBox(2);
		Thread.sleep(2000);
	}

	@AfterTest
	public static void pub() {
		browserInitilizer.driver.quit();
	}

}
