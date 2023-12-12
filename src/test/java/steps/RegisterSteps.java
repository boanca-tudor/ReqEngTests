package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    @Given("the user is on the register page")
    public void theUserIsOnTheRegisterPage() {
        System.out.println("I am on the register page");
    }

    @When("the user provides correct mandatory fields")
    public void theUserProvidesCorrectMandatoryFields() {
        System.out.println("I provided all mandatory fields");
    }

    @And("the user selects Candidate account")
    public void theUserSelectsCandidateAccount() {
        System.out.println("I selected Candidate account");
    }

    @And("the user presses submit")
    public void theUserPressesSubmit() {
        System.out.println("I pressed submit");
    }

    @And("the user selects Representative account")
    public void theUserSelectsRepresentativeAccount() {
        System.out.println("I selected representative account");
    }


    @Then("the user is logged in their account")
    public void theUserIsLoggedInTheirAccount() {
        System.out.println("I am logged in my account");
    }

    @And("the user selects their employer")
    public void theUserSelectsTheirEmployer() {
        System.out.println("I selected/added my employer");
    }

    @When("the user provides incorrect mandatory fields")
    public void theUserProvidesIncorrectMandatoryFields() {
        System.out.println("I provided wrong data");
    }

    @Then("the user is warned about the incorrect data")
    public void theUserIsWarnedAboutTheIncorrectData() {
        System.out.println("My data is not correct");
    }

    @And("an account is not created")
    public void anAccountIsNotCreated() {
        System.out.println("My account was not created");
    }
}
