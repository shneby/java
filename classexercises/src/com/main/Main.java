package com.main;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        ArrayList<Integer> integerArray = new ArrayList<>();
//        String fileName = "data.dat";
//        integerArray.add(5);
//        writeToFile(integerArray, fileName);
//        ArrayList<Integer> integerArray2 = readFromFile(fileName);
//        for(Integer i: integerArray2){
//            System.out.println(i);
//        }
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
