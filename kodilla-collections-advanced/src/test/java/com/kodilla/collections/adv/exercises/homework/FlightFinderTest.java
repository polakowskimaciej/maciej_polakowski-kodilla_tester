package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    @Test
    public void testAddFlight() {
        //given
        FlightRepository flightTable = new FlightRepository();
        String city = "Szczecin";
        Flight flight = new Flight(city, "Poznan" );
        //when
        flightTable.addFlight(city,flight);
        //than
        assertEquals(1,flightTable.size());
    }

    @Test
    public void findFlightsFrom() {
        //given
        FlightRepository flightTable = new FlightRepository();
        flightTable.addFlight("Poznan", new Flight("Poznan","Warsaw" ));
        flightTable.addFlight("Poznan", new Flight("Poznan", "Szeczcin"));
        flightTable.addFlight("Poznan", new Flight("Poznan", "Berlin"));
        flightTable.addFlight("Warsaw", new Flight("Warsaw", "Poznan"));
        flightTable.addFlight("Warsaw", new Flight("Warsaw", "Berlin"));
        flightTable.addFlight("Warsaw", new Flight("Warsaw", "Szczecin"));
        flightTable.addFlight("Szczecin", new Flight("Szczecin", "Poznan"));
        flightTable.addFlight("Szczecin", new Flight("Szczecin", "Berlin"));
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Poznan");
        //than
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Poznan","Warsaw" ));
        expectedList.add(new Flight("Poznan", "Szeczcin"));
        expectedList.add(new Flight("Poznan", "Berlin"));
        assertEquals(expectedList,result);
    }

    @Test
    public void findFlightsTo() {
        //given
        FlightRepository flightTable = new FlightRepository();
        flightTable.addFlight("Poznan", new Flight("Poznan","Warsaw" ));
        flightTable.addFlight("Poznan", new Flight("Poznan", "Szczecin"));
        flightTable.addFlight("Poznan", new Flight("Poznan", "Berlin"));
        flightTable.addFlight("Warsaw", new Flight("Warsaw", "Poznan"));
        flightTable.addFlight("Warsaw", new Flight("Warsaw", "Berlin"));
        flightTable.addFlight("Warsaw", new Flight("Warsaw", "Szczecin"));
        flightTable.addFlight("Szczecin", new Flight("Szczecin", "Poznan"));
        flightTable.addFlight("Szczecin", new Flight("Szczecin", "Berlin"));
        FlightFinder flightFinder1 = new FlightFinder();
        //when
        List<Flight> result = flightFinder1.findFlightsTo("Szczecin");
        //than
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Szczecin"));
        expectedList.add(new Flight("Poznan", "Szczecin"));
        assertEquals(expectedList,result);
    }
}