package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {

    @Given("user is on the landing page\\(technically, it's a login page)")
    public void user_is_on_the_landing_page_technically_it_s_a_login_page() {
        System.out.println("I am on the login page");
    }

    @Then("user logs in as store manager")
    public void user_logs_in_as_store_manager() {
        System.out.println("Login as store manager");
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("Verifying page title ");
    }

}
