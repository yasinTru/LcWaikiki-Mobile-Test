package StepDefinitions;
import Framework.DriverSetup;
import Pages.PaymentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentPageSteps {

    PaymentPage paymentPage= new PaymentPage(DriverSetup.getDriver());

    @Then("User should see {string} Teslimat yontemi text")
    public void user_should_see_delivery_text(String deliveryMethod)
    {
        paymentPage.checkDeliveryMethod(deliveryMethod);
    }

    @Then("User should see Siparis Ozeti container")
    public void user_should_see_summary()
    {
        paymentPage.checkDeliverySummary();

    }
}
