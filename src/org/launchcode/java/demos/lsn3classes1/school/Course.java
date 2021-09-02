package org.launchcode.java.demos.lsn3classes1.school;

import org.launchcode.java.demos.lsn3classes1.Student;

import java.util.ArrayList;

public class Course {
    private String subject;
    private Teacher instructor;
    private ArrayList<Student> students;

    public Course(String subject, Teacher instructor, ArrayList<Student> students) {
        this.subject = subject;
        this.instructor = instructor;
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
