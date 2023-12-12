package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InternshipApplicationSteps {
    @Given("the user is on the internship's page")
    public void theUserIsOnTheInternshipSPage() {
        System.out.println("I am on the internship's page");
    }

    @When("the user uploaded their CV")
    public void theUserUploadedTheirCV() {
        System.out.println("I uploaded my CV");
    }

    @And("the user presses the apply button")
    public void theUserPressesTheApplyButton() {
        System.out.println("I pressed the apply button");
    }

    @And("the user has not applied to the same position before")
    public void theUserHasNotAppliedToTheSamePositionBefore() {
        System.out.println("I have not applied to this internship before");
    }

    @Then("the registration is stored in the system and the user is notified")
    public void theRegistrationIsStoredInTheSystemAndTheUserIsNotified() {
        System.out.println("My application was registered");
    }

    @And("the user answered all the extra questions posed by the Representatives")
    public void theUserAnsweredAllTheExtraQuestionsPosedByTheRepresentatives() {
        System.out.println("I answered all the extra questions");
    }

    @When("the user already applied for the internship")
    public void theUserAlreadyAppliedForTheInternship() {
        System.out.println("I already applied for this internship");
    }

    @Then("the apply button is turned into a delete application button")
    public void theApplyButtonIsTurnedIntoADeleteApplicationButton() {
        System.out.println("The apply button is turned into a delete button");
    }

    @When("the user did not upload their CV")
    public void theUserDidNotUploadTheirCV() {
        System.out.println("I did not upload my CV");
    }

    @And("the user did not answer the extra questions")
    public void theUserDidNotAnswerTheExtraQuestions() {
        System.out.println("I did not answer the extra questions");
    }

    @Then("the user will not be able to apply and they will be notified about what they need to complete")
    public void theUserWillNotBeAbleToApplyAndTheyWillBeNotifiedAboutWhatTheyNeedToComplete() {
        System.out.println("I need to complete extra informations");
    }
}
