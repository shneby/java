package com.shapes;

public class ShapeApp {
    public static void main(String[] args) {
        Shape circle = new Circle(6, Color.GREEN);
        Shape rectangle = new Rectangle(5, 5, Color.BLUE);
        Shape triangle = new Triangle(5, 5, 5, Color.RED);

        circle.draw();
        rectangle.draw();
        triangle.draw();

        System.out.println(triangle.getArea());
        System.out.println(triangle.getCircumference());

        switch (circle.getColor()) {
            case BLUE:
                System.out.println("Do not be sad");
                break;
            case RED:
                System.out.println("I guess it's that time of the month");
                break;
            case GREEN:
                System.out.println("This is sprint");
                break;
        }

        for(Color color: Color.values()){
            System.out.println(color);
        }

    }
}
