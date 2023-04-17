package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    private String playerName;
    private String playAgain;
    private int roundsToWin;
    private int playerScore;
    private int computerScore;
    private int playerMove;
    private int computerMove;
    private Scanner scanner;
    private boolean end;

    private static boolean playerWinConditions(int playerMove, int computerMove){
        //1 - Rock, 2 - Paper, 3 - Scissors
        if(playerMove == 1){
            return computerMove == 3;
        } else if (playerMove == 2) {
            return computerMove == 1;
        } else {
            return computerMove == 2;
        }
    }

    private static String moveToString(int move){
        if(move == 1){
            return "Rock";
        } else if (move == 2) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public RpsRunner() {
        this.playerName = null;
        this.playAgain = null;
        this.roundsToWin = 3;
        this.playerScore = 0;
        this.computerScore = 0;
        this.playerMove = 0;
        this.computerMove = 0;
        this.scanner = new Scanner(System.in);
        this.end = false;
    }

    public void start() {
        //Username and rounds to win the game
        System.out.println("Type your name");
        playerName = scanner.nextLine();
        System.out.println("Up to how many wins is the game to be played? Type a number");
        roundsToWin = scanner.nextInt();
        System.out.println();
        //How to play
        System.out.println("Hi " + playerName + ", we will be playing Rock Paper Scissors until " + roundsToWin + " wins.");
        System.out.println("In order to play you have to select corresponding key: ");
        System.out.println("\"1\" - Rock");
        System.out.println("\"2\" - Paper");
        System.out.println("\"3\" - Scissors");
        System.out.println("\"x\" - End game");
        System.out.println("\"n\" - Play again");
        System.out.println();
        startRound();
    }
    public void startRound() {
        //Main game loop
        while(!end){
            //Player move
            System.out.println("Choose your move (1 - Rock, 2 - Paper, 3 - Scissors)");
            playerMove = scanner.nextInt();
            //Computer move
            computerMove = (int) (Math.random() * 3) + 1;
            //Round result
            System.out.println(playerName + " chose the " + moveToString(playerMove) + ", computer chose the " + moveToString(computerMove));
            if(playerMove == computerMove) {
                System.out.println("Draw!");
            } else if (playerWinConditions(playerMove, computerMove)) {
                System.out.println(playerName + " wins!");
                playerScore++;
            } else {
                System.out.println("This time you lost");
                computerScore++;
            }
            //Score after a round
            System.out.println(playerName + " " + playerScore + ":" + computerScore + " computer");
            //Check if game ends
            if (playerScore == roundsToWin || computerScore == roundsToWin) {
                end = true;
                if(playerScore > computerScore){
                    System.out.println("You won the game!");
                } else {
                    System.out.println("You lost the game");
                }
                //Play again or end game
                System.out.println("Game over! Type \"n\" to play again or \"x\" to end the game");
                playAgain = scanner.next();
                if (playAgain.equals("n")) {
                    end = false;
                    playerScore = 0;
                    computerScore = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        RpsRunner rpsRunner = new RpsRunner();
        rpsRunner.start();
    }
}
