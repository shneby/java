package com.exercises.shapes;

public class Circle extends Shape {
    private double radius;
    private String color;

    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw(){
        System.out.printf("Imagine a %s %s%n", color, this.getClass().getSimpleName());
    }
}
