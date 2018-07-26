package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener {
	
	ExtentTest t;
	ExtentReports r;

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("oN fINISH");
		r.endTest(t);
		r.flush();
		
		
	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("ONsTART");
		r=new ExtentReports("C:\\Java Prog\\workspace\\Yash\\MyFramework1\\src\\test\\java\\Report.html");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure");
		t.log(LogStatus.FAIL,result.getMethod().getMethodName()+"has failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart");
		//t=r.startTest("My Test has started");
		t=r.startTest(result.getMethod().getMethodName()+"has started");
		t.log(LogStatus.INFO,result.getMethod().getMethodName()+"has started");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess");
		t.log(LogStatus.PASS,result.getMethod().getMethodName()+"success");
	}

	
}
