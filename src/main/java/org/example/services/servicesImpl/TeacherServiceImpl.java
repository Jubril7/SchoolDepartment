package org.example.services.servicesImpl;

import org.example.enums.Roles;
import org.example.model.Courses;
import org.example.model.School;
import org.example.people.Staff;
import org.example.services.TeacherService;

public class TeacherServiceImpl implements TeacherService {

    @Override
    public int teachCourse(Courses course, Staff staff, School school) {
        if(staff.getRole() == Roles.TEACHER && school.getCoursesList().contains(course)) {
            if(school.getStaffList().contains(staff)) {
                System.out.println("Mr " + staff + " takes this " + course);
            }
        } else {
            System.out.println("We don't know what is going on");
        }
        return 0;
    }
}
