package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "null";
        String [] nameparts = username.split(" ");
        System.out.println("Firstname: " + nameparts[0]);
        System.out.println("lastname: " + nameparts[1]);

    }
}
