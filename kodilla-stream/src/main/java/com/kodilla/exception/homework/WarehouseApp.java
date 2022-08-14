package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        //W metodzie main dodaj kilka zamówień do hurtowni przy pomocy metody addOrder(),
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("12345"));
        warehouse.addOrder(new Order("007"));
        warehouse.addOrder(new Order("6969"));
        // a następnie spróbuj wyszukać jakieś nieistniejące zamówienie.
        try {
            System.out.println(warehouse.getOrder("666"));
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found");
        } finally {
            System.out.println("Thank You for using MaciejWarehouse");
        }
        // Przygotuj odpowiednią obsługę błędów.
    }
}
