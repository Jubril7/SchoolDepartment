package org.example.services.servicesImpl;

import org.example.enums.Roles;
import org.example.model.School;
import org.example.people.Applicants;
import org.example.people.Staff;
import org.example.people.Student;
import org.example.services.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {

    @Override
    public int admitApplicant(Applicants applicant, School school, Staff staff) {
        if(applicant.getAge() >= school.getAdmissionAgeRequired() && staff.getRole() == Roles.PRINCIPAL) {
            System.out.println("Congratulations!!! You have been admitted.");
        } else {
            System.out.println("Try again when you are of age");
        }
        return 0;
    }


    @Override
    public int expelStudent(Student student, School school, Staff staff) {
        if(student.getStrikes() >= school.numberOfStrikesAllowed && staff.getRole() == Roles.PRINCIPAL) {
            System.out.println("Admission Terminated");
        } else {
            System.out.println("Return to " + student.getForm());
        }
        return 0;
    }
}
