package createUser;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import browser.browserInitilizer;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

@Listeners(ListnerUtils.eventListner.class)
public class calenderHandle {

	public static final Logger logger = Logger.getLogger(handleWait.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils(reusableComponent.calender);
		logger.info("is using URL " + reusableComponent.calender);
	}

	@Test(priority = 1)
	public static void hanler() throws InterruptedException {
		Thread.sleep(2000);
		seleniumActions.sendKeys("//input[@type='datetime-local']", "12/12/1999");
		browserInitilizer.driver.findElement(By.xpath("//input[@type='datetime-local']")).sendKeys(Keys.TAB);
		seleniumActions.sendKeys("//input[@type='datetime-local']", "14:42");
	}

	@AfterTest
	public static void pub() {
		browserInitilizer.driver.quit();
	}

}

//
//readDriver.driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys("09/25/2013");
//readDriver.driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys(Keys.TAB);
//readDriver.driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys("02:45PM");
