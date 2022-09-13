package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement dropdown;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li[4]//a[@class='oxd-userdropdown-link']")
	private WebElement logoutbutton;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getdropdown() {

		return dropdown;
	}

	public WebElement getlogout() {

		return logoutbutton;
	}

}
