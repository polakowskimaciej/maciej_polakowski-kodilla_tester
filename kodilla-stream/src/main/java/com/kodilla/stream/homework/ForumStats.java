package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static double averageOldUsersPosts() {
        int age = 40;
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }

    public static double averageYoungUsersPosts() {
        int age = 40;
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println("Average posts of users over 40 is: " + ForumStats.averageOldUsersPosts());
        System.out.println("Average posts of users 40 und under is: " + ForumStats.averageYoungUsersPosts());
    }
}
