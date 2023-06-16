package org.example.services;

import org.example.model.Courses;
import org.example.model.School;
import org.example.people.Staff;

public interface TeacherService {

    int teachCourse(Courses course, Staff staff, School school);
}
