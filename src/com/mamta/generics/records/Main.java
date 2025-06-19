package com.mamta.generics.records;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> projects = new HashSet<>();
        projects.add("Java");
        projects.add("C++");
        projects.add("JavaScript");

        EmployeeRecord employeeRecord = new EmployeeRecord("Mamta",
                "Guddu",projects);
        projects.add("Spring"); // the collection inside records is mutable.

        System.out.println("Employee Projects: " + employeeRecord.projects());
    }
}
