package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class LoginTest extends BaseTest {
	LoginPage lp;

	@BeforeClass
	public void initObject() {
		lp = new LoginPage(driver);
	}

	@Test
	public void verifyLoginButton() {
		System.out.println(lp.isButtonPresent());
		Assert.assertTrue(lp.isButtonPresent());
	}

	@Test
	public void login() {
		lp.login("Admin", "admin123");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
}
