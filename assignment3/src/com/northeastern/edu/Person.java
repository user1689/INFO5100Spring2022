package com.northeastern.edu;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;

    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void subscribe(SeattlePoliceDepartment dp) {
        if (!dp.persons.contains(this)) {
            dp.persons.add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment dp) {
        if (dp.persons.contains(this)) {
            dp.persons.remove(this);
        }
    }

    public void getNotification(SeattlePoliceDepartment dp) {
        System.out.println("*********");
        System.out.println("Person Name: " + this.getName());
        System.out.println("Notification content: " + dp.message);
        System.out.println("*********");
    }
}
