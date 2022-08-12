package stream;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    void filterChemistGroupUsernamesTest() {
        //given
        //when
        List<String> result = UsersManager.publicfilterChemistGroupUsernames();
        //then
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        assertEquals(result, expectedList);
    }

    @Test
    void getUsersOlderThanTest() {
        List<User> result = UsersManager.getUsersOlderThan(45);
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(result, expectedList);
    }

    @Test
    void getUsersOlderThanTest2() {
        List<User> result = UsersManager.getUsersOlderThan(50);
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(result, expectedList);
    }

    @Test
    void getUsersOlderThanTest3() {
        List<User> result = UsersManager.getUsersOlderThan(30);
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(result, expectedList);
    }
    @Test
    void filterIfUserPostedTest() {
        List<User> result = UsersManager.filterIfUserPosted();
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        expectedList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        assertEquals(result,expectedList);
    }
    @Test
    void getSumOfPostsTest() {
        int result = UsersManager.getSumOfPosts();
        int expectedResult = 7 + 4648 + 116 + 2;
        assertEquals(expectedResult,result);
    }
    @Test
    void sortUsersFromOldestTest() {
        List<String> result = UsersManager.sortUsersFromOldest();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Mike Ehrmantraut");
        expectedList.add("Walter White");
        expectedList.add("Gus Firing");
        expectedList.add("Gale Boetticher");
        expectedList.add("Tuco Salamanca");
        expectedList.add("Jessie Pinkman");
        assertEquals(result,expectedList);
    }
}