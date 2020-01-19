package com.exercisepdf.banksystem.model;

import java.util.ArrayList;

public class Logger {
    private String driverName;
    private static ArrayList<Log> logs = new ArrayList<>();

    public Logger(String driverName) {
        this.driverName = driverName;
    }

    public static void log(Log log){
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
