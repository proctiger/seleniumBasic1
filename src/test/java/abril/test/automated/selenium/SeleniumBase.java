package abril.test.automated.selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import abril.test.automation.util.TestUtil;

public class SeleniumBase {
	public static WebDriver driver = new HtmlUnitDriver();

	public static void getDriverCOnfig() throws IOException {
		String driverFromConfig = TestUtil.getDriverFromConfig();

		if (driverFromConfig.toLowerCase().indexOf("firefox") >= 0) {
			driver = new FirefoxDriver();
		}

		if (driverFromConfig.toLowerCase().indexOf("htmlunitdriver") >= 0) {
			driver = new HtmlUnitDriver();
		}
	}
}
