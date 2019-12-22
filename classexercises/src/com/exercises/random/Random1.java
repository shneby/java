package com.exercises.random;


import java.util.Scanner;

public class Random1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the car name:");
        String carName = keyboard.nextLine();

        System.out.println("Enter the cars price");
        double carPrice = keyboard.nextDouble();

        if (carName.equalsIgnoreCase("ford") ){
            System.out.println("Great!");
        }
        if (carPrice > 19000){
            System.out.println("Sucker!!!");
        }
    }
}
