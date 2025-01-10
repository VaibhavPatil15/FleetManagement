package createUser;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.browserInitilizer;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

public class handleWait {
	public static final Logger logger = Logger.getLogger(handleWait.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils(reusableComponent.waiturl);
		logger.info("is using URL " + reusableComponent.waiturl);
	}

	@Test(priority = 1)
	public static void handleWaitSelenium() throws Exception {
		seleniumActions.click("//button[@id='btn1']");
		seleniumActions.implicitWait(6);
		seleniumActions.takescreeshot("button[@id='btn1']");
		seleniumActions.sendKeys("(//input[@id='txt1'])[1]", "Vaibhav");
	}

	@Test(priority = 2)
	public static void explicitWaitSelenium() throws Exception {
		seleniumActions.click("//button[@id='btn2']");
		seleniumActions.explicitWait(15, "(//input[@id='txt2'])[1]");
		seleniumActions.sendKeys("(//input[@id='txt2'])[1]", "Vaibhav");
	}

	// public static void name() {

	// }

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
