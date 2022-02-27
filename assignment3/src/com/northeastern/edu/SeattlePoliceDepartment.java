package com.northeastern.edu;

import java.util.ArrayList;
import java.util.List;

public class SeattlePoliceDepartment {

    List<Person> persons;
    String message;

    public SeattlePoliceDepartment() {
        persons = new ArrayList<>();
    }

    public void NotifyCitizens(String s) {
        for (Person person : persons) {
            this.message = s;
            person.getNotification(this);

        }
    }
}
