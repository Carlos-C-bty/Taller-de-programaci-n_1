package com.umb.taller;

import com.umb.taller.domain.Student;
import com.umb.taller.domain.exception.ValidationException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StudentTest {

    @Test
    void shouldCreateStudentCorrectly() {

        Student student = new Student(
                "1",
                "Carlos",
                "carlos@example.com",
                "2026001",
                "Software Engineering"
        );

        assertThat(student.getId())
                .isEqualTo("1");

        assertThat(student.getName())
                .isEqualTo("Carlos");

        assertThat(student.getEmail())
                .isEqualTo("carlos@example.com");

        assertThat(student.getStudentCode())
                .isEqualTo("2026001");

        assertThat(student.getProgram())
                .isEqualTo("Software Engineering");
    }

    @Test
    void shouldReturnStudentRole() {

        Student student = new Student(
                "1",
                "Carlos",
                "carlos@example.com",
                "2026001",
                "Software Engineering"
        );

        assertThat(student.getRole())
                .isEqualTo("Student");
    }

    @Test
    void shouldUpdateProgram() {

        Student student = new Student(
                "1",
                "Carlos",
                "carlos@example.com",
                "2026001",
                "Software Engineering"
        );

        student.setProgram("Computer Science");

        assertThat(student.getProgram())
                .isEqualTo("Computer Science");
    }

    @Test
    void shouldRejectEmptyProgram() {

        assertThatThrownBy(() ->
                new Student(
                        "1",
                        "Carlos",
                        "carlos@example.com",
                        "2026001",
                        ""
                )
        )
        .isInstanceOf(ValidationException.class)
        .hasMessageContaining("Program");
    }

    @Test
    void shouldRejectEmptyStudentCode() {

        assertThatThrownBy(() ->
                new Student(
                        "1",
                        "Carlos",
                        "carlos@example.com",
                        "",
                        "Software Engineering"
                )
        )
        .isInstanceOf(ValidationException.class)
        .hasMessageContaining("Student code");
    }
}
