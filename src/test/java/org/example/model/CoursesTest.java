package org.example.model;

import org.example.enums.Roles;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoursesTest {

    @Test
    void getCourseName() {
        Courses courses = new Courses("Set Piece", Roles.TEACHER);
        assertEquals("Set Piece", courses.getCourseName());

    }

    @Test
    void setCourseName() {
        Courses courses = new Courses("Set Piece", Roles.TEACHER);
        courses.setCourseName("Attack");
        assertEquals("Attack", courses.getCourseName());


    }

    @Test
    void getCourseTeacher() {
        Courses courses = new Courses("Set Piece", Roles.TEACHER);
        assertEquals(Roles.TEACHER, courses.getCourseTeacher());

    }

    @Test
    void setCourseTeacher() {
        Courses courses = new Courses();
        courses.setCourseTeacher(Roles.TEACHER);
        assertEquals(Roles.TEACHER, courses.getCourseTeacher());
    }

//    @Test
//    void testToString() {
//    }
}