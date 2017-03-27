package testListener;

import org.testng.*;
public class TEst1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test method is started"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test method is success"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test method is fail"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test method is skipped"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}
	

}
