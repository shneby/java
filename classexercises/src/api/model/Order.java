package api.model;

import java.util.Calendar;

public class Order implements Comparable<Order> {
    private Calendar readyOn;
    private String text;
    private Boolean important;
    private Integer notificationCounter = 0;
    private Calendar nextImportantNotification;
    private Boolean popped;

    public Order(Calendar readyOn, String text, Boolean important) {
        this.readyOn = readyOn;
        this.text = text;
        this.important = important;
        this.popped = false;
        readyOn.set(Calendar.MILLISECOND, 0);
        readyOn.set(Calendar.SECOND, 0);
        if(important){
            nextImportantNotification = moveCalendarForwardByInterval(readyOn, 60);
        }
    }

    public Calendar getReadyOn() {
        return readyOn;
    }

    public Integer getNotificationCounter() {
        return notificationCounter;
    }

    public void setNextImportantNotification(Calendar calendar) {
        this.nextImportantNotification = calendar;
    }

    public Calendar getNextImportantNotification(){
        return this.nextImportantNotification;
    }

    public void setNotificationCounter(Integer notificationCounter) {
        this.notificationCounter = notificationCounter;
    }

    public Boolean getImportant() {
        return important;
    }

    public Boolean getPopped() {
        return popped;
    }

    public void setPopped(Boolean popped) {
        this.popped = popped;
    }

    private String formatTime(Calendar time){
        return String.format("%d:%d", time.get(Calendar.HOUR), time.get(Calendar.MINUTE));
    }

    public static Calendar moveCalendarForwardByInterval(Calendar calendar, int interval){
        Calendar result = Calendar.getInstance();
        result.set(Calendar.HOUR, calendar.get(Calendar.HOUR));
        result.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE));
        result.set(Calendar.SECOND, calendar.get(Calendar.SECOND));
        result.add(Calendar.SECOND, interval);
        return result;
    }

    @Override
    public String toString() {
        return String.format("---\nOrder description - %s\nImportant - %b\nUser notified - %b\nready on - %s\n---\n", text, important, popped, formatTime(readyOn));
    }

    @Override
    public int compareTo(Order o) {
        return this.readyOn.compareTo(o.readyOn);
    }
}
