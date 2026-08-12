package com.umb.taller.domain;

public class Enrollment {

    private Student student;
    private String courseName;
    private double grade;

    public Enrollment(Student student, String courseName) {
        this.student = student;
        this.courseName = courseName;
        this.grade = 0.0;
    }

    public Student getStudent() {
        return student;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 5) {
            throw new IllegalArgumentException(
                    "Grade must be between 0 and 5"
            );
        }

        this.grade = grade;
    }

    public boolean hasPassed() {
        return grade >= 3.0;
    }
}
