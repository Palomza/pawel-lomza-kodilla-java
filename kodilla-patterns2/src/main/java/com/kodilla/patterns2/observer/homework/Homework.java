package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements HomeworkObservable {
    private final List<HomeworkObserver> observers;
    private final String studentName;
    private final List<String> exercises;

    public Homework(String studentName) {
        this.studentName = studentName;
        this.exercises = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getExercises() {
        return exercises;
    }
    public void sendExercise(String exercise) {
        exercises.add(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        for(HomeworkObserver observer : observers) {
            observer.update(this);
        }

    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);

    }
}