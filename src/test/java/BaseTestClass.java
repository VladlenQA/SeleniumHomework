import org.kryvoi.driver.WebDriverHolder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass {
    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = WebDriverHolder.getInstance().getDriver();
    }

    @AfterSuite
    public void afterSuite() {
        WebDriverHolder.getInstance().driverQuit();
    }

    public void goToUrl(String url) {
        WebDriverHolder.getInstance().getDriver().get(url);
    }
}
