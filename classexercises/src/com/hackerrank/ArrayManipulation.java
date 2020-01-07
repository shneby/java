package com.hackerrank;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[][] queries1 = {
                {2,6,8},
                {3,5,7},
                {1,8,1},
                {5,9,15}
        };
        int[][] queries2 = {
                {1,2,100},
                {2,5,100},
                {3,4,100}
        };
        System.out.println(adjustArr(queries1, 10));
        System.out.println(adjustArr(queries2, 5));
    }

    public static long adjustArr(int [][] queries, int n){
        int[] array = new int[n];
        long max=0;


        for(int[] query: queries){
            for(int i=query[0]-1; i<=query[1]-1; i++){
                array[i] += query[2];
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        return max;
    }
}
