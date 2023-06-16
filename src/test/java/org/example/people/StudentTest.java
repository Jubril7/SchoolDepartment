package org.example.people;

import org.example.enums.Classes;
import org.example.enums.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getId() {
        Student student = new Student("Gabriel", "Magalhães", "dos Santos", "12/19/1997"
        , Gender.MALE, 004, 0, Classes.SS2);
        assertEquals(004, student.getId());
    }

    @Test
    void setId() {
        Student student = new Student();
        student.setId(42);
        assertEquals(42, student.getId());

    }

    @Test
    void getStrikes() {
        Student student = new Student("Gabriel", "Magalhães", "dos Santos", "12/19/1997"
                , Gender.MALE, 004, 0, Classes.SS2);
        assertEquals(0, student.getStrikes());
    }

    @Test
    void setStrikes() {
        Student student = new Student();
        student.setStrikes(1);
        assertEquals(1, student.getStrikes());
    }

    @Test
    void getForm() {
        Student student = new Student("Gabriel", "Magalhães", "dos Santos", "12/19/1997"
                , Gender.MALE, 004, 0, Classes.SS2);
        assertEquals(Classes.SS2, student.getForm());
    }

    @Test
    void setForm() {
        Student student = new Student();
        student.setForm(Classes.SS1);
        assertEquals(Classes.SS1, student.getForm());
    }
}