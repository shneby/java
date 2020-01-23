package com.bullseye;

import java.util.Scanner;

public class BullsEyeApp {
    public static void main(String[] args) {
        BullsEye bullsEye = new BullsEye();
        Scanner keyboard = new Scanner(System.in);
        boolean gameOn = true;

        System.out.println("Started a new game of Bullseye.");
        while(gameOn){
            char[] guess = new char[bullsEye.getBoardSize()];
            System.out.println("Enter 3 characters [b,y,r,g,o] to make a guess (x leaves the game):");
            for(int i=0; i<guess.length; i++){
                guess[i] = keyboard.next().charAt(0);
                if(guess[i] == 'x'){
                    System.out.println("Cought x input - leaving game.");
                    gameOn = false;
                    break;
                }
            }
            if(gameOn){
                if(bullsEye.makeGuess(guess)){
                    gameOn = false;
                }
            }
        }
    }
}
