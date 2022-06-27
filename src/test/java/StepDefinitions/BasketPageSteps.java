package StepDefinitions;
import Framework.DriverSetup;
import Pages.BasketPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class BasketPageSteps {

    BasketPage basketPage= new BasketPage(DriverSetup.getDriver());

    @Then("User should see product image")
    public void user_should_see_product_image() {
        basketPage.checkProductImage();
    }

    @Then("User should see product title")
    public void user_should_see_product_title() {
        basketPage.checkProductTitle();
    }

    @Then("User should see {string} product size")
    public void user_should_see_product_size(String sizeTxt) {
        basketPage.getProductSize(sizeTxt);
    }

    @Then("User should see product color")
    public void user_should_see_product_color() {
        basketPage.checkProductColor();
    }

    @Then("User should see product quantity")
    public void user_should_see_product_quantity() {
        basketPage.checkProductQuantity();
    }

    @When("User clicks Odeme Adimina Gec button")
    public void user_clicks_odeme_adimina_gec_button() {
        basketPage.clickGoPayment();
    }

}
