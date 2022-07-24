package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Honda honda = new Honda(100);
        doRace(honda);

        Renault renault = new Renault(90);
doRace(renault);
        Skoda skoda = new Skoda(105);
    doRace(skoda);
    }
    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
