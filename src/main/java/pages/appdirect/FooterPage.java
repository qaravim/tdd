package pages.appdirect;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Browser;
import pages.common.BasePage;

public class FooterPage extends BasePage<FooterPage>{
	
	//webelement
	//dirver.findEem(By.)
	@FindBy(className = "login")
	WebElement login;

	public FooterPage(Browser browser) {
		super(browser);
	}
	
	//Action event
	public LoginModalPage clickOnLoginLinkAtFooter()
	{
		login.click();
		return new LoginModalPage(webBrowser);
	}

}
