package oop.model;

import java.util.Arrays;

public class School {
    private ClassRoom[] classRooms;

    public School() {
        this.classRooms = new ClassRoom[5];
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Arrays.equals(classRooms, school.classRooms);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(classRooms);
    }

    @Override
    public String toString() {
        return "School{" +
                "classRooms=" + Arrays.toString(classRooms) +
                '}';
    }
}
