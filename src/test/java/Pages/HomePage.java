package Pages;

import Framework.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    By home_ImageView= MobileBy.id("com.lcwaikiki.android:id/ivTutorial");
    By home_SkipBtn=   MobileBy.id("com.lcwaikiki.android:id/tvNext");
    By homeRecycler= MobileBy.id("com.lcwaikiki.android:id/recyclerHome");




    AppiumDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    public HomePage(AppiumDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper= new Helper(driver);
    }

    public void getHomePageText()
    {
        elementHelper.checkElementPresence(homeRecycler);

    }
    public void checkHomePage()
    {
        elementHelper.checkElementPresence(home_ImageView);
    }

    public void homePageSkipBtn()
    {
        elementHelper.click(home_SkipBtn);
    }



}
