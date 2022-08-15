package com.kodilla.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }
    private static List<String> filterChemistGroupUsernames() {

        return UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }
    public static List<User> getUsersOlderThan(int age) {

        return UsersRepository.getUsersList()
                .stream()
                .filter(userAge -> userAge.getAge() > age)
                .collect(Collectors.toList());
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static List<String> publicfilterChemistGroupUsernames() {
        return filterChemistGroupUsernames();
    }
    public static List<User> filterIfUserPosted() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(numberOfPost -> numberOfPost.getNumberOfPost() != 0)
                .collect(Collectors.toList());
    }
    public static int getSumOfPosts() {
        List<User> users = UsersRepository.getUsersList();
        return users
                .stream()
                .filter(nrOfPosts -> nrOfPosts.getNumberOfPost() > 0).mapToInt(User::getNumberOfPost).sum();
    }
    public static List<String> sortUsersFromOldest() {
        return UsersRepository.getUsersList()
                .stream()
                .sorted(Comparator.comparingInt(User::getAge).reversed())
                .map(User::getUsername)
                .collect(Collectors.toList());
    }
}
