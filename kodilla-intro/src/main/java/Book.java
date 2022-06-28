public class Book {
    private String author;
    private String title;

    public String getTitle() {
        return title;
    }
    public String getAuthor() {return author;}

    public static Book of(String author, String title) {
                return new Book(Book.getTitle(),Book.getAuthor());
    }

}
