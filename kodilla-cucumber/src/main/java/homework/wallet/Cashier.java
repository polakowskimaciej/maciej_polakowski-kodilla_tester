package homework.wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance()) {
            cashSlot.doNotDispense();
        } else if (amount == 0) {
            cashSlot.doNotDispense();
        } else {
            cashSlot.dispense(amount);
        }
    }

}
