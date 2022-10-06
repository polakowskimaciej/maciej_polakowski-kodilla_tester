package homework.wallet;

public class Wallet {
    private int balance =0;
    public Wallet() {

    }
    public void debit(int money) {
        this.balance -= money;
    }
    public void deposit(int money) {
        this.balance += money;
    }
    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                '}';
    }
}
