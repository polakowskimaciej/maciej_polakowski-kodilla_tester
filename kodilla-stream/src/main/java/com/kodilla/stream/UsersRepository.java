package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    private static List<User> users = new ArrayList<>();

    public static List<User> getUsersList() {
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }

    public void cleanRepository() {
        users.clear();
    }
}
