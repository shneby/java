package com.shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(){}

    public Rectangle(double length){
        this(length, length, Color.GREEN);
    }

    public Rectangle(double height, double width, Color color) {
        super("rectangle");
        super.setColor(color);
        this.height = height;
        this.width = width;
    }

    public boolean isSquare(){
        return this.width == this.height;
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
