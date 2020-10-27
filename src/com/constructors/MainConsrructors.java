package com.constructors;

import com.domainmodel.Employee;

import java.util.Date;

public class MainConsrructors {
    public static void main(String[] args) {
        Date date = new Date();
        Employee employee = new Employee("Alex", "postman", 100);

        System.out.println(employee.toString());
    }
}
