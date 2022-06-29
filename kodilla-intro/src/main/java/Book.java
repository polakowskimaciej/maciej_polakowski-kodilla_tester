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
        Book book = new Book(author, title);
    //wywołać konstruktor
        return book;
    }

}
