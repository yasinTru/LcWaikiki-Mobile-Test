package Runner;
import Framework.DriverSetup;
import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions", "Framework"},
        tags = "@UserEndToEnd",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm.html",
                "json:Reports/CucumberReport/Report",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver = DriverSetup.getDriver();
}