package createUser;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import browser.browserInitilizer;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

@Listeners(ListnerUtils.eventListner.class)
public class handleWindow {

	public static final Logger logger = Logger.getLogger(handleWait.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils(reusableComponent.multiWindows);
		logger.info("is using URL " + reusableComponent.multiWindows);
	}

	@Test(priority = 1)
	public static void hanler() {
		String parent = browserInitilizer.driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor) browserInitilizer.driver;
		js.executeScript("scrollby(0,150)", null);
		seleniumActions.click("//button[@id='windowButton']");
		Set<String> all = browserInitilizer.driver.getWindowHandles();
	}

	@AfterTest
	public static void pub() {
		browserInitilizer.driver.quit();
	}

}
