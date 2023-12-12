package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewInternshipSteps {
    @Given("the user clicked on an open internship")
    public void theUserClickedOnAnOpenInternship() {
        System.out.println("I clicked on an open internship");
    }

    @When("the user enters the page of the internship")
    public void theUserEntersThePageOfTheInternship() {
        System.out.println("I entered the page of the internship");
    }

    @Then("the user can view all the public details of the internship")
    public void theUserCanViewAllThePublicDetailsOfTheInternship() {
        System.out.println("I see all the details of the internship");
    }
}
