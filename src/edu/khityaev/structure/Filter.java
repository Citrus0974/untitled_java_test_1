package edu.khityaev.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter<T> extends Command<T, T>{
    Predicate<T> predicate;

    public Filter(Predicate predicate) {
        super();
        this.predicate = predicate;
        next = null;
    }


    @Override
    public List applyCommand(List<?> flowList) {
        List<T> res = new ArrayList<>();
        for(Object t : flowList){
            if(predicate.test((T)t)){
                res.add((T)t);
            }
        }
        if(next == null){
            return res;
        } else {
            return next.applyCommand(res);
        }
    }

//    public void addNext(Command<T, R> command){
//        if (next == null){
//            next = command;
//        } else {
//            next.addNext(command);
//        }
//    };
}
