package seleniumUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.browserInitilizer;

public class seleniumActions {
	public static void sendKeys(String xpath, String value) throws InterruptedException {
		WebElement element = browserInitilizer.driver.findElement(By.xpath(xpath));
		element.click();
		Thread.sleep(2000);
		element.sendKeys("Pune");
	}

	public static void click(String xpath) {
		browserInitilizer.driver.findElement(By.xpath(xpath)).click();

	}

	/**
	 * dropdown is used for selection of a value present as a option under select
	 * 
	 * @param xpath = xpath for all elements
	 * @param value = Text to be selected
	 */
	public static void dropdown(String xpath, String value) throws InterruptedException {
		// List<WebElement> dropdown =
		// browserInitilizer.driver.findElements(By.xpath(xpath));
		WebElement drp = browserInitilizer.driver.findElement(By.xpath(xpath));
		Select sl = new Select(drp);
		Thread.sleep(1000);
		System.out.println(value);
		sl.selectByValue(value);

	}

	/**
	 * 
	 * @param xpath : Xpath for all List elements insider ul / ol .
	 * @param value : Provide text as a value to be selected out of all list
	 *              elements.
	 * @param flag  : Can be true or false
	 *              <p>
	 *              false To fetch & return all Elements as a List<WebElement>.
	 *              <p>
	 *              true to select the particular element.
	 * @return List<WebElement> containing all the list items or null.
	 */
	public static List<WebElement> listElements(String xpath, String value, boolean flag) {
		List<WebElement> allElements = browserInitilizer.driver.findElements(By.xpath(xpath));
		if (flag) {
			for (int i = 1; i < allElements.size(); i++) {
				if (allElements.get(i).getText().equals(value)) {
					System.out.println("Text Selected : " + allElements.get(i).getText());
					allElements.get(i).click();
				}
			}
		}
		return allElements;

	}

	public static void implicitWait(int timer) {
		browserInitilizer.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timer));
	}

	public static void explicitWait(int time, String xpath) {
		WebDriverWait wait = new WebDriverWait(browserInitilizer.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
		wait.until(ExpectedConditions.alertIsPresent());// dynamic wait for alert
		
		
	}

	public static void takescreeshot(String name) throws IOException {

		TakesScreenshot tc = (TakesScreenshot) browserInitilizer.driver;
		File file = tc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:\\Users\\Vp671\\git\\FleetManagemnet\\FleetManagement\\screenShots\\" + name + ".png"));

	}

	public static String alertAction(boolean flag) {
		Alert alert = browserInitilizer.driver.switchTo().alert();
		String msg = alert.getText();
		if (flag == true) {
			alert.accept();
		} else
			alert.dismiss();
		return msg;
	}

	public static void handleFrame() {
		browserInitilizer.driver.findElement(null);
	}

	public static void fetchdatafromDataTable() {
		List<WebElement> tr = browserInitilizer.driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("length of the datatable" + tr.size());// 25
		for (int i = 1; i < tr.size(); i++) {
			System.out.println("*********** Data For Company : " + i + " : *********** ");
			List<WebElement> td = browserInitilizer.driver
					.findElements(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td"));
			for (int j = 1; j <= td.size(); j++) {

				String CompanyData = browserInitilizer.driver
						.findElement(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td[" + j + "]")).getText();
				System.out.print(CompanyData + " , ");

			}
			System.out.println();
		}

	}

	public static void switchToNewWindow() {

	}

	public static void calenderHandle(String xpath) {
		// browserInitilizer.driver.findElement(xpath);

	}

	public static void uploadFile() {
		WebElement ele = browserInitilizer.driver.findElement(By.xpath("//input[@id='uploadFile']"));
		File file=new File("C:\\Users\\Vp671\\git\\FleetManagemnet\\FleetManagement\\uploadFile\\data.txt");
		ele.sendKeys(file.getAbsolutePath());
	}

	private static List<String> arrayList() {
		List<String> arr = new ArrayList<String>();
		return arr;
	}
	public static void chkBox(int value) {
		List<WebElement> lst = browserInitilizer.driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i <= lst.size(); i++) {
			if((value-1)==i) {
				lst.get(i).click();
			}
		}
	}
}
// https://demo.guru99.com/test/web-table-element.php
//}
