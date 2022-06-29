public class Book {
    private String author;
    private String title;
    //konstruktor
private Book (String author, String title) {
    this.author = author;
    this.title = title;
}

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }
//metoda of robiąca to samo co konstruktor
    public static Book of(String author, String title) {
    //wywołać konstruktor
        return new Book(author, title);
    }

    @Override
    public String toString() {
       super.toString();
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
