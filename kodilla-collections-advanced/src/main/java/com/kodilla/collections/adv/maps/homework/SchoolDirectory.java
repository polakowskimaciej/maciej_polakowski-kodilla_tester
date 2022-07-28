package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalSchoolMap = new HashMap<>();

        Principal principal1 = new Principal("Principal 1");
        Principal principal2 = new Principal("Principal 2");
        Principal principal3 = new Principal("Principal 3");

        School principal1School = new School("School 1", List.of(15, 20, 18));
        School principal2School = new School("School 2", List.of(16, 14, 20));
        School principal3School = new School("School 3", List.of(10, 24, 19));

        principalSchoolMap.put(principal1, principal1School);
        principalSchoolMap.put(principal2, principal2School);
        principalSchoolMap.put(principal3, principal3School);

        for (Map.Entry<Principal, School> principalSchoolEntry : principalSchoolMap.entrySet()) {
            System.out.println(principalSchoolEntry.getKey().getName() + " is principal in School: " + principalSchoolEntry.getValue().getSchoolName() + ". Total number of students in " + principalSchoolEntry.getValue().getSchoolName() + " is: " + principalSchoolEntry.getValue().getSum());
        }
    }
}
