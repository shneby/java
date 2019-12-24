package com.exercises.page49;

import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        int[][] mat = new int[8][8];
        int layer = 0;

        while(layer < mat.length){
            for(int row=layer; row<mat.length-layer; row++){
                for(int col=layer; col<mat[row].length-layer; col++) {
                    mat[row][col] = layer + 1;
                }
            }
            layer ++;
        }
        for(int row=0; row<mat.length; row++){
            System.out.println(Arrays.toString(mat[row]));
        }
    }
}