package StepDefinitions;
import Framework.DriverSetup;
import Pages.CategoriesPage;
import io.cucumber.java.en.When;

public class CategoriesPageSteps {

    CategoriesPage categoriesPage= new CategoriesPage(DriverSetup.getDriver());

    @When("User clicks Categories button on Layout Section")
    public void user_clicks_categories_button_on_layout_section() {
        categoriesPage.clickCategories();
    }

    @When("User clicks Giyim section")
    public void user_clicks_giyim_section(){
        categoriesPage.clickGiyimSection();
    }

    @When("User clicks Bluz product")
    public void user_clicks_bluz_product() {
        categoriesPage.clickBluzProduct();
    }

}
