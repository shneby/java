package com.shapes;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(){}
    public Triangle(double a, double b, double c, Color color){
        super("triangle");
        super.setColor(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*((s-a)*(s-b)*(s-c)));
    }

    @Override
    public double getCircumference() {
        return a+b+c;
    }
}
