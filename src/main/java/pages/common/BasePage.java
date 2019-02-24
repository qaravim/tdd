package pages.common;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import core.Browser;
import core.CommonAction;

public abstract class BasePage<T extends BasePage<T>> {

	protected final Browser webBrowser;
	protected String pageTitle;
	protected String pageUrl;
	protected final CommonAction commonAction = new CommonAction();

	public BasePage(Browser browser) {
		this.webBrowser = browser;
		PageFactory.initElements(webBrowser.getWebDriver(), this);
	}

	public T goTo(String url) {
		pageUrl = url;
		webBrowser.getWebDriver().get(url);
		return (T) this;
	}

}
