package org.example.people;

import org.example.enums.Gender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrincipalTest {

    @Test
     void admitApplicant() {

        Principal principal = new Principal("a", "b", "c", "n", Gender.FEMALE);

    }




}