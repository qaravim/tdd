package appDirectTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.appdirect.FooterPage;
import pages.appdirect.LandingPage;
import pages.appdirect.LeadPage;
import common.BaseTest;

public class LeadPageTest extends BaseTest {
	
	@Test
	public void VerifyFunctionalityOfLoginLinkOfHeader()
	{
		new LandingPage(webBrowser).goTo("https://login.salesforce.com/");
		LeadPage lp = new LeadPage(webBrowser);
		lp.loginIntoApplication();
		lp.clickOnLeadTab();
		Assert.assertTrue(lp.verifyEditButtonOnLeadPage());
		
	}

}
