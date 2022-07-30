package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        BookHacked book = new BookHacked("John Stewart", "The last chance");
        BookHacked bookHacked = book;
        bookHacked.modifyTitle("Hacked Title");
        System.out.println(book.getTitle());
    }
}
