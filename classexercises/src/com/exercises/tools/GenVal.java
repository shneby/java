package com.exercises.tools;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenVal {

    /**
     * Generates a random integer in a given range
     * @param min - minimum range to start from (can be negative)
     * @param max - maximum range to end at
     * @return randomly generated integer in provided ranges
     */
    public int genInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }

    /**
     * Generates a random float in a given range
     * @param min - minimum range to start from (can be negative)
     * @param max - maximum range to end at
     * @return randomly generated float in provided ranges
     */
    public float genFloat(int min, int max){
        Random r = new Random();
        return min + r.nextFloat() * (max - min);
    }

    /**
     * Generates a random double in a given range
     * @param min - minimum range to start from (can be negative)
     * @param max - maximum range to end at
     * @return randomly generated double in provided ranges
     */
    public double genDouble(int min, int max){
        return ThreadLocalRandom.current().nextDouble(min, max+1);
    }

    /**
     * Generates a random alphabet character
     * @param capital - will generate a capital letter if true
     * @return randomly generated character
     */
    public char genChar(Boolean capital){
        String abc = "abcdefghijklnmopqrstuvwxyz";
        if(capital){
            abc = abc.toUpperCase();
        }
        char[] alphabet = abc.toCharArray();
        return alphabet[genInt(0, abc.length()-1)];
    }
}
