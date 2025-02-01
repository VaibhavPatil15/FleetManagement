package API;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class readdata {
	public static String loadJsonFromProperties(String fileName) {
        Properties properties = new Properties();
        try (InputStream input = readdata.class.getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + fileName);
                return null;
            }
            properties.load(input);
            return properties.getProperty("jsonBody");
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
	
	public static String generateStringFromResource(String path) throws IOException {

	    return new String(Files.readAllBytes(Paths.get(path)));

	}
}

	


