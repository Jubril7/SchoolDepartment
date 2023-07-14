package org.example.model;

import org.example.enums.Classes;
import org.example.enums.Gender;
import org.example.enums.Roles;
import org.example.people.Applicants;
import org.example.people.Staff;
import org.example.people.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;


class SchoolTest {

    @Test
    void getStaffList() {
        School school = new School(new ArrayList<Staff>(),  new ArrayList<Student>(),  new ArrayList<Courses>(),
                new ArrayList<Applicants>());
        assertEquals(new ArrayList<Staff>() ,school.getStaffList());
    }

    @Test
    void setStaffList() {
        School school = new School();
        school.setStaffList(new Staff("Carlos","Cuesta", "García", "07/29/1995", Gender.MALE, Roles.NON_ACADEMIC_STAFF));
        assertEquals(1,school.getStaffList().size());
    }

    @Test
    void getStudentList() {
        School school = new School(new ArrayList<Staff>(),  new ArrayList<Student>(),  new ArrayList<Courses>(),
                new ArrayList<Applicants>());
        assertEquals(new ArrayList<Student>() ,school.getStudentList());
    }

    @Test
    void setStudentList() {
        School school = new School();
        school.setStudentList(new Student("Martin","Odegaard", "García",
                "07/29/1995", Gender.MALE, 42, 0, Classes.SS2));
        assertEquals(1,school.getStudentList().size());
    }

    @Test
    void getCoursesList() {
        School school = new School(new ArrayList<Staff>(),  new ArrayList<Student>(),  new ArrayList<Courses>(),
                new ArrayList<Applicants>());
        assertEquals(0 ,school.getCoursesList().size());
    }

    @Test
    void setCoursesList() {
        School school = new School();
        school.setCoursesList(new Courses("Defending", Roles.TEACHER));
        assertEquals(1,school.getCoursesList().size());
    }

    @Test
    void getApplicantsList() {
        School school = new School(new ArrayList<Staff>(),  new ArrayList<Student>(),  new ArrayList<Courses>(),
                new ArrayList<Applicants>());
        assertEquals(new ArrayList<Applicants>(),school.getApplicantsList());
    }

    @Test
    void setApplicantsList() {
        School school = new School();
        school.setApplicantsList(new Applicants("Declan", "Rice", "Jollof",
                "01/14/1999", Gender.FEMALE, 25));
        assertEquals(1,school.getApplicantsList().size());
    }

    @Test
    void testToString() {
    }
}