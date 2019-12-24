package com.exercises.random;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color, String gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    public void describe() {

        String ref;
        switch (this.gender.toLowerCase()){
            case "male":
                ref = "he";
                break;
            case "female":
                ref = "she";
                break;
            default:
                ref = "it";
                break;
        }

        System.out.printf("%s is %s and %s is %d years old", this.name, this.color, ref, this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
