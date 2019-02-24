package appDirectTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.appdirect.LandingPage;
import common.BaseTest;

public class LandingPageTest extends BaseTest {
	
	@Test
	public void verifyUrl()
	{
		Assert.assertTrue(new LandingPage(webBrowser).goTo("https://ap4.salesforce.com").isAtLandingPage());
	}
	
	@Test
	public void verifyLoginLink()
	{
		Assert.assertTrue(new LandingPage(webBrowser).goTo("https://ap4.salesforce.com").verifyLoginAtHeaderAndFooter());
	}
}
