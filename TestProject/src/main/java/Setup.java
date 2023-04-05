import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class Setup {

    WebDriver driver;

    @Parameters({"os"})
    void setup(String os, String url){

     if (os.equalsIgnoreCase("mac") ) {
            System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
        } else if (os.equalsIgnoreCase("windows")) {
	//System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
         System.setProperty("webdriver.http.factory", "jdk-http-client");
        }

        driver = new ChromeDriver();
        driver.get(url);
    }

    void closeBrowser(){
        driver.quit();
    }
}
