package org.example.services.servicesImpl;

import org.example.enums.Gender;
import org.example.enums.Roles;
import org.example.model.Courses;
import org.example.model.School;
import org.example.people.Staff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherServiceImplTest {

    @Test
    void teachCourse() {
        TeacherServiceImpl teacher = new TeacherServiceImpl();
        Courses course = new Courses("Corner Kick", Roles.TEACHER);
        Staff staff = new Staff("Albert", "Stuivenberg", "Airpod", "09/11/1990", Gender.MALE, Roles.TEACHER);
        School school = new School();
        school.setStaffList(staff);
        assertEquals(0, teacher.teachCourse(course, staff, school));


    }
}