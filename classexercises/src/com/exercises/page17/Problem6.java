package com.exercises.page17;

import com.exercises.tools.GenVal;

public class Problem6 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int baseSalary = v.genInt(5000, 10000);
        float totalSalary = (baseSalary >= 6000) ? baseSalary * 1.05f : baseSalary * 1.1f;

        System.out.println("baseSalary: " + baseSalary);
        System.out.println("totalSalary: " + totalSalary);
    }
}
