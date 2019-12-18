package com.exercises.page20;

import com.exercises.tools.GenVal;

public class Problem2 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        System.out.println(evaluate(v.genInt(0, 100)));
    }
    private static String evaluate(int grade){
        System.out.println("Grade: " + grade);
        if(grade >= 95){
            return "Excellent";
        } else if (grade >= 85){
            return "Very Good";
        } else if (grade >= 75){
            return "Good";
        } else if (grade >= 65){
            return  "Almost Good";
        } else if (grade >= 55){
            return "Enough";
        } else {
            return "Not Enough";
        }
    }
}
