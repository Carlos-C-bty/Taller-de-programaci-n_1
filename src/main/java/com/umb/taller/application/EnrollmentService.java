package com.umb.taller.application;

import com.umb.taller.domain.Student;
import com.umb.taller.domain.exception.EntityNotFoundException;
import com.umb.taller.domain.repository.Repository;

public class EnrollmentService {

    private final Repository<Student, String>
            studentRepository;

    public EnrollmentService(
            Repository<Student, String> studentRepository) {

        this.studentRepository = studentRepository;
    }

    public Student findStudent(String id) {

        return studentRepository
                .findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException(
                                "Student not found: " + id
                        ));
    }
}
