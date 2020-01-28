package com.collectionEx;

import java.util.ArrayList;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

        for(int i=1; i<=100; i++){
            cats.add(new Cat("cat " + i, i));
        }

        int ageSum = 0;
        for(Cat cat: cats){
            ageSum += cat.getAge();
        }

        System.out.println("Total cats age: " + ageSum);

        System.out.println(cats.remove(39));
        System.out.println(cats.remove(48));


        System.out.println("Total amount of cats " + cats.size());

        Cat catI50 = cats.get(50);
        System.out.println(catI50.getAge());
        catI50.setAge(80);
        cats.set(50, catI50);
        System.out.println(cats.get(50).getAge());

        System.out.println("Looking for cat8");
        Cat cat8 = null;
        for(Cat cat: cats){
            if(cat.getName().equals("cat 8")){
                cat8 = cat;
            }
        }
        System.out.println(cat8);

    }
}
