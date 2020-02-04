package com.enumeapp;

import java.util.Enumeration;
import java.util.StringTokenizer;

public class EnumerApp {
    public static void main(String[] args) {
        Enumeration<Object> enumator = new StringTokenizer("bla1 bla2 bla3", " ");
        while(enumator.hasMoreElements()){
            System.out.println(enumator.nextElement());
        }
    }
}
