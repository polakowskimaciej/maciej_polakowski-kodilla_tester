package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {
    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        //sprawdzamy czy numery użytkownika to wyjątek, czy nie?
        validateNumbers(userNumbers);
        //set integrów generujemy
        Set<Integer> computerNumbers = generateComputerNumbers();
        //liczymy od zera
        int count = 0;
        //jeśli numery generowane są zawarte w secie od uzytkownika dodajemy ilość wygranych
        //dla każdego numeru z setu
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
        //zwracamy ilość numerów uzytkownika zawartych w liczbach wygenerowanych przez komputer
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            //jeśli zły rozmiar lub spoza zakresu, rzucamy wyjątkiem
            throw new InvalidNumbersException();
        }
    }

    private boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        //zwraca true jeśli jakaś liczba spoza zakresu
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }

    private boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }
    //set integrów nie jest odpowiedniej długości jeśli jest różny od 6
    //true/false
    private Set<Integer> generateComputerNumbers() {
        //set integrów
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        //6 liczb
        while(numbers.size() < 6) {
            //od 1 do 49
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
        //zwraca set integrów
    }
}
