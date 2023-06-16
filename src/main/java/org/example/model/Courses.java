package org.example.model;

import org.example.enums.Roles;

public class Courses {
    private String CourseName;
    private Roles courseTeacher;

    public Courses(String courseName, Roles courseTeacher) {
        CourseName = courseName;
        this.courseTeacher = courseTeacher;
    }

    public Courses() {
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public Roles getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(Roles courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "CourseName='" + CourseName + '\'' +
                ", courseTeacher=" + courseTeacher +
                '}';
    }
}
