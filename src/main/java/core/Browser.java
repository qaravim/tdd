package core;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import utilities.PropertyDictionary;

public class Browser {
	private WebDriver driver;

	public Browser(String browser)
			throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		browser = browser.trim().toLowerCase();

		
		switch (browser) {
		case "chrome":
			caps = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("ignore-certificate-errors");
			options.addArguments("chrome.switches","--disable-extensions");
			caps.setCapability(ChromeOptions.CAPABILITY, options);
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ravim\\Desktop\\qaravim-appd-54a606d2c349\\qaravim-appd-54a606d2c349\\lib\\chromedriver.exe");
			//System.setProperty("java.net.preferIPv4Stack" , "true");
			driver = new ChromeDriver(caps);

			break;

		case "firefox":
			caps = DesiredCapabilities.firefox();
			driver = new FirefoxDriver();
			break;

		case "ie":
			caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(
					InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
			caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,
					true);
			caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			driver = new InternetExplorerDriver(caps);
			break;
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}

	public WebDriver getWebDriver() {
	int p=0;
		return driver;
	}

}
