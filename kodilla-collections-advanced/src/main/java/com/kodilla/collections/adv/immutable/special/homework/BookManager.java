package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static List<Book> library = new ArrayList<>();



    public static Book createBook(String title, String author) {
        // sprawdzić trzeba całą kolekcję
        // dla każdej książki z biblioteki
        for (Book book : library) {
            // ok, co porównuję z czym?
            // sprawdź, czy obiekt jest taki sam, czyli
            // oba pola to String więc wystarczy == bo Java przechowuje String w tym samym obiekcie
            // jak tytuł równy
            if (title.equals(book.getTitle()) && author.equals(book.getAuthor()))
                // i jak autor równy
                break;
        else {library.add(new Book(title,author));
        }
        }
                    // przerwij działanie pętli
            return new Book(title,author);
    }

    public static List<Book> getLibrary() {
        return library;
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "library=" + library +
                '}';
    }

}
