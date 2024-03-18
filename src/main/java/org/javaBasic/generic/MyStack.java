package org.javaBasic.generic;

import java.util.ArrayList;

public class MyStack<T>{
    ArrayList<T> list;
    int size = 0;
    public MyStack(){
        list = new ArrayList<>();
    }
}
