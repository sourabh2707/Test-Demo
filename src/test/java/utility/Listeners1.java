package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

public class Listeners1 extends BaseTest implements ITestListener {
	ScreenShot sc;

	@Override
	public void onTestSuccess(ITestResult result) {
		sc = new ScreenShot();
		sc.captureScreen(driver, result.getName());
	}

}
