package com.umb.taller.application;

public class EmailValidator {

    public boolean isValid(String email) {
        return isValidStatic(email);
    }

    public static boolean isValidStatic(String email) {

        return email != null
                && email.contains("@")
                && email.contains(".");
    }
}
