package com.person;

import java.lang.annotation.Annotation;

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person("Omri", 32);
        Annotation[] annotations = person.getClass().getAnnotations();
        for(Annotation annotation: annotations){
            CopyRights copyRights = (CopyRights)annotation;
            System.out.println(copyRights.value());
        }
    }

}
