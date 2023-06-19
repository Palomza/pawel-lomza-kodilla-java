package com.kodilla.sudoku;

public class SudokuBoard {
    private SudokuRow[] rows;

    public SudokuBoard() {
        rows = new SudokuRow[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new SudokuRow();
        }
    }

    public void setElementValue(int row, int col, int value) {
        rows[row].setElementValue(col, value);
    }

    public boolean solveSudoku() {
        return solveSudoku(0, 0);
    }

    private boolean solveSudoku(int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
            if (row == 9) {
                return true; // Solution found
            }
        }

        if (rows[row].getElementValue(col) != 0) {
            return solveSudoku(row, col + 1);
        }

        for (int num = 1; num <= 9; num++) {
            if (isValidMove(row, col, num)) {
                rows[row].setElementValue(col, num);
                if (solveSudoku(row, col + 1)) {
                    return true;
                }
                rows[row].setElementValue(col, 0);
            }
        }

        return false; // Solution not found.
    }

    private boolean isValidMove(int row, int col, int value) {
        // Row check
        for (int c = 0; c < 9; c++) {
            if (rows[row].getElementValue(c) == value) {
                return false;
            }
        }

        // Column check
        for (int r = 0; r < 9; r++) {
            if (rows[r].getElementValue(col) == value) {
                return false;
            }
        }

        // Square (3x3) check
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if (rows[r].getElementValue(c) == value) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------\n");
        for (int i = 0; i < 9; i++) {
            sb.append("| ");
            for (int j = 0; j < 9; j++) {
                int value = rows[i].getElementValue(j);
                sb.append(value != 0 ? value : " ").append(" ");
                if ((j + 1) % 3 == 0) {
                    sb.append("| ");
                }
            }
            sb.append("\n");
            if ((i + 1) % 3 == 0) {
                sb.append("-------------------------\n");
            }
        }
        return sb.toString();
    }
}

