package org.example.model;

import org.example.people.Staff;

public class Courses {
    private String CourseName;
    private Staff courseTeacher;

    public Courses(String courseName, Staff courseTeacher) {
        CourseName = courseName;
        this.courseTeacher = courseTeacher;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public Staff getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(Staff courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "CourseName = '" + CourseName + '\'' +
                ", courseTeacher = " + courseTeacher +
                '}';
    }
}
