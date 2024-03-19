package org.javaBasic.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MyClass implements Comparable<MyClass>{
    String name;
    int rollno;

    public MyClass(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    @Override
    public int compareTo(MyClass ob) {
        if(ob.name.compareTo(this.name)!=0){ // if they are not equal
            return this.name.compareTo(ob.name);
        }
        return this.rollno- ob.rollno;
    }
}
public class Mycomparable {
    // Comparable is Interface it has compareTo method.
    public static void main(String[] args) {
        MyClass c1 = new MyClass("Kumar", 23);
        MyClass c2 = new MyClass("Nikhil", 32);
        MyClass c3 = new MyClass("Abhi", 55);
        MyClass c4 = new MyClass("Nikhil", 53);
        MyClass[] arr = {c1, c2, c3, c4};
        Arrays.sort(arr);
        for(MyClass c : arr){
            System.out.println(c);
        }

        List<MyClass> list = Arrays.asList(c1, c2, c3, c4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

// static binding
// method overloading
// change signature or return type
// type of object is determined at compile time

// dynamic binding
// method overriding
// inheritance
// type of object is determined at runtime