package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
Book hyperion = BookManager.createBook("Hyperion", "Dan Simmons");
Book hereticsOfDune = BookManager.createBook("Heretics of Dune", "Frank Herbert");
Book SndFoundation = BookManager.createBook("The Second Foundation", "Isaac Asimov");
System.out.println(hyperion == hereticsOfDune);
        System.out.println(hereticsOfDune == SndFoundation);
        System.out.println(SndFoundation == hyperion);
Book wrongHyperion = BookManager.createBook("Hyperion", "Dan Simmons");
        System.out.println(hyperion == wrongHyperion);
        System.out.println(hyperion.hashCode() == wrongHyperion.hashCode());
    }
}
