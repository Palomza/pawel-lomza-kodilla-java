package com.kodilla.sudoku;

public class SudokuRow {
    private SudokuElement[] elements;

    public SudokuRow() {
        elements = new SudokuElement[9];
        for (int i = 0; i < 9; i++) {
            elements[i] = new SudokuElement();
        }
    }

    public void setElementValue(int col, int value) {
        elements[col].setValue(value);
    }

    public int getElementValue(int col) {
        return elements[col].getValue();
    }
}

