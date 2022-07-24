package com.kodilla.collections.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Renault;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(15)+1;
        Car[] cars = new Car[n];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
    public static Car drawCar(){
        Random random = new Random();
        int drawnCarType = random.nextInt(3);
        int a = random.nextInt(140+1 - 50) + 50;
        //random.nextInt(maxValue+1 - minValue) + minValue;
        if (drawnCarType == 0)
            return new Honda(a);
        else if (drawnCarType == 1)
            return new Renault(a);
        else {
            return new Skoda(a);
        }
    }
}
