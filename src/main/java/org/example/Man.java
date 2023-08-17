package org.example;
import org.example.base.Person;

public class Man extends Person {
    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired() {
        if (this.getAge() >= 65) {
            return true;
        }
        return false;
    }
}
