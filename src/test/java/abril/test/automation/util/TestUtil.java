package abril.test.automation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestUtil {
 
	public static boolean checkString(String string, String substring){
		return false;
	}
	
	public static String getDriverFromConfig() throws IOException{
		Properties prop = new Properties();
		InputStream input = null;
		input = new FileInputStream("src/main/resources/config.properties");
		prop.load(input);
		return (prop.getProperty("driverTest"));
	}
	
}
