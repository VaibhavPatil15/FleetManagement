package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

//Author:Neelam
import frameworkUtils.reusableComponent;

public class browserInitilizer {
//	this function is used to launch the browser
	public static WebDriver driver;

	public static WebDriver readDriverUtils(String URL) throws Exception {
		if (reusableComponent.browserType == "chrome") {
			System.setProperty(reusableComponent.chrome_exte, reusableComponent.chrome_path);
			driver = new ChromeDriver();
		} else if (reusableComponent.browserType == "edge") {
			System.setProperty(reusableComponent.edge_exte, reusableComponent.edge_path);
			driver = new EdgeDriver();
		} else
			System.out.println("no correct browser type provided");
		driver.get(URL);
		driver.manage().window().maximize();
		Reporter.log("Browser is launched and Maximized");
		return driver;

	}

}
