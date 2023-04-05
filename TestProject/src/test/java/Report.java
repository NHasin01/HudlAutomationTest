import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class Report extends Setup implements ITestListener{



    @Override
    public void onTestFailure(ITestResult result) {
        driver = new ChromeDriver();
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("screenshot/"+"capture"+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
