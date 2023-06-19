package com.kodilla.sudoku;

public class SudokuElement {
    private int value;

    public SudokuElement() {
        value = 0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
