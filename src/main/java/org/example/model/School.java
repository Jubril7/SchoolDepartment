package org.example.model;

import org.example.people.Applicants;
import org.example.people.Staff;
import org.example.people.Student;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final String schoolName = "Arsenal International";

    private int admissionAgeRequired = 13;
    public int numberOfStrikesAllowed = 3;

    public School() {
    }
    
    private  List<Staff> staffList = new ArrayList<Staff>();
    private List<Student> studentList = new ArrayList<Student>();
    private List<Courses> coursesList = new ArrayList<Courses>();
    private List<Applicants> applicantsList = new ArrayList<Applicants>();


    public School(List<Staff> staffList, List<Student> studentList,
                  List<Courses> coursesList, List<Applicants> applicantsList) {
        this.staffList = staffList;
        this.studentList = studentList;
        this.coursesList = coursesList;
        this.applicantsList = applicantsList;
    }


    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(Staff staff) {
        staffList.add(staff);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Student student) {
        studentList.add(student);
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(Courses courses) {
        coursesList.add(courses);
    }

    public List<Applicants> getApplicantsList() {
        return applicantsList;
    }

    public void setApplicantsList(Applicants applicants) {
        applicantsList.add(applicants);
    }

    public int getAdmissionAgeRequired() {
        return admissionAgeRequired;
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
