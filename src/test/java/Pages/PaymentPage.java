package Pages;
import Framework.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {

    AppiumDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements
    By deliveryMethod= MobileBy.id("com.lcwaikiki.android:id/titleDeliveryOptions");
    By deliverySummary= MobileBy.id("com.lcwaikiki.android:id/deliveryTypeContent");

    public PaymentPage(AppiumDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper= new Helper(driver);
    }

    public void checkDeliveryMethod(String methodTxt)
    {
        elementHelper.checkElementVisible(deliveryMethod);
    }

    public void checkDeliverySummary()
    {
        elementHelper.checkElementVisible(deliverySummary);
    }

}
