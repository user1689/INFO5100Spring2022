package com.northeastern.edu;

public class Main {

    public static void main(String[] args) {
        SeattlePoliceDepartment department = new SeattlePoliceDepartment();
        Person person1 = new Person("jack", 19);
        Person person2 = new Person("leo", 29);
        Person person3 = new Person("joey", 24);
        Person person4 = new Person("sam", 30);

        person1.subscribe(department);
        person2.subscribe(department);
        person3.subscribe(department);
        department.NotifyCitizens("Covid-19 Warning!");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        person3.unsubscribe(department);
        department.NotifyCitizens("Covid-19 Warning again!");
    }
}
