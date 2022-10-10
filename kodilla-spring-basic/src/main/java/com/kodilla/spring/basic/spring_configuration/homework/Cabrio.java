package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn(boolean lights) {
        return lights;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
