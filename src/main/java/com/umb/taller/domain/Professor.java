package com.umb.taller.domain;

public class Professor extends Person {

    private final String employeeCode;
    private String department;

    public Professor(
            String id,
            String name,
            String email,
            String employeeCode,
            String department) {

        super(id, name, email);

        if (employeeCode == null || employeeCode.isBlank()) {
            throw new IllegalArgumentException(
                    "Employee code cannot be empty"
            );
        }

        if (department == null || department.isBlank()) {
            throw new IllegalArgumentException(
                    "Department cannot be empty"
            );
        }

        this.employeeCode = employeeCode;
        this.department = department;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.isBlank()) {
            throw new IllegalArgumentException(
                    "Department cannot be empty"
            );
        }

        this.department = department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }
}
