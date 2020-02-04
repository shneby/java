package com.collectionEx.w3resource.arraylist;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E3 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("blue");
        a.add("yellow");
        System.out.println(a);

        System.out.println("Add to first position");
        a.add(0, "red");
        System.out.println(a);

        System.out.println("Sort:");
        Collections.sort(a);
        System.out.println(a);

        System.out.println("Copy:");
        ArrayList<String> b = new ArrayList<>(a);
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("Shuffle:");
        Collections.shuffle(a);
        System.out.println(a);

        System.out.println("Reverse:");
        Collections.reverse(a);
        System.out.println(a);

        System.out.println("Extract:");
        List<String> extracted = a.subList(1, a.size());
        System.out.println("a: " + a);
        System.out.println("extracted: " + extracted);

    }
}
