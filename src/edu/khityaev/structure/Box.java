package edu.khityaev.structure;

public class Box<T> {
    private T obj;

    public Box(){}

    public Box(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        T obj2 = obj;
        obj = null;
        return obj2;
    }

    public void putObj(T obj) {
        if(!this.isEmpty()) throw new RuntimeException("box is not empty");
        this.obj = obj;
    }

    public boolean isEmpty(){
        return obj == null;
    }
}
