package com.files;

import java.io.*;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        Save save = new Save(5L);
        WriteObjectToFile(save);
        Save save2 = (Save) readObjectFromFile("data.dat");
        System.out.println(save2.getnLong());
    }

    public static void WriteObjectToFile(Object obj) {
        try {
            FileOutputStream fileOut = new FileOutputStream("data.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(obj);
            objectOut.close();
            System.out.println("The Object was successfully written to a file");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readObjectFromFile(String filepath){
        Object obj = null;
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            obj = objectIn.readObject();
            System.out.println("The Object has been read from the file");
            objectIn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return obj;
    }

    public static byte[] toByteArray(Object obj){
        byte [] bArray = null;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream objOstream = null;
        try {
            objOstream = new ObjectOutputStream(baos);
            objOstream.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bArray = baos.toByteArray();
        return bArray;
    }

}
