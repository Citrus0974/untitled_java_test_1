package edu.khityaev.structure;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    List<T> lst = new ArrayList<>();

    public void push(T value){
        lst.add(value);
    }

    public T peek(){
        return lst.getLast();
    }

    public T pop(){
        T value = lst.getLast();
        lst.removeLast();
        return  value;
    }
}
