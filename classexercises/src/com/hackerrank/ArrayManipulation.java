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
        for(int row=0; row<queries.length; row++){
            int a=queries[row][0];
            int b=queries[row][1];
            int k=queries[row][2];

            if(a<=array.length && b<=array.length){
                for(int i=a-1; i<=b-1; i++){
                    array[i] += k;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        long max=0;
        for(int i=0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
