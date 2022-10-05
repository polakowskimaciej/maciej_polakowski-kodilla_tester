package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DivideSteps implements En {
    private String answer;
    private int anInt;

    public DivideSteps() {
        Given("3", () -> {
            // Write code here that turns the phrase above into concrete actions

        });
        Given("5", () -> {
            // Write code here that turns the phrase above into concrete actions

        });
        Given("15", () -> {
            // Write code here that turns the phrase above into concrete actions

        });
        Given("8", () -> {
            // Write code here that turns the phrase above into concrete actions

        });
        When("^I ask if it's divisible by three and/or divisible by five$", () -> {
            // Write code here that turns the phrase above into concrete actions
            //DivideChecker divideChecker = new DivideChecker();
            this.answer = DivideChecker.checkDivisability(this.anInt);
        });
        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.answer);
        });

    }
}

