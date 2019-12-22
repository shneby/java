package com.exercises.random;

import java.util.Scanner;

public class Random2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String options = keyboard.nextLine();

        switch(options.toLowerCase()){
            case "aba":
                System.out.println("This is my father");
                break;
            case "ema":
                System.out.println("This is my mother");
                break;
            default:
                System.out.println("Stranger danger!");
        }
    }
}
