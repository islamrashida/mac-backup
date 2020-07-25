package listeners;

import Sites.PageObjectModelFrameWork.BaseClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerui extends BaseClass implements ITestListener {
	
	public void onStart(ITestContext context) {
		
		System.out.println("Test is started");
	}

	public void onTestSuccess(ITestResult result) {
	
		System.out.println("Test is passed");

}
	public void onTestFailure(ITestResult result) {
	
		System.out.println("Test is failed");
		
	}
	public void onTestStart(ITestResult result) {

		System.out.println("This is on teststart");
	}

}
