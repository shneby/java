package com.shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(){}

    public Rectangle(double height, double width, String color) {
        super.setShape(this.getClass().getSimpleName().toLowerCase());
        super.setColor(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getCircumference() {
        return height * 2 + width * 2;
    }
}
