public class Color {
    public static void main(String[] args) {
       ColorDialog color = new ColorDialog();
        String result = color.getUserColor();
        System.out.println("Result: " + result);
    }
}
