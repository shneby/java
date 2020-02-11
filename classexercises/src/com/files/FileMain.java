package com.files;

import java.io.*;

public class FileMain {
    public static void main(String[] args) {
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("samplefile"));
                 BufferedWriter bw = new BufferedWriter(new FileWriter("samplefilecopy"))) {
                String s = br.readLine();
                while(s != null ){
                    bw.write(s + '\n');
                    s = br.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
