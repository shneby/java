package com.exercises.shapes;

public class ShapesApp {

    public static void main(String[] args) {

        // Circle
        Circle circle = new Circle(4, "brown");
        Circle circle2 = new Circle();
        circle2.setColor("yellow");
        circle2.setRadius(5);

        // Rectangles
        Rectangle rectangle = new Rectangle(5, 4, "yellow");
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(5);
        rectangle2.setWidth(5);
        rectangle2.setColor("blue");

        circle.draw();
        circle2.draw();
        rectangle.draw();
        rectangle2.draw();

    }
}
