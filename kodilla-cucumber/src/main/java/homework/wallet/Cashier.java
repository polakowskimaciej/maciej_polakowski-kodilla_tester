package homework.wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public int withdraw(Wallet wallet, int amount) {
        wallet.debit(amount);
        if (amount > wallet.getBalance()) {
            cashSlot.doNotDispense();
            return 0;
        } else if (amount == 0) {
            cashSlot.doNotDispense();
            return 0;
        }
            return cashSlot.dispense(amount);

    }


    public void checkBalance(Wallet wallet) {
        wallet.getBalance();
    }
}
