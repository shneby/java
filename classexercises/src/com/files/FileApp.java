package com.files;

import java.io.File;

public class FileApp {
    public static void main(String[] args) {
        listFiles("/Users/omri.cohen/java/classexercises");
    }
    public static void listFiles(String path){
        File file = new File(path);
        String[] fileList = file.list();
        assert fileList != null;
        for(String filename: fileList){
            String fullPath = path + "/" + filename;
            File currFile = new File(fullPath);
            if(currFile.isDirectory()){
                System.out.println("----------------------------");
                System.out.println("Found directory: " + fullPath);
                System.out.println("----------------------------");
                listFiles(fullPath);
            } else {
                System.out.println(fullPath);
            }
        }
    }

}
