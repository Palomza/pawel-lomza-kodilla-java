package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class BoardTestSuite {

    @Test
    void testTaskAddToDoList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Task example 1");

        //Then
        Assertions.assertEquals("Task example 1", board.getToDoList().getTasks().get(0));

    }

    @Test
    void testTaskAddInProgressList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getInProgressList().addTask("Task example 2");

        //Then
        Assertions.assertEquals("Task example 2", board.getInProgressList().getTasks().get(0));

    }

    @Test
    void testTaskAddDoneList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().addTask("Task example 3");

        //Then
        Assertions.assertEquals("Task example 3", board.getDoneList().getTasks().get(0));

    }
}
