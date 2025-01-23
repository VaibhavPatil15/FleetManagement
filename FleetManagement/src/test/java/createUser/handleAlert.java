package createUser;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.browserInitilizer;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

public class handleAlert {

	private static final Logger logger = Logger.getLogger(userCreation.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils(reusableComponent.alertUrl);
		logger.info("is using URL " + reusableComponent.alertUrl);
	}

	@Test(priority = 1)
	public static void alertActions() throws InterruptedException{
		seleniumActions.click("//input[@type='submit']");
		Thread.sleep(2000);
		String msg=seleniumActions.alertAction(true);
		seleniumActions.explicitWait(0, "");
		logger.info(msg);
	}

	/*
	 * @Test(priority = 2,dependsOnMethods = "launchBrowser") public static void
	 * launcBrowser() throws Exception {
	 * 
	 * browserInitilizer.driver.findElement(By.xpath(readORData.getORData(
	 * "contactInformation.FirstName.input")))
	 * .sendKeys(readExcelData.getExcelData(1, 0)); // readExcelData.getExcelData(1,
	 * 0) browserInitilizer.driver.findElement(By.xpath(readORData.getORData(
	 * "contactInformation.Phone.input"))) .sendKeys(readExcelData.getExcelData(1,
	 * 2)); }
	 */
	@AfterTest
	public static void pub() {
		browserInitilizer.driver.quit();

	}

}
