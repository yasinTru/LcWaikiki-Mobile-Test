package StepDefinitions;
import Framework.DriverSetup;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(DriverSetup.getDriver());



    @When("User clicks Giris Yap button on Layout Section")
    public void user_clicks_giris_yap_button_on_layout_section() {
        loginPage.clickLoginLayout();
    }

    @When("User enters {string} email")
    public void user_enters_email(String emailTxt) {
        loginPage.fillLoginEmail(emailTxt);

    }

    @When("User enters {string} password")
    public void user_enters_password(String passwordTxt) {
        loginPage.fillLoginPassword(passwordTxt);

    }

    @When("User clicks Giris Yap button")
    public void user_clicks_giris_yap_button() {
        loginPage.clickLoginButton();

    }
}
