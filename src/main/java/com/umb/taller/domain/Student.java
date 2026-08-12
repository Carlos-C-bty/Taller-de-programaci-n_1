package com.umb.taller.domain;

import com.umb.taller.domain.exception.ValidationException;

public class Student extends Person {

    private final String studentCode;
    private String program;

    public Student(
            String id,
            String name,
            String email,
            String studentCode,
            String program) {

        super(id, name, email);

        if (studentCode == null ||
                studentCode.isBlank()) {

            throw new ValidationException(
                    "Student code cannot be empty"
            );
        }

        if (program == null ||
                program.isBlank()) {

            throw new ValidationException(
                    "Program cannot be empty"
            );
        }

        this.studentCode = studentCode;
        this.program = program;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {

        if (program == null ||
                program.isBlank()) {

            throw new ValidationException(
                    "Program cannot be empty"
            );
        }

        this.program = program;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
