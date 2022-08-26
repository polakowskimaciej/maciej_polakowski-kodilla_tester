package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertServiceTest {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Alert alert = Mockito.mock(Alert.class);
    //Osoba zainteresowana może
    //zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia.

    @Test
    void sendAlertToLocationTest() {
        //given - osoba dodana do lokalizacji


        weatherAlertService.addPerson(person,location);
        //when - wysle powiadomienie

        weatherAlertService.sendAlertToLocation(alert,location);
        //than - osoba otrzyma powiadomienie
        Mockito.verify(person).recieve(alert);
    }

    @Test
    void addLocation() {
    }

    @Test
    void removePersonFromLocation() {
        //Można wycofać subskrypcję z danej lokalizacji
        weatherAlertService.addPerson(person,location);
        weatherAlertService.addPerson(person,location2);
        //given - dwie lokalizacje
        //when - usuwam lok. wysyłam alert do dwóch lok
        weatherAlertService.removePersonFromLocation(person,location);
        weatherAlertService.sendAlertToLocation(alert,location);
        weatherAlertService.sendAlertToLocation(alert,location2);
        //than - osoba dostaje jeden alert
        Mockito.verify(person, Mockito.atMostOnce()).recieve(alert);
    }

    @Test
    void removePersonFromDataBase() {
    }

    @Test
    void removeLocation() {
    }

    @Test
    void sendAlertToLocation() {
    }

    @Test
    void sendAlertToAll() {
    }


    //Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
    //Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
    //Możliwość wysyłki powiadomienia do wszystkich.
    //Możliwość skasowania danej lokalizacji.

}