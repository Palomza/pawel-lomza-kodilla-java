package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void makeALog() {
        logger = Logger.INSTANCE;
        logger.log("A simple log");
    }

    @Test
    void testGetLastLog(){
        //Given
        //When
        String log = logger.getLastLog();
        //Then
        Assertions.assertEquals("A simple log", log);
    }
}
