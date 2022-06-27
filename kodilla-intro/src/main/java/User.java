public class User {
    //wiek zawarty w klasie
    private int age;
    //imię zawarte w klasie
    private String name;

    // konstruktor
    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // getter do imienia
    public String getName() {
        return (this.name);
    }

    //getter do wieku
    public int getAge() {
        return (this.age);
    }

    //metoda main do dodania obiektów,tablicy, wyświetleń
}