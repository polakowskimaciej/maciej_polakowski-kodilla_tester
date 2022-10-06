package homework.wallet;

public class CashSlot {
    private int contents;

    public int getContents() {
        return contents;
    }
    public void dispense(int amount) {
        this.contents = amount;
    }
    public String doNotDispense() {
        return "null";
    }
}
