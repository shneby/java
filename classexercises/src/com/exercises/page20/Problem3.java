// TODO: Still in progress

package com.exercises.page20;

import com.exercises.tools.GenVal;

public class Problem3 {
    public static void main(String[] args) {
        GenVal v = new GenVal();

        int a = v.genInt(0, 10);
        int b = v.genInt(0, 10);
        int c = v.genInt(0, 10);
        int d = v.genInt(0, 10);
        int e = v.genInt(0, 10);
        int f = v.genInt(0, 10);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);

        if((a*e-b*d) == 0){
            System.out.println("Division by 0 is not allowed");
        } else {
            float x =(c*e-b*f)/(a*e-b*d);
            float y =(a*f-c*d)/(a*e-b*d);
            System.out.println("x: " + x);
            System.out.println("y: " + y);

            System.out.println("Checking the answer:");
            System.out.printf("%d * %.5f + %d * %.5f = %d",a ,x ,b ,y ,c);
        }
    }
}
