package org.javaCore.function;

public class Customer {
    String name;
    int age;
    String device;

    public Customer() {
    }

    public Customer(String name, int age, String device) {
        this.name = name;
        this.age = age;
        this.device = device;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
