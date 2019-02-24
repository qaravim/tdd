package pages.appdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Browser;
import pages.common.BasePage;

public class LoginModalPage extends BasePage<LoginModalPage>{
	
	@FindBy(css = "h3[class*='adb-container_header--title']")
	private WebElement loginModalTitle;
	
	@FindBy(id = "username-w-lbl")
	private WebElement usernameLabel;
	
	@FindBy (id = "username")
	private WebElement username;
	
	@FindBy (id = "password-w-lbl")
	private WebElement passwordLabel;
	
	@FindBy (id = "password")
	private WebElement password;
	
	@FindBy (className = "forgotPassword")
	private WebElement forgotPassword;
	
	@FindBy (id = "rememberMe")
	private WebElement rememberMe;
	
	@FindBy (className = "adb-selector--value")
	private WebElement keepMeText;
	
	@FindBy (id = "ide")
	private WebElement loginButton;
	
	@FindBy (className = "adb-button adb-button__inset adb-toolbar--item adb-toolbar--item__rwd")
	private WebElement signUpButton;
	
	@FindBy (css = "a[tabindex='6'][ga='loginToSignupClick']")
	private WebElement signUpForAnAccountLink;

	public LoginModalPage(Browser browser) {
		super(browser);
	}
	
	public boolean verifyLoginModalTitle()
	{
		if(loginModalTitle.getText().equalsIgnoreCase("Log in to your account"))
			return true;
		return false;
	}

}
