package com.shapes;

public class Canvas {
    public void printDetails(Shape s){
        System.out.printf("%s details:%n", s.getShape());
        System.out.println(s.getArea());
        System.out.println(s.getCircumference());
    }
}
