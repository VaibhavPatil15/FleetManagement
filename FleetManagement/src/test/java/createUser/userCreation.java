package createUser;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectPropertiesUtils.readORData;
import browser.browserInitilizer;
import excelUtils.readExcelData;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

@Listeners(ListnerUtils.eventListner.class)
public class userCreation {
	public static final Logger logger = Logger.getLogger(userCreation.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils(reusableComponent.url);
		logger.info("is  using URL " + reusableComponent.url);
	}

	@Test(priority = 1)
	public static void launchBrowser() throws Exception {

		seleniumActions.sendKeys(readORData.getORData("contactInformation.FirstName.input"),readExcelData.getExcelData(1, 0));

		seleniumActions.sendKeys(readORData.getORData("contactInformation.Phone.input"),readExcelData.getExcelData(1, 2));

		seleniumActions.takescreeshot("contactInformation.FirstName.input");
//		browserInitilizer.driver.findElement(By.xpath(readORData.getORData("contactInformation.FirstName.input")))
//				.sendKeys(readExcelData.getExcelData(1, 0)); // readExcelData.getExcelData(1, 0)
//		browserInitilizer.driver.findElement(By.xpath(readORData.getORData("contactInformation.Phone.input")))
//				.sendKeys(readExcelData.getExcelData(1, 2));
		seleniumActions.dropdown(readORData.getORData("MailingInformation.postalCode.selectTo"), "INDIA");
		Thread.sleep(2000);
		seleniumActions.click(readORData.getORData("submit.input")); // MailingInformation.postalCode.select
		Thread.sleep(2000);
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
