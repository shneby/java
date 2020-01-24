package com.pdfexercises.ex5;

public class TaxCalculator {
    private double salary;
    private double tax = 0;
    private double[] steps = {100000,50000,23000,0};
    private double[] rates = {1.4,1.3,1.2,1.1};

    public TaxCalculator(double salary) {
        this.salary = salary;
    }
    private void calculateTax(){
        System.out.println("Starting tax calculation");
        double tmpSalary = salary;
        double remainder;
        double taxAmount;

        for(int i=0; i<steps.length; i++){
            if(tmpSalary >  steps[i]){
                remainder = tmpSalary -  steps[i];
                taxAmount = (remainder *  rates[i]) - remainder;
                tax += taxAmount;
                tmpSalary = tmpSalary - remainder;
                System.out.println("Salary is larger then " +  steps[i] + " taking " + taxAmount + " off " + remainder + " - tax at: " + tax);
            }
        }
    }

    @Override
    public String toString() {
        return "TaxCalculator{" +
                "salary=" + salary +
                ", tax=" + tax +
                '}';
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator((int)(Math.random()*10000000));
        taxCalculator.calculateTax();
        System.out.println(taxCalculator);
    }
}
