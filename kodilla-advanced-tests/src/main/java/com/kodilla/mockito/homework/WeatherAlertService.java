package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherAlertService {
    private HashMap<Person, List<Location>> personLocationHashMap = new HashMap<>();

    public void addPerson(Person person, Location location) {
        List<Location> locationsList = personLocationHashMap.getOrDefault(person,new ArrayList<>());
        locationsList.add(location);
        this.personLocationHashMap.put(person, locationsList);
    }
    public void addLocation(Location location) {}

    public void removePersonFromLocation(Person person, Location location) {
        List<Location> locationsList = personLocationHashMap.getOrDefault(person,new ArrayList<>());
        locationsList.remove(location);
        this.personLocationHashMap.put(person, locationsList);
    }

    public void removePersonFromDataBase(Person person){}

    public void removeLocation(Location location){}
    //do osób obserwujących daną lokalizację – powiadomienie np. o zagrożeniu gradem.
    public void sendAlertToLocation(Alert alert, Location location) {
        List<Person> peoplefromlocation = personLocationHashMap.entrySet()
                .stream()
                .filter(personLocationEntry -> personLocationEntry.getValue().contains(location))
                .map(personLocationEntry -> personLocationEntry.getKey())
                .collect(Collectors.toList());
        peoplefromlocation.forEach(person -> person.recieve(alert));
    }
    //do wszystkich osób – informacje np. o zmieniającym się regulaminie,
    public void sendAlertToAll(Alert alert) {}

}
