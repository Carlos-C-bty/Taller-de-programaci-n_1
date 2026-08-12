package com.umb.taller.application;

import com.umb.taller.domain.Student;
import com.umb.taller.domain.exception.EntityNotFoundException;
import com.umb.taller.domain.exception.ValidationException;
import com.umb.taller.domain.repository.Repository;

public class StudentService {

    private final Repository<Student, String>
            studentRepository;

    public StudentService(
            Repository<Student, String> studentRepository) {

        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {

        if (student == null) {

            throw new ValidationException(
                    "Student cannot be null"
            );
        }

        return studentRepository.save(student);
    }

    public Student findStudent(String id) {

        return studentRepository
                .findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException(
                                "Student not found: " + id
                        ));
    }

    public void deleteStudent(String id) {

        if (studentRepository
                .findById(id)
                .isEmpty()) {

            throw new EntityNotFoundException(
                    "Student not found: " + id
            );
        }

        studentRepository.deleteById(id);
    }
}
