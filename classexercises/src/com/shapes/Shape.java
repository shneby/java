package com.shapes;

public class Shape {
    private String color;
    private String shape;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void draw(){
        System.out.printf("Imagine a %s %s%n", this.color, this.shape);
    }

    public double getArea(){
        return 0;
    }

    public double getCircumference(){
        return 0;
    }
}
