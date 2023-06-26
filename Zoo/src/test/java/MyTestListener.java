import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult testResult){
        System.out.println("Congrats! Test is passed.");
    }

    @Override
    public void onTestStart(ITestResult testResult){
        System.out.println("The test is started");
    }

    @Override
    public void onTestFailure(ITestResult result){
        String testName = result.getName();
        String testMethodName = result.getMethod().getMethodName();
        System.out.println(testName + " was failed on " + testMethodName + " Check logs.");
    }
}
