package org.example.people;

import org.example.enums.Gender;

public class Student extends Persons {
    private int id;

    private int strikes = 0;

    public Student(String firstName, String lastName, String otherName, String dob, Gender gender, int id, int strikes) {
        super(firstName, lastName, otherName, dob, gender);
        this.id = id;
        this.strikes = strikes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }
}
