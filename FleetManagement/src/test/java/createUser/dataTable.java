package createUser;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.browserInitilizer;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

public class dataTable {

	private static final Logger logger = Logger.getLogger(userCreation.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils(reusableComponent.dataurl);
		logger.info("is using URL " + reusableComponent.dataurl);
	}

	@Test(priority = 1)
	public static void handleTableData() {
		seleniumActions.fetchdatafromDataTable();
	}

	@AfterTest
	public static void pub() {
		browserInitilizer.driver.quit();

	}

}
