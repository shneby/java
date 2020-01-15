package com.shapes.inheritance;

public class ShapeApp {
    public static void main(String[] args) {
        Shape circle = new Circle(6, Color.GREEN);
        Shape rectangle = new Rectangle(5, 5, Color.BLUE);
        Shape triangle = new Triangle(5, 5, 5, Color.RED);


        System.out.println(circle.getName());
        System.out.println(rectangle.getName());
        System.out.println(triangle.getName());
    }
}
