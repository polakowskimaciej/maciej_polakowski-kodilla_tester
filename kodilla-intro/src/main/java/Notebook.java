public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void priceCheck() {
        if (this.price < 600) {
            System.out.println("This laptop is cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good!");
        } else {
            {
                System.out.println("This laptop is expensive.");
            }
        }
    }

    public void weightCheck() {
        if (this.weight < 800) {
            System.out.println("Light as a feather!");
        } else if (this.weight < 1600) {
            System.out.println("Not that comfortable to carry around.");
        } else {
            System.out.println("Shit's heavy AF!");
        }
    }

    public void ageCheck() {
        if (this.price < 600 && this.year < 2000) {
            System.out.println("It's old, but at least cheap");
        } else if (this.price < 600 && this.year > 2000) {
            System.out.println("New and cheap - check if not broken");
        } else if (this.price < 1000 && this.year < 2000) {
            System.out.println("Standard price for this age");
        } else if (this.price < 1000 && this.year > 2000) {
            System.out.println("On the pricey side, but ok");
        } else if (this.price >= 1000 && this.year < 2000) {
            System.out.println("Is it an antique?");
        } else if (this.price >= 1000 && this.year > 2000) {
            System.out.println("Expensive even for a new one");
        } else {
            System.out.println("Condition not considered");
        }
    }
}