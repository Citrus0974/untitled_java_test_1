package edu.khityaev.structure;

public class Storage<T> {
    final private T obj;
    public static Storage empty = new Storage(null);
    
    private Storage(){
        obj = null;
    }
    
    private Storage(T obj) {
        this.obj = obj;
    }

    public static <T> Storage<T> ofNullable(T obj){
        if (obj == null) return empty;
        return new Storage<>(obj);
    }

    public T orElse(T defaultValue) {
        if (obj!=null) return obj;
        return defaultValue;
    }

    public T orElseThrow(ElseThrowable et){
        if (obj==null) et.make();
        return obj;
    }
}
