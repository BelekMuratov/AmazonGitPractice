package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTable {
    @Given("User is on namba food")
    public void user_is_on_namba_food() {
        
        System.out.println("User is on namba food");
    }
    @Then("User clicks on foods")
    public void user_clicks_on_foods() {
        
        System.out.println("User clicks on foods button");
    }
    @Then("User should see {string}")
    public void user_should_see(String listOfCafes) {
        
        System.out.println("user see " + listOfCafes);
    }
    @Then("User should find Sushi category")
    public void user_should_find_sushi_category() {
        
        System.out.println("User found sushi");
    }
    @Then("User click on Sushi")
    public void user_click_on_sushi() {
        
        System.out.println("User click on Sushi button");
    }
    @Then("User should see list of cafes")
    public void user_should_see_list_of_cafes() {
        
        System.out.println("User shoul see list of cafes");
    }
    @Then("User shoul scroll down to Arrigato cafe")
    public void user_shoul_scroll_down_to_arrigato_cafe() {
        
        System.out.println("User should scroll to Arrigato cafe");
    }
    @When("User click on Arrigato")
    public void user_click_on_arrigato() {
        
        System.out.println("User click on Arrigato button");
    }
    @Then("User should see Arrigato menu")
    public void user_should_see_arrigato_menu() {
        
        System.out.println("User should see Arrigato menu");
    }
    @Then("User shoul find Kimchi")
    public void user_shoul_find_kimchi() {
        
        System.out.println("User should find Kimchi");
    }
    @Then("User should increase amount to {int}")
    public void user_should_increase_amount_to(Integer kimchiAmount) {
        
        System.out.println("User should increase amount to +" + kimchiAmount);
    }
    @Then("User should click on order button")
    public void user_should_click_on_order_button() {
        
        System.out.println("user should click on order button");
    }
    @Then("On the cart user should see {string}")
    public void on_the_cart_user_should_see(String totalPriceAmount) {
        
        System.out.println("User should see on the cart "+ totalPriceAmount);
    }

    ///Second scenario
    @Given("User is on https:\\/\\/www.amazon.com\\/")
    public void user_is_on_https_www_amazon_com() {
        
        System.out.println("User is on URL");
    }
    @Then("following menu bar should be displayed on the Home page")
    public void following_menu_bar_should_be_displayed_on_the_home_page(io.cucumber.datatable.DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);

        System.out.println(data.get(0).get(1));
    }

    /// Third Scenario
    @Given("When user is on cars.kg")
    public void when_user_is_on_cars_kg() {

        System.out.println("User is on URL");
    }
    @Then("Following cars should be displayed")
    public void following_cars_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        Integer bmw745 = Integer.parseInt(data.get(2).get(1));
        System.out.println(bmw745);
    }


}
