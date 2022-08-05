package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    static Map<String, List<Flight>> flightsTable = new HashMap<>();

    public void addFlight(String city, Flight flight) {
        List<Flight> flights = flightsTable.getOrDefault(city, new ArrayList<>());
        flights.add(flight);
        flightsTable.put(city,flights);
    }
    public static Map<String, List<Flight>> getFlightsTable(){
        return flightsTable;
    }
    public int size() {return flightsTable.size();}
}
