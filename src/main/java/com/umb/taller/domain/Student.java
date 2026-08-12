package com.umb.taller.domain;

public class Student extends Person {

    private String studentCode;
    private String program;

    public Student(
            String id,
            String name,S
            String email,
            String studentCode,
            String program) {

        super(id, name, email);
        this.studentCode = studentCode;
        this.program = program;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
