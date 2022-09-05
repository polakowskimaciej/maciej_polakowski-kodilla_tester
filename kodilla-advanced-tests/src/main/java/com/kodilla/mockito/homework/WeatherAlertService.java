package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherAlertService {
    private HashMap<Person, List<Location>> personLocationHashMap = new HashMap<>();

    public void addPerson(Person person, Location location) {
        List<Location> locationsList = personLocationHashMap.getOrDefault(person, new ArrayList<>());
        locationsList.add(location);
        this.personLocationHashMap.put(person, locationsList);
    }

    public void removePersonFromLocation(Person person, Location location) {
        List<Location> locationsList = personLocationHashMap.getOrDefault(person, new ArrayList<>());
        locationsList.remove(location);
        this.personLocationHashMap.put(person, locationsList);
    }

    public void removePersonFromDataBase(Person person) {
        this.personLocationHashMap.remove(person);
    }

    public void removeLocation(Location location) {
        //usunąć lokalizację dla każdego key person który ją zawiera
        for (Map.Entry<Person, List<Location>> personListEntry :
                personLocationHashMap.entrySet()) {
            removePersonFromLocation(personListEntry.getKey(), location);
        }
    }

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
    public void sendAlertToAll(Alert alert) {
        List<Person> everyone = personLocationHashMap.entrySet().stream().map(personListEntry -> personListEntry.getKey()).collect(Collectors.toList());
        everyone.forEach(person -> person.recieve(alert));
    }

}
