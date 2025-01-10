package seleniumUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
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
	public static void sendKeys(String xpath, String value) {
		browserInitilizer.driver.findElement(By.xpath(xpath)).sendKeys(value);
	}

	public static void click(String xpath) {
		browserInitilizer.driver.findElement(By.xpath(xpath)).click();

	}

	public static void dropdown(String xpath, String value) {
		List<WebElement> dropdown = browserInitilizer.driver.findElements(By.xpath(xpath));
		// Select sl=new Select();
		for (WebElement ele : dropdown) {
			if (ele.getText().equalsIgnoreCase(value)) {
				Select sl = new Select(ele);
				sl.selectByValue(value);
			}

		}

	}

	public static void implicitWait(int timer) {
		browserInitilizer.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timer));
	}

	public static void explicitWait(int time, String xpath) {
		WebDriverWait wait = new WebDriverWait(browserInitilizer.driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public static void takescreeshot(String name) throws IOException {

		TakesScreenshot tc = (TakesScreenshot) browserInitilizer.driver;
		File file = tc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\Vp671\\git\\FleetManagemnet\\FleetManagement\\screenShots\\" + name + ".png"));

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
			System.out.println("*********** Data For Company : " + i+" : *********** ");
			List<WebElement> td = browserInitilizer.driver.findElements(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td"));
			for (int j = 1; j <= td.size(); j++) {

				String CompanyData = browserInitilizer.driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td[" + j + "]")).getText();
				System.out.print(CompanyData + " , ");

			}
			System.out.println();
		}

	}
}
// https://demo.guru99.com/test/web-table-element.php
//}
