package com.kodilla.collections.interfaces.homework;

public class Renault implements Car {
    int speed;
    public Renault(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 5;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 15;
    }
}
