import java.util.Scanner;

public class BookDialog {
    public static String getAuthor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {                                            // [2]
            System.out.println("Enter Book author:");                // [3]
            String author = scanner.nextLine().trim();               // [4]
            if (author.length() >= 2) {                              // [5]
                return author;
            }
            System.out.println("Author Name is too short. Try again.");
        }
    }

    public static String getTitle() {
        while (true) {                                            // [2]
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Book title:");                // [3]
            String title = scanner.nextLine().trim();               // [4]
            if (title.length() >= 2) {                              // [5]
                return title;
            }
            System.out.println("Title is too short. Try again.");
        }
    }
}
