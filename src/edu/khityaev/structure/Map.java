package edu.khityaev.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Map<T, R> extends Command<T, R>{
    Function<T, R> function;
    public Map(Function<T, R> function){
        super();
        this.function = function;
        next = null;
    }






    @Override
    public List applyCommand(List<?> flowList) {
        List<R> res = new ArrayList<>();
        for(Object t : flowList){
            res.add(function.apply((T)t));
        }
        if(next == null){
            return (List)res;
        } else{
            return next.applyCommand(res);
        }
    }

//    @Override
//    public void addNext(Command<T, R> command) {
//        if (next == null){
//            next = command;
//        } else {
//            next.addNext(command);
//        }
//    }
}
