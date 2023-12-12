package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        System.out.println("I am on the login page");
    }

    @When("the user enters correct login data")
    public void theUserEntersCorrectLoginData() {
        System.out.println("I entered my login data");
    }

    @Given("the user has been logged in for more than a week")
    public void theUserHasBeenLoggedInForMoreThanAWeek() {
        System.out.println("I have been logged in for more than a week");
    }

    @Then("the user is logged out of their account")
    public void theUserIsLoggedOutOfTheirAccount() {
        System.out.println("I have been logged out");
    }

    @When("the user presses logout")
    public void theUserPressesLogout() {
        System.out.println("I pressed log out");
    }

    @When("the user enters incorrect login data")
    public void theUserEntersIncorrectLoginData() {
        System.out.println("I entered incorrect login data");
    }
}
