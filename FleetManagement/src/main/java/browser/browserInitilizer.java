package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//Author:Neelam
import frameworkUtils.reusableComponent;

public class browserInitilizer {
//	this function is used to launch the browser
	public static WebDriver driver;

	public static WebDriver readDriverUtils() throws Exception {
		if (reusableComponent.browserType == "chrome") {
			System.setProperty(reusableComponent.chrome_exte, reusableComponent.chrome_path);
			driver = new ChromeDriver();
		} else if (reusableComponent.browserType == "edge") {
			System.setProperty(reusableComponent.edge_exte, reusableComponent.edge_path);
			driver = new EdgeDriver();
		} else
			System.out.println("no correct browser type provided");
		driver.get(reusableComponent.url);
		return driver;

	}

}
