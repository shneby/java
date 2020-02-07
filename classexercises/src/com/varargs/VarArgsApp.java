package com.varargs;

public class VarArgsApp {
    public static <T extends Number> Number sum(T... num){
        int sum = 0;
        for(T i: num){
            sum += i.intValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(VarArgsApp.sum(2,3.5f,4,5,6,7,8f,9,0L,4f,42,2));
    }
}
