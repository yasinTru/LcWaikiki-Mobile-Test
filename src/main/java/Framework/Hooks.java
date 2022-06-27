package Framework;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import java.util.Properties;
import Framework.DriverSetup;
public class Hooks {

    AppiumDriver driver;
    Properties properties;
    @Before
    public void before() {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = ConfigReader.initialize_Properties();
        driver = DriverSetup.initialize_Driver(browser);
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After
    public void after() {
        driver.quit();
    }
}