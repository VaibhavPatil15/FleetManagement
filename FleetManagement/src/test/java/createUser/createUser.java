package createUser;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectPropertiesUtils.readORData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import browser.browserInitilizer;
import excelUtils.readExcelData;

@Listeners(listnersUtils.eventListner.class)
public class createUser {

	@BeforeTest
	public static void launchbrowser() throws Exception {
		browserInitilizer.readDriverUtils();
	}

	@Test(priority = 1)
	public static void launchBrowser() throws Exception {

		browserInitilizer.driver.findElement(By.xpath(readORData.getORData("contactInformation.FirstName.input")))
				.sendKeys(readExcelData.getExcelData(1, 0)); // readExcelData.getExcelData(1, 0)
		browserInitilizer.driver.findElement(By.xpath(readORData.getORData("contactInformation.Phone.input")))
				.sendKeys(readExcelData.getExcelData(1, 2));
	}

	@Test(priority = 2,dependsOnMethods = "launchBrowser")
	public static void launcBrowser() throws Exception {

		browserInitilizer.driver.findElement(By.xpath(readORData.getORData("contactInformation.FirstName.input")))
				.sendKeys(readExcelData.getExcelData(1, 0)); // readExcelData.getExcelData(1, 0)
		browserInitilizer.driver.findElement(By.xpath(readORData.getORData("contactInformation.Phone.input")))
				.sendKeys(readExcelData.getExcelData(1, 2));
	}

	@AfterTest
	public static void pub() {
		browserInitilizer.driver.close();

	}

}
