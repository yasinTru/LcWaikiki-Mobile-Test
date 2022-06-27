package Pages;
import Framework.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

    AppiumDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements
    By productListRecyler= MobileBy.id("com.lcwaikiki.android:id/recyclerProduct");
    By productFilter= MobileBy.id("com.lcwaikiki.android:id/filter_product");
    By productColorSection= MobileBy.xpath("//android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.TextView");
    By setProductColor= MobileBy.id("com.lcwaikiki.android:id/searchFilterEditText");
    By filteredColor= MobileBy.id("com.lcwaikiki.android:id/checked_color_text");
    By confirmButton= MobileBy.id("com.lcwaikiki.android:id/subFilterButton");
    By getResultsButton= MobileBy.id("com.lcwaikiki.android:id/buttonFilter");

    public ProductsPage(AppiumDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper= new Helper(driver);
    }

    public void checkProductList()
    {
        elementHelper.checkElementPresence(productListRecyler);
    }

    public void clickProductFilter(){
        elementHelper.click(productFilter);
    }

    public void clickColorSection()
    {
        elementHelper.click(productColorSection);
    }

    public void setProductColor(String color)
    {
        elementHelper.sendKey(setProductColor, color);
    }

    public void clickFilteredColor()
    {
        elementHelper.click(filteredColor);
    }

    public void clickConfirmButton()
    {
        elementHelper.click(confirmButton);
    }

    public void clickGetResultButton()
    {
        elementHelper.click(getResultsButton);
    }

}

