package com.umb.taller.domain.validation;

import com.umb.taller.application.EmailValidator;

public class ValidationExamples {

    public static boolean validateNotEmpty(String value) {

        DomainValidator<String> validator =
                text -> text != null && !text.isBlank();

        return validator.validate(value);
    }

    public static boolean validateEmail(String email) {

        DomainValidator<String> validator =
                value -> value != null
                        && value.contains("@");

        return validator.validate(email);
    }

    public static boolean validateGrade(Double grade) {

        DomainValidator<Double> validator =
                value -> value != null
                        && value >= 0
                        && value <= 5;

        return validator.validate(grade);
    }

    public static boolean validateEmailWithReference(
            String email) {

        DomainValidator<String> validator =
                EmailValidator::isValidStatic;

        return validator.validate(email);
    }
}
