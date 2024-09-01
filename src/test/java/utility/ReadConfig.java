package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	public static Properties properties;
	public ReadConfig(String string) {
        properties = new Properties();
        try (FileInputStream fis = new FileInputStream(string)) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getConfigValue(String key) {
        return properties.getProperty(key);
    }
	
}
