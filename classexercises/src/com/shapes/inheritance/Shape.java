package com.shapes.inheritance;

public abstract class Shape implements WithName {
    private Color color;
    private String name;
    private static double counter;

    static{
        counter = Math.random();
        System.out.println(counter);
    }

    public Shape(){}

    public Shape(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getCounter() {
        return counter;
    }

    public static void setCounter(double counter) {
        Shape.counter = counter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(){
        System.out.printf("%s %n", this.color);
    }

    public abstract double getArea();
    public abstract double getCircumference();
}
