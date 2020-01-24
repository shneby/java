package com.pdfexercises.ex3;

public class Printer {
    private String part1;
    private int visitor;
    private String part2;

    public Printer(String part1, int visitor, String part2) {
        this.part1 = part1;
        this.visitor = visitor;
        this.part2 = part2;
    }

    public void addVisitors(int amount){
        this.visitor += amount;
    }


    public static void main(String[] args) {
        Printer printer = new Printer("There will be", 5, "people for dinner");
        System.out.println(printer.part1 + " " + printer.visitor  + " " + printer.part2);
        System.out.println(printer.part1 + " " + printer.visitor+2  + " " + printer.part2);
        printer.addVisitors(2);
        System.out.println(printer.part1 + " " + printer.visitor  + " " + printer.part2);

    }

    /*
        1. When adding 2 to the print line - the number 2 is printed right after the number 5
        2. The correct way to increment the number of visitors is via a method in the class
     */
}
