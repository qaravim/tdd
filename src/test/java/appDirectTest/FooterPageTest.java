package appDirectTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.appdirect.FooterPage;
import pages.appdirect.HeaderPage;
import pages.appdirect.LandingPage;
import common.BaseTest;

public class FooterPageTest extends BaseTest {
	
	@Test
	public void VerifyFunctionalityOfLoginLinkOfHeader()
	{
		new LandingPage(webBrowser).goTo("https://www.appdirect.com");
		Assert.assertTrue(new FooterPage(webBrowser).clickOnLoginLinkAtFooter().verifyLoginModalTitle());
	}

}
