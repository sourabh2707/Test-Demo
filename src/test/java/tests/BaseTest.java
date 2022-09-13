package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public Properties prop;
	FileInputStream fis;
	String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

	@BeforeSuite
	public void browser() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		prop = new Properties();
		fis = new FileInputStream(path);
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
