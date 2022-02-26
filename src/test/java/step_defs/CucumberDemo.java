package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDemo {
    @Given("User is logged in to https:\\/\\/www.facebook.com\\/")
    public void user_is_logged_in_to_https_www_facebook_com() {
        System.out.println("User logged to fb");
    }
    @When("User enter test@test.com to email field")
    public void user_enter_test_test_com_to_email_field() {
        System.out.println("User enter test@test.com");
    }
    @When("User should enter Hello1234 in password input field")
    public void user_should_enter_hello1234_in_password_input_field() {
        System.out.println("User wrote hello1234 to password field");
    }
    @When("User should click on Log In button")
    public void user_should_click_on_log_in_button() {
        System.out.println("User wrote lof in button");
    }
    @Then("User should successfully logged in to the Facebook")
    public void user_should_successfully_logged_in_to_the_facebook() {
        System.out.println("User successfully logged to facebook");
    }

}
