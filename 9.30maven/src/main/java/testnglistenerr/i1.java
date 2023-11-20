package testnglistenerr;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class i1 implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("sucesss");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	public void onStart(ITestContext context) {
		System.out.println("started");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("finishd");
		
	}
	//ITestListener
	//right-> source=> override/implement methods

}
