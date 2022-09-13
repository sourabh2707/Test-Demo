package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbutton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isButtonPresent() {
		boolean stateOfButton = loginbutton.isDisplayed();
		return stateOfButton;
	}

	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginbutton.click();
	}
}
