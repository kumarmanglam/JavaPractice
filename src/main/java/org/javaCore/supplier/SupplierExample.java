package org.javaCore.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<List<Employee>> supplier = () -> {
            List<Employee> list = new ArrayList<>();
            list.add(new Employee(1, "krishna", "Male", 35));
            list.add(new Employee(2, "Vikas", "Male", 33));
            list.add(new Employee(3, "Robert", "Male", 38));
            return list;
        };

        List<Employee> employees = supplier.get();
        System.out.println(employees);
    }
}

