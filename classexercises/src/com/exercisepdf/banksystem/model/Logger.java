package com.exercisepdf.banksystem.model;

import java.util.ArrayList;

public class Logger {
    private String driverName;
    private static ArrayList<Log> logs = new ArrayList<>();

    public Logger(String driverName) {
        this.driverName = driverName;
    }

    public static void log(int clientId, String message, float amount){
        Log log = new Log(clientId, message, amount);
        logs.add(log);
        System.out.println(log);
    }

    public static void log(int clientId, String message){
        Log log = new Log(clientId, message, 0f);
        logs.add(log);
        System.out.println(log);
    }

    public static void log(String message){
        Log log = new Log(0, message, 0f);
        logs.add(log);
        System.out.println(log);
    }

    public String getDriverName() {
        return driverName;
    }

    public static ArrayList<Log> getLogs(){
        return logs;
    }
}
