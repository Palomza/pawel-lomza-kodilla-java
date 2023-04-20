package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SecondChallengeTestSuite {

    @Test
    void testProbablyWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when & then
        //For correct x and wrong y
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.99, 1.5));

        //For wrong x and correct y
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.51));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.49));

        //For correct x and y
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 1.49));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 1.51));
    }
}
