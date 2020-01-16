package com.exercisepdf.banksystem.model;

public class Logger {
    private String driverName;

    public Logger(String driverName) {
        this.driverName = driverName;
    }

    public void log(Log log){
        System.out.println(log.getData());
    }

    // todo: implement getLogs() method when the time comes
}
