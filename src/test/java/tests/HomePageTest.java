package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends BaseTest {
	HomePage hp;

	@BeforeClass
	public void initObject() {
		hp = new HomePage(driver);
	}

	@Test
	public void logout() {
		hp.getdropdown().click();
		hp.getlogout().click();
	}
}
