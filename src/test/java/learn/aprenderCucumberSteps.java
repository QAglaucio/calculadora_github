package learn;

import io.cucumber.java.en.*;
import org.junit.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class aprenderCucumberSteps {
    @Given("the file was created correctly")
    public void theFileWasCreatedCorrectly() {

    }

    @When("it's executed")
    public void itsExecuted() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("the specification should end with success")
    public void theSpecificationShouldEndWithSuccess() {
        // Write code here that turns the phrase above into concrete actions
    }




    @Given("that my purchase is to be delivered in {int}\\/{int}\\/{int}")
    public void thatMyPurchaseIsToBeDeliveredIn(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the delivery gets late by {int} days")
    public void the_delivery_gets_late_by_days(Integer int1) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("the delivery will be finished in {int}\\/{int}\\/{int}")
    public void the_delivery_will_be_finished_in(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}