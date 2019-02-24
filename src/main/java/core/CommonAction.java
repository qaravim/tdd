package core;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonAction {
	
	public void implicitWait(WebDriver driver, int seconds)
	{
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public String randomEmailGenerate() {
		String randomString;
		String alphabet = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		int count = alphabet.length();
		randomString = new String();
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			randomString = randomString + alphabet.charAt(r.nextInt(count));
		System.out.println(randomString + "AppDirect" + "@mailinator.com");
		return randomString + "AppDirect" + "@mailinator.com";

	}
	
	public void selectDropdown(WebElement element, String value) {
		Select dropDown = new Select(element);
		try {
			dropDown.selectByVisibleText(value);
		} catch (NoSuchElementException e) {
			dropDown.selectByValue(value);
		}
	}

	public void selectDropdown(WebElement element, int index) {
		Select dropDown = new Select(element);
		dropDown.selectByIndex(index);
	}

	public void waitElementToBeClickable(WebDriver driver, WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void setText(WebElement element , String value)
	{
		element.sendKeys(value);
	}
}
