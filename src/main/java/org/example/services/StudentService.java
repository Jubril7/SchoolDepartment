package org.example.services;

import org.example.model.Courses;
import org.example.model.School;
import org.example.people.Student;

public interface StudentService {
    int takeCourse(Student student, School school, Courses course);
}
