package com.exercises.shapes;

public class Rectangle extends Shape{
    private double width;
    private double height;
    private String color;

    public Rectangle() {

    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSquare(){
        return width == height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return width * 2 + height * 2;
    }

    @Override
    public void draw() {
        System.out.printf("Imagine a %s %s%n", color, this.getClass().getSimpleName());
    }
}
