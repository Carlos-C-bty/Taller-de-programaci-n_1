package com.umb.taller.domain;

public class Professor extends Person {

    private String employeeCode;
    private String department;

    public Professor(
            String id,
            String name,
            String email,
            String employeeCode,
            String department) {

        super(id, name, email);
        this.employeeCode = employeeCode;
        this.department = department;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }
}
