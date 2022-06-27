package Pages;
import Framework.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    AppiumDriver driver;
    WebDriverWait wait;
    Helper elementHelper;

    By homeRecycler= MobileBy.id("com.lcwaikiki.android:id/recyclerHome");
    By loginLayout= MobileBy.xpath("//android.widget.LinearLayout[5]/android.view.ViewGroup");
    By loginEmail= MobileBy.id("com.lcwaikiki.android:id/edtEmail");
    By loginPassword= MobileBy.id("com.lcwaikiki.android:id/edtPassword");
    By loginButton= MobileBy.id("com.lcwaikiki.android:id/buttonLogin");

    public LoginPage(AppiumDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper= new Helper(driver);
    }

    public void clickLoginLayout()
    {
        elementHelper.click(loginLayout);
    }

    public void fillLoginEmail(String email)
    {
        elementHelper.sendKey(loginEmail, email);
    }

    public void fillLoginPassword(String password)
    {
        elementHelper.sendKey(loginPassword, password);
    }

    public void clickLoginButton()
    {
        elementHelper.click(loginButton);
    }

}
