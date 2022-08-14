package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    static List<Order> orderList = new ArrayList<>();

    //Napisz metody addOrder(Order order) – dodającą zamówienie do kolekcji
    public void addOrder(Order order) {
        orderList.add(order);
    }

    //metodę Order getOrder(String number), która wyszuka w kolekcji zamówienie o podanym numerze
    // (użyj Stream) i je zwróci.
    //W przypadku braku zamówienia w kolekcji rzuć wyjątkiem stworzonym w kroku pierwszym.
    public Order getOrder(String number) throws OrderDoesntExistException {
        //zwracamy Order o numerze
        //zmienna
        //albo nic nie znajdzie
                //zwracam zamówienie
            return orderList.stream()
                    //w kolekcji szukam zamówienia o danym numerze
                    //numer ma się równać numerowi z metory get number
                    .filter(order -> number.equals(order.getNumber(number)))
                    //pierwszy który ma ten numer
                    .findFirst()
                    .orElseThrow(OrderDoesntExistException::new);

    }
}
