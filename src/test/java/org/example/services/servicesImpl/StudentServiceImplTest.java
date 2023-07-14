package org.example.services.servicesImpl;

import org.example.enums.Classes;
import org.example.enums.Gender;
import org.example.enums.Roles;
import org.example.model.Courses;
import org.example.model.School;
import org.example.people.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;





class StudentServiceImplTest {

    @Test
    void takeCourse() {
        StudentServiceImpl student1 = new StudentServiceImpl();
        Student student = new Student("Nicolas", "Pepe", "Shank",
                "12/12/1987", Gender.MALE, 19, 3, Classes.SS3);
        School school = new School();
        Courses course = new Courses("Corner Kick", Roles.TEACHER);
        assertEquals(0, student1.takeCourse(student, school, course));

    }
}