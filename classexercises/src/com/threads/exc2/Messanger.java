package com.threads.exc2;

import java.util.Scanner;

public class Messanger extends Thread {
    private Scanner reader = new Scanner(System.in);
    private String message = "Enter messages to the command line, enter an empty message to quit:";

    @Override
    public void run() {
        System.out.println(message);
        while(!message.equals("")){
            message = reader.nextLine();
            System.out.println(message);
        }
    }
}
