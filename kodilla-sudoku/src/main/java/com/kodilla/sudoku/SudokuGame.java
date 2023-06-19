package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard board;

    public SudokuGame() {
        board = new SudokuBoard();
    }

    public boolean resolveSudoku() {
        System.out.println("Enter your Sudoku. Type number '0' for empty fields or word 'Sudoku' to get resolve.");

        // Data input
        for (int i = 0; i < 9; i++) {
            System.out.println(board.toString());
            System.out.print("Type in order column, row and value (separated by commas) or 'Sudoku': ");
            String input = readInput();
            if (input.equalsIgnoreCase("Sudoku")) {
                boolean solved = board.solveSudoku();
                if (!solved) {
                    System.out.println("Sudoku cannot be solved. Try entering other values.");
                    return false;
                }
                break;
            }
            String[] inputParts = input.split(",");
            if (inputParts.length != 3) {
                System.out.println("Incorrect data format. Enter column, row, and value separated by commas.");
                i--;
                continue;
            }
            int col = Integer.parseInt(inputParts[0].trim()) - 1;
            int row = Integer.parseInt(inputParts[1].trim()) - 1;
            int value = Integer.parseInt(inputParts[2].trim());
            if (col < 0 || col >= 9 || row < 0 || row >= 9 || value < 0 || value > 9) {
                System.out.println("Incorrect coordinates or value. Try again.");
                i--;
                continue;
            }
            board.setElementValue(row, col, value);
        }

        System.out.println("\nSudoku solution:");
        System.out.println(board.toString());

        System.out.print("Do you want to solve another Sudoku? (Y/N): ");
        String input = readInput();

        return !input.equalsIgnoreCase("Y");
    }

    private String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
