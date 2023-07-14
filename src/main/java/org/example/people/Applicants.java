package org.example.people;

import org.example.enums.Gender;

public class Applicants extends Persons {
    private int age;

    public Applicants(String firstName, String lastName, String otherName, String dob, Gender gender, int age) {
        super(firstName, lastName, otherName, dob, gender);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
