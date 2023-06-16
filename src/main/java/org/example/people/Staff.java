package org.example.people;

import org.example.enums.Gender;
import org.example.enums.Roles;

public class Staff extends Persons {

    private Roles role;
    public Staff(String firstName, String lastName, String otherName, String dob, Gender gender, Roles role) {
        super(firstName, lastName, otherName, dob, gender);
        this.role = role;
    }
    public Staff(){
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
