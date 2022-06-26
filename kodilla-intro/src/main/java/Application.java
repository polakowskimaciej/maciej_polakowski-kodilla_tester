public class Application {
    private double age;
    private double height;
    private String name;

    public Application(double age,   double height, String name)

    {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    private double applicationGetAge() {
        return (this.age);
    }

    private double applicationGetHeight() {
        return (this.height);
    }

    private String applicationGetName() {
        return (this.name);
    }
public void heightCheck () {
    if (name != null) {
        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}
    public static void main(String[] args) {
        Application adam = new Application(40.5,178.00, "Adam");
        adam.heightCheck();
    }
}
