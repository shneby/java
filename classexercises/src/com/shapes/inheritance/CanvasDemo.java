package com.shapes.inheritance;

public class CanvasDemo {
    public static void main(String[] args) {
        Canvas c = new Canvas();
        WithName circle = new Circle(3, Color.RED);
        WithName rectangle = new Rectangle(5, 5, Color.BLUE);
        WithName person = new Person("stan");

        c.printDetails(circle);
        c.printDetails(rectangle);
        c.printDetails(person);
    }
}
