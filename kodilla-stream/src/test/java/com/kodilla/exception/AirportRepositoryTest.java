package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTest {

    @Test
    void isAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Modlin");
        // then
        assertTrue(isWarsawInUse);
    }
    @Test
    public void testIsAirportInUse_withException() {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        // then
        assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"));
    }
}