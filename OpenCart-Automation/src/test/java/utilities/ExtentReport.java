package utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBases.BaseClass;

public class ExtentReport implements ITestListener {

	public ExtentSparkReporter sparkReporter;  // UI of the report
	public ExtentReports extent;  //populate common info on the report
	public ExtentTest test; // creating test case entries in the report and update status of the test methods

	public void onStart(ITestContext context) {
		String timeStamp=new SimpleDateFormat("yyyyMMddhhMMss").format(new Date());
		String repName="test-report"+timeStamp+".html";
		sparkReporter=new ExtentSparkReporter(".\\Reports\\"+repName);
		
		sparkReporter.config().setDocumentTitle("Automation Test Report");
		sparkReporter.config().setReportName("Functional-Test");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Name","Ramkishan");
		extent.setSystemInfo("OS","Window");
		extent.setSystemInfo("Browser", "Chrome");
		
		
	}


	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS," Test Passed is: "+result.getName());
	}
	public void  onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"Test Failed is :"+result.getName());
		test.log(Status.FAIL,"Test case failed because :"+result.getThrowable());
		try {
			String imgPath = new BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case Skipped is: "+result.getName());
	}
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	
	
	
	
	
}
