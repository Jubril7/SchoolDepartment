package org.example.model;

import org.example.people.Applicants;
import org.example.people.Staff;
import org.example.people.Student;

import java.util.List;

public class School {
    private final String schoolName = "";

    private List<Staff> staffList;
    private List<Student> studentList;
    private List<Courses> coursesList;
    private List<Applicants> applicantsList;

    public School(List<Staff> staffList, List<Student> studentList,
                  List<Courses> coursesList, List<Applicants> applicantsList) {
        this.staffList = staffList;
        this.studentList = studentList;
        this.coursesList = coursesList;
        this.applicantsList = applicantsList;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    public List<Applicants> getApplicantsList() {
        return applicantsList;
    }

    public void setApplicantsList(List<Applicants> applicantsList) {
        this.applicantsList = applicantsList;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", staffList=" + staffList +
                ", studentList=" + studentList +
                ", coursesList=" + coursesList +
                ", applicantsList=" + applicantsList +
                '}';
    }
}
