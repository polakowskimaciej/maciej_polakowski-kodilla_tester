package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Renault;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.homework.CarUtils;

import java.util.LinkedList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Honda(100));
        cars.add(new Renault(80));
        cars.add(new Skoda(140));

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(2);
        Honda honda = new Honda(100);
        cars.remove(honda);
        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
