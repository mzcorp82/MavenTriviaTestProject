package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void readPropertiesFile() {
		
		
		
		try {
			InputStream input = new FileInputStream("C:\\Users\\kc909\\git\\MavenTriviaTestProject\\MavenTriviaTestProject\\src\\main\\java\\config\\config.properties");
			prop.load(input);
			prop.getProperty("");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
