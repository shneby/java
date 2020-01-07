package com.shapes;

public abstract class Shape {
    private Color color;
    private String shape;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void draw(){
        System.out.printf("%s %s%n", this.color, this.shape);
    }

    public abstract double getArea();
    public abstract double getCircumference();
}
