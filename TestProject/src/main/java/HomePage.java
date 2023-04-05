import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage extends Setup {

    @FindBy(xpath = "//a[@data-qa-id=\"login-select\"]")
    WebElement login;

    void goToLogin() {
        login.click();
    }

    @FindBy(xpath = "//a[@data-qa-id=\"login-hudl\"]")
    WebElement moveClick;

    void clickHudl() {
        Actions actions = new Actions(driver);
        actions.moveToElement(moveClick);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.elementToBeClickable(moveClick));

        actions.doubleClick(moveClick).build().perform();

    }

    @FindBy(id = "email")
    WebElement logEmail;
    @FindBy(id = "password")
    WebElement logPassword;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement checkIn;

    public HomePage LogIn(String Anonymous, String T1234) throws InterruptedException {
        {
            logEmail.sendKeys("Anonymous");
        }
        {
            logPassword.sendKeys("T1234");
        }
        Thread.sleep(2000);
        checkIn.click();
        return new HomePage();
    }
}
