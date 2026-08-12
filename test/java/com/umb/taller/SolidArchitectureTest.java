package com.umb.taller;

import com.umb.taller.domain.Person;
import com.umb.taller.domain.Student;
import com.umb.taller.domain.exception.BusinessRuleException;
import com.umb.taller.domain.exception.DomainException;
import com.umb.taller.domain.exception.EntityNotFoundException;
import com.umb.taller.domain.exception.ValidationException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolidArchitectureTest {

    @Test
    void studentShouldExtendPerson() {

        Student student = new Student(
                "1",
                "Carlos",
                "carlos@example.com",
                "2026001",
                "Software Engineering"
        );

        assertThat(student)
                .isInstanceOf(Person.class);
    }

    @Test
    void validationExceptionShouldExtendDomainException() {

        ValidationException exception =
                new ValidationException("Invalid data");

        assertThat(exception)
                .isInstanceOf(DomainException.class);
    }

    @Test
    void entityNotFoundExceptionShouldExtendDomainException() {

        EntityNotFoundException exception =
                new EntityNotFoundException(
                        "Student not found"
                );

        assertThat(exception)
                .isInstanceOf(DomainException.class);
    }

    @Test
    void businessRuleExceptionShouldExtendDomainException() {

        BusinessRuleException exception =
                new BusinessRuleException(
                        "Business rule violated"
                );

        assertThat(exception)
                .isInstanceOf(DomainException.class);
    }

    @Test
    void exceptionsShouldHaveExpectedMessages() {

        ValidationException exception =
                new ValidationException(
                        "Invalid student data"
                );

        assertThat(exception)
                .hasMessage("Invalid student data");
    }
}
