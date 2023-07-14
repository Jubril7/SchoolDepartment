package org.example.services;

import org.example.model.School;
import org.example.people.Applicants;
import org.example.people.Staff;
import org.example.people.Student;

public interface PrincipalService {
    int admitApplicant(Applicants applicant, School school, Staff staff);

    int expelStudent(Student student, School school, Staff staff);
}
