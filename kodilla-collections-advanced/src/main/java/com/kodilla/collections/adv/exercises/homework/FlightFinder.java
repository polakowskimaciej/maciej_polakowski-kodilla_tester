package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        return FlightRepository.getFlightsTable().getOrDefault(departure, Collections.emptyList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Map.Entry<String, List<Flight>> flights : FlightRepository.getFlightsTable().entrySet())
            for (Flight flight : flights.getValue())
                if (flight.getArrival().equals(arrival))
                    result.add(flight);
return result;
    }
}
