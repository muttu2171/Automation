package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class stepDefination {

    @Given("^User is on Netbanking login page$")
    public void user_is_on_netbanking_login_page() throws Throwable {
    	System.out.println("Given");

    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("When");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("And");
    }

}