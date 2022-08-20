package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"polakowski", "igorek", "mafia.kotek.666", "oluniaburykotek"})
    void shouldValidateUsernameTestPositive(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"po", "//igorek", "mafia^^kotek", "olunia   bury   kotek"})
    void shouldValidateUsernameTestPositivNegative(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"polakowski@maciej.pl", "igorek@kotek.pl", "mafia.kotek@tricolor.com", "olunia@burykotek.pl"})
    void shouldValidateEmailTestPositive(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"polakowski    @maciej.pl", "igorek@kotek.pl.kot.glodny@3", "mafia.kotek@trójcolor.com", "olunia@burykotek.pl$$$"})
    void shouldValidateEmailTestNegative(String input) {
        assertFalse(userValidator.validateEmail(input));
    }
}