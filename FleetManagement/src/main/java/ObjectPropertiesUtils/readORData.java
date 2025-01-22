package ObjectPropertiesUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import frameworkUtils.reusableComponent;

public class readORData {
	public static String getORData(String key) throws IOException {
		File file = new File(reusableComponent.propertiesFile);
		FileInputStream stream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(stream);
		String data = prop.getProperty(key);
		return data;
	}
}