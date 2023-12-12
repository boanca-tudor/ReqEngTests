package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostInternshipSteps {
    @Given("the representative is on the add internship page")
    public void theRepresentativeIsOnTheAddInternshipPage() {
        System.out.println("I am on the add internship page");
    }

    @When("the representative posted all required information for the internship")
    public void theRepresentativePostedAllRequiredInformationForTheInternship() {
        System.out.println("I posted all required information for the internship");
    }

    @And("the representative presses the submit button")
    public void theRepresentativePressesTheSubmitButton() {
        System.out.println("I pressed the submit button");
    }

    @Then("a new internship will be posted in the system")
    public void aNewInternshipWillBePostedInTheSystem() {
        System.out.println("The system posted the internship");
    }

    @And("the representative posted optional information about the internship")
    public void theRepresentativePostedOptionalInformationAboutTheInternship() {
        System.out.println("I posted optional information about the internship");
    }

    @Given("the representative is on the internship page")
    public void theRepresentativeIsOnTheInternshipPage() {
        System.out.println("I am on the internship page");
    }

    @And("the internship is open")
    public void theInternshipIsOpen() {
        System.out.println("The internship is open");
    }

    @When("the representative changes internship information")
    public void theRepresentativeChangesInternshipInformation() {
        System.out.println("I changed internship information");
    }

    @Then("the internship information is modified in the system")
    public void theInternshipInformationIsModifiedInTheSystem() {
        System.out.println("The internship information is modified in the system");
    }

    @Then("the system will close the internship post")
    public void theSystemWillCloseTheInternshipPost() {
        System.out.println("The system closed the internship post");
    }

    @When("the representative presses the close internship button")
    public void theRepresentativePressesTheCloseInternshipButton() {
        System.out.println("I pressed the close internship button");
    }

    @Given("the internship post is closed")
    public void theInternshipPostIsClosed() {
        System.out.println("The internship post is closed");
    }

    @When("the representative presses the delete internship button")
    public void theRepresentativePressesTheDeleteInternshipButton() {
        System.out.println("I pressed the delete internship button");
    }

    @Then("the system will delete the internship post")
    public void theSystemWillDeleteTheInternshipPost() {
        System.out.println("The system deleted the internship post");
    }
}
