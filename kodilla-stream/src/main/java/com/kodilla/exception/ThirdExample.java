package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isCPLInUse;
        try {
            isCPLInUse = airportRepository.isAirportInUse("CPL");
            System.out.println("CPL status: " + isCPLInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, we don't serve this airport");
        } finally {
            System.out.println("Thank You For Using Crapshit Airlines");
        }
    }
}