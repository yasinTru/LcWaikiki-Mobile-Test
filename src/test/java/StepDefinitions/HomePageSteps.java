package StepDefinitions;
import Framework.DriverSetup;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {

    HomePage homePage= new HomePage(DriverSetup.getDriver());



    @When("User skips home page ad")
    public void user_skips_home_page_ad()
    {
        homePage.homePageSkipBtn();
    }
}
