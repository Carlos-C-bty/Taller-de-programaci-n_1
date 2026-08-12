package com.umb.taller.infrastructure;

import com.umb.taller.domain.Student;
import com.umb.taller.domain.repository.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StudentRepository
        implements Repository<Student, String> {

    private final Map<String, Student> students =
            new HashMap<>();

    @Override
    public Student save(Student student) {

        students.put(student.getId(), student);

        return student;
    }

    @Override
    public Optional<Student> findById(String id) {

        return Optional.ofNullable(
                students.get(id)
        );
    }

    @Override
    public List<Student> findAll() {

        return new ArrayList<>(
                students.values()
        );
    }

    @Override
    public void deleteById(String id) {

        students.remove(id);
    }
}
