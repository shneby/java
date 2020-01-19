package com.interfaces.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5);
        Shape triangle = new Triangle(5, 5, 5);

        ArrayList<Shape> shapes = new ArrayList<Shape>(List.of(circle, rectangle, triangle));

        for(Shape shape: shapes){
            System.out.printf("%s: \n", shape.getClass().getSimpleName());
            System.out.println(shape.getCirc());
            System.out.println(shape.getArea());
            System.out.println();
        }
    }
}
