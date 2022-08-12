package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .mapToInt(user -> user.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);

    }
}
