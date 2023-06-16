package org.example.people;

import org.example.enums.Gender;
import org.example.enums.Roles;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getRole() {
        Staff staff = new Staff("Nicolas", "Jover", "Keith", "09/11/1990", Gender.MALE, Roles.PRINCIPAL);
        assertEquals(Roles.PRINCIPAL, staff.getRole());
    }

    @Test
    void setRole() {
        Staff staff = new Staff("Nicolas", "Jover", "Keith", "09/11/1990", Gender.MALE, Roles.PRINCIPAL);
        staff.setRole(Roles.NON_ACADEMIC_STAFF);
        assertEquals(Roles.NON_ACADEMIC_STAFF, staff.getRole());

    }
}