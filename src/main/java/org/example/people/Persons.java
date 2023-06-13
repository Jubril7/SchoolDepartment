package org.example.people;

import org.example.enums.Gender;

//import java.util.Date;


// Fix Date format asap
public class Persons {
    private String firstName;
    private String lastName;
    private String otherName;
    private String dob;
    private Gender gender;

    public Persons(String firstName, String lastName, String otherName, String dob, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
        this.dob = String.valueOf(dob);
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", otherName='" + otherName + '\'' +
                ", dob=" + dob +
                ", gender=" + gender +
                '}';
    }
}
