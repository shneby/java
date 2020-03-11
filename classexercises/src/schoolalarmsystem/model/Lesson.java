package schoolalarmsystem.model;

import java.util.Calendar;
import java.util.Objects;

public class Lesson implements Comparable<Lesson>{
    private String name;
    private String teacher;
    private Calendar startTime;
    private Calendar endTime;
    private Boolean alarmFired = false;

    public Lesson(String name, String teacher, Calendar startTime, Calendar endTime) {
        this.name = name;
        this.teacher = teacher;
        this.startTime = startTime;
        this.endTime = endTime;
        startTime.set(Calendar.MILLISECOND, 0);
        endTime.set(Calendar.MILLISECOND, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getStartTime() {
        return startTime;
    }


    public Boolean getAlarmFired() {
        return alarmFired;
    }

    public void setAlarmFired(Boolean alarmFired) {
        this.alarmFired = alarmFired;
    }

    private String formatTime(Calendar time){
        return String.format("%d:%d:%d", time.get(Calendar.HOUR), time.get(Calendar.MINUTE), time.get(Calendar.SECOND));
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", startTime=" + formatTime(startTime) +
                ", endTime=" + formatTime(endTime) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(name, lesson.name) &&
                Objects.equals(teacher, lesson.teacher) &&
                Objects.equals(startTime, lesson.startTime) &&
                Objects.equals(endTime, lesson.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacher, startTime, endTime);
    }

    @Override
    public int compareTo(Lesson o) {
        System.out.println(o.getStartTime());
        return this.startTime.compareTo(o.getStartTime());
    }
}
