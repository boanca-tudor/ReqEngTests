package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewEmployerSteps {
    @Given("the internship period is over")
    public void theInternshipPeriodIsOver() {
        System.out.println("The internship is over");
    }

    @And("the user was selected for the internship")
    public void theUserWasSelectedForTheInternship() {
        System.out.println("I was selected for the internship");
    }

    @When("the user accesses the employer's page")
    public void theUserAccessesTheEmployerSPage() {
        System.out.println("I am on the employer's page ");
    }

    @And("the user clicks the review button")
    public void theUserClicksTheReviewButton() {
        System.out.println("I clicked the review button");
    }

    @Then("a review form will be presented to the user")
    public void aReviewFormWillBePresentedToTheUser() {
        System.out.println("I see the review form");
    }

    @Given("the user is on the review form")
    public void theUserIsOnTheReviewForm() {
        System.out.println("I am on the review form");
    }

    @Then("the user is able to rate the employer on a scale from {int} to {int}")
    public void theUserIsAbleToRateTheEmployerOnAScaleFromTo(int arg0, int arg1) {
        System.out.println("I am able to rate the employer on a scale from 1 to 5");
    }

    @Then("the user is able to leave a comment along with their review")
    public void theUserIsAbleToLeaveACommentAlongWithTheirReview() {
        System.out.println("I am able to leave a comment along with my review");
    }

    @Given("the user already reviewed the employer")
    public void theUserAlreadyReviewedTheEmployer() {
        System.out.println("I already reviewed the employer");
    }

    @Then("the review button is turned into a modify review button")
    public void theReviewButtonIsTurnedIntoAModifyReviewButton() {
        System.out.println("The review button is turned into a modify review button");
    }

    @Given("the user did not get selected for the internship")
    public void theUserDidNotGetSelectedForTheInternship() {
        System.out.println("I did not get selected for the internship");
    }

    @Then("the review button is not visible")
    public void theReviewButtonIsNotVisible() {
        System.out.println("The review button is not visible");
    }
}
