package oop.model;

import java.util.Arrays;
import java.util.Objects;

public class ClassRoom {
    private String name;
    private Teacher teacher;
    private Student[] students;

    public ClassRoom(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new Student[15];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassRoom classRoom = (ClassRoom) o;
        return Objects.equals(name, classRoom.name) &&
                Objects.equals(teacher, classRoom.teacher) &&
                Arrays.equals(students, classRoom.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, teacher);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
