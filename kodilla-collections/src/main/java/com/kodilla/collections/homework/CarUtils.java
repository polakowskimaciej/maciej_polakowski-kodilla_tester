package com.kodilla.collections.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Renault;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }
    private static String getCarName(Car car) {
        if (car instanceof Honda)
            return "Honda";
        else if (car instanceof Renault)
            return "Renault";
        else if (car instanceof Skoda)
            return "Skoda";
        else
            return "Unknown car name";
    }
}
