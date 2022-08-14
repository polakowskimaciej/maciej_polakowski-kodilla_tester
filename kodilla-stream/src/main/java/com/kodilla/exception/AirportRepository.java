package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Modlin", true);
        airports.put("Lawica", true);
        airports.put("CPL", false);
        airports.put("Radom", true);
        return airports;
    }
    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();
    }
}
