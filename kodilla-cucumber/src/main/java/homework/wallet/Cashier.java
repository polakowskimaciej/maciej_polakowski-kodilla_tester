package homework.wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public int withdraw(Wallet wallet, int amount) {
        wallet.debit(amount);
        if (amount > wallet.getBalance()
                || amount <= 0) {
            return 0;
        }
        return cashSlot.dispense(amount);
    }
}