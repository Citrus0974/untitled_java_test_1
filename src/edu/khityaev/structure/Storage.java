package edu.khityaev.structure;

import java.util.function.Supplier;

public class Storage<T> {
    Supplier<T> lazyObj;
    private T obj;
    public static Storage empty = new Storage(null);
    boolean isComputed;
    
    private Storage(){
        obj = null;
    }
    
    private Storage(T obj) {
        this.obj = obj;
    }
    public Storage(Supplier<T> supplier){this.lazyObj = supplier;}

    public static <T> Storage<T> ofNullable(T obj){
        if (obj == null) return empty;
        return new Storage<>(obj);
    }

    public static <T> Storage<T> notNullable(T obj){
        if(obj != null){
            return new Storage<>(obj);
        } else throw new IllegalArgumentException("Not nullable does not accept null");
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
