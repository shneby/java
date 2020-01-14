package com.interfaceChallange;

public class PolygonApp {
    public static void main(String[] args) {
        RegularPolygon[] regularPolygons = new RegularPolygon[2];
        regularPolygons[0] = new EquilateralTriangle(5);
        regularPolygons[1] = new Square(5);
        System.out.println(totalSides(regularPolygons));
    }
    public static int totalSides(RegularPolygon[] regularPolygons){
        int totalSides = 0;
        for(RegularPolygon regularPolygon: regularPolygons){
            totalSides += regularPolygon.getNumSides();
        }
        return totalSides;
    }
}
