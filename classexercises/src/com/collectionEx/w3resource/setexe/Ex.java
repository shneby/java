package com.collectionEx.w3resource.setexe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3));
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        System.out.println("Add:");
        System.out.println(set);
        System.out.println("****************");

        System.out.println("Iterate:");
        for(Integer element: set){
            System.out.println(element);
        }
        System.out.println("****************");

        System.out.println("Size:");
        System.out.println(set.size());
        System.out.println("****************");

        System.out.println("Empty:");
        set.clear();
        System.out.println(set);
        System.out.println("****************");

        System.out.println("Check Empty:");
        if(set.isEmpty()){
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is not empty");
        }
        System.out.println("****************");

        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        System.out.println("Clone:");
        Set<Integer> clonedSet = new HashSet<>(set);
        System.out.println("Original: " + set);
        System.out.println("Cloned: " + clonedSet);
        System.out.println("****************");

        System.out.println("To array:");
        Integer[] converted = new Integer[set.size()];
        set.toArray(converted);
        System.out.println("converted: " + Arrays.toString(converted));
        System.out.println("****************");

        System.out.println("To treeset:");
        System.out.println("****************");

    }
}
