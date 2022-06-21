public class SimpleArray {
    public static void main (String [] args) {
        String[] cats = new String[5];
        cats[0] = "Igorek";
        cats[1] = "Olunia";
        cats[2] = "Mafia";
        cats[3] = "Manikun czarny";
        cats[4] = "Manikun biały";
        String cat = cats[3];
        System.out.println(cat);
        int numberOfElements = cats.length;
        System.out.println("Moja tablica ma " + numberOfElements + " elementów.");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
        for (int i = cats.length -1; i >= 0; i--) {
            System.out.println(cats[i]);
        }
    }
}
