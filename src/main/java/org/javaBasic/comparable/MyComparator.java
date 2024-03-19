package org.javaBasic.comparable;

import java.util.*;

class MyStudent {
    String name;
    int rollno;

    public MyStudent(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}

class sortByName implements Comparator<MyStudent>{

    @Override
    public int compare(MyStudent o1, MyStudent o2) {
        return o1.name.compareTo(o2.name);
    }
}

class  sortByRollNo implements Comparator<MyStudent>{

    @Override
    public int compare(MyStudent o1, MyStudent o2) {
        return o1.rollno - o2.rollno;
    }
}
public class MyComparator {
    public static void main(String[] args) {
        MyStudent s1 = new MyStudent("Kumar", 23);
        MyStudent s2 = new MyStudent("Akhil", 44);
        MyStudent s3 = new MyStudent("Shiva", 32);
        MyStudent s4 = new MyStudent("Ayush", 12);

        List<MyStudent> list2 = new ArrayList<>();
        list2.add(s1);
        list2.add(s2);
        list2.add(s3);
        list2.add(s4);


        System.out.println(list2);

//        Collections.sort(list2, new sortByName());
        Collections.sort(list2, (a,b)-> a.name.compareTo(b.name));
        System.out.println(list2);

//        Collections.sort(list2, new sortByRollNo());
        Collections.sort(list2, (a,b) -> a.rollno-b.rollno); // ascending
        System.out.println(list2);


//        MyStudent[] list = {s1, s2, s3, s4};
//
//        Arrays.sort(list, new sortByName());
//
//        for(MyStudent m: list){
//            System.out.println(m);
//        }
    }

}
