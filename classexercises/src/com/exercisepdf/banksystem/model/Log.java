package com.exercisepdf.banksystem.model;

import java.util.Objects;

public class Log {
    private long timesStamp;
    private int clientId;
    private String description;
    private float amount;

    public Log(int clientId, String description, float amount) {
        this.timesStamp = System.currentTimeMillis();
        this.clientId = clientId;
        this.description = description;
        this.amount = amount;
    }

    public String getData(){
        return String.format("%d, client-%d, %s, %f", this.timesStamp, this.clientId, this.description, this.amount);
    }

    @Override
    public String toString() {
        return "Log{" +
                "timesStamp=" + timesStamp +
                ", clientId=" + clientId +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return timesStamp == log.timesStamp &&
                clientId == log.clientId &&
                Float.compare(log.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timesStamp, clientId, amount);
    }
}
