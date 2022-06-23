public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        Notebook Dell = new Notebook(600,1500, 2010);
        System.out.println("Dell.weight: " + Dell.weight);
        System.out.println("Dell.price: " + Dell.price);
        System.out.println("Dell's weight & price: " + Dell.weight + " " + Dell.price);
        Dell.priceCheck();
        Dell.weightCheck();
        Dell.ageCheck();
        Notebook heavyNotebook = new Notebook(2000, 1000, 2015);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight);
        System.out.println("heavyNotebook.price: " + heavyNotebook.price);
        System.out.println("heavyNotebook's weight & price: " + heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.priceCheck();
        heavyNotebook.weightCheck();
        heavyNotebook.ageCheck();
        Notebook oldNotebook = new Notebook(1200, 600, 1992);
        System.out.println("oldNotebook.weight: " + oldNotebook.weight);
        System.out.println("oldNotebook.price: " + oldNotebook.price);
        System.out.println("oldNotebook's weight & price: " + oldNotebook.weight + " " +  oldNotebook.price);
        oldNotebook.priceCheck();
        oldNotebook.weightCheck();
        oldNotebook.ageCheck();
        Notebook cheapNotebook = new Notebook(900, 450, 2021);
        System.out.println("cheapNotebook.weight: " + cheapNotebook.weight);
        System.out.println("cheapNotebook.price: " + cheapNotebook.price);
        System.out.println("cheapNotebook's weight & price: " + cheapNotebook.weight + " " +  oldNotebook.price);
        cheapNotebook.priceCheck();
        cheapNotebook.weightCheck();
        cheapNotebook.ageCheck();
    }
}