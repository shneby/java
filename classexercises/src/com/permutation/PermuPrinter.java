package com.permutation;

import java.util.Arrays;

public class PermuPrinter {
    public void printPerms(int permAmount, int permLength){
        for(int i=0; i<permAmount; i++){
            int [] permArray = new int[permLength];
            for(int j=0; j<permArray.length; j++){
                permArray[j] = (int)(Math.random()*10);
            }
            System.out.println(Arrays.toString(permArray));
        }
    }

    public static void main(String[] args) {
        PermuPrinter p = new PermuPrinter();
        p.printPerms(5,5);
    }
}
