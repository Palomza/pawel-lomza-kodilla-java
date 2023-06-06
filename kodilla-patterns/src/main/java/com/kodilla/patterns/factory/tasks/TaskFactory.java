package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String DRIVING = "DRIVING TASK";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Shopping task", "Milk", 2);
            case PAINTING -> new PaintingTask("Painting task", "Black", "Red door");
            case DRIVING -> new DrivingTask("Driving task", "Sunset", "Horse");
            default -> null;
        };
    }
}
