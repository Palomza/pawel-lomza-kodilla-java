package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TaskFactoryTestSuite {

    private static TaskFactory taskFactory;

    @BeforeAll
    public static void setTaskFactory() {
        taskFactory = new TaskFactory();
    }


    @Test
    void testFactoryShoppingTask() {
        //Given
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        System.out.println(shopping);
        Assertions.assertEquals("Shopping task", shopping.getTaskName());

    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        System.out.println(painting);
        Assertions.assertEquals("Painting task", painting.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        System.out.println(driving);
        Assertions.assertEquals("Driving task", driving.getTaskName());
    }

    @Test
    void testFactoryShoppingTaskExecution() {
        //Given
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        System.out.println(shopping);
        Assertions.assertEquals(true, shopping.isTaskExecuted());

    }

    @Test
    void testFactoryPaintingTaskExecution() {
        //Given
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        System.out.println(painting);
        Assertions.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTaskExecution() {
        //Given
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        System.out.println(driving);
        Assertions.assertEquals(true, driving.isTaskExecuted());
    }
}
