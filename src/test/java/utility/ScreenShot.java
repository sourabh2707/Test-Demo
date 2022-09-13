package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public void captureScreen(WebDriver driver, String name) {
		TakesScreenshot tsc = (TakesScreenshot) driver;
		File source = tsc.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\Screenshot\\" + name + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot captured");
	}
}
