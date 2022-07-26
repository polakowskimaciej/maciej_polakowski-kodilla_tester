package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamps> stamps = new HashSet<>();
        stamps.add(new Stamps("Poland", 5.00,5.00,true));
        stamps.add(new Stamps("Germany", 7.00,4.00,false));
        stamps.add(new Stamps("Denmark", 3.00,5.00, true));
        stamps.add(new Stamps("Poland", 5.00,5.00,true));

        System.out.println(stamps.size());
        for (Stamps stamp : stamps)
            System.out.println(stamp);
    }
}
