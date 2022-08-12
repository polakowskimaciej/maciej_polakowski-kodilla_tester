package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    //klasa z listą nowych użytkowników
    public static List<User> newUserList() {
        List<User> usersList = UsersRepository.getUsersList();
        usersList.clear();
        usersList.add(new User("Mafia", 50, 10, "Cats"));
        usersList.add(new User("Igorek", 25, 2000, "Cats"));
        usersList.add(new User("Olga", 34, 100, "Cats"));
        usersList.add(new User("Celina", 49, 10, "Fetuses"));
        return usersList;
    }

    //tutaj zwykłe testy dla średniej z kolekcji UsersRepository
    @Test
    void averageOldUsersPostsTest() {

        double result = ForumStats.averageOldUsersPosts();
        assertEquals(2.25, result);
    }

    @Test
    void averageYoungUsersPostsTest() {
        double result = ForumStats.averageYoungUsersPosts();
        assertEquals(2382.00, result);
    }
}