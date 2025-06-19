package com.mamta.generics.records;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public record EmployeeRecord(String firstName,
                             String lastName,
                             Set<String> projects) implements
        Serializable {

    // Bad practice of initializing [ static initialization ]
    public static EmployeeRecord CEO =
            new EmployeeRecord("John", "Doe", Set.of("AI"));

    static {
        // any code inside
        // Read from properties file and update the CEO make dynamic
        System.out.println(CEO);
    }


    // Creating custom constructor instead of canonical constructor [ which contains all the members of the class ]
    // to implement custom validations

//    public EmployeeRecord {
//        if (Objects.isNull(firstName)){
//            throw new IllegalArgumentException("firstName cannot be null");
//        }
//        if (Objects.isNull(lastName)){
//            throw new IllegalArgumentException("lastName cannot be null");
//        }
//        if (Objects.isNull(projects)){
//            projects = new HashSet<>();
//        }
//
//    }

    public EmployeeRecord(String firstName, String lastName, Set<String> projects) {
        if (Objects.isNull(firstName)){
            throw new IllegalArgumentException("firstName cannot be null");
        }
        if (Objects.isNull(lastName)){
            throw new IllegalArgumentException("lastName cannot be null");
        }
        if (Objects.isNull(projects)){
            projects = new HashSet<>();
        }
        this.firstName = firstName;
        this.lastName = lastName;
//        this.projects = projects;
        this.projects = Set.copyOf(projects);
    }

    public Set<String> getProjects() {
        return Set.copyOf(projects); // Unmodifiable set
    }
}




// If the record changes then all the changes to getter
// setter , toString will be automatic