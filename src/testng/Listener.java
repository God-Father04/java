package testng;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import selenium.Screenshot;

public class Listener extends Listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Action-onTestStart");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Action-onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.Capture(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Action-onTestSkipped");
	}
}
