import java.util.Scanner;

public class ColorDialog {
    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type First letter of Your color (W - White, B - Black, R - Red, G - Green)");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "W": return "White";
                case "B": return "Black";
                case "R": return "Red";
                case "G": return "Green";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }

}
