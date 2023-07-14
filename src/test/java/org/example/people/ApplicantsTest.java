package org.example.people;

import org.example.enums.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantsTest {

    @Test
    void getAge() {
        Applicants applicants = new Applicants("Oleksandr", "Zinchenko", "Volodymyrovych",
                "12/15/1996", Gender.MALE, 26);
        assertEquals(26, applicants.getAge());

    }

    @Test
    void setAge() {
        Applicants applicants = new Applicants("Oleksandr", "Zinchenko", "Volodymyrovych",
                "12/15/1996", Gender.MALE, 26);
        applicants.setAge(27);
        assertEquals(27, applicants.getAge());
    }
}