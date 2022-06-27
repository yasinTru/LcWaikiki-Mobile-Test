package Pages;
import Framework.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage {

    AppiumDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements
    By productImage= MobileBy.id("com.lcwaikiki.android:id/itemBasketImageView");
    By productTitle= MobileBy.id("com.lcwaikiki.android:id/itemBasketTitleText");
    By productSizeText= MobileBy.id("com.lcwaikiki.android:id/itemBasketSizeText");
    By productColor= MobileBy.id("com.lcwaikiki.android:id/itemBasketColorToolText");
    By productQuantity= MobileBy.id("com.lcwaikiki.android:id/itemBasketCountLayout");
    By goPaymentButton= MobileBy.id("com.lcwaikiki.android:id/tv_go_checkout");

    public BasketPage(AppiumDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper= new Helper(driver);
    }

    public void checkProductImage()
    {
        elementHelper.checkElementPresence(productImage);
    }

    public void checkProductTitle()
    {
        elementHelper.checkElementPresence(productTitle);
    }

    public void getProductSize(String productSize)
    {
        elementHelper.isAssertTrue(productSizeText,productSize);
    }

    public void checkProductColor()
    {
        elementHelper.checkElementPresence(productColor);
    }

    public void checkProductQuantity()
    {
        elementHelper.checkElementPresence(productQuantity);
    }

    public void clickGoPayment()
    {
        elementHelper.click(goPaymentButton);
    }
}
