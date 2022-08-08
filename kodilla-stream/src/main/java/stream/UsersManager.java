package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }
    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }
    public static List<User> getUsersOlderThan(int age) {
        List<User> usersOlderThan = UsersRepository.getUsersList()
                .stream()
                .filter(userAge -> userAge.getAge() > age)
                .collect(Collectors.toList());

        return usersOlderThan;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static List<String> publicfilterChemistGroupUsernames() {
        return filterChemistGroupUsernames();
    }
    public static List<User> filterIfUserPosted() {
        List<User> usersWhoPosted = UsersRepository.getUsersList()
                .stream()
                .filter(numberOfPost -> numberOfPost.getNumberOfPost() != 0)
                .collect(Collectors.toList());
        return usersWhoPosted;
    }
    public static int getSumOfPosts() {
        List<User> users = UsersRepository.getUsersList();
        Integer sum = users
                .stream()
                .filter(nrOfPosts -> nrOfPosts.getNumberOfPost() > 0).mapToInt(User::getNumberOfPost).sum();
        return sum;
    }
    public static List<String> sortUsersFromOldest() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .sorted(Comparator.comparingInt(User::getAge).reversed())
                .map(User::getUsername)
                .collect(Collectors.toList());
return usernames;
    }
}
