package homework.wallet;

public class CashSlot {
    private int contents;

    public int getContents() {
        return contents;
    }
    public int dispense(int amount) throws NullPointerException {
        return this.contents = amount;
    }
    public String doNotDispense() {
        return "null";
    }

}
