package org.example.services.servicesImpl;

import org.example.enums.Classes;
import org.example.enums.Gender;
import org.example.enums.Roles;
import org.example.model.School;
import org.example.people.Applicants;
import org.example.people.Staff;
import org.example.people.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PrincipalServiceImplTest {

    @Test
    void admitApplicant() {
        PrincipalServiceImpl principal = new PrincipalServiceImpl();
        Applicants applicants = new Applicants("Bukayo", "Saka", "Ayoyinka", "09/05/2001", Gender.MALE, 21);
        Staff staff = new Staff("Albert", "Stuivenberg", "Airpod", "09/11/1990", Gender.MALE, Roles.PRINCIPAL);
        School school = new School();
        school.setStaffList(staff);
         assertEquals(0, principal.admitApplicant(applicants, school, staff));

    }

    @Test
    void expelStudent() {
        PrincipalServiceImpl principal = new PrincipalServiceImpl();
        Student student = new Student("Nicolas", "Pepe", "Shank",
                "12/12/1987", Gender.MALE, 19, 3, Classes.SS3);
        School school = new School();
        Staff staff = new Staff("Mikel", "Arteta", "Shawn",
                "09/11/1990", Gender.MALE, Roles.PRINCIPAL);
        school.setStaffList(staff);
        assertEquals(0, principal.expelStudent(student, school, staff));

    }
}