package com.shapes.inheritance;

public class Canvas {
    public void printDetails(WithName s){
        System.out.printf("%s details:%n", s.getName());

        if(s instanceof Circle){
            System.out.println(((Circle)s).getDiameter());
        }
        if(s instanceof Rectangle){
            System.out.printf("Square: %b%n", ((Rectangle)s).isSquare());
        }

    }
}
