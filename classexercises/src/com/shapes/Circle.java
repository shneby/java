package com.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(){
        super.setShape(this.getClass().getSimpleName().toLowerCase());
    }

    public Circle(double radius, Color color){
        super.setShape(this.getClass().getSimpleName().toLowerCase());
        super.setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getCircumference() {
        return Math.PI * getDiameter();
    }
}
