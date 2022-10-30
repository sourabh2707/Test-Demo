package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//*[@name='username']")
private WebElement txt_username;
@FindBy(xpath="//*[@name='password']")
private WebElement txt_password;
@FindBy(xpath="//*[@type='submit']")
private WebElement btn_login;
@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
private WebElement btn_admin;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterUserid(String username) {
	txt_username.sendKeys(username);
}
public void enterPass(String password) {
	txt_password.sendKeys(password);
}
public void login() {
	btn_login.click();
}
public boolean verifyAdminBtn() {
	boolean stateOfBtn=btn_admin.isDisplayed();
	return stateOfBtn;
	}

}
