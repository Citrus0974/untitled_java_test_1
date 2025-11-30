package edu.khityaev.structure;

public class Storage<T> {
    final private T obj;
    
    public Storage(){
        obj = null;
    }
    
    public Storage(T obj) {
        this.obj = obj;
    }

    public T getObj(T defaultValue) {
        if (obj!=null) return obj;
        return defaultValue;
    }
}
