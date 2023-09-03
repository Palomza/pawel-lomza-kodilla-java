package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkTestSuite {
    @Test
    void updateTest() {
        //Given
        Mentor mentorOne = new MentorOne();
        Mentor mentorTwo = new MentorTwo();
        Homework janekHomework = new Homework("Janek");
        Homework stasiekHomework = new Homework("Stasiek");
        Homework zuziaHomework = new Homework("Zuzia");
        Homework kasiaHomework = new Homework("Kasia");
        janekHomework.registerObserver(mentorOne);
        stasiekHomework.registerObserver(mentorOne);
        zuziaHomework.registerObserver(mentorTwo);
        kasiaHomework.registerObserver(mentorTwo);

        //When
        janekHomework.sendExercise("zadanie janka");
        stasiekHomework.sendExercise("zadanie stasia");
        zuziaHomework.sendExercise("zadanie zuzi");
        kasiaHomework.sendExercise("zadanie kasi");
        kasiaHomework.sendExercise("zadanie kasi");
        kasiaHomework.sendExercise("zadanie kasi");

        //Then
        Assertions.assertEquals(2, mentorOne.getUpdateCount());
        Assertions.assertEquals(4, mentorTwo.getUpdateCount());

    }
}