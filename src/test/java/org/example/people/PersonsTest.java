package org.example.people;

import org.example.enums.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonsTest {

    @Test
    void getFirstName() {
        Persons a = new Persons("b","c","d", "e", Gender.FEMALE);
        assertEquals("b",a.getFirstName());
    }

    @Test
    void setFirstName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getOtherName() {
    }

    @Test
    void setOtherName() {
    }

    @Test
    void getDob() {
    }

    @Test
    void setDob() {
    }

    @Test
    void getGender() {
    }

    @Test
    void setGender() {
    }

    @Test
    void testToString() {
    }
}