package edu.khityaev.structure;

public class Storage<T> {
    final private T obj;
    
    public Storage(){
        obj = null;
    }
    
    public Storage(T obj) {
        this.obj = obj;
    }

    public T getObj() {
//        if(obj==null) {
//            if(T.class.isInstance(Integer.class)){
//                return new Integer(0);
//            }
//        }
        return obj;
    }
}
