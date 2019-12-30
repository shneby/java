package com.exercises.clock;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("firstClock: Number of seconds since midnight");
        Clock firstClock = new Clock(keyboard.nextInt());
        for(int i=0; i<10; i++){
            firstClock.tick();
            System.out.println(firstClock.toString());
        }

        System.out.println("secondClock: Hours, Minutes, Seconds");
        Clock secondClock = new Clock(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt());
        for(int i=0; i<10; i++){
            secondClock.tick();
            System.out.println(secondClock.toString());
        }

        firstClock.addClock(secondClock);

        System.out.println("Clocks after merging firstClock into secondClock");
        System.out.println("firstClock:" + firstClock.toString());
        System.out.println("secondClock:" + secondClock.toString());

        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("thirdClock:" + thirdClock.toString());
    }
}
