package StepDefinitions;
import Framework.DriverSetup;
import Pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ProductsPageSteps {

    ProductsPage productsPage= new ProductsPage(DriverSetup.getDriver());

    @Then("User should see product list visible")
    public void user_should_see_product_list_visible() {
        productsPage.checkProductList();
    }

    @When("User clicks Filtre button")
    public void user_clicks_filtre_button() {
        productsPage.clickProductFilter();
    }

    @When("User clicks Renk button")
    public void user_clicks_renk_button() {
        productsPage.clickColorSection();
    }

    @When("User writes {string} color to search input")
    public void user_writes_color_to_search_input(String colorTxt) {
        productsPage.setProductColor(colorTxt);
    }

    @When("User clicks filtered color")
    public void user_clicks_filtered_color() {
        productsPage.clickFilteredColor();
    }

    @When("User clicks Uygula button")
    public void user_clicks_uygula_button() {
        productsPage.clickConfirmButton();
    }

    @When("User clicks Sonuclari Listele button")
    public void user_clicks_sonuclari_listele_button() {
        productsPage.clickGetResultButton();
    }

}
