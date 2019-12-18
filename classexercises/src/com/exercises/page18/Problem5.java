package com.exercises.page18;

import com.exercises.tools.GenVal;

public class Problem5 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int salary = v.genInt(15000, 500000);
        int salaryTmp = salary;
        float taxTotal = 0;

        float tax10 = (salaryTmp > 23000) ? 23000 : salaryTmp;
        taxTotal = (tax10 * 1.1f - tax10 > 0) ? taxTotal + (tax10 * 1.1f - tax10) : taxTotal + 0;
        salaryTmp -= 23000;
        float tax20 = (salaryTmp - 23000 > 0) ? 23000 : salaryTmp;
        taxTotal = (tax20 * 1.2f - tax20 > 0) ? taxTotal + (tax20 * 1.2f - tax20) : taxTotal + 0;
        salaryTmp -= 23000;
        float tax30 = (salaryTmp - 74000 > 0) ? 74000 : salaryTmp;
        taxTotal = (tax30 * 1.3f - tax30 > 0) ? taxTotal + (tax30 * 1.3f - tax30) : taxTotal + 0;
        salaryTmp -= 74000;
        float tax40 = (salaryTmp - 100000 > 0) ? 100000 : salaryTmp;
        taxTotal = (tax40 * 1.4f - tax40 > 0) ? taxTotal + (tax40 * 1.4f - tax40) : taxTotal + 0;
        salaryTmp -= 100000;
        float tax50 = salaryTmp;
        taxTotal = (tax50 * 1.5f - tax50 > 0) ? taxTotal + (tax50 * 1.5f - tax50) : taxTotal + 0;

        System.out.println("salary: " + salary);
        System.out.println("taxTotal: " + taxTotal);
    }
}
