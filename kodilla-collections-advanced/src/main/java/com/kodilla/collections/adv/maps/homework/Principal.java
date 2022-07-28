package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String Name;

    public Principal(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(Name, principal.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
