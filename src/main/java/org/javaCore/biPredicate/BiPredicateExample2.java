package org.javaCore.biPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample2 {
    public static void main(String[] args) {
        // Creating a list of Student objects
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Raju", "computers", 450));
        list.add(new Student(2, "Thomas", "Electronics", 500));
        list.add(new Student(3, "Krishna", "IT", 450));
        list.add(new Student(4, "James", "computers", 480));
        list.add(new Student(5, "Rahul", "computers", 550));

        // Defining the BiPredicate to test if the student's department matches the provided string
        BiPredicate<Student, String> pl = (student, department) ->
                student.getDepartmentName().equalsIgnoreCase(department);

        // Iterating through the list of students and testing with the BiPredicate
        for (Student student : list) {
            if (pl.test(student, "computers")) {
                System.out.println(student.getName() + " is from computers department.");
            }
        }
    }
}
