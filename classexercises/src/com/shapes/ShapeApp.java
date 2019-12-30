package com.shapes;

public class ShapeApp {
    public static void main(String[] args) {
        Shape circle = new Circle(6, "blue");
        Shape rectangle = new Rectangle(5, 5, "green");

        circle.draw();
        rectangle.draw();

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getCircumference());

        Circle circle1 = new Circle();
        circle1.setColor("blue");
        circle1.setRadius(4);
        circle1.draw();

        Shape rectangle3 = new Rectangle(5);
        System.out.println(rectangle3.getArea());
        rectangle3.draw();

    }
}
