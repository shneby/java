package com.exercisepdf.banksystem.model;

public class Logger {
    private String driverName;

    public Logger(String driverName) {
        this.driverName = driverName;
    }

    public static void log(Log log){
        System.out.println(log);
    }

    // todo: implement getLogs() method when the time comes
}
