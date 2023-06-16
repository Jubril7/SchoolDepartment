package org.example.people;

import org.example.enums.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonsTest {

    @Test
    void getFirstName() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        assertEquals("Granit", arsenalPlayer.getFirstName());
    }

    @Test
    void setFirstName() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        arsenalPlayer.setFirstName("Benjamin");
        assertEquals("Benjamin", arsenalPlayer.getFirstName());
    }

    @Test
    void getLastName() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        assertEquals("Xhaka", arsenalPlayer.getLastName());
    }

    @Test
    void setLastName() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        arsenalPlayer.setLastName("White");
        assertEquals("White", arsenalPlayer.getLastName());
    }

    @Test
    void getOtherName() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        assertEquals("Marshall", arsenalPlayer.getOtherName());
    }

    @Test
    void setOtherName() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        arsenalPlayer.setOtherName("William");
        assertEquals("William", arsenalPlayer.getOtherName());
    }

    @Test
    void getDob() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        assertEquals("09/27/1992", arsenalPlayer.getDob());
    }

    @Test
    void setDob() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        arsenalPlayer.setDob("10/08/1997");
        assertEquals("10/08/1997", arsenalPlayer.getDob());
    }

    @Test
    void getGender() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        assertEquals(Gender.MALE, arsenalPlayer.getGender());
    }

    @Test
    void setGender() {
        Persons arsenalPlayer = new Persons("Granit","Xhaka","Marshall", "09/27/1992", Gender.MALE);
        arsenalPlayer.setGender(Gender.FEMALE);
        assertEquals(Gender.FEMALE, arsenalPlayer.getGender());
    }

    @Test
    void testToString() {
    }
}