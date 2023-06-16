package org.example.services.servicesImpl;

import org.example.model.Courses;
import org.example.model.School;
import org.example.people.Student;
import org.example.services.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public int takeCourse(Student student, School school, Courses course) {
        if(school.getCoursesList().contains(course)) {
            System.out.println(student + " takes at least one " + course + "in this " + school);
        } else {
            System.out.println(course + "is not part of the courses offered in this " + school);
        }
        return 0;
    }
}
