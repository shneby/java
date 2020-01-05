package com.person;

import java.util.Random;

public class PersonApp {

    public static void main(String[] args) {
        Person omri = new Person("Omri", 32, 1);
        Person efrat = new Person("Efrat", 32, 2);
        Random r = new Random();

        System.out.println(omri);
        System.out.println(efrat);

        System.out.println(omri.equals(efrat));

        System.out.println("Waiting for efrat to equal omri");
        while(!omri.equals(efrat)){
            efrat = new Person("Efrat", 32, r.nextInt(101));
            System.out.println(efrat.toString());
        }
        System.out.println("Efrat equals to omri");
    }
}
