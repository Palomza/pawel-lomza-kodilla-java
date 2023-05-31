package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Task example 1");
        board.getInProgressList().addTask("Task example 2");
        board.getDoneList().addTask("Task example 3");

        //Then
        Assertions.assertEquals("Task example 1", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("Task example 2", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Task example 3", board.getDoneList().getTasks().get(0));

    }
}
