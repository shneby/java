package com.exceptionexercise;

import java.util.Objects;

public class Person {
    private Integer age;
    private String name;

    public Person(Integer age, String name) throws VerificationException {
        if(name == null){
            throw new VerificationException("Name must not be null", ErrorCodes.NAME_IS_NULL);
        }
        if(age < 1 || age > 80){
            throw new VerificationException("Age not in range", ErrorCodes.AGE_NOT_IN_RANGE);
        }
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(age, person.age) &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
