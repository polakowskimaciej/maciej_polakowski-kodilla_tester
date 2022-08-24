package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonSources {

    private static List<Person> people = new ArrayList<>();

    static Stream<Arguments> providePersonForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.80, 70),"Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 60), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 50),"Severely underweight"),
                Arguments.of(new Person(1.80, 40), "Very severely underweight"),
                Arguments.of(new Person(1.80, 90), "Overweight"),
                Arguments.of(new Person(1.80, 100), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.80, 110), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.80, 120), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.80, 130), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.80, 140), "Obese Class III (Very severely obese)")
        );
    }

    public static List<Person> getPersonList() {
        people.add(new Person(1.80, 70));
        people.add(new Person(1.80, 60));
        people.add(new Person(1.80, 50));
        people.add(new Person(1.80, 40));
        people.add(new Person(1.80, 90));
        people.add(new Person(1.80, 100));
        people.add(new Person(1.80, 110));
        people.add(new Person(1.80, 120));
        people.add(new Person(1.80, 130));
        people.add(new Person(1.80, 140));
        return people;
    }

    public static void main(String[] args) {
        getPersonList();
        for (Person person : people)
            System.out.println(person.getBMI());
    }
}
