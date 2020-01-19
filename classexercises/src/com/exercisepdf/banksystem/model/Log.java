package com.exercisepdf.banksystem.model;

import java.util.Objects;
import java.util.Date;

public class Log {
    private Date timesStamp;
    private Integer clientId;
    private String description;
    private Float amount;

    public Log(Integer clientId, String description, Float amount) {
        this.timesStamp = new Date();
        this.clientId = clientId;
        this.description = description;
        this.amount = amount;
    }


    @Override
    public String toString(){
        return String.format("%s, client-%d, %s, %f", this.timesStamp, this.clientId, this.description, this.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(timesStamp, log.timesStamp) &&
                Objects.equals(clientId, log.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timesStamp, clientId);
    }
}
