package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {

    public final static String BASE_URL = "https://www.vodien.com.au/register";

    public ChromeDriver driver;
    public WebDriverWait wait;
    protected RegisrationSteps registr;
    protected ValidationSteps valid;



    @BeforeSuite
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        registr = new RegisrationSteps(driver, wait);
        valid = new ValidationSteps(driver,wait);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
        driver.get(BASE_URL);
    }


    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }
}
