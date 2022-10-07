package homework.wallet;

public class CashSlot {
    protected int contents;

    public int getContents() {
        return contents;
    }

    protected int dispense(int amount) {
        this.contents = amount;
        return amount;
    }

}
