package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ViewCandidateSteps {
    @Given("the user is on the candidate's page")
    public void theUserIsOnTheCandidateSPage() {
        System.out.println("I am on the candidate's page");
    }

    @Then("the user can view all the public details of the candidate")
    public void theUserCanViewAllThePublicDetailsOfTheCandidate() {
        System.out.println("I can see all the details of the candidate");
    }
}
