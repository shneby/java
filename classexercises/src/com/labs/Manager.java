package com.labs;

public class Manager extends Employee {
    public Manager(String firstName, String lastName, float salary, String department) {
        super(firstName, lastName, salary, department);
    }

    @Override
    public String toString() {
        return "Manager [firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", salary=" + this.getSalary() + ", department="
                + this.getDepartment() + "]";
    }
}
