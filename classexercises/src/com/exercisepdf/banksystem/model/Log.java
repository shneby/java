package com.exercisepdf.banksystem.model;

import java.text.DecimalFormat;
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
        String client = (clientId.equals(0)) ? "bank" : String.format("client-%d", clientId);
        String formatAmount = new DecimalFormat("#.###########").format(amount);
        return String.format("%s - %s - %s - (cost: %s)", timesStamp, client, description, formatAmount);
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
