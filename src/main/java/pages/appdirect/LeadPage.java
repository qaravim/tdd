package pages.appdirect;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Browser;
import pages.common.BasePage;

public class LeadPage extends BasePage<FooterPage> {
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="Login")
	private WebElement login;
	
	@FindBy(xpath = "//*[@id='Lead_Tab']/a")
	private WebElement lead;
	
	@FindBy(xpath = "//*[@id='hotlist']/table/tbody/tr/td[2]/input")
	private WebElement newButton;
	
	@FindBy(xpath="//*[text()='Last Name']/following::input[1]")
	private WebElement lstname;
	
	@FindBy(xpath="//*[text()='Company']/following::input[1]")
	private WebElement company;
	
	@FindBy(name="save")
	private WebElement saveButton;
	
	@FindBy(name="edit")
	private WebElement editbutton;
	

	public LeadPage(Browser browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}
	
	public void loginIntoApplication()
	{
		username.sendKeys("qaravim@gmail.com");
		password.sendKeys("Kumar007");
		login.click();
	}
	
	public void clickOnLeadTab()
	{
		lead.click();
		newButton.click();
		lstname.sendKeys("adfefjne");
		company.sendKeys("bgfbnf");
		saveButton.click();
	}
	
	public boolean verifyEditButtonOnLeadPage()
	{
		if(editbutton.getAttribute("title").equalsIgnoreCase("edit"))
		{
			return true;
		}
		else
			return false;
	}

}
