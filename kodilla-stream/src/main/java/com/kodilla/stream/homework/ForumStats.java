package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double averageOldUsersPosts(List<User> userlList, int age) {
        return userlList
                .stream()
                .filter(user -> user.getAge() >= age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }

    public static double averageYoungUsersPosts(List<User> userList, int age) {
        return userList
                .stream()
                .filter(user -> user.getAge() < age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        List<User> userlList = UsersRepository.getUsersList();
        System.out.println("Average posts of users over 40 is: " + ForumStats.averageOldUsersPosts(userlList, 40));
        System.out.println("Average posts of users 40 und under is: " + ForumStats.averageYoungUsersPosts(userlList, 40));
    }
}
