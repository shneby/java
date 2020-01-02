package com.shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(){}

    public Rectangle(double length){
        this(length, length, "clear");
    }

    public Rectangle(double height, double width, String color) {
        super.setShape(this.getClass().getSimpleName().toLowerCase());
        super.setColor(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.printf("Height: %d%n", (int)this.height);
        System.out.printf("Width: %d%n", (int)this.width);
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
