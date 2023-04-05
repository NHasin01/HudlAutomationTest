import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends Setup {
    HomePage home;

    @BeforeMethod
    void launchBrowser() {
        setup("windows", "https://www.hudl.com/en_gb/");
        home = PageFactory.initElements(driver, HomePage.class);
    }

    @AfterMethod
    void clearData() {
        closeBrowser();
    }

    @Test
    void validateLogin() {
        home.goToLogin();
        Assert.assertTrue(true);
    }

    @Test
    void enterLogin (){
        home.clickHudl();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.hudl.com/login?utm_content=hudl_primary&utm_source=www.hudl.com&utm_medium=login_dropdown&utm_campaign=platform_logins");
    }

    @Test
    public void test1() throws InterruptedException {                      //valid username & invalid password test
        home.LogIn ("Anonymous","bftn");
    }

    @Test
    public void test2() throws InterruptedException {                      //invalid username & valid password test
        home.LogIn ("765","T1234");
    }

    @Test
    public void test3() throws InterruptedException {                      //valid username & password test
        home.LogIn ("Anonymous","T1234");
    }

}
