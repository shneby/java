package com.arrayChallange;

import java.util.Arrays;

public class arrayChallange {
    public static void main(String[] args) {
        int[] array = new int[9];
        int chunkSize = 3;
        int[][] matrix = divideArray(array.length, chunkSize);


        // Reach index
        int index=6;
        matrix[index/chunkSize][index%chunkSize] = 5;




        for(int i=0; i<matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static int[][] divideArray(int arrayLength, int chunkSize){
        int[][] matrix;
        int arrayAmount = arrayLength / chunkSize;
        int arrayRemains = arrayLength % chunkSize;

        if(arrayRemains == 0){
            matrix = new int[arrayAmount][];
        } else {
            matrix = new int[arrayAmount+1][];
        }

        for(int i=0; i<matrix.length; i++){
            if(arrayRemains != 0 && i == matrix.length-1){
                matrix[i] = new int[arrayRemains];
            } else {
                matrix[i] = new int[chunkSize];
            }
        }
        return matrix;
    }
}


