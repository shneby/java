package oop.model;

import java.util.Objects;

public class Teacher extends Person{
    private String profession;

    public Teacher(String name, Integer age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(profession, teacher.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), profession);
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "profession='" + profession + '\'' +
                '}';
    }
}
