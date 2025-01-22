package createUser;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import browser.browserInitilizer;
import frameworkUtils.reusableComponent;
import seleniumUtils.seleniumActions;

@Listeners(ListnerUtils.eventListner.class)
public class redbusData {

	public static final Logger logger = Logger.getLogger(handleWait.class);

	@BeforeTest
	public static void launchbrowser() throws Exception {
		System.out.println(browserInitilizer.driver);
		browserInitilizer.readDriverUtils(reusableComponent.red);
		logger.info("is using URL " + reusableComponent.red);
	}

	@Test(priority = 1)
	public static void handleWaitSelenium() throws Exception {
//		seleniumActions.sendKeys("//input[@id='src']", "Mumbai");// From
//		Thread.sleep(2000);
//		seleniumActions.listElements("//ul[@class='sc-dnqmqq dZhbJF']//following::text[@class='placeHolderMainText']","Kurla", true);
//		Thread.sleep(1000);
		browserInitilizer.driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.TAB);
		seleniumActions.sendKeys("(//div[@class='sc-ifAKCX kPhbmx'])[2]", "Pune"); // To
		// seleniumActions.dropdown(,"//div[@class='sc-gZMcBi hviMLb']//following::text[@class='placeHolderMainText']" Wakad );
		Thread.sleep(2000);
		seleniumActions.listElements("//div[@class='sc-gZMcBi hviMLb']//following::text[@class='placeHolderMainText']","Wakad", true);
		
		
		
	}

	@AfterTest
	public static void pub() {
		browserInitilizer.driver.close();
		System.out.println(browserInitilizer.driver);
	}

}
