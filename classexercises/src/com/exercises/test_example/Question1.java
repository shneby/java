package com.exercises.test_example;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 0};
        Scanner keyboard = new Scanner(System.in);
        int input;

        do {
            System.out.println("Input a number:");
            input = keyboard.nextInt();
            replaceSmallestCountIndex(arr, input);

            for(int num: arr){
                System.out.print(num + " ");
            }
        }while(input != -1);
    }

    private static int countEvenDigits(int n){
        int counter = 0;
        int tmpNum = n;
        int remainder = tmpNum % 10;

        while(tmpNum > 10) {
            if(remainder % 2 == 0){
                counter ++;
            }
            tmpNum = tmpNum / 10;
            remainder =  tmpNum % 10;
        }

        if(remainder % 2 == 0 && tmpNum != 0){
            counter ++;
        }

        return counter;
    }

    private static int[] replaceSmallestCountIndex(int[] array, int n){
        int smallestCount = countEvenDigits(array[0]);
        int smallestIndex = 0;

        for(int i=1; i<array.length; i++){
            if(countEvenDigits(array[i]) < smallestCount){
                smallestCount = countEvenDigits(array[i]);
                smallestIndex = i;
            }
        }

        if(countEvenDigits(n) > smallestCount){
            array[smallestIndex] = n;
        }

        return array;
    }
}
