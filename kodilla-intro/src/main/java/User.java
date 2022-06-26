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
    public static void main(String[] args) {
        User maciej = new User(30, "Maciej");
        User michal = new User(15, "Michał");
        User kasia = new User(20, "Kasia");
        User grzegorz = new User(40, "Grzegorz");
        User halina = new User(50, "Halina");
        User[] users = {maciej, michal, kasia, grzegorz, halina};
        //tablica obiektów,
//obliczenie średniej
        int result = 0;
        for (int i = 0; i < users.length; i++) { //dla każedej wartości i od zera i mniejszej od długości tablicy, dodajemy jeden
            result = result + users[i].getAge(); //w końcu ogarnąłem jak odnieść się do getAge() dla każdego użytkownika w każdej iteracji
        }
        int average = result / users.length;
        //wyświetlanie użytkowników młodszych niż średnia
        System.out.println("Users younger than average:");
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < average) {
                System.out.println(users[i].getName() + " age: " + users[i].getAge());
            }

        }

    }
}