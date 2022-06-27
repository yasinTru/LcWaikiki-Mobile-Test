package Pages;
import Framework.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {

    AppiumDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    //elements
    By categoriesLayout= MobileBy.xpath("//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ImageView");
    By giyimSectionButton= MobileBy.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");
    By bluzProduct=MobileBy.xpath("//android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView");
    By seeAllPrdoucts= MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");

    public CategoriesPage(AppiumDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper= new Helper(driver);
    }

    public void clickCategories()
    {
        elementHelper.click(categoriesLayout);
    }

    public void clickGiyimSection()
    {
        elementHelper.click(giyimSectionButton);

        elementHelper.click(seeAllPrdoucts);
    }

    public void clickBluzProduct()
    {
        elementHelper.click(bluzProduct);

    }

}
