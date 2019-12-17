package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem4 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int durationMinutes = v.genInt(90, 180);
        int durationHours = durationMinutes / 60;
        int remainderMinutes = durationMinutes % 60;

        System.out.println("durationMinutes: " + durationMinutes);
        System.out.println("durationHours: " + durationHours);
        System.out.println("remainderMinutes: " + remainderMinutes);
        System.out.println(String.format("%s hours(s) and %s minute(s)", durationHours, remainderMinutes));
    }
}
