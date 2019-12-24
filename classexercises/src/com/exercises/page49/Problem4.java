package com.exercises.page49;

import com.exercises.tools.GenVal;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        GenVal v = new GenVal();

        // populate the matrix
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[row].length; col++){
                mat[row][col] = v.genInt(0, 100);
            }
            System.out.println(Arrays.toString(mat[row]));
        }

        // reset to 0 each cell that divides by 5 or 7
        System.out.println("Resetting cells that divides with either 5 or 7:");
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[row].length; col++){
                if(mat[row][col] % 5 == 0 || mat[row][col] % 7 == 0){
                    mat[row][col] = 0;
                }
            }
            System.out.println(Arrays.toString(mat[row]));
        }



    }
}
