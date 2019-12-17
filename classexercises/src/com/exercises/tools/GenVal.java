package com.exercises.tools;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenVal {

    public int genInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }

    public float genFloat(int min, int max){
        Random r = new Random();
        return min + r.nextFloat() * (max - min);
    }

    public double genDouble(int min, int max){
        return ThreadLocalRandom.current().nextDouble(min, max+1);
    }

    public char genChar(Boolean capital){
        String abc = "abcdefghijklnmopqrstuvwxyz";
        if(capital){
            abc = abc.toUpperCase();
        }
        char[] alphabet = abc.toCharArray();
        return alphabet[genInt(0, abc.length()-1)];
    }
}
