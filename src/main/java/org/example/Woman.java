package org.example;

import org.example.base.Person;

public class Woman extends Person {

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired() {
        if (this.getAge() >= 60) {
            return true;
        }
        return false;
    }
}
