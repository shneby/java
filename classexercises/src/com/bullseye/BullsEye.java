package com.bullseye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BullsEye {
    private ArrayList<Character> board;
    private int boardSize;
    private int guessCount;

    public BullsEye(int boardSize) {
        this.boardSize = boardSize;
        this.guessCount = 0;
        this.board = new ArrayList<>();
        this.generateGameBoard();
    }

    private void generateGameBoard(){
        ArrayList<Character> options = new ArrayList<>(List.of('b', 'y', 'r', 'g', 'o'));
        for(int i=0; i<boardSize; i++){
            int randomSelect = (int)(Math.random()*options.size());
            board.add(i, options.get(randomSelect));
            options.remove(randomSelect);
        }
    }

    private char checkSingleGuess(char singleGuess, int index){
        if (board.get(index) == singleGuess){
            return 'X';
        } else if (board.contains(singleGuess)) {
            return 'O';
        } else {
            return '_';
        }
    }

    public boolean makeGuess(char[] guess){
        boolean correct = true;
        char[] displayGuess = new char[boardSize];
        this.guessCount ++;

        for(int i=0; i<boardSize; i++){
            displayGuess[i] = checkSingleGuess(guess[i], i);
        }
        for(int i=0; i<boardSize; i++){
            if(displayGuess[i] != 'X'){
                correct = false;
                break;
            }
        }
        System.out.println(Arrays.toString(displayGuess));
        if(correct){
            System.out.printf("Bullseye in %d guesses\n", this.guessCount);
        } else {
            System.out.println("Keep trying!");
        }
        return correct;
    }

    public int getBoardSize() {
        return boardSize;
    }

    @Override
    public String toString() {
        return "BullsEye{" +
                "board=" + board +
                ", boardSize=" + boardSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BullsEye bullsEye = (BullsEye) o;
        return Objects.equals(board, bullsEye.board);
    }

    @Override
    public int hashCode() {
        return Objects.hash(board);
    }
}
