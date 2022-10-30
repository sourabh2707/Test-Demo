package tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest {
	public static WebDriver driver;
	LoginPage lp;

	@Given("browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("^entered credenrials (.*) and (.*)$")
	public void entered_credenrials(String username, String password) throws InterruptedException {
		lp=new LoginPage(driver);
		lp.enterUserid(username);
		lp.enterPass(password);
	}

	@And("click on login")
	public void click_on_login() {
		lp.login();
	}

	@Then("navigated to home page")
	public void navigated_to_home_page() {
		if (lp.verifyAdminBtn()==true) {
			System.out.println("TC pass");
		}
		else {
			System.out.println("TC failed");
		}
		driver.quit();
	}
}
