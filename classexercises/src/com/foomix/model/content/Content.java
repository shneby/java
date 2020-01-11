package com.foomix.model.content;

//todo: make abstract

import java.util.Date;
import java.util.Objects;

public abstract class Content {
    private Date timeAdded;

    public Content(Date timeAdded) {
        this.timeAdded = timeAdded;
    }

    @Override
    public String toString() {
        return "Content{" +
                "timeAdded=" + timeAdded +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return timeAdded.equals(content.timeAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeAdded);
    }

    public Date getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Date timeAdded) {
        this.timeAdded = timeAdded;
    }
}
