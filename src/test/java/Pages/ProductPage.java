package Pages;
import Framework.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    AppiumDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements
    By listedProduct= MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/androidx.viewpager.widget.ViewPager");
    By productOverlay= MobileBy.id("com.lcwaikiki.android:id/scrollCardViewOverlay");
    By productSize= MobileBy.xpath("(//android.widget.FrameLayout[@content-desc=\"Stokta\"])[1]");
    By addBasket= MobileBy.id("com.lcwaikiki.android:id/basket");
    By productClose= MobileBy.id("com.lcwaikiki.android:id/productClose");
    By clickSepetimButton= MobileBy.xpath("//android.widget.LinearLayout[3]/android.view.ViewGroup");

    public ProductPage(AppiumDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper= new Helper(driver);
    }
    public void clickListedProduct()
    {
        elementHelper.click(listedProduct);
    }

    public void clickProductDetail()
    {
        elementHelper.click(productOverlay);
    }

    public void clickProductSize()
    {
        elementHelper.click(productSize);
    }

    public void clickAddBasket()
    {
        elementHelper.click(addBasket);
    }

    public void clickCloseProduct() throws InterruptedException
    {
        Thread.sleep(7000);
        elementHelper.click(productClose);
    }

    public void clickLaoyoutBasket()
    {
        elementHelper.click(clickSepetimButton);
    }

}
