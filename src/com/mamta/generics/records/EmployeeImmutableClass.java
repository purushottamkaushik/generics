package com.mamta.generics.records;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeImmutableClass implements Serializable
{
    private final String firstName;
    private final String lastName;
    private final int salary;

    public EmployeeImmutableClass(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeImmutableClass that = (EmployeeImmutableClass) o;
        return salary == that.salary && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public String toString() {
        return "EmployeeImmutableClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary);
    }
}

// problem here is when we change the any instance variable all things inside class
// gets changed.

