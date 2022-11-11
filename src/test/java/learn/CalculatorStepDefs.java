package learn;

import org.junit.Assert;

import br.com.vericode.data.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {
    double result = 0;
    int num1 = 0, num2 = 0;

    @Given("that there is two numbers {int} and {int}")
    public void that_there_is_two_numbers_and(Integer int1, Integer int2) {
        num1 = int1;
        num2 = int2;
        System.out.println("Given");
    }

    @When("we sum up them")
    public void we_sum_up_them() {
        Calculator cal = new Calculator();
        result = cal.sum(num1, num2);
        System.out.println("When");
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {
        Assert.assertEquals("The sum result isn't correct.", result, (int) int1);
        System.out.println("Then");
    }
}
