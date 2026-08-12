package com.umb.taller.application;

public class UserService {

    public void createUser(String username) {

        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException(
                    "Username cannot be empty"
            );
        }

        System.out.println("User created: " + username);
    }
}
