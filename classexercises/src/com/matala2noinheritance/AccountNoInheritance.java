package com.matala2noinheritance;

import java.util.Random;

public class AccountNoInheritance {
    private String type;
    private String name;
    private String number;
    private String customer;
    private int id;
    private double balance;


    public AccountNoInheritance(String number, String customer, String type){
        Random random = new Random();
        this.type = type;
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
        double depositModifier;

        switch(this.type){
            case "normal":
                depositModifier = 0.01;
                break;
            case "priority":
                depositModifier = 0.032;
                break;
            case "premium":
                depositModifier = 0.05;
                break;
            default:
                depositModifier = 0;
                break;
        }
        this.balance += (amount > 0) ? amount + amount * depositModifier : amount;
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
