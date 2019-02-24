package pages.appdirect;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Browser;
import pages.common.BasePage;

public class LandingPage extends BasePage<LandingPage> {
	
	@FindBy(className = "login")
	private List<WebElement> login;

	public LandingPage(Browser browser) {
		super(browser);
	}
	
	public boolean isAtLandingPage()
	{
		String pageTitle = webBrowser.getWebDriver().getTitle();
		if(pageTitle.equalsIgnoreCase("AppDirect"))
			return true;
		return false;
	}
	
	public boolean verifyLoginInHeader()
	{
		if(login.get(0).getSize() != null)
			return true;
		return false;
	}
	
	public boolean verifyLoginInFooter()
	{
		if(login.get(1).getSize() != null)
			return true;
		return false;
	}
	
	public boolean verifyLoginAtHeaderAndFooter()
	{
		if(verifyLoginInHeader() && verifyLoginInFooter())
			return true;
		return false;
	}
}
