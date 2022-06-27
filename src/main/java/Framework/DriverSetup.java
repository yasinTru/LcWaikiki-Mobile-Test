package Framework;

import Framework.ConfigReader;
import com.aventstack.extentreports.App;
import io.appium.java_client.AppiumDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverSetup {

    static AppiumDriver driver;
    static Properties properties;
    static  DesiredCapabilities capabilities;

    public static AppiumDriver initialize_Driver(String browser){

        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled"); //removes the detection
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); //removes the banner
        */
        properties = ConfigReader.getProperties();
        capabilities=new DesiredCapabilities();

        if(browser.equals("Android"))
        {
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("appPackage", "com.lcwaikiki.android");
            capabilities.setCapability("appActivity", "com.lcwaikiki.android.ui.SplashActivity");

        }

        /* else if(browser.equals("iOS"))
        {
            capabilities.setCapability("platformName","iOS");
            capabilities.setCapability("udid", "emulator-5554");

            capabilities.setCapability("appPackage", "com.lcwaikiki.android");
            capabilities.setCapability("appActivity", "com.lcwaikiki.android.ui.SplashActivity");
        }

*/

        try
        {
            driver= new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        }
        catch (MalformedURLException e)
        {
            throw new RuntimeException(e);
        }


        int impWait = Integer.parseInt(properties.getProperty("implicityWait"));
       //  int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout"));
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
     //    driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);



        return getDriver();
    }

    public static AppiumDriver getDriver(){
        return driver;
    }


}