package com.main;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,3,3,3,4,5,6,7,8,9));
        System.out.println("*****************************");
        for(Integer element: set){
            System.out.println(element);
        }
        System.out.println("*****************************");
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private static void th() throws Exception{
        throw new Exception();
    }

    private static void writeToFile(Object obj, String filename){
        try{
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            System.out.printf("The Object was successfully written to %s\n", filename);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static ArrayList<Integer> readFromFile(String filename){
        ArrayList<Integer> intArray = null;
        try{
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            intArray = (ArrayList<Integer>)ois.readObject();
            ois.close();
            System.out.printf("The Object was successfully read from %s\n", filename);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return intArray;
    }
}
