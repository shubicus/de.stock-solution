package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerITest implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test Start --> " + iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("S --> " + iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Failed !!! --> " + iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("S --> " + iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Start time --> " + iTestContext.getStartDate());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("End time --> " + iTestContext.getEndDate());
    }
}
