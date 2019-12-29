package com.exercises.clock;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(){
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int secondsFromMidnight){
        this.setClock(secondsFromMidnight);
    }

    public void addClock(Clock c){
        this.hours += c.hours;
        this.minutes += c.minutes;
        this.seconds += c.seconds;
    }

    public Clock subtractClock(Clock c){
        Clock tmpClock = new Clock(this.hours, this.minutes, this.seconds);
        tmpClock.hours -= c.hours;
        tmpClock.minutes -= c.minutes;
        tmpClock.seconds -= c.seconds;
        return tmpClock;
    }

    private void setClock(int secondsFromMidnight){
        this.hours = secondsFromMidnight / 3600;
        this.minutes = (secondsFromMidnight / 60) - (hours * 60);
        this.seconds = secondsFromMidnight - (secondsFromMidnight / 60) * 60;
    }

    public void tick(){
        this.seconds ++;
        this.adjustTicks();
    }

    public void tickDown(){
        this.seconds --;
        this.adjustTicks();
    }

    private void adjustTicks(){
        if(this.seconds > 59){
            this.seconds = 0;
            this.minutes += 1;
        }
        if(this.minutes > 59){
            this.minutes = 0;
            this.hours += 1;
        }
        if(this.hours > 23){
            this.hours = 0;
        }
    }

    public String toString(){
        String sHours = (this.hours < 10) ? String.format("0%d", this.hours) : String.format("%d", this.hours);
        String sMinutes = (this.minutes < 10) ? String.format("0%d", this.minutes) : String.format("%d", this.minutes);
        String sSeconds = (this.seconds < 10) ? String.format("0%d", this.seconds) : String.format("%d", this.seconds);
        return String.format("(%s:%s:%s)", sHours, sMinutes, sSeconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
