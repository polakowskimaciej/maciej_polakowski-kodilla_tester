package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void testAddFlight() {
        //given
        FlightRepository flightRepository = new FlightRepository();
        //when
        flightRepository.addFlight("Poznan", new Flight("Poznan", "Warsaw"));
        flightRepository.addFlight("Poznan", new Flight("Poznan", "Szczecin"));
        flightRepository.addFlight("Poznan", new Flight("Poznan", "Berlin"));
        flightRepository.addFlight("Warsaw", new Flight("Warsaw", "Poznan"));
        flightRepository.addFlight("Warsaw", new Flight("Warsaw", "Berlin"));
        flightRepository.addFlight("Warsaw", new Flight("Warsaw", "Szczecin"));
        flightRepository.addFlight("Szczecin", new Flight("Szczecin", "Poznan"));
        flightRepository.addFlight("Szczecin", new Flight("Szczecin", "Berlin"));
        //than
        assertEquals(3, flightRepository.size());
        flightRepository.cleanFlightRepository();
    }

    @Test
    public void findFlightsFrom() {
        //given
        FlightRepository flightRepository = new FlightRepository();
        //when
        flightRepository.addFlight("Poznan", new Flight("Poznan", "Warsaw"));
        flightRepository.addFlight("Poznan", new Flight("Poznan", "Szczecin"));
        flightRepository.addFlight("Poznan", new Flight("Poznan", "Berlin"));
        flightRepository.addFlight("Warsaw", new Flight("Warsaw", "Poznan"));
        flightRepository.addFlight("Warsaw", new Flight("Warsaw", "Berlin"));
        flightRepository.addFlight("Warsaw", new Flight("Warsaw", "Szczecin"));
        flightRepository.addFlight("Szczecin", new Flight("Szczecin", "Poznan"));
        flightRepository.addFlight("Szczecin", new Flight("Szczecin", "Berlin"));
        FlightFinder flightFinder1 = new FlightFinder();
        //when
        List<Flight> result1 = flightFinder1.findFlightsFrom("Poznan");
        //than
        List<Flight> expectedList1 = new ArrayList<>();
        expectedList1.add(new Flight("Poznan", "Warsaw"));
        expectedList1.add(new Flight("Poznan", "Szczecin"));
        expectedList1.add(new Flight("Poznan", "Berlin"));
        assertEquals(expectedList1, result1);
        flightRepository.cleanFlightRepository();
    }
    @Test
    public void findFlightsTo() {
        FlightRepository flightRepository = new FlightRepository();
        //when
        flightRepository.addFlight("Poznan", new Flight("Poznan", "Warsaw"));
        flightRepository.addFlight("Poznan", new Flight("Poznan", "Szczecin"));
        flightRepository.addFlight("Poznan", new Flight("Poznan", "Berlin"));
        flightRepository.addFlight("Warsaw", new Flight("Warsaw", "Poznan"));
        flightRepository.addFlight("Warsaw", new Flight("Warsaw", "Berlin"));
        flightRepository.addFlight("Warsaw", new Flight("Warsaw", "Szczecin"));
        flightRepository.addFlight("Szczecin", new Flight("Szczecin", "Poznan"));
        flightRepository.addFlight("Szczecin", new Flight("Szczecin", "Berlin"));
        FlightFinder flightFinder2 = new FlightFinder();
        //when
        List<Flight> result2 = flightFinder2.findFlightsTo("Poznan");
        //than
        List<Flight> expectedList2 = new ArrayList<>();
        expectedList2.add(new Flight("Szczecin", "Poznan"));
        expectedList2.add(new Flight("Warsaw", "Poznan"));
        assertEquals(expectedList2, result2);
        flightRepository.cleanFlightRepository();
    }
}