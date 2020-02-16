package com.files;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlApp {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.cnn.com");
        try(
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter out = new BufferedWriter(new FileWriter("cnn.url"))){
            String line = in.readLine();
            out.append(line+'\n');
            while(line!=null){
                System.out.println(line);
                line = in.readLine();
                out.append(line+'\n');
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
