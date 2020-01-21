package com.exceptionexercise;

public class PersonApp {
    public static void main(String[] args) {
        try{
            Person person = new Person(0, "steve");
        } catch (VerificationException ex) {
            ex.printStackTrace();
        }
    }
}
