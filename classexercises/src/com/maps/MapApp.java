package com.maps;

import java.util.*;

public class MapApp {
    public static void main(String[] args) {

        Random random = new Random();
        int size = 1;
        String searchName = "name" + random.nextInt(size);


        Map<String, Person> mapPeople = new HashMap<>();
        List<Person> listPeople = new ArrayList<>();

        for(int i=0; i<size; i++){
            Person person = new Person("name" + i, random.nextInt(100));
            mapPeople.put(person.getName(), person);
            listPeople.add(person);
        }

        System.out.printf("Looking for %s:\n", searchName);

        searchList(listPeople, searchName);
        searchMap(mapPeople, searchName);

    }

    private static void searchList(List<Person> list, String name){
        long start = System.nanoTime();
        for(Person person: list){
            if(person.getName().equals(name)){
                break;
            }
        }
        long end = System.nanoTime();
        System.out.println("listSearchTime: " + (end-start));
    }

    private static void searchMap(Map<String, Person> map, String key){
        long start = System.nanoTime();
        Person p =  map.get(key);
        long end = System.nanoTime();
        System.out.println("mapSearchTime: " + (end-start));
    }
}
