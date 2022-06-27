package Framework;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Helper {

    AppiumDriver driver;
    WebDriverWait wait;

    public Helper(AppiumDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);

    }

    public WebElement findElement(By elementName)
    {
        return
                driver.findElement(elementName);
    }

    public void checkElementPresence(By key) {
        wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public void click(By key) {
        findElement(key).click();
    }

    public void checkElementVisible(By elementName) {
        wait.until(ExpectedConditions.visibilityOf(findElement(elementName)));
    }

    public void sendKey(By elementName, String text) {
        findElement(elementName).sendKeys(text);
    }

    public void isAssertTrue(By actualValue, String exceptedValue)
    {
        String actualText= findElement(actualValue).getText();
        Assert.assertEquals(actualText,exceptedValue);

    }

    public void scrollToElement(WebElement element) {
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);

    }

}
