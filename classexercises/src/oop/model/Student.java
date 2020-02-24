package oop.model;

import java.util.Arrays;

public class Student extends Person {
    private Grade[] grades;


    public Student(String name, Integer age) {
        super(name, age);
        this.grades = new Grade[6];
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Arrays.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(grades);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "grades=" + Arrays.toString(grades) +
                '}';
    }
}
