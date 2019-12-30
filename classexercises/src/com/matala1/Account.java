package com.matala1;

import java.util.Random;

public class Account {
    private String name;
    private String number;
    private String customer;
    private int id;
    private double balance;

    public Account(String number, String customer){
        Random random = new Random();
        this.name = "";
        this.number = number;
        this.customer = customer;
        this.id = Math.abs(random.nextInt());
        this.balance = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void adjustBalance(double amount){
        this.balance += amount;
    }

    public void describe(){
        System.out.println("-----------------------");
        System.out.printf("Account: %s%n", this.name);
        System.out.printf("Number: %s%n", this.number);
        System.out.printf("Customer: %s%n", this.customer);
        System.out.printf("Id: %s%n", this.id);
        System.out.printf("Balance: %f%n", this.balance);
        System.out.println("-----------------------");
    }
}
