package com.pdfexercises.ex5;

public class SalaryRaiser {
    private double salary;

    public SalaryRaiser() {
        this.salary = (int)(Math.random()*5001) + 1000;
    }

    public void raiseSalary(){
        System.out.println("current salary: " + salary);
        double newSalary = salary * 1.1;
        salary = (newSalary > 6000) ? salary : newSalary;
        System.out.println("new salary: " + salary);
    }

    public static void main(String[] args) {
        SalaryRaiser salaryRaiser = new SalaryRaiser();
        for(int i=0; i<10; i++){
            salaryRaiser.raiseSalary();
        }
    }
}
