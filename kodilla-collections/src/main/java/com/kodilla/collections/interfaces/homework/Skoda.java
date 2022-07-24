package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {
    int speed;
    public Skoda(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 20;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 5;
    }
}