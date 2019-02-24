package pages.appdirect;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Browser;
import pages.common.BasePage;

public class HeaderPage extends BasePage<HeaderPage> {
	
	@FindBy(className = "login")
	private List<WebElement> login;
	
	

	public HeaderPage(Browser browser) {
		super(browser);
	}
	
	public LoginModalPage clickOnLoginLinkAtHeader()
	{
		login.get(0).click();
		return new LoginModalPage(webBrowser);
	}

}
