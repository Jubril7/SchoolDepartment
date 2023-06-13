package org.example.people;

import org.example.enums.Gender;

public class Applicants extends  Persons{
    public Applicants(String firstName, String lastName, String otherName, String dob, Gender gender) {
        super(firstName, lastName, otherName, dob, gender);
    }
}
