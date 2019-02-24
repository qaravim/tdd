package common;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utilities.PropertyFile;
import core.Browser;

public class BaseTest {

	public Browser webBrowser;

	@BeforeSuite
	@Parameters("propertyfileName")
	public void getParameters(String propertyfileName) throws Exception {

		String[] files = propertyfileName.split(",");
		for (String fileName : files) {
			if (fileName.contains("properties")) {
				new PropertyFile(fileName).getData();
			}
		}
	}

	@BeforeMethod
	@Parameters({ "browser"})
	public void setUp(String browser) throws Exception {
		webBrowser = new Browser(browser);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		webBrowser.getWebDriver().close();

	}
}
