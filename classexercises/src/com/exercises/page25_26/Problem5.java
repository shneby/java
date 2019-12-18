package com.exercises.page25_26;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        System.out.println("Enter integers to summarize -99 will stop and summarize");
        do {
            if(n >= 0){
                sum += n;
            } else {
                System.out.printf("Invalid value %d expecting positive numbers or -99\n", n);
            }
            n = keyboard.nextInt();
        }while(n != -99);
        System.out.println("sum: " + sum);
    }
}
