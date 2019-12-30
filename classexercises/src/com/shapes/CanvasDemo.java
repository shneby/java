package com.shapes;

public class CanvasDemo {
    public static void main(String[] args) {
        Canvas c = new Canvas();
        Shape circle = new Circle(3, "black");
        Shape rectangle = new Rectangle(5, 5, "black");

        c.printDetails(circle);
        c.printDetails(rectangle);
    }
}
