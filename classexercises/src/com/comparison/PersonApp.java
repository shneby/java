package com.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PersonApp {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Random random = new Random();

        for(int i=0; i<10; i++){
            people.add(new Person(String.format("name-%d",random.nextInt(50000)), random.nextInt(80)));
        }

        System.out.println("Sort by name:");
        Collections.sort(people, new PersonNameComparator());
        System.out.println(people);


        System.out.println("Sort by age:");
        Collections.sort(people, new PersonAgeComparator());
        System.out.println(people);
    }
}
