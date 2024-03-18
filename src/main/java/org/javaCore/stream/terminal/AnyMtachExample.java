package org.javaCore.stream.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AnyMtachExample {
    public static void main(String[] args) {
        Predicate<Employee> olderThan50 = e -> e.getAge() > 50;
        Predicate<Employee> earningMoreThan40K = e -> e.getSalary() > 40000;
        Predicate<Employee> combinedCondition = olderThan50.and(earningMoreThan40K);

        boolean result = getEmployeeStream().anyMatch(combinedCondition);
        System.out.println(result);
    }

    private static Stream<Employee> getEmployeeStream() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "A", 46, 30000));
        empList.add(new Employee(2, "B", 56, 30000));
        empList.add(new Employee(3, "F", 72, 80000));
        return empList.stream();
    }
}

class Employee {
    private long id;
    private String name;
    private int age;
    private int salary;

    public Employee(long id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}

