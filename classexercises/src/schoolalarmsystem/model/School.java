package schoolalarmsystem.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String name;
    private List<SchoolClass> classes;

    public School(String name) {
        this.name = name;
        this.classes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SchoolClass> getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) &&
                Objects.equals(classes, school.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, classes);
    }
}
