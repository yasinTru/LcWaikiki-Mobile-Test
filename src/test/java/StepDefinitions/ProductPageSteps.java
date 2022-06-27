package StepDefinitions;
import Framework.DriverSetup;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ProductPageSteps {

    ProductPage productPage= new ProductPage(DriverSetup.getDriver());

    @When("User clicks listed product")
    public void user_clicks_listed_product() {
        productPage.clickListedProduct();
    }

    @When("User clicks product details overlay")
    public void user_clicks_product_details_overlay() {
        productPage.clickProductDetail();
    }

    @When("User clicks medium size of product")
    public void user_clicks_medium_size_of_product() {
        productPage.clickProductSize();
    }

    @When("User clicks Sepete Ekle button")
    public void user_clicks_sepete_ekle_button() {
        productPage.clickAddBasket();
    }

    @When("User clicks close product page button")
    public void user_clicks_close_product_page_button() throws InterruptedException {
        productPage.clickCloseProduct();
    }

    @When("User clicks Sepetim on Layout Section")
    public void user_clicks_sepetim_on_layout_section() {
        productPage.clickLaoyoutBasket();
    }

}
