package appDirectTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.appdirect.HeaderPage;
import pages.appdirect.LandingPage;
import common.BaseTest;

public class HeaderPageTest extends BaseTest  {
	
	@Test
	public void VerifyFunctionalityOfLoginLinkOfHeader()
	{
		new LandingPage(webBrowser).goTo("https://www.appdirect.com");
		Assert.assertTrue(new HeaderPage(webBrowser).clickOnLoginLinkAtHeader().verifyLoginModalTitle());
	}

}
