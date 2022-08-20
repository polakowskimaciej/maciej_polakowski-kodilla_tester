package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/UserNumbers.csv", delimiter = ':')
    void howManyWinsTestCorrectNumbers(String input) {
        String[] tokens = input.split(",");
        Set<String> stringSetSet = new HashSet<>(Arrays.asList(tokens));
        Set<Integer> intList = stringSetSet.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(intList));
    }
}