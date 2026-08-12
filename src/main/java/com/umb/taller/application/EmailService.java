package com.umb.taller.application;

public class EmailService {

    public void sendEmail(String email, String message) {

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException(
                    "Email cannot be empty"
            );
        }

        System.out.println("Email sent to: " + email);
        System.out.println("Message: " + message);
    }
}
