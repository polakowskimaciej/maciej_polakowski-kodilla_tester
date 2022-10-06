package wallet;

import homework.wallet.CashSlot;
import homework.wallet.Cashier;
import homework.wallet.Wallet;
import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    int amount;
    String string;

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            // Write code here that turns the phrase above into concrete actions

            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        When("I request $30", () -> {
            // Write code here that turns the phrase above into concrete actions
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(30, cashSlot.getContents());
        });
        When("^I request wrong 0$", () -> {
            this.amount = 0;
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, amount);
        });
        When("^I request wrong 230$", () -> {
            this.amount = 230;
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, amount);
        });
        When("^I request wrong -20$", () -> {
            this.amount = -20;
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, amount);
        });
        Then("^I should b`e told null$", () -> {
            this.string = cashSlot.doNotDispense();
            Assert.assertEquals("null", string);
        });
    }
}